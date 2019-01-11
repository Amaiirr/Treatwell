import java.util.*; 
public class Treatwell_q1
{
    
    public static void main()
    {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the height: ");
        int h = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter the width");
        int w = reader.nextInt();
        
        //if height is negative
        if(h<0)
        {
            System.out.println("You have entered a wrong height");
            System.exit(0);
        }
        
        //if width is negative
        if(w<0)
        {
            System.out.println("You have entered a wrong width");
            System.exit(0);
        }
        
        reader.close();
        Shape(h,w);
    }

    public static void Shape(int x, int y)
    {
        
        //The first element to indicate the corner
        System.out.print("┌");
       
        //Prints out the dashes inbetween the corners in one line 
        for (int i = 0; i < y - 1; i++) 
        {
            System.out.print("-");
        }
        
        System.out.print("┐");
        System.out.println();
        
        //Loop around the height and width to print out the | per line.
        for (int i = 0; i < x - 2; i++) 
        {
            System.out.print("|");
            
            for (int j = 0; j < y ;j++) 
            {
                System.out.print(" ");
            }
        
            System.out.println("|");
        }
        
        System.out.print("└");
        
        // Prints out the dashes inbetween the corners at the bottom of the square
        for (int i = 0; i < y - 1; i++) 
        {
            System.out.print("-");
        }
        System.out.print("┘");
        System.out.println();
    
    }
}
