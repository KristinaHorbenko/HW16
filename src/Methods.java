public class Methods {
    public static int  findSymbolOccurance (String text, char symbol) {
        int quantity = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == symbol) {
                quantity++;
            }
        }
        return quantity;
    }

    public static int findWordPosition(String source, String target) {
        int position = source.indexOf(target);
        return position;
    }

    public static String stringReverse(String text1) {
        StringBuffer back =  new StringBuffer(text1);
        back.reverse();
        return back.toString();
    }

    public static boolean isPalindrome(String text2) {
        StringBuilder back1 = new StringBuilder(text2);
        back1.reverse();
        String back1Text2 = back1.toString();

        return text2.equals(back1Text2);
    }
}

