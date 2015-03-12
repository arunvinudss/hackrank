import java.io.*;
import java.util.*;
class Stack<T> 
{
private LinkedList<T> x1=new LinkedList<T>();
public boolean isEmpty()
{
if(x1.size()==0)
return true;
else
return false;

}
public int size()
{
return x1.size();
}
public void push(T e)
{
x1.addFirst(e);

}
public T pop()
{

return x1.remove();

}

public T top()
{

return x1.peek();

}
}
class sticks
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
Set<Integer> ans=new HashSet<Integer>();
Stack<Integer> s1=new Stack<Integer>();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int in[]=new int[n];
int min=10000000;
int j=1;
StringTokenizer st=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++)
in[i]=Integer.parseInt(st.nextToken());
in=csort(in);
for(int i=0;i<in.length;i++)
{
for(int j=0;j<in.length;j++)
{
if(j!=i)
{
if(in[j]

}


}


}
}
}
