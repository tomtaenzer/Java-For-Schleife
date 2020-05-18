public class WhileFakultaet {

    public static int fakultaet() {
        int fakultaet = 1;
        int n = 1;

        while (n > 1) {
            fakultaet = fakultaet * n;
            n = n - 1;
        }
        return fakultaet;
    }
}
