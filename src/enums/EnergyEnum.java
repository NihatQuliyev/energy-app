package enums;

public enum EnergyEnum {
    YOU_ARE_HUNGRY(0.0),
    YOU_ARE_VERY_HUNGRY(0.0),
    YOU_ARE_HUNGRY_VERY_VERY(0.0),
    INCREMENT_ENERGY_BY_MILK(1.08),
    YOU_DIED(0.0),
    INCREMENT_ENERGY_BY_MEAT(1.1),
    DECREMENT_ENERGY(0.91) ;
    final double value;
    EnergyEnum(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
