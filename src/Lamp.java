public class Lamp {
    private String style;
    private boolean hasBattery;
    private int globRating;

    public Lamp(String style, boolean hasBattery, int globRating) {
        this.style = style;
        this.hasBattery = hasBattery;
        this.globRating = globRating;
    }
    public void turnOn() {
        System.out.println("Turning on the lamp");
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public String getStyle() {
        return style;
    }
}
