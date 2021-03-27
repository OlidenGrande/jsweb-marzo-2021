package ar.educationit.interfaces.impl;

import ar.educationit.interfaces.ILogger;

public class EmailLogger implements ILogger {
	
	private String destinatario;
	private String msg;
	
	public EmailLogger() {
		
	}
	
	public EmailLogger(String destinatario, String msg) {
		this.destinatario = destinatario;
		this.setMsg(msg);
	}

	public void log() {
		
		System.out.println("Enviando email a: " + this.destinatario);
		System.out.println("Mensaje: " + this.msg);
		System.out.println("Enviado");
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
