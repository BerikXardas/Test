/*
    Aufgabe 2) Arbeiten mit Strings
*/
public class Aufgabe2 {
    
    public static void main(String[] args) {
        
        String sentence = "Die Bearbeitung von Zeichenketten wird sehr oft benötigt!";

        if (sentence.length() < 1){
            System.out.println("sentence is empty");}
        else {
            System.out.println("sentence is not empty");} // I initially thought of this; later I found "isEmpty"
        System.out.println("sentence is empty: " + sentence.isEmpty());
        /* I put the "if empty" tests up there because latter operations cannot handle empty strings. Therefore,
        the program would have stopped before this actual test */

        System.out.println(sentence.substring(34));
        System.out.println(sentence.substring(4, 15));
        System.out.println(sentence.charAt(4));
        System.out.println(sentence.indexOf('Z'));
        System.out.println(sentence.lastIndexOf('t'));
        System.out.println(sentence.length());
        System.out.println("sentence starts with Die: " + sentence.regionMatches(0, "Die",0, 3));
        System.out.println("sentence starts with Die: " + sentence.startsWith("Die")); // I found this one later by coincidence
        System.out.println(sentence.concat(sentence.substring(4, 15)));
        System.out.println(sentence.replace('i','I'));
        System.out.println(sentence.replaceFirst("Zeichenketten", "Strings"));
        /* I decided to use "replaceFirst" as the assignment did not mention to replace all "Zeichenketten". */
        System.out.println(sentence.toLowerCase());
        System.out.println((sentence.substring(34)).toUpperCase());




        }

    }



