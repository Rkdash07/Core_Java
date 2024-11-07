package day5;

public class User_Password {

	public static void main(String[] args) {
		String user="admin";
		String password="password@123";
		String new_user="admin";
		String new_password="password@123";
		if(user.equals(new_user))
		{
			System.out.println("User Name is valid \n Continue with password");
			if(password.equals(new_password))
			{
				System.out.println("Password is Valid \n Please Proceed with next page>>");
			}
			else
			{
				System.out.println("Password is Invalid \n Please try again!!");
			}
		}
		else
		{
			System.out.println("User Name is Invalid \n Please try again!!");
		}
	}

}
