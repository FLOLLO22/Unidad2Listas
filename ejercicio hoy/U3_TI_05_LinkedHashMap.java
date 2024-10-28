import java.util.LinkedHashMap;
import java.util.Map;

public class U3_TI_05_LinkedHashMap {
    public static void main(String[] args) {
        Map <Integer,String> frutas = new LinkedHashMap<>();

        frutas.put(1,"Pera");
        frutas.put(2,"Kiwi");
        frutas.put(3,"Mango");
        frutas.put(4,"Fresa");
        frutas.put(5,"Pera");

        //print
        System.out.println("Las frutas son: "+frutas);

        frutas.forEach((key,value)->{
            System.out.println("El key es: "+key+" value es:  "+value);
        });

        String fruta1=frutas.get(5);
        System.out.println("la fruta es: " +fruta1);

        frutas.remove(5);
        System.out.println("frutas despues de eliminar la ultima pera: "+frutas);
    }
}
