package ueb09.fz;

public class Motorrad extends Kraftfahrzeug{

	public Motorrad(String hersteller, String modell, int ps, int tankvolumen) {
		super(hersteller, modell, ps, 0, tankvolumen, 100,
				new Bremse[]{new Scheibenbremse(),
							new Trommelbremse()});
	}

	public void anlassen() {
		System.out.println("Starte Motor...");
	}


}
