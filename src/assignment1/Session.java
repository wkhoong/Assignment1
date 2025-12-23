package assignment1;

public class Session {
    public static String role = "";
    public static String id = "";
    public static String filePath = "";
    
    public static void setRole(String selectedRole) {
        role = selectedRole;
        switch (role) {
            case "Admin_staff":
                filePath = "src\\assignment1\\DATA\\Admin.txt";
                break;
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
                break;
        }
}
    
    public static boolean isNumeric(String s) {
        return s != null && s.matches("\\d+");
    }
}

