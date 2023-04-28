package p297q8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.C5328i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p079e7.C6722k;
import p079e7.C6728o;
import p117g7.C7423a;
import p119g9.C7510a;
import p119g9.C7518d;
import p119g9.C7557q0;
import p163j$.util.Spliterator;
import p193k7.C9798l;
import p297q8.C12041a;
import p348t7.C12993l;
import p348t7.C12999p;

/* renamed from: q8.b */
/* loaded from: classes7.dex */
public class C12043b implements C5328i.AbstractC5329a<C12041a> {

    /* renamed from: a */
    private final XmlPullParserFactory f27050a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.b$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC12044a {

        /* renamed from: a */
        private final String f27051a;

        /* renamed from: b */
        private final String f27052b;

        /* renamed from: c */
        private final AbstractC12044a f27053c;

        /* renamed from: d */
        private final List<Pair<String, Object>> f27054d = new LinkedList();

        public AbstractC12044a(AbstractC12044a aVar, String str, String str2) {
            this.f27053c = aVar;
            this.f27051a = str;
            this.f27052b = str2;
        }

        /* renamed from: e */
        private AbstractC12044a m7918e(AbstractC12044a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C12046d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new C12045c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C12048f(aVar, str2);
            }
            return null;
        }

        /* renamed from: a */
        protected void mo7901a(Object obj) {
        }

        /* renamed from: b */
        protected abstract Object mo7900b();

        /* renamed from: c */
        protected final Object m7919c(String str) {
            for (int i = 0; i < this.f27054d.size(); i++) {
                Pair<String, Object> pair = this.f27054d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC12044a aVar = this.f27053c;
            if (aVar == null) {
                return null;
            }
            return aVar.m7919c(str);
        }

        /* renamed from: d */
        protected boolean mo7899d(String str) {
            return false;
        }

        /* renamed from: f */
        public final Object m7917f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f27052b.equals(name)) {
                        mo7898n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo7899d(name)) {
                            mo7898n(xmlPullParser);
                        } else {
                            AbstractC12044a e = m7918e(this, name, this.f27051a);
                            if (e == null) {
                                i = 1;
                            } else {
                                mo7901a(e.m7917f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo7908o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo7909h(xmlPullParser);
                    if (!mo7899d(name2)) {
                        return mo7900b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* renamed from: g */
        protected final boolean m7916g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return Boolean.parseBoolean(attributeValue);
            }
            return z;
        }

        /* renamed from: h */
        protected void mo7909h(XmlPullParser xmlPullParser) {
        }

        /* renamed from: i */
        protected final int m7915i(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new C6728o(e);
            }
        }

        /* renamed from: j */
        protected final long m7914j(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new C6728o(e);
            }
        }

        /* renamed from: k */
        protected final int m7913k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C6728o(e);
                }
            } else {
                throw new C0384b(str);
            }
        }

        /* renamed from: l */
        protected final long m7912l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new C6728o(e);
                }
            } else {
                throw new C0384b(str);
            }
        }

        /* renamed from: m */
        protected final String m7911m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0384b(str);
        }

        /* renamed from: n */
        protected abstract void mo7898n(XmlPullParser xmlPullParser);

        /* renamed from: o */
        protected void mo7908o(XmlPullParser xmlPullParser) {
        }

        /* renamed from: p */
        protected final void m7910p(String str, Object obj) {
            this.f27054d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: q8.b$b */
    /* loaded from: classes7.dex */
    public static class C0384b extends C6728o {
        public C0384b(String str) {
            super("Missing required field: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.b$c */
    /* loaded from: classes7.dex */
    public static class C12045c extends AbstractC12044a {

        /* renamed from: e */
        private boolean f27055e;

        /* renamed from: f */
        private UUID f27056f;

        /* renamed from: g */
        private byte[] f27057g;

        public C12045c(AbstractC12044a aVar, String str) {
            super(aVar, str, "Protection");
        }

        /* renamed from: q */
        private static C12999p[] m7907q(byte[] bArr) {
            return new C12999p[]{new C12999p(true, null, 8, m7906r(bArr), 0, 0, null)};
        }

        /* renamed from: r */
        private static byte[] m7906r(byte[] bArr) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb2.append((char) bArr[i]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            m7904t(decode, 0, 3);
            m7904t(decode, 1, 2);
            m7904t(decode, 4, 5);
            m7904t(decode, 6, 7);
            return decode;
        }

        /* renamed from: s */
        private static String m7905s(String str) {
            if (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }

        /* renamed from: t */
        private static void m7904t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: b */
        public Object mo7900b() {
            UUID uuid = this.f27056f;
            return new C12041a.C0383a(uuid, C12993l.m4796a(uuid, this.f27057g), m7907q(this.f27057g));
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: d */
        public boolean mo7899d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: h */
        public void mo7909h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f27055e = false;
            }
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: n */
        public void mo7898n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f27055e = true;
                this.f27056f = UUID.fromString(m7905s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: o */
        public void mo7908o(XmlPullParser xmlPullParser) {
            if (this.f27055e) {
                this.f27057g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.b$d */
    /* loaded from: classes7.dex */
    public static class C12046d extends AbstractC12044a {

        /* renamed from: e */
        private C6722k f27058e;

        public C12046d(AbstractC12044a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        /* renamed from: q */
        private static List<byte[]> m7903q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] I = C7557q0.m22199I(str);
                byte[][] i = C7518d.m22342i(I);
                if (i == null) {
                    arrayList.add(I);
                } else {
                    Collections.addAll(arrayList, i);
                }
            }
            return arrayList;
        }

        /* renamed from: r */
        private static String m7902r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: b */
        public Object mo7900b() {
            return this.f27058e;
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: n */
        public void mo7898n(XmlPullParser xmlPullParser) {
            int i;
            C6722k.C6724b bVar = new C6722k.C6724b();
            String r = m7902r(m7911m(xmlPullParser, "FourCC"));
            int intValue = ((Integer) m7919c("Type")).intValue();
            if (intValue == 2) {
                bVar.m24513K("video/mp4").m24478j0(m7913k(xmlPullParser, "MaxWidth")).m24507Q(m7913k(xmlPullParser, "MaxHeight")).m24504T(m7903q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (intValue == 1) {
                if (r == null) {
                    r = "audio/mp4a-latm";
                }
                int k = m7913k(xmlPullParser, "Channels");
                int k2 = m7913k(xmlPullParser, "SamplingRate");
                List<byte[]> q = m7903q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (q.isEmpty() && "audio/mp4a-latm".equals(r)) {
                    q = Collections.singletonList(C7423a.m22706a(k2, k));
                }
                bVar.m24513K("audio/mp4").m24516H(k).m24486f0(k2).m24504T(q);
            } else if (intValue == 3) {
                String str = (String) m7919c("Subtype");
                if (str != null) {
                    if (str.equals("CAPT")) {
                        i = 64;
                    } else if (str.equals("DESC")) {
                        i = Spliterator.IMMUTABLE;
                    }
                    bVar.m24513K("application/mp4").m24492c0(i);
                }
                i = 0;
                bVar.m24513K("application/mp4").m24492c0(i);
            } else {
                bVar.m24513K("application/mp4");
            }
            this.f27058e = bVar.m24505S(xmlPullParser.getAttributeValue(null, "Index")).m24503U((String) m7919c("Name")).m24488e0(r).m24517G(m7913k(xmlPullParser, "Bitrate")).m24502V((String) m7919c("Language")).m24519E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.b$e */
    /* loaded from: classes7.dex */
    public static class C12047e extends AbstractC12044a {

        /* renamed from: f */
        private int f27060f;

        /* renamed from: g */
        private int f27061g;

        /* renamed from: h */
        private long f27062h;

        /* renamed from: i */
        private long f27063i;

        /* renamed from: j */
        private long f27064j;

        /* renamed from: l */
        private boolean f27066l;

        /* renamed from: k */
        private int f27065k = -1;

        /* renamed from: m */
        private C12041a.C0383a f27067m = null;

        /* renamed from: e */
        private final List<C12041a.C12042b> f27059e = new LinkedList();

        public C12047e(AbstractC12044a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: a */
        public void mo7901a(Object obj) {
            boolean z;
            if (obj instanceof C12041a.C12042b) {
                this.f27059e.add((C12041a.C12042b) obj);
            } else if (obj instanceof C12041a.C0383a) {
                if (this.f27067m == null) {
                    z = true;
                } else {
                    z = false;
                }
                C7510a.m22366f(z);
                this.f27067m = (C12041a.C0383a) obj;
            }
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: b */
        public Object mo7900b() {
            int size = this.f27059e.size();
            C12041a.C12042b[] bVarArr = new C12041a.C12042b[size];
            this.f27059e.toArray(bVarArr);
            if (this.f27067m != null) {
                C12041a.C0383a aVar = this.f27067m;
                C9798l lVar = new C9798l(new C9798l.C9800b(aVar.f27031a, "video/mp4", aVar.f27032b));
                for (int i = 0; i < size; i++) {
                    C12041a.C12042b bVar = bVarArr[i];
                    int i2 = bVar.f27034a;
                    if (i2 == 2 || i2 == 1) {
                        C6722k[] kVarArr = bVar.f27043j;
                        for (int i3 = 0; i3 < kVarArr.length; i3++) {
                            kVarArr[i3] = kVarArr[i3].m24531a().m24512L(lVar).m24519E();
                        }
                    }
                }
            }
            return new C12041a(this.f27060f, this.f27061g, this.f27062h, this.f27063i, this.f27064j, this.f27065k, this.f27066l, this.f27067m, bVarArr);
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: n */
        public void mo7898n(XmlPullParser xmlPullParser) {
            this.f27060f = m7913k(xmlPullParser, "MajorVersion");
            this.f27061g = m7913k(xmlPullParser, "MinorVersion");
            this.f27062h = m7914j(xmlPullParser, "TimeScale", 10000000L);
            this.f27063i = m7912l(xmlPullParser, "Duration");
            this.f27064j = m7914j(xmlPullParser, "DVRWindowLength", 0L);
            this.f27065k = m7915i(xmlPullParser, "LookaheadCount", -1);
            this.f27066l = m7916g(xmlPullParser, "IsLive", false);
            m7910p("TimeScale", Long.valueOf(this.f27062h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q8.b$f */
    /* loaded from: classes7.dex */
    public static class C12048f extends AbstractC12044a {

        /* renamed from: e */
        private final String f27068e;

        /* renamed from: f */
        private final List<C6722k> f27069f = new LinkedList();

        /* renamed from: g */
        private int f27070g;

        /* renamed from: h */
        private String f27071h;

        /* renamed from: i */
        private long f27072i;

        /* renamed from: j */
        private String f27073j;

        /* renamed from: k */
        private String f27074k;

        /* renamed from: l */
        private int f27075l;

        /* renamed from: m */
        private int f27076m;

        /* renamed from: n */
        private int f27077n;

        /* renamed from: o */
        private int f27078o;

        /* renamed from: p */
        private String f27079p;

        /* renamed from: q */
        private ArrayList<Long> f27080q;

        /* renamed from: r */
        private long f27081r;

        public C12048f(AbstractC12044a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f27068e = str;
        }

        /* renamed from: q */
        private void m7897q(XmlPullParser xmlPullParser) {
            int s = m7895s(xmlPullParser);
            this.f27070g = s;
            m7910p("Type", Integer.valueOf(s));
            if (this.f27070g == 3) {
                this.f27071h = m7911m(xmlPullParser, "Subtype");
            } else {
                this.f27071h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m7910p("Subtype", this.f27071h);
            this.f27073j = xmlPullParser.getAttributeValue(null, "Name");
            this.f27074k = m7911m(xmlPullParser, "Url");
            this.f27075l = m7915i(xmlPullParser, "MaxWidth", -1);
            this.f27076m = m7915i(xmlPullParser, "MaxHeight", -1);
            this.f27077n = m7915i(xmlPullParser, "DisplayWidth", -1);
            this.f27078o = m7915i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.f27079p = attributeValue;
            m7910p("Language", attributeValue);
            long i = m7915i(xmlPullParser, "TimeScale", -1);
            this.f27072i = i;
            if (i == -1) {
                this.f27072i = ((Long) m7919c("TimeScale")).longValue();
            }
            this.f27080q = new ArrayList<>();
        }

        /* renamed from: r */
        private void m7896r(XmlPullParser xmlPullParser) {
            int size = this.f27080q.size();
            long j = m7914j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else if (this.f27081r != -1) {
                    j = this.f27081r + this.f27080q.get(size - 1).longValue();
                } else {
                    throw new C6728o("Unable to infer start time");
                }
            }
            this.f27080q.add(Long.valueOf(j));
            this.f27081r = m7914j(xmlPullParser, "d", -9223372036854775807L);
            long j2 = m7914j(xmlPullParser, "r", 1L);
            if (j2 <= 1 || this.f27081r != -9223372036854775807L) {
                while (true) {
                    long j3 = i;
                    if (j3 < j2) {
                        this.f27080q.add(Long.valueOf((this.f27081r * j3) + j));
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new C6728o("Repeated chunk with unspecified duration");
            }
        }

        /* renamed from: s */
        private int m7895s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0384b("Type");
            } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                throw new C6728o("Invalid key value[" + attributeValue + "]");
            }
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: a */
        public void mo7901a(Object obj) {
            if (obj instanceof C6722k) {
                this.f27069f.add((C6722k) obj);
            }
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: b */
        public Object mo7900b() {
            C6722k[] kVarArr = new C6722k[this.f27069f.size()];
            this.f27069f.toArray(kVarArr);
            return new C12041a.C12042b(this.f27068e, this.f27074k, this.f27070g, this.f27071h, this.f27072i, this.f27073j, this.f27075l, this.f27076m, this.f27077n, this.f27078o, this.f27079p, kVarArr, this.f27080q, this.f27081r);
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: d */
        public boolean mo7899d(String str) {
            return "c".equals(str);
        }

        @Override // p297q8.C12043b.AbstractC12044a
        /* renamed from: n */
        public void mo7898n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                m7896r(xmlPullParser);
            } else {
                m7897q(xmlPullParser);
            }
        }
    }

    public C12043b() {
        try {
            this.f27050a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    public C12041a mo7921a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f27050a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (C12041a) new C12047e(null, uri.toString()).m7917f(newPullParser);
        } catch (XmlPullParserException e) {
            throw new C6728o(e);
        }
    }
}
