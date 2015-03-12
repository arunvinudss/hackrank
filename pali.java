import java.io.*;
import java.util.*;
class pali
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
String s=br.readLine();
int c=0;
int z=s.length()-1;
for(int j=0;j<(s.length()/2);j++)
{
if(s.charAt(z)!=s.charAt(j))
{
if(s.charAt(z)<s.charAt(j))
c+=((int)s.charAt(j)-(int)s.charAt(z));
else
c+=((int)s.charAt(z)-(int)s.charAt(j));
}
z--;
}

System.out.println(c);


}

}

}
