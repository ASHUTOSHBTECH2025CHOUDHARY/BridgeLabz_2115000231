import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define an annotation for role-based access control
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String role();
}
// Class representing a user with a specific role
class SystemUser {
    private String userRole;
    public SystemUser(String userRole) {
        this.userRole = userRole;
    }
    public String getUserRole() {
        return userRole;
    }
}

// Class containing secured and open-access methods
class TaskManager {
    @RoleAllowed(role = "ADMIN")
    public void executeAdminTask() {
        System.out.println("Admin task has been successfully executed.");
    }
    public void executeGeneralTask() {
        System.out.println("General task executed by any user.");
    }
}
// Utility class for handling method execution with role validation
class PermissionChecker {
    public static void invokeMethod(SystemUser user, Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            // Check if the method has role-based restrictions
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).role();
                if (!user.getUserRole().equalsIgnoreCase(requiredRole)) {
                    System.out.println("Access Denied! Only " + requiredRole + " users can execute this method.");
                    return;
                }
            }
            method.invoke(obj);
        } catch (Exception ex) {
            System.out.println("Error occurred: " + ex.getMessage());
        }
    }
}

// Main class to demonstrate role-based method execution
public class AdminRole {
    public static void main(String[] args) {
        SystemUser admin = new SystemUser("ADMIN");
        SystemUser normalUser = new SystemUser("USER");
        TaskManager taskManager = new TaskManager();
        // Checking role-based access
        System.out.println("Admin attempting");
        PermissionChecker.invokeMethod(admin, taskManager, "executeAdminTask");
        System.out.println("User attempting to execute");
        PermissionChecker.invokeMethod(normalUser, taskManager, "executeAdminTask");
        System.out.println("User executing");
        PermissionChecker.invokeMethod(normalUser, taskManager, "executeGeneralTask");
    }
}
