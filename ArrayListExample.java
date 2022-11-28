import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Java");
        a.add("C++");
        a.add("c");
        a.add("C#");
        a.add("HTML");

        System.out.println(a);
        
        System.out.println("Size of an Array "+a.size());

        a.remove(3);

        System.out.println(a);

    }
}