import java.util.ArrayList;
import java.util.Arrays;

public class MyFirstArrayList {
    public static void main(String[] args) {
        ArrayList<String> ls=new ArrayList<>();
        ls.add("Kousik");
        ls.add("paul");
        for(String s:ls){
            System.out.println("my 1st arrayList"+s);
        }
    }
}
