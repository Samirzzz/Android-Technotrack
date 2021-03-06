package edu.phystech.samir.mygallery;

import android.graphics.Bitmap;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import static android.graphics.Bitmap.Config.ARGB_8888;
import static org.junit.Assert.*;


/**
 * Created by Samir on 03.05.2017.
 */

@RunWith(RobolectricTestRunner.class)
public class JUnitTest {

    private static ImageCache imageCache;
    private static String str = "str";
    private static Bitmap bm;

    @BeforeClass
    public static void initForTest()throws NullPointerException {
        imageCache = new ImageCache();
        bm = Bitmap.createBitmap(100, 10, ARGB_8888);
    }

    @Test
    public void TestImageAddAndGet(){
        imageCache.addBitmapToMemoryCache(str,bm);
        assertEquals(bm,
                imageCache.getBitmapFromMemCache(str));
    }
}
