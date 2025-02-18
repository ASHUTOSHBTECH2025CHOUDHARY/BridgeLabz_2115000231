import java.util.Arrays;
import java.util.List;

interface MealPlan {
    void showMeal();
}

class VegetarianMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Fruits");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Nuts");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Cheese");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public void showMeal() {
        System.out.println("Yogurt");
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void serveMeal() {
        mealType.showMeal();
    }
}

// Meal plan generator
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        return new Meal<>(mealType);
    }
}

public class MealPlan {
    public static void main(String[] args) {
        // List of available meal plans
        List<MealPlan> mealOptions = Arrays.asList(
                new VegetarianMeal(),
                new VeganMeal(),
                new KetoMeal(),
                new HighProteinMeal()
        );

        // Generate and serve each meal plan
        for (MealPlan mealOption : mealOptions) {
            Meal<?> customMeal = MealPlanGenerator.generateMealPlan(mealOption);
            customMeal.serveMeal();
            System.out.println();
        }
    }
}
