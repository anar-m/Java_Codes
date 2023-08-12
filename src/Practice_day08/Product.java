package Practice_day08;
// Bir "Product" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.

// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet

public class Product {
    String name;
    double price;
    int stock;


    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;

        display();
    }

    public void display() {
        System.out.println("Ürün adı : "+ name + ", Fiyatı: " +price + ", Stok: " + stock);}

    public static void main(String[] args) {
        Product product = new Product("MSI note", 26500.99,11);
        Product urun2 = new Product("Macbook Pro",55999.99,02);
    }
}
