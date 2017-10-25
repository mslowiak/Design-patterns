package Builder;

public class Tile {
    private String color;
    private int x;
    private int y;
    private int level;

    public Tile(String color, int x, int y, int level) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
