package sources.Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
/*  ...Before Generic (HTML5 and older)...
        List animals =  new ArrayList();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        String animal = (String) animals.get(1);
        System.out.println(animal);
*/

        List<String> animals2 = new ArrayList<String>();
//or    List<String> animals2 = new ArrayList<>();
        animals2.add("dog");
        animals2.add("cat");
        animals2.add("frog");
        String animal2 = animals2.get(1);
        System.out.println(animal2);
    }
}
