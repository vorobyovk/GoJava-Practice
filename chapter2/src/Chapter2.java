public class Chapter2 {
    public static void main(String[] args){
        Function function = new Function();

//2.1. Сумирование по основе 36
    String aSum36 = "9";
    String bSum36 = "1";
    String result36 = function.add36(aSum36,bSum36);
    System.out.println("2.1 Summ 36: "+result36);

//2.2. Положительное среднее арифметическое
        int a = 83648;
        int b = 2;
        int seredneArifmetichne = function.averageP(a,b);
        System.out.println("2.2 Положительное среднее арифметическое равно: "+seredneArifmetichne);


//2.3. Среднее арифметическое
        a = -2147;
        b = -2;
        seredneArifmetichne = function.average(a,b);
        System.out.println("2.3 Среднее арифметическое равно: "+seredneArifmetichne);

//2.4. Буквенные числа
        String numberString="bjij";
        int number = function.convert(numberString);
        System.out.println("2.4 Переведенное число равно: "+number);

//2.5. Одинокое число
    int[] inputInt2 = {0,0,0,8,0,0};
    int[] inputInt3 = {7, 7, 7, 3, 7, 7, 5, 5, 5, 5, 5};
    int findNum = function.findNumber(inputInt3);
    System.out.println("2.5 Одинокое число равно: "+findNum);

//2.6. Битовый полиндром
    int polindrome = 98304;
    boolean resultPolindrome = function.isPalindrome(polindrome);
    System.out.println("2.6 Polindrome is: "+resultPolindrome);

//2.7  Бит реверс
    int bitRevers = 2;
    int reversedBit = function.reverse(bitRevers);
    System.out.println("2.7 Reversed is: "+reversedBit);

//2.10. Бинарное сочетание
    String aa = "101";
    String bb = "100";
    String addBinnary = function.addBinnary(aa,bb);
    System.out.println("2.10 Adding binarry : "+addBinnary);




    }

}
