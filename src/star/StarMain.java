package star;

import java.util.*;

public class StarMain {
    public static void main(String[] args) {
        StarModel model = new StarModel();
        StarView view = new StarView();
        StarController controller = new StarController(model, view);

        // 별의 크기를 입력받기 위한 Scanner
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("별의 크기를 입력하세요: ");
        size = scanner.nextInt();

        model.setSize(size);
        controller.displayPatterns();
    }
}
