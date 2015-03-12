import java.io.*;
import java.util.*;
class alter
{
public static void main(String args[]) throws Exception
{
int c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pr=new PrintWriter(System.out);
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
String s=br.readLine();
for(int j=0;j<s.length()-1;j++)
{
if(s.charAt(j)==s.charAt(j+1))
c++;

}

System.out.println(c);
c=0;
}

}
}
