package assesment;

import java.text.DecimalFormat;

class Batsmans {
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int fours;
	private int sixes;
	private int id;

	private static int idGenerator = 100000;

	public Batsmans(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		this.id = ++idGenerator;
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
	}

	public float getStrikeRate() {

		return (this.runsScored / 100) * this.ballsFaced;
	}

	public int getRunsScoredInBoundaries() {
		return (this.fours * 4) + (this.sixes * 6);
	}

	public String getName() {
		return name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public int getFours() {
		return fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

}

public class T2_batsman {
	public static void main(String[] args) {
		Batsmans b1 = new Batsmans("AB de Villers", 687, 1, 6, 407, 57, 37);

	}
}
