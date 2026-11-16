import java.util.Scanner;

class VehiceType{
    String Name;
    String Description;

    public VehiceType() {
        System.out.println("Using Default Constructor");
    }

    public VehiceType(String Name,String Description) {
        System.out.println("Using parameterised Constructor");
        this.Name=Name;
        this.Description=Description;
    }

    void display(){
        System.out.println("Name : " + Name);
        System.out.println("Description : " + Description);
    }    
}
public class Motor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of vehicle: ");
        String 
    }
}