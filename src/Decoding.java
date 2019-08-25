public class Decoding {
    public static int count = 0;


    public static void main(String[] args) {
        numDecodings("226");
    }

    //解码
    public static int numDecodings(String s) {
        int[] originalArray = new int[s.length()];
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            originalArray[i] = chars[i] -'0';
        }

        split(originalArray);

        System.out.println(count);
        return count;
    }


    public static void split(int[] originalArray){
        if(originalArray.length>0){
            /*处理最普通情况*/
            sp(1, originalArray);

            /*处理十位数的情况*/
            if(originalArray.length>1){
                int judgeNum = originalArray[0]*10 + originalArray[1];
                if(judgeNum <= 26){
                    sp(2, originalArray);
                }
            }
        }
    }


    public static void sp(int splitDigit, int[] originalArray){
        /*构造新的拆分后数组*/
        if(originalArray.length != splitDigit){
            int[] originalCopy = new int[originalArray.length-splitDigit];
            System.arraycopy(originalArray,splitDigit,originalCopy,0,originalArray.length-splitDigit);

            split(originalCopy);
        }else {
            count++;
        }
    }
}
