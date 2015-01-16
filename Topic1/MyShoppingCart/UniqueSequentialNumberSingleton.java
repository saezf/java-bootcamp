
public class UniqueSequentialNumberSingleton {
	private static UniqueSequentialNumberSingleton	uniqueSequentialNumber = new UniqueSequentialNumberSingleton();
	public long uid;
	
	public UniqueSequentialNumberSingleton(){
		//code for generate unique sequential numbers
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public static UniqueSequentialNumberSingleton getUniqueSequentialNumber() {
		return uniqueSequentialNumber;
	}

	public static void setUniqueSequentialNumber(UniqueSequentialNumberSingleton uniqueSequentialNumber) {
		UniqueSequentialNumberSingleton.uniqueSequentialNumber = uniqueSequentialNumber;
	}
	
	
	
	
}
