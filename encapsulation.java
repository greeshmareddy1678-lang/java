
class Cube {
    private double side;

    public void setSide(double s) {
        side = s;
    }

    public double getVolume() {
        return side * side * side;
    }
}

class encapsulation {
    public static void main(String[] args) {
        Cube c = new Cube();
        c.setSide(5);

        System.out.println("Volume of Cube: " + c.getVolume());
    }
}
