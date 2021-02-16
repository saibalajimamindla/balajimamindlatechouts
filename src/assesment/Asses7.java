package assesment;

import java.util.*;

public class Asses7 {
	public static void main(String[] args) {
		
		int [] str = {10,20,30,40,50,40,60,20,80,10,100};

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(Integer element:str){

		if(map.containsKey(element))

		System.out.println("Duplicate Value : "+element);

		else{

		map.put(element, 1);

		}

		}
	}
}
