public class main {

    public static void main(String[] args){
      Function function = new Function();


//3.1. Еда для гномов
     int[] dwarf = {5,7,6,9,4};
     int[] portion = {5,7,6,9,4};
     int[] distribution = function.findDwarf(dwarf,portion);
     for(int i=0;i<distribution.length;i++) System.out.print(" "+distribution[i]+",");


    }

}
