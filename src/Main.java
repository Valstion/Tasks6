import java.util.Random;

public class Main {


    public static void sumAndPrint(int a, int b) {
        int result = a + b;
        System.out.println("Suma: " + result);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int d = 54;
        int n = 32;
        int min = 1;
        int max = 10;
        sumAndPrint(x, y);
        int length1 = 1000;
        int min1 = 0;
        int max1 = 1;
        int rows = 4;
        int columns = 6;

        System.out.println("+++++++++++++++++++++++++++++++++++++2++++++++++++++++++++++++++++");
        System.out.println(PISq());
        System.out.println("+++++++++++++++++++++++++++++++++++++++3++++++++++++++++++++++++++");
        int product = duTipoKintamuosios(d, n);
        System.out.println(product);
        System.out.println("++++++++++++++++++++++++++++++++++++4+++++++++++++++++++++++++++++");
        int[] myArray = {1, 2, 3, 4, 5};
        printArrayElements(myArray);
        System.out.println("+++++++++++++++++++++++++++++++++++++++5++++++++++++++++++++++++++");
        int randomNum = kuriSugeneruojaDuInt(min, max);
        System.out.println("Atsitiktinis skaičius: " + randomNum);
        System.out.println("++++++++++++++++++++++++++++++++++++++6+++++++++++++++++++++++++++");
        int[] randomNum1 = kurSkaiciuMaqsyva(min1, max1, length1);
        for (int num : randomNum1) {
            System.out.println(num);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++7++++++++++++++++++++++++++++");
        int sum = funkcijaSusumojaMasyva(randomNum1);
        System.out.println("Masyvo elementu suma: " + sum);
        System.out.println("++++++++++++++++++++++++++++++++++++++++8+++++++++++++++++++++++++");
        double vidurkis = funkcijaSkaiciojaVidurki(randomNum1);
        System.out.println("Masyvo elementu vidurkis: " + vidurkis);
        System.out.println("+++++++++++++++++++++++++++++++++9++++++++++++++++++++++++++++++++");
        printRectangle(rows, columns);
        System.out.println("+++++++++++++++++++++++++++++10++++++++++++++++++++++++++++++++++++");
        String sentence = "Šiandien labai graži diena";
        countLettersAndSpaces(sentence);
        System.out.println("++++++++++++++++++++++++++++11+++++++++++++++++++++++++++++++++++++");
        String encoded = reverseSentence(sentence);
        System.out.println("Užkoduotas sakinys: " + encoded);

    }

    public static double PISq() {
        double c = 9.8596;
        return c;
    }

    public static int duTipoKintamuosios(int d, int n) {
        int result = d * n;
        System.out.println("Умножение " + result);
        return result;
    }

    public static void printArrayElements(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }

    }

    public static int kuriSugeneruojaDuInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static int[] kurSkaiciuMaqsyva(int min1, int max1, int length1) {
        int[] randomArray = new int[length1];
        for (int i = 0; i < length1; i++) {
            randomArray[i] = kuriSugeneruojaDuInt(min1,max1);
        }
        return randomArray;
    }

    public static int funkcijaSusumojaMasyva(int[] massyvaS) {
        int sum = 0;
        for (int num : massyvaS) {
            sum += num;
        }
        return sum;
    }

    public static double funkcijaSkaiciojaVidurki(int[] massyvaS) {
        return (double) funkcijaSusumojaMasyva(massyvaS) / massyvaS.length;
    }

    public static void printRectangle(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void countLettersAndSpaces(String sentence) {
        int letterCount = 0;
        int spaceCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isWhitespace(c)) {
                spaceCount++;
            }
        }
        System.out.println("Raidžių skaičius: " + letterCount);
        System.out.println("Tarpų skaičius: " + spaceCount);
    }

    public static String reverseSentence(String sentence) {
        StringBuilder reversed = new StringBuilder(sentence);
        reversed.reverse();
        return reversed.toString();
    }
}
