public class WeightLossFactory implements GoalFactory {

    @Override
    public WorkoutPlan createWorkout() {
        return new WeightLossWorkout();
    }

    @Override
    public MealPlan createMeal() {
        return new WeighLossMealPlan();
    }

}
