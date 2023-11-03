import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, xb, yb, l;
        n = input.nextInt();
        xb = input.nextInt();
        yb = input.nextInt();
        l = input.nextInt();
        ArrayList<Integer> xa = new ArrayList<Integer>(n);
        ArrayList<Integer> ya = new ArrayList<Integer>(n);
        for (int z = 0; z < n; z++) {
            xa.add(input.nextInt());
            ya.add(input.nextInt());
        }
        for (int z = 0; z < n; z++) {
            if ((xb - xa.get(z)) * (xb - xa.get(z)) + (yb - ya.get(z)) * (yb - ya.get(z)) <= l * l) {
                System.out.println(z + 1);
                return;
            }
        }
        System.out.println("Yes");
    }
}
