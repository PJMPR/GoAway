package domain.model;

public enum Meal {

	Only_Bed, Breakfast, Breakfast_Dinner, Breakfast_Lunch_Dinner, All_Inclusive;
	
	public static Meal getByName(String enumName){
		 for (Meal meal : Meal.values()) {
			 if (meal.toString().equalsIgnoreCase(enumName)){
				 return meal;
			 }    	 
		 }
		 return null;
	}
}