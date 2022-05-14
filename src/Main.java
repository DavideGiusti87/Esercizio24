/*
Boolean Operators 02
Exercise: Boolean Operators 2
Try to solve on paper the following boolean algebra operations:

[A]: (55 != 55) && (false ^ true)
[B]: considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d  )
[C]: false && true || false && !false
[D]: (false && true) || (false || true)
Then compare your solutions with a Java program that tests the validity of your assumptions.
 */
public class Main {
    public static void main(String[] args) {

        // [A]: (55 != 55) && (false ^ true) = (false) && (true) = false
        System.out.println("[A]: "+((55 != 55) && (false ^ true)));

        /* [B]: considering that a=true, b=false, int c=2 and char d='2':
        (!a || !b) || c == d = (false || true) || false =  true || false = true */
        boolean a=true, b=false;
        int c=2;
        char d='2';
        System.out.println("[B]: considering that a=true, b=false, int c=2 and char d='2': "+((!a || !b) || c == d));

        // [C]: false && true || false && !false = false || false && true = false && true = false
        System.out.println("[C]: "+(false && true || false && !false));

        // [D]: (false && true) || (false || true) = false || true = true
        System.out.println("[D]: "+((false && true) || (false || true)));
    }
}
