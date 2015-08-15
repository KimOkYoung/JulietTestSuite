/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE510_Trapdoor__network_connection_17.java
Label Definition File: CWE510_Trapdoor.badonly.label.xml
Template File: point-flaw-badonly-17.tmpl.java
*/
/*
* @description
* CWE: 510 Trapdoor
* Sinks: network_connection
*    BadSink : Presence of a network connection
*     BadOnly (No GoodSink)
* Flow Variant: 17 Control flow: for loop
*
* */

package testcases.CWE510_Trapdoor;

import testcasesupport.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.logging.Level;

public class CWE510_Trapdoor__network_connection_17 extends AbstractTestCaseBadOnly
{
    public void bad() throws Throwable
    {
        for (int j = 0; j < 1; j++)
        {
            InputStream streamInput = null;
            try
            {
                /* FLAW: direct usage of URI */
                URL url = new URL("http://123.123.123.123:80");
                streamInput = url.openStream();
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
            }
            finally
            {
                try
                {
                    if (streamInput != null)
                    {
                        streamInput.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "caught IOException", exceptIO);
                }
            }
        }
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
