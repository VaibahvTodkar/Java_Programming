public class StringExample {
    public static void main(String[] args) {
        String s = "Shart#T$e&ch@12";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))
                    && !Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no Special Symbol");
        } else {
            System.out.println("There is Special Symbol \n " + count + " " + "Special Characters found.");

        }

    }
}
