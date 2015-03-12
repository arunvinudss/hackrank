import java.io.*;
import java.util.*;
class taumbday
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++)
{
StringTokenizer st=new StringTokenizer(br.readLine());
long b=Long.parseLong(st.nextToken());
long w=Long.parseLong(st.nextToken());
st=new StringTokenizer(br.readLine());
long x=Long.parseLong(st.nextToken());
long y=Long.parseLong(st.nextToken());
long z=Long.parseLong(st.nextToken());
if((x+z)<y)
System.out.println(x*(b+w)+w*z);
else if((y+z)<x)
System.out.println(y*(b+w)+b*z);
else
System.out.println(x*b+y*w);
}
}
}
