package p440y8;

import com.facebook.react.uimanager.ViewProps;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7559r0;
import p317r8.AbstractC12456d;
import p317r8.AbstractC12458f;
import p317r8.C12460h;

/* renamed from: y8.c */
/* loaded from: classes7.dex */
public final class C14312c extends AbstractC12456d {

    /* renamed from: p */
    private static final Pattern f32371p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    private static final Pattern f32372q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    private static final Pattern f32373r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    static final Pattern f32374s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    static final Pattern f32375t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    private static final Pattern f32376u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    private static final Pattern f32377v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    private static final C14314b f32378w = new C14314b(30.0f, 1, 1);

    /* renamed from: x */
    private static final C14313a f32379x = new C14313a(32, 15);

    /* renamed from: o */
    private final XmlPullParserFactory f32380o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y8.c$a */
    /* loaded from: classes7.dex */
    public static final class C14313a {

        /* renamed from: a */
        final int f32381a;

        /* renamed from: b */
        final int f32382b;

        C14313a(int i, int i2) {
            this.f32381a = i;
            this.f32382b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y8.c$b */
    /* loaded from: classes7.dex */
    public static final class C14314b {

        /* renamed from: a */
        final float f32383a;

        /* renamed from: b */
        final int f32384b;

        /* renamed from: c */
        final int f32385c;

        C14314b(float f, int i, int i2) {
            this.f32383a = f;
            this.f32384b = i;
            this.f32385c = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y8.c$c */
    /* loaded from: classes7.dex */
    public static final class C0462c {

        /* renamed from: a */
        final int f32386a;

        /* renamed from: b */
        final int f32387b;

        C0462c(int i, int i2) {
            this.f32386a = i;
            this.f32387b = i2;
        }
    }

    public C14312c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f32380o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: B */
    private static C14318g m954B(C14318g gVar) {
        return gVar == null ? new C14318g() : gVar;
    }

    /* renamed from: C */
    private static boolean m953C(String str) {
        if (str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information")) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private static C14313a m952D(XmlPullParser xmlPullParser, C14313a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f32377v.matcher(attributeValue);
        if (!matcher.matches()) {
            C7558r.m22104h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) C7510a.m22367e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C7510a.m22367e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C14313a(parseInt, parseInt2);
            }
            throw new C12460h("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            C7558r.m22104h("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    /* renamed from: E */
    private static void m951E(String str, C14318g gVar) {
        Matcher matcher;
        String[] N0 = C7557q0.m22188N0(str, "\\s+");
        if (N0.length == 1) {
            matcher = f32373r.matcher(str);
        } else if (N0.length == 2) {
            matcher = f32373r.matcher(N0[1]);
            C7558r.m22104h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new C12460h("Invalid number of entries for fontSize: " + N0.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C7510a.m22367e(matcher.group(3));
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    gVar.m885y(3);
                    break;
                case 1:
                    gVar.m885y(2);
                    break;
                case 2:
                    gVar.m885y(1);
                    break;
                default:
                    throw new C12460h("Invalid unit for fontSize: '" + str2 + "'.");
            }
            gVar.m886x(Float.parseFloat((String) C7510a.m22367e(matcher.group(1))));
            return;
        }
        throw new C12460h("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: F */
    private static C14314b m950F(XmlPullParser xmlPullParser) {
        int i;
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] N0 = C7557q0.m22188N0(attributeValue2, " ");
            if (N0.length == 2) {
                f = Integer.parseInt(N0[0]) / Integer.parseInt(N0[1]);
            } else {
                throw new C12460h("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        C14314b bVar = f32378w;
        int i2 = bVar.f32384b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f32385c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C14314b(i * f, i2, i3);
    }

    /* renamed from: G */
    private static Map<String, C14318g> m949G(XmlPullParser xmlPullParser, Map<String, C14318g> map, C14313a aVar, C0462c cVar, Map<String, C14316e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "style")) {
                String a = C7559r0.m22102a(xmlPullParser, "style");
                C14318g L = m944L(xmlPullParser, new C14318g());
                if (a != null) {
                    for (String str : m943M(a)) {
                        L.m909a(map.get(str));
                    }
                }
                String g = L.m903g();
                if (g != null) {
                    map.put(g, L);
                }
            } else if (C7559r0.m22097f(xmlPullParser, "region")) {
                C14316e J = m946J(xmlPullParser, aVar, cVar);
                if (J != null) {
                    map2.put(J.f32401a, J);
                }
            } else if (C7559r0.m22097f(xmlPullParser, "metadata")) {
                m948H(xmlPullParser, map3);
            }
        } while (!C7559r0.m22099d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: H */
    private static void m948H(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a;
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "image") && (a = C7559r0.m22102a(xmlPullParser, "id")) != null) {
                map.put(a, xmlPullParser.nextText());
            }
        } while (!C7559r0.m22099d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: I */
    private static C14315d m947I(XmlPullParser xmlPullParser, C14315d dVar, Map<String, C14316e> map, C14314b bVar) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        C14318g L = m944L(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(ViewProps.END)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = m942N(attributeValue, bVar);
                    break;
                case 2:
                    j4 = m942N(attributeValue, bVar);
                    break;
                case 3:
                    j3 = m942N(attributeValue, bVar);
                    break;
                case 4:
                    String[] M = m943M(attributeValue);
                    if (M.length > 0) {
                        strArr = M;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j6 = dVar.f32391d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (dVar != null) {
                long j7 = dVar.f32392e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return C14315d.m938c(xmlPullParser.getName(), j3, j2, L, strArr, str2, str, dVar);
        }
        j2 = j4;
        return C14315d.m938c(xmlPullParser.getName(), j3, j2, L, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a9, code lost:
        if (r0.equals("tb") == false) goto L_0x018b;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017c  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p440y8.C14316e m946J(org.xmlpull.v1.XmlPullParser r17, p440y8.C14312c.C14313a r18, p440y8.C14312c.C0462c r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440y8.C14312c.m946J(org.xmlpull.v1.XmlPullParser, y8.c$a, y8.c$c):y8.e");
    }

    /* renamed from: K */
    private static float m945K(String str) {
        Matcher matcher = f32374s.matcher(str);
        if (!matcher.matches()) {
            C7558r.m22104h("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C7510a.m22367e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            C7558r.m22103i("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d1, code lost:
        if (r3.equals(com.facebook.react.uimanager.ViewProps.START) == false) goto L_0x02c9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c8, code lost:
        if (r3.equals("text") == false) goto L_0x01c0;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p440y8.C14318g m944L(org.xmlpull.v1.XmlPullParser r12, p440y8.C14318g r13) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440y8.C14312c.m944L(org.xmlpull.v1.XmlPullParser, y8.g):y8.g");
    }

    /* renamed from: M */
    private static String[] m943M(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return C7557q0.m22188N0(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L_0x00b4;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m942N(java.lang.String r13, p440y8.C14312c.C14314b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p440y8.C14312c.m942N(java.lang.String, y8.c$b):long");
    }

    /* renamed from: O */
    private static C0462c m941O(XmlPullParser xmlPullParser) {
        String a = C7559r0.m22102a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f32376u.matcher(a);
        if (!matcher.matches()) {
            C7558r.m22104h("TtmlDecoder", "Ignoring non-pixel tts extent: " + a);
            return null;
        }
        try {
            return new C0462c(Integer.parseInt((String) C7510a.m22367e(matcher.group(1))), Integer.parseInt((String) C7510a.m22367e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            C7558r.m22104h("TtmlDecoder", "Ignoring malformed tts extent: " + a);
            return null;
        }
    }

    @Override // p317r8.AbstractC12456d
    /* renamed from: z */
    protected AbstractC12458f mo154z(byte[] bArr, int i, boolean z) {
        C14314b bVar;
        try {
            XmlPullParser newPullParser = this.f32380o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C14316e(""));
            C0462c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C14314b bVar2 = f32378w;
            C14313a aVar = f32379x;
            int i2 = 0;
            C14319h hVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C14315d dVar = (C14315d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m950F(newPullParser);
                            aVar = m952D(newPullParser, f32379x);
                            cVar = m941O(newPullParser);
                        }
                        if (!m953C(name)) {
                            C7558r.m22106f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar2;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar2;
                                m949G(newPullParser, hashMap, aVar, cVar, hashMap2, hashMap3);
                            } else {
                                bVar = bVar2;
                                try {
                                    C14315d I = m947I(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(I);
                                    if (dVar != null) {
                                        dVar.m940a(I);
                                    }
                                } catch (C12460h e) {
                                    C7558r.m22103i("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar;
                        aVar = aVar;
                    } else if (eventType == 4) {
                        ((C14315d) C7510a.m22367e(dVar)).m940a(C14315d.m937d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new C14319h((C14315d) C7510a.m22367e((C14315d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new C12460h("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new C12460h("Unable to decode source", e3);
        }
    }
}
