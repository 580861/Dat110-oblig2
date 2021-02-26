package no.hvl.dat110.iotsystem;

public class TemperatureSensor {

	private static final int RANGE = 20;
//Try to start a broker and have the display device and 
	//then the sensor device connects. Check that the display device 
	//is correctly receiving the temperature-messages published by the sensor device.
	public int read() {

		long seconds = System.currentTimeMillis();

		double temp = RANGE * Math.sin(seconds / 1000);

		return (int) Math.ceil(temp);
	}
}
