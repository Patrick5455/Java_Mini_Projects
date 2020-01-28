
import java.util.Scanner;

public class Television {
	private boolean state;
	private int station;
	private int volume;
	private boolean power;

	Scanner input = new Scanner(System.in);

	public void turnOn() {

		System.out.println("Press 1 to turn on TV. Press 0 to turn off TV");

		int display = input.nextInt();
		if (display == 1) {
			state = true;
		}
		if (display == 0) {
			state = false;
		}
	}
	
	/*public Television( int station, int volume){

	this.station = station;
	this.volume =volume;
	}*/
	  
	/*public void toggle(){
		state = !state;
		power = state;
	}
	
	public void State(){
		 if(power==true){
			System.out.printf("Television On");
		} else { System.out.printf("Television Off");
		}
	}*/

	public void changeStation() {

		if (state == true) {

			System.out.println(" Your TV is on! \n \n Select 1 for station1\n Select 2 for station2\n Select 3 station3\n");


			int channel = input.nextInt();
			if (channel == 1) {
				System.out.println("You're watching Station 1");
			}
			if (channel == 2) {
				System.out.println("You're watching Station 2");
			}
			if (channel == 3) {
				System.out.println("You're watching Station 3");
			}
		}
	}

	public int getVolume() {
		return volume;
	}


	public void volumeSet() {
		System.out.println("To increase volume Press 1\nTo decrease volume press 0 \n");

		int volumeSet = input.nextInt();

		if (volumeSet == 1) {
			volume++;

			System.out.printf("Volume is %d%n", getVolume());
		}

		if (volumeSet == 0) {
			volume--;

			System.out.printf("Volume is %d%n", getVolume());
		}
	}

	//public void decreaseVolume(){


	//}

}

	
