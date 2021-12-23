public class Student extends Human {
    private double mathScore;
    private double pointOfReason;
    private double pointChemistry;

    public Student(double mathScore, double pointOfReason, double pointChemistry) {
        this.mathScore = mathScore;
        this.pointOfReason = pointOfReason;
        this.pointChemistry = pointChemistry;
    }

    public Student(String name, int age, double mathScore, double pointOfReason, double pointChemistry) {
        super(name, age);
        this.mathScore = mathScore;
        this.pointOfReason = pointOfReason;
        this.pointChemistry = pointChemistry;
    }

    public Student() {
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPointOfReason() {
        return pointOfReason;
    }

    public void setPointOfReason(double pointOfReason) {
        this.pointOfReason = pointOfReason;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathScore=" + mathScore +
                ", pointOfReason=" + pointOfReason +
                ", pointChemistry=" + pointChemistry +
                '}';
    }
}
