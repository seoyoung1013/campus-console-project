package calculator_MVC;

public class calculatorMain {

	public static void main(String[] args) {
	    CalculatorModel model = new CalculatorModel();
	    CalculatorView view = new CalculatorView();
	    calculatorController controller = new calculatorController(model, view);

	    controller.calculate();
	}

}
