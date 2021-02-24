/*
    Aufgabe 1) Variablen, Datentypen und Typumwandlungen
*/
public class Aufgabe1 {
    
    public static void main(String[] args) {
        
        float a = 1464e-3f;
        float b = 3.41f;
        double fakeC = 0.013e2;
        /* I am aware of the bad style, however I decided to name these values alphabetical - later on, the assignment
        wanted me to define a different "c". I won't be so edgy at tests, or upcoming assignments, I promise. */
        double d = 1.325;
        int e = 0x8;
        int f = 011;
        long g = 15L;
        char h = '5'; // java will use 53 in calculations as char '5' has this value in ASCII code table
        byte fakeI = 127;  // this is the largest possible value for byte; adding positive values will cause overflow, rolling to -128
        short j = 128; // as byte, this will have the value of -128 due to two's complement
        char c = '7';
        String st = "Lehrveranstaltung";
        int i = 7;

        double prodA = a*b*fakeC*d*e*f*g*h*fakeI*j;
        long prodB = (long) a * (long) b * (long) fakeC * (long) d *  e *  f *  g * h * fakeI * j;
        /* product too large for int;
        only necessary casts were made*/

        int sumA = (int) (a+b+fakeC+d+e+f+g+h+fakeI);
        byte sumB = (byte) ((byte) a + (byte) b + (byte) fakeC + (byte) d + (byte) e + (byte) f + (byte) g + (byte) h +
                (byte) fakeI + (byte) j); // this time unnecessary casts were made as it was commanded to cast every variable


        System.out.println("" + a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f +
                ", " + g + ", " + h + ", " + fakeI + ", " + j);
        System.out.println(prodA);
        System.out.println(prodB);
        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println((int)c);
        /* when casting to int, java will be using the numerical value of the character as defined on the ASCII code list */
        System.out.println(st + i + c);
        System.out.println(i + c + st);
        /* The "addition" of the variables in the first output starts with a string - therefore, the other variables
        will be treated as strings too. The second output however starts with the addition of 7 and the value '7' has on
        the ASCII table (7 + 55). This equates to 62 - the string is then added afterwards. */
    }
}



