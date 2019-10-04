package TestFiles;

public class methodoverriding {
	
	public static void main(String args[])
	{
		 SBI s= new SBI();
		 Axis a= new Axis();
		System.out.println("Rate of interest for SBI: "+ s.getROI());
		System.out.println("Rate of interest for Axis: "+ a.getROI());
	}
	

}
