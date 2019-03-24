import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Lion {
    int prey;
    String favoritefood;
    public Lion(int prey, String favoritefood) {
    	    this.prey=prey;
    	    this.favoritefood=favoritefood;
   
 
    }
    
    void roar() {
    	    System.out.println("roar");
    	    
    }
    void eat() {
    	   System.out.println("Ate a prey");
    }


}
