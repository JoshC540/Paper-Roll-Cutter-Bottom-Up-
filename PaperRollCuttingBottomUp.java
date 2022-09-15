//Joshua Cronin R00200811
public class PaperRollCuttingBottomUp{
    int countOfFive, countOfThree, countOfTwo, countOfOne;
    //Costs
    double totalValue = 0.0;
    double valueOfFive = 10.1;
    double valueOfThree = 5.8;
    double valueOfTwo = 3.0;
    double valueOfOne = 1.2;

    //The higher lengths are worth more than any possible combo of smaller lengths, thus we check how many times the
    // largest value divides in and repeat with the next largest value and the remainder of length
    PaperRollCuttingBottomUp(int length){
        int number = length;
        checkIfDivisibleByFive(number);
        number = number - (5 * countOfFive);
        totalValue += countOfFive * valueOfFive;

        checkIfDivisibleByThree(number);
        number = number - (3 * countOfThree);
        totalValue += countOfThree * valueOfThree;

        checkIfDivisibleByTwo(number);
        number = number - (2 * countOfTwo);
        totalValue += countOfTwo * valueOfTwo;

        checkIfDivisibleByOne(number);
        totalValue += countOfOne * valueOfOne;

        printResults(totalValue, length);
    }

    void  checkIfDivisibleByFive(int number){
        countOfFive = number / 5;

    }

    void checkIfDivisibleByThree(int number){
        countOfThree = number / 3;
    }

    void checkIfDivisibleByTwo(int number){
        countOfTwo = number / 2;
    }

    void checkIfDivisibleByOne(int number){
        countOfOne = number / 1;
    }

    void printResults(double totalValue, int originalLength){
        System.out.println("The size of the paper roll was: " + originalLength);
        System.out.printf("The total value was: €%.2f\n", totalValue);
        System.out.println("The number of pieces of size five: " + countOfFive);
        System.out.println("The number of pieces of size three: " + countOfThree);
        System.out.println("The number of pieces of size two: " + countOfTwo);
        System.out.println("The number of pieces of size one: " + countOfOne + "\n");

    }
}
