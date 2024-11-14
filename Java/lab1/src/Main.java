import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Controller();
    }
    static void Model(LinkedList<Integer> newarr, int Step) {
        if (arprog(newarr, Step)) View("\n+ Арифметическая прогрессия с шагом " + Step);
        else View("\n- Не является арифметической прогрессией с шагом " + Step);
        if(geomprog(newarr, Step)) View("\n+ Геометрическая прогрессия с шагом " + Step);
        else View("\n- Не является геометрической прогрессией с шагом " + Step);
        if (powerprog(newarr, Step)) View("\n+ Показательная прогрессия с шагом " + Step);
        else View("\n- Не является показательной прогрессией с шагом " + Step);
    }

    static void View(String str) {
        System.out.print(str);
    }

    static void Controller() {
        try {
            Scanner scan = new Scanner(System.in);
            View("Введите кол-во элементов массива: ");
            int len = scan.nextInt();
            int[] Arr = new int[len];
            View("\nВведите элементы массива: ");
            for (int i = 0; i < Arr.length; i++) Arr[i] = scan.nextInt();
            View("Введите шаг: ");
            int Step = scan.nextInt();
            while (Step >= len || Step <= 0 || String.valueOf(Step).length() > 1) {
                View("\n\nШаг < кол-ва элементов массива и шаг > 0!\n");
                Step = scan.nextInt();
            }
            LinkedList<Integer> newarr = new LinkedList<>();
            boolean flag = false;
            for(int i = Step - 1; i < Arr.length; i+= Step) newarr.add(Arr[i]);
            Model(newarr, Step);
        } catch (InputMismatchException e) {
            View("Некорректный ввод, попробуйте заново\n");
            Controller();
        }
    }
    public static boolean arprog(LinkedList<Integer> newarr, int step) {
        boolean flag = false;
        if (newarr.size() == 1) {
            for(Integer el: newarr) View(el + " \n");
            return false;
        }
        else {
            int d = newarr.get(1) - newarr.get(0);
            for(int i = 1; i < newarr.size(); i++) {
                if (newarr.get(i-1) + d == newarr.get(i)) flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            for(Integer el: newarr) View(el + " ");
            View("\n");
            return flag;
        }

    }
    public static boolean geomprog(LinkedList<Integer> newarr, int step) {
        boolean flag = false;
        if (newarr.size() == 1) return false;
        else if  (newarr.get(0) == 0) return false;
        else {
            int q = newarr.get(1) / newarr.get(0);
            for (int i = 1; i < newarr.size(); i ++ ) {
                if (newarr.get(i-1) * q == newarr.get(i)) flag = true;
                else flag = false;
            }
            return flag;
        }
    }
    public static boolean powerprog(LinkedList<Integer> newarr, int step) {
        boolean flag = false;
        if (newarr.size() == 1) return false;
        else if (newarr.get(0) == 0) return false;
        else if (newarr.get(0) == 1) return false;
        else {
            int k = 1;
            int num1 = newarr.get(0);
            int num2 = newarr.get(1);
            while (num1 < num2) {
                k += 1;
                num1 *= num1;
            }
            int b;
            for (int i = 1; i < newarr.size(); i++) {
                b = power(k, i);
                if (newarr.get(i) != power(newarr.get(0), b )) return false;
                else flag = true;
            }
        }
        return flag;
    }
    public static int power(int n, int z) {
        int c = n;
        for (int i = 1; i < z; i ++) n = n * c;
        return n;
    }
}
