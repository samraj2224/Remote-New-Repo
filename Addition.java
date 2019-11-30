class Addition 
{
	static int m1(int a,int b) 
	{
		if((a<0)&&(b<0))
			return(a+b);
		else{
				throw new IllegalArgumentException("n<0");
		
		}
	}
}
