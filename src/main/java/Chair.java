public class Chair {
    private int legs = 4;
    private String material = "wood";

    public Chair() {}

    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    public Chair(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getMaterial() {
        return this.material;
    }
}
