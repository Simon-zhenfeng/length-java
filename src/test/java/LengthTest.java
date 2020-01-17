import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        Length result = new Length(1, UnitEnum.inch.name()).as(UnitEnum.inch.name());

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(UnitEnum.inch.name()));
    }

    @Test
    public void should_2_feet_equals_2_feet() {
        Length result = new Length(2, UnitEnum.f.name()).as(UnitEnum.f.name());

        assertThat(result.getValue(), is(2.0));
        assertThat(result.getUnit(), is(UnitEnum.f.name()));
    }

    @Test
    public void should_1_yard_equals_1_yard() {
        Length result = new Length(1, UnitEnum.yard.name()).as(UnitEnum.yard.name());

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(UnitEnum.yard.name()));
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        Length result = new Length(1, UnitEnum.f.name()).as(UnitEnum.inch.name());

        assertThat(result.getValue(), is(12.0));
        assertThat(result.getUnit(), is(UnitEnum.inch.name()));
    }

    @Test
    public void should_3_foot_equals_1_yard() {
        Length result = new Length(3, UnitEnum.f.name()).as(UnitEnum.yard.name());

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(UnitEnum.yard.name()));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        Length result = new Length(1, UnitEnum.yard.name()).as(UnitEnum.f.name());

        assertThat(result.getValue(), is(3.0));
        assertThat(result.getUnit(), is(UnitEnum.f.name()));
    }

    @Test
    public void should_1_yard_equals_36_inches() {
        Length result = new Length(1, UnitEnum.yard.name()).as(UnitEnum.inch.name());

        assertThat(result.getValue(), is(36.0));
        assertThat(result.getUnit(), is(UnitEnum.inch.name()));
    }

    @Test
    public void should_2_yards_equals_72_inches() {
        Length result = new Length(2, UnitEnum.yard.name()).as(UnitEnum.inch.name());

        assertThat(result.getValue(), is(72.0));
        assertThat(result.getUnit(), is(UnitEnum.inch.name()));
    }

    @Test
    public void should_12_inches_equals_1_foot() {
        Length result = new Length(12, UnitEnum.inch.name()).as(UnitEnum.f.name());

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(UnitEnum.f.name()));
    }

    @Test
    public void should_36_inches_equals_1_yard() {
        Length result = new Length(36, UnitEnum.inch.name()).as(UnitEnum.yard.name());

        assertThat(result.getValue(), is(1.0));
        assertThat(result.getUnit(), is(UnitEnum.yard.name()));
    }

    @Test
    public void should_18_inches_equals_half_yard() {
        Length result = new Length(18, UnitEnum.inch.name()).as(UnitEnum.yard.name());

        assertThat(result.getValue(), is(0.5));
        assertThat(result.getUnit(), is(UnitEnum.yard.name()));
    }
}
