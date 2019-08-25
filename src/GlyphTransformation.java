import java.util.HashMap;

public class GlyphTransformation {

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        int position = 0;
        StringBuilder sb = new StringBuilder();
        int[] reference = new int[numRows];
        boolean order = true;

        for(int i=0; i<reference.length; i++){
            reference[i] = -1;
        }

        while (position < s.length()){
            if(order){
                for(int i=0; i<numRows-1 && position<s.length(); i++){
                    int currentPosition = changeReference(reference,i);
                    sb.insert(currentPosition, s.charAt(position));
                    position++;
                }

                order = false;
            }else {
                for(int i=numRows-1; i>0 && position<s.length(); i--){
                    int currentPosition = changeReference(reference,i);
                    sb.insert(currentPosition, s.charAt(position));
                    position++;
                }

                order = true;
            }
        }

        return sb.toString();
    }


    public int changeReference(int[] reference, int row){
        reference[row]++;

        for(int i=row+1; i<reference.length; i++){
            reference[i]++;
        }

        return reference[row];
    }

    public static void main(String[] args) {
        GlyphTransformation glyphTransformation = new GlyphTransformation();
        System.out.println(glyphTransformation.convert("ABCDE", 2));

    }

}
