public class Function {

//Буквені числа
    public int convert(String num) {
        int returnNumber=0;
        String temp = "";
        char[][] arrayNumberAlphabet = {{'a','0'},
                {'b','1'}, {'c','2'}, {'d','3'}, {'e','4'},{'f','5'},
                {'g','6'}, {'h','7'}, {'i','8'}, {'j','9'}};
        for(int j=0;j<num.length();j++){
            for(int i=0;i<arrayNumberAlphabet.length;i++){
                if(arrayNumberAlphabet[i][0] == (num.charAt(j))) temp = temp + arrayNumberAlphabet[i][1];
            }
        }
        returnNumber = Integer.parseInt(""+temp);
        return returnNumber;
    }

//Алфавіт
    public boolean checkAlphabet(String input) {
      boolean check = true;

      return check;
    }

//Їжа для гномів
    public int[] find(int[] gnames, int[] portions) {
        int[] findGnom = new int[gnames.length];
        int tempGnames = 0;
        int tempPortion = 0;
        int[] arrayIndexOfGnames = new int[gnames.length];
        int[] arrayIndexOfPortions = new int[portions.length];
        for(int i=0;i<gnames.length;i++){
          for(int ii=0;ii<arrayIndexOfGnames.length;ii++) if(tempGnames<gnames[i]&&i==arrayIndexOfGnames[ii]){arrayIndexOfGnames[ii]=i;tempGnames=gnames[i];};
          for(int j=0;j< portions.length;j++){
              for(int ii=0;ii<arrayIndexOfPortions.length;ii++) if(tempPortion<portions[j]&&j!=arrayIndexOfPortions[ii]){arrayIndexOfPortions[ii]=j;tempPortion=portions[j];};
          }
        }
        for(int i =0;i<arrayIndexOfGnames.length;i++) findGnom[i] = arrayIndexOfGnames[i];
        return findGnom;
    }

}
