package seleniumwebdriver.basic;


	import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataProvider1 {

	    @DataProvider(name = "loginData")
	    public Object[][] loginData() {
	        return new Object[][] {
	            {"user1", "pass1"},
	            {"user2", "pass2"},
	            {"user3", "pass3"}
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) {
	       	   
	    	System.out.println(username+" "+password);
	    }
	}


