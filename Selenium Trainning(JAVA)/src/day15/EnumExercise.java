package day15;

import java.util.EnumSet;
import java.util.Set;

public class EnumExercise {

		enum  Daysinaweek {
			SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
		}


	
		

		public static void main(String[] args) {
			
        Set<Daysinaweek> set=EnumSet.of(Daysinaweek.MONDAY);
        System.out.println(set);
       
		}
	} 


