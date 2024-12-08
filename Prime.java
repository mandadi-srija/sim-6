import java.util.*;
public class Prime {
    public static void main(String[] args) {
        int n=100;
        List<Integer>ans = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            int c=0;
            for(int j=2;j<Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            ans.add(i);
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
