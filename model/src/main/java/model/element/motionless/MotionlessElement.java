package model.element.motionless;

import model.IElement;
import model.Permeability;
import model.element.Element;
import model.element.Sprite;

public class MotionlessElement extends Element implements IElement  {

	   /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }
}
