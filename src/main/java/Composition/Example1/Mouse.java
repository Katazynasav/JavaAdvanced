package Composition.Example1;

public class Mouse {
    private int mousePrice;
    private int buttonCount;
    private boolean optical;

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public boolean isOptical() {
        return optical;
    }

    public void setOptical(boolean optical) {
        this.optical = optical;
    }

    public int getMousePrice() {
        return mousePrice;
    }

    public void setMousePrice(int mousePrice) {
        this.mousePrice = mousePrice;
    }

    @Override
    public String toString() {
        return "Mouse {" +
                "buttonCount = " + buttonCount +
                ", optical = " + optical +
                '}';
    }
}
