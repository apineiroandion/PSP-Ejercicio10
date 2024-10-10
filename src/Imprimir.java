public class Imprimir extends Thread{
    private String texto;


    public Imprimir(String texto){
        this.texto = texto;
    }

    @Override
    public void run() {
        System.out.println(texto);
    }


}
