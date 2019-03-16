package com.aashiq.cput;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //Encapsulation
        Mammal mammal = new Mammal(4);
        System.out.println(mammal.getDetails());

        press(scan);

        //Inheritance
        Animal giraffe  = new Animal("Melman", "Giraffe", 13, 11, 1994, 4);
        System.out.println(giraffe.toString());
        System.out.println(giraffe.getDetails());

        press(scan);

        //Polymorphism
        Herbivore h = giraffe;
        System.out.println(h.diet);

        press(scan);

        //Composition
        AnimalName name = new AnimalName("Julian", "Leema");
        DateOfRegistration dor = new DateOfRegistration(25, 11, 1995);
        AnimalComp julian = new AnimalComp(name, dor);
        System.out.println(julian.toString());

    }

    public static void press(Scanner scan)
    {
        System.out.println("\nPress enter to continue\n");
        String y = scan.nextLine();
    }
    }
}
