package Test;

import niel905g.Regner;
import niel905g.RegnerHandle;

/**
 * @Author niels on 28-Sep-18.
 */
public class MainTest {

    @org.testng.annotations.Test
    public void testMainTest() throws Exception {


        //public static void main( String[] arg ) {
        // Opbygger objektsystem
        Regner k3 = new Regner( 3 );
        RegnerHandle ref = new RegnerHandle( k3 );

        // Klient
        System.out.println( ref.f( 4.0 ) );

        // Ændrer objektsystem
        Regner k5 = new Regner( 5 );
        ref.setObjekt( k5 );

        // Klient
        System.out.println( ref.f( 4.0 ) );
    }
}
