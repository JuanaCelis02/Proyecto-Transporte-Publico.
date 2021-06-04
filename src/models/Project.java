package models;

public class Project{

	public static final String ORIGIN_MUISCAS = "MUISCAS";
	public static final String ORIGIN_ASIS = "ASIS";
	public static final String ORIGIN_OLIMPICA = "OLIMPICA";
	public static final String DESTINATION_SENA = "SENA";
	public static final String DESTINATION_BOLIVAR = "BOLIVAR";
	public static final String DESTINATION_FUENTE = "FUENTE";
	public static final String DESTINATION_HOSPITAL = "HOSPITAL";
	public static final String DESTINATION_CAMOL = "CAMOL";
	public static final String ROUTE_TEN_AR = " RUTA 10-AR =  SENA, BOLIVAR ";
	public static final String ROUTE_FIFTEN_JD = " RUTA 15-JD = SENA, FUENTE ";
	public static final String ROUTE_EIGHTEEN_DR = " RUTA 18-DR = HOSPITAL ";
	public static final String ROUTE_TWENTY_JR = " RUTA 20_JR = FUENTE ";
	public static final String ROUTE_TWENTY_ONE_DS = " RUTA 21-DS = CAMOL, SENA, BOLIVAR ";
	public static final String ROUTE_TEN = "RUTA 10-AR";
	public static final String ROUTE_FIFTEN = "RUTA 15-AD";
	public static final String ROUTE_EIGHTEEN = "RUTA 18-ER";
	public static final String ROUTE_TWENTY = "RUTA 20-UR";
	public static final String ROUTE_TWENTY_ONE = "RUTA 21-AS";
    public static final String STUDENT_USER = "ESTUDIANTE";
    public static final String SENIOR_ADULT_USER = "ADULTO MAYOR";
    public static final String NORMAL_USER = "NORMAL";
    public static final String BANK_BANCOLOMBIA ="BANCOLOMBIA";
    public static final String BANK_BANCOPOPULAR = "BANCOPOPULAR";
    public static final String METHOD_EFECTY = "EFECTY";
    public static final String MESSAGE_ANSWER_ONE_THREE = " Lamentamos que hayas tenido esta mala experiencia. ";
    public static final String MESSAGE_ANSWER_FOUR_SEVEN = " Trabajaremos para brindarte siempre lo mejor. ";
    public static final String MESSAGE_ANSWER_EIGHT_TEN = " Nos alegra que te haya gustado nuestro servicio. ";
    public static final String MESSAGE_ERROR = " Por favor califica de 1 a 10. ";
    public static final String WELLCOME_MESSAGE = " Te damos la bienvenida ";
    public static final String MESSAGE_WITHOUT_CHAIRS = " No hay sillas ";
    public static final String MESSAGE_ROUTE_ON_HOLD = " Su ruta lo esta esperando ";
    public static final double VALUE_TICKET_USER_NORMAL = 2000;
    public static final double VALUE_TICKET_ADULT_STUDENT = 1500;
    public static final double SPEED = 30;
    public static final double MIN_SIXTY = 60;
    public static final int COORDINATE_MUISCAS_X = 1;
	public static final int COORDINATE_MUISCAS_Y = 1;
	public static final int COORDINATE_ASIS_X = 3;
	public static final int COORDINATE_ASIS_Y = 3;	
	public static final int COORDINATE_OLIMPICA_X = 5;
	public static final int COORDINATE_OLIMPICA_Y = 5;
    public static final int COORDINATE_SENA_X = 7;
    public static final int COORDINATE_SENA_Y = 7;
    public static final int COORDINATE_BOLIVAR_X = 8;
    public static final int COORDINATE_BOLIVAR_Y = 8;
    public static final int COORDINATE_FUENTE_X = 9;
    public static final int COORDINATE_FUENTE_Y = 9;
	public static final int COORDINATE_HOSPITAL_X = 6;
	public static final int COORDINATE_HOSPITAL_Y = 6;
	public static final int COORDINATE_CAMOL_X = 7;
	public static final int COORDINATE_CAMOL_Y = 7;
    public static final int BUS_CHAIRS = 30;
    private String typeUser;
    private String userName;
    private String documentNumberVar;
    private double earningsStudents = 0;
    private double earningsAdults = 0;
    private double earningsNormal = 0;
    private double distance = 0;
    private int accountantStudents = 0;
    private int accountantAdult = 0;
    private int accountantNormal = 0;
    private int routeTenCount;
    private int routeTwentyCounter;
    private int routeEighteenCounter;
    private int routeFiftenJdCounter;
    private int routeTwentyOneCounter;   

	public String registerNewUser (String typeUser, String name, String documentNumber){
		String wellcomeMessage = "";
		this.userName = name;
		this.documentNumberVar = documentNumber;

		switch(typeUser.toUpperCase()){
				case STUDENT_USER:
					wellcomeMessage = WELLCOME_MESSAGE;
					this.typeUser = STUDENT_USER;
					accountantStudents++;

				break;
				case SENIOR_ADULT_USER:
					wellcomeMessage = WELLCOME_MESSAGE;
					this.typeUser = SENIOR_ADULT_USER;
					accountantAdult++;

				break;
				case NORMAL_USER:
					wellcomeMessage = WELLCOME_MESSAGE;
					this.typeUser = NORMAL_USER;
					accountantNormal++;
				break;
	
		}
		return wellcomeMessage;
	}

	public double buyTickets (String typeUser, String paymentMethod, int numberTickets){
		double cost = 0;
		switch(typeUser.toUpperCase()){
				case STUDENT_USER:
					cost =  VALUE_TICKET_ADULT_STUDENT * numberTickets;
					if( paymentMethod.equals(BANK_BANCOLOMBIA) || paymentMethod.equals(BANK_BANCOPOPULAR) || paymentMethod.equals(METHOD_EFECTY) ){
						earningsStudents += cost;
						
					}else{
						System.out.println(" Ingrese otro medio de pago. ");
					}	
				break;
				case SENIOR_ADULT_USER:
					cost =  VALUE_TICKET_ADULT_STUDENT * numberTickets;
					if( paymentMethod.equals(BANK_BANCOLOMBIA) || paymentMethod.equals(BANK_BANCOPOPULAR) || paymentMethod.equals(METHOD_EFECTY) ){
						earningsAdults += cost;
						
					}else{
						System.out.println(" Ingrese otro medio de pago. ");
					}
				break;
				case NORMAL_USER:
					cost = VALUE_TICKET_USER_NORMAL * numberTickets;
					if( paymentMethod.equals(BANK_BANCOLOMBIA) || paymentMethod.equals(BANK_BANCOPOPULAR) || paymentMethod.equals(METHOD_EFECTY) ){
						earningsNormal += cost;
						
					}else{
						System.out.println(" Ingrese otro medio de pago. ");
					}
				break;
		}
		return cost;
	}

	public String checkRoute (String currentPlace, String destination){
		String route = "";
		if(ROUTE_TEN_AR.contains(destination)){
			route += ROUTE_TEN_AR;
			
		}

		if(ROUTE_FIFTEN_JD.contains(destination)){
			route += ROUTE_FIFTEN_JD;
			
		}

		if(ROUTE_EIGHTEEN_DR.contains(destination)){
			route += ROUTE_EIGHTEEN_DR;
			
		}

		if(ROUTE_TWENTY_JR.contains(destination)){
			route += ROUTE_TWENTY_JR;
			
		}

		if(ROUTE_TWENTY_ONE_DS.contains(destination)){
			route += ROUTE_TWENTY_ONE_DS;
		
		}
		System.out.println("Le sugerimos las siguientes rutas: " + route);
		return "";
	}

	
	public String chooseRoute (String route){
		if(ROUTE_TEN_AR.contains(route)){
			if(routeTenCount < BUS_CHAIRS){
				routeTenCount++;
				return MESSAGE_ROUTE_ON_HOLD;
			}else{
				return MESSAGE_WITHOUT_CHAIRS;
			}
		}else if(ROUTE_FIFTEN_JD.contains(route)){
			if(routeFiftenJdCounter < BUS_CHAIRS){
				routeFiftenJdCounter++;
				return MESSAGE_ROUTE_ON_HOLD;
			}else{
				return MESSAGE_WITHOUT_CHAIRS;
			}		
		}else if(ROUTE_EIGHTEEN_DR.contains(route)){
			if(routeEighteenCounter < BUS_CHAIRS){
				routeEighteenCounter++;
				return MESSAGE_ROUTE_ON_HOLD;
			}else{
				return MESSAGE_WITHOUT_CHAIRS;
			}
		}else if(ROUTE_TWENTY_JR.contains(route)){
			if(routeTwentyCounter < BUS_CHAIRS){
				routeTwentyCounter++;
				return MESSAGE_ROUTE_ON_HOLD;
			}else{
				return MESSAGE_WITHOUT_CHAIRS;
			}
		}else if(ROUTE_TWENTY_ONE_DS.contains(route)){
			if(routeTwentyOneCounter < BUS_CHAIRS){
				routeTwentyCounter++;
				return MESSAGE_ROUTE_ON_HOLD;
			}else{
				return MESSAGE_WITHOUT_CHAIRS;
			}
		}
		return "";
	}

	public double calculateDistance(String currentPlace, String destination){
		distance = 0;
		int coordinateOriginX = 0;
		int coordinateOriginY = 0;
		int coordinateDestineX = 0;
		int coordinateDestineY = 0;
		switch(currentPlace){

			case ORIGIN_MUISCAS:
				coordinateOriginX = COORDINATE_MUISCAS_X;
				coordinateOriginY = COORDINATE_MUISCAS_Y;

				switch(destination){
					case DESTINATION_SENA:
						coordinateDestineX = COORDINATE_SENA_X;
						coordinateDestineY = COORDINATE_SENA_Y;
					case DESTINATION_BOLIVAR:
						coordinateDestineX = COORDINATE_BOLIVAR_X;
						coordinateOriginY = COORDINATE_BOLIVAR_Y;
					case DESTINATION_FUENTE:
						coordinateDestineX = COORDINATE_FUENTE_X;
						coordinateDestineY = COORDINATE_FUENTE_Y;
					case DESTINATION_HOSPITAL:
						coordinateDestineX = COORDINATE_HOSPITAL_X;
						coordinateDestineY = COORDINATE_HOSPITAL_Y;
				}


			break;
					
			case ORIGIN_ASIS:
				coordinateOriginX = COORDINATE_ASIS_X;
				coordinateOriginY = COORDINATE_ASIS_Y;

				switch(destination){
					case DESTINATION_SENA:
						coordinateDestineX = COORDINATE_SENA_X;
						coordinateDestineY = COORDINATE_SENA_Y;
					case DESTINATION_BOLIVAR:
						coordinateDestineX = COORDINATE_BOLIVAR_X;
						coordinateOriginY = COORDINATE_BOLIVAR_Y;
					case DESTINATION_FUENTE:
						coordinateDestineX = COORDINATE_FUENTE_X;
						coordinateDestineY = COORDINATE_FUENTE_Y;
					case DESTINATION_HOSPITAL:
						coordinateDestineX = COORDINATE_HOSPITAL_X;
						coordinateDestineY = COORDINATE_HOSPITAL_Y;
				}

			break;	

			case ORIGIN_OLIMPICA:
				coordinateOriginX = COORDINATE_OLIMPICA_X;
				coordinateDestineY = COORDINATE_OLIMPICA_Y;

				switch(destination){
					case DESTINATION_SENA:
						coordinateDestineX = COORDINATE_SENA_X;
						coordinateDestineY = COORDINATE_SENA_Y;
					case DESTINATION_BOLIVAR:
						coordinateDestineX = COORDINATE_BOLIVAR_X;
						coordinateOriginY = COORDINATE_BOLIVAR_Y;
					case DESTINATION_FUENTE:
						coordinateDestineX = COORDINATE_FUENTE_X;
						coordinateDestineY = COORDINATE_FUENTE_Y;
					case DESTINATION_HOSPITAL:
						coordinateDestineX = COORDINATE_HOSPITAL_X;
						coordinateDestineY = COORDINATE_HOSPITAL_Y;
				}	

			break;
		}
		return distance = Math.sqrt(Math.pow((coordinateDestineX - coordinateOriginX), 2) + Math.pow((coordinateDestineX - coordinateDestineY), 2));
	}

	public double calculateTime(){
		double time = (distance / SPEED) * (MIN_SIXTY);
		return time;
	}

	public int counterTypeUser(String typeUser){
		int totalEarnings = 0;

		if(typeUser.toUpperCase() == STUDENT_USER){
			totalEarnings += accountantStudents;
			return accountantStudents;
			
		}else if(typeUser.toUpperCase() == SENIOR_ADULT_USER){
			totalEarnings += accountantAdult;
			return accountantAdult;

		}else if(typeUser.toUpperCase() == NORMAL_USER){
			totalEarnings += accountantNormal;
			return accountantNormal;
		}
		return totalEarnings;
	}

	public double calculateEarnings(String typeUser){

		if(typeUser.toUpperCase() == STUDENT_USER){
			return earningsStudents;

		}else if(typeUser.toUpperCase() == SENIOR_ADULT_USER){
			return earningsAdults;

		}else if(typeUser.toUpperCase() == NORMAL_USER){
			return earningsNormal;
		}
		return 0;
	}
	
	public double calculateOverallEarnings(){

		double totalEarnings = ((earningsStudents + earningsAdults + earningsNormal) / 2);
			return totalEarnings;
	}

	public String rateService(int qualification){

		if((qualification >= 8) && (qualification <= 10)){
			return MESSAGE_ANSWER_EIGHT_TEN;

		}else if((qualification >= 4) && (qualification <=7)){
			return MESSAGE_ANSWER_FOUR_SEVEN;

		}else if((qualification >= 1) && (qualification <= 3)){
			return MESSAGE_ANSWER_ONE_THREE;
		}
		return MESSAGE_ERROR;
	}
}

