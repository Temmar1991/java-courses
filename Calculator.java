public class Calculator {
	/**
		��������� ����������
		
	*/
	
	private int result;
	
	/**
		��������� ���������
		@param params ��������� ������������
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