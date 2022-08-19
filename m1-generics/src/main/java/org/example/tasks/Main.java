package org.example.tasks;
import java.util.ArrayList;

public class Main {
public static void main(String []args){
    ArrayList<Integer> items=new ArrayList<>(); //<> eagle brackets or diamond name Generic parameterized  data types
items.add(1);
items.add(2);
items.add(3);
items.add(4);
//        items.add("Apple");

    printDoubled(items);

    BaseballPlayer bplayer1=new BaseballPlayer("Kimmy");
    FootballPlayer fplayer1= new FootballPlayer("Jonny");
    SoccerPlayer splayer1= new SoccerPlayer("Messi");

    Team<SoccerPlayer> liverPool=new Team ("Liverpool");
    liverPool.addPlayer(splayer1);


}
public static void printDoubled(ArrayList<Integer> items){
for (Integer i: items){
System.out.println(i*2);
}
}
}
