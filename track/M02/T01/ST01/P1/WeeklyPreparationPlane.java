
public class WeeklyPreparationPlan {

    public static void main(String[] args) {
        int JavaHoursPerDay = 2;
        int AptitudeHoursPerDay = 1;
        int NumberOfDays = 5;
        int weeklyJavaHours = JavaHoursPerDay * NumberOfDays;
        int weeklyAptitudeHours = AptitudeHoursPerDay * NumberOfDays;
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;
        System.out.println("Java:" + weeklyJavaHours);
        System.out.println("Aptitude:" + weeklyAptitudeHours);
        System.out.println("Total:" + totalPreparationHours);
    }
}
