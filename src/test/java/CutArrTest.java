import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CutArrTest {
    private ArraysTasks tasks;
    private int[] arrExpected;
    private int[] arrSource;

    public CutArrTest(int[] arrExpected, int[] arrSource) {
        this.arrExpected = arrExpected;
        this.arrSource = arrSource;
    }
    @Before
    public void init(){
        tasks = new ArraysTasks();
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{5,5,6,6},     new int[]{1,1,2,2,4,4,5,5,6,6} },
                {new int[]{1,2,2,5,5,6}, new int[]{4,1,2,2,5,5,6} },
                {new int[]{-4,-5,1},     new int[] {0, 4,-4,-5,1} },
                {new int[]{},            new int[]{1,1,2,2,4,4,5,5,6,4} }

        });
    }
    @Test
    public void cutArrTest(){
        Assert.assertArrayEquals(arrExpected, tasks.cutArr(arrSource) );
    }
    @Test(expected = RuntimeException.class)
    public void cutArrExceptionTest(){
        Assert.assertArrayEquals(new int[]{}, tasks.cutArr(new int[]{1,1,2,2,5,5,6}));
    }

}
