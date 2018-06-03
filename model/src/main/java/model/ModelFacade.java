package model;

import java.io.IOException;

import model.element.mobile.Lorann;
import model.element.mobile.Mobile;
import model.element.mobile.Monster1;
import model.element.mobile.Monster2;


public class ModelFacade implements IModelFacade {

	   /** The road. */
    private ILevel  level;
    /** The my vehicle. */
    private IMobile lorann;
    
	private IMobile monster1;
	
	private IMobile monster2;

    private int MapLevel = 2;
    
    /**
     * Instantiates a new model.
     *
     * @param fileName
     *            the file name
     *            
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public ModelFacade(final String fileName) throws IOException {
    	
    	switch(MapLevel) {
    	case(1):
    		Mobile.setStartxLorann(1);
    		Mobile.setStartyLorann(10);
    		Mobile.setStartxMonster1(5);
    		Mobile.setStartyMonster1(5);
    		Mobile.setStartxMonster2(20);
    		Mobile.setStartyMonster2(8);
    	break;
		case(2):
			Mobile.setStartxLorann(4);
			Mobile.setStartyLorann(1);
			Mobile.setStartxMonster1(2);
			Mobile.setStartyMonster1(1);
			Mobile.setStartxMonster2(3);
			Mobile.setStartyMonster2(1);
	}
    	
        this.setLevel(new Level(fileName));
        this.setLorann(new Lorann(Mobile.StartxLorann, Mobile.StartyLorann, this.getLevel()));
        this.setMonster1(new Monster1(Mobile.StartxMonster1, Mobile.StartyMonster1, this.getLevel()));
        this.setMonster2(new Monster2(Mobile.StartxMonster2, Mobile.StartyMonster2, this.getLevel()));


        //Mobile.xMonster1++;
    }
    
    private void setMonster2(IMobile monster2) {
		this.monster2 = monster2;
	}

	/**
     * get level
     * @return level
     */
    @Override
    public final ILevel getLevel() {
        return this.level;
    }

    /**
     * Sets the level.
     *
     * @param level
     * 
     */
    private void setLevel(final ILevel level) {
        this.level = level;
    }

    /**
     * get lorann
     * 
     *@return lorann
     */
    @Override
    public final IMobile getLorann() {
        return this.lorann;
    }

    /**
     * Sets lorann.
     *
     * @param lorann
     *
     */
    private void setLorann(final IMobile lorann) {
        this.lorann = lorann;
    }

	public IMobile getMonster1() {
		return monster1;
	}

	private void setMonster1(IMobile monster1) {
		this.monster1 = monster1;
	}

	
	public IMobile getMonster2() {
		return monster2;
	}

    
    

}
