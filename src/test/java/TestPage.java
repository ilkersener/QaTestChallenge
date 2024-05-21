import org.junit.jupiter.api.Test;

public class TestPage extends BaseTest {



    @Test
    public void testselect1() throws InterruptedException {
        page.setCherry_button("test");
    }

    @Test
    public void testselect2() throws InterruptedException {
        page.setOrange_button("test");
    }

    @Test
    public void testselect3() throws InterruptedException {
        page.setNuts_button("test");
    }

    @Test
    public void testselect4(){
        page.setStrawberry_button("test");
    }
}
