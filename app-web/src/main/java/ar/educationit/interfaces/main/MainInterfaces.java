package ar.educationit.interfaces.main;

import ar.educationit.interfaces.ILogger;
import ar.educationit.interfaces.impl.EmailLogger;

public class MainInterfaces {

	public static void main(String[] args) {
		
		String msg = args[0];
		String dest = args[1];
		
		ILogger[] loggers = ILoggerFactory.buildLogger(dest, msg);
	}

}
