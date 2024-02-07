/**
 * The ExtendedClass contains methods to calculate the square, cube, and modulus of floating-point
 * numbers.
 */
class ExtendedClass {
   /**
    * The function "square" takes a float operand and returns the square of that operand.
    * 
    * @param operand_1 A float value that represents the operand to be squared.
    * @return the square of the operand_1.
    */
    float square(float operand_1){
        return(operand_1*operand_1);
    }
    /**
     * The function "cube" takes a float number as input and returns the cube of that number.
     * 
     * @param operand_1 The parameter "operand_1" is a float value that represents the number that we
     * want to calculate the cube of.
     * @return The cube of the operand_1 value.
     */
    float cube(float operand_1){
        return(operand_1*operand_1*operand_1);
    }
   /**
    * The function calculates the modulus of two floating-point numbers.
    * 
    * @param operand_1 The first operand for the modulo operation.
    * @param operand_2 The second operand in the modulo operation.
    * @return the remainder of dividing operand_1 by operand_2.
    */
    float mod(float operand_1, float operand_2){
        return(operand_1%operand_2);
    }
}