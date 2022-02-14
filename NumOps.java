
public class NumOps {
	
	static boolean primeChk(int number1)
	{
		int inputNumber=number1;
		int i=2;
		boolean flag=true;
		if (inputNumber==1 || inputNumber==0) flag=false;
		for(i=2;i<=inputNumber/2;i++)
		{
			if (inputNumber%i==0)
			{
				flag=false;
				break;
			}
				
		}
		return flag;
	}

}
