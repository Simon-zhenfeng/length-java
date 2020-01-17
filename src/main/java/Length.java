public class Length {
    private final double value;
    private final String unit;

    public Length(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Length as(String targetUnit) {
        Length result = this;
        if (this.unit.equals(UnitEnum.f.name())) {
            if (targetUnit.equals(UnitEnum.yard.name())) {
                result = new Length(this.value / 3, targetUnit);
            } else if (targetUnit.equals(UnitEnum.inch.name())) {
                result = new Length(this.value * 12, targetUnit);
            }
        }

        if (this.unit.equals(UnitEnum.yard.name())) {
            if (targetUnit.equals(UnitEnum.inch.name())) {
                result = new Length(this.value * 36, targetUnit);
            } else if (targetUnit.equals(UnitEnum.f.name())){
                result = new Length(this.value * 3, targetUnit);
            }
        }

        if (this.unit.equals(UnitEnum.inch.name())) {
            if (targetUnit.equals(UnitEnum.f.name())) {
                result = new Length(this.value / 12, targetUnit);
            } else if (targetUnit.equals(UnitEnum.yard.name())) {
                result = new Length(this.value / 36, targetUnit);
            }
        }

        return result;
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }
}
