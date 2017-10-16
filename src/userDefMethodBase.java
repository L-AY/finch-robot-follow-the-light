import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class userDefMethodBase {
	static Finch myfinch;
	// THIS HAS TO BE DEFINED AS WE CREATE AN INSTANCE OF THIS CLASS IN THE MAIN METHOD
	public userDefMethodBase(Finch finch) {
			myfinch = finch;
	}		
	public void rightOrLeft (Finch finch){
//THE MOVEMENT WORKS BY THE FINCH ROBOT MOVING TO THE SIDE WHOSE LIGHT SENSOR VALUE IS THE GREATEST	
/*RIGHT*/	if (myfinch.getRightLightSensor() > myfinch.getLeftLightSensor()){
				int j = 100 - (myfinch.getLeftLightSensor() - myfinch.getRightLightSensor());
					myfinch.setWheelVelocities(j, 100);	
					
/*LEFT*/	} else if (myfinch.getLeftLightSensor() > myfinch.getRightLightSensor()) {
				int j = 100 - (myfinch.getRightLightSensor() - myfinch.getLeftLightSensor());
					myfinch.setWheelVelocities(100, j);
				}
				
			}
	}
