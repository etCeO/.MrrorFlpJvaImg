# Mirror Flipping Images

- A program that manipulates two-dimensional character arrays by generating vertical and horizontal reflections, demonstrating array processing, indexing techniques, and transformation operations to produce mirrored versions of the original data structure.

## Author Info

- Full Name: Ethan E. Lopez
- Chapman Email: etlopez@chapman.edu
- Course Number And Section: CPSC-231-01
- Assignment Or Exercise Number: MP 1: Mirror Flipping Images

## Usage

1. If necessary, compile the program, or run it in the selected development environment (Java).
2. Load or define a 2D character array that represents the image to be flipped.
3. Decide on a type of reflection:
- Vertical Flip: Flips the image along its own vertical axis.
- Horizontal Flip: Reflects the image across its horizontal axis.

The program prints or writes the transformed array to the output console or to a file, depending on the implementation.

## Input Format

- The program accepts a 2D array of characters that describe an image or pattern.
- Each row represents a line of the array, and the individual character represents the pixel or element.
- The input can be given directly in the code, from a file, or from user input.

## Implementation Details

- Nested loops are used to traverse the 2D array and perform swap operations for reflections.
- The vertical flip reverses the elements in the rows.
- The horizontal flip reverses the order of rows in the array.
- The program ensures the original array is unchanged in case a copy is needed for the output.
- Output is formatted to preserve the structure of the original array.
