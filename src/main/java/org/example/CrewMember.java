package org.example;

public class CrewMember extends PersonName {
    CrewRank rank;
     public CrewMember(String name, CrewRank rank){
         super(name);
         this.rank = rank;
     }
     public String getRank(){
         return rank.getRank();
     }
}
