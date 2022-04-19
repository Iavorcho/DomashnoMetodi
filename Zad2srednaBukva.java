import java.util.Scanner;

public class Zad2srednaBukva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String wordForDissection;
        System.out.println("Enter a word");
        wordForDissection = scanner.next();

        wordfinder(wordForDissection);
        System.out.println(wordfinder(wordForDissection));
    }

    public static String wordfinder(String wordForDissection) {
        int sizeOfWord;
        String letter2;
        String letter1;
  //      String letterFinal;
        sizeOfWord = wordForDissection.length();

        if (sizeOfWord % 2 == 0){
            letter1 = String.valueOf(wordForDissection.charAt(sizeOfWord /2));
            letter2 = String.valueOf(wordForDissection.charAt(sizeOfWord /2-1));
            return letter1.concat(letter2);
            }
        else {
            return String.valueOf(wordForDissection.charAt(sizeOfWord /2));

        }
    }


}

