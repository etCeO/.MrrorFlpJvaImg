# Mirror Flipping Images

- A program that manipulates two-dimensional character arrays by generating vertical and horizontal reflections, demonstrating array processing, indexing techniques, and transformation operations to produce mirrored versions of the original data structure.

## Author Info

- Full Name: Ethan E. Lopez
- Chapman Email: etlopez@chapman.edu
- Course Number And Section: CPSC-231-01
- Assignment Or Exercise Number: MP 1: Mirror Flipping Images

## Usage

1. Compile (if necessary) or run the program in the chosen development environment.
2. Load or define a 2D character array representing the image to be flipped.
3. Choose the type of reflection:
- Vertical flip: Mirrors the image along its vertical axis.
- Horizontal flip: Mirrors the image along its horizontal axis.

The program outputs the transformed array to the console or writes it to a file, depending on the implementation.

## Input Format

- The program accepts a 2D array of characters representing an image or pattern.
- Each row corresponds to a line in the array, and each character represents a pixel or element.
- Input can be provided directly in the code, through a file, or via user input (depending on the implementation).

## Implementation Details

- The program uses nested loops to traverse the 2D array and perform element swaps for reflections.
- Vertical flip reverses the order of elements in each row.
- Horizontal flip reverses the order of rows in the array.
- The program ensures the original array remains unchanged if a copy is required for output, demonstrating good practices in array manipulation and memory handling.
- Output is formatted to maintain the visual structure of the original array.
