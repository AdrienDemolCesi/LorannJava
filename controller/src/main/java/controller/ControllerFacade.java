package controller;

import java.io.IOException;

import model.IModelFacade;
import model.Permeability;
import view.IViewFacade;

public class ControllerFacade implements IControllerFacade, IOrderPerformer {

    /** The Constant speed of the thread. */
    private static final int speed = 150;
    
    int i = 0;
    int i2 = 0;
    
	int i3=1;

    /** The view. */
    private IViewFacade view;

    /** The model. */
    private static IModelFacade model;

    /** The stack order. */
    private UserOrder stackOrder;
    	
    /**
     * Instantiates a new Lorann controller.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
	public ControllerFacade(final IViewFacade view, final IModelFacade model) {
		this.setView(view);
	    this.setModel(model);
	    this.clearStackOrder();
	}
	/**
	 * Drive the game, player movement and threading
	 */
	@Override
	public void play() throws InterruptedException {
		getModel().getLorann().alive();
		
		while (this.getModel().getLorann().isAlive()) {
            Thread.sleep(speed);
            
            
            this.Monster1Move();
            this.Monster2Move();
            this.LorannisFacingMonster();
            
            switch (this.getStackOrder()) {
                case RIGHT:
                	this.getModel().getLorann().moveRight();
                    break;
                case LEFT:
                	this.getModel().getLorann().moveLeft();
                    break;
                case UP:
                	this.getModel().getLorann().moveUp();
                    break;
                case DOWN:
                	this.getModel().getLorann().moveDown();
                    break;
                case DOWNRIGHT:
                	this.getModel().getLorann().moveDownRight();
                    break;
                case UPRIGHT:
                	this.getModel().getLorann().moveUpRight();
                    break;
                case DOWNLEFT:
                	this.getModel().getLorann().moveDownLeft();
                    break;
                case UPLEFT:
                	this.getModel().getLorann().moveUpLeft();

                    break;
                case SHOOT:
                	this.getModel().getLorann().doNothing();

                    break;
                case NOP:
                   
                switch(i) {
                case(0):  
                	this.getModel().getLorann().doNothing();
                break;
                case(1):  
                	this.getModel().getLorann().doNothingUpLeft();
                break;
                case(2):  
                	this.getModel().getLorann().doNothingUp();
                break;
                case(3):  
                	this.getModel().getLorann().doNothingUpRight();
                break;
                case(4):  
                	this.getModel().getLorann().doNothingRight();
                break;
                case(5):  
                	this.getModel().getLorann().doNothingDownRight();
                break;
                case(6):  
                	this.getModel().getLorann().doNothingDown();
                break;
                case(7):  
                	this.getModel().getLorann().doNothingDownLeft();
                i=0;
                break;
                }
                i++;
                    break;
                default:
                    this.getModel().getLorann().doNothing();
                    break; 
            }
            this.clearStackOrder();
        }
        this.getView().displayMessage("You died");
	}
    /**
     * Write the UserOrder in the stack of order (stackOrder)
     */
	@Override
	public void orderPerform(UserOrder userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}
	
    /**
     * Gets the view.
     *
     * @return the view
     */
    private IViewFacade getView() {
        return this.view;
    }
    
    /**
     * Sets the view.
     *
     * @param view
     *            the view to set
     */
    private void setView(final IViewFacade view) {
        this.view = view;
    }
    
    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModelFacade getModel() {
        return ControllerFacade.model;
    }
    
    /**
     * Sets the model.
     *
     * @param model
     *            the model to set
     */
    private void setModel(final IModelFacade model) {
        ControllerFacade.model = model;
    }
    
    /**
     * Gets the stack order.
     *
     * @return the stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     *
     * @param stackOrder
     *            the new stack order
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NOP;
    }

   /**
    * Get the order to perform
    */
    @Override
    public IOrderPerformer getOrderPeformer() {
        return this;
    }
    
    /*public Boolean OnPurse() {
        return getModel().getLorann().getLevel().getOnTheLevelXY(getModel().getLorann().getX(), getModel().getLorann().getY()).getPermeability() == Permeability.GOLD;
    }
    public void GetGold() {
    	gold++;
    	System.out.println("Golds : "+gold);
    	//Tile tile = new Tile();
    	//tile.setX()this.getX());
    	//remove the purse
    	//...
    }*/
    
    public Boolean isFacingMonster() {
        return getModel().getLorann().getX() == getModel().getMonster1().getX() && getModel().getLorann().getY() == getModel().getMonster1().getY() || getModel().getLorann().getX() == getModel().getMonster2().getX() && getModel().getLorann().getY() == getModel().getMonster2().getY();
    }
    
    public void LorannisFacingMonster() {
        if(this.isFacingMonster()) {
        	getModel().getLorann().Die();
        }
        /*if(this.OnPurse()) {
        	GetGold();
        }*/
    }
    

	private void Monster1Move() {
		
		if(this.getModel().getLorann().getX() > this.getModel().getMonster1().getX()) {
			this.getModel().getMonster1().moveRight();

		}
		if(this.getModel().getLorann().getX() < this.getModel().getMonster1().getX()) {
			this.getModel().getMonster1().moveLeft();

		}
		if(this.getModel().getLorann().getY() < this.getModel().getMonster1().getY()) {
			this.getModel().getMonster1().moveUp();

		}
		if(this.getModel().getLorann().getY() > this.getModel().getMonster1().getY()) {
			this.getModel().getMonster1().moveDown();
		}
	}
	
	private void Monster2Move() {
	            if(i3>0 && i3<4) {
	            	this.getModel().getMonster2().moveRight();
	            i3++;
	            }
	    		if(i3>3 && i3<7) {
	    			this.getModel().getMonster2().moveLeft();
	               i3++;
	    		}
	    		if(i3>=7) {
	    			i3=1;
	    		}
	}
}


