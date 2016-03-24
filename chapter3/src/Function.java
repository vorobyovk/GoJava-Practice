import java.util.Arrays;
import java.util.LinkedList;

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
        LinkedList<String> path = new LinkedList<>();
        StringBuilder wordBuffer = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char letter = input.charAt(i);
            if(letter == '/'){
                String word = wordBuffer.toString();
                if("..".equals(word)){
                    if(!path.isEmpty()){
                        path.pop();
                    }
                } else if(word.length() == 0 || ".".equals(word)){

                } else {
                    path.push(word);
                }
                wordBuffer = new StringBuilder();
            } else {
                wordBuffer.append(letter);
            }
        }
        String word = wordBuffer.toString();
        if(word.length()>0&&!".".equals(word)&&!"..".equals(word)){

            path.push(word);
        }

        StringBuilder result = new StringBuilder();

        while(!path.isEmpty()){
            String fileName = path.removeLast();
            result.append("/");
            result.append(fileName);
        }

        if(result.length() == 0){
            result.append("/");
        }

        return result.toString();
    }

//3.3. Самый долгий период стабильности



}
