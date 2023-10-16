public class MutablePoint {

    private int x;
    private int y;

    private Planet planet;

    public MutablePoint(int x, int y, Planet planet) {
        this.x = x;
        this.y = y;
        this.planet = planet;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }


    @Override
    public String toString() {
        return "MutablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", planet=" + planet +
                '}';
    }
}
