import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static Scanner inp = new Scanner(System.in);
    public static String lettersString[][] = new String[6][6];
    public static String alphabet[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    public static void main(String[] args) throws Exception {
        lettersString[0][0] = "A";
        printTable();
        Input();
    }

    private static void Input() throws InterruptedException, IOException {
        int x = 0, y = 0, l = 1, vacias = 0;
        String result = "";
        while (true) {
            for (l = 1; l < alphabet.length; l++) {
                String key = inp.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // clear Windows console
                switch (key) {
                    case "A", "a":
                        y--;
                        if (y < 0) {
                            y = 0;
                            break;
                        }
                        lettersString[x][y] = alphabet[l];
                        break;
                    case "W", "w":
                        x--;
                        if (x < 0) {
                            x = 0;
                            break;
                        }
                        lettersString[x][y] = alphabet[l];
                        break;
                    case "S", "s":
                        x++;
                        if (x > 5) {
                            x = 5;
                            break;
                        }
                        lettersString[x][y] = alphabet[l];
                        break;
                    case "D", "d":
                        y++;
                        if (y > 5) {
                            y = 5;
                            break;
                        }
                        lettersString[x][y] = alphabet[l];
                        break;
                    default:
                        return;
                }
                printTable();
                // end of letter break the while
                if (l == alphabet.length - 1) {
                    break;
                }
            }
            // get empty matriz field
            for (int f = 0; f < 6; f++)
                for (int c = 0; c < 6; c++)
                    vacias += Objects.isNull(lettersString[f][c]) ? 1 : 0;
            // get diagonal of matriz
            for (int i = 0; i < 6; i++) {
                result += Objects.isNull(lettersString[i][i]) ? "-" : lettersString[i][i];
            }
            // print password
            System.out.print(result + vacias);
        }
    }

    private static void printTable() {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(Objects.isNull(lettersString[x][y]) ? "-" : lettersString[x][y]);
                if (y != lettersString[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
