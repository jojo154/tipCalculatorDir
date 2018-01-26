package info.jonasfuller.tipcalculator;

/**
 * Created by Jonas Gaming PC on 1/25/2018.
 */

public class TipCalculator {
    private float tip;
    private float bill;

    public TipCalculator(float newTip, float newBill) {
        setTip(newTip);
        setBill(newBill);
    }

    public float getTip() {
        return tip;
    }

    public float getBill() {
        return bill;
    }

    public void setTip(float newTip) {
        if (newTip > 0)
            tip = newTip;
    }

    public void setBill(float newBill) {
        if (newBill > 0)
            bill = newBill;
    }

    public float tipAmount() {
        return bill * tip;
    }

    public float totalAmount() {
        return bill + tipAmount();
    }
}