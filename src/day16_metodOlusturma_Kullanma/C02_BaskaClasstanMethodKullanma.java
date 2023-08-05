package day16_metodOlusturma_Kullanma;

public class C02_BaskaClasstanMethodKullanma {
    public static void main(String[] args) {
        C01_methodOlusturma.altString("Bu iş çok güzel",3,10);
        //C01_methodOlusturma.altString('m',"ali",true);
        /*
        bir method call sırasında yazdığımız değerlere ARGUMENT
        methodda bulunan method deklerasyonundaki parantez içindeki variable llara PARAMETRE

        public static void altString(String metin, int basIndex, int bitIndex)

        C01_MethodOlusturma.altString('m', "ali", true); argument
        Strring metin = 'm';
        int basindex= "ali";
        int bitindex= true;
        argumentler ile parametreler uyumlu olmazsa Java CTE (altını kırmızı çizer) verir.

         */
    }
}
