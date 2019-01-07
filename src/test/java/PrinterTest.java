import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaperOf1000(){
        assertEquals(1000, printer.getPaperLeft());
    }

    @Test
    public void hasTonerOf1000(){
        assertEquals(1000, printer.getTonerLeft());
    }

    @Test
    public void canPrint(){
        printer.print(10, 2);
        assertEquals(980, printer.getPaperLeft());
    }

    @Test
    public void canPrint__noPaper(){
        printer.print(1000, 2);
        assertEquals(1000, printer.getPaperLeft());
    }

    @Test
    public void canRefillPaper(){
        printer.print(50, 2);
        printer.refillPaper();
        assertEquals(1000, printer.getPaperLeft());
    }

    @Test
    public void canRefillToner(){
        printer.print(50, 2);
        printer.refillToner();
        assertEquals(1000, printer.getTonerLeft());
    }

}
