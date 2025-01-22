package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	public void act(RobotMotionAdapter robot) {
		
		
		/** stem and leaf **/
		robot.forward(150);
		robot.turnRight(90);
		robot.forward(80);
		/**curves**/
		robot.turnLeft(60);
		robot.forward(20);
		robot.turnLeft(60);
		robot.forward(20);
		robot.turnLeft(60);
		robot.forward(20);
		robot.turnLeft(30);
		robot.forward(72);
		/** finish stem **/
		robot.turnRight(120);
		robot.forward(180);
		
		/** petals **/
		int petal = 1;
		
		while(petal <=9) {
			
			robot.turnRight(60);
			robot.forward(90);
			
			robot.turnLeft(60);
			robot.forward(30);
			
			robot.turnLeft(60);
			robot.forward(30);
			
			robot.turnLeft(60);
			robot.forward(30);
			
			robot.turnLeft(40);
			robot.forward(80);
			
			petal++;
		
		}
		
	}
}

