package day18;

class InsufficientBalanceException extends RuntimeException{
	
}

public class TransactionValid  {

	public static void main(String[] args) {
		int Transaction_id = 123456;
		int Balance = 200;
		
		if(Transaction_id==123456)
		{
			{
				if(Balance<2000)
				{
					System.out.println("You Can proceed with  transaction");
				}
				else
				{
					try
					{
					throw new InsufficientBalanceException();
					
					}
					catch(InsufficientBalanceException e)
					{
						System.out.println("Oops... You have insufficient Balance");
					}
				}
			}
		}

	}

}
