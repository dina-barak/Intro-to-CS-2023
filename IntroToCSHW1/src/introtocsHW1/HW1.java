/*
 * Be sure to submit your work in a folder called introtocsHW1
 * 
 * Some words about submission:
 * Code that does not compile will receive a grade of 0.
 * Code must rigorously follow style guidelines. (15 points)
 *     Much of this has been done for you.  
 * https://www.oracle.com/java/technologies/javase/codeconventions-contents.html
 *
 * Code must work without bugs exactly as described in the API and assignment
 * instructions(50 points).
 * 
 * We use software to detect cheating.  
 * Copying from anywhere, online or otherwise, using chat GPT or similar 
 * software, or in any way collaborating with another student is cheating and 
 * will earn the student a grade of 0.
 * 
 * Questions regarding this assignment should be addressed to Dr. Neimand,
 * dovne@sce.ac.il
 */
package introtocsHW1;

import static introtocsHW1.PartialSolution.ballInBox;


/**
 * This class includes a sampling of functions that every intro to CS student
 * should know how to implement.
 *
 * @author Efraim Dov Neimand
 */
public class HW1 {

    /**
     * The average of two numbers
     *
     * @param a The first number
     * @param b The second number
     * @return The average of a and b
     */
    public static double average(int a, int b) {
        double average;

        ///////Insert your code below this line. //////////////
        /*
        THIS EXERCISE WILL BE SOLVED IN CLASS

        We have declared three variables for you, a, b and average.
        You don't know what a, b are, and average is undefined.

        Set average to be the average of a and b.

        For example, if a is 1 and b is 3 then average will be 2.
        If a is 1 and b is 2 then average will be 1.5.

        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.

         */////////All student code should be above this line.////////////////
        return average;
    }

    /**
     * Converts miles to kilometers
     *
     * @param miles The number of miles
     * @return The conversion to kilometers
     */
    public static double milesToKilometer(double miles) {
        double kilometers;

        ///////Insert your code below this line. //////////////
        /*
        THIS EXERCISE WILL BE SOLVED IN CLASS

        We have declared two variables for you, miles and kilometers.
        You don't know what miles is, and kilometers is undefined.

        Set kilometers to be the conversions of miles into kilometers.
        (One mile equals 1.60935 kilometers.)

        For example, if miles is 10 then kilometers will be 16.0935.

        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.

         */////////All student code should be above this line.////////////////
        return kilometers;
    }

    /**
     * The absolute value of a number.
     *
     * @param x The number for which the absolute value is desired.
     * @return The absolute value of x.
     */
    public static double abs(double x) {
        double abs;

        ///////Insert your code below this line. //////////////
        /*
        
        We have declared two variables for you, x and abs.
        You don't know what x is, and abs is undefined.  
        
        Set abs to be the absolute value of x.  
                
        For example, if x is 7, abs will be 7.
        If x = -0.4 then abs should be positive 0.4.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return abs;
    }

    /**
     * Are the two values nearly equal to one another?
     *
     * @param x The first value.
     * @param y The second value.
     * @param error The margin of error allowed for numerical errors.
     * @return True if they are equal, false otherwise.
     */
    public static boolean equals(double x, double y, double error) {

        ///////Insert your code below this line. //////////////
        /*
        
        We have declared three variables for you, x, y, and error.
        You don't know what their values are.  
        
        Declare a variable called areEqual.
        Set it to true, if x is equal to y, or they are within the given 
        margin of error of each other, defined by the variable error.
                
        For example, if x = 3, and y = 3.000001, and error = 1e-2, then 
        areEqual will be true.  But if x = 3, y = 12, and error = 1e-7, then 
        areEqual will be false.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return areEqual;
    }

    /**
     * Determines weather or not an integer is prime.
     *
     * @param n The integer in question.
     * @return If n is prime then true, otherwise false.
     */
    public static boolean isPrime(int n) {

        ///////Insert your code below this line. //////////////
        /*
        
        We have declared integer n for you.  You don't know what n is.  
        We want you to create a boolean variable called isPrime, 
        and  set its value to true if n is prime, and false otherwise.  
        
        For example, if n = 9 then isPrime should be set to false.  If n = 5
        then isPrime should be true.  A reminder, a number is prime if and only
        if it is divisible by two distinct numbers, 1 and itself. Note that
        a result of the previous sentence is that 1 is not a prime.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return isPrime;
    }

    /**
     * Gets the digit of the desired index in a number. For example, if num =
     * 5762, and ind = 2 then this method will return 7. If ind = 0, then this
     * method will return 2.
     *
     * @param num The number from which a digit is to be taken.
     * @param ind The index of the desired digit.
     * @return The digit in number num at index ind.
     */
    public static int digit(int num, int ind) {

        ///////Insert your code below this line. //////////////
        /*
        
        We have declared two variables for you, num and ind.  
        You don't know what their values are.
        
        We want you to create a variable called digit that will hold a value
        between 0 and 9.
        Set digit to be the digit of num at the given index.  If ind = 0, then
        digit should equal to the one's column value of num.  
        If ind = 1 then digit should equal the ten's column value, and so on.
        
        For example, if num = 5762, and ind = 2 then digit = 7.
        If ind = 0, then digit = 2.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return digit;
    }

    /**
     * Finds the requested digit of a number in binary notation.
     *
     * @param num The number the digit is taken from.
     * @param ind the index of the desired digit.
     * @return the digit, true for 1, false for 0, and the given index.
     */
    public static boolean binaryDigit(int num, int ind) {
        ///////Insert your code below this line. //////////////
        /*
        
        We have declared two variables for you, num and ind.  
        You don't know what their values are.
        We want you to create a variable called digit that can hold exactly
        two values.
        
        Set digit to be the digit of num in binary representation at the given 
        index.  
        
        If ind = 0, then digit should equal one's column value of num.  
        If ind = 1 then digit should equal the two's column value, and so on.
        
        For example, if num = 5, and ind = 2 then digit = true to indicate there
        is a 1 there.
        If ind = 0, then digit = true to indicate there is a 1 there.
        Use false to indicate a 0 when appropriate.
        
        You may use any resource you like to help you understand binary numbers
        in a strictly mathematical context.  As always, you should not be
        looking at any one else's code to help you solve this problem.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////

        return digit;
    }

    /**
     * This method swaps the values of a and b, returning an array where the
     * first value is b and the second value is a.
     *
     * @param a The first value.
     * @param b The second value.
     * @return And array of {b, a}.
     */
    public static char[] swap(char a, char b) {

        ///////Insert your code below this line. //////////////
        /*
        
        We have declared two variables for you, a and b.  
        You don't know what their values are.
        We want you to swap their values.
        
        For example, if a = 'c' and b = 'q' then you will change them so that
        b = 'c' and a = 'q';
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return new char[]{a, b};
    }

    /**
     * There are two locations, the pond, and the tree. There is a duck that
     * likes to walk from one, to the other, in either direction. At the end of
     * each walk, the duck is at the other location, whichever one the duck did
     * not start the walk at. If the duck goes for one walk, and starts at the
     * pond, then the duck finishes at the the tree. If the duck goes for two
     * walks, and starts at the tree, then the first walk takes the duck to the
     * pond, and the second walk takes the duck back to the tree.
     *
     * @param numWalks The total number of walks the duck takes. This should be
     * nonNegative.
     * @param startsAtPond True if the duck starts at the pond, and false if the
     * duck starts at the tree.
     * @return True if the duck finishes at the pond and false if the duck
     * finishes at the tree.
     */
    public static boolean duckWalk(int numWalks, boolean startsAtPond) {
        ///////Insert your code below this line. //////////////
        /*
        
        We have declared two variables for you, numWalks and startsAtPond.  
        You don't know what their values are, except that numWalks is 
        nonNegative.
        
        There are two locations, the pond, and the tree.
        There is a duck that likes to walk from one, to the other, in either 
        direction.
        At the end of each walk, the duck is at the other location, whichever
        one the duck did not start the walk at.
        
        If the duck goes for one walk (numWalks = 1), and starts at the pond, 
        then the duck finishes at the tree.
        If the duck goes for two (num walks = 2) walks, and starts at the tree, 
        then the first walk takes the duck to the pond, and the second walk 
        takes the duck back to, and finishes at the tree.
        
        If startsAtPond = true, then the duck starts at the pond.  Otherwise,
        the duck starts at the tree.  Then the duck goes for numWalks walks.
        
        Create a variable called atPond.
        If the duck finishes at the pond, then atPond should be true.  Otherwise
        atPond should be false.
        
        See if you can get your answer down to a single line.  
        Do not use a loop.  That would be ineficiant.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return atPond;
    }

    /**
     * From binary representation to decimal
     *
     * @param binary The binary (base-2) representation of an integer
     * @return The decimal (base-10) representation of binary
     */
    public static int binaryToDecimal(int binary) {
        int decimal;

        ///////Insert your code below this line. //////////////
        /*

        We have declared two variables for you, binary and decimal.
        You don't know what binary is, and decimal is undefined.
        binary is a non-negative int variable that represents an integer in base 2.
        For example, binary =  101 is the base-2 representation of 5.

        Set decimal to be value (in base 10) of binary.

        For example, if binary is 101 then decimal will be 5.

        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.

         */////////All student code should be above this line.////////////////
        return decimal;
    }

    /**
     * From decimal (base-10) representation to binary (base-2) representation
     *
     * @param decimal The decimal (base-10) representation of an integer
     * @return The binary (base-2) representation of decimal
     */
    public static int decimalToBinary(int decimal) {
        int binary;

        ///////Insert your code below this line. //////////////
        /*

        The int variable decimal is a non-negative integer (in base 10).

        Set binary to be the binary representation (in base 2) of decimal.

        For example, if decimal is 5 then binary will be 101.

        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.

         */////////All student code should be above this line.////////////////
        return binary;
    }

    /**
     * Multiply two complex numbers (In linear algebra you learned to multiply
     * complex numbers.) Suppose we have two complex numbers z1 = Re1 + Im1 * i
     * and z2 = Re2 + Im2 * i Denote their multiplication by z3 = z1 * z2, where
     * z3 = Re3 + Im3 * i
     *
     * @param Re1 Real part of first number
     * @param Im1 Imaginary part of first number
     * @param Re2 Real part of second number
     * @param Im2 Imaginary part of second number
     * @return Re3, Im3, the real and imaginary parts of z3
     */
    public static double[] multiplyComplexNumbers(double Re1, double Im1,
            double Re2, double Im2) {
        double Re3, Im3;

        ///////Insert your code below this line. //////////////
        /*

        We have declared six variables for you:
        Re1 and Im1 are the real and imaginary parts of z1,
        Re2, Im2 -- for z2 and Re3, Im3 -- for z3, all as described above.
        
        You need to calculate z3 = z1 * z2 and assign Re3 and Im3 accordingly.

        For example, if Re1 = 0, Im1 = 1, Re2 = 0, and Im2 = 1. 
        In this case  z1 = i and z2 = i and therefore z3 = i * i = -1
        So, Re3 = -1 and Im3 = 0.  
          
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.

         */////////All student code should be above this line.////////////////
        return new double[]{Re3, Im3};
    }

    /**
     * In a cell colony, each cell splits in two with every generation. Each
     * cell dies after 5 generations. This method determines how many cells
     * there are in the colony after a given number of generations.
     *
     * @param numGenerations The number of generations that transpire. This
     * should be nonnegative.
     * @param initialNumberOfCells The number of cells in the colony. This
     * should be nonnegative.
     * @return The number of cells in the colony after numGenerations
     * generations.
     */
    public static int numCells(int numGenerations, int initialNumberOfCells) {
        ///////Insert your code below this line. //////////////
        /*
        In a cell colony, each cell splits in two with every generation, one new
        cell and one original older cell.
        Each cell dies after 2 generations.  
        We want to determine how many cells there are in the colony after a
        given number of generations.
        
        We have declared two variables for you, numGenerations and 
        initialNumberOfCells.  
        You don't know what their values are. 
        numGenerations represents the total number of generations you need to
        track and initialNumberOfCells the number of cells the colony starts 
        with, all brand new.
        
        Create a variable called numCells and set it equal to the number of 
        cells in the colony after numGenerations generations.
        
        For example, if initialNumberOfCells = 1, and numGenerations = 3 then 
        numCells should be set to 3.  1 + 1 + (2 - 1) = 3.
        
        If however numGenerations is 6
        and initialNumberOfCells = 1 then 
        numCells should be 13.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return numCells;
    }

    /**
     * Finds the number of coprime pairs in an interval of integers.
     *
     * @param from The smallest number in the interval.
     * @param to The end of the interval, exclusive.
     * @return The number of coprime pairs in the interval.
     */
    private int coPrime(int from, int to) {

        ///////Insert your code below this line. //////////////
        /*
        Two integers are coprime if they share no common factors, except for 1.
        
        We provide you with two integers that you don't know the values of, from
        and to.
        
        Create an integer called numCoPrimes.  Set it's value equal to the 
        number of coprimes greater than or equal to from and less than to.
        
        For example, if from is 3 and to is 7 then the following are coPrime
        pairs (3, 4), (3, 5), (4, 5), and (5, 6).  So set numCoPrimes = 4.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
         */////////All student code should be above this line.////////////////
        return numCoPrimes;
    }

    /**
     * A ball moves an increment in a box.
     *
     * @param xLoc The x-locations of the ball.
     * @param yLoc The y-location of the ball.
     * @param xVel The x velocity of the ball.
     * @param yVel The y-velocity of the ball.
     * @param rightWall The x value of the right wall.
     * @param cieling The y value of the top wall.
     * @param diameter The diameter of the ball.
     * @return The balls new location and velocity values [xLoc, yLoc, xVel,
     * yVel]
     */
    public static Ball ballInBox(
            double xLoc, double yLoc, double xVel,
            double yVel, final int rightWall,
            final int cieling, final double diameter) {

        ///////Insert your code below this line. //////////////
        /*
        A ball is bouncing around the inside of a two dimensional box.
        The ball's center has an x-location, a y-location, an x-velocity, and a 
        y-velocity all tracked by the variables xLoc, yLoc, xVel, and yVel.
        
        The box has four walls, one on the x axis, one on the y axis, one 
        rightWall parallel to the y axis, and one cieling parallel to the x
        axis.
        
        The balls diameter is in the variable with the same name, which you 
        also do not know.
        
        You need to update the location and velocity variables for a single time 
        increment.
        
        When the ball is away from the edges of the box, it location is affected
        only by its velocity.  The velocity values are added to the location
        values.  The velocity itself is unchanged in this case.
        
        For example, if xLoc = 30, yLoc = 20, xVel = 5, yVel = -5, and
        rightWall = ceiling = 100, then you need to set xLoc = 35 and yLoc = 15.

        (We shall always assume that xVel < rightWall - 2*diameter
        and yVel < ceiling - 2*diameter, and therefore the ball may
        only bounce once during a step.)
        
        For the purpose of this exercise, we assume that the ball has 100% 
        elasticity. That means that if the edge of the ball hits the wall it's 
        velocity orthogonal to the wall is reversed, i.e. mulitiplied by -1, 
        and the ball moves in the opposite direction.  
        
        The x-velocity is reversed when the ball hits the y axis and rightWall.
        The y-velocity is reversed when the ball hits the x axis and the ceiling.
        
        For example, if a ball has a xLoc = 4 and xVel = -10, and a diameter = 4
        then it's new x-location will be xLoc = 10.  
        It moved 2 toward the y-axis, when the edge of the ball at radius two
        hit the axis. Then moves 8 back to the right totalling 2 + 8 = 10,
        the ball's speed.  
        Its x-velocity is now xVel=+10.  
        All other values remain unchanged since the ball isn't near any other 
        walls.
        
        For example, if the ball is near the ceiling (and has 0 diameter), let xLoc = 20, 
        yLoc = 50, xVel = 2, and yVel = 5, and cieling = 53. The ball moves a 
        total distance of five, up three, hits the cieling, and comes down two.  
        yLoc = 51.
        The velocity is changed to yVel = -5, since the ball bounced off the 
        cieling and is now headed in the opposite direction. 
        xLoc = 22 since it is unnefected by the wall. 
        Similarly, xVel is unefected.
        
        Ignore any effext of gravity or other physics processes, as they are
        outside the scope of this question.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
         */////////All student code should be above this line.////////////////
        return new Ball(diameter, xLoc, yLoc, xVel, yVel);
    }

    /**
     * Finds pi using a sampling of points against the unit circle.
     *
     * @param gridWidth The square root of the number of test points.
     * @return An approximation of pi.
     */
    public static double pi(int gridWidth) {
        double pi;
        ///////Insert your code below this line. //////////////
        /*
        This is not the best way to find pi.  But it is a good way to practice 
        some basic programing skills.
        
        Consider a square with vertices at:
        (1,1), (1, -1), (-1, 1), and (-1, -1).
        
        The area of the square is 4.
        
        The unit circle is a circle centered at the origin with a radius of 1.
        The area of the unit circle is pi.
        
        Consider n uniformly distributed points in the square.  
        Suppose m of those points are in the circle.
        Then m/n (the fraction of the points in the cirle) 
        approaches pi/4 (the ratio of the circle arae to the square area) 
        as n approaches infinity.
        The bigger n is, the closer m/n will be to pi/4.
        
        Equivilently, 4*m/n approaches pi.
        
        We can approximate pi by choosing large values for n.
        
        Test a grid, a set of equaly-spaced points in the square, 
        for membership in the  circle.
        The bottom left point in your grid should be the point (-1,-1),
        and the top right point in your grid should be (1,1).
        The width and height of the grid are determined by the variable gridWidth,
        defined for you above.  You do not know the value of gridWith.
        
        For example, if gridWidth = 3, then the grid will be the following set
        of 9 points: (-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 0), (0, 1), 
        (1, -1), (1, 0), (1, 1).
        
        Set pi = The number of grid points that are in the unit circle, 
        times four, divided by the total number of small squares
        created by the grid in the big square [-1, 1]X[-1, 1]. In our example
        there are 4 small squares.
        
        You can check if some point, (x, y) is in the unit circle by checking
        if x^2 + y^2 <= 1.
        
        You should find that as gridWidth increases, your value for pi will get
        closer and closer to the actual value of pi.  Whe gridWidth is 10000,
        your pi shold be acurate to 3.141 plus or minus 1e-4.
        
        For no extra credit, except that you'll learn more:
        What can you change about the algorithm to make it more 
        four times faster.  Be sure to back up your claims with sound math.
        
        The code that you write should be in place of these instructions.
        To be clear, delete these instructions, and replace them with your own
        code following these instructions.
        
         */////////All student code should be above this line.////////////////
        return pi;
    }

    /**
     * Some helpful tests that students are strongly encouraged to run before
     * submission. Graders will apply different tests, so be sure your code is
     * robust. You are encouraged to write your own additional testing.
     */
    public static void runTests() {
        System.out.println("average test 1: " + (average(5, 7) == 6)
                + "\naverage test 2: " + (average(1, 2) == 1.5));
        System.out.println(
                "milesToKilometers test 1: (should be 16.0935) answer is: "
                + milesToKilometer(10)
                + "\nmilesToKilometers test 2: (should be 5.632725) answer is: "
                + milesToKilometer(3.5));

        System.out.println("abs test 1: " + (abs(7) == 7) + "\nabs test 2: "
                + equals(abs(-0.4), 0.4, 1e-14));
        System.out.println("equal test 1: " + equals(3, 3.000001, 1e-2)
                + "\nequal test 2: " + !equals(3, 12, 1e-7));
        System.out.println("isPrime test 1: " + !isPrime(9)
                + "\nisPrime test 2: " + isPrime(5));
        System.out.println("getDigit test 1: " + (digit(5762, 2) == 7)
                + "\ngetDigit test 2: " + (digit(5762, 0) == 2));
        System.out.println("swap test: " + (swap('c', 'q')[0] == 'q'
                && swap('c', 'q')[1] == 'c'));
        System.out.println("duckWalk test 1: " + !duckWalk(1, true)
                + "\nduckWalk test 2: " + !duckWalk(2, false));

        System.out.println("binaryToDecimal test 1: " + (binaryToDecimal(101)
                == 5) + "\nbinaryToDecimal test 2: " + (binaryToDecimal(1010)
                == 10));
        System.out.println("decimalToBinary test 1: " + (decimalToBinary(5)
                == 101) + "\ndecimalToBinary test 2: " + (decimalToBinary(10)
                == 1010));
        System.out.println("multiplyComplexNumbers test 1: "
                + ((multiplyComplexNumbers(0, 1, 0, 1)[0] == -1)
                && (multiplyComplexNumbers(0, 1, 0, 1)[1] == 0)));

        System.out.println("numCells test 1: " + (numCells(3, 1) == 3)
                + "\nnumCells test 2: " + (numCells(6, 1) == 13));

        Ball ballInBox = ballInBox(4, 20, -10, -5, 600, 400, 4);
        System.out.println("ballInBox: " + (equals(ballInBox.loc.x, 10, 1e-13)
                && equals(ballInBox.vel.x, 10, 1e-13))
        );

        System.out.println("pi test: " + equals(pi(10_000), Math.PI, 1e-4));
    }

    /**
     * This should let you watch the ball bounce around the box using the code
     * you wrote. It's a great tool to test your code, and see how simple code
     * you write, can play a greater roll in a group project.
     */
    public static void watchBall() {

        final int diameter = 30, cieling = 400, rightWall = 600;

        Vec2d initLoc = new Vec2d(40, 50), initVel = new Vec2d(2, 1.5);
        
        new Graphic("Ball in Box", 
                new MovingPicture("ball.jpg", 
                        0, diameter,
                diameter, initLoc) {
             private Vec2d vel = initVel;
                    
            @Override
            public void update() {
                Ball ball = ballInBox(
                        loc.x, 
                        loc.y, 
                        vel.x, 
                        vel.y, 
                        rightWall, 
                        cieling, 
                        diameter);
                loc = ball.loc;
                vel = ball.vel;
            }
            
        });
        
    }

    public static void main(String[] args) {
        runTests();
        watchBall();
    }

}
