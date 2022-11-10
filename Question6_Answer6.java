import java.util.Scanner;

public class Question6_Answer6 {


        public static void main(String[] args) {
            String Space ;
            int  again;
            Scanner in=new Scanner(System.in);
            System.out.println("Input your word: ");
            Space=in.next();
            again=Space.length();

            for (int i = 1; i < Space.length() ; i--) {
                again--;
                System.out.print(Space.charAt(again));
            }

        }
    }

