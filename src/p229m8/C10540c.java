package p229m8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.nearby.NearbyManager;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.google.android.exoplayer2.upstream.C5328i;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p028b8.C3396a;
import p030bc.C3445b;
import p030bc.C3452d;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7548n0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7559r0;
import p119g9.C7562u;
import p163j$.util.Spliterator;
import p193k7.C9798l;
import p229m8.AbstractC10551j;

/* renamed from: m8.c */
/* loaded from: classes7.dex */
public class C10540c extends DefaultHandler implements C5328i.AbstractC5329a<C10539b> {

    /* renamed from: b */
    private static final Pattern f23317b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    private static final Pattern f23318c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    private static final Pattern f23319d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    private static final int[] f23320e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    private final XmlPullParserFactory f23321a;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m8.c$a */
    /* loaded from: classes7.dex */
    public static final class C10541a {

        /* renamed from: a */
        public final C6722k f23322a;

        /* renamed from: b */
        public final String f23323b;

        /* renamed from: c */
        public final AbstractC10551j f23324c;

        /* renamed from: d */
        public final String f23325d;

        /* renamed from: e */
        public final ArrayList<C9798l.C9800b> f23326e;

        /* renamed from: f */
        public final ArrayList<C10542d> f23327f;

        /* renamed from: g */
        public final long f23328g;

        public C10541a(C6722k kVar, String str, AbstractC10551j jVar, String str2, ArrayList<C9798l.C9800b> arrayList, ArrayList<C10542d> arrayList2, long j) {
            this.f23322a = kVar;
            this.f23323b = str;
            this.f23324c = jVar;
            this.f23325d = str2;
            this.f23326e = arrayList;
            this.f23327f = arrayList2;
            this.f23328g = j;
        }
    }

    public C10540c() {
        try {
            this.f23321a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: B */
    protected static int m12917B(List<C10542d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C10542d dVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f23329a) && (str = dVar.f23330b) != null) {
                Matcher matcher = f23318c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C7558r.m22104h("MpdParser", "Unable to parse CEA-608 channel number from: " + dVar.f23330b);
            }
        }
        return -1;
    }

    /* renamed from: C */
    protected static int m12916C(List<C10542d> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            C10542d dVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f23329a) && (str = dVar.f23330b) != null) {
                Matcher matcher = f23319d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                C7558r.m22104h("MpdParser", "Unable to parse CEA-708 service block number from: " + dVar.f23330b);
            }
        }
        return -1;
    }

    /* renamed from: F */
    protected static long m12913F(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C7557q0.m22208D0(attributeValue);
    }

    /* renamed from: G */
    protected static C10542d m12912G(XmlPullParser xmlPullParser, String str) {
        String m0 = m12868m0(xmlPullParser, "schemeIdUri", "");
        String m02 = m12868m0(xmlPullParser, "value", null);
        String m03 = m12868m0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!C7559r0.m22099d(xmlPullParser, str));
        return new C10542d(m0, m02, m03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: H */
    protected static int m12911H(XmlPullParser xmlPullParser) {
        char c;
        String U0 = C7557q0.m22174U0(xmlPullParser.getAttributeValue(null, "value"));
        if (U0 == null) {
            return -1;
        }
        switch (U0.hashCode()) {
            case 1596796:
                if (U0.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (U0.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (U0.equals("f801")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (U0.equals("fa01")) {
                    c = 3;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return -1;
        }
    }

    /* renamed from: I */
    protected static long m12910I(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return C7557q0.m22206E0(attributeValue);
    }

    /* renamed from: J */
    protected static String m12909J(List<C10542d> list) {
        for (int i = 0; i < list.size(); i++) {
            C10542d dVar = list.get(i);
            String str = dVar.f23329a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(dVar.f23330b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(dVar.f23330b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: N */
    protected static float m12905N(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return f;
        }
        return Float.parseFloat(attributeValue);
    }

    /* renamed from: O */
    protected static float m12904O(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f23317b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        if (!TextUtils.isEmpty(group)) {
            return parseInt / Integer.parseInt(group);
        }
        return parseInt;
    }

    /* renamed from: Q */
    protected static int m12902Q(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: S */
    protected static long m12900S(List<C10542d> list) {
        for (int i = 0; i < list.size(); i++) {
            C10542d dVar = list.get(i);
            if (C3445b.m34378a("http://dashif.org/guidelines/last-segment-number", dVar.f23329a)) {
                return Long.parseLong(dVar.f23330b);
            }
        }
        return -1L;
    }

    /* renamed from: T */
    protected static long m12899T(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: V */
    protected static int m12897V(XmlPullParser xmlPullParser) {
        int Q = m12902Q(xmlPullParser, "value", -1);
        if (Q < 0) {
            return -1;
        }
        int[] iArr = f23320e;
        if (Q < iArr.length) {
            return iArr[Q];
        }
        return -1;
    }

    /* renamed from: b */
    private long m12891b(List<AbstractC10551j.C10555d> list, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            i2 = (int) C7557q0.m22139m(j3 - j, j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(m12869m(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: m0 */
    protected static String m12868m0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: n0 */
    protected static String m12866n0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m12856u(xmlPullParser);
            }
        } while (!C7559r0.m22099d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: p */
    private static int m12863p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C7510a.m22366f(i == i2);
        return i;
    }

    /* renamed from: q */
    private static String m12861q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C7510a.m22366f(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    private static void m12859r(ArrayList<C9798l.C9800b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C9798l.C9800b bVar = arrayList.get(size);
            if (!bVar.m15321e()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).m15323a(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s */
    private static long m12858s(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: t */
    private static String m12857t(String str, String str2) {
        if (C7562u.m22072p(str)) {
            return C7562u.m22085c(str2);
        }
        if (C7562u.m22069s(str)) {
            return C7562u.m22073o(str2);
        }
        if (C7562u.m22070r(str)) {
            if ("application/x-rawcc".equals(str)) {
                return C7562u.m22078j(str2);
            }
            return str;
        } else if (!"application/mp4".equals(str)) {
            return null;
        } else {
            String g = C7562u.m22081g(str2);
            if ("text/vtt".equals(g)) {
                return "application/x-mp4-vtt";
            }
            return g;
        }
    }

    /* renamed from: u */
    public static void m12856u(XmlPullParser xmlPullParser) {
        if (C7559r0.m22098e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C7559r0.m22098e(xmlPullParser)) {
                    i++;
                } else if (C7559r0.m22100c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: A */
    protected String m12918A(XmlPullParser xmlPullParser, String str) {
        return C7548n0.m22234c(str, m12866n0(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<java.lang.String, p193k7.C9798l.C9800b> m12915D(org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m8.C10540c.m12915D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: E */
    protected int m12914E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* renamed from: K */
    protected Pair<Long, C3396a> m12908K(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        long T = m12899T(xmlPullParser, "id", 0L);
        long T2 = m12899T(xmlPullParser, "duration", -9223372036854775807L);
        long T3 = m12899T(xmlPullParser, "presentationTime", 0L);
        long I0 = C7557q0.m22198I0(T2, 1000L, j);
        long I02 = C7557q0.m22198I0(T3, 1000000L, j);
        String m0 = m12868m0(xmlPullParser, "messageData", null);
        byte[] L = m12907L(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(I02);
        if (m0 != null) {
            L = C7557q0.m22140l0(m0);
        }
        return Pair.create(valueOf, m12887d(str, str2, T, I0, L));
    }

    /* renamed from: L */
    protected byte[] m12907L(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, C3452d.f5595c.name());
        xmlPullParser.nextToken();
        while (!C7559r0.m22099d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: M */
    protected C10543e m12906M(XmlPullParser xmlPullParser) {
        String m0 = m12868m0(xmlPullParser, "schemeIdUri", "");
        String m02 = m12868m0(xmlPullParser, "value", "");
        long T = m12899T(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Event")) {
                arrayList.add(m12908K(xmlPullParser, m0, m02, T, byteArrayOutputStream));
            } else {
                m12856u(xmlPullParser);
            }
        } while (!C7559r0.m22099d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        C3396a[] aVarArr = new C3396a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            aVarArr[i] = (C3396a) pair.second;
        }
        return m12885e(m0, m02, T, jArr, aVarArr);
    }

    /* renamed from: P */
    protected C10546h m12903P(XmlPullParser xmlPullParser) {
        return m12894Y(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: R */
    protected String m12901R(XmlPullParser xmlPullParser) {
        return m12866n0(xmlPullParser, "Label");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f A[LOOP:0: B:20:0x0076->B:71:0x019f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159 A[SYNTHETIC] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p229m8.C10539b m12898U(org.xmlpull.v1.XmlPullParser r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m8.C10540c.m12898U(org.xmlpull.v1.XmlPullParser, java.lang.String):m8.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0186 A[LOOP:0: B:7:0x0040->B:38:0x0186, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d A[SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.util.Pair<p229m8.C10544f, java.lang.Long> m12896W(org.xmlpull.v1.XmlPullParser r36, java.lang.String r37, long r38, long r40, long r42, long r44) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m8.C10540c.m12896W(org.xmlpull.v1.XmlPullParser, java.lang.String, long, long, long, long):android.util.Pair");
    }

    /* renamed from: X */
    protected C10545g m12895X(XmlPullParser xmlPullParser) {
        String str = null;
        String m0 = m12868m0(xmlPullParser, "moreInformationURL", null);
        String m02 = m12868m0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (C7559r0.m22097f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (C7559r0.m22097f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m12856u(xmlPullParser);
            }
            if (C7559r0.m22099d(xmlPullParser, "ProgramInformation")) {
                return new C10545g(str, str2, str3, m0, m02);
            }
            str3 = str3;
        }
    }

    /* renamed from: Y */
    protected C10546h m12894Y(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return m12877i(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return m12877i(attributeValue, j2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e3 A[LOOP:0: B:3:0x0067->B:51:0x01e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a A[EDGE_INSN: B:52:0x019a->B:46:0x019a ?: BREAK  , SYNTHETIC] */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p229m8.C10540c.C10541a m12893Z(org.xmlpull.v1.XmlPullParser r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<p229m8.C10542d> r46, java.util.List<p229m8.C10542d> r47, java.util.List<p229m8.C10542d> r48, java.util.List<p229m8.C10542d> r49, p229m8.AbstractC10551j r50, long r51, long r53, long r55, long r57, long r59) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m8.C10540c.m12893Z(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, m8.j, long, long, long, long, long):m8.c$a");
    }

    /* renamed from: a0 */
    protected int m12892a0(List<C10542d> list) {
        int o0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C10542d dVar = list.get(i2);
            if (C3445b.m34378a("urn:mpeg:dash:role:2011", dVar.f23329a)) {
                o0 = m12890b0(dVar.f23330b);
            } else if (C3445b.m34378a("urn:tva:metadata:cs:AudioPurposeCS:2007", dVar.f23329a)) {
                o0 = m12864o0(dVar.f23330b);
            }
            i |= o0;
        }
        return i;
    }

    /* renamed from: b0 */
    protected int m12890b0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c = 4;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c = 5;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c = 6;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c = 7;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c = '\b';
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c = '\t';
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c = '\n';
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                return 128;
            case 1:
                return 512;
            case 2:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 4:
                return 2;
            case 5:
                return 16;
            case 6:
                return 1;
            case 7:
                return Spliterator.NONNULL;
            case '\b':
                return 64;
            case '\t':
                return 8;
            case '\n':
                return 32;
            case 11:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: c */
    protected C10538a m12889c(int i, int i2, List<AbstractC10547i> list, List<C10542d> list2, List<C10542d> list3, List<C10542d> list4) {
        return new C10538a(i, i2, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    protected int m12888c0(List<C10542d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C3445b.m34378a("http://dashif.org/guidelines/trickmode", list.get(i2).f23329a)) {
                i |= Spliterator.SUBSIZED;
            }
        }
        return i;
    }

    /* renamed from: d */
    protected C3396a m12887d(String str, String str2, long j, long j2, byte[] bArr) {
        return new C3396a(str, str2, j2, j, bArr);
    }

    /* renamed from: d0 */
    protected int m12886d0(List<C10542d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C10542d dVar = list.get(i2);
            if (C3445b.m34378a("urn:mpeg:dash:role:2011", dVar.f23329a)) {
                i |= m12890b0(dVar.f23330b);
            }
        }
        return i;
    }

    /* renamed from: e */
    protected C10543e m12885e(String str, String str2, long j, long[] jArr, C3396a[] aVarArr) {
        return new C10543e(str, str2, j, jArr, aVarArr);
    }

    /* renamed from: e0 */
    protected AbstractC10551j.C10556e m12884e0(XmlPullParser xmlPullParser, AbstractC10551j.C10556e eVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (eVar != null) {
            j = eVar.f23364b;
        } else {
            j = 1;
        }
        long T = m12899T(xmlPullParser, "timescale", j);
        long j6 = 0;
        if (eVar != null) {
            j2 = eVar.f23365c;
        } else {
            j2 = 0;
        }
        long T2 = m12899T(xmlPullParser, "presentationTimeOffset", j2);
        if (eVar != null) {
            j3 = eVar.f23378d;
        } else {
            j3 = 0;
        }
        if (eVar != null) {
            j6 = eVar.f23379e;
        }
        C10546h hVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j5 = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - j5) + 1;
        } else {
            j4 = j6;
            j5 = j3;
        }
        if (eVar != null) {
            hVar = eVar.f23363a;
        }
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Initialization")) {
                hVar = m12903P(xmlPullParser);
            } else {
                m12856u(xmlPullParser);
            }
        } while (!C7559r0.m22099d(xmlPullParser, "SegmentBase"));
        return m12867n(hVar, T, T2, j5, j4);
    }

    /* renamed from: f */
    protected C6722k m12883f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<C10542d> list, List<C10542d> list2, String str4, List<C10542d> list3, List<C10542d> list4) {
        int i6;
        String t = m12857t(str2, str4);
        if ("audio/eac3".equals(t)) {
            t = m12909J(list4);
        }
        int k0 = m12872k0(list);
        C6722k.C6724b V = new C6722k.C6724b().m24505S(str).m24513K(str2).m24488e0(t).m24515I(str4).m24498Z(i5).m24484g0(k0).m24492c0(m12886d0(list) | m12892a0(list2) | m12888c0(list3) | m12888c0(list4)).m24502V(str3);
        if (C7562u.m22069s(t)) {
            V.m24478j0(i).m24507Q(i2).m24508P(f);
        } else if (C7562u.m22072p(t)) {
            V.m24516H(i3).m24486f0(i4);
        } else if (C7562u.m22070r(t)) {
            if ("application/cea-608".equals(t)) {
                i6 = m12917B(list2);
            } else if ("application/cea-708".equals(t)) {
                i6 = m12916C(list2);
            } else {
                i6 = -1;
            }
            V.m24518F(i6);
        }
        return V.m24519E();
    }

    /* renamed from: f0 */
    protected AbstractC10551j.C10553b m12882f0(XmlPullParser xmlPullParser, AbstractC10551j.C10553b bVar, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        long j9 = 1;
        if (bVar != null) {
            j6 = bVar.f23364b;
        } else {
            j6 = 1;
        }
        long T = m12899T(xmlPullParser, "timescale", j6);
        if (bVar != null) {
            j7 = bVar.f23365c;
        } else {
            j7 = 0;
        }
        long T2 = m12899T(xmlPullParser, "presentationTimeOffset", j7);
        if (bVar != null) {
            j8 = bVar.f23367e;
        } else {
            j8 = -9223372036854775807L;
        }
        long T3 = m12899T(xmlPullParser, "duration", j8);
        if (bVar != null) {
            j9 = bVar.f23366d;
        }
        long T4 = m12899T(xmlPullParser, "startNumber", j9);
        long s = m12858s(j3, j4);
        List<AbstractC10551j.C10555d> list = null;
        List<C10546h> list2 = null;
        C10546h hVar = null;
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Initialization")) {
                hVar = m12903P(xmlPullParser);
            } else if (C7559r0.m22097f(xmlPullParser, "SegmentTimeline")) {
                list = m12878h0(xmlPullParser, T, j2);
            } else if (C7559r0.m22097f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList<>();
                }
                list2.add(m12876i0(xmlPullParser));
            } else {
                m12856u(xmlPullParser);
            }
        } while (!C7559r0.m22099d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (hVar == null) {
                hVar = bVar.f23363a;
            }
            if (list == null) {
                list = bVar.f23368f;
            }
            if (list2 == null) {
                list2 = bVar.f23372j;
            }
        }
        return m12873k(hVar, T, T2, T4, T3, list, s, list2, j5, j);
    }

    /* renamed from: g */
    protected C10539b m12881g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, C10545g gVar, C10560n nVar, C10557k kVar, Uri uri, List<C10544f> list) {
        return new C10539b(j, j2, j3, z, j4, j5, j6, j7, gVar, nVar, kVar, uri, list);
    }

    /* renamed from: g0 */
    protected AbstractC10551j.C10554c m12880g0(XmlPullParser xmlPullParser, AbstractC10551j.C10554c cVar, List<C10542d> list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        long j8;
        C10559m mVar;
        C10559m mVar2;
        long j9 = 1;
        if (cVar != null) {
            j6 = cVar.f23364b;
        } else {
            j6 = 1;
        }
        long T = m12899T(xmlPullParser, "timescale", j6);
        if (cVar != null) {
            j7 = cVar.f23365c;
        } else {
            j7 = 0;
        }
        long T2 = m12899T(xmlPullParser, "presentationTimeOffset", j7);
        if (cVar != null) {
            j8 = cVar.f23367e;
        } else {
            j8 = -9223372036854775807L;
        }
        long T3 = m12899T(xmlPullParser, "duration", j8);
        if (cVar != null) {
            j9 = cVar.f23366d;
        }
        long T4 = m12899T(xmlPullParser, "startNumber", j9);
        long S = m12900S(list);
        long s = m12858s(j3, j4);
        List<AbstractC10551j.C10555d> list2 = null;
        if (cVar != null) {
            mVar = cVar.f23374k;
        } else {
            mVar = null;
        }
        C10559m p0 = m12862p0(xmlPullParser, "media", mVar);
        if (cVar != null) {
            mVar2 = cVar.f23373j;
        } else {
            mVar2 = null;
        }
        C10559m p02 = m12862p0(xmlPullParser, "initialization", mVar2);
        C10546h hVar = null;
        while (true) {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Initialization")) {
                hVar = m12903P(xmlPullParser);
            } else if (C7559r0.m22097f(xmlPullParser, "SegmentTimeline")) {
                list2 = m12878h0(xmlPullParser, T, j2);
            } else {
                m12856u(xmlPullParser);
            }
            if (C7559r0.m22099d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar != null) {
            if (hVar == null) {
                hVar = cVar.f23363a;
            }
            if (list2 == null) {
                list2 = cVar.f23368f;
            }
        }
        return m12871l(hVar, T, T2, T4, S, T3, list2, s, p02, p0, j5, j);
    }

    /* renamed from: h */
    protected C10544f m12879h(String str, long j, List<C10538a> list, List<C10543e> list2, C10542d dVar) {
        return new C10544f(str, j, list, list2, dVar);
    }

    /* renamed from: h0 */
    protected List<AbstractC10551j.C10555d> m12878h0(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "S")) {
                long T = m12899T(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    j3 = m12891b(arrayList, j3, j4, i, T);
                }
                if (T == -9223372036854775807L) {
                    T = j3;
                }
                j4 = m12899T(xmlPullParser, "d", -9223372036854775807L);
                i = m12902Q(xmlPullParser, "r", 0);
                z = true;
                j3 = T;
            } else {
                m12856u(xmlPullParser);
            }
        } while (!C7559r0.m22099d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            m12891b(arrayList, j3, j4, i, C7557q0.m22198I0(j2, j, 1000L));
        }
        return arrayList;
    }

    /* renamed from: i */
    protected C10546h m12877i(String str, long j, long j2) {
        return new C10546h(str, j, j2);
    }

    /* renamed from: i0 */
    protected C10546h m12876i0(XmlPullParser xmlPullParser) {
        return m12894Y(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: j */
    protected AbstractC10547i m12875j(C10541a aVar, String str, String str2, ArrayList<C9798l.C9800b> arrayList, ArrayList<C10542d> arrayList2) {
        C6722k.C6724b a = aVar.f23322a.m24531a();
        if (str != null) {
            a.m24503U(str);
        }
        String str3 = aVar.f23325d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<C9798l.C9800b> arrayList3 = aVar.f23326e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m12859r(arrayList3);
            a.m24512L(new C9798l(str2, arrayList3));
        }
        ArrayList<C10542d> arrayList4 = aVar.f23327f;
        arrayList4.addAll(arrayList2);
        return AbstractC10547i.m12844o(aVar.f23328g, a.m24519E(), aVar.f23323b, aVar.f23324c, arrayList4);
    }

    /* renamed from: j0 */
    protected int m12874j0(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle")) {
            return 2;
        }
        if (!str.equals("main")) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    protected AbstractC10551j.C10553b m12873k(C10546h hVar, long j, long j2, long j3, long j4, List<AbstractC10551j.C10555d> list, long j5, List<C10546h> list2, long j6, long j7) {
        return new AbstractC10551j.C10553b(hVar, j, j2, j3, j4, list, j5, list2, C6713c.m24566c(j6), C6713c.m24566c(j7));
    }

    /* renamed from: k0 */
    protected int m12872k0(List<C10542d> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C10542d dVar = list.get(i2);
            if (C3445b.m34378a("urn:mpeg:dash:role:2011", dVar.f23329a)) {
                i |= m12874j0(dVar.f23330b);
            }
        }
        return i;
    }

    /* renamed from: l */
    protected AbstractC10551j.C10554c m12871l(C10546h hVar, long j, long j2, long j3, long j4, long j5, List<AbstractC10551j.C10555d> list, long j6, C10559m mVar, C10559m mVar2, long j7, long j8) {
        return new AbstractC10551j.C10554c(hVar, j, j2, j3, j4, j5, list, j6, mVar, mVar2, C6713c.m24566c(j7), C6713c.m24566c(j8));
    }

    /* renamed from: l0 */
    protected C10557k m12870l0(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (C7559r0.m22097f(xmlPullParser, "Latency")) {
                j = m12899T(xmlPullParser, TouchesHelper.TARGET_KEY, -9223372036854775807L);
                j2 = m12899T(xmlPullParser, "min", -9223372036854775807L);
                j3 = m12899T(xmlPullParser, "max", -9223372036854775807L);
            } else if (C7559r0.m22097f(xmlPullParser, "PlaybackRate")) {
                f = m12905N(xmlPullParser, "min", -3.4028235E38f);
                f2 = m12905N(xmlPullParser, "max", -3.4028235E38f);
            }
            if (C7559r0.m22099d(xmlPullParser, "ServiceDescription")) {
                return new C10557k(j, j2, j3, f, f2);
            }
            j = j;
            j2 = j2;
            j3 = j3;
            f = f;
            f2 = f2;
        }
    }

    /* renamed from: m */
    protected AbstractC10551j.C10555d m12869m(long j, long j2) {
        return new AbstractC10551j.C10555d(j, j2);
    }

    /* renamed from: n */
    protected AbstractC10551j.C10556e m12867n(C10546h hVar, long j, long j2, long j3, long j4) {
        return new AbstractC10551j.C10556e(hVar, j, j2, j3, j4);
    }

    /* renamed from: o */
    protected C10560n m12865o(String str, String str2) {
        return new C10560n(str, str2);
    }

    /* renamed from: o0 */
    protected int m12864o0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(NearbyManager.PERMISSION_DENIED)) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 512;
            case 1:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: p0 */
    protected C10559m m12862p0(XmlPullParser xmlPullParser, String str, C10559m mVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return C10559m.m12815b(attributeValue);
        }
        return mVar;
    }

    /* renamed from: q0 */
    protected C10560n m12860q0(XmlPullParser xmlPullParser) {
        return m12865o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* renamed from: v */
    public C10539b mo7921a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f23321a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m12898U(newPullParser, uri.toString());
            }
            throw new C6728o("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new C6728o(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x032b A[LOOP:0: B:3:0x0079->B:69:0x032b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02eb A[EDGE_INSN: B:70:0x02eb->B:63:0x02eb ?: BREAK  , SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected p229m8.C10538a m12854w(org.xmlpull.v1.XmlPullParser r54, java.lang.String r55, p229m8.AbstractC10551j r56, long r57, long r59, long r61, long r63, long r65) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m8.C10540c.m12854w(org.xmlpull.v1.XmlPullParser, java.lang.String, m8.j, long, long, long, long, long):m8.a");
    }

    /* renamed from: x */
    protected void m12853x(XmlPullParser xmlPullParser) {
        m12856u(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: y */
    protected int m12852y(XmlPullParser xmlPullParser) {
        char c;
        String m0 = m12868m0(xmlPullParser, "schemeIdUri", null);
        m0.hashCode();
        int i = -1;
        switch (m0.hashCode()) {
            case -1352850286:
                if (m0.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (m0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (m0.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (m0.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 3;
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
                i = m12902Q(xmlPullParser, "value", -1);
                break;
            case 1:
            case 3:
                i = m12911H(xmlPullParser);
                break;
            case 2:
                i = m12897V(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!C7559r0.m22099d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* renamed from: z */
    protected long m12851z(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }
}
