class HouseConstructionCost
{
	public double constructionCost(String matStandard,double totalArea,boolean automated)
	{
		if(matStandard.equals("S") && automated==false)
			return 1200*totalArea;
		else if(matStandard.equals("AS") && automated==false)
			return 1500*totalArea;
		else if(matStandard.equals("HS") && automated==false)
			return 1800*totalArea;
		else if(matStandard.equals("HS") && automated==true)
			return 2500*totalArea;
		else
			return 0.0;
	}

}