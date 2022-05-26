public class  butterfly {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //upper first
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //upper second
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            //lower first
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //lower second
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
