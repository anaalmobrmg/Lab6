import java.util.Scanner;

public class Question4_Answer4 {



        public static void main(String[] args) {
            int  number ;
            int Chars=0 ;
            int  plus=0 ;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter number: ");
            number=in.nextInt();

            System.out.println("Number "+number+" in binary is: ");

            for (int i = 0; i <8 ; i++) {
                plus++;
                Chars=number%2;
                number=number/2;

                System.out.println(" "+Chars);
            }
            System.out.println("the number is divided "+plus+" times");
        }
    }

