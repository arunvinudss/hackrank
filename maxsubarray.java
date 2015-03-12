import java.io.*;
import java.util.*;
class maxsubarray
{
public static boolean check(long x1[])
{
for(int i=0;i<x1.length;i++)
{
if(x1[i]>0)
return false;

}
return true;

}
public static long maxconsub(long x1[],boolean flag)
{
long max_so_far=0;
long max_updated=0;
if(flag)
{
max_so_far=x1[0];
max_updated=max_so_far;
}
for(int i=0;i<x1.length;i++)
{

max_so_far+=x1[i];
if(!flag)
{
if(max_so_far<0)
max_so_far=0;
}
if(max_so_far>=max_updated)
max_updated=max_so_far;
}
return max_updated;
}

public static long maxsub(long x1[],boolean flag)
{

long max_so_far=0;
long max_updated=0;
if(flag)
{
max_so_far=x1[0];
max_updated=max_so_far;
}

for(int i=0;i<x1.length;i++)
{
if((max_so_far+x1[i])>max_so_far)
{
max_so_far+=x1[i];
max_updated=max_so_far;
}}
return max_updated;
}

public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long n=Long.parseLong(br.readLine());
for(int i=0;i<n;i++)
{
int x=Integer.parseInt(br.readLine());
long in[]=new long[x];
StringTokenizer st=new StringTokenizer(br.readLine());
for(int t=0;t<x;t++)
in[t]=Long.parseLong(st.nextToken());
System.out.print(maxconsub(in,check(in))+" "+maxsub(in,check(in)));
System.out.println();
}
}}
