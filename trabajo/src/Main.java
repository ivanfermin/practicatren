public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        //locomotoras
        Locomotora loc509 = new Locomotora(509);
                Locomotora loc566=new Locomotora(566);
Locomotora loc666= new Locomotora();
loc666.codigo=666;
//vagones
        Vagon vagon1=new Vagon(80);
        Vagon vagon2=new Vagon(40);
        Vagon vagon3=new Vagon(80);
        Tren tren509=new Tren(509);
        loc509.tren=tren509;
        vagon2.tren=tren509;
        Tren tren666= new Tren(666);
        vagon3.tren=tren666;
        System.out.println(tren509);
        System.out.println(tren666);
    }

}