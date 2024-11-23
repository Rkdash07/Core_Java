package day18;
 class InvalidPasswordException extends RuntimeException{
	
}

public class CustomException  {

	public static void main(String[] args) {
		String id = "admin";
		int password = 12345;
		
		if(id.equals("admin"))
		{
			{
				if(password==12345)
				{
					System.out.println("Login Successful");
				}
				else
				{
					try
					{
					InvalidPasswordException obj = new InvalidPasswordException();
					throw obj;
					}
					catch(InvalidPasswordException e)
					{
						System.out.println("Invalid password throw");
					}
				}
			}
		}

	}

}
