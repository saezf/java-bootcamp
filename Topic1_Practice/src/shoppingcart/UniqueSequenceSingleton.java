package shoppingcart;

public class UniqueSequenceSingleton{
	private static UniqueSequenceSingleton instance;
	
	private static int counter;
	
	//para el ejemplo lo inicializamos 12345
	private UniqueSequenceSingleton(){
		counter = 12345;
	}
	public static synchronized UniqueSequenceSingleton getInstance(){
		if(instance==null) // Lazy instantiation
		{
			instance = new UniqueSequenceSingleton();
		}
		return instance;
	}
	public static synchronized int getNext(){
		return ++counter;
	}
}