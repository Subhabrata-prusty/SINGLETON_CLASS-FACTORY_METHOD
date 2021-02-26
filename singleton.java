class Subham{

	public static int counter =0;

	private Subham()
	{
		System.out.println("this is inside private constructor:)");
	}

	public static Subham getobj()
	{
     
        Subham s=null;
        if (counter==0) 
        {
           s=new Subham();
           counter++;
        }
        else
        {

        	System.out.println("object is already created:)");
        }

         return s;
       }
	public void disp()
	{

		System.out.println("obj created :)");
	}

}
class Test{

	public static void main(String[] args) {
		
        Subham s = Subham.getobj();
		s.disp();
		Subham d = Subham.getobj();
		System.out.println("this is a singleton class:)");
		System.out.println("getobj() is factory method:)>>.");

	}
}