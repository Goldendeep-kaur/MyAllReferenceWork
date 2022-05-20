package practiceString;

public class BasicStringDemo {

	public static void main(String[] args) {
		String s1="hello";
		String s2="World";
		String s3=new String(s1);
		String s="Hello java programmers!";
/*		String sa[]=s.split("");
		for(String v:sa)
			System.out.println(v);
		int index= s.lastIndexOf('o');
		//System.out.println("print string here:"+s1);
		String s4= s3+"Welcome";
		String s11=s1.toUpperCase();
		String s12=s2.toLowerCase();
		System.out.println("print string here:"+s11);
		System.out.println("print string here:"+s12);
		System.out.println("print string here:"+s11==s12);
		System.out.println("print string here:"+s3.length());
	System.out.println("print string here:"+s4);
		System.out.println("print string here:"+index);
		
	System.out.println("-----------");
	int n= 7;
	String str= Integer.toString(n);
	System.out.println(str);
	byte [] b_arr= {71,101,101,107,115};
		String st= new String(b_arr);
		System.out.println("array="+st);
		
	*/
		StringBuilder sb= new StringBuilder("Goldendeep");
		int mylength= sb.length();
		System.out.println("length:"+mylength);
		int cha="Goldendeep".charAt(4);
		System.out.println(cha);
	}

}
