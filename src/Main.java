import java.util.Scanner;
import calculator_MVC.CalculatorController;
import gugudan.GugudanController;
import star.StarController;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. 계산기");
            System.out.println("2. 구구단");
            System.out.println("3. 별 프로그램");
            System.out.println("0. 종료");
            System.out.print("원하는 프로그램을 선택하세요: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runCalculator();
                    break;
                case 2:
                	gugudan();
                    break;
                case 3:
                	runStarProgram();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }

            System.out.println();
        } while (choice != 0);
    }

    public static void runCalculator() {
    	CalculatorController calculatorController = new CalculatorController();
        calculatorController.start();
    }

    public static void gugudan() {
        GugudanController GugudanController = new GugudanController();
        GugudanController.runGugudan();
    }

    public static void runStarProgram() {
        StarController StarController = new StarController();
        StarController.start();
    }
}
