public class MainClass {

    public static void main(String[] args){
     int number = 142;

     int sum = 0;
     int maxNum=-1000000;
     Function functions = new Function();
     sum = functions.SumNumber(number);
     System.out.println(sum);
     int[] input = {-2147483648,1,2,3,6,-10};
     maxNum=functions.MaxNumberInArray(input);
     System.out.println(maxNum);

    }


}
