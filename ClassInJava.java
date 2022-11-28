class Sample{
    public 
        String str = "Sample Class";

        void s_display(){
            System.out.println(str);
        }
}

public class ClassInJava {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.s_display();
    }
}
