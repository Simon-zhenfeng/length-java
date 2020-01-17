public class Length {
    private final double value;
    private final String unit;

    public Length(double val, String unit) {
        this.value = val;
        this.unit = unit;
    }

    public Length as(String unit) {
        Length convertLengthObject = this;
        if (this.unit.equals("f")) {
            if (unit.equals("yard")) {
                convertLengthObject = new Length(this.value / 3, unit);
            } else if (unit.equals("inch")) {
                convertLengthObject = new Length(this.value * 12, unit);
            }
        }

        if (this.unit.equals("yard")) {
            if (unit.equals("inch")) {
                convertLengthObject = new Length(this.value * 36, unit);
            } else if (unit.equals("f")){
                convertLengthObject = new Length(this.value * 3, unit);
            }
        }

        if (this.unit.equals("inch")) {
            if (unit.equals("f")) {
                convertLengthObject = new Length(this.value / 12, unit);
            } else if (unit.equals("yard")) {
                convertLengthObject = new Length(this.value / 36, unit);
            }
        }

        return convertLengthObject;
    }

    public double getVal() {
        return this.value;
    }

    public String getUinnt() {
        return this.unit;
    }
}
