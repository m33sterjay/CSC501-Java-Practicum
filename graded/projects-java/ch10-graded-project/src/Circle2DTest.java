import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2DTest {
    @Test
    void testDefault() {
    }
    @Test
    void getX() {
        Circle2D testGetX = new Circle2D(2, 0, 1);
        double result = testGetX.getX();
        assertEquals(2.0d, result);
    }
    @Test
    void getY() {
        Circle2D testGetY = new Circle2D(0, 4, 1);
        double result = testGetY.getY();
        assertEquals(4.0d, result);
    }
    @Test
    void getRadius() {
        Circle2D testGetRadius = new Circle2D(0, 0, 1);
        double result = testGetRadius.getRadius();
        assertEquals(1.0d, result);
    }
    @Test
    void getArea() {
        Circle2D testGetArea = new Circle2D(2, 2, 4);
        double result = testGetArea.getArea();
        assertEquals((16 * Math.PI), result, 0.1);
    }
    @Test
    void getPerimeter() {
        Circle2D testGetPerimeter = new Circle2D(2, 2, 4);
        double result = testGetPerimeter.getPerimeter();
        assertEquals((8 * Math.PI), result, 0.1);
    }
    @Test
    void containsPoint() {
        Circle2D testContainsPoint = new Circle2D(5, 5, 10);
        double x = 20;
        double y = 15;
        boolean result = testContainsPoint.contains(x, y);
        assertFalse(result);
    }
    @Test
    void containsObj() {
        Circle2D testContainsObj = new Circle2D(5, 5, 10);
        Circle2D tester = new Circle2D(2, 2, 4);
        boolean result = testContainsObj.contains(tester);
        assertTrue(result);
    }
    @Test
    void overlaps() {
        Circle2D testOverlaps = new Circle2D(5, 5, 10);
        Circle2D tester = new Circle2D(3, 1, 7);
        boolean result = testOverlaps.overlaps(tester);
        assertTrue(result);
    }
}