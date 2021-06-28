public class SuaClasse {
    public void fazAlgo(int[] idades) {
        System.out.println(idades[1]);
    }

    public static void main(String[] args) {
        new SuaClasse().fazAlgo(new int[0]);
    }
}