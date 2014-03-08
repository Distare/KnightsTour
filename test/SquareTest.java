import junit.framework.TestCase;

public class SquareTest extends TestCase {
    private Square square;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        square = new Square();
    }

    public void testDefaultUnoccupied() throws Exception {
        assertEquals(square.isOccupied(), false);
    }

    public void testOccupyIsOccupied() throws Exception {
        square.occupy();
        assertEquals(square.isOccupied(), true);
    }

    public void testUnoccupyIsNotOccupied() throws Exception {
        square.occupy();
        square.unoccupy();
        assertEquals(square.isOccupied(), false);
    }
}
