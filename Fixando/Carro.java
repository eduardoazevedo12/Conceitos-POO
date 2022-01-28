        package Fixando;

        class Carro {    //classe
            String cor;             //
            String modelo;          //      ATRIBUTOS
    int capacidadeTanque;   //
            Carro(){   //CONSTRUTOR

            }
            Carro(String cor,String modelo, int capacidadeTanque){
                this.cor=cor;
                this.modelo=modelo;
                this.capacidadeTanque=capacidadeTanque;
        // a função do this é pra tirar a ambiguidade que algum objeto possa ter
         //   diferenciando ele de ser um atributo e um parametro
            }
            void setCor(String cor){
        this.cor= cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo=modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque=capacidadeTanque;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }

    }

