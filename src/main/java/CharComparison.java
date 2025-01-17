public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        // .toString() also convert String to String type BUT will throw a NullPointerException if instance is null
        // String aStr = a.toString();
        // String bStr = b.toString();
        /* Use valueOf() over .toString()
        ** String.valueOf() method will convert String .toString() & will return "null" if instance is null */
        // https://stackoverflow.com/questions/27465731/string-valueof-vs-object-tostring
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        // int lexOrder2 = java.util.Arrays.compare(a, b);  // Arrays.compare(a, b) method on char[] works too
        int lexOrder = aStr.compareTo(bStr);
        
        // if aStr & bStr are lexographically equal ... i.e., char 'c' is before char 'd' --- c > d
        if(lexOrder == 0){
            // indicate so
            return 0;
        }

        /* else if aStr < bStr ... */
        // else if(lexOrder < 0){
        //     return (-1);
        // }

        /* else if aStr > bStr ... */
        // else{
        //     return 1;
        // }

        // ternary operation for else-if & else block above -- works too
        return ((lexOrder < 0) ? (-1) : 1);

    }
}
