
public class pattern_180{

public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++)
    {
        //for spaces
        for(int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        //for stars
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    
} 
    
}