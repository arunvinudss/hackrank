import java.io.*;
import java.util.*;
import java.math.*;
class fjar
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st=new StringTokenizer(br.readLine());
int n=Integer.parseInt(st.nextToken());
int k=Integer.parseInt(st.nextToken());
BigDecimal c=BigDecimal.ZERO;
for(int i=0;i<k;i++)
{
st=new StringTokenizer(br.readLine());
long x1=Long.parseLong(st.nextToken());
long x2=Long.parseLong(st.nextToken());
long x3=Long.parseLong(st.nextToken());
c=c.add(new BigDecimal((x2-x1+1)*x3));
}
System.out.println(c.divide(new BigDecimal(n)).setScale(0,RoundingMode.FLOOR));
}
}

