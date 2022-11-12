public class Calculadora {

    private double numero1;
    private double numero2;

    Calculadora(double numero1, double numero2){
        this.setNumero1(numero1);
        this.setNumero2(numero2);
    }

    public double getNumero1(){
        return this.numero1;
    }

    public void setNumero1(double novoNumero1){
        this.numero1 = novoNumero1;
        System.out.println("O primeiro número é "+ numero1);
    }

    public double getNumero2(){
        return this.numero2;
    }

    public void setNumero2(double novoNumero2){
        this.numero2 = novoNumero2;
        System.out.println("O segundo número é "+ numero2);
    }
    //OPERAÇÕES MATEMATICAS BASICAS
    public void soma(){
        System.out.println("A soma desses dois números é "+  (numero1+numero2));
    }

    public void subtrai(){
        System.out.println("A subtração de "+ numero1 + " menos o "+ numero2 + " é " +  (numero1-numero2));
    }

    public void multiplica(){
        System.out.println("A multiplicação de "+ numero1 + " vezes o "+ numero2 + " é " +  (numero1*numero2));
    }

    public void divide(){
        System.out.println("A divisão de "+ numero1 + " pelo "+ numero2 + " é " +  (numero1/numero2));
    }
    //OPERAÇÕES MATEMATICAS BASICAS INVERSAS

    public void subtraiInvertido(){
        System.out.println("A subtração de "+ numero2 + " menos o "+ numero1 + " é " +  (numero2-numero1));
    }

    public void multiplicaInvertido(){
        System.out.println("A multiplicação de "+ numero2 + " vezes o "+ numero1 + " é " +  (numero2*numero1));
    }

    public void divideInvertido(){
        System.out.println("A divisão de "+ numero2 + " pelo "+ numero1 + " é " +  (numero2/numero1));
    }

}
