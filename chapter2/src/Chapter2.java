public class Chapter2 {
    public static void main(String[] args){
        Function function = new Function();

//2.1. Сумирование по основе 36



//2.2. Положительное среднее арифметическое
        int a = 83648;
        int b = 2;
        int seredneArifmetichne = function.averageP(a,b);
        System.out.println("Положительное среднее арифметическое равно: "+seredneArifmetichne);


//2.3. Среднее арифметическое
        a = -2147;
        b = -2;
        seredneArifmetichne = function.average(a,b);
        System.out.println("Среднее арифметическое равно: "+seredneArifmetichne);

//2.4. Буквенные числа
        String numberString="bjij";
        int number = function.convert(numberString);
        System.out.println("Переведенное число равно: "+number);

//2.5. Одинокое число
    int[] inputInt2 = {0,0,0,8,0,0};
    int[] inputInt3 = {7, 7, 7, 3, 7, 7, 5, 5, 5, 5, 5};
    int findNum = function.findNumber(inputInt3);
    System.out.println("Одинокое число равно: "+findNum);

//
    }


}
