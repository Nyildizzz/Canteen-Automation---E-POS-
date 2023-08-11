# Kantin Otomasyonu

Bu proje, bir kantin için otomasyon sistemi geliştirmeyi amaçlayan bir Java uygulamasıdır. Kullanıcılar, ürünleri seçebilir, siparişleri gönderebilir ve öğrenci bilgilerini yönetebilir.

![Screenshot](https://imgyukle.com/i/reP2Mj)

## Özellikler

- Kullanıcıların ürünleri seçip sepetlerine ekleyebilmesi.
- Kullanıcıların siparişlerini gönderebilmesi.
- Yönetici paneli aracılığıyla ürünleri ekleyebilme, düzenleyebilme ve silme.
- Öğrenci bilgilerini görüntüleme ve yönetme.

## Gereksinimler

- Java JDK 8 veya daha yeni sürüm
- MySQL veritabanı
- Java Swing kütüphanesi

## Kurulum

1. Bu depoyu bilgisayarınıza klonlayın:

```bash
git clone https://github.com/KullaniciAdi/kantin-otomasyonu.git

MySQL veritabanında "kantin" adında yeni bir veritabanı oluşturun.

2. Veritabanı bağlantı ayarlarınızı güncelleyin:

db.url=jdbc:mysql://localhost:3306/kantin
db.username=kullanici_adi
db.password=parola


3. Proje klasörüne gidin ve uygulamayı derleyin:

cd kantin-otomasyonu
javac -cp "lib/*" src/main/java/*.java


4. Uygulamayı başlatın:

java -cp "lib/*:src/main/java" Main


## Kullanım
-Uygulama başladığında, giriş yaparak öğrenci bilgilerini ve ürünleri görüntüleyebilirsiniz.
-Ürünleri seçmek için arayüzdeki sepete eklem düğmelerini kullanın.
-Siparişinizi tamamladığınızda siparişi onaylayın.

Katkılar
Pull istekleri açıktır. Büyük değişikliklerden önce lütfen tartışma bölümünde konuşun.




