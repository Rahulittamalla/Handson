package association.aggregation.composition;

public class Part {

	public boolean isFunctional=true;
	
	public void fix()
	{
		if(!isFunctional)
		{
			isFunctional=true;
		}
	}
	
	
}
