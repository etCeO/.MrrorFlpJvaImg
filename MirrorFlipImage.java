/*
AUTHOR INFO

Full Name: Ethan E. Lopez
Student ID: 2425516
Chapman Email: etlopez@chapman.edu
Course Number And Section: CPSC-231-01
Assignment Or Exercise Number: MP 1: Mirror Flipping Images
 */

public class MirrorFlipImage { // referencing class file

    public static void displayImage(char[][] image) {
    // creates void method to print 2D array
        for (int i = 0; i < image.length; i++) {
        // outer loop for number of rows in char[][] image
            for (int j = 0; j < image[0].length; j++) {
            // inner loop for number of columns in char[][] image
                System.out.print(image[i][j] + " ");
                // accesses contents of 2D array and prints them
                // i is rows; j is columns
                // concatenated space for neatness in terminal
            }
            System.out.println();
            // adds newline for every row fully printed
        }
    }

    public static char[][] horizontalMirror(char[][] image) {
    // creates char[][] method to return an updated 2D array
        int a = image.length; // assigns variable to number of rows
        int b = image[0].length; // assigns variable to number of columns
        char[][] horizontalImage = new char[a][b];
        // creates a new 2D array to modify existing image
        int i = image.length - 1; // assigns variable to last row index
        int j = 0; // assigns variable to first row index
        while (i >= 0) {
            horizontalImage[j] = image[i];
            j++;
            i--;
        }
        // while number of rows is greater than or equal to 0
        // first row of horizontal image is assigned to last row of original image
        // j increments up and i increments down to perform a horizontal mirror effect
        return horizontalImage;
        // returns new char[][] in comparison to original image
    }

    public static char[][] verticalMirror(char[][] image) {
    // creates char[][] method to return an updated 2D array
        int a = image.length; // assigns variable to number of rows
        int b = image[0].length; // assigns variable to number of columns
        char[][] verticalImage = new char[a][b];
        // creates a new 2D array to modify existing image
        int i = image[0].length - 1; // assigns variable to last column index
        int j = 0; // assigns variable to first column index
        while (i >= 0) {
            int x = 0; // assigns variable to first row index
            while (x < image.length) {
                verticalImage[x][j] = image[x][i];
                x++;
            }
            j++;
            i--;
        }
        // while number of columns is greater than or equal to 0
        // while number of rows is less than the row length
        // last coordinate of image in row x is assigned with first coordinate of verticalImage in row x
        // x is incremented up every time a row is complete
        // j increments up and i increments down to perform a vertical mirror effect
        return verticalImage;
        // returns new char[][] in comparison to original image
    }

    public static void main(String[] args) { // main method created

        char[][] image = {
            {'#', 'x', '#', '#', '#'},
            {'#', ' ', '^', ' ', '#'},
            {'#', ' ', 'E', ' ', '#'},
            {'*', '0', '/', '0', '|'},
            {'-', ' ', '|', ' ', '-'},
            {'#', ' ', 'O', ' ', '#'},
            {'#', '#', '#', 'y', '#'},
        }; 
        // contents of my image presented in 2D array with chars

        displayImage(image); // prints original 2D array as char[][] image
        System.out.println(); // newline for separation and neatness
        displayImage(horizontalMirror(image)); // prints original 2D array with a horizontal mirror
        System.out.println(); // newline for separation and neatness
        displayImage(verticalMirror(image)); // prints original 2D array with a vertical mirror
        System.out.println(); // newline for separation and neatness
        displayImage(verticalMirror(horizontalMirror(image))); // prints 2D array horizontally and vertically flipped

    }
}
