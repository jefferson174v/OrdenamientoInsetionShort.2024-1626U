public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = { 12, 11, 23, 5, 7 };
        System.out.println("Arreglo orignal: ");// imprime el arreglo inicial
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------"); // -----------------
        metodo0(arreglo);// se llama al metodo0 el cual contiene el arreglo
        System.out.println("Arreglo ordenado");
        for (int j : arreglo) { // imprime el arreglo ordenado usanfo for each
            System.out.print(j + " ");
        }
    }

    public static void metodo0(int[] arreglo) {
        int n = arreglo.length; // tamano del arreglo
        for (int i = 1; i < n; i++) { // for que recorre todos los valores del arreglo
            int key = arreglo[i]; // este es el elemento que se va a insertar en la sublista ordenada
            int j = i - 1; // permite comparar el elemento actual con los elementos en la sublista ordenada
                           // que están antes de el
            while (j >= 0 && arreglo[j] > key) { // recorre hacia atrás desde la posición actual hasta el inicio del
                                                 // arreglo (j >= 0) y mientras el elemento en la posición j sea mayor
                                                 // que key
                arreglo[j + 1] = arreglo[j]; // se desplaza hacia adelante el elemento en la posición j para hacer
                                             // espacio para insertar key en la posicin correcta, esto se hace copiando
                                             // el valor de arreglo[j] en la posicion siguiente (j + 1)
                j--; // decrementamos j para avanzar hacia atrás en el arreglo y continuar la
                     // busqueda de la posicion correcta para key
            }
            arreglo[j + 1] = key;
        }
    }
}
