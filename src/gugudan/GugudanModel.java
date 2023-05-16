package gugudan;

public class GugudanModel {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int[] calculateGugudan() {
        int[] gugudan = new int[9];

        for (int i = 0; i < 9; i++) {
            gugudan[i] = number * (i + 1);
        }

        return gugudan;
    }
}
