public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Carro meuCarro = new Carro();
        meuCarro.setMarca("Hyundai");
        System.out.println(meuCarro.getMarca());
        meuCarro.setModelo("Sonata");
        System.out.println(meuCarro.getModelo());
        meuCarro.setAno(2015);
        System.out.println(meuCarro.getAno());
        meuCarro.setCor("Preto");
        System.out.println(meuCarro.getCor());
        meuCarro.ligar();
    }
}