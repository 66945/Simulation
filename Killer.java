package demo.simulation;

import java.awt.Point;

public class Killer {
	Point pos;
	double mass;
	
	public Killer(int x, int y) {
		pos = new Point(x, y);
		mass = 1;
	}
	
	public void move(int xLim, int yLim) {
		int dir = (int) (Math.random() * 4);
		
		switch(dir) {
			case 0:
				if(pos.x > 0) {
					pos.x--;
					break;
				}
			case 1:
				if(pos.x < xLim - 1) {
					pos.x++;
					break;
				}
			case 2:
				if(pos.y > 0) {
					pos.y--;
					break;
				}
			case 3:
				if(pos.y < yLim - 1) {
					pos.y++;
					break;
				}
			default:
				System.out.println("Everything is death.");
		}
	}
	
	public void kill(InnocentPrey victem) {
		mass += victem.getMass();
		victem.die();
	}
}
