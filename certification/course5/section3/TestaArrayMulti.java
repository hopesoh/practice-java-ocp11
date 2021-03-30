public class TestaArrayMulti {
    public static void main(String[] args) {

        int[][] tabela;
        int[][] cubo[];

        tabela = new int[10][5];
        cubo = new int[10][][];

        int[][] teste = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};

        int[][] estranho = new int[2][];
        estranho[0] = new int[20];
        estranho[1] = new int[10];

        for(int i=0; i < estranho.length; i++) {
            System.out.println(estranho[i].length);
        }
    }
}