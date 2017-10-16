import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class followTheLightMain {
	static long timetest = 5000; 
	
public static void main(String[] args) { // START OF MAIN METHOD
	
	Finch myfinch = new Finch(); //INSTANTIATION OF FINCH TO ALLOW USAGE
	userDefMethodBase userDefMethodBase = new userDefMethodBase(myfinch); //CREATION OF OBJECT 
	boolean endProgramCheck = true; //USED FOR THE ENDPROGRAM CHECK LATER ON WITHIN THE PROGRAM
	long before = System.currentTimeMillis(); //SET BEFORE VARIABLE TYPE LONG AND ASSIGNING IT THE VALUE OF CURRENT TIME 
	
	while (myfinch.isLeftLightSensor(100) && myfinch.isRightLightSensor(100)){ 	//WHILE LIGHT SOURCE IS DETECTED DO...
		endProgramCheck = false; 
		followProcesses(myfinch); // CALLING OF PRIVATE METHOD THAT WILL SET LED LIGHT TO BLUE AND OUTPUT ON THE MOVE SOUND
		userDefMethodBase.rightOrLeft(myfinch); // CALLING OF PUBLIC METHOD FROM ADDITIONAL CLASS CREATED THAT WILL ALLOW MOVEMENT 
		
		while (myfinch.isObstacle() || !(myfinch.isLeftLightSensor(100) && myfinch.isRightLightSensor(100))) {
			stopProcesses(myfinch); //CALLING OF PRIVATE METHOD TO STOP WHEELS, SET LED TO RED AND STOP ON THE MOVE SOUND			
				if (!endProgramCheck) { 
					endProgramCheck = true; 									
					before = System.currentTimeMillis(); 						
					}while (System.currentTimeMillis() - before > timetest){ 
						// IF CURRENT TIME IS GREATER THAN 5 SECONDS	
						System.out.println("PROGRAM TERMINATED");		
						System.exit(0); // TERMINATION OF PROGRAM
						return;
						}
		}
	}		
} //END OF MAIN METHOD

	//TWO PRIVATE METHOD CREATEDS OUTSIDE OF MAIN METHOD
	private static void followProcesses (Finch myfinch){
		myfinch.setLED(0,0,150);
		myfinch.buzz(5589,5000);
	}
	private static void stopProcesses (Finch myfinch){
		myfinch.stopWheels();
		myfinch.setLED(255,0,0);
		myfinch.buzz(0,0);
	}
}
