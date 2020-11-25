package SOLID;
//IF class A is a subtype of class B (jeigu klase A yra B klases vaikas)
//hte we should be able to replace B with A without disrupting the behavior of a program.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Dacia");
        vehicle.setBrand("Logan");
        vehicle.setLicensePlate("123123");

        Car car = new Car();
        car.setNumberOfDoors(4);
        car.setBrand("BMW");
        car.setModel("F30");
        car.setLicensePlate("321321");

        //kadangi klase CAR yra klases VEHICLE vaikas mes galime naudoti tevine klase,kad sukurti vaikine.
        Vehicle newCar = new Vehicle();
        newCar.setBrand("BMW");
        newCar.setModel("F30");
        newCar.setLicensePlate("321321");



    }
}
