package domain.model;

public enum Country {

	ITA, ESP, EGY;
	
public static Country getByName(String enumName){
	 for (Country coun : Country.values()) {
		 if (coun.toString().equalsIgnoreCase(enumName)){
			 return coun;
		 }    	 
	 }
	 return null;
}
}
