package androidx.camera.core.impl.utils;

import androidx.exifinterface.media.C2892a;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.core.impl.utils.k */
/* loaded from: classes.dex */
public final class C1851k {

    /* renamed from: c */
    private static final String f1793c = "k";

    /* renamed from: d */
    private static final ThreadLocal<SimpleDateFormat> f1794d = new C1852a();

    /* renamed from: e */
    private static final ThreadLocal<SimpleDateFormat> f1795e = new C1853b();

    /* renamed from: f */
    private static final ThreadLocal<SimpleDateFormat> f1796f = new C1854c();

    /* renamed from: g */
    private static final List<String> f1797g = m39669e();

    /* renamed from: h */
    private static final List<String> f1798h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* renamed from: a */
    private final C2892a f1799a;

    /* renamed from: b */
    private boolean f1800b = false;

    /* renamed from: androidx.camera.core.impl.utils.k$a */
    /* loaded from: classes.dex */
    class C1852a extends ThreadLocal<SimpleDateFormat> {
        C1852a() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.k$b */
    /* loaded from: classes.dex */
    class C1853b extends ThreadLocal<SimpleDateFormat> {
        C1853b() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.k$c */
    /* loaded from: classes.dex */
    class C1854c extends ThreadLocal<SimpleDateFormat> {
        C1854c() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.k$d */
    /* loaded from: classes.dex */
    public static final class C1855d {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.core.impl.utils.k$d$a */
        /* loaded from: classes.dex */
        public static final class C1856a {

            /* renamed from: a */
            final double f1801a;

            C1856a(double d) {
                this.f1801a = d;
            }

            /* renamed from: a */
            double m39651a() {
                return this.f1801a / 2.23694d;
            }
        }

        /* renamed from: a */
        static C1856a m39654a(double d) {
            return new C1856a(d * 0.621371d);
        }

        /* renamed from: b */
        static C1856a m39653b(double d) {
            return new C1856a(d * 1.15078d);
        }

        /* renamed from: c */
        static C1856a m39652c(double d) {
            return new C1856a(d);
        }
    }

    private C1851k(C2892a aVar) {
        this.f1799a = aVar;
    }

    /* renamed from: a */
    private static Date m39673a(String str) {
        return f1794d.get().parse(str);
    }

    /* renamed from: b */
    private static Date m39672b(String str) {
        return f1796f.get().parse(str);
    }

    /* renamed from: c */
    private static Date m39671c(String str) {
        return f1795e.get().parse(str);
    }

    /* renamed from: d */
    public static C1851k m39670d(InputStream inputStream) {
        return new C1851k(new C2892a(inputStream));
    }

    /* renamed from: e */
    public static List<String> m39669e() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* renamed from: o */
    private long m39659o(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m39672b(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* renamed from: p */
    private long m39658p(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m39673a(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        } else if (str == null) {
            try {
                return m39671c(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        } else {
            return m39659o(str + " " + str2);
        }
    }

    /* renamed from: f */
    public String m39668f() {
        return this.f1799a.m36323f("ImageDescription");
    }

    /* renamed from: g */
    public int m39667g() {
        return this.f1799a.m36319h("ImageLength", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location m39666h() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f1799a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.m36323f(r2)
            androidx.exifinterface.media.a r2 = r0.f1799a
            double[] r2 = r2.m36314m()
            androidx.exifinterface.media.a r3 = r0.f1799a
            r4 = 0
            double r6 = r3.m36325e(r4)
            androidx.exifinterface.media.a r3 = r0.f1799a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.m36321g(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f1799a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.m36323f(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L_0x002d
            r3 = r10
        L_0x002d:
            androidx.exifinterface.media.a r11 = r0.f1799a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.m36323f(r12)
            androidx.exifinterface.media.a r12 = r0.f1799a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.m36323f(r13)
            long r11 = r0.m39658p(r11, r12)
            if (r2 != 0) goto L_0x0045
            r1 = 0
            return r1
        L_0x0045:
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = androidx.camera.core.impl.utils.C1851k.f1793c
        L_0x0049:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            r13.setAltitude(r6)
        L_0x0061:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00b5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L_0x008a
            r2 = 77
            if (r1 == r2) goto L_0x0080
            r2 = 78
            if (r1 == r2) goto L_0x0076
            goto L_0x0092
        L_0x0076:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = r14
            goto L_0x0093
        L_0x0080:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = 0
            goto L_0x0093
        L_0x008a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L_0x0092
            r1 = 2
            goto L_0x0093
        L_0x0092:
            r1 = -1
        L_0x0093:
            if (r1 == 0) goto L_0x00a9
            if (r1 == r14) goto L_0x00a0
            androidx.camera.core.impl.utils.k$d$a r1 = androidx.camera.core.impl.utils.C1851k.C1855d.m39654a(r8)
            double r1 = r1.m39651a()
            goto L_0x00b1
        L_0x00a0:
            androidx.camera.core.impl.utils.k$d$a r1 = androidx.camera.core.impl.utils.C1851k.C1855d.m39653b(r8)
            double r1 = r1.m39651a()
            goto L_0x00b1
        L_0x00a9:
            androidx.camera.core.impl.utils.k$d$a r1 = androidx.camera.core.impl.utils.C1851k.C1855d.m39652c(r8)
            double r1 = r1.m39651a()
        L_0x00b1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        L_0x00b5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00be
            r13.setTime(r11)
        L_0x00be:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.C1851k.m39666h():android.location.Location");
    }

    /* renamed from: i */
    public int m39665i() {
        return this.f1799a.m36319h("Orientation", 0);
    }

    /* renamed from: j */
    public int m39664j() {
        switch (m39665i()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public long m39663k() {
        long o = m39659o(this.f1799a.m36323f("DateTimeOriginal"));
        if (o == -1) {
            return -1L;
        }
        String f = this.f1799a.m36323f("SubSecTimeOriginal");
        if (f == null) {
            return o;
        }
        try {
            long parseLong = Long.parseLong(f);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return o + parseLong;
        } catch (NumberFormatException unused) {
            return o;
        }
    }

    /* renamed from: l */
    public int m39662l() {
        return this.f1799a.m36319h("ImageWidth", 0);
    }

    /* renamed from: m */
    public boolean m39661m() {
        return m39665i() == 2;
    }

    /* renamed from: n */
    public boolean m39660n() {
        int i = m39665i();
        return i == 4 || i == 5 || i == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m39662l()), Integer.valueOf(m39667g()), Integer.valueOf(m39664j()), Boolean.valueOf(m39660n()), Boolean.valueOf(m39661m()), m39666h(), Long.valueOf(m39663k()), m39668f());
    }
}
