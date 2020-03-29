package lab6;

public class Cube extends Solid{

    private double A;

    public Cube(double a) {
        A = a;
    }

    @Override
    public double GetVolume() {
        return A*A*A;
    }

}
