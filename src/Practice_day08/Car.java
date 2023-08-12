package Practice_day08;

public class Car {
    // Bir "Car" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
    // Bu constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.

    // Örnek çıktı:
    // Car nesnesi oluşturuldu: Ford Focus
    String marka;
    String model;

    public Car(String marka, String model){
        this.marka = marka;
        this.model= model;
    }

    public static void main(String[] args) {
        Car car = new Car("Renault", "Broadway");
        Car car2 = new Car("Ford", "Fusion");
        Car car3 = new Car("Renault","Megane");

        System.out.println("ilk arabam: " +car.marka + " " + car.model);
        System.out.println("İkinci arabam: " +car2.marka + " " + car2.model);
        System.out.println("Üçüncü arabam: " +car3.marka + " " + car3.model);
    }

}
