package p296q7;

import cc.AbstractC3884i0;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p079e7.C6728o;
import p119g9.C7558r;
import p119g9.C7559r0;
import p296q7.C12035b;

/* renamed from: q7.e */
/* loaded from: classes7.dex */
final class C12040e {

    /* renamed from: a */
    private static final String[] f27020a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f27021b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f27022c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: a */
    public static C12035b m7934a(String str) {
        try {
            return m7933b(str);
        } catch (C6728o | NumberFormatException | XmlPullParserException unused) {
            C7558r.m22104h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static C12035b m7933b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (C7559r0.m22097f(newPullParser, "x:xmpmeta")) {
            AbstractC3884i0<C12035b.C12036a> x = AbstractC3884i0.m33399x();
            long j = -9223372036854775807L;
            do {
                newPullParser.next();
                if (C7559r0.m22097f(newPullParser, "rdf:Description")) {
                    if (!m7931d(newPullParser)) {
                        return null;
                    }
                    long e = m7930e(newPullParser);
                    x = m7932c(newPullParser);
                    j = e;
                } else if (C7559r0.m22097f(newPullParser, "Container:Directory")) {
                    x = m7929f(newPullParser, "Container", "Item");
                } else if (C7559r0.m22097f(newPullParser, "GContainer:Directory")) {
                    x = m7929f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!C7559r0.m22099d(newPullParser, "x:xmpmeta"));
            if (x.isEmpty()) {
                return null;
            }
            return new C12035b(j, x);
        }
        throw new C6728o("Couldn't find xmp metadata");
    }

    /* renamed from: c */
    private static AbstractC3884i0<C12035b.C12036a> m7932c(XmlPullParser xmlPullParser) {
        for (String str : f27022c) {
            String a = C7559r0.m22102a(xmlPullParser, str);
            if (a != null) {
                return AbstractC3884i0.m33397z(new C12035b.C12036a("image/jpeg", "Primary", 0L, 0L), new C12035b.C12036a("video/mp4", "MotionPhoto", Long.parseLong(a), 0L));
            }
        }
        return AbstractC3884i0.m33399x();
    }

    /* renamed from: d */
    private static boolean m7931d(XmlPullParser xmlPullParser) {
        for (String str : f27020a) {
            String a = C7559r0.m22102a(xmlPullParser, str);
            if (a != null) {
                if (Integer.parseInt(a) == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private static long m7930e(XmlPullParser xmlPullParser) {
        for (String str : f27021b) {
            String a = C7559r0.m22102a(xmlPullParser, str);
            if (a != null) {
                long parseLong = Long.parseLong(a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: f */
    private static AbstractC3884i0<C12035b.C12036a> m7929f(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        AbstractC3884i0.C3886b s = AbstractC3884i0.m33403s();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, str3)) {
                String a = C7559r0.m22102a(xmlPullParser, str2 + ":Mime");
                String a2 = C7559r0.m22102a(xmlPullParser, str2 + ":Semantic");
                String a3 = C7559r0.m22102a(xmlPullParser, str2 + ":Length");
                String a4 = C7559r0.m22102a(xmlPullParser, str2 + ":Padding");
                if (a == null || a2 == null) {
                    return AbstractC3884i0.m33399x();
                }
                if (a3 != null) {
                    j = Long.parseLong(a3);
                } else {
                    j = 0;
                }
                if (a4 != null) {
                    j2 = Long.parseLong(a4);
                } else {
                    j2 = 0;
                }
                s.m33395b(new C12035b.C12036a(a, a2, j, j2));
            }
        } while (!C7559r0.m22099d(xmlPullParser, str4));
        return s.m33394c();
    }
}
