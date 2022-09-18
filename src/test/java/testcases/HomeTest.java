package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class HomeTest extends BaseClass {

	@Test
	public void Test1(Method method) {
		
		test = report.startTest(method.getName());
		System.out.println("Inside Home Test");
	}
	
}
