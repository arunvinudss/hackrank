import java.io.*;
import java.util.*;
class xor
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pr=new PrintWriter(System.out);
int l=Integer.parseInt(br.readLine());
int r=Integer.parseInt(br.readLine());
int max=0;
for(int i=l;i<=r;i++)
{
for(int j=l;j<=r;j++)
{
int z=i^j;
if(z>max)
max=z;
}
}
System.out.println(max);
}
}
