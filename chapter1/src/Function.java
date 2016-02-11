public class Function {

 public int SumNumber(int number){
    int sum =0;
    while (number !=0){
      sum += number % 10;
      number = number/10;
    };
    return Math.abs(sum);
 };

 public int MaxNumberInArray(int[] input){
  int maxNum=-2147483648;
  for(int i=0;i<input.length;i++){
   if(maxNum<input[i]) maxNum=input[i];
  };
  return maxNum;
 };

 public int firstNeparnoe(int[] input){
   int number=-1;
   for(int i=0;i<input.length;i++){
    if(input[i]/2)
   }
 };

}
