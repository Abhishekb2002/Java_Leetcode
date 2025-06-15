 import java.util.*;
public class DistingCountDublicate
{
public static void main(String[] args)
{
int a[]={10, 30, 40, 20, 10, 20, 50, 10};
TreeSet h= new TreeSet();
for(int i:a)
{
h.add(i);
}
int c=h.size();
System.out.println(c); }
}