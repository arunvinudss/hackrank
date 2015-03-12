import java.io.*;
import java.util.*;
class acm1
{
public static void main(String args[]) throws Exception
{
Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int t=Integer.parseInt(st.nextToken());
String s1[]=new String[n];
for(int i=0;i<n;i++)
s1[i]=br.readLine();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
int c=0;
if(i!=j)
{
for(int k=0;k<t;k++)
{
if(s1[i].charAt(k)=='1' || s1[j].charAt(k)=='1')
c++;
}
if(m1.get(c)!=null)
m1.put(c,m1.get(c)+1);
else
m1.put(c,1);
}
}
}
for(int i=t;i>=0;i--)
{
if(m1.get(i)!=null)
{
System.out.println(i);
if(m1.get(i)==1)
System.out.println(m1.get(i));
else
System.out.println(m1.get(i)/2);
break;
}
}
}
}
