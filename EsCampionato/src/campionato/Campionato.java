package campionato;
import java.util.*;


public class Campionato {

	private static final String nome = "SERIE A";
	private static final int numSquadre = 20;	
	private List<Squadra> squadre = new ArrayList<Squadra>();
	private List<Partita> partite = new ArrayList<Partita>();
	private Map<String, Giocatore> mapGiocatori = new TreeMap<String, Giocatore>();
	private Map<String, Giocatore> marcatori = new TreeMap<String, Giocatore>();
	
	
	////GETTERS AND SETTERS
	public int getNumSquadre() {
		return numSquadre;
	}
	public List<Squadra> getSquadre() {
		return squadre;
	}
	public void setSquadre(List<Squadra> squadre) {
		this.squadre = squadre;
	}
	public List<Partita> getPartite() {
		return partite;
	}
	public void setPartite(List<Partita> partite) {
		this.partite = partite;
	}
	public Map<String, Giocatore> getMapGiocatori() {
		return mapGiocatori;
	}
	public void setMapGiocatori(Map<String, Giocatore> mapGiocatori) {
		this.mapGiocatori = mapGiocatori;
	}
	public static String getNome() {
		return nome;
	}
	public Map<String, Giocatore> getMarcatori() {
		return marcatori;
	}
	public void setMarcatori(Map<String, Giocatore> marcatori) {
		this.marcatori = marcatori;
	}
	
	
	
	
}
