public class Calculator {
	/**
		Результат вычисления
		
	*/
	
	private int result;
	
	/**
		Суммируем аргументы
		@param params аргументы суммирования
	*/
	
	
	public void add (int ... params){
		for (Integer param: params)
		{
			this.result += param;
		}
	}
	
	public int getresult()
	{
		return this.result;
	}
	
	
	public void clearresult()
	{
		this.result = 0;
	}
	
	
}