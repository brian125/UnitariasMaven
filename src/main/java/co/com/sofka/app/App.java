package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger( App.class );
    public static void main( String[] args ) {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "Enter number 1: " );
        String textNumber1 = "";
        try{
            textNumber1 = bufferedReader.readLine();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        System.out.println( "Enter number 2: " );
        String textNumber2 = "";
        try{
            textNumber2 = bufferedReader.readLine();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();

        System.out.println("Options");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        String op = "";
        try{
            op = bufferedReader.readLine();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        Integer option = Integer.valueOf( op );
        Long result;

        switch (option){
            case 1:
                //Suma
               result = calculator.sum(number1,number2);
                System.out.println( number1 + " + " + number2 + " = " + result );
                break;
            case 2:
                //Resta
                result = calculator.res( number1, number2 );
                System.out.println( number1 + " - " + number2 + " = " + result );
                break;
            case 3:
                //Multiplicación
                result = calculator.mul(number1,number2);
                System.out.println( number1 + " * " + number2 + " = " + result );
                break;
            case 4:
                //División
                result = calculator.div( number1, number2 );
                System.out.println( number1 + " / " + number2 + " = " + result );
                break;
            default:
                break;
        }
    }
}
