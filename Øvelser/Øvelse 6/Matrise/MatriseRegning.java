package Matrise;

public class MatriseRegning {
    private int[][] matrix;
    private int columns;
    private int rows;

    public MatriseRegning (int columns, int rows) {
        this.matrix = new int[columns][rows];
        this.columns = columns;
        this.rows = rows;

        java.util.Random random = new java.util.Random();

        for (int i = 0; i < matrix.length; i++) { //Lager matrisen
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(columns); //Putter inn random tall
            }
        }
    }

    public MatriseRegning (int[][]matrix) {
        this.matrix = matrix;
        columns = matrix[0].length;
        rows = matrix.length;
    }

    @Override
    public String toString() { //For å skrive ut matrisene
        String output = "";
        for (int i = 0; i < matrix.length; i++) {
            output += "[";
            for (int j = 0; j < matrix[i].length; j++) {
                output += (matrix[i][j] + ", ");
            }
            output += "]";
            output += "\n";
        }
        return output;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public MatriseRegning addere(MatriseRegning matrix2) { //Summere matrisene
        int[][]mat3 = new int[columns][rows];
        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3.length; j++) {
                mat3[i][j] = matrix[i][j]+matrix2.matrix[i][j];
            }
        }
        return new MatriseRegning(mat3);
    }

    public MatriseRegning multiply(MatriseRegning matrix2) { //Multiplisere matrisene
        int[][]mat3 = new int[columns][rows];

        int sum = 0;
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < matrix2.matrix[0].length; j++) {
                for (int x = 0; x < matrix2.matrix.length; x++) {
                    sum = sum + matrix[i][x]*matrix2.matrix[x][j];
                }

                mat3[i][j] = sum;
                sum = 0;
            }
        }
        return new MatriseRegning(mat3);
    }

    public MatriseRegning Transpose() { //Transponere matrisene
        int[][]mat3 = new int[columns][rows];
        for (int i = 0; i < mat3.length; i++) {
            for (int j = 0; j < mat3[i].length; j++) {
                mat3[i][j] = matrix[j][i];
            }
           
        }  return new MatriseRegning(mat3);
    } 


}
