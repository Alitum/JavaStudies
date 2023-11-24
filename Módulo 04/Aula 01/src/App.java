import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("================================= Array =================================");
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.println("position " + i + ": " + array[i]);
        }
        System.out.println("================================= Matriz =================================");
        int[][] matriz = new int[3][4];

        matriz[0][0] = 10;
        matriz[1][0] = 100;
        matriz[2][0] = 1000;

        matriz[0][1] = 20;
        matriz[1][1] = 200;
        matriz[2][1] = 2000;

        matriz[0][2] = 30;
        matriz[1][2] = 300;
        matriz[2][2] = 3000;

        matriz[0][3] = 40;
        matriz[1][3] = 400;
        matriz[2][3] = 4000;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
