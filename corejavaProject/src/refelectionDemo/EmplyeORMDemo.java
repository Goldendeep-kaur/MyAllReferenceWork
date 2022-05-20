package refelectionDemo;

import java.lang.reflect.Field;

public class EmplyeORMDemo {

	public static void main(String[] args) {
		EmployeeDemo emp= new EmployeeDemo("Gold",101,4500);
		String tableName=null;
		String columnName1=null;
		String columnName2=null;
		String columnName3=null;
		
		String value1=null;
		int value2=0;
		int value3=0;
		String query="INSERT INTO"+tableName+"("+columnName1+","+columnName2+","+columnName3+")VALUES('"+value1+"',"+value2+","+value3+")";
		
		Class empClass=emp.getClass();
		Field[] allEmpFields=empClass.getDeclaredFields();
		for(Field eachField:allEmpFields) {
		eachField.setAccessible(true);
		System.out.println(eachField.getName());
		if(eachField.getAnnotation(MyColumn.class)!=null) {
		
				try {
					System.out.println(eachField.get(emp));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		}
		System.out.println("-----------------------------------");
	}

	}
}
