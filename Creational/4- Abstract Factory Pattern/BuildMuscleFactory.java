public class BuildMuscleFactory implements GoalFactory {

    @Override
    public WorkoutPlan createWorkout() {
        return new BuildMuscleWorkout();
    }

    @Override
    public MealPlan createMeal() {
        return new BuildMuscleMealPlan();
    }

}
