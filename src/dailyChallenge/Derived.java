package dailyChallenge;

public class Derived extends Base{
	
	
	

	public Derived() {
		super.Affiche();
		// TODO Auto-generated constructor stub
	}
	
	
	

	//@Override
	public void Affiche1() {
		// TODO Auto-generated method stub
		System.out.println("je suis la classe fille");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived fille = new Derived();
		fille.Affiche1();

	}

}
