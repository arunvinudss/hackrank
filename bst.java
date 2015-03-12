import java.io.*;
import java.util.*;
class bs1
{
private Node root;

private static class Node
{
int data;
Node left;
Node right;
Node(int d)
{
data=d;
left=null;
right=null;
}
}

public void insert(int d,boolean flag)
{

insert(root,d);

}

private void insert(Node x,int y,boolean flag)
{
if(flag)
{
if(x.left!=null)
insert(x.left,y,flag);
else
{
Node temp=new Node(y);
x.left=temp;
}
}
else
{
if(x.right!=null)
insert(x.right,y,flag);
else
{
Node temp=new Node(y);
x.right=temp;
}
}
}
public void swap(int h)
{
swap(root,int h,1);

}

private swap(Node x,int h,int c)
{
if(c!=h)
{



}


}
private Node getRight(Node x,int h,int c)
{
Node temp;
if(c!=h && x.left!=null)
getRight(x,h,c++);
else if(x.left==null)
{
Node t1=null;
return t1;
}
else
{
temp=x.right;
x.right=x.left;
x.left=temp;
return x;
}
return x;
}

private Node getLeft(Node x,int h,int c)
{
Node temp;
if(c!=h && x.left!=null)
getLeft(x,h,c++);
else if(x.left==null)
{
Node t1=null;
return t1;
}
else
{
temp=x.right;
x.right=x.left;
x.left=temp;
return x;
}
return x;
}

}
