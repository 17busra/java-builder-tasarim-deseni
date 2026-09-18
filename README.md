# Java OOP - Builder Tasarım Deseni 🏗️

Bu proje, Nesne Yönelimli Programlamada (OOP) yaratımsal tasarım desenlerinden (Creational Design Patterns) biri olan **Builder (İnşa Edici)** deseninin kullanımını göstermektedir. Kodlar, karmaşık bir `Ev` nesnesinin (duvar, çatı, pencere vb. detaylarla) adım adım ve kontrollü bir şekilde nasıl oluşturulabileceğini simüle eder.

Tasarım desenleri çalışırken sıklıkla göreceğin bu yapı, özellikle çok fazla parametre alan veya oluşturulması belirli bir sıraya dayanan nesnelerde karmaşıklığı önlemek için kullanılır.

**İçerilen OOP ve Tasarım Prensipleri:**
* **Product (Ürün) - `Ev`:** İnşa edilecek olan asıl karmaşık nesneyi temsil eder.
* **Abstract Builder (Soyut İnşa Edici) - `Evbuilder`:** Ürünün (Evin) oluşturulması için gereken adımların (duvarYap, catiYap vb.) şablonunu belirler.
* **Concrete Builder (Somut İnşa Ediciler) - `BetonEvBuilder` & `ahşapEvBuilder`:** Soyut inşa ediciyi miras alarak adımların içini kendi konseptlerine (beton veya ahşap) uygun şekilde doldururlar.
* **Director (Yönetici) - `Mudur`:** İnşa sürecinin hangi sırayla yapılacağını (önce nesne oluştur, sonra duvar, sonra çatı vb.) yönetir. İstemci (`Main`) sadece yöneticiye hangi ustayı (Builder) kullanacağını söyler, sürecin detaylarıyla ilgilenmez.

**Kullanılan Dil:**
* Java
