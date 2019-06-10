package ueb09.fz;

public class Auto extends Kraftfahrzeug{

	private int sitze;
	private int tueren;

	public Auto(String hersteller, String modell, int ps, int hubraum, int tankvolumen, int sitze, int tueren, int zulGesamtGewicht) {
		super(hersteller, modell, ps, hubraum, tankvolumen, zulGesamtGewicht,
				new Scheibenbremse[]{
						new Scheibenbremse(),
						new Scheibenbremse(),
						new Scheibenbremse(),
						new Scheibenbremse()

				});

		this.sitze = sitze;
		this.tueren = tueren;

	}

	public String toString() {
		return super.toString()
				+ sitze + " Sitzen, "
				+ tueren + " Türen";
	}
}
