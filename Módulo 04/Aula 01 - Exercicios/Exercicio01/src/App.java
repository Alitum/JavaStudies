import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean finishGame = false;
        char[][] tabuleiro = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' }
        };
        char currentPlayer = 'X';
        int totalmoves = 0;
        do {
            System.out.println("\n\n\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);

                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }

                System.out.println();
                if (i < 2) {
                    System.out.println("----------");
                }
            }
            System.out.println("\n\n");

            System.out.println("Player " + currentPlayer + " is your turn");
            int positionChoosen = sc.nextInt();

            if (positionChoosen < 1 && positionChoosen > 9) {
                System.out.println("Posição inválida!");
                continue;
            }

            switch (positionChoosen) {
                case 1:
                    if (tabuleiro[0][0] != 'X' && tabuleiro[0][0] != 'O') {
                        tabuleiro[0][0] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 2:
                    if (tabuleiro[0][1] != 'X' && tabuleiro[0][1] != 'O') {
                        tabuleiro[0][1] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 3:
                    if (tabuleiro[0][2] != 'X' && tabuleiro[0][2] != 'O') {
                        tabuleiro[0][2] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 4:
                    if (tabuleiro[1][0] != 'X' && tabuleiro[1][0] != 'O') {
                        tabuleiro[1][0] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 5:
                    if (tabuleiro[1][1] != 'X' && tabuleiro[1][1] != 'O') {
                        tabuleiro[1][1] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 6:
                    if (tabuleiro[1][2] != 'X' && tabuleiro[1][2] != 'O') {
                        tabuleiro[1][2] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 7:
                    if (tabuleiro[2][0] != 'X' && tabuleiro[2][0] != 'O') {
                        tabuleiro[2][0] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 8:
                    if (tabuleiro[2][1] != 'X' && tabuleiro[2][1] != 'O') {
                        tabuleiro[2][1] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
                case 9:
                    if (tabuleiro[2][2] != 'X' && tabuleiro[2][2] != 'O') {
                        tabuleiro[2][2] = currentPlayer;
                    } else {
                        System.out.println("Invalid position! Choose another square on the board!");
                        continue;
                    }
                    break;
            }

            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == currentPlayer && tabuleiro[i][1] == currentPlayer
                        && tabuleiro[i][2] == currentPlayer) {
                    System.out.println("\n\nPlayer " + currentPlayer + " is the winner\n\n");
                    finishGame = true;
                    break;
                }
                if (tabuleiro[0][i] == currentPlayer && tabuleiro[1][i] == currentPlayer
                        && tabuleiro[2][i] == currentPlayer) {
                    System.out.println("\n\nPlayer " + currentPlayer + " is the winner\n\n");
                    finishGame = true;
                    break;
                }
            }

            if (tabuleiro[0][0] == currentPlayer && tabuleiro[1][1] == currentPlayer
                    && tabuleiro[2][2] == currentPlayer) {
                System.out.println("\n\nPlayer " + currentPlayer + " is the winner\n\n");
                finishGame = true;
            }

            if (tabuleiro[0][2] == currentPlayer && tabuleiro[1][1] == currentPlayer
                    && tabuleiro[2][0] == currentPlayer) {
                System.out.println("\n\nPlayer " + currentPlayer + " is the winner\n\n");
                finishGame = true;
            }

            if (!finishGame) {
                finishGame = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tabuleiro[i][j] != 'X' && tabuleiro[i][j] != 'O') {
                            finishGame = false;
                        }
                    }
                }
            }

            if (finishGame) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tabuleiro[i][j]);

                        if (j < 2) {
                            System.out.print(" | ");
                        }
                    }

                    System.out.println();
                    if (i < 2) {
                        System.out.println("----------");
                    }
                }
                System.out.println();
            }

            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
            totalmoves++;
            if (totalmoves == 9) {
                System.out.println("\n\nIt's a tie!\n\n");
                finishGame = true;
            }
        } while (!finishGame);
        sc.close();
    }
}