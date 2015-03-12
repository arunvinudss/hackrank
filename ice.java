import java.io.*;
import java.util.*;
class ice
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

public static int bsearch(int x[],int l,int h,int ch,int k)
{
int mid=(l+h)/2;
if(l>h)
return -1;
else
if(x[mid]==k && mid!=ch)
return mid;
else
if(k>x[mid])
return bsearch(x,mid+1,h,ch,k);
else if(k<=x[mid])
return bsearch(x,l,mid-1,ch,k);
return -1;
}

public static void main(String args[]) throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
for(int i=0;i<t;i++)
{
Map<Integer,ArrayList<Integer>> m1=new HashMap<Integer,ArrayList<Integer>>();
int cost=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
StringTokenizer st=new StringTokenizer(br.readLine());
int in[]=new int[n];
for(int j=0;j<n;j++)
{
ArrayList<Integer> a1=new ArrayList<Integer>();
in[j]=Integer.parseInt(st.nextToken());
if(m1.get(in[j])!=null)
{
a1=m1.get(in[j]);
a1.add(j);
m1.put(in[j],a1);
}
else
{
a1.add(j);
m1.put(in[j],a1);
}
}
System.out.println(
int x2[]=csort(in);
for(int j=0;j<in.length;j++)
{
ArrayList<Integer> a1=new ArrayList<Integer>();
int xc=cost-in[j];
if(xc>0)
{
int yc=bsearch(x2,0,n-1,j,xc);
if(yc!=-1)
{
a1=m1.get(xc);
for(int xx:a1)
{
if(xx!=j)
{
System.out.println(j+" "+xx);
break;
}
}
break;
}
}
}
}
}
}
