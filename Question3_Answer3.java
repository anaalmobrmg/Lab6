import java.util.Scanner;

public class Question3_Answer3 {


        public static void main(String[] args) {
            int test=2;
            Scanner in=new Scanner(System.in);
            System.out.println(" (All powers of 2 from 2*0 up to 2*20) ");
            for (int i = 0; i <= 20; i++) {
                if (i==0)
                    test=1;
                else if (i==1)
                    test=2;
                else test=test*2;

                System.out.print(test+" ");

            }
        }
    }

