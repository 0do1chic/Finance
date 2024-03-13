import org.junit.Test;
import pages.AddPage;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class AddTest extends BaseTest {
    @Test
    public void clickOnMouse() throws InterruptedException {

        AddPage wearsPage = new AddPage();

        wearsPage
                .clickCreateButton()
                .testCreate();
    }
    @Test
    public void clickDelete() {
        AddPage addPage = new AddPage();
        addPage
                .clickCreateButton()
                .clickDeleteButton()
                .testDelete();

    }

}
