package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
private Innlegg[] innleggstabell;
private int nesteledig;

	public Blogg() {
		innleggstabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig=0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int indeks = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				
				indeks=i;
			}
		}
		return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i] != null && (innleggstabell[i].erLik(innlegg))) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		
		for (int i = 0; i < innleggstabell.length; i++) {	
			if (innleggstabell[i] == null) {
				return true;
			}
		}
		return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(ledigPlass() == true ) {
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
			}
			return false;
		}
	
	
	public String toString() {
		String str = nesteledig +"\n"+"";
		for (int i = 0; i < nesteledig; i++) {
			str += innleggstabell[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
