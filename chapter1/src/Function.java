public class Function {

 public int join(char[] input) {
   int joinInput=0;
   String inputString="";
   for(int i=0;i<input.length;i++)inputString=inputString+input[i];
   joinInput =Integer.parseInt(""+inputString);
   return joinInput;
 }

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
     int number = input.length*input[0].length;
     int[] returnArray= new int[number];
     number=-1;
     for(int j=0;j<input[0].length;j++){
        if(j%2==0){
         for(int i=0;i<input.length;i++){
           number++;
           returnArray[number]=input[i][j];}
        }else for(int i=input.length-1;i>=0;i--){
           number++;
           returnArray[number]=input[i][j];
        };
     }
     return returnArray;
 }

 public int[] Spiral(int[][] input) {
         int number = input.length*input[0].length;
         int[] arraySpiral= new int[number];
         int path=1; int round=0; int i=0; int key1=1; int key2=1;
         if(input[0].length>input.length){ key1 = 2; key2 = 1;};
             while (i<number){
                    if(path==1&&i<number){
                         for(int j=round;j<=input[0].length-1-round;j++){arraySpiral[i]=input[round][j];i++;};
                         path=2;
                        };
                    if(path==2&&i<number){
                          for(int j=round+1;j<=input.length-1-round;j++){arraySpiral[i]=input[j][input[0].length-1-round];i++;};
                          path=3;
                        };
                    if(path==3&&i<number){
                        for(int j = input[0].length-2-round; j>=0+round; j--){arraySpiral[i]=input[input.length-1-round][j];i++;};
                          path=4;
                        };
                    if(path==4&&i<number){
                          for(int j=input.length-2-round;j>=1+round;j--){arraySpiral[i]=input[j][round];i++;};
                          path=1;
                        };
                    round++;
                  }
              System.out.println();
              System.out.println("Количество кругов равно: "+round);
              return arraySpiral;
 }


}
