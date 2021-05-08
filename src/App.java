import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static Scanner inp = new Scanner(System.in);
    public static String letrasString[][] = new String[6][6];
    public static String letras[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
            "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

    public static void main(String[] args) throws Exception {
        letrasString[0][0] = "A";
        printTabla();
        Entrada();
    }

    private static void Entrada() throws InterruptedException, IOException {
        int x = 0, y = 0, l = 1, vacias = 0;
        String result = "";
        while (true) {
            for (l = 1; l < letras.length; l++) {
                String key = inp.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                switch (key) {
                    case "A", "a":
                        y--;
                        if (y < 0) {
                            y = 0;
                            break;
                        }
                        letrasString[x][y] = letras[l];
                        // printTabla();
                        break;
                    case "W", "w":
                        x--;
                        if (x < 0) {
                            x = 0;
                            break;
                        }
                        letrasString[x][y] = letras[l];
                        // printTabla();
                        break;
                    case "S", "s":
                        x++;
                        if (x > 5) {
                            x = 5;
                            break;
                        }
                        letrasString[x][y] = letras[l];
                        // printTabla();
                        break;
                    case "D", "d":
                        y++;
                        if (y > 5) {
                            y = 5;
                            break;
                        }
                        letrasString[x][y] = letras[l];
                        break;

                    default:
                        return;
                }
                printTabla();

                if (l == letras.length - 1) {
                    break;
                }

            }
            for (int f = 0; f < 6; f++)
                for (int c = 0; c < 6; c++)
                    vacias += Objects.isNull(letrasString[f][c]) ? 1 : 0;

            for (int i = 0; i < 6; i++) {
                result += Objects.isNull(letrasString[i][i]) ? "-" : letrasString[i][i];
            }
            System.out.print(result + vacias);
        }
    }

    private static void printTabla() {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(Objects.isNull(letrasString[x][y]) ? "-" : letrasString[x][y]);
                if (y != letrasString[x].length - 1)
                    System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
