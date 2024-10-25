package labs;

public class Lab2 {
    public static void main(String[] args) {
        Student student1 = new Student("Aadil", "321456987");
        Student student2 = new Student("Aditya", "321434987");

    }
}

class Student {
    // Properties

    private static int iD=1000;
    private String userId;
    private String name ;
    private String ssn;
    private String email;


    public Student (String name, String ssn) {
        iD++;
        this.name = name ;
        this.ssn = ssn;
        setUserId();
        setEmail();

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

}
