public class Square {
    private boolean occupied;

    public Square() {
        occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void unoccupy() {
        occupied = false;
    }
}
