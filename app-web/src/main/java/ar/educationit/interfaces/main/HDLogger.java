package ar.educationit.interfaces.main;

import java.lang.reflect.Constructor;

import ar.educationit.interfaces.ILogger;

public class HDLogger implements ILogger {
	
	private String path;
	private String msg;
	
	public HDLogger(String path, String msg) {
		this.path = path;
		this.msg = msg;
	}

	public void log() {
		System.out.println("Grabando log en disco..." + this.path);
		System.out.println("Grabando..." + this.msg);
		System.out.println("Se ha grabado exitosamente");
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setPath(String path) {
		this.path = path;
	}

}
