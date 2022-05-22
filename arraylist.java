
import java.util.*;
public class arraylist {
	
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int curr=0;
        for(int i=1;i<=n;i++)
        {
            if(curr<target.length)
            {
                if(target[curr]==i)
                {
                    ans.add("Push");
                    curr++;
                }
                else{
                    ans.add("Push");
                    ans.add("Pop");
                }
            }
            else
            {
                return ans;
            }
        }
        return ans;
        
    }
}
