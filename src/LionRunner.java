
public class LionRunner {

	public static void main(String[] args) {
          Lion lion= new Lion(1223, "Zebra");
          System.out.println(lion.favoritefood);
          System.out.println(lion.prey);
          lion.roar();
          lion.eat();
          Duck duck= new Duck("food",3);
          System.out.println(duck.favoriteFood);
          System.out.println(duck.numberOfFriends);
          duck.quack();
          duck.waddle();
          
           
	}

}
