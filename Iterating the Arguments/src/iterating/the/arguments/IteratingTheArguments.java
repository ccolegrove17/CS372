

package iterating.the.arguments;

/**
 * This class displays the first 3 arguments passed into command line.
 * @author ccolegrove17
 */
public class IteratingTheArguments {

    /**
     * @param args the command line arguments. <br>
     * The program expects 3 of these to be passed in.
     */
    
    public static void main(String[] args) {
        if (args.length>0)
        System.out.println(args[0]);
        if (args.length>1)
        System.out.println(args[1]);
        if (args.length>2)
        System.out.println(args[2]);
    }
    
}
