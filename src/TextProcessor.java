public class TextProcessor {
    private final String inputText;
    private final char startLetter;
    private final char endLetter;

    public TextProcessor(String inputText, char startLetter, char endLetter) {
        this.inputText = inputText;
        this.startLetter = startLetter;
        this.endLetter = endLetter;
    }

    public void processText() {
        try {
            if (inputText == null || inputText.isEmpty()) {
                throw new Exception("Input text cannot be empty.");
            }

            String[] sentences = inputText.split("[.!?]");

            StringBuilder stringBuilder = new StringBuilder();

            for (String sentence : sentences) {
                String trimmedSentence = sentence.trim();
                String lowerCaseRow = trimmedSentence.toLowerCase();

                int startIndex = lowerCaseRow.indexOf(Character.toLowerCase(startLetter));
                int endIndex = lowerCaseRow.lastIndexOf(Character.toLowerCase(endLetter));

                if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
                    stringBuilder.append(trimmedSentence, 0, startIndex);
                    stringBuilder.append(trimmedSentence, endIndex + 1, trimmedSentence.length());
                } else {
                    stringBuilder.append(trimmedSentence);
                }
            }

            System.out.println("Modified Text: " + stringBuilder.toString());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
