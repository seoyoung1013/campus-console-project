package star;

import java.util.Scanner;

public class StarController {
	private StarModel model;
	private StarView view;

	public StarController() {
		this.model = new StarModel();
		this.view = new StarView();
	}

	public void start() {
		StarController controller = new StarController();
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("별의 크기를 입력하세요: ");
		size = scanner.nextInt();

		model.setSize(size);
		controller.displayPatterns();
	}

	public void displayPatterns() {

		String trianglePattern = generateTrianglePattern();
		String invertedTrianglePattern = generateInvertedTrianglePattern();
		String diamondPattern = generateDiamondPattern();
		String invertedDiamondPattern = generateInvertedDiamondPattern();
		String rhombusPattern = generateRhombusPattern();
		
		view.displayPattern("직삼각형 패턴:");
        view.displayPattern(trianglePattern);

        view.displayPattern("역삼각형 패턴:");
        view.displayPattern(invertedTrianglePattern);

        view.displayPattern("다이아몬드 패턴:");
        view.displayPattern(diamondPattern);

        view.displayPattern("역다이아몬드 패턴:");
        view.displayPattern(invertedDiamondPattern);

        view.displayPattern("마름모 패턴:");
        view.displayPattern(rhombusPattern);
    
	}

	private String generateTrianglePattern() {
		StringBuilder pattern = new StringBuilder();

		int size = model.getSize();

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

	private String generateInvertedTrianglePattern() {
		StringBuilder pattern = new StringBuilder();

		int size = model.getSize();

		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

	private String generateDiamondPattern() {
		StringBuilder pattern = new StringBuilder();

		int size = model.getSize();

		for (int i = 1; i <= size; i++) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		for (int i = size - 1; i >= 1; i--) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

	private String generateInvertedDiamondPattern() {
		StringBuilder pattern = new StringBuilder();

		int size = model.getSize();

		for (int i = size; i >= 1; i--) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		for (int i = 2; i <= size; i++) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

	private String generateRhombusPattern() {
		StringBuilder pattern = new StringBuilder();

		int size = model.getSize();

		for (int i = 1; i <= size; i++) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		for (int i = size - 1; i >= 1; i--) {
			for (int j = size - i; j > 0; j--) {
				pattern.append("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				pattern.append("* ");
			}
			pattern.append("\n");
		}

		return pattern.toString();
	}

}
