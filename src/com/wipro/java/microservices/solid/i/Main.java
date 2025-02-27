package com.wipro.java.microservices.solid.i;

public class Main {
	public static void main(String[] args) {
        Batsman batsman = new SpecialistBatsman();
        batsman.bat();

        Bowler bowler = new SpecialistBowler();
        bowler.bowl();

        AllRounder allRounder = new AllRounder();
        allRounder.bat();
        allRounder.bowl();

        WicketKeeperBatsman keeper = new WicketKeeperBatsman();
        keeper.bat();
        keeper.keepWickets();
    }

}
