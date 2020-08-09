package com.pragim.regularinnerclasses;

import java.util.Scanner;

public class PenaltyShootout {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first team name?");
		String teamOne = sc.nextLine().toUpperCase().substring(0, 3);
		System.out.println("Enter the second team name?");
		String teamTwo = sc.nextLine().toUpperCase().substring(0, 3);
		sc.close();

		System.out.println("Football match penaulty shootout");
		System.out.println("------------------------------------------");

		int teamOneGoals = 0;
		int teamTwoGoals = 0;

		for (int balls = 0; balls < 5; balls++) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}

		if (teamOneGoals == teamTwoGoals) {
			System.out.println("____________________________");
			System.out.println("It's went to sudden death!!!");
			System.out.println("_____________________________");
		}

		while (teamOneGoals == teamTwoGoals) {
			teamOneGoals += kickTheBall(teamOne);
			teamTwoGoals += kickTheBall(teamTwo);
			System.out.println(teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo);
		}

		System.out.println("*********************************");
		if (teamOneGoals > teamTwoGoals) {
			System.out.println("" + teamOne + " beans "+teamTwo);

		} else {
			System.out.println("" + teamTwo + " beats " + teamOne + "");
		}
		System.out.println("*********************************");
		System.out.println("          ____________________");
		System.out.println("          |    FINAL SCORE    |");
		System.out.println("          |===================|");
		System.out.println(
				"          |   " + teamOne + " " + teamOneGoals + " - " + teamTwoGoals + " " + teamTwo + "   |");
		System.out.println("          |___________________|");

	}

	private static int kickTheBall(String team) {
		int goal = Math.random() > 0.5 ? 1 : 0;
		if (goal > 0)
			System.out.println(team + " shoots!");
		else
			System.out.println(team + " missed!");
		return goal;
	}
}
