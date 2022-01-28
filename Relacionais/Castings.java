package Relacionais;

public class Castings {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();//criação do objeto

        //upcast transformando subclasse em superclasse
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

    }

}
class Funcionario{//classe mãe

        }
class Gerente extends Funcionario{//sublcasse de funcionario

}
class Vendedor extends Funcionario{//sublcasse de funcionario

}
class Faxineiro extends Funcionario{//sublcasse de funcionario

}