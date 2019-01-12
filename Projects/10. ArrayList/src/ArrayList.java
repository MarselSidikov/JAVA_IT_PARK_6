public class ArrayList {
    // константа
    final int MAX_SIZE = 10;

    String lines[];

    int count;

    public ArrayList() {
        this.lines = new String[MAX_SIZE];
        this.count = 0;
    }
    void add(String line) {
        this.lines[count] = line;
        this.count++;
    }

    void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(this.lines[i]);
        }
    }
}
