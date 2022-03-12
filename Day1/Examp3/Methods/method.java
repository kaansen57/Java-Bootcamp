public class Main {

    public static void main(String[] args) {

        System.out.println(sum(1,7));
        System.out.println(sum2(1,2,3,4,5,6));
    }


    public static void add(){
        System.out.println("Eklendi");
    }
    public static void delete(){
        System.out.println("Silindi");
    }
    public static void update(){
        System.out.println("Güncellendi");
    }

    public static int sum(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static int sum2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam += sayi;
        }
        return toplam;
    }
}
