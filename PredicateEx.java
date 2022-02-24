package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1=new Player("Sachin",50,"Male","cricket",70000,Arrays.asList("reading","gardening"));
		Player p2=new Player("virat",70,"Male","cricket",90000,Arrays.asList("skating","travelling"));
		Player p3=new Player("sindhu",60,"female","badminton",50000,Arrays.asList("travelling"));
		//Player p4=new Player("Sania",50,"feMale","tennis",40000);
		Player p4=new Player("Sania",50,"feMale","tennis",40000,Arrays.asList("reading"));
		ArrayList<Player> playerList=new ArrayList<>();
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		playerList.add(p4);
		
		Predicate<Player> genderAndSalCheck=(player)->{
			
			return (player.getGender().equalsIgnoreCase("female") && player.getSalary()>2000);
		};
		
		
		
		BiPredicate<String,Integer> genderAndWeightCheck=(gender,weight)->{
			
			return (gender.equalsIgnoreCase("female") && weight>50);
		};

		
		
				
		playerList.forEach((player) -> {
			System.out.println("genderAndSalCheck:"+genderAndSalCheck.test(player));
			//System.out.println("calling genderAndWeightCheck");
			System.out.println("genderAndWeightCheck:"+genderAndWeightCheck.test(player.getGender(),player.getWeight()));
			});;
	 
		
		
		

	}

}
