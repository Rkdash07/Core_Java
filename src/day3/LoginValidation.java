package day3;

public class LoginValidation {

	public static void main(String[] args) {
	    
		String admin="rupesh";
		int password=1234;
		if(admin.equals(admin))
		{
			System.out.println("userid crt");
			if(password==1234)
			{
				System.out.println("password crt");
				System.out.println("Login Successful");
				
			}
			else
			{
				System.out.println("password not crt");
				System.out.println("unsuccessful");
				
			}
				
		}
		else
		{
			System.out.println("User id not crt");
			System.out.println("unsuccessful");
		}
	}

}
