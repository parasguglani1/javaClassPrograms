package day2.Assignment;

class Student implements Cloneable {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //copy constructor
    Student(Student s){
    this.rollno=s.rollno;
    this.name=s.name;
    this.age=s.age;
    }

}

public class Q2_objectcloning {

    public static void main(String[] args) {
        Student s1 = new Student(9403, "paras", 21);
        Student s2 = null;
        try {
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(s1.rollno + " " + s1.name + " " + s1.age);
        System.out.println(s2.rollno + " " + s2.name + " " + s2.age);
        Student s3=new Student(s1);
        System.out.println(s3.rollno + " " + s3.name + " " + s3.age);
        

    }

}
