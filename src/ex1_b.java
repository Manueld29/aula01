
import java.util.Scanner;

public class ex1_b {
    public static void main(String[] args){
        int x,counter;
        counter = 0;

        Scanner z = new Scanner(System.in);
        System.out.println("Numero");
        x = z.nextInt();
        x++;
        while (x > 0){
            x = x / 10;
            counter ++;

        }

        System.out.println();


    }
}
