package model;

public class ImagePosition {
    private int pos1 = 0;
    private int pos2 = 0;

    public int get_pos1() {
        return pos1;
    }
    public int get_pos2() {
        return pos2;
    }
    public void move_pos1() {
        pos1 = pos1 - 1;
    }
    public void move_pos2() {
        pos2 = pos2 - 1;
    }
    public void set_pos1(int pos1) {
        this.pos1 = pos1;
    }
    public void set_pos2(int pos2) {
        this.pos2 = pos2;
    }
}
