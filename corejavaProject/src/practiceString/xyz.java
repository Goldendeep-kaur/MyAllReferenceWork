	package practiceString;

public class xyz {
public static void main(String[] args) {
	String A="hello";
	String B="java";
	int x= A.length();
	int y=B.length();
	int z= x+y;
	System.out.println("length="+z);
	int compare = A.compareTo(B);  
	if (compare < 0) {  
	    System.out.println("No");
	}else if(compare>0) {
	    System.out.println("Yes");
	}
	else{
	    System.out.println("No");
	}
	String C = A.substring(0, 1).toUpperCase() + A.substring(1);
	String D = B.substring(0, 1).toUpperCase() + B.substring(1);
	System.out.println(C+" "+D);
	    }


}

