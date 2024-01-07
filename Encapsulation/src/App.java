public class App {
    public static void main(String[] args) throws Exception {

        Student kid = new Student("Kid", 21, 4.0);

        System.out.println("Student Name: " + kid.getName());
        System.out.println("Student Age: " + kid.getAge());
        System.out.println("Student GPA: " + kid.getGpa());
        System.out.println("Student GPA Status: " + kid.getGpaStanding());

    }
}
