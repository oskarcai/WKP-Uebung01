package A1;

public class Password implements Comparable<String> {
    private String value;

    public Password(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(String o) {
        // return difference in length if Strings have inequal length
        // (positive if this is longer | negative if other is longer)
        /* assuming length -> safety */
        int thisLength = this.value.length();
        int otherLength = o.length();
        if(thisLength != otherLength) return thisLength - otherLength;
        else {
            // return difference in digits-amount if Strings have equal length
            // (positive if this has more digits | negative if other has more digits)
            /* assuming more digits -> more safety */
            return countDigits(this.value) - countDigits(o);
        }
    }

    // Hilfsmethode: countDigits
    private int countDigits(String s) {
        int digit = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) digit++;
        }
        return digit;
    }

    public String getValue() {
        return this.value;
    }

}
