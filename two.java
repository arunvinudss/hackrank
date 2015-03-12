import java.io.*;
import java.util.*;
class two
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int j=0;j<t;j++)
{
boolean flag=false;
Set<String> m1=new HashSet<String>();
String s[]=br.readLine().split("");
String s1[]=br.readLine().split("");
for(int i=0;i<s.length;i++)
m1.add(s[i]);
for(int i=0;i<s1.length;i++)
{
if(m1.contains(s1[i]))
{
flag=true;
break;
}
}
if(flag)
System.out.println("YES");
else
System.out.println("NO");
}
}
}
