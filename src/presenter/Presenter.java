package presenter;

import models.*;
import views.*;

public class Presenter{
	private Project project;
	private Console console;

	public Presenter(){
		project = new Project();
		console = new Console();
		showMenu();
	}
	public void showMenu(){
		int option = console.showMenu();
		switch(option){
				case Console.MENU_ONE:
						registerNewUser();
				break;
				case Console.MENU_TWO:
						buyTickets();
				break;
				case Console.MENU_THREE:
						checkRoute();
				break;
				case Console.MENU_FOUR:
						chooseRoute();
				break;
				case Console.MENU_FIVE:
						calculateDistance();
				break;
				case Console.MENU_SIX:
						calculateTime();
				break;
				case Console.MENU_SEVEN:
						counterTypeUser();
				break;
				case Console.MENU_EIGTH:
						calculateEarnings();
				break;
				case Console.MENU_NINE:
						rateService();
				break;
				default: 
					System.out.println("SOLO 9 OPCIONES");
					return;
		}
		showMenu();
	}

	public void registerNewUser(){
		String message = project.registerNewUser(console.getTypeUser(), console.getName(), console.getDocNumber());
		console.showMessage(message);
	}


	public void buyTickets(){
		double buyTicketsMessage = project.buyTickets(console.getType(), console.getPaymentMethod(), console.getNumberTickets());
		console.showCost(buyTicketsMessage);
	}

	public void checkRoute(){
		String messageCheckRoute = project.checkRoute(console.getCurrentPlace(), console.getDestination());
		console.showRoute(messageCheckRoute);
	}

	public void chooseRoute(){
		String messageChooseRoute = project.chooseRoute(console.getRoute());
		console.showRouteChoose(messageChooseRoute);

	}

	public void calculateDistance(){
		double messageCalculate = project.calculateDistance(console.getCurrentPlaceTwo(), console.getDestinationTwo());
		console.showDistance(messageCalculate);
	}

	public void calculateTime(){
		double messageTime = project.calculateTime();
		console.showTime(messageTime);
	}

	public void counterTypeUser(){
		int messageCounterType = project.counterTypeUser(console.getTypeUserTwo());
		console.showEarnings(messageCounterType);
	}

	public void calculateEarnings(){
		double mesageEarnings = project.calculateEarnings(console.getTypeUserTr());
		console.showOverallEarnings(mesageEarnings);
	}

	public void calculateOverallEarnings(){
		double mess = project.calculateOverallEarnings();
	}

	public void rateService(){
		String messageQuali = project.rateService(console.getQualification());
		console.showMessageQualification(messageQuali);
	}

	public static void main (String [] list){
		new Presenter();
	}
}