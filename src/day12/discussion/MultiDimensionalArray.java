package day12.discussion;

public class MultiDimensionalArray {
    static void main(String[] args) {
        //declaration of multi dimentional array
        String[][] colors = {
                {"white","yellow","pink" },
                {"black", "brown", "red"}
        };

        //
//        String[][] planets = new String[rows][colums]
        System.out.println(colors.length);

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.println(colors[i][j]);
            }
            System.out.println();
        }

        for (String[] row:colors){
            for (String value : row){
                System.out.println(value);
            }

            System.out.println();
        }

    }
}
