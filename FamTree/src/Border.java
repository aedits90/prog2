import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Border {
Border() {
    Frame fr;
    fr = new Frame();
    //    public void drawString(text){String text="";}
    fr.setSize(500, 500);
    fr.setVisible(true);


    String line = "";
    String splitBy = ";";
    try {
//parsing a CSV file into BufferedReader class constructor
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\DEIK-PTI\\Prog2\\FamTree\\src\\prog2-main\\FamTree\\csf.csv"));
        while ((line = br.readLine()) != null)   //returns a Boolean value
        {
            String[] oszl = line.split(splitBy);    // use comma as separator
            System.out.println("ID=" + oszl[0] + " " + oszl[1] + " " + oszl[2]);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
}

}
