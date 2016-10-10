package campionato;

import java.util.Comparator;

public class GiocatoriComparator implements Comparator<Giocatore>{

	@Override
	public int compare(Giocatore g1, Giocatore g2) {
		
		int valReti = Integer.toString(g2.getReti()).compareTo(Integer.toString(g1.getReti()));
		
		return valReti;
	}

}
