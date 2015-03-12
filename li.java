import java.io.*;
import java.util.*;
class li
{
public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
br.readLine();
StringTokenizer st=new StringTokenizer(br.readLine());
while(st.hasMoreTokens())
{
int t=Integer.parseInt(st.nextToken());
if(m1.get(t)!=null)
m1.put(t,m1.get(t)+1);
else
m1.put(t,1);
}

for(Map.Entry<Integer,Integer> e1:m1.entrySet())
{
if(e1.getValue()==1)
{
System.out.println(e1.getKey());
break;
}
}

}
}
