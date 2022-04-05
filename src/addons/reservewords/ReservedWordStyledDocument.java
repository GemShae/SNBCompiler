package addons.reservewords;

import javax.swing.text.*;
import java.util.ArrayList;
import java.util.List;

public class ReservedWordStyledDocument extends DefaultStyledDocument {
    private final Style defaultStyle;
    private final MutableAttributeSet cwStyle;

    public ReservedWordStyledDocument(Style defaultStyle, MutableAttributeSet cwStyle) {
        this.defaultStyle = defaultStyle;
        this.cwStyle = cwStyle;
    }

    /* Geting Reserved word to be highlighted */
    public void insertString(int offset, String aString, AttributeSet attributeSet) throws BadLocationException {
        super.insertString(offset,aString,attributeSet);
        refreshDocument();
    }

    public void remove(int offset, int length) throws BadLocationException {
        super.remove(offset,length);
        refreshDocument();
    }

    private synchronized void refreshDocument() throws BadLocationException {
        String text = getText(0, getLength());
        final List<HiliteWord> hiliteWordList = processWords(text);

        setCharacterAttributes(0,text.length(), defaultStyle, true);
        for (HiliteWord word: hiliteWordList) {
            int p0 = word.position;
            setCharacterAttributes(p0,word.word.length(),cwStyle,true);
        }
    }

    private static List<HiliteWord> processWords(String content) {
        content+=" ";
        List<HiliteWord> hiliteWords = new ArrayList<>();
        int lastWhiteSpacePosition;
        StringBuilder word = new StringBuilder();
        char[] data = content.toCharArray();

        for (int index=0; index<data.length; index++) {
            char ch = data[index];

            if (!(Character.isLetter(ch) || Character.isDigit(ch))) {
                lastWhiteSpacePosition = index;

                if (word.length() > 0) {
                    if (isReservedWord(word.toString())) {
                        hiliteWords.add(new HiliteWord((lastWhiteSpacePosition-word.length()), word.toString()));
                    }
                    word = new StringBuilder();
                }
            }
            else {
                word.append(ch);
            }
        }
        return hiliteWords;
    }

    private static boolean isReservedWord(String word) {
        return (word.toUpperCase().trim().equals("SNB") ||
                word.toUpperCase().trim().equals("BNS") ||
                word.toLowerCase().trim().equals("show") ||
                word.toLowerCase().trim().equals("float") ||
                word.toLowerCase().trim().equals("string"));

    }
}
