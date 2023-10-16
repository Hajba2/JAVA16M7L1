public class ImmutableLine {

    private final int lineIndex;
    private final String name;
    private final MutablePoint pStart;
    private final MutablePoint pEnd;

    public ImmutableLine(MutablePoint pStart, MutablePoint pEnd, String name, int lineIndex) {
        this.pStart = new MutablePoint(pStart.getX(), pStart.getY(), new Planet(pStart.getPlanet().getName()));
        this.pEnd = new MutablePoint(pEnd.getX(), pEnd.getY(), new Planet(pEnd.getPlanet().getName()));
        this.name = name;
        this.lineIndex = lineIndex;
    }

    public double getLineLength() {
        return Math.hypot(pStart.getX() - pEnd.getX(), pStart.getY() - pEnd.getY());
    }

    public MutablePoint getpStart() {
        return new MutablePoint(pStart.getX(), pStart.getY(), new Planet(pStart.getPlanet().getName()));
    }

    public MutablePoint getpEnd() {
        return new MutablePoint(pEnd.getX(), pEnd.getY(), new Planet(pEnd.getPlanet().getName()));
    }

    @Override
    public String toString() {
        return "ImmutableLine{" +
                "lineIndex=" + lineIndex +
                ", name='" + name + '\'' +
                ", pStart=" + pStart +
                ", pEnd=" + pEnd +
                '}';
    }
}
