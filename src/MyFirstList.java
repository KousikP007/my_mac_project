import java.util.Arrays;
import java.util.List;

public class MyFirstList {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("kousik","paul");
        for(String s : ls){
            System.out.println("my list"+s);
        }
    }

}
