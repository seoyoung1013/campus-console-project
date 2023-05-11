package gugudan;

public class GugudanView {
    public void displayGugudan(int[] gugudan) {
        System.out.println("구구단 결과:");
        for (int i = 0; i < 9; i++) {
            System.out.println(gugudan + " * " + i + gugudan[i]);
        }
    }

    public void displayError(String message) {
        System.out.println("오류 발생: " + message);
    }
}
