public class TestaTrataException {
    public static void main(String[] args) {
        String nome = null;
        try {
            nome.toLowerCase();
            System.out.println("linha seguinte");
        } catch (NullPointerException e) {
            System.out.println("peguei");
        }
        System.out.println("terminei");
    }
}