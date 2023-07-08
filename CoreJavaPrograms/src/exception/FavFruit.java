package exception;

public class FavFruit {
	public static void fruit(String fruitName)throws BadFoodException {
		if(fruitName.equalsIgnoreCase("Mango"))
    		System.out.println("I love "+fruitName);
		else
			throw new BadFoodException("I don't like "+fruitName);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fruit("banana");
		} catch (BadFoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of code...");

	}

}
