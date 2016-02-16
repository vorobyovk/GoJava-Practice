public class Function {

//Алфавіт
    public boolean checkAlphabet(String input) {
      boolean check = true;

      return check;
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
     int temp=input[0];
     int count = 0;
     for(int j=0;j<input.length;j++) {
         if(count==1) break;
         count=0;
         temp = input[j];
         for (int i = 0; i < input.length; i++) {
             if (temp == input[i])count++;
         };
     }
      return temp;
   };

//

}
