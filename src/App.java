public class App {
    public static void main(String[] args) throws Exception {
        int numeros[] = {10, -5, 2, 0, 7};
        runBubbleSort();
        }

    public static void runBubbleSort(){
        System.out.println("Metodo Burbuja");
        int numeros[] = {10, -5, 2, 0, 7};
        //Instancia de la clase
        BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);
            bubbleSort.printArreglo(numeros);            
            bubbleSort.sort(numeros, true);
            bubbleSort.printArreglo(numeros);
            bubbleSort.sort(numeros, false);
            bubbleSort.printArreglo(numeros);        

    }
}
