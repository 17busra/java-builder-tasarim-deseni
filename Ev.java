// product ilk önce oluşturulur
class Ev{ 

    String duvar;
    String cati;
    String pencere; // özellikler private de tanımlanır 

    // özellikleri atamak için setterler kullanılır

    public void setDuvar(String duvar){
        this.duvar = duvar;
    }
    public void setCati(String cati){
        this.cati = cati;
    }
    public void setPencere(String pencere){
        this.pencere = pencere;
    }


 // evin son halini gösteren metod
 public void eviGoster(){
    System.out.println("ev bilgilerini: ");
    System.out.println("duvarlar: " + duvar);
    System.out.println("çatılar: " + cati);
    System.out.println("pencereler: " + pencere) ;

 }

}





// soyut builder (builder)

 abstract class Evbuilder{
    protected Ev ev; // Ev sınıfından alınan ev nesnesi. birazdan oluşturacağımız nesne
    
    // yeni ve boş bir ev nesnesi yaratır
    public void evNesnesiOlustur(){
         ev = new Ev();
    }


     // iş bitince ev nesnesini getirir
     public Ev getEv(){ // ev productını teslim edeceğimiz için ev sınıfından yazdık
        return ev;
     }
        // hepsinde ayrı açacağımız metodları yazıyoruz
     public abstract void duvarYap();
     public abstract void catiYap();
     public abstract void pencereYap();



 }







 //builderın tanımlaıdklarını yapcak olan soyut classlar

 //beton ev yapıcı
 class BetonEvBuilder extends Evbuilder{

    @Override public void duvarYap(){
        ev.setDuvar("beton");
    }
    @Override public void catiYap(){
        ev.setCati("kiremit");
    }
    @Override public  void pencereYap(){
        ev.setPencere("cam");
    }
 }

 // ahşap ev yapıcı
 class ahşapEvBuilder extends Evbuilder{
        @Override public void duvarYap(){
            ev.setDuvar("ahşap");
        }
        @Override public void catiYap(){
            ev.setCati("shingle");
        }
        @Override public void pencereYap(){
            ev.setPencere("ahşap pencere");
        }
 }











 // mudur hangi sırayla yapcağını söyleyen sınıfı yazıyoruz
class Mudur{
    private Evbuilder builder;  // ev yapıcıdan yapıcı(usta) çağırdık

    public Mudur(Evbuilder builder){ // private olduğu için şey yaptık
        this.builder = builder;
    }

    public Ev evOlustur(){
        builder.evNesnesiOlustur();
        builder.duvarYap();
        builder.catiYap();
        builder.pencereYap();

        return builder.getEv(); // bitmiş evi teslim eder

    }


 }














//


 public class Main {
    public static void main (String [] args){
        Evbuilder usta = new BetonEvBuilder() ;//yapıcı sınıfından yapmak istediğimiz ev altsınıfından nesneyi üretiyoruz 
        Mudur mudur = new Mudur(usta) ; // ustanın mudur sırasıyla yapması için mudur sınfına atıyoruz
        Ev bizimEv = mudur.evOlustur(); 
        bizimEv.eviGoster();
    }

    
    
}
