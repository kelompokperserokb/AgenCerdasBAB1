public class AgenCerdas {
    private String lingkungan[][];
    AgenCerdas(int size){
        lingkungan = new String[size][3];
    }
    public void setKondisi(int i, String name,String
            location,String status){
        lingkungan[i-1][0]=name;
        lingkungan[i-1][1]=location;
        lingkungan[i-1][2]=status;
    }
    public void vacumm (int i,String location, String status){
        if ("kotor".equals(status.toLowerCase())){
            System.out.println("----bersih-bersih----");
            status = "bersih";
            lingkungan[i][2]=status;
            vacumm(i,location,status);
        } else {
            System.out.println(lingkungan[i][0]+" sudah bersih");
            if ("kiri".equals(location.toLowerCase())) {
                System.out.println("geser kanan-->");
            } else if ("kanan".equals(location.toLowerCase())) {
                System.out.println("<--geser kiri");
            } else if ("atas".equals(location.toLowerCase())){
                System.out.println("geser bawah");
            } else if ("bawah".equals(location.toLowerCase())) {
                System.out.println("geser atas");
            }
            System.out.println();
        }
    }
    public void cleaning(){
        for (int i = 0; i<lingkungan.length; i++){
            System.out.println(lingkungan[i][0]);
            vacumm(i,lingkungan[i][1],lingkungan[i][2]);
        }
        System.out.println("SEMUA SUDAH BERSIH");
    }
    public static void main(String[] args) {
        AgenCerdas a = new AgenCerdas(6);
        a.setKondisi(1, "Lokasi 1", "kanan", "bersih");
        a.setKondisi(2, "Lokasi 2", "atas", "kotor");
        a.setKondisi(3, "Lokasi 3", "kiri", "kotor");
        a.setKondisi(4, "Lokasi 4", "atas", "kotor");
        a.setKondisi(5, "Lokasi 5", "kanan", "kotor");
        a.setKondisi(6, "Lokasi 6", "final", "bersih");
        a.cleaning();

    }
}