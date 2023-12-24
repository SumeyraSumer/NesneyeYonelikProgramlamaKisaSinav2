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
