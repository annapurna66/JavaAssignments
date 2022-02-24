package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiConsumer;


public class ConsumerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1=new Player("Sachin",50,"Male","cricket",70000,Arrays.asList("reading","gardening"));
		Player p2=new Player("virat",70,"Male","cricket",90000,Arrays.asList("skating","travelling"));
		Player p3=new Player("sindhu",60,"female","badminton",50000,Arrays.asList("travelling"));
		Player p4=new Player("Sania",50,"feMale","tennis",40000,Arrays.asList("reading"));
		ArrayList<Player> playerList=new ArrayList<>();
		playerList.add(p1);
		playerList.add(p2);
		playerList.add(p3);
		playerList.add(p4);
		
		
		//System.out.println("playerlist:" +playerList);
		
		Consumer<Player> upperCase=(p)->
		 System.out.println(p.getGender().toUpperCase());
		 Consumer<Player> salIncr=(p)->
		 System.out.println("sal after increment:"+(p.getSalary()+10000));
		 
		 
		 //playerList.forEach(upperCase.andThen(salIncr));
		 playerList.forEach(upperCase);
		 //System.out.println("after sal increment");
		 playerList.forEach(salIncr);
		 
		 //Biconsumer example
		 System.out.println("biconsumer example");
		 BiConsumer<Float,List<String>> salaryAndHobbies=(salary,hobbies)->{
			 
			 System.out.println("salaary:" +salary+" hobbies:"+hobbies.toString().toUpperCase() );};
		 
		 //System.out.println(p.getGender().toUpperCase());
			 
		 BiConsumer<String,Float> nameAndSalary=(name,salary)->{
				 
				 System.out.println("name :" + name +"  salary:" +salary );};
				 
		
		
		 playerList.forEach((player) -> {
				 salaryAndHobbies.accept(player.getSalary(), player.getHobbies());
				 //System.out.println("before calling nameand sal");
				 nameAndSalary.accept(player.getName(),player.getSalary());
				});;

	}

}
