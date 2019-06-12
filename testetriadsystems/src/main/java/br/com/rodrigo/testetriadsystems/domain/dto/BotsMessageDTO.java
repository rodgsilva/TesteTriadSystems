package br.com.rodrigo.testetriadsystems.domain.dto;

public class BotsMessageDTO {

	private String idBots ; 
	private String data;
	private String from;
	private String text;
	
	public BotsMessageDTO() {
		
	}

	public BotsMessageDTO(String idBots, String data, String from, String text) {
		this.idBots = idBots;
		this.data = data;
		this.from = from;
		this.text = text;
	}

	public String getIdBots() {
		return idBots;
	}

	public String getData() {
		return data;
	}

	public String getFrom() {
		return from;
	}

	public String getText() {
		return text;
	}
	
	
	
	
}
