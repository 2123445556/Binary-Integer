import java.util.function.IntBinaryOperator;

public class Convert {

    // Converts binary number into actual value of each 1.
    public String convertToNum(String code){
        String num = "";
        int cnt = 1;
        int temp = 128;
        for(int i = 0; i < code.length(); i++) {
            if (code.substring(i, cnt).equals("1")) {

                num += String.valueOf(temp);
            }
            if(code.substring(i, cnt).equals("0")){
                num += "0";
            }
            temp /= 2;
            cnt++;
        }
        return num;
    }
    // converts binary number into actual total value.
    public String convertToBinary(String code){
        String num = "";
        String temp2 = "";
        int cnt = 1;
        int temp = 128;
        int sum = 0;
        for(int i = 0; i < code.length(); i++) {
            if (code.substring(i, cnt).equals("1")) {
                sum += temp;
                num += String.valueOf(temp) + " + ";
            }
            temp /= 2;
            cnt++;
        }
        temp2 = num.substring(0, num.length()-2);
        temp2 += " =  " + sum;

        return temp2;
    }
    // Converts value into binary number.
    public String converts(Integer c){
        String code = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        String num = "";
        int cnt = 1;
        int temp = 128;
        for(int i = 0; i < code.length(); i++) {
            if (code.substring(i, cnt).equals("1")) {

                num += String.valueOf(temp);
            }
            if(code.substring(i, cnt).equals("0")){
                num += "0";
            }
            temp /= 2;
            cnt++;
        }
        return num;
    }

   // Converts binary number into actual text
    public static String binaryToText(String binaryString) {
        StringBuilder string = new StringBuilder();
        int charCode;
        for (int i = 0; i < binaryString.length(); i += 8) {
            charCode = Integer.parseInt(binaryString.substring(i, i + 8), 2);
            String returnChar = Character.toString((char) charCode);
            string.append(returnChar);
        }
        return string.toString();
    }
}

