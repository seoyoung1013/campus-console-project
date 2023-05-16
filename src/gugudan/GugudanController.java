package gugudan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GugudanController {
    private GugudanModel model;
    private GugudanView view;


    public GugudanController() {
    	this.model = new GugudanModel();
        this.view = new GugudanView();
	}

	public void runGugudan() {
        int number = getInputNumber();

        model.setNumber(number);
        int[] gugudan = model.calculateGugudan();
        view.displayGugudan(gugudan);
    }

    private int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            System.out.print("구구단을 계산할 숫자를 입력하세요 (1부터 999까지): ");
            number = scanner.nextInt();

            if (number < 1 || number > 999) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            view.displayError("올바른 범위의 숫자를 입력해주세요 (1부터 999까지).");
            return getInputNumber();
        }

        return number;
    }
}
