import java.io.*;
import java.util.*;
class cavity
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
String s[][]=new String[t][t];
String m[][]=new String[t][t];
for(int i=0;i<t;i++)
{
String t1=br.readLine();
String t2[]=t1.split("");
for(int j=0;j<t;j++)
{
s[i][j]=t2[j];
}
}

for(int i=1;i<t-1;i++)
{
for(int j=1;j<t-1;j++)
{
if(Integer.parseInt(s[i][j])>Integer.parseInt(s[i-1][j]) && Integer.parseInt(s[i][j])>Integer.parseInt(s[i][j-1]) && Integer.parseInt(s[i][j])>Integer.parseInt(s[i][j+1]) && Integer.parseInt(s[i][j])>Integer.parseInt(s[i+1][j]))
m[i][j]="X";
}
}
for(int i=0;i<t;i++)
{
for(int j=0;j<t;j++)
{
if(m[i][j]!=null && m[i][j].equals("X"))
System.out.print("X");
else
System.out.print(s[i][j]);
}
System.out.println();
}
}
}
