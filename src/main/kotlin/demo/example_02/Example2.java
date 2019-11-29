package demo.example_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add("sabbath");
    }
}
