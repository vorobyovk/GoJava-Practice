import java.util.Arrays;

public class Function {

 //3.1. Еда для гномов
    public int[] findDwarf(int[] gnames, int[] portions) {
        int[] distribution = new int[gnames.length];

        int[] tempName = new int[gnames.length];
        for(int i=0;i<gnames.length;i++) tempName[i]=gnames[i];
        Arrays.sort(tempName);
        int[] indexName = new int[gnames.length];
        for(int i=0;i<gnames.length;i++){
            for(int j = 0;j<tempName.length;j++) if(gnames[i]==tempName[j]) indexName[i] = gnames.length-(j+1);
        };

        int[] tempPortion = new int[portions.length];
        for(int i=0;i<portions.length;i++) tempPortion[i]=portions[i];
        Arrays.sort(tempPortion);
        int[] indexPortion = new int[portions.length];
        for(int i=0;i<portions.length;i++){
            for(int j = 0;j<tempPortion.length;j++) if(portions[i]==tempPortion[j]) indexPortion[i] = portions.length-(j+1);
        };

        for(int i=0;i<gnames.length;i++)
            for(int j =0;j<portions.length;j++) if(indexName[i]==indexPortion[j]) distribution[i] = j;

        return distribution;
    }

//3.2. Unix Путь
    public String simplify(String input) {

        return null;
    }

//3.3. Самый долгий период стабильности



}
