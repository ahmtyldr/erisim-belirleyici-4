 public class örnek {//private olarak kullandığımız erişim belirleyiciye nasıl diğer classtan ulaşabileceğimiz göstermektedir

    private int şifre = 123; // burda private olan bir erişim belirleyiciye
    //değer atadık

    public int getŞifre() {
        return şifre;          //burda setter ve getter methodlarını
    }                          //oluşturduk

    public void setŞifre(int şifre) {  // burda set methodunda bir koşul oluşturduk

        if (şifre == 123) {      // eğer karşıda girilen değer burdaki değerle uyuşmazsa 
            System.out.println("şifre doğru");//erişim belirleyicinin içine 
        } else {                              //giremeyeceğiz
            System.out.println("şifre yanlış");
        }
        this.şifre = şifre;
    }

}
