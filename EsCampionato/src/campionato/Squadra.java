package campionato;

import java.util.Map;
import java.util.TreeMap;

public class Squadra {

	private String nome;
	private int punti;
	private int retiFatte;
	private int retiSubite;
	private int differenzaReti;
	private Map<String, Giocatore> giocatori = new TreeMap<String, Giocatore>();
	
	////GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public int getRetiFatte() {
		return retiFatte;
	}
	public void setRetiFatte(int retiFatte) {
		this.retiFatte = this.retiFatte + retiFatte;
	}
	public int getRetiSubite() {
		return retiSubite;
	}
	public void setRetiSubite(int retiSubite) {
		this.retiSubite = this.retiSubite + retiSubite;
	}
	public int getDifferenzaReti() {
		differenzaReti = retiFatte - retiSubite;
		return differenzaReti;
	}
	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}	
	public Map<String, Giocatore> getGiocatori() {
		return giocatori;
	}
	public void setGiocatori(Map<String, Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	
	
	
	/**
	 * COSTRUTTORI
	 */
	public Squadra(String nome, int punti, int retiFatte, int retiSubite,
			int differenzaReti) {
		super();
		this.nome = nome;
		this.punti = punti;
		this.retiFatte = retiFatte;
		this.retiSubite = retiSubite;
		this.differenzaReti = getDifferenzaReti();
	}
	
	public Squadra(){
		
	}
	
	
	/// TO STRING
	@Override
	public String toString() {
		return "Squadra [nome=" + nome + ", punti=" + punti + ", retiFatte="
				+ retiFatte + ", retiSubite=" + retiSubite
				+ ", differenzaReti=" + getDifferenzaReti() + "]\n";
	}
	
	
	
}
