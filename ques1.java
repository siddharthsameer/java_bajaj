package test1c;

public class ques1 
{

	public static void main(String[] args) 
	{
		// shift operators
		 int a=1;
		 int b=2;
		 System.out.println(b<<a);
		 System.out.println(b>>a);
		 //System.out.println(b<<<a); identical to <<
		 System.out.println(b>>>a);
		 
		 // relational operators
		 System.out.println((5==5)?"yes":"no");
		 System.out.println((5!=5)?"yes":"no");
		 System.out.println((4<5)?"yes":"no");
		 System.out.println((5>2)?"yes":"no");
		 System.out.println((5<=5)?"yes":"no");
		 System.out.println((5>=4)?"yes":"no");
		 
		 // bitwise operators
		 int c=1;
		 int d=0;
		 
		 System.out.println(c&d); //and
		 System.out.println(c^d); // exor
		 System.out.println(c|d); // inclu. or
		 System.out.println(~c);  //compliment

	}

}
