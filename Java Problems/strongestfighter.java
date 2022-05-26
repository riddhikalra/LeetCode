package linkedlistandqueue;
import java.util.*;
public class strongestfighter
{
	
	    public static void main(String args[]) {
	     Scanner s =new Scanner(System.in);
	     int n=s.nextInt();
	     int[] nums=new int [n];
	     for(int i=0;i<n;i++)
	      {
	        nums[i]=s.nextInt();
	      }
	     int k=s.nextInt();
	     Deque<Integer> d=new ArrayDeque<>();
	     int i;
	     for(i=0;i<k;i++)
	      {
	        while(!d.isEmpty()&&nums[d.getLast()]<=nums[i]){
	        d.removeLast();
	      }
	     d.addLast(i);
	    }
	     for(;i<n;i++)
	     {
	       System.out.print(nums[d.getFirst()]+" ");
	       while(!d.isEmpty()&&d.getFirst()<=i-k){
	       d.removeFirst();
	     }
	     while(!d.isEmpty()&&nums[d.getLast()]<=nums[i])
	     {
	       d.removeLast();
	     }
	    d.addLast(i);
	   }
	   System.out.println(nums[d.getFirst()]);
   }
}

