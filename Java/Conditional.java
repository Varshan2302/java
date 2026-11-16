public class Conditional {
    public static void main(String[] args) {
        //if statement

       /*  int a=5;
        int b=3;

        if(a>b){
            System.out.println("a is greater");
        }*/

        //if else statement

        /*int age=14;

        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not eligible to Vote");
        }*/

       /* int num=5;

        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }*/

        //Nested if

       /*  int mark;
        mark=65;

        if(mark>=70){
            if(mark>=90){
                System.out.println(" Eligible for Leader");
            }
            else{
                System.out.println("Not eligible for leader");
            }
        }
        else{
            System.out.println("Not eligible");
        }
        System.out.println("Not consider");
        */

        //else if
        //relation between two numbers

        /*int a=72;
        int b=75;
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("Equal");
        }*/


        //switch

        int n = 3;
        switch (n){
            case 1 -> System.out.println("Fan");

            case 2 -> System.out.println("Light");

            case 3 -> System.out.println("Tube Light");

            case 4 -> System.out.println("table fan");

            case 5 -> System.out.println("serial bulb");

            default -> System.out.println("No switches");
        }
    }
}
