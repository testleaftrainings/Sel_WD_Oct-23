package week1.day2;

public class Restaurant {
	public String myorder;
	public void soup(int soupCount) {
		System.out.println("I want " + soupCount + "soup.");
	}
	
	public String soup(int soupCount, String soupType) {
		myorder = soupCount+soupType;
		System.out.println(myorder);
		return myorder;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant hotel = new Restaurant();
		hotel.soup(2);
		System.out.println(hotel.myorder);
//		String output =hotel.soup(5, "NonVeg");
//		System.out.println(output);
		System.out.println(hotel.soup(4, "nv"));
		

	}

}
