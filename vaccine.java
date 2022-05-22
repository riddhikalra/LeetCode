package savepatient;

import java.util.*;
public class vaccine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] pat=new int[n];
		int[] vacc=new int[n];
		int i,j;
		for(i=0;i<=n;i++)
		{
			vacc[i]=sc.nextInt();
		}
		for(j=0;j<=n;j++)
		{
			pat[j]=sc.nextInt();
			
		}
		sc.close();
		if(vacc[i] > pat[j])
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
