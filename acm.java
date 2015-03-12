import java.io.*;
import java.util.*;
class fjar
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int k=Integer.parseInt(st.nextToken());
int c=0;
for(int i=0;i<k;i++)
{
st=new StringTokenizer(br.readLine());
int x1=Integer.parseInt(st.nextToken());
int x2=Integer.parseInt(st.nextToken());
int x3=Integer.parseInt(st.nextToken());
c+=(x2-x1+1)*x3;
}
System.out.println((int) Math.floor((double) c/n));
}
}

