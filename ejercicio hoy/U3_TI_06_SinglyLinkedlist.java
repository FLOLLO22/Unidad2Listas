public class U3_TI_06_SinglyLinkedlist {
    U3_TI_06_Nodo cabeza;

    public U3_TI_06_SinglyLinkedlist() {
        this.cabeza = null;
    }

    public void insertar(Integer dato) {
        // Crear un nodo
        U3_TI_06_Nodo nuevoNodo = new U3_TI_06_Nodo(dato);
        // Verificar si la lista esta vacia
        if (cabeza == null) {
            // coloca el nodo nuevo como la cabeza
            cabeza = nuevoNodo;
        } else {
            U3_TI_06_Nodo temp = cabeza; // Iniciamos desde la cabeza(El primero ps)
            // Recorremos todos los nodos hasta encontrar un null en las referencias
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    public void mostrar() {
        U3_TI_06_Nodo temp = cabeza; // Comenzamos desde la cabeza(inicio)
        // Mientras temp no sea nulo
        System.out.println("**************************************************");
        System.out.println("---------------------- NODO ----------------------");
        System.out.println("**************************************************");
        while (temp != null) {
            System.out.print(temp.getDato() + "->");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    public boolean buscar(Integer valor) {
        System.out.println("**************************************************");
        System.out.println("--------------------- BUSCAR ---------------------");
        System.out.println("**************************************************");
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
            U3_TI_06_Nodo temp = cabeza; // Comenzamos desde la cabeza(inicio)
            // Mientras temp no sea nulo
            int i=0;
            while (temp != null) {
                i++;
                //System.out.print(temp.dato + "->");
                
                if(temp.getDato() == valor){
                    System.out.println("El valor "+valor+" se encuentra en el nodo "+i);
                    System.out.println("**************************************************");
                    return true;
                }
                temp = temp.getSiguiente();
                
            }
            System.out.println("No se encuentra el dato");
        }
        return false;
    }
    public void eliminar(Integer valor){
        if(cabeza == null){
            System.out.println("No se puede eliminar, por que la lista esta vacia");
        }
        if(cabeza.getDato() == valor){
            cabeza=cabeza.getSiguiente();
            return;
        }
        U3_TI_06_Nodo temp = cabeza;
        U3_TI_06_Nodo anterior = null;
        while (temp!=null && temp.getDato()!=valor) { //recorre hasta encontrar el nodo con el alor
            anterior=temp;
            temp=temp.getSiguiente();
        }
        if(temp==null){
            System.out.println("No se encontro el valor");
            return;
        }
        anterior.setSiguiente(temp.getSiguiente()); // con esto borramos al nodo que estamos buscando
        System.out.println("Se elimino correctamente: "+valor);
    }
}
