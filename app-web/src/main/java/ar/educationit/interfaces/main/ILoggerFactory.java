package ar.educationit.interfaces.main;

import ar.educationit.interfaces.ILogger;
import ar.educationit.interfaces.impl.EmailLogger;

public class ILoggerFactory {
	
	public static ILogger[] buildLogger(String dest, String msg) {
		
		EmailLogger emailLogger = new EmailLogger(dest, msg);
		emailLogger.log();
		
		HDLogger hdLogger = new HDLogger("c:/logs", "Aprendiendo interfaces en java");
		hdLogger.log();
		
		//Crear vector de interfaces
		ILogger[] loggers = new ILogger[2];
		loggers[0] = emailLogger;
		loggers[1] = hdLogger;
		
		return loggers;
		
	}
}
