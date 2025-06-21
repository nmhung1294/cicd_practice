import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testMax2Int1() {
        Assert.assertEquals(5, Main.max2Int(2, 5));
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(1, Main.max2Int(1, 0));
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(3, Main.max2Int(3, 2));
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(10, Main.max2Int(8, 10));
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(7, Main.max2Int(7, 6));
    }

    @Test
    public void testMinArray1() {
        Assert.assertEquals(0, Main.minArray(new int[] { 0, 1, 2, 3, 4 }));
    }

    @Test
    public void testMinArray2() {
        Assert.assertEquals(2, Main.minArray(new int[] { 6, 2, 4, 4, 5 }));
    }

    @Test
    public void testMinArray3() {
        Assert.assertEquals(1, Main.minArray(new int[] { 7, 1, 8, 9, 10, 1 }));
    }

    @Test
    public void testMinArray4() {
        Assert.assertEquals(3, Main.minArray(new int[] { 7, 7, 3, 4, 9, 10 }));
    }

    @Test
    public void testMinArray5() {
        Assert.assertEquals(4, Main.minArray(new int[] { 9, 8, 7, 7, 4, 8 }));
    }

    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals("Thiếu cân", Main.calculateBMI(37, 1.5));
    }

//    @Test
//    public void testCalculateBMI2() {
//        Assert.assertEquals("Thừa cân", Main.calculateBMI(64, 1.6));
//    }
//
//    @Test
//    public void testCalculateBMI3() {
//        Assert.assertEquals("Bình thường", Main.calculateBMI(57, 1.7));
//    }
//
//    @Test
//    public void testCalculateBMI4() {
//        Assert.assertEquals("Thiếu cân", Main.calculateBMI(57, 1.8));
//    }
//
//    @Test
//    public void testCalculateBMI5() {
//        Assert.assertEquals("Béo phì", Main.calculateBMI(70, 1.6));
//    }
}
