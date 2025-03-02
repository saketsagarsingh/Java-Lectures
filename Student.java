public class Student {
    //variables
    int rollNo;
    int age;
    String name;
    String address;
    int standard;

    Student(){
    }
    //constructor
    Student(int rollNo, int age, String name , String address, int standard){
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.address = address;
        this.standard = standard;
    }

    //method

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + ", address=" + address + ", standard="
                + standard + "]";
    }
    

    public static void main(String[] nikki){
        Student s1 = new Student();
        Student obj = new Student(10, 18, "Saket" , "Kolkata", 10);
        System.out.println(obj.toString());

        Student obj1 = new Student(11, 18, "Sagar", "Kolkata", 10);
        System.out.println(obj1.toString());
    }
}