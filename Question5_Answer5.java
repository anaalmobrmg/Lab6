import java.util.Scanner;

public class Question5_Answer5 {


        public static void main(String[] args) {
            String word;
            char plus=32;
            Scanner in=new Scanner(System.in);
            System.out.println("Input your word: ");
            word=in.nextLine();
            for (int i = 0; i <word.length() ; i++) {
                if (word.charAt(i)>=97 ) {
                    plus =plus++;
                    char Ac= (char) (word.charAt(i)-plus);
                    System.out.println("  " + Ac);
                }
                else
                    System.out.println("  "+word.charAt(i));

            }
        }
    }

