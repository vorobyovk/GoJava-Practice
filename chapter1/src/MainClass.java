public class MainClass {

    public static void main(String[] args){
     Function functions = new Function();
//1.1 Слияние цифр
    char[] arrayNumber={'1','4','7'};
    int numberOfArrayNumber = functions.join(arrayNumber);
    System.out.println("Функция слияния цифр из массива выдаёт число: "+numberOfArrayNumber);

//1.2 Сумма цифр
     int number = 142;
     int sum = 0;
     sum = functions.SumNumber(number);
     System.out.println("Сумма цифр в числе:"+number+" равна: "+sum);

//1.4 Максимальне Число
     int maxNum=-2147483648;
     int[] input = {-2147483648,1,2,3,6,-10};
     maxNum=functions.MaxNumberInArray(input);
     System.out.println("Максимальное число в массиве равно: "+maxNum);

//1.3 Первое непарное числ
     int indexNum = functions.firstNeparnoe(input);
     System.out.println("Первое непарное число в массиве равно: "+indexNum);

//1.5 Обход матрицы змейкой
     int [][] inputArray = { {1,3,5},
             {-1,6,124},
             {424,67,-23}
     };
     int[] zmeykaArray = functions.arrayZmeyka(inputArray);
     System.out.println("В резульаье обхода двумерного массива змейкой, получен одномерный массив: ");
     for(int i=0;i<zmeykaArray.length;i++)System.out.print(zmeykaArray[i]+", ");

//1.6 Обход матрицы по спирале
     int [][] inputArraySpiral = { {1,3,5,-56,2},
             {-1,6,124,-5,7},
             {424,67,-23,10,121},
             {44,6,3,11,21},
             {22,17,23,14,712}
     };
     int[][] testArray = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
     int[][] testArray2 = {{1,2},{3,4}};
     int[][] testArray3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
     int[] spiralArray = functions.Spiral(testArray);
     System.out.println("В резульаье обхода двумерного массива по спирали, получен одномерный массив: ");
     for(int i=0;i<spiralArray.length;i++)System.out.print(spiralArray[i]+", ");



    };



}
