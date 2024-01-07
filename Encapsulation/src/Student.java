public class Student {

    private String name;
    private int age;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpaStanding() {
        if (gpa > 3) {
            return "Excellent! Keep up the Good Work!";
        } else if (gpa >= 2) {
            return "Good!";
        } else {
            return "You can do better! You got this!";
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error");
            this.gpa = 0.0;
        }

    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

}