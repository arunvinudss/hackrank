import java.io.*;
import java.util.*;
class dynsum
{
public static long[] calsum(int x[])
{
long y[]=new long[x.length];
y[0]=x[0];
for(int i=1;i<x.length;i++)
{
y[i]=y[i-1]+(long) x[i];
}
return y;

}
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
boolean flag=false;
int n=Integer.parseInt(br.readLine());
int in[]=new int[n];
long in1[]=new long[in.length];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int j=0;j<n;j++)
in[j]=Integer.parseInt(st.nextToken());
if(in.length==1)
System.out.println("YES");
else{
in1=calsum(in);
for(int j=1;j<=in.length-1;j++)
{
if(in1[j-1]==(in1[in.length-1]-in1[j]))
{
System.out.println("YES");
flag=true;
break;
}
}
if(!flag)
System.out.println("NO");
}
}

}

}
