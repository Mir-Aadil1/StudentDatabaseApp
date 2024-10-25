package labs;

public class Lab2 {
    public static void main(String[] args) {
        Student student1 = new Student("Aadil", "321456987");
        Student student2 = new Student("Aditya", "321434987");
        student1.enroll("Math101");
        student1.enroll("Eng101");
        student1.enroll("His101");

        //student1.showCourse();
        //student1.checkBalance();
        student1.payTution(600);
        student1.checkBalance();
        System.out.println(student1.toString());

    }
}

class Student {
    // Properties

    private static int iD=1000;
    private String userId;
    private String name ;
    private String phone;
    private String city;
    private String state;
    private String ssn;
    private String email;
    public String courses = "";
    private int balance = 0;

    private static final int costOfCourse = 800;




    public Student (String name, String ssn) {
        iD++;
        this.name = name ;
        this.ssn = ssn;
        setUserId();
        setEmail();

    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    private void setEmail() {
        email = name.toLowerCase() + "." + iD+ "@someuniversity.com";
        System.out.println("Your email: " + email);

    }
    private void setUserId() {
        int max = 9000;
        int min = 1000;
        int randNum = (int) (Math.random() *  (max - min));
        randNum = randNum + min;
        System.out.println(randNum);
        userId = iD + "" + randNum + ssn.substring(6);
        System.out.println("Your User ID: " + userId);
    }

    public void enroll (String course) {

        this.courses = this.courses + "\n" + course;
        balance = balance + costOfCourse;



    }

    public void payTution( int amount) {
        System.out.println("Payment: " + amount);
        balance = balance -amount;



    }

    public void checkBalance(){
        System.out.println("Balance $" + balance);
    }

    public void showCourse(){
        System.out.println(courses);


    }
    @Override
    public String toString(){
        return "[Name: " + name + "]\n[COURSES: " + courses + "]" + "\n[Balance:" + balance + "]\n";
    }

    public String getEmail() {
        return email;
    }



}
