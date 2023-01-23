public class Student extends Person {
    public double gpa;

    public Student(String name, String surname, double gpa) {
        super(name,surname);
        setGpa(gpa);
    }

    @Override
    public String toString() {
        return "Student:" + super.toString();
    }
    public double GetPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        } else return 0.00;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

}
