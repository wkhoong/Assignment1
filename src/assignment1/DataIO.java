package assignment1;

import java.io.*;
import java.util.*;

public class DataIO {
    //Check name
    public static boolean lecturerExists(String name, String lecturerFile) {
        File file = new File(lecturerFile);
        if (!file.exists()) return false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length >= 1 && p[0].equalsIgnoreCase(name)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    //read file
    public static ArrayList<Module> loadModules(String filePath) {
        ArrayList<Module> modules = new ArrayList<>();
        
        File file = new File(filePath);
        if (!file.exists()) return modules;
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                if (p.length != 3) continue;
                
                modules.add(new Module(p[0], p[1], p[2]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return modules;
    }
    
    //Write file
    public static void saveModules(String filePath, ArrayList<Module> modules) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath, false))) {
            for (Module m : modules) {
                pw.println(m.toFileString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
