import java.io.*;
import java.util.*;
class chofe
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int c=Integer.parseInt(st.nextToken());
int w=Integer.parseInt(st.nextToken());
int ans=(int) Math.floor((double) n/c);
int w1=w<ans?ans%w:0;
int rem=0;
int rem=(int) Math.floor((double) ((double) ans/w1)+((double) ans%w1))/w; 
System.out.println(ans+rem+(int) Math.floor((double) ans/w));
}
}
}
