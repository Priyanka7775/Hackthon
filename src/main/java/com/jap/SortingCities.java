package com.jap;


public class SortingCities
{
    public static void main( String[] args ) {
     String [] city={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
	int [] distance={138,52,118,136,85,276,103,87,214,101};

	 SortingCities s= new SortingCities();
	 s.convetUpperCase(city);
	 s.printCityAndDistance(city,distance);
	 s.findCityDistance(city,distance);
	 s.greaterThan(city,distance);
	}

	public  void convetUpperCase(String[] city){
	  for(int i=0;i<city.length;i++){	
		System.out.print(city[i].toUpperCase()+" ");
		}
		System.out.println();
	 }
	
	public void printCityAndDistance(String[] city, int[] distance){
		String[] CityAndDistance=new String[city.length];
		for(int i=0;i<city.length;i++){
	
			System.out.println(city[i]+":"+distance[i]+"kms");
		}
		System.out.println();
	}
	public void findCityDistance(String[] city, int[] distance){
		String[] findCity=new String[city.length];
		for(int i=0;i<distance.length;i++){
			if(distance[i]==52){
			System.out.println(city[i]);
		}
		
		
	}
	public void greaterThan(String[] city, int[] distance){
		String[] greater=new String[distance.length];
			for(int i=0;i<distance.length;i++){
				if(distance>=270)
				System.out.println("The city which is greater than or equal to 270km from Zurish is "+city[i]);
			}
		}
	}

	
}
