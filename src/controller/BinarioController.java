package controller;

public class BinarioController {
    public BinarioController() {
        super();
    }

    public String FuncBinario(int N) {
        //Condição de parada -> Quando N for igual a 1, retorna 1 como String
        //Na concatenação e encerra a pilha de chamadas.

        if (N == 1) {
            return "1";
        }
        int res = N % 2;
        String s = String.valueOf(res);
        N /= 2; // N = N / 2
        return FuncBinario(N) + s;
    }

    /*
        A função recursiva funciona da seguinte forma: Ela recebe um número inteiro
        como parâmetro informado pelo usuário, e para converter-lo em binário, ela
        guarda o resto da divisão por 2 em uma variavel inteira, em seguida, a função
        converte este valor para String, e vai diminuíndo o valor de N a cada nova chamada
        dividindo o valor de N por 2, e então na hora de realizar a chamada da função
        ele realiza de forma "reversa" onde é concatenado primeiro a própria função e depois
        o valor do resto.
        Então está pilha de chamadas continua até que N seja igual a 1, e retorna "1" no final
        da conversão. Assim, chegando na condição de parada e finalizando a função, retornando
        o valor convertido para o usuário.

     */
}
