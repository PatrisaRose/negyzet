package Program;


public class Vonal {
   int hossz;
   
   public boolean egyforma(Vonal masik){
       return this.hossz == masik.hossz;
       
   }
   
   public String allapot(){
       return "Vonal{hossz=" + hossz + "}";
   }
}
