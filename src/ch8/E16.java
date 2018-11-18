package ch8;

import static net.mindview.util.Print.*;

class AlertStatus{
	public String getStatus(){return "none";}
}

class RedStatus extends AlertStatus{
	public String getStatus(){return "Red";}
}

class BlueStatus extends AlertStatus{
	public String getStatus(){return "Blue";}
}

class GreenStatus extends AlertStatus{
	public String getStatus(){return "Green";}
}

public class E16 {
	private AlertStatus as = new AlertStatus();
	public void changeRed(){ as = new RedStatus();}
	public void changeBlue(){ as = new BlueStatus();}
	public void changeGreen(){ as = new GreenStatus();}
	public void starStatus(){print(as.getStatus());}
	public static void main(String[] args) {
		E16 e16 = new E16();
		e16.starStatus();
		e16.changeRed();
		e16.starStatus();
	}
}
