package foo.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertToArry {
    public static void main(String args[]){
        String[] colors={"black","blue","yellow"};
        
        LinkedList<String> links=
                new LinkedList<String>(Arrays.asList(colors));
        
        links.add("red");
        links.add("pink");
        links.add(3,"green");
        links.addFirst("Cyan");
        
        colors=links.toArray(new String[links.size()] );
        
        System.out.println("colors");
        
        for(String color: colors)
            System.out.println(color);
    }//end main
}//end ConvertToArry
