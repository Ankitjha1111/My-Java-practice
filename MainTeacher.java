public class MainTeacher {
    public static void main(String[] args) {
        
        Teacher ankit =new MathTeacher() ;
        ankit.teach();
        ankit.givetask();
        System.out.println("math teacher");
            
        Teacher ankita = new EnglishTecher();
        ankita.teach();
        ankita.givetask();
        System.out.println("English teacher");
        };
    }

