package es.unex.prototipoasee;

import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.spy;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.xml.sax.SAXException;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import es.unex.prototipoasee.adapters.TabsViewPagerAdapter;

@RunWith(RobolectricTestRunner.class)
public class CU09_NavigationTabs_UnitTest {

    @Mock
    Context context;

    @Test
    public void test () throws NoSuchFieldException, IllegalAccessException {

        int testSocial = R.layout.class.getField("fragment_item_detail_social").getInt(null);
        assertNotEquals(testSocial,0);

        int testInfo = R.layout.class.getField("fragment_item_detail_info").getInt(null);
        assertNotEquals(testInfo,0);
    }

    @Before
    public void initTest() {
        MockitoAnnotations.initMocks(this);
        context = ApplicationProvider.getApplicationContext();
    }
}
