import java.io.*;
import java.util.*;
class fib
{
public static HashSet<Long> fib()
{
HashSet<Long> xx=new HashSet<Long>();
long x[]=new long[60];
x[0]=0;
x[1]=1;
x[2]=1;
xx.add((long) 0);
xx.add((long) 1);
for(int i=3;i<60;i++)
{
x[i]=x[i-1]+x[i-2];
xx.add(x[i]);}
return xx;
}
public static void main(String args[]) throws Exception
{
HashSet<Long> hh=fib();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
if(hh.contains(Long.parseLong(br.readLine())))
System.out.println("IsFibo");
else
System.out.println("IsNotFibo");
}

}
}
