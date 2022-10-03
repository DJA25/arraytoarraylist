import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] arr = {"cool", "nice"};
        // note generics don't work with primitive types
        ArrayList<String> list = toList(arr);
//        built in function:
        System.out.println(arr);
        System.out.println(list);

    }
    public static <T> ArrayList<T> toList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        for(T i: arr) list.add(i);
        return list;
    }
}
