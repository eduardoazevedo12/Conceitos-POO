package Fixando;
//criação de objetos
public class RodarAplicacao {
    public static void main(String[] args) {
        //esse carro1 tá usando o construtor vazio
        Carro carro1=new Carro(); //criação do objeto
        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());

        //método de negócio(que efetua alguma operação
        System.out.println(carro1.totalValorTanque(6.39));


        //sobrecarga do construtor para usar o construtor preenchido
        //criação do objeto com parametros
        Carro carro2=new Carro("Prata","Doblo 4 portas",66);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());

        //método de negócio(que efetua alguma operação
        System.out.println(carro2.totalValorTanque(6.46));
    }
}
