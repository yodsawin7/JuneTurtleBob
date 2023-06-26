import java.awt.Color;

public class June {
    public static void main(String[] args) {
        Turtle bob = new Turtle();
         bob.penColor(Color.WHITE);
        bob.speed(1);
     for(int i=0;i<360;i++)
     {

            bob.forward(1);
            bob.left(1);

        }
            bob.up();
            bob.left(90);
            bob.forward(115);
            
            bob.forward(100);
            bob.right(90);
            bob.down();
            bob.penColor(Color.BLACK);
            for(int i=0;i<360;i++)
     {

            bob.forward(2.75);
            bob.right(1);

        }
        
       bob.right(90);
       bob.forward(315);
       bob.up();
       bob.right(180);
       bob.forward(145);
       bob.right(145);
       bob.down();
       bob.forward(150);
       bob.up();
       bob.right(180);
       bob.forward(150);
       bob.right(35);
       bob.left(145);
       bob.down();
       bob.forward(145);
       bob.hide();
    }

       

}