import java.io.*;
import java.util.*;
class angry
{
public static int[] csort(int c[])
{
int max=0;
int ans[]=new int[c.length];
for(int i=0;i<c.length;i++)
{
if(max<c[i])
max=c[i];
}
int z1[]=new int[max+1];
for(int i=0;i<c.length;i++)
{
z1[c[i]]+=1;

}
for(int i=0;i<z1.length-1;i++)
{
z1[i+1]=z1[i]+z1[i+1];
}
for(int i=c.length-1;i>=0;i--)
{
ans[z1[c[i]]-1]=c[i];
z1[c[i]]-=1;
}

return ans;
}

public static void main(String args[]) throws Exception
{
int min=10000000;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int k=Integer.parseInt(br.readLine());
int in[]=new int[n];
int l=k-1;
for(int i=0;i<n;i++)
in[i]=Integer.parseInt(br.readLine());
in=csort(in);
for(int i=0;i<in.length;)
{
if(min>(in[l]-in[i]))
min=in[l]-in[i];
i+=1;
l+=1;
if(l>=in.length)
break;
}
System.out.println(min);
}

}
