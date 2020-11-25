package Enumerators.Example3;

public class UnitMain {
    public static void main(String[] args) {
        System.out.println(LengthUnit.METER.toString());
        System.out.println(LengthUnit.CENTIMETER.toString());
        System.out.println(LengthUnit.INCH.toString());
        System.out.println(LengthUnit.FOOT.toString());

        for (LengthUnit unit : LengthUnit.values()){
            System.out.println(unit.value);

        }
    }
}
