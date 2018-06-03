package view;

import controller.IOrderPerformer;

public interface IViewFacade {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);



	void setOrderPerformer(IOrderPerformer orderPeformer);
}
