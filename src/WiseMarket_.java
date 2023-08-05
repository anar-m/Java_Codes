import java.util.Scanner;

public class WiseMarket_ {
     static Scanner scanner=new Scanner(System.in);
     static String urunAdi;
     static double urunFiyati;
     static double urunMiktari;
     static int urunKodu;
     static String sepet="";
     static double toplam;




    /*
   bir market yazılımı düşünerek aşağıdaki menü ile giriş yapıp ilgili bölüme yönlendiren alış veriş yaptıran
   ve sepet tutaını hesaplayarak hafizada tutan masaya gidince fiş yazdıran bir program hazırlayın

   ==================== WISE MARKET KASA PROGRAMI ===================================
   ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
    secime gore ,
    4-urunleri listele ve
   5-fiyatlari gelsin
   variable'leri belirleyelim
   urunAadı,  urunFiyati, urunKodu, sepet, toplam,
   */
    // System.out.println("================== WISA MARKET KASA PROGRAMI ===================");
    // System.out.println("1 ŞARKÜTERİ ÜRÜNLERİ", "\n2 MANAV ÜRÜNLERİ", "3 MARKET ÜRÜNLERİ");

    public static void main(String[] args) {
        girisEkrani();

        }
        public static void girisEkrani(){
            System.out.println("================= T120-WISA MARKET================= ");
            System.out.println("=================== HOŞGELDİNİZ ===================");
            System.out.println("----------------------- MENÜ ----------------------");
            System.out.println("Lütfen Alış veriş yapmak istediğiniz reyonu sçiniz ");
            System.out.println("1-Şarküteri \n2-Manav \n3-Market \n4-Fiş Yazdır \n5-Çıkış");

            int secim= scanner.nextInt();
            if (!(secim>=1 && secim<=5)){


                System.out.println("Uyarı : Geçersiz bir tuşa bastınız. Tekrar giriniz ");
                girisEkrani ();
            }else {
                switch (secim){
                    case 1:
                        sarkuteri();
                        break;
                    case 2:
                        manav();
                        break;
                    case 3:
                        market ();
                        break;
                    case 4:
                        fisYazdir();
                        break;
                    case 5:
                        cikis ();
                        break;
                    default:
                }
            }

        }
        public static void sarkuteri() {
            System.out.println("Şarkteri Reyonuna Hoşgeldiniz");girisEkrani();
        }
        public static void manav() {
            System.out.println("Manav Reyonuna Hoşgeldiniz");girisEkrani();
        }

        public static void market() {
            System.out.println("Market Reyonuna Hoşgeldiniz");girisEkrani();
        }
        public static void fisYazdir() {
            System.out.println("Alışveriş Fişi");girisEkrani();
        }
        public static void cikis() {
            System.out.println(" Çıkış Ekranı");girisEkrani();
        }
    }

