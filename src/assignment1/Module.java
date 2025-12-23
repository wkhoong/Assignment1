package assignment1;

public class Module {
    private String moduleCode;
    private String moduleName;
    private String lecturerName;
    
    public Module(String moduleCode, String moduleName, String lecturerName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.lecturerName = lecturerName;
    }
    
    public String getLecturerName() { return lecturerName; }
    
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
    
    public String toFileString() {
        return moduleCode + "|" + moduleName + "|" + lecturerName;
    }
}
