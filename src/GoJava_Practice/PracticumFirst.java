package GoJava_Practice;

public class PracticumFirst {



    public int join(char[] input) {
     String inputString="";
     for(int i=0;i<input.length;i++){inputString=inputString+input[i];};
     int charToInt=0;
     for(int i=0;i<inputString.length();i++){
       charToInt=Integer.parseInt(""+inputString.charAt(i));
     }
     //inputString=String.valueOf(input);
     return  charToInt;
    }

}
