import java.util.Vector;

class Vector_String
{
    public static void main(String[] args) {
        Vector<String> s = new Vector<String>();

        s.add("ABC");
        s.add("DEF");
        s.add("GHI");
        
        System.out.println(s);  
        System.out.println(s.capacity());    

        s.remove(0);
        System.out.println(s);
    }  
    
}