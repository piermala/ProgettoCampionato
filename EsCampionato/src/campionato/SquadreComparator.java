package campionato;

import java.util.Comparator;

public class SquadreComparator implements Comparator<Squadra>{

	@Override
	public int compare(Squadra s1, Squadra s2) {
		/// confontiamo prima i punti
		int valPunti = Integer.toString(s2.getPunti()).compareTo(Integer.toString(s1.getPunti()));
		int valDifferenzaReti = -1;
		int valDifferenzaRetiFatte = -1;
		if (valPunti == 0){
			valDifferenzaReti = s2.getDifferenzaReti() - s1.getDifferenzaReti(); 
		} else {
			return valPunti;
		}	
		
		//confrontiamo la differenza reti, nel caso i punti dovessero essere uguali
		if (valDifferenzaReti == 0){
			valDifferenzaRetiFatte = s2.getRetiFatte() - s1.getRetiFatte();
		} else {
			return valDifferenzaReti;
		}
		
		if (valDifferenzaRetiFatte == 0){
			return valDifferenzaRetiFatte;
		} else {
			return valDifferenzaRetiFatte;
		}
	}

	
}
