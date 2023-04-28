package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.reactnative.ivpusic.imagepicker.b */
/* loaded from: classes6.dex */
class C6120b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static WritableMap m26232a(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> b = m26231b();
        b.addAll(m26230c());
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            C6121c cVar = new C6121c(exifInterface);
            if (!(cVar.m26228b() == null || cVar.m26227c() == null)) {
                writableNativeMap.putDouble("Latitude", cVar.m26228b().floatValue());
                writableNativeMap.putDouble("Longitude", cVar.m26227c().floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str2 : b) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    /* renamed from: b */
    private static List<String> m26231b() {
        return new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
    }

    /* renamed from: c */
    private static List<String> m26230c() {
        return new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal"));
    }
}
