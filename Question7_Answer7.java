import java.util.Scanner;

public class Question7_Answer7 {



        public static void main(String[] args) {
            int Chars=0;
            String Spaces;
            Scanner in=new Scanner(System.in);
            System.out.println(" Input any word: ");
            Spaces=in.nextLine();
            System.out.print("The vowels in your writing are: ");
            for (int i = 0; i < Spaces.length(); i++) {
                char a=Spaces.charAt(i);

                if ( a== 'a' ||a=='e'||a=='i'||a=='o'||a=='u'||a=='y') {
                    Chars++;
                    System.out.print(Spaces.charAt(i)+" ");
                }
            }
            System.out.println(" ");
            System.out.println("Your writing has: "+Chars+" vowels ");
        }

    }

