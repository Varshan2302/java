public class Unconditional {
    public static void main(String[] args) {
        /*for(int i=1;i<=15;i++){
            if(i==7){
                break;
            }
            System.out.println("vv");
        }
        System.out.println("bye");*/

        for(int i=1;i<=10;i++){
            if(i==7){
                continue;
            }
            System.out.println("vv"+i);
        }
        System.out.println("Bye");
    }
}
