public class Main {
    public static void main(String[] args) throws InterruptedException {
        Imprimir h1 = new Imprimir("Hola, soy el hilo 1");
        Imprimir h2 = new Imprimir("Hola, soy el hilo 2");
        h2.setPriority(Thread.MAX_PRIORITY);
        h1.setPriority(Thread.MIN_PRIORITY);
        h1.start();
        h2.start();


//Para hacerlo con join comenta las lineas 5 - 8 descomenta
// estas
//        h2.start();
//        h2.join();
//        h1.start();


    }
}
