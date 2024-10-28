import java.util.TreeMap;
import java.util.Map;

public class U3_TI_05_MapTree{
    public static void main(String[] args) {
        Map <Integer,String> frutas = new TreeMap<>();

        frutas.put(3,"coco");
        frutas.put(1,"arandano");
        frutas.put(2,"durazno");
     

        //print
        System.out.println("Las frutas son: "+frutas);

        frutas.forEach((key,value)->{
            System.out.println("El key es: "+key+" value es:  "+value);
        });

        String fruta1=frutas.get(1);
        System.out.println("la fruta es: " +fruta1);

        frutas.remove(3);
        System.out.println("frutas despues de eliminar la ultima pera: "+frutas);
    }
}
