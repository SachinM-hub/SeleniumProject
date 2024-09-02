package SAMPLE1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SAMPLE {

@Test
public void createUser() {
	System.out.println("user created!!");
}

//@Test(enabled = false)
//@Test(invocationCount = 0)
@Test
public void modifyUser() {
	System.out.println("user modified");
}
//@Ignore
@Test
public void deleteUser() {
	System.out.println("user deleted");
}
}