import java.io.*;
import java.util.*;
class pangram
{
public static void main(String args[]) throws Exception
{
boolean flag=false;
HashSet<Character> h1=new HashSet<Character>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
s=s.replaceAll("\\s+","");
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
h1.add(s.charAt(i));
if(h1.size()>=26)
{
System.out.println("pangram");
flag=true;
break;
}


}
if(!flag)
System.out.println("not pangram");
}

}
