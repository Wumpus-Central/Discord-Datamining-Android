package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p163j$.util.Spliterator;
import p390w.EnumC13661r;

/* renamed from: androidx.camera.core.impl.utils.m */
/* loaded from: classes.dex */
public class C1858m {

    /* renamed from: d */
    private static final C1866o[] f1811d;

    /* renamed from: e */
    private static final C1866o[] f1812e;

    /* renamed from: f */
    private static final C1866o[] f1813f;

    /* renamed from: h */
    private static final C1866o[] f1815h;

    /* renamed from: i */
    static final C1866o[][] f1816i;

    /* renamed from: a */
    private final List<Map<String, C1857l>> f1818a;

    /* renamed from: b */
    private final ByteOrder f1819b;

    /* renamed from: c */
    static final String[] f1810c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: g */
    static final C1866o[] f1814g = {new C1866o("SubIFDPointer", 330, 4), new C1866o("ExifIFDPointer", 34665, 4), new C1866o("GPSInfoIFDPointer", 34853, 4), new C1866o("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: j */
    static final HashSet<String> f1817j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));

    /* renamed from: androidx.camera.core.impl.utils.m$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1859a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1820a;

        /* renamed from: b */
        static final /* synthetic */ int[] f1821b;

        static {
            int[] iArr = new int[EnumC1863c.values().length];
            f1821b = iArr;
            try {
                iArr[EnumC1863c.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1821b[EnumC1863c.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC13661r.values().length];
            f1820a = iArr2;
            try {
                iArr2[EnumC13661r.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1820a[EnumC13661r.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1820a[EnumC13661r.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.m$b */
    /* loaded from: classes.dex */
    public static final class C1860b {

        /* renamed from: c */
        private static final Pattern f1822c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        private static final Pattern f1823d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        private static final Pattern f1824e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        static final List<HashMap<String, C1866o>> f1825f = Collections.list(new C1861a());

        /* renamed from: a */
        final List<Map<String, C1857l>> f1826a = Collections.list(new C0021b());

        /* renamed from: b */
        private final ByteOrder f1827b;

        /* renamed from: androidx.camera.core.impl.utils.m$b$a */
        /* loaded from: classes.dex */
        class C1861a implements Enumeration<HashMap<String, C1866o>> {

            /* renamed from: a */
            int f1828a = 0;

            C1861a() {
            }

            /* renamed from: a */
            public HashMap<String, C1866o> nextElement() {
                C1866o[] oVarArr;
                HashMap<String, C1866o> hashMap = new HashMap<>();
                for (C1866o oVar : C1858m.f1816i[this.f1828a]) {
                    hashMap.put(oVar.f1844b, oVar);
                }
                this.f1828a++;
                return hashMap;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1828a < C1858m.f1816i.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.m$b$b */
        /* loaded from: classes.dex */
        class C0021b implements Enumeration<Map<String, C1857l>> {

            /* renamed from: a */
            int f1829a = 0;

            C0021b() {
            }

            /* renamed from: a */
            public Map<String, C1857l> nextElement() {
                this.f1829a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1829a < C1858m.f1816i.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.m$b$c */
        /* loaded from: classes.dex */
        class C1862c implements Enumeration<Map<String, C1857l>> {

            /* renamed from: a */
            final Enumeration<Map<String, C1857l>> f1831a;

            C1862c() {
                this.f1831a = Collections.enumeration(C1860b.this.f1826a);
            }

            /* renamed from: a */
            public Map<String, C1857l> nextElement() {
                return new HashMap(this.f1831a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f1831a.hasMoreElements();
            }
        }

        C1860b(ByteOrder byteOrder) {
            this.f1827b = byteOrder;
        }

        /* renamed from: b */
        private static Pair<Integer, Integer> m39636b(String str) {
            int i;
            int i2;
            if (str.contains(",")) {
                String[] split = str.split(",", -1);
                Pair<Integer, Integer> b = m39636b(split[0]);
                if (((Integer) b.first).intValue() == 2) {
                    return b;
                }
                for (int i3 = 1; i3 < split.length; i3++) {
                    Pair<Integer, Integer> b2 = m39636b(split[i3]);
                    if (((Integer) b2.first).equals(b.first) || ((Integer) b2.second).equals(b.first)) {
                        i = ((Integer) b.first).intValue();
                    } else {
                        i = -1;
                    }
                    if (((Integer) b.second).intValue() == -1 || (!((Integer) b2.first).equals(b.second) && !((Integer) b2.second).equals(b.second))) {
                        i2 = -1;
                    } else {
                        i2 = ((Integer) b.second).intValue();
                    }
                    if (i == -1 && i2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (i == -1) {
                        b = new Pair<>(Integer.valueOf(i2), -1);
                    } else if (i2 == -1) {
                        b = new Pair<>(Integer.valueOf(i), -1);
                    }
                }
                return b;
            } else if (str.contains("/")) {
                String[] split2 = str.split("/", -1);
                if (split2.length == 2) {
                    try {
                        long parseDouble = (long) Double.parseDouble(split2[0]);
                        long parseDouble2 = (long) Double.parseDouble(split2[1]);
                        if (parseDouble >= 0 && parseDouble2 >= 0) {
                            if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                                return new Pair<>(10, 5);
                            }
                            return new Pair<>(5, -1);
                        }
                        return new Pair<>(10, -1);
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(2, -1);
            } else {
                try {
                    try {
                        long parseLong = Long.parseLong(str);
                        int i4 = (parseLong > 0L ? 1 : (parseLong == 0L ? 0 : -1));
                        if (i4 >= 0 && parseLong <= 65535) {
                            return new Pair<>(3, 4);
                        }
                        if (i4 < 0) {
                            return new Pair<>(9, -1);
                        }
                        return new Pair<>(4, -1);
                    } catch (NumberFormatException unused2) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused3) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
        }

        /* renamed from: d */
        private void m39634d(String str, String str2, List<Map<String, C1857l>> list) {
            for (Map<String, C1857l> map : list) {
                if (map.containsKey(str)) {
                    return;
                }
            }
            m39633e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x018a, code lost:
            if (r7 != r0) goto L_0x02de;
         */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m39633e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.C1857l>> r20) {
            /*
                Method dump skipped, instructions count: 772
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C1858m.C1860b.m39633e(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* renamed from: a */
        public C1858m m39637a() {
            ArrayList list = Collections.list(new C1862c());
            if (!list.get(1).isEmpty()) {
                m39634d("ExposureProgram", String.valueOf(0), list);
                m39634d("ExifVersion", "0230", list);
                m39634d("ComponentsConfiguration", "1,2,3,0", list);
                m39634d("MeteringMode", String.valueOf(0), list);
                m39634d("LightSource", String.valueOf(0), list);
                m39634d("FlashpixVersion", "0100", list);
                m39634d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m39634d("FileSource", String.valueOf(3), list);
                m39634d("SceneType", String.valueOf(1), list);
                m39634d("CustomRendered", String.valueOf(0), list);
                m39634d("SceneCaptureType", String.valueOf(0), list);
                m39634d("Contrast", String.valueOf(0), list);
                m39634d("Saturation", String.valueOf(0), list);
                m39634d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m39634d("GPSVersionID", "2300", list);
                m39634d("GPSSpeedRef", "K", list);
                m39634d("GPSTrackRef", "T", list);
                m39634d("GPSImgDirectionRef", "T", list);
                m39634d("GPSDestBearingRef", "T", list);
                m39634d("GPSDestDistanceRef", "K", list);
            }
            return new C1858m(this.f1827b, list);
        }

        /* renamed from: c */
        public C1860b m39635c(String str, String str2) {
            m39633e(str, str2, this.f1826a);
            return this;
        }

        /* renamed from: f */
        public C1860b m39632f(long j) {
            return m39635c("ExposureTime", String.valueOf(j / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* renamed from: g */
        public C1860b m39631g(EnumC13661r rVar) {
            int i;
            if (rVar == EnumC13661r.UNKNOWN) {
                return this;
            }
            int i2 = C1859a.f1820a[rVar.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                C1915r1.m39517k("ExifData", "Unknown flash state: " + rVar);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                m39635c("LightSource", String.valueOf(4));
            }
            return m39635c("Flash", String.valueOf(i));
        }

        /* renamed from: h */
        public C1860b m39630h(float f) {
            return m39635c("FocalLength", new C1867p(f * 1000.0f, 1000L).toString());
        }

        /* renamed from: i */
        public C1860b m39629i(int i) {
            return m39635c("ImageLength", String.valueOf(i));
        }

        /* renamed from: j */
        public C1860b m39628j(int i) {
            return m39635c("ImageWidth", String.valueOf(i));
        }

        /* renamed from: k */
        public C1860b m39627k(int i) {
            return m39635c("SensitivityType", String.valueOf(3)).m39635c("PhotographicSensitivity", String.valueOf(Math.min(65535, i)));
        }

        /* renamed from: l */
        public C1860b m39626l(float f) {
            return m39635c("FNumber", String.valueOf(f));
        }

        /* renamed from: m */
        public C1860b m39625m(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                C1915r1.m39517k("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return m39635c("Orientation", String.valueOf(i2));
        }

        /* renamed from: n */
        public C1860b m39624n(EnumC1863c cVar) {
            String str;
            int i = C1859a.f1821b[cVar.ordinal()];
            if (i == 1) {
                str = String.valueOf(0);
            } else if (i != 2) {
                str = null;
            } else {
                str = String.valueOf(1);
            }
            return m39635c("WhiteBalance", str);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.m$c */
    /* loaded from: classes.dex */
    public enum EnumC1863c {
        AUTO,
        MANUAL
    }

    static {
        C1866o[] oVarArr = {new C1866o("ImageWidth", Spliterator.NONNULL, 3, 4), new C1866o("ImageLength", 257, 3, 4), new C1866o("Make", 271, 2), new C1866o("Model", 272, 2), new C1866o("Orientation", 274, 3), new C1866o("XResolution", 282, 5), new C1866o("YResolution", 283, 5), new C1866o("ResolutionUnit", 296, 3), new C1866o("Software", 305, 2), new C1866o("DateTime", 306, 2), new C1866o("YCbCrPositioning", 531, 3), new C1866o("SubIFDPointer", 330, 4), new C1866o("ExifIFDPointer", 34665, 4), new C1866o("GPSInfoIFDPointer", 34853, 4)};
        f1811d = oVarArr;
        C1866o[] oVarArr2 = {new C1866o("ExposureTime", 33434, 5), new C1866o("FNumber", 33437, 5), new C1866o("ExposureProgram", 34850, 3), new C1866o("PhotographicSensitivity", 34855, 3), new C1866o("SensitivityType", 34864, 3), new C1866o("ExifVersion", 36864, 2), new C1866o("DateTimeOriginal", 36867, 2), new C1866o("DateTimeDigitized", 36868, 2), new C1866o("ComponentsConfiguration", 37121, 7), new C1866o("ShutterSpeedValue", 37377, 10), new C1866o("ApertureValue", 37378, 5), new C1866o("BrightnessValue", 37379, 10), new C1866o("ExposureBiasValue", 37380, 10), new C1866o("MaxApertureValue", 37381, 5), new C1866o("MeteringMode", 37383, 3), new C1866o("LightSource", 37384, 3), new C1866o("Flash", 37385, 3), new C1866o("FocalLength", 37386, 5), new C1866o("SubSecTime", 37520, 2), new C1866o("SubSecTimeOriginal", 37521, 2), new C1866o("SubSecTimeDigitized", 37522, 2), new C1866o("FlashpixVersion", 40960, 7), new C1866o("ColorSpace", 40961, 3), new C1866o("PixelXDimension", 40962, 3, 4), new C1866o("PixelYDimension", 40963, 3, 4), new C1866o("InteroperabilityIFDPointer", 40965, 4), new C1866o("FocalPlaneResolutionUnit", 41488, 3), new C1866o("SensingMethod", 41495, 3), new C1866o("FileSource", 41728, 7), new C1866o("SceneType", 41729, 7), new C1866o("CustomRendered", 41985, 3), new C1866o("ExposureMode", 41986, 3), new C1866o("WhiteBalance", 41987, 3), new C1866o("SceneCaptureType", 41990, 3), new C1866o("Contrast", 41992, 3), new C1866o("Saturation", 41993, 3), new C1866o("Sharpness", 41994, 3)};
        f1812e = oVarArr2;
        C1866o[] oVarArr3 = {new C1866o("GPSVersionID", 0, 1), new C1866o("GPSLatitudeRef", 1, 2), new C1866o("GPSLatitude", 2, 5, 10), new C1866o("GPSLongitudeRef", 3, 2), new C1866o("GPSLongitude", 4, 5, 10), new C1866o("GPSAltitudeRef", 5, 1), new C1866o("GPSAltitude", 6, 5), new C1866o("GPSTimeStamp", 7, 5), new C1866o("GPSSpeedRef", 12, 2), new C1866o("GPSTrackRef", 14, 2), new C1866o("GPSImgDirectionRef", 16, 2), new C1866o("GPSDestBearingRef", 23, 2), new C1866o("GPSDestDistanceRef", 25, 2)};
        f1813f = oVarArr3;
        C1866o[] oVarArr4 = {new C1866o("InteroperabilityIndex", 1, 2)};
        f1815h = oVarArr4;
        f1816i = new C1866o[][]{oVarArr, oVarArr2, oVarArr3, oVarArr4};
    }

    C1858m(ByteOrder byteOrder, List<Map<String, C1857l>> list) {
        boolean z;
        if (list.size() == f1816i.length) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37585j(z, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1819b = byteOrder;
        this.f1818a = list;
    }

    /* renamed from: a */
    public static C1860b m39640a() {
        return new C1860b(ByteOrder.BIG_ENDIAN).m39635c("Orientation", String.valueOf(1)).m39635c("XResolution", "72/1").m39635c("YResolution", "72/1").m39635c("ResolutionUnit", String.valueOf(2)).m39635c("YCbCrPositioning", String.valueOf(1)).m39635c("Make", Build.MANUFACTURER).m39635c("Model", Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, C1857l> m39639b(int i) {
        int length = f1816i.length;
        C2517g.m37592c(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f1818a.get(i);
    }

    /* renamed from: c */
    public ByteOrder m39638c() {
        return this.f1819b;
    }
}
