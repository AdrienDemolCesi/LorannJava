package main;
/*---*/
import java.io.IOException;

import controller.ControllerFacade;
import controller.IControllerFacade;
import model.IModelFacade;
import model.ModelFacade;
import view.IViewFacade;
import view.ViewFacade;

public class Main {
   
	public static void main(final String[] args) throws IOException, InterruptedException {
        final IModelFacade model = new ModelFacade("level.txt");
        final IViewFacade view = new ViewFacade(model.getLevel(), model.getLorann(), model);
        final IControllerFacade controller = new ControllerFacade(view, model);
        view.setOrderPerformer(controller.getOrderPeformer());
        controller.play();
    }
}
