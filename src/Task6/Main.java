package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        String randomWord = Loto.chooseWord(words);
        String hint = Loto.generateHint(randomWord);
        int quantity = 0;
        Scanner scanner = new Scanner(System.in);
        String userWord = "";

             while (!userWord.equals(randomWord)) {
                System.out.println("Вгадайте слово: ");

                userWord = scanner.nextLine().toLowerCase();

                quantity++;

                hint = Loto.disguiseWord(userWord, randomWord, hint);
                System.out.println("Спроба " + quantity + ": " + hint);

            }
            System.out.println("Вітаємо! Ви вгадали слово.");


        }

    }


