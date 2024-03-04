public class Punctuation_Marks{
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        int[] punctuationCount = new int[256]; 
        for (char c : text.toCharArray()) {
            if (c == ',' || c == '.' || c == '-' || c == '\'') {
                punctuationCount[c]++;
            }
        }
        System.out.println("Punctuation marks count:");
        System.out.println("',' count: " + punctuationCount[',']);
        System.out.println("'.' count: " + punctuationCount['.']);
        System.out.println("'-' count: " + punctuationCount['-']);
        System.out.println("'\' count: " + punctuationCount['\'']);
    }
}
