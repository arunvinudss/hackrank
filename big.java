import java.io.*;
import java.util.*;
class big
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int j=0;j<t;j++)
{
boolean flag=false;
String s=br.readLine();
for(int i=s.length()-1;i>0;i--)
{
if(s.charAt(i)>s.charAt(i-1))
{
System.out.print(s.substring(0,i-1)+""+s.charAt(i)+s.charAt(i-1));
if((s.length()-1-i)>0)
System.out.print(s.substring(i+1,s.length()));
flag=true;
break;
}
}
if(!flag)
{
System.out.println("no answer");
}
}

}}
