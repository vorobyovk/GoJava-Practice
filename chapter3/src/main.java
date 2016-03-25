public class main {

    public static void main(String[] args){
      Function function = new Function();


//3.1. Еда для гномов
     int[] dwarf = {4, 1, 3, 2}; //{5,7,6,9,4};
     int[] portion = {2, 1, 3, 4};//{8,5,6,2,3};
     int[] distribution = function.findDwarf(dwarf,portion);
     System.out.println("3.1 Distribution portion of gnome.");
     for(int i=0;i<distribution.length;i++) System.out.print(" "+distribution[i]+",");

//3.2. Unix Путь
    String path = "/var//lib";
    String simplyPath = function.simplify(path);
    System.out.println();
    System.out.println("3.2 Simply path is: "+simplyPath);

//3.3. Самый долгий период стабильности
    int[] period  = {1,3,5,4,5,6,1,7,3,4};
    int[] period2  = {900, 900, 900, 901, 902, 902, 903, 903};
    int[] period3  = {900, 901, 902};
    int[] period4  = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901};
    int longest = function.count(period4);
    System.out.println("3.3 Longest stability period: "+longest);



    }

}
