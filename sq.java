import java.io.*;
import java.util.*;
class squ
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int m=Integer.parseInt(st.nextToken());
int a[]=new int[n];
int b[]=new int[m];
int c[]=new int[m];
st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++)
a[i]=Integer.parseInt(st.nextToken());
st=new StringTokenizer(br.readLine());
for(int i=0;i<m;i++)
b[i]=Integer.parseInt(st.nextToken());
st=new StringTokenizer(br.readLine());
for(int i=0;i<m;i++)
c[i]=Integer.parseInt(st.nextToken());
for(int j=0;i<n;i++)
a[i]=Integer.parseInt(st.nextToken());
for(int j=0;j<n;j++)
{
if(b[j]<n)
b[j]=1;
}









}
}
