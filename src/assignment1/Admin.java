package assignment1;

import java.util.ArrayList;
import java.util.HashSet;

public class Admin {
    private ArrayList<Module> modules;
    private String moduleFilePath;
    
    public Admin(String moduleFilePath) {
        this.moduleFilePath = moduleFilePath;
        this.modules = DataIO.loadModules(moduleFilePath);
    }
    
    public void replaceLecturer(String oldName,String newName) {
        for (Module m : modules) {
            if (m.getLecturerName().equals(oldName)) {
                m.setLecturerName(newName);
                
            }
        }
        DataIO.saveModules(moduleFilePath, modules);
    }
}
