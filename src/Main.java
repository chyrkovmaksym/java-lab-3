public class Main {
    public static void main(String[] args) {
        String inputText = "This is a sample text. It contains some sentences! The text needs processing?";
        char startLetter = 't';
        char endLetter = 't';

        TextProcessor textProcessor = new TextProcessor(inputText, startLetter, endLetter);
        textProcessor.processText();
    }
}