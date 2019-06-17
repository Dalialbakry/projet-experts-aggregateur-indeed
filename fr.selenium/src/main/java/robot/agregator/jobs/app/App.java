package robot.agregator.jobs.app;

import robot.agregator.jobs.loaders.AppFlow;
import robot.agregator.jobs.loaders.MyDriver;

public class App extends AppFlow{

	public static void main(String[] args) {

		run();
		MyDriver.quitDriver();
	}

}
