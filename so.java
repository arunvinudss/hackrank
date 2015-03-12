import java.io.*;
import java.util.*;
class so
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
StringTokenizer st=new StringTokenizer(br.readLine());
int x=Integer.parseInt(st.nextToken());
int y=Integer.parseInt(st.nextToken());
System.out.println(x+y);
}

}
}
