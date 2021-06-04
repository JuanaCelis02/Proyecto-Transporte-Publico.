package views;

import java.util.Scanner;

public class Console{

	private Scanner scanner;
	public static final int MENU_ONE = 1;
	public static final int MENU_TWO = 2;
	public static final int MENU_THREE = 3;
	public static final int MENU_FOUR = 4;
	public static final int MENU_FIVE = 5;
	public static final int MENU_SIX = 6;
	public static final int MENU_SEVEN = 7;
	public static final int MENU_EIGTH = 8;
	public static final int MENU_NINE = 9;

	public Console(){
		scanner = new Scanner(System.in);
	}

	public String getTypeUser(){
		System.out.println("Ingrese el tipo de usuario que usted es : (ESTUDIANTE, NORMAL, ADULTO MAYOR) ");
		return scanner.nextLine();
	}
	public String getName(){
		System.out.println("Ingrese su nombre: " );
		return scanner.nextLine();
	}
	public String getDocNumber(){
		System.out.println("Ingrese su numero de documento: ");
		return scanner.nextLine();
	}
	public void showMessage(String wellcomeMessage){
		System.out.println(wellcomeMessage);
	}
	public String getType(){
		System.out.println("Ingrese el tipo de usuario que usted es: (ESTUDIANTE, NORMAL, ADULTO MAYOR)");
		return scanner.nextLine();
	}
	public String getPaymentMethod(){
		System.out.println("Ingrese el metodo de pago con el que va a cancelar: (BANCOLOMBIA, EFECTY, BANCOPOPULAR)");
		return scanner.nextLine();
	}
	public int getNumberTickets(){
		System.out.println(" ¿Cuantos pasajes desea comprar? ");
		return Integer.parseInt(scanner.nextLine());
	}
	public void showCost(double cost){
		System.out.println("$" + cost);
	}
	public String getCurrentPlace(){
		System.out.print("Ingrese el lugar donde se encuentra: ");
		return scanner.nextLine();
	}
	public String getDestination(){
		System.out.print("Ingrese el lugar a donde desea ir: ");
		return scanner.nextLine();
	}
	public void showRoute(String route){
		System.out.println(" ");
	}
	public String getRoute(){
		System.out.print("Ingrese la ruta que escogio: ");
		return scanner.nextLine();
	}
	public void showRouteChoose(String route){
		System.out.println(route);
	}
	public String getCurrentPlaceTwo(){
		System.out.print("Ingrese el lugar donde se encuentra: ");
		return scanner.nextLine();
	}
	public String getDestinationTwo(){
		System.out.print("Ingrese el lugar a donde desea ir: ");
		return scanner.nextLine();
	}
	public void showDistance(double distance){
		System.out.println("La distancia en kilometros es de: " + distance );
	}
	public void showTime(double time){
		System.out.println("El tiempo estimado en minutos es de: " + time);
	}
	public String getTypeUserTwo(){
		System.out.print("Ingrese el tipo de usuario: ");
		return scanner.nextLine();
	}
	public void showEarnings(double earnings){
		System.out.println("Las ganancias obtenidas son: " + earnings);
	}
	public String getTypeUserTr(){
		System.out.print("Ingrese el tipo de usuario: ");
		return scanner.nextLine();
	}
	public void showOverallEarnings(double overallEarnings){
		System.out.println("Las ganancias libres son: " + overallEarnings);

	}
	public String getNothing(){
		System.out.print("Ingrese el tipo de usuario: ");
		return scanner.nextLine();
	}
	public void showmenorfifty(double menorEar){
		System.out.println("Las ganancias que quedan son: " + menorEar);
	}
	public int getQualification(){
		System.out.print("Califique el servicio siendo 10 excelente y 1 pesimo: ");
		return Integer.parseInt(scanner.nextLine());
	}
	public void showMessageQualification(String message){
		System.out.print("Gracias por haber calificado el servicio, " + message);
	}
	public int showMenu(){
		System.out.println(" INGRESE 1. Registrarse.  2. Comprar pasajes.  3. Buscar Ruta.  4. Conocer tiempo de la ruta.  5. Calcular tiempo  6. Conocer el numero de persoans, por tipo.  7. Conocer ganancias individuales.  8. Conocer ganancia despues de los gastos.  9. Calificar el servicio. ");
		return Integer.parseInt(scanner.nextLine());
	}
}
