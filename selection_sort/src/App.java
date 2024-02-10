public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 5, 10, 7, 1, 4, 9, 3, 11 };

        for (int i = 0; i < numeros.length - 1; i++) {
            int menor = menorNumero(numeros, i); // Encontra o índice do menor número a partir do índice i
            int temp = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = temp;
        }

        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    private static int menorNumero(int[] numeros, int startIndex) {
        int menor = startIndex;
        for (int i = startIndex + 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[menor]) {
                menor = i;
            }
        }
        return menor;
    }
}
