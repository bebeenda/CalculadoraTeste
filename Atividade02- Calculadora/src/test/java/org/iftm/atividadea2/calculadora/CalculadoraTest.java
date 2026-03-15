package org.iftm.atividadea2.calculadora;
import org.iftm.atividadea2.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    
    private Calculadora calculadora;

    @BeforeEach
    //esse método será executado antes de cada método
        public void setup(){
            int memoriaInicial = 3;
            calculadora = new Calculadora(memoriaInicial);
        }
        //todos os testes iniciaram com a mémora de 3 na calculadora

    // 1) construtor vazio
        //verificação da memória
    @Test
    public void testarConstrutorVazioInicializaMemoriaZerada(){
        //Arrange
        //prepara o cenário
        int memoriaEsperada = 0;

        //Act
        //executa o que será testado
        //no caso a memória da calculadora
        calculadora = new Calculadora();
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        //verificação do resultado
        //memória esperada é igual a memória obtida?
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);

        // Esse teste não vai passar pois a memória que está setada na classe calculadora é 1, e aqui o teste esperava que a memória fosse 0.
    }


    // 2)Construtor com parâmetro positivo
    @Test
    public void testarConstrutorComParametroPositivo(){
        //Arrange
        int memoriaEsperada = 3;

        //Act
        //aqui vou iniciar meu construtor com 3
        calculadora = new Calculadora(3);
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    //Esse teste passou, como eu comecei com a minha memória em 3 e coloquei que espera que a minha memória fosse 3, então o esperado foi igual o resultado

    @Test
    public void testarConstrutorComParametroNegativo(){
        //Arrange
        int memoriaEsperada = -3;

        //Act
        //inicio meu construtor negativo
        calculadora = new Calculadora(-3);
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    //Esse teste também passa, já que o -3 que guardei na memória é igual ao -3 esperado. O operador não influencia, desde que os números e operadores sejam os mesmos

    // 3)Teste de soma positiva
    @Test
    public void testarSomaPositiva(){
        //Arrange
        int valorSomado = 3; //iniciando com 3
        int memoriaEsperada = 6;

        //Act
        calculadora.somar(valorSomado);
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }

    //Teste passou, pois a memória inicial está 3, então a soma de 3 + 3 é 6;

    @Test
    public void testarSomaNegativa(){
        //Arrange
        int valorSomado = -3;
        int memoriaEsperada = 0;

        //Act
        calculadora.somar(valorSomado);
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    //Teste passou, pois a memória inicial está 3, então a soma de -3 + 3 é 0;


    // 4) Teste subtração número positivo
    @Test 
    public void testarSubtracaoPositivo(){
        //Arrange
        int valorSubtraido = 3;
        int memoriaEsperada = 0;

        //Act 
        calculadora.subtrair(valorSubtraido);
        int memoriaObtida = calculadora.getMemoria();

        //Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    //O teste não passa pois na classe, o método subtrair não realiza tal operação. Somente aloca na memória o valor que coloco.

    @Test
    public void testarSubtracaoNegativo(){
        // Arrange
        int valorSubtraido = -3;
        int memoriaEsperada = 0;

        // Act
        calculadora.subtrair(valorSubtraido);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    //O teste não passa pois na classe, o método subtrair não realiza tal operação. Somente aloca na memória o valor que coloco mesmo o número sendo negativo.

    //5) Multiplicar
    @Test
    public void testarMultiplicarPositivo(){
        // Arrange
        int valorMultiplicado = 3;
        int memoriaEsperada = 9;

        // Act
        calculadora.multiplicar(valorMultiplicado);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
    // O teste não passou pois na classe de multiplicação, o valor obtido está sendo dividido por ele mesmo, sendo diferente do resultado esperado

    @Test
    public void testarMultiplicarNegativo(){
        // Arrange
        int valorMultiplicado = -3;
        int memoriaEsperada = -9;

        // Act
        calculadora.multiplicar(valorMultiplicado);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
    }
     // O teste não passou pois na classe de multiplicação, o valor obtido está sendo dividido por ele mesmo, sendo diferente do resultado esperado

     //6) dividir
     @Test
     public void testarDivisaoPositivo() throws Exception{
        //Arrange
        int valorDividido = 3;
        int memoriaEsperada = 1;

        //Act
        calculadora.dividir(valorDividido);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }

     @Test
      public void testarDivisaoNegativo() throws Exception{
        //Arrange
        int valorDividido = -3;
        int memoriaEsperada = -1;

        //Act
        calculadora.dividir(valorDividido);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }

     @Test
      public void testarDivisaoPorZero() throws Exception{
        //Arrange
        int valorDividido = 0;
        int memoriaEsperada = -1;

        //Act
        calculadora.dividir(valorDividido);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }

     //7 Exponeciar
     @Test
         public void testarExponenciarElevandoA1() throws Exception{
        //Arrange
        int valorExpoente= 1;
        int memoriaEsperada = 3;

        //Act
        calculadora.exponenciar(valorExpoente);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }


    @Test
         public void testarExponenciarElevandoA10() throws Exception{
        //Arrange
        int valorExpoente= 10;
        int memoriaEsperada = 59049;

        //Act
        calculadora.exponenciar(valorExpoente);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }



    @Test
         public void testarExponenciarElevandoA20() throws Exception{
        //Arrange
        int valorExpoente= 20;
        int memoriaEsperada = 348678440;

        //Act
        calculadora.exponenciar(valorExpoente);
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }

     //8) Zerar Memória

         @Test
         public void testarZerarMemoria(){
        //Arrange
        
        int memoriaEsperada = 0;

        //Act
        calculadora.zerarMemoria();
        int memoriaObtida = calculadora.getMemoria();

        // Assert
        Assertions.assertEquals(memoriaEsperada, memoriaObtida);
     }




}
