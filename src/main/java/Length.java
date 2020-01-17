public class Length {
    public static final String UNIT_F = "f";
    public static final String UNIT_YARD = "yard";
    public static final String UNIT_INCH = "inch";
    private final double value;
    private final String unit;

    public Length(double val, String unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(String unit) {
        Length len = this;
        if (this.unit.equals(UNIT_F)) {
            if (unit.equals(UNIT_YARD)) {
                len = new Length(this.value / 3, unit);
            } else if (unit.equals(UNIT_INCH)) {
                len = new Length(this.value * 12, unit);
            }
        }

        if (this.unit.equals(UNIT_YARD)) {
            if (unit.equals(UNIT_INCH)) {
                len = new Length(this.value * 36, unit);
            } else if (unit.equals(UNIT_F)){
                len = new Length(this.value * 3, unit);
            }
        }

        if (this.unit.equals(UNIT_INCH)) {
            if (unit.equals(UNIT_F)) {
                len = new Length(this.value / 12, unit);
            } else if (unit.equals(UNIT_YARD)) {
                len = new Length(this.value / 36, unit);
            }
        }

        return len;
    }

    public double getVal() {
        return this.value;
    }

    public String getUinnt() {
        return this.unit;
    }
}
