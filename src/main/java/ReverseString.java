import java.awt.*;

public class ReverseString {
    String reversed = null;
    public String reverse(String s){

        if (s.isEmpty()){
            System.out.println ("String is " + s);
            return s;
        }

        System.out.println ("Before return " + s);
        return reverse((s.substring(1))) + s.charAt(0);

    }

    public static void main (String [] argv){
        ReverseString reverseString = new ReverseString();
        String s = reverseString.reverse("abcdefggh");
        System.out.println(" reverse string is " + s);
    }
}
