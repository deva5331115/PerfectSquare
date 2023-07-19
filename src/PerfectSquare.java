import java.util.Scanner;

public class PerfectSquare {

   public static   int  numm;
    static  boolean square(int num){
        if(num*num==numm){
            return true;
        }
        if(num<1){
            return false;
        }
        return square(num-1);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        numm=number;
        System.out.println(square(number));

    }
}
