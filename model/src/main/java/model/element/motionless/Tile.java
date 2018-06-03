package model.element.motionless;

import model.Permeability;
import model.element.Sprite;

public class Tile extends MotionlessElement {
	   /** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite(' ', "BlackTile.jpg");

    /**
     * Instantiates a new tile.
     */
    public Tile() {
        super(SPRITE, Permeability.PENETRABLE);
    }
}
