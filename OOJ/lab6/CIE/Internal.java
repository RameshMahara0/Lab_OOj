package CIE;

public class Internal {
    public int[] marks = new int[5];

    public Internal(int[] marks) {
        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }
    }
}
