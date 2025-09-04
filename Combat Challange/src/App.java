
import entities.Champion;
import java.util.Scanner;

/**
 *
 * @author jose.augusto.github@gmail.com
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Champion champion1, champion2;

        System.out.println( "Enter the data of the first champion: " );
        System.out.printf( "Name: " );
        String name1 = sc.nextLine();
        System.out.printf( "Initial life: " );
        int life1 = sc.nextInt();
        System.out.printf( "Atack: " );
        int atack1 = sc.nextInt();
        System.out.printf( "Armor: " );
        int armor1 = sc.nextInt();

        sc.nextLine(); // consume the remaining newline

        champion1 = new Champion( name1, life1, atack1, armor1 );

        System.out.println( "\nEnter the data of the second champion: " );
        System.out.printf( "Name: " );
        String name2 = sc.nextLine();
        System.out.printf( "Initial life: " );
        int life2 = sc.nextInt();
        System.out.printf( "Atack: " );
        int atack2 = sc.nextInt();
        System.out.printf( "Armor: " );
        int armor2 = sc.nextInt();

        champion2 = new Champion( name2, life2, atack2, armor2 );

        System.out.printf( "\nHow many rounds do you want to run? " );
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++ ) {
            if ( champion1.getLife() <= 0 || champion2.getLife() <= 0 ) {
                break;
            }
            champion2.takeDamage( champion1 );
            champion1.takeDamage( champion2 );
            System.out.println( "\nResult of round: " + ( i + 1 ) );
            System.out.println( champion1.status() );
            System.out.println( champion2.status() );
        }

        System.out.println( "\n\nEND OF COMBAT" );

        sc.close();
    }
}
