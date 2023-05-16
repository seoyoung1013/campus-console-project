package calculator_MVC;

import java.util.Scanner;

public class CalculatorController {
	private CalculatorModel model;
	private CalculatorView view;

	double result;

	public CalculatorController() {
		model = new CalculatorModel();
		view = new CalculatorView();
	}

	public void start() {
		Scanner scanner = new Scanner(System.in);

		double num1, num2;
		System.out.print("첫 번째 숫자를 입력하세요: ");
		num1 = scanner.nextDouble();
		System.out.print("두 번째 숫자를 입력하세요: ");
		num2 = scanner.nextDouble();

		char Element;
		System.out.println("원하는 계산을 작성하세요: ");
		Element = scanner.next().charAt(0);



		if (Element == '+') {

			result = model.add(num1, num2);
			view.showResult(result);
		}
		else if (Element == '-') {
			result = model.subtract(num1, num2);
			view.showResult(result);
		}
		if (Element == '*') {
			result = model.multiply(num1, num2);
			view.showResult(result);
		}
		if (Element == '/') {
			result = model.divide(num1, num2);
			view.showResult(result);
		}
	}
}
