package main;

import campionato.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import campionato.*;

public class MainCampionato {

	public static void main(String[] args) throws Exception {
		
		Campionato c = new Campionato();
		Giocatore g = new Giocatore();
		Squadra s = new Squadra();
		Partita p = new Partita();
		ServizioCampionato sc = new ServizioCampionato();
		Date d = new Date();
		
		
		///REGISTRA GIOCATORE		
		Giocatore g1 = sc.registraGiocatore(c, "Francesco", "Totti", "FRNTTT76I27R", 40, 4000000);
		Giocatore g2 = sc.registraGiocatore(c, "Francesco", "Totti", "FRNTTT76I27R", 40, 4000000);
		Giocatore g3 = sc.registraGiocatore(c, "Gianluigi", "Buffon", "GNGBFN78I2MC", 38, 5000000);
		Giocatore g4 = sc.registraGiocatore(c, "Mattia", "De Sciglio", "MTTDSC92H28MI", 23, 3000000);
		Giocatore g5 = sc.registraGiocatore(c, "Manuel", "Locatelli", "MNLLCT98D24MI", 18, 600000);
		Giocatore g6 = sc.registraGiocatore(c, "Stephan", "El Shaarawy", "STPELS92H20", 23, 3000000);
		
		///STAMPA GIOCATORI
		System.out.println("\n\n***STAMPA GIOCATORI***\n");
		for (Map.Entry<String, Giocatore> mapG : c.getMapGiocatori().entrySet()){
			System.out.println(mapG.getValue());
		}
		
		System.out.println();
		
		
		////REGISTRA SQUADRA
		Squadra s1 = sc.registraSquadre(c, "Milan");
		Squadra s2 = sc.registraSquadre(c, "Napoli");
		Squadra s3 = sc.registraSquadre(c, "Roma");
		Squadra s4 = sc.registraSquadre(c, "Juventus");
		Squadra s5 = sc.registraSquadre(c, "Inter");
		Squadra s6 = sc.registraSquadre(c, "Lazio");
		Squadra s7 = sc.registraSquadre(c, "Fiorentina");
		Squadra s8 = sc.registraSquadre(c, "Sassuolo");
		
		
		
		
		////STAMPA SQUADRE
		System.out.println("***STAMPA SQUADRE***");
		for (Squadra sq : c.getSquadre()){
			System.out.println(sq);
		}
		
		
		////ASSEGNA GIOCATORE
		System.out.println("\n\n***ASSEGNA GIOCATORE****");
		
		if (sc.assegnaGiocatore(c, g1, c.getSquadre().get(2))){
			System.out.println("Vero");
		} else {
			System.out.println("Flaso");
		}
		sc.assegnaGiocatore(c, g4, c.getSquadre().get(0));
		sc.assegnaGiocatore(c, g5, c.getSquadre().get(0));
		sc.assegnaGiocatore(c, g6, s3);
		
		
		///STAMPIAMO I GIOCATORI DELLE RISPETTIVE SQUADRE
		System.out.println("\n\n***GIOCATORI DELLE SQUADRE***");
		for (int i=0; i<c.getSquadre().size(); i++){
			System.out.println(c.getSquadre().get(i).getNome() + " --- " + c.getSquadre().get(i).getGiocatori());
		}
		
		
		////REGISTRIAMO LA PARTITA
		System.out.println("***REGISTRA PARTITA***");
		
		/// data
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Calendar calendar = new GregorianCalendar();
		calendar.set(2011, 1, 28);	//fine data			
		
		
		System.out.println("\n PARTITA 1 \n");
		/// ammoniti ed espulsi
		List<Giocatore> ammoniti = new ArrayList<Giocatore>();
		Set<Giocatore> espulsi = new LinkedHashSet<Giocatore>();		
		
		///reti segnate				
		List<Giocatore> retiFatte = new ArrayList<Giocatore>(Arrays.asList(g5, g4, g4, g5, g5, g5)); 		  
		Partita p1 = sc.registraPartita(c, s1, s2, 5, 1, sdf.format(calendar.getTime()), retiFatte, ammoniti, espulsi);	
		retiFatte.removeAll(retiFatte); /// rimuovo gli ammoniti, gli espulsi ed i marcatori dalle rispettive liste
		ammoniti.removeAll(ammoniti);
		espulsi.removeAll(espulsi);
		
		
		/// partita 2
		System.out.println("\n PARTITA 2 \n");
		calendar.set(2011,4,23);		
		espulsi.add(g4);
		ammoniti = new ArrayList<Giocatore>(Arrays.asList(g5, g4));
		retiFatte = new ArrayList<Giocatore>(Arrays.asList(g5,g4));		/// aggiungo i marcatori della corrente partita
		Partita p2 = sc.registraPartita(c, s1, s3, 2, 0, sdf.format(calendar.getTime()), retiFatte, ammoniti, espulsi);	
		retiFatte.removeAll(retiFatte);
		espulsi.removeAll(espulsi);
		ammoniti.removeAll(ammoniti);
				
		
		/// partita 3
		System.out.println("\n PARTITA 3 \n");
		calendar.set(2011,2,11);		
		retiFatte = new ArrayList<Giocatore>(Arrays.asList(g1,g1,g1)); 
		Partita p3 = sc.registraPartita(c, s3, s2, 3, 0, sdf.format(calendar.getTime()), retiFatte, ammoniti, espulsi);
		retiFatte.removeAll(retiFatte);
		
		
		/// partita 4
		System.out.println("\n PARTITA 4 \n");
		calendar.set(2011, 4, 8);
		retiFatte = new ArrayList<Giocatore>(Arrays.asList(g6, g6));
		ammoniti.add(g6);
		Partita p4 = sc.registraPartita(c, s3, s1, 2, 0, sdf.format(calendar.getTime()), retiFatte, ammoniti, espulsi);
		retiFatte.removeAll(retiFatte); 
		ammoniti.removeAll(ammoniti);
		espulsi.removeAll(espulsi);
		
		//// CAMPIONE
		
		s4.setDifferenzaReti(-14);
		s3.setRetiFatte(1);
		
		System.out.println("\n\n *** CAMPIONE ***");
		Squadra campione = sc.getCampione(c);
		System.out.println("CAMPIONE\n" + campione);
		
		
		//// CAPOCANNONIERE	
		System.out.println("\n\n *** CAPOCANNONIERE ***");
		Giocatore capocannoniere = sc.getCapocannoniere(c);
		System.out.println("\nCAPOCANNONIERE\n" + capocannoniere.getNome() + " " + capocannoniere.getCognome() + " " + capocannoniere.getReti() + " reti");
			

	}
}
