package Relacionais;

public class Polimorfismo {
    public static void main(String[] args) {
        ClasseMae[] classes= new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(),
         new ClasseMae()};
        for(ClasseMae classe: classes){
            classe.metodo1();
        }
        System.out.println(" ");
        for(ClasseMae classe: classes){
            classe.metodo2();
        }
        System.out.println(" ");
        ClasseFilha2 classeFilha2=new ClasseFilha2();
        classeFilha2.metodo2();

    }

}
class ClasseMae {
    void metodo1() {
        System.out.println("metodo 1 da classe mae");
    }

    void metodo2() {
        System.out.println("metodo 2 da classe mae");
    }
}
class ClasseFilha1 extends ClasseMae {
    @Override
    void metodo1(){
        System.out.println("metodo 1 da classe filha1");
    }

}
class ClasseFilha2 extends ClasseMae{

    @Override
    void metodo1(){
        System.out.println("metodo 1 da classe filha2");
    }
    @Override
    void metodo2(){
        System.out.println("metodo 2 da classe filha2");
    }

}

