package demo.simulation;

public class Simulation {
	Battleground bg;
	
	public Simulation() {
		bg = new Battleground(5, 5);
	}
	
	public static void main(String[] args) {
		Simulation sim = new Simulation();
		
		int i = 0;
		while(sim.bg.iterate()) {
			System.out.println(i);
			i++;
		}
		
		//Awful line, but it works, and it works well.
		System.out.println(sim.bg.wolfInWolvesClothing.mass);
	}
}
