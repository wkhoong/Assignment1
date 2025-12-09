package assignment1;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Utils {
    public static void defaultSettings(JFrame frame) {
        frame.setLocationRelativeTo(null);
        
        
        frame.setIconImage(
                new ImageIcon(
                        Utils.class.getResource("/assignment1/Image/apu_logo.png")
                ).getImage()
        );
        
        frame.setTitle("APU");
        
    }
    
    public static void saveUser(String role, String name, String id, String password) {
        String filePath;
        switch (role) {
            case "Student":
                filePath = "src\\assignment1\\DATA\\Student.txt";
                break;
            case "Lecturer":
                filePath = "src\\assignment1\\DATA\\Lecturer.txt";
                break;
            case "Leader":
                filePath = "src\\assignment1\\DATA\\Leader.txt";
                break;
            default:
                filePath = "src\\assignment1\\DATA\\Student.txt";
        }

        String record = role + "|" + name + "|" + id + "|" + password;
        
        try (FileWriter fw = new FileWriter(filePath, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            
            out.println(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
