import java.util.Scanner;

public class JavaTest {



        public static void main(String[] args) {
            String text, shortestText;
            char ch, nextCh=' ';
            int i=1,j=0,edcount=0,vowels=0, words=0, totalWords=0 ;


            Scanner input = new Scanner(System.in);

            do {

                j=0;
                edcount = 0;
                vowels = 0;
                words = 0;

                System.out.println("Please enter a piece of Text " + i + ":");

                text = input.nextLine();

                while (j < text.length()) {
                    ch = text.charAt(j);
                    if (j < (text.length() - 1))

                        nextCh = text.charAt(j + 1);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

                        vowels++;


                    if (ch == ' ')

                        words++;


                    if (ch == 'e' && nextCh == 'd')
                        edcount++;

                    j++;
                }

                System.out.print("\n\n\t\t***** Text Data ****" +
                        "\n\nNumber of Characters: " + text.length() +
                        "\nNumber of lowercase vowels : " + vowels +
                        "\nNumber of words :" + (words +1) +
                        "\nNumber of times \"ed\" appears in text : " + edcount +"\n\n");

                totalWords =+ words;

                i++;
            } while( i<=3);
        }
    }




