package campionato;

public class Giocatore {

	private String nome;
	private String cognome;
	private int età;
	private double stipendio;
	private int ammonizioni;
	private int espulsioni;
	private int reti;
	private int assist;
	private String codiceFiscale;
	private Squadra squadra = new Squadra();
	
	
	////GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public int getAmmonizioni() {
		return ammonizioni;
	}
	public void setAmmonizioni(int ammonizioni) {
		this.ammonizioni = ammonizioni;
	}
	public int getEspulsioni() {
		return espulsioni;
	}
	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}
	public int getReti() {
		return reti;
	}
	public void setReti(int reti) {
		this.reti = reti;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	
	
	
	/**
	 * COSTRUTTORI
	 */
	public Giocatore(String nome, String cognome, int età, double stipendio,
			int ammonizioni, int espulsioni, int reti, int assist,
			String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.stipendio = stipendio;
		this.ammonizioni = ammonizioni;
		this.espulsioni = espulsioni;
		this.reti = reti;
		this.assist = assist;
		this.codiceFiscale = codiceFiscale;
	}
	
	
	public Giocatore(){
		
	}
	
	
	@Override
	public String toString() {
		return nome + " " + cognome;
	}
	
	public Squadra getSquadra() {
		return squadra;
	}
	public void setSquadra(Squadra squadra) {
		this.squadra = squadra;
	}
	
	
	
	
	
}
