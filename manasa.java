import java.io.*;
import java.util.*;
class manasa
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
int st=0,temp=0;
Set<Integer> s1=new TreeSet<Integer>();
int n=Integer.parseInt(br.readLine());
int c1=Integer.parseInt(br.readLine());
int c2=Integer.parseInt(br.readLine());
if(c1>c2)
{
temp=c1;
c1=c2;
c2=temp;
}
int diff=c2-c1;
int max=c2*(n-1);
s1.add(max);
for(int j=0;j<n-1;j++)
{
max=max-diff;
s1.add(max);
}
for(int d:s1)
System.out.print(d+" ");



System.out.println();
}


}
}
