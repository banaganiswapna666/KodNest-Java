
class PlacementEligibility {

    public static void main(String[] args) {
        int marks = 82;
        int attendance = 80;
        boolean projectCompleted = true;
        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendanceEligible;
        boolean placementEligible = academicEligible && projectCompleted;
        System.out.println("Placement Eligibile: " + placementEligible);
    }
}
