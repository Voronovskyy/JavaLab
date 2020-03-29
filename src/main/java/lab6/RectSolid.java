package lab6;

public class RectSolid extends Solid {

    private double C;
    private double D;
    private double H;

    public RectSolid(double c, double d, double h) {
        C = c;
        D = d;
        H = h;
    }

    @Override
    public double GetVolume() {
        return C*D*H;
    }
}
