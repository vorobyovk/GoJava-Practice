public class Chapter2 {
    public static void main(String[] args){
        Function function = new Function();
//Буквені числа
        String numberString="bjij";
        int number = function.convert(numberString);
        System.out.println(number);

//Їжа для гномів
        int[] gnames = {1,3,7,4,9};
        int[] portion = {3,7,1,9,5};
        int[] findGnom = function.find(gnames,portion);
        for(int i=0;i<findGnom.length;i++) System.out.println(findGnom[i]);
    }


}
