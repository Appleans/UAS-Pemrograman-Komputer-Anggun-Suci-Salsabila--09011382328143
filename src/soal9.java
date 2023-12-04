import java.util.Stack;
public class soal9 {
    public static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(') {
                stack.push(karakter); 
            } else if (karakter == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        String ekspresi1 = "(4 + 9) * (5 - 0)";
        String ekspresi2 = "(12 + 4) + (6 * 2))";

        boolean hasil1 = cekUrutanKurung(ekspresi1);
        boolean hasil2 = cekUrutanKurung(ekspresi2);

        System.out.println(ekspresi1);
        System.out.println("Hasil ekspresi 1: " + (hasil1 ? "Urutan kurung benar" : "Urutan kurung salah"));
        System.out.println("");
        System.out.println(ekspresi2);
        System.out.println("Hasil ekspresi 2: " + (hasil2 ? "Urutan kurung benar" : "Urutan kurung salah"));
    }
}

