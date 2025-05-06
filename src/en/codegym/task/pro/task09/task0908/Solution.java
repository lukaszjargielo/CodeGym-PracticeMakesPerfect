package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        StringBuilder builder = new StringBuilder();
        String hexNumber = "";
        if (binaryNumber != null && !binaryNumber.isEmpty()) {
            if (binaryNumber.matches("[01]+")) {
                if (binaryNumber.length() % 4 != 0) {
                    int numOfZeros = 4 - (binaryNumber.length() % 4);
                    binaryNumber = "0".repeat(numOfZeros) + binaryNumber;
                }
                for (int i = 0; i < binaryNumber.length(); i += 4) {
                    int hexValue = 0;
                    String substring = binaryNumber.substring(i, i + 4);
                    if ('1' == substring.charAt(0)) {
                        hexValue += 8;
                    }
                    if ('1' == substring.charAt(1)) {
                        hexValue += 4;
                    }
                    if ('1' == substring.charAt(2)) {
                        hexValue += 2;
                    }
                    if ('1' == substring.charAt(3)) {
                        hexValue++;
                    }
                    char c = HEX.charAt(hexValue);
                    builder.append(c);
                }
                hexNumber = builder.toString();
            }
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        StringBuilder builder = new StringBuilder();
        if (hexNumber != null && !hexNumber.isEmpty()) {
            char[] charArrayFromHexNumber = hexNumber.toCharArray();
            for (char c : charArrayFromHexNumber) {
                int hexValue = 0;
                if (!Character.isDigit(c) && !(c >= 'a' && c <= 'f')) {
                    return binaryNumber;
                } else if (Character.isDigit(c)) {
                    hexValue = c - '0';
                } else {
                    hexValue = 10 + Math.abs(97 - c);
                }

                if (hexValue >= 8) {
                    hexValue -= 8;
                    builder.append('1');
                } else {
                    builder.append('0');
                }

                if (hexValue >= 4) {
                    hexValue -= 4;
                    builder.append('1');
                } else {
                    builder.append('0');
                }

                if (hexValue >= 2) {
                    hexValue -= 2;
                    builder.append('1');
                } else {
                    builder.append('0');
                }

                if (hexValue >= 1) {
                    builder.append('1');
                } else {
                    builder.append('0');
                }
            }
            binaryNumber = builder.toString();
        }
        return binaryNumber;
    }
}

/*
Recommended solution

public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element;
            if (substring.equals("0001")) {
                element = "1";
            } else if (substring.equals("0010")) {
                element = "2";
            } else if (substring.equals("0011")) {
                element = "3";
            } else if (substring.equals("0100")) {
                element = "4";
            } else if (substring.equals("0101")) {
                element = "5";
            } else if (substring.equals("0110")) {
                element = "6";
            } else if (substring.equals("0111")) {
                element = "7";
            } else if (substring.equals("1000")) {
                element = "8";
            } else if (substring.equals("1001")) {
                element = "9";
            } else if (substring.equals("1010")) {
                element = "a";
            } else if (substring.equals("1011")) {
                element = "b";
            } else if (substring.equals("1100")) {
                element = "c";
            } else if (substring.equals("1101")) {
                element = "d";
            } else if (substring.equals("1110")) {
                element = "e";
            } else if (substring.equals("1111")) {
                element = "f";
            } else {
                element = "0";
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if (hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                ;
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}
 */