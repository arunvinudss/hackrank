import java.io.*;
import java.util.*;
class utopi
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
int x=Integer.parseInt(br.readLine());
int c=1;
for(int j=1;j<=x;j++)
{
if(j%2==1)
c*=2;
else
c+=1;
}
System.out.println(c);
}
}
}
