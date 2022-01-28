package Relacionais;

public class Associacao {
/** Aqui está um exemplo de Associação de Comparação e Agregação
 * o código para realizar as mesmas é identico porém o que as diferencia é o modo que
 * você está resolvendo no momento, o contexto, o problemas
 *
 */
}
class Pessoa{  //em um contexto se a pessoa deixar de existir o endereço tbm dfeixa
    Endereco endereco;//essa é uma relação de COMPARAÇÃO
}
class Endereco{
}


class Disciplina{//aqui se a disciplina deixar de existir não necessáriamente o aluno
    Aluno aluno;// também deixará de existir, essa disciplina pode ser de Portugues
}               // e o mesmo aluno pode estar em outra disciplina de Matemática
class Aluno{

}

class Compra{
    void finalizar(Cupom cupom){

    }
}
class Cupom{

}