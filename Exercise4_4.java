public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.
    }
}

//1. Cevap:
//Return eden bir metodu çağırıp sonucunu kullanmazsan Java hata vermez. Kod geçerlidir, en fazla IDE "method result is ignored" şeklinde uyarı verebilir.

//2. Cevap:
//Void bir metodu bir ifadenin içinde kullanırsan Java derleme hatası verir.
//Hata: “void type not allowed here”
//Çünkü void metotların döndürecek bir değeri yoktur.
