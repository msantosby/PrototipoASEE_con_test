package es.unex.prototipoasee;

import static org.junit.Assert.assertNotEquals;

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

@RunWith(RobolectricTestRunner.class)
public class CU16_FavoritePendingScreen_UnitTest {

    @Mock
    Context context;

    @Test
    public void test () throws NoSuchFieldException, IllegalAccessException {

        int testFav = R.layout.class.getField("fragment_favorites").getInt(null);
        assertNotEquals(testFav,0);

        int testPend = R.layout.class.getField("fragment_explore").getInt(null);
        assertNotEquals(testPend,0);
    }

    @Before
    public void initTest() {
        MockitoAnnotations.initMocks(this);
        context = ApplicationProvider.getApplicationContext();
    }

}
