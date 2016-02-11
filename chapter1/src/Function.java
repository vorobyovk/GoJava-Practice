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
     for(int i=0;i<input.length;i++){
         if(input[i]%2!=0) return i;
     }
     return -1;
 };

 public int[] arrayZmeyka(int[][] input){
  int number = input.length*input[1].length;
  int[] returnArray= new int[number];
  number=-1;
  for(int i=0;i<input.length;i++){

    for(int j=0;j<input[i].length;j++){
      number++;
      returnArray[number]=input[i][j];
    }
  };
  return returnArray;
 }

}
