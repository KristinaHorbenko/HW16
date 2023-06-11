public class Main {
    public static void main(String[] args) {
        // Task2
        String text = "Success is to wake up each morning and consciously decide that today will be the best day of your life.";
        char symbol = 's';

        int  quantity = Methods.findSymbolOccurance(text, symbol);
        System.out.println("Символ " + symbol + " повторюєьбся " + quantity + " разів ");

        // Task3
        String source = "Apollo";
        String target = "pollo";

        int position = Methods.findWordPosition(source, target);
        System.out.println("Результат: " + position);

        // Task4
        String text1 = "Hello world!";
        String backText1 = Methods.stringReverse(text1);
        System.out.println(backText1);

        // Task5
        String text2 = "level";
        boolean result = Methods.isPalindrome(text2);
        System.out.println(result);

    }
}