import java.util.Scanner;

public class PallendromNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         int rev = 0;
         int temp = n;
        while(n > 0){
            rev = (rev*10) + n % 10;
            n = n / 10;


        }
        if(rev == temp){
            System.out.println("palindrome");
        } else{
            System.out.println("Not palindrome");
        }


    }
}

