/* print



 */
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n - 1; // space
        int st = 1; // star
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
                sp--;
                st++;
                System.out.println();
            }
        }

    }

