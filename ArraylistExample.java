import java.util.ArrayList;
import java.util.List;
public class ArraylistExample {
    public static void main(String[] args) {
        List <String> name= new ArrayList<>();

        name.add("Ankit");
        name.add("ankita");
        name.add("mahesh");//how to add
        name.add("ramesh");
        System.out.println(name);

    

     name.set(2,"rishi");
     System.out.println(name.size());//no of elements in list

     name.set(1,"vaibhav");
     System.out.println(name);//update elements
}
}