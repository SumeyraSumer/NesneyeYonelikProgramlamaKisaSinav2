Ev Yönetim Sistemi

Bu proje, bir evin yönetimini benzer şekilde anlatmak amacıyla geliştirilmiş bir uygulamadır. Temel olarak, ev sahibi, kiracılar, bina ve daireler arasındaki ilişkileri modellemek üzere oluşturulmuştur. Ayrıca, projede nesne yönelimli programlama ve miras kullanımı gösterilmektedir.

Proje Yapısı

Main.java Dosyası

Projenin ana giriş noktasını sağlar. Burada örnek nesneler oluşturularak temel bilgiler ekrana yazdırılır. Proje, bu sınıfta başlar ve diğer sınıfları içerir.

Daire.java Dosyası

Daire sınıfı, bir evin belirli bir daire birimini temsil eder. "Comparable" arayüzü implemente edilmiş ve daire numaralarına göre sıralanabilme özelliği eklenmiştir.

Bina.java Dosyası

Bina sınıfı, tüm daireleri içeren genel bir yapıyı temsil eder. Diğer sınıflar bu sınıftan miras alarak genel özelliklere erişebilir.

Konut.java Dosyası

Konut sınıfı, bina sınıfından miras alarak konut özelliklerini gösterir. Özellikle konutun genel bilgilerini içerir.

Kiraci.java Dosyası

Bir ev sahibine bağlı olarak kiracı bilgilerini içerir. Kiracının adı, soyadı ve bağlı olduğu ev sahibi bilgilerini içerir.

EvSahibi.java Dosyası

Ev sahibini temsil eder. Ev sahibinin adı, soyadı ve sahip olduğu daireleri içeren bir liste bulunur.

Nasıl Kullanılır?

Proje, "Main" sınıfında örnek nesneler oluşturularak çalıştırılır.

Projenin Amaçları

Proje, Java'nın OOP yeteneklerini kullanarak nesne modelleme prensiplerini gösterir. Sınıflar arasında miras (Inheritance) kullanımı ile ilgili örnekleri içerir. Daire sınıfındaki daireleri sıralama özelliği ile birlikte, EvSahibi sınıfında sahip olunan daireleri bir liste olarak yönetir.
Proje Nasıl Çalışır?
Kod çalıştırıldığında "uygulama başladı" yazar. Altında ders isim soyisim ve okul numarası bilgileri verildikten sonra proje bilgileri yer alır.
ilk önce karılımıza bina bilgileri bölümü çıkar burada bina adresi ve kat sayısı yazar. Binadan miras  alınan konut bilgileri gelir. Daha sonra ev sahibi ve daire bilgileri yazar. Ev sahibi ad soyadı, sahip olduğu daireler, o dairelerin adresleri yazar. Altında kiracı bilgileri yazar. Burada kiracı adı soyadı, kiracının ev sahibi bilgileri yer alır. "Uygulama sonlandı" yazısı ile proje sonlanır.


![mainjava](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/e6155ebc-78bd-4e80-8547-6fa213818d4a)

![daıre](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/3d75b9aa-4c3c-436d-9a8a-be203a50e926)

![kıracıjava](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/2e9a99db-1ead-4f8e-9223-82931de5a885)

![bına](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/0d0c56ea-b55a-45c2-ade9-3e0902547e89)

![evsahıbı](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/5849e029-77e9-460c-9fb0-9d22048d6a00)

![Konutjava](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/bd1f2b98-eaa7-4c5a-a8eb-1f37ef1aabb6)

![kodcıktısı](https://github.com/SumeyraSumer/NesneyeYonelikProgramlamaKisaSinav2/assets/126922628/e608d7e6-a818-459c-825d-31027ead6182)





