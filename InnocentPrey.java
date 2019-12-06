package demo.simulation;

public class InnocentPrey {
	boolean alive;
	double mass;
	
	public InnocentPrey() {
		alive = true;
		mass = 1;
	}
	
	public void die() {
		System.out.println("Blood");
		alive = false;
		mass = 0;
	}
	
	public double getMass() { return mass; }
}
