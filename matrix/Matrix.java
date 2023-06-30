package Matrix;

import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) { 
        matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                matrix[i][j] = random.nextInt(10); 
            }
        }
    }

    public int Razn() { //разность чисел ниже диагонали
        int v = 0;
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < i; j++) { 
                v -= matrix[i][j]; 
            }
        }
        return v;
    }

    public int Summa() { //сумма чисел выше диагонали
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = i + 1; j < matrix[i].length; j++) { 
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int diagonal() { //произведение чисел на диагонали
        int d = 1;
        for (int i = 0; i < matrix.length; i++) { 
            d *= matrix[i][i]; 
        }
        return d;
    }

    public String toString() { //редактирование матрицы
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) { 
            for (int el : row) {
                sb.append(String.format("%2d", el));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}