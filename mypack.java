import java.util.*;
import java.io.*;
public class throws1
{
	void show(String a)
	{
		int x=Integer.parseInt(a);
	}
	public static void main(String[] args) 
	{
		throws1 tt=new throws();
		try
		{
			tt.show("Apple");
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}