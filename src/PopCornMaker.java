import javax.swing.JOptionPane;

public class PopCornMaker {
  public static void main(String[] args) {
	String flavor= JOptionPane.showInputDialog("What flavor do you want?");
	Popcorn popcorn= new Popcorn(flavor);
	String minutes= JOptionPane.showInputDialog("How many minutes do you want to cook it?");
	int minute=Integer.parseInt(minutes);
	Microwave microwave= new Microwave();
	microwave.putInMicrowave(popcorn);
	microwave.setTime(minute);
	microwave.startMicrowave();
	popcorn.applyHeat();
	popcorn.eat();

	
}
}
