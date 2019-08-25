import java.util.Collections;
import java.util.LinkedList;

public class IntegerInversion {

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if(x < 0){
            sb.append('-');
            x = Math.abs(x);
        }

        String s = x+"";
        boolean isStart0 = true;
        for(int i=s.length()-1; i>=0; i--){
            if(isStart0){
                if(Integer.valueOf(s.charAt(i)) == 0){
                    continue;
                }else {
                    isStart0 = false;
                }
            }

            sb.append(s.charAt(i));
        }

        int result;
        try{
            result = Integer.valueOf(sb.toString());
        }catch (Exception e){
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1465749879));
    }
}
