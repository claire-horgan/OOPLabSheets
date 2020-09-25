import javax.swing.*;
import java.util.Arrays;

public class NamesArray {

    public static void main(String[] args) {

        int i=0,  totalChars=0;
        float avgchars =0;
        String names[] = new String[3];
    String longestName = " ", message;




        populateArray(names);

        for (i=0; i<names.length; i++)
        {
            if(names[i].length() > longestName.length())
            {
                longestName = names[i];
            }
            totalChars += names[i].length();

        }
        avgchars = totalChars / names.length;
        message = String.format("Longest name is " + longestName + "\n total character is " + totalChars + "\n The average number of chars is "
                + String.format("%.0f",avgchars));
        JOptionPane.showMessageDialog(null,message, "Names", JOptionPane.INFORMATION_MESSAGE);
   Arrays.sort(names);

        message = "\n" + names[0] +"\n" + names[1] + "\n" + names[2] ;



        JOptionPane.showMessageDialog(null,message, "Names", JOptionPane.INFORMATION_MESSAGE);



    }

    public static void populateArray(String names[])
    {
        int i;
        String message;

        for(i=0; i<names.length; i++) {

            names[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i + 1));
        }
message = "\n" + names[0] +"\n" + names[1] + "\n" + names[2] ;



            JOptionPane.showMessageDialog(null,message, "Names", JOptionPane.INFORMATION_MESSAGE);

    }
}
