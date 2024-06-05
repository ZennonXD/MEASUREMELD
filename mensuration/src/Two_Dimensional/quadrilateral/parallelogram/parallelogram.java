package Two_Dimensional.quadrilateral.parallelogram;

interface ParallelogramFormula {
    double parallelogramarea();
    double parallelogramperimeter();
}

// Class for Parallelogram
class Parallelogram implements ParallelogramFormula {
    private double base;
    private double side;
    private double height;

    // Constructor
    public Parallelogram(double base, double side, double height) {
        this.base = base;
        this.side = side;
        this.height = height;
    }

    // Method to calculate the area of the parallelogram
    @Override
    public double parallelogramarea() {
        return base * height;
    }

    // Method to calculate the perimeter of the parallelogram
    @Override
    public double parallelogramperimeter() {
        return 2 * (base + side);
    }

    // Method to calculate the length of the diagonals using the law of cosines
    public double parallelogramDiagonal1(double angle) {
        return Math.sqrt(base * base + side * side - 2 * base * side * Math.cos(Math.toRadians(angle)));
    }

    public double parallelogramDiagonal2(double angle) {
        return Math.sqrt(base * base + side * side + 2 * base * side * Math.cos(Math.toRadians(angle)));
    }
}