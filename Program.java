package Program;


public class Program {
    public static void main(String[] args) {
        Negyzet negyzet = new Negyzet();
        Negyzet egyik = new Negyzet();
        Negyzet masik = new Negyzet();
        Negyzet negyedik = new Negyzet();
        Vonal v1 = new Vonal();
        Vonal v2 = new Vonal();
        
        
        negyzet.a = 3;
        System.out.println("állapot: " + negyzet.allapot());
        System.out.println("terület: " +negyzet.terulet());
        
        v1.hossz = 2;
        v2.hossz = 3;
        System.out.println("v1: " + v1.allapot());
        System.out.println("v2: " + v2.allapot());
        System.out.println("v1 == v2: "+ v1.egyforma(v2));
        
        v1.hossz = 2;
        v2.hossz = 2;
        System.out.println("egyik: " + v1.allapot());
        System.out.println("masik: " + v2.allapot());
        System.out.println("a 2 vonal egyforma: "+ v1.egyforma(v2));
        
        
    }
}
