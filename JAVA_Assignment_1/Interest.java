class Interest
{
	public double simpleInterest(double principal,double rateInPercent,double timeInYears)
	{
		return (principal*rateInPercent*timeInYears)/100;
	}
	public double compoundInterest(double principal,double rateInPercent,double timeInYears)
	{
		return principal*(Math.pow(1+rateInPercent/100,timeInYears)-1);
	}	
}