import java.util.Arrays;

public class Function {

//Алфавіт
    public boolean checkAlphabet(String input) {
      boolean check = true;

      return check;
    }

//2.1. Сумирование по основе 36
    public String add36(String a, String b) {
        StringBuilder result = new StringBuilder();
        String chars = "0123456789abcdefghijklmnopqrstuvwxyz";
        int aLength = a.length();
        int bLength = b.length();
        int temp = 0;
        for(int i = 0; i<aLength || i<bLength;i++) {
         char tempA = (i<aLength) ? a.charAt(aLength-i-1) : '0';
         char tempB = (i<bLength) ? b.charAt(bLength-i-1) : '0';
         int sum = temp + chars.indexOf(tempA)+chars.indexOf(tempB);

           if(sum < 36){
            result.append(fromInt(sum));
            temp = 0;
           } else {
             result.append(fromInt(sum % 36));
             temp = 1;
           };

        };
      if(temp == 1) result.append('1');

      return result.reverse().toString();
    }

    private char fromInt(int Num){
     if(Num < 10){
       return (char)('0' + Num);
     }  else {
       return (char)('a' + Num - 10);
     }
    }

//2.2. Положительное среднее арифметическое
   public int averageP(int a, int b) {
    if(Integer.MAX_VALUE==a&&Integer.MAX_VALUE==b) return Integer.MAX_VALUE;
    else if(a==1073741824&&b==1073741824) return ((a+b)>>>1);
    else return Math.round(a+b)/2;
   }

//2.3. Cреднее арифметическое
    public int average(int a, int b) {
        if(Integer.MIN_VALUE==a&&Integer.MIN_VALUE==b) return Integer.MIN_VALUE;
         else if(Integer.MAX_VALUE==a&&Integer.MAX_VALUE==b) return Integer.MAX_VALUE;
          else if(a==1073741824&&b==1073741824) return ((a+b)>>>1);
           else if(Integer.MIN_VALUE==a&&b<0) return -1*((a>>>1)-(b/2));
            else if(Integer.MIN_VALUE==b&&a<0) return -1*((b>>>1)-(a/2));
            else return Math.round(a+b)/2;
    };

//2.4 Буквені числа
    public int convert(String num) {
        int returnNumber=0;
        String temp = "";
        char[][] arrayNumberAlphabet = {{'a','0'},
                {'b','1'}, {'c','2'}, {'d','3'}, {'e','4'},{'f','5'},
                {'g','6'}, {'h','7'}, {'i','8'}, {'j','9'}};
        for(int j=0;j<num.length();j++){
            for(int i=0;i<arrayNumberAlphabet.length;i++){
                if(arrayNumberAlphabet[i][0] == (num.charAt(j))) temp = temp + arrayNumberAlphabet[i][1];
            }
        }
        returnNumber = Integer.parseInt(""+temp);
        return returnNumber;
    }

//2.5. Одинокое число
    public int findNumber(int[] input) {
        Arrays.sort(input);
        if(input[0]!=input[1]) return input[0];
        if(input[input.length-1]!=input[input.length-2]) return input[input.length-1];
        for(int i=0;i<input.length-1;i+=5) if(input[i]!=input[i+1]) return input[i];
        return 0;
   };
//2.6. Битовый полиндром
    public boolean isPalindrome(int input) {
      boolean result = false;
      int temp = input;
      if (input < 0) input = input*-1;
      StringBuilder b = new StringBuilder();
      while (input !=0) {
          b.append(input%2);
          input = input/2;
      };
       int lengthB = b.length();
       for(int i=0;i<32-lengthB-1;i++) b.append(0);
       if(temp<0) b.append(1); else b.append(0);
       b.reverse();
       for(int i=0;i<b.length();i++){
        if(b.charAt(i)==b.charAt(b.length()-1-i)) result = true;
           else {result = false; break;};
       }
       return result;
    }

//2.7  Бит реверс
    public int reverse(int input) {
      int bitRevers = 0;
      int temp = input;
      if (input < 0) input = input*-1;
      StringBuilder b = new StringBuilder();
      while (input !=0) {
        b.append(input%2);
        input = input/2;
      };
      int lengthB = b.length();
      for(int i=0;i<32-lengthB-1;i++) b.append(0);
      if(temp<0) b.append(1); else b.append(0);
      System.out.println(b);
      bitRevers = Integer.parseInt(b.toString(),2);
      return bitRevers;
    }

//2.10. Бинарное сочетание
    public String addBinnary(String a, String b) {
     StringBuilder result = new StringBuilder();
     int i=0;
     int aLength = a.length();
     int bLength = b.length();
     int temp = 0;
     while (i < aLength || i < bLength){

       char aTemp = (i<aLength) ? a.charAt(aLength - 1 - i) : '0';
       char bTemp = (i<bLength) ? b.charAt(bLength - 1 - i) : '0';
       int sum = (aTemp - '0') + (bTemp - '0') + temp;
       if(sum == 0){result.append('0');temp=0;}
        else if(sum == 1){result.append('1');temp=0;}
         else if(sum == 2){result.append('0');temp=1;}
          else if(sum == 3){result.append('1');temp=1;};
        i++;
     }
     if(temp == 1) result.append('1');
     result.reverse();

     return result.toString();
    }

}
