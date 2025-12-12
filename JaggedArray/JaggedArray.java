import java.util.Scanner;
class JaggedArray {
    public static void main(String args[]) {
        int[][] jaggedArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        jaggedArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int columns = sc.nextInt();
            jaggedArray[i] = new int[columns];
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Enter the element [" + i + "][" + j + "]:");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Jagged Array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
