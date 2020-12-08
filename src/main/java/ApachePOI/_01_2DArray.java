package ApachePOI;

public class _01_2DArray {
    public static void main(String[] args) {
        String[][]zoo={{"aslan","3"},{"Kaplan","2"},{"Zebra","1"},{"fil","2"}};
        System.out.println(zoo[2][0]);
        for (int i = 0; i < zoo.length ; i++) {
            for (int j = 0; j <zoo[i].length ; j++) {
                System.out.print(zoo[i][j]);
            }

            System.out.println();
        }

    }
}
