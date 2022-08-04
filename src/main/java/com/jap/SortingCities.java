package com.jap;


public class SortingCities
{
    public static void main( String[] args ) {
     String [] city={"Bern","Lucerne","Interlaken","Grinedland","Engelberg","Geneva","Murren",	"Basel","Zermatt","Jungfraujoch"};
	int [] distance={138,52,118,136,85,276,103,87,214,101};

	 SortingCities sortingCities= new SortingCities();
	 sortingCities.convetUpperCase(city);
	 sortingCities.printCityAndDistance(city,distance);
	 sortingCities.findCityDistance(city,distance);
	 sortingCities.greaterThan(city,distance);

	
	}

	public String convetUpperCase(String[] city){
	    String sort="";
	  for(int i=0;i<city.length;i++){	
		 sort= city[i].toUpperCase();
		System.out.print(sort+" ");
		}
	    return sort ;
		
	 }
	
	public String printCityAndDistance(String[] city, int[] distance){
		String sort="";
		for(int i=0;i<city.length;i++){
	            sort=city[i];
			System.out.println(city[i]+":"+distance[i]+"kms");
		}
	    return sort;
		
	}
	public  String findCityDistance(String[] city, int[] distance){
		String sort="";
		for(int i=0;i<distance.length;i++){
			if(distance[i]==52){
				sort=city[i];
			System.out.println("The city which is 52kms from Zurish is "+sort);
			}
		
		
		}
			return sort;
		
	}
	public  String greaterThan(String[] city, int[] distance){
			String sort="";
			for(int i=0;i<distance.length;i++){
				if(distance[i]>=270){
					sort=city[i];
				System.out.println("The city which is greater than or equal to 270km from Zurish is "+sort);
				}
				
					
			}
				return sort;
		}
	}
