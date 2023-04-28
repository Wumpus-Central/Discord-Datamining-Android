package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.soloader.AbstractC5089e;
import java.io.IOException;
import java.io.InputStream;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class HeifExifUtil {

    @AbstractC5089e
    /* loaded from: classes7.dex */
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        /* renamed from: a */
        static int m30864a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C13925a.m2293e("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m30865a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.m30864a(inputStream);
        }
        C13925a.m2296b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
