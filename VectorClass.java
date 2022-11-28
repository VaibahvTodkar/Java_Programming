// Program to inmplement Vector Class of Integer 

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        int number = 5;
        Vector<Integer> v = new Vector<Integer>(number);
        for(int i = 0; i < number; i++){
            v.add(i);
        }

        System.out.println(v);
        v.remove(3);
        System.out.println(v);

        for(int i = 0; i < v.size(); i++){
            System.out.print(v.get(i) + " ");
        }

    }
    
}
