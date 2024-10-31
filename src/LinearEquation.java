public class LinearEquation {
    private int x1, y1, x2, y2;
    private double slope;
    private double yIntercept;
    private double distance;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    double distance() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    double slope() {
            return (double) (y2 - y1) / (x2 - x1);
    }
    double yIntercept() {
        return y1 - slope * x1;
    }
    String equation() {
        if (x1 == x2) {
            return "dummy";
        } else if (y1 == y2) {
            return ("y = " + yIntercept());
        }
        return ("y = " + (y2 - y1) + "/"  + (x2 - x1) + " " + "x + " + yIntercept());
    }
    private double roundedToHundredth(double rounded) {
        return Math.round(rounded * 100) / 100.0;
    }
}
