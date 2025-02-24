import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Define a custom annotation for caching method results
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// Class to handle method caching
class MethodCache {
    private static final Map<String, Object> cacheStore = new HashMap<>();

    public static Object executeWithCache(Object obj, String methodName, Object... parameters) {
        try {
            Method method = obj.getClass().getMethod(methodName, extractParamTypes(parameters));

            if (method.isAnnotationPresent(CacheResult.class)) {
                String cacheKey = generateKey(methodName, parameters);

                // Return cached value if available
                if (cacheStore.containsKey(cacheKey)) {
                    System.out.println("Retrieved from cache" + cacheKey);
                    return cacheStore.get(cacheKey);
                }

                // Compute, store in cache, and return result
                Object result = method.invoke(obj, parameters);
                cacheStore.put(cacheKey, result);
                System.out.println("Computed and stored in cache" + cacheKey);
                return result;
            }
            // If method is not annotated, invoke normally
            return method.invoke(obj, parameters);
        } catch (Exception e) {
            throw new RuntimeException("Method execution failed" + e.getMessage());
        }
    }
    private static String generateKey(String methodName, Object... parameters) {
        StringBuilder key = new StringBuilder(methodName);
        for (Object param : parameters) {
            key.append("_").append(param.toString());
        }
        return key.toString();
    }

    private static Class<?>[] extractParamTypes(Object... parameters) {
        return java.util.Arrays.stream(parameters).map(Object::getClass).toArray(Class<?>[]::new);
    }
}
class Computation {
    @CacheResult
    public int findFactorial(int num) {
        if (num == 0 || num == 1) return 1;
        return num * findFactorial(num - 1);
    }
}

// Main class to test caching mechanism
public class Cache {
    public static void main(String[] args) {
        Computation computation = new Computation();
        // First call: Computation occurs
        System.out.println("Factorial" + MethodCache.executeWithCache(computation, "findFactorial", 5));
        // Second call: Cached result is retrieved
        System.out.println("Factorial " + MethodCache.executeWithCache(computation, "findFactorial", 5));
        System.out.println("Factorial " + MethodCache.executeWithCache(computation, "findFactorial", 6));
    }
}

