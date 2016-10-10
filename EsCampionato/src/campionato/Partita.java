package campionato;

import java.util.Date;

public class Partita {

	private String data;
	private Squadra squadraCasa;
	private Squadra squadraOspite;
	private int retiCasa;
	private int retiOspite;
	private char risultato;
	
	
	///GETTERS AND SETTERS
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Squadra getSquadraCasa() {
		return squadraCasa;
	}
	public void setSquadraCasa(Squadra squadraCasa) {
		this.squadraCasa = squadraCasa;
	}
	public Squadra getSquadraospite() {
		return squadraOspite;
	}
	public void setSquadraospite(Squadra squadraospite) {
		this.squadraOspite = squadraospite;
	}
	public int getRetiCasa() {
		return retiCasa;
	}
	public void setRetiCasa(int retiCasa) {
		this.retiCasa = retiCasa;
	}
	public int getRetiOspite() {
		return retiOspite;
	}
	public void setRetiOspite(int retiOspite) {
		this.retiOspite = retiOspite;
	}
	public char getRisultato() {
		return risultato;
	}
	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}
	
	
	
	/**
	 * COSTRUTTORI
	 */
	public Partita(String data2, Squadra squadraCasa, Squadra squadraOspite,
			int retiCasa, int retiOspite, char risultato) {
		super();
		this.data = data2;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiCasa = retiCasa;
		this.retiOspite = retiOspite;
		this.risultato = risultato;
	}
	
	
	public Partita(){
		
	}
	
	
	
	
}
