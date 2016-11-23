package domain.model;

public enum Country {

Italy, France, Spain, Croatia, Cyprus, Egypt, Turkey, Thailand;
	
public static Country getByName(String enumName){
	 for (Country coun : Country.values()) {
		 if (coun.toString().equalsIgnoreCase(enumName)){
			 return coun;
		 }    	 
	 }
	 return null;
}
}
