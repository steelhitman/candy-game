import java.io.*;
class run_it_4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        int T=Integer.parseInt(br.readLine());
        int mat[]=new int[T];
        int x=0;
        for(int i=1;i<=T;i++)
        {
            int n=Integer.parseInt(br.readLine());
            int jar[]=new int[n+1];
            int a=1;
            for(int j=0;j<n;j++)
            {
                jar[j]=0;
            }
            for(int j=0;j<n-1;j++)
            {
                for(int k=1;k<n;k++)
                {
                    if(k%a==0)
                    {
                        if(jar[k]==0)
                        {
                            jar[k]=1;
                        }
                        else
                        {
                            jar[k]=0;
                        }
                    }
                }
                a=a+1;
            }
            int sum=0;
            for(int k=0;k<n;k++)
            {
                if(jar[k]==1)
                sum=sum+1;
            }
            mat[x]=sum;
            sum=0;
            x=x+1;
        }
        for(int m=0;m<x;m++)
        {
            System.out.println(mat[m]);
        }
    }
}