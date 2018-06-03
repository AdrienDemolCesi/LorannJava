package model.element.motionless;

import model.Permeability;
import model.element.Sprite;

public class Gate extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('H', "gate_closed.png");

	 /**
	  * Instantiates a new gate.
	  */
	 Gate() {
	     super(SPRITE, Permeability.KILL);
	 }
}