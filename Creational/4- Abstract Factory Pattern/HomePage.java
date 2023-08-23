public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goal) {
        workoutPlan = goal.createWorkout();
        mealPlan = goal.createMeal();
        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
