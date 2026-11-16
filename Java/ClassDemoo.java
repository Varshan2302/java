class Student{
    //1.Methods
    //2.variables(data members)

    String name;
    int age;

    void display(){
        System.out.println("NAME = " + name);
        System.out.println("AGE = " + age);
    }

}


public class ClassDemoo{
    public static void main(String[] args) {
        //classes and objects
        //class - blueprint
        //object - physical entity that follows blueprint

        Student v1 = new Student();
        Student v2 = new Student();
        v1.name = "Varshan";
        v2.name = "Vaiju";
        v1.age =20;
        v2.age =20;
        v1.display();
        v2.display();
        
    }
}