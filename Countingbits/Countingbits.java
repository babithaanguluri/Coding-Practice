import java.io.*;
import java.util.*;
class Countingbits
{
    static int Countingbits(int item)
    {
        if(item==0){
            return 1;
        }
        else{
            return (int)(Math.log(item)/Math.log(2)+1);
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);
        int count=0;
        String strNums = s.nextLine();
        String[] tokens = strNums.split("");
        int[] ary = new int[tokens.length];
        int i=0;
        for(i=0;i<tokens.length;i++){
            ary[i]=Integer.parseInt(tokens[i]);
        }
        for(i=0;i<ary.length;i++)
        {
            count+=Countingbits(ary[i]);
        }
        System.out.println(count);
    }
}