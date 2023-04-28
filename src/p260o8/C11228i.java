package p260o8;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import cc.C3976z0;
import com.discord.nearby.NearbyManager;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.upstream.C5328i;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7548n0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p153i8.C8305v0;
import p163j$.util.Spliterator;
import p193k7.C9798l;
import p244n8.C10753r;
import p260o8.C11217f;
import p260o8.C11220g;
import p348t7.C12993l;
import p459z7.C14576a;

/* renamed from: o8.i */
/* loaded from: classes7.dex */
public final class C11228i implements C5328i.AbstractC5329a<AbstractC11227h> {

    /* renamed from: a */
    private final C11217f f25130a;

    /* renamed from: b */
    private final C11220g f25131b;

    /* renamed from: c */
    private static final Pattern f25106c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d */
    private static final Pattern f25107d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f25108e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f25109f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g */
    private static final Pattern f25110g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f25111h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i */
    private static final Pattern f25112i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j */
    private static final Pattern f25113j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k */
    private static final Pattern f25114k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l */
    private static final Pattern f25115l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f25116m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f25117n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o */
    private static final Pattern f25118o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p */
    private static final Pattern f25119p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q */
    private static final Pattern f25120q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r */
    private static final Pattern f25121r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f25122s = m10414c("CAN-SKIP-DATERANGES");

    /* renamed from: t */
    private static final Pattern f25123t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u */
    private static final Pattern f25124u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v */
    private static final Pattern f25125v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w */
    private static final Pattern f25126w = m10414c("CAN-BLOCK-RELOAD");

    /* renamed from: x */
    private static final Pattern f25127x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y */
    private static final Pattern f25128y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z */
    private static final Pattern f25129z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A */
    private static final Pattern f38979A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B */
    private static final Pattern f38980B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C */
    private static final Pattern f38981C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D */
    private static final Pattern f38982D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E */
    private static final Pattern f38983E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F */
    private static final Pattern f38984F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G */
    private static final Pattern f38985G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H */
    private static final Pattern f38986H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I */
    private static final Pattern f38987I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f38988J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K */
    private static final Pattern f38989K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L */
    private static final Pattern f38990L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M */
    private static final Pattern f38991M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N */
    private static final Pattern f38992N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O */
    private static final Pattern f38993O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f38994P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q */
    private static final Pattern f38995Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R */
    private static final Pattern f38996R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S */
    private static final Pattern f38997S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T */
    private static final Pattern f38998T = m10414c("AUTOSELECT");

    /* renamed from: U */
    private static final Pattern f38999U = m10414c("DEFAULT");

    /* renamed from: V */
    private static final Pattern f39000V = m10414c("FORCED");

    /* renamed from: W */
    private static final Pattern f39001W = m10414c("INDEPENDENT");

    /* renamed from: X */
    private static final Pattern f39002X = m10414c("GAP");

    /* renamed from: Y */
    private static final Pattern f39003Y = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: Z */
    private static final Pattern f39004Z = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: a0 */
    private static final Pattern f25105a0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: o8.i$a */
    /* loaded from: classes7.dex */
    public static final class C11229a extends IOException {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o8.i$b */
    /* loaded from: classes7.dex */
    public static class C11230b {

        /* renamed from: a */
        private final BufferedReader f25132a;

        /* renamed from: b */
        private final Queue<String> f25133b;

        /* renamed from: c */
        private String f25134c;

        public C11230b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f25133b = queue;
            this.f25132a = bufferedReader;
        }

        /* renamed from: a */
        public boolean m10390a() {
            String trim;
            if (this.f25134c != null) {
                return true;
            }
            if (!this.f25133b.isEmpty()) {
                this.f25134c = (String) C7510a.m22367e(this.f25133b.poll());
                return true;
            }
            do {
                String readLine = this.f25132a.readLine();
                this.f25134c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f25134c = trim;
            } while (trim.isEmpty());
            return true;
        }

        /* renamed from: b */
        public String m10389b() {
            if (m10390a()) {
                String str = this.f25134c;
                this.f25134c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public C11228i() {
        this(C11217f.f25041n, null);
    }

    /* renamed from: A */
    private static String m10417A(String str, Map<String, String> map) {
        Matcher matcher = f25105a0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: B */
    private static int m10416B(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !C7557q0.m22130q0(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: b */
    private static boolean m10415b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (!(bufferedReader.read() == 187 && bufferedReader.read() == 191)) {
                return false;
            }
            read = bufferedReader.read();
        }
        int B = m10416B(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (B != "#EXTM3U".charAt(i)) {
                return false;
            }
            B = bufferedReader.read();
        }
        return C7557q0.m22130q0(m10416B(bufferedReader, false, B));
    }

    /* renamed from: c */
    private static Pattern m10414c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    /* renamed from: d */
    private static C9798l m10413d(String str, C9798l.C9800b[] bVarArr) {
        C9798l.C9800b[] bVarArr2 = new C9798l.C9800b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = bVarArr[i].m15322b(null);
        }
        return new C9798l(str, bVarArr2);
    }

    /* renamed from: e */
    private static String m10412e(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* renamed from: f */
    private static C11217f.C11219b m10411f(ArrayList<C11217f.C11219b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C11217f.C11219b bVar = arrayList.get(i);
            if (str.equals(bVar.f25059d)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private static C11217f.C11219b m10410g(ArrayList<C11217f.C11219b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C11217f.C11219b bVar = arrayList.get(i);
            if (str.equals(bVar.f25060e)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static C11217f.C11219b m10409h(ArrayList<C11217f.C11219b> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            C11217f.C11219b bVar = arrayList.get(i);
            if (str.equals(bVar.f25058c)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    private static double m10407j(String str, Pattern pattern) {
        return Double.parseDouble(m10391z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: k */
    private static C9798l.C9800b m10406k(String str, String str2, Map<String, String> map) {
        String u = m10396u(str, f38988J, NearbyManager.PERMISSION_DENIED, map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z = m10391z(str, f38989K, map);
            return new C9798l.C9800b(C6713c.f14280d, "video/mp4", Base64.decode(z.substring(z.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C9798l.C9800b(C6713c.f14280d, "hls", C7557q0.m22140l0(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !NearbyManager.PERMISSION_DENIED.equals(u)) {
                return null;
            }
            String z2 = m10391z(str, f38989K, map);
            byte[] decode = Base64.decode(z2.substring(z2.indexOf(44)), 0);
            UUID uuid = C6713c.f14281e;
            return new C9798l.C9800b(uuid, "video/mp4", C12993l.m4796a(uuid, decode));
        }
    }

    /* renamed from: l */
    private static String m10405l(String str) {
        if ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) {
            return "cenc";
        }
        return "cbcs";
    }

    /* renamed from: m */
    private static int m10404m(String str, Pattern pattern) {
        return Integer.parseInt(m10391z(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: n */
    private static long m10403n(String str, Pattern pattern) {
        return Long.parseLong(m10391z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* renamed from: o */
    private static C11217f m10402o(C11230b bVar, String str) {
        Uri uri;
        char c;
        String str2;
        String str3;
        int i;
        String str4;
        int i2;
        int i3;
        int i4;
        Uri uri2;
        String str5 = str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (bVar.m10390a()) {
                String b = bVar.m10389b();
                if (b.startsWith("#EXT")) {
                    arrayList8.add(b);
                }
                boolean startsWith = b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                if (b.startsWith("#EXT-X-DEFINE")) {
                    hashMap2.put(m10391z(b, f38994P, hashMap2), m10391z(b, f39003Y, hashMap2));
                } else {
                    if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                        hashMap = hashMap;
                        arrayList6 = arrayList6;
                        arrayList2 = arrayList2;
                        arrayList3 = arrayList3;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList8 = arrayList8;
                        arrayList7 = arrayList7;
                        z = true;
                    } else if (b.startsWith("#EXT-X-MEDIA")) {
                        arrayList6.add(b);
                    } else if (b.startsWith("#EXT-X-SESSION-KEY")) {
                        C9798l.C9800b k = m10406k(b, m10396u(b, f38987I, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, hashMap2), hashMap2);
                        if (k != null) {
                            arrayList7.add(new C9798l(m10405l(m10391z(b, f38986H, hashMap2)), k));
                        }
                    } else if (b.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = z2 | b.contains("CLOSED-CAPTIONS=NONE");
                        if (startsWith) {
                            i2 = Spliterator.SUBSIZED;
                            z2 = contains;
                        } else {
                            z2 = contains;
                            i2 = 0;
                        }
                        int m = m10404m(b, f25111h);
                        arrayList7 = arrayList7;
                        arrayList5 = arrayList5;
                        int s = m10398s(b, f25106c, -1);
                        String v = m10395v(b, f25113j, hashMap2);
                        arrayList8 = arrayList8;
                        String v2 = m10395v(b, f25114k, hashMap2);
                        if (v2 != null) {
                            arrayList4 = arrayList4;
                            String[] N0 = C7557q0.m22188N0(v2, "x");
                            int parseInt = Integer.parseInt(N0[0]);
                            i3 = Integer.parseInt(N0[1]);
                            if (parseInt <= 0 || i3 <= 0) {
                                i3 = -1;
                                i4 = -1;
                            } else {
                                i4 = parseInt;
                            }
                            arrayList3 = arrayList3;
                        } else {
                            arrayList4 = arrayList4;
                            arrayList3 = arrayList3;
                            i4 = -1;
                            i3 = -1;
                        }
                        String v3 = m10395v(b, f25115l, hashMap2);
                        float parseFloat = v3 != null ? Float.parseFloat(v3) : -1.0f;
                        arrayList2 = arrayList2;
                        String v4 = m10395v(b, f25107d, hashMap2);
                        arrayList6 = arrayList6;
                        String v5 = m10395v(b, f25108e, hashMap2);
                        String v6 = m10395v(b, f25109f, hashMap2);
                        String v7 = m10395v(b, f25110g, hashMap2);
                        if (startsWith) {
                            uri2 = C7548n0.m22233d(str5, m10391z(b, f38989K, hashMap2));
                        } else if (bVar.m10390a()) {
                            uri2 = C7548n0.m22233d(str5, m10417A(bVar.m10389b(), hashMap2));
                        } else {
                            throw new C6728o("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        arrayList.add(new C11217f.C11219b(uri2, new C6722k.C6724b().m24506R(arrayList.size()).m24513K(str6).m24515I(v).m24517G(s).m24498Z(m).m24478j0(i4).m24507Q(i3).m24508P(parseFloat).m24492c0(i2).m24519E(), v4, v5, v6, v7));
                        hashMap = hashMap;
                        ArrayList arrayList9 = (ArrayList) hashMap.get(uri2);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            hashMap.put(uri2, arrayList9);
                        }
                        arrayList9.add(new C10753r.C10755b(s, m, v4, v5, v6, v7));
                        z = z;
                    }
                    str5 = str;
                }
                hashMap = hashMap;
                arrayList6 = arrayList6;
                arrayList2 = arrayList2;
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                z = z;
                str5 = str;
            } else {
                ArrayList arrayList10 = arrayList6;
                ArrayList arrayList11 = arrayList2;
                ArrayList arrayList12 = arrayList3;
                ArrayList arrayList13 = arrayList4;
                ArrayList arrayList14 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i5 = 0;
                while (true) {
                    uri = null;
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C11217f.C11219b bVar2 = (C11217f.C11219b) arrayList.get(i5);
                    if (hashSet.add(bVar2.f25056a)) {
                        C7510a.m22366f(bVar2.f25057b.f14327t == null);
                        arrayList14.add(bVar2.m10427a(bVar2.f25057b.m24531a().m24500X(new C14576a(new C10753r(null, null, (List) C7510a.m22367e((ArrayList) hashMap.get(bVar2.f25056a))))).m24519E()));
                    }
                    i5++;
                }
                ArrayList arrayList15 = null;
                C6722k kVar = null;
                int i6 = 0;
                while (i6 < arrayList10.size()) {
                    String str7 = (String) arrayList10.get(i6);
                    String z3 = m10391z(str7, f38995Q, hashMap2);
                    String z4 = m10391z(str7, f38994P, hashMap2);
                    C6722k.C6724b V = new C6722k.C6724b().m24505S(z3 + ":" + z4).m24503U(z4).m24513K(str6).m24484g0(m10393x(str7)).m24492c0(m10394w(str7, hashMap2)).m24502V(m10395v(str7, f38993O, hashMap2));
                    String v8 = m10395v(str7, f38989K, hashMap2);
                    if (v8 != null) {
                        uri = C7548n0.m22233d(str, v8);
                    }
                    arrayList10 = arrayList10;
                    C14576a aVar = new C14576a(new C10753r(z3, z4, Collections.emptyList()));
                    String z5 = m10391z(str7, f38991M, hashMap2);
                    z5.hashCode();
                    switch (z5.hashCode()) {
                        case -959297733:
                            if (z5.equals("SUBTITLES")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -333210994:
                            if (z5.equals("CLOSED-CAPTIONS")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 62628790:
                            if (z5.equals("AUDIO")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 81665115:
                            if (z5.equals("VIDEO")) {
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
                            kVar = kVar;
                            arrayList12 = arrayList12;
                            arrayList11 = arrayList11;
                            C11217f.C11219b g = m10410g(arrayList, z3);
                            if (g != null) {
                                String K = C7557q0.m22195K(g.f25057b.f14326s, 3);
                                V.m24515I(K);
                                str2 = C7562u.m22081g(K);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            V.m24488e0(str2).m24500X(aVar);
                            if (uri == null) {
                                arrayList13 = arrayList13;
                                C7558r.m22104h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                arrayList13 = arrayList13;
                                arrayList13.add(new C11217f.C11218a(uri, V.m24519E(), z3, z4));
                                break;
                            }
                        case 1:
                            kVar = kVar;
                            arrayList12 = arrayList12;
                            arrayList11 = arrayList11;
                            String z6 = m10391z(str7, f38997S, hashMap2);
                            if (z6.startsWith("CC")) {
                                i = Integer.parseInt(z6.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                i = Integer.parseInt(z6.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList15 == null) {
                                arrayList15 = new ArrayList();
                            }
                            V.m24488e0(str3).m24518F(i);
                            arrayList15.add(V.m24519E());
                            arrayList13 = arrayList13;
                            break;
                        case 2:
                            arrayList11 = arrayList11;
                            C11217f.C11219b f = m10411f(arrayList, z3);
                            if (f != null) {
                                kVar = kVar;
                                String K2 = C7557q0.m22195K(f.f25057b.f14326s, 1);
                                V.m24515I(K2);
                                str4 = C7562u.m22081g(K2);
                            } else {
                                kVar = kVar;
                                str4 = null;
                            }
                            String v9 = m10395v(str7, f25112i, hashMap2);
                            if (v9 != null) {
                                V.m24516H(Integer.parseInt(C7557q0.m22186O0(v9, "/")[0]));
                                if ("audio/eac3".equals(str4) && v9.endsWith("/JOC")) {
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            V.m24488e0(str4);
                            if (uri != null) {
                                V.m24500X(aVar);
                                arrayList12 = arrayList12;
                                arrayList12.add(new C11217f.C11218a(uri, V.m24519E(), z3, z4));
                            } else {
                                arrayList12 = arrayList12;
                                if (f != null) {
                                    kVar = V.m24519E();
                                }
                            }
                            arrayList13 = arrayList13;
                            break;
                        case 3:
                            C11217f.C11219b h = m10409h(arrayList, z3);
                            if (h != null) {
                                C6722k kVar2 = h.f25057b;
                                String K3 = C7557q0.m22195K(kVar2.f14326s, 2);
                                V.m24515I(K3).m24488e0(C7562u.m22081g(K3)).m24478j0(kVar2.f37961A).m24507Q(kVar2.f37962B).m24508P(kVar2.f37963C);
                            }
                            if (uri != null) {
                                V.m24500X(aVar);
                                arrayList11 = arrayList11;
                                arrayList11.add(new C11217f.C11218a(uri, V.m24519E(), z3, z4));
                                kVar = kVar;
                                arrayList13 = arrayList13;
                                arrayList12 = arrayList12;
                                break;
                            }
                        default:
                            kVar = kVar;
                            arrayList13 = arrayList13;
                            arrayList12 = arrayList12;
                            arrayList11 = arrayList11;
                            break;
                    }
                    i6++;
                    str6 = str6;
                    uri = null;
                }
                return new C11217f(str, arrayList8, arrayList14, arrayList11, arrayList12, arrayList13, arrayList5, kVar, z2 ? Collections.emptyList() : arrayList15, z, hashMap2, arrayList7);
            }
        }
    }

    /* renamed from: p */
    private static C11220g m10401p(C11217f fVar, C11220g gVar, C11230b bVar, String str) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        boolean z4;
        C9798l lVar;
        C11220g.C11224d dVar;
        boolean z5;
        long j;
        C11217f fVar2 = fVar;
        C11220g gVar2 = gVar;
        boolean z6 = fVar2.f25104c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        C11220g.C11226f fVar3 = new C11220g.C11226f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z7 = false;
        String str2 = "";
        boolean z8 = z6;
        C11220g.C11226f fVar4 = fVar3;
        boolean z9 = false;
        int i = 0;
        int i2 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i3 = 0;
        boolean z12 = false;
        String str3 = str2;
        long j2 = -9223372036854775807L;
        long j3 = 0;
        long j4 = 0;
        int i4 = 1;
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        C9798l lVar2 = null;
        long j7 = 0;
        C9798l lVar3 = null;
        long j8 = 0;
        C11220g.C11222b bVar2 = null;
        String str4 = null;
        long j9 = -1;
        String str5 = null;
        String str6 = null;
        long j10 = 0;
        long j11 = 0;
        C11220g.C11224d dVar2 = null;
        long j12 = 0;
        long j13 = 0;
        while (bVar.m10390a()) {
            String b = bVar.m10389b();
            if (b.startsWith("#EXT")) {
                arrayList4.add(b);
            }
            if (b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z13 = m10391z(b, f25120q, hashMap);
                if ("VOD".equals(z13)) {
                    i = 1;
                } else if ("EVENT".equals(z13)) {
                    i = 2;
                }
            } else if (b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z12 = true;
            } else if (b.startsWith("#EXT-X-START")) {
                j2 = (long) (m10407j(b, f38981C) * 1000000.0d);
            } else if (b.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar4 = m10392y(b);
            } else if (b.startsWith("#EXT-X-PART-INF")) {
                j6 = (long) (m10407j(b, f25118o) * 1000000.0d);
            } else if (b.startsWith("#EXT-X-MAP")) {
                String z14 = m10391z(b, f38989K, hashMap);
                String v = m10395v(b, f38983E, hashMap);
                if (v != null) {
                    String[] N0 = C7557q0.m22188N0(v, "@");
                    char c = z7 ? 1 : 0;
                    char c2 = z7 ? 1 : 0;
                    char c3 = z7 ? 1 : 0;
                    char c4 = z7 ? 1 : 0;
                    char c5 = z7 ? 1 : 0;
                    char c6 = z7 ? 1 : 0;
                    char c7 = z7 ? 1 : 0;
                    char c8 = z7 ? 1 : 0;
                    char c9 = z7 ? 1 : 0;
                    char c10 = z7 ? 1 : 0;
                    char c11 = z7 ? 1 : 0;
                    char c12 = z7 ? 1 : 0;
                    char c13 = z7 ? 1 : 0;
                    char c14 = z7 ? 1 : 0;
                    char c15 = z7 ? 1 : 0;
                    char c16 = z7 ? 1 : 0;
                    char c17 = z7 ? 1 : 0;
                    char c18 = z7 ? 1 : 0;
                    char c19 = z7 ? 1 : 0;
                    char c20 = z7 ? 1 : 0;
                    j9 = Long.parseLong(N0[c]);
                    if (N0.length > 1) {
                        j7 = Long.parseLong(N0[1]);
                    }
                }
                int i5 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                if (i5 == 0) {
                    j7 = 0;
                }
                if (str4 == null || str5 != null) {
                    dVar2 = new C11220g.C11224d(z14, j7, j9, str4, str5);
                    if (i5 != 0) {
                        j7 += j9;
                    }
                    str5 = str5;
                    str4 = str4;
                    j9 = -1;
                } else {
                    throw new C6728o("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                }
            } else {
                str4 = str4;
                if (b.startsWith("#EXT-X-TARGETDURATION")) {
                    j5 = 1000000 * m10404m(b, f25116m);
                } else if (b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                    j11 = m10403n(b, f25127x);
                    str4 = str4;
                    j4 = j11;
                    str5 = str5;
                    z7 = false;
                } else if (b.startsWith("#EXT-X-VERSION")) {
                    i4 = m10404m(b, f25119p);
                } else {
                    if (b.startsWith("#EXT-X-DEFINE")) {
                        String v2 = m10395v(b, f39004Z, hashMap);
                        if (v2 != null) {
                            String str7 = fVar2.f25050l.get(v2);
                            if (str7 != null) {
                                hashMap.put(v2, str7);
                            }
                        } else {
                            hashMap.put(m10391z(b, f38994P, hashMap), m10391z(b, f39003Y, hashMap));
                        }
                        arrayList4 = arrayList4;
                        str2 = str2;
                        hashMap3 = hashMap3;
                        bVar2 = bVar2;
                        str6 = str6;
                    } else if (b.startsWith("#EXTINF")) {
                        j12 = (long) (m10407j(b, f25128y) * 1000000.0d);
                        str3 = m10396u(b, f25129z, str2, hashMap);
                        fVar2 = fVar;
                    } else {
                        if (b.startsWith("#EXT-X-SKIP")) {
                            int m = m10404m(b, f25123t);
                            C7510a.m22366f(gVar2 != null && arrayList2.isEmpty());
                            int i6 = (int) (j4 - ((C11220g) C7557q0.m22145j(gVar)).f25067i);
                            int i7 = m + i6;
                            if (i6 < 0 || i7 > gVar2.f25074p.size()) {
                                throw new C11229a();
                            }
                            long j14 = j10;
                            str5 = str5;
                            while (i6 < i7) {
                                C11220g.C11224d dVar3 = gVar2.f25074p.get(i6);
                                if (j4 != gVar2.f25067i) {
                                    dVar3 = dVar3.m10419b(j14, (gVar2.f25066h - i2) + dVar3.f25089n);
                                }
                                arrayList2.add(dVar3);
                                j14 += dVar3.f25088m;
                                long j15 = dVar3.f25095t;
                                if (j15 != -1) {
                                    j7 = dVar3.f25094s + j15;
                                }
                                int i8 = dVar3.f25089n;
                                C11220g.C11224d dVar4 = dVar3.f25087l;
                                C9798l lVar4 = dVar3.f25091p;
                                String str8 = dVar3.f25092q;
                                String str9 = dVar3.f25093r;
                                if (str9 == null || !str9.equals(Long.toHexString(j11))) {
                                    str5 = dVar3.f25093r;
                                }
                                j11++;
                                i6++;
                                gVar2 = gVar;
                                j8 = j14;
                                i3 = i8;
                                i7 = i7;
                                dVar2 = dVar4;
                                lVar3 = lVar4;
                                str4 = str8;
                                hashMap3 = hashMap3;
                            }
                            fVar2 = fVar;
                            gVar2 = gVar;
                            j10 = j14;
                            str2 = str2;
                        } else {
                            str2 = str2;
                            hashMap3 = hashMap3;
                            if (b.startsWith("#EXT-X-KEY")) {
                                String z15 = m10391z(b, f38986H, hashMap);
                                String u = m10396u(b, f38987I, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, hashMap);
                                if ("NONE".equals(z15)) {
                                    treeMap.clear();
                                    str4 = null;
                                    lVar3 = null;
                                    str5 = null;
                                } else {
                                    String v3 = m10395v(b, f38990L, hashMap);
                                    if (InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY.equals(u)) {
                                        if ("AES-128".equals(z15)) {
                                            str4 = m10391z(b, f38989K, hashMap);
                                            str5 = v3;
                                        }
                                        str5 = v3;
                                        str4 = null;
                                    } else {
                                        str6 = str6 == null ? m10405l(z15) : str6;
                                        C9798l.C9800b k = m10406k(b, u, hashMap);
                                        if (k != null) {
                                            treeMap.put(u, k);
                                            str5 = v3;
                                            str4 = null;
                                            lVar3 = null;
                                        }
                                        str5 = v3;
                                        str4 = null;
                                    }
                                }
                                gVar2 = gVar;
                                str2 = str2;
                                hashMap3 = hashMap3;
                                z7 = false;
                                fVar2 = fVar;
                            } else {
                                str6 = str6;
                                if (b.startsWith("#EXT-X-BYTERANGE")) {
                                    String[] N02 = C7557q0.m22188N0(m10391z(b, f38982D, hashMap), "@");
                                    j9 = Long.parseLong(N02[0]);
                                    if (N02.length > 1) {
                                        j7 = Long.parseLong(N02[1]);
                                    }
                                } else if (b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i2 = Integer.parseInt(b.substring(b.indexOf(58) + 1));
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    str6 = str6;
                                    str4 = str4;
                                    str5 = str5;
                                    str2 = str2;
                                    hashMap3 = hashMap3;
                                    z9 = true;
                                } else if (b.equals("#EXT-X-DISCONTINUITY")) {
                                    i3++;
                                } else if (b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (j3 == 0) {
                                        j3 = C6713c.m24566c(C7557q0.m22208D0(b.substring(b.indexOf(58) + 1))) - j10;
                                    } else {
                                        arrayList4 = arrayList4;
                                        bVar2 = bVar2;
                                    }
                                } else if (b.equals("#EXT-X-GAP")) {
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    str6 = str6;
                                    str4 = str4;
                                    str5 = str5;
                                    str2 = str2;
                                    hashMap3 = hashMap3;
                                    z7 = false;
                                    z11 = true;
                                } else if (b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    str6 = str6;
                                    str4 = str4;
                                    str5 = str5;
                                    str2 = str2;
                                    hashMap3 = hashMap3;
                                    z7 = false;
                                    z8 = true;
                                } else if (b.equals("#EXT-X-ENDLIST")) {
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    str6 = str6;
                                    str4 = str4;
                                    str5 = str5;
                                    str2 = str2;
                                    hashMap3 = hashMap3;
                                    z7 = false;
                                    z10 = true;
                                } else if (b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long t = m10397t(b, f38979A, (j4 + arrayList2.size()) - (arrayList3.isEmpty() ? 1L : 0L));
                                    int s = m10398s(b, f38980B, j6 != -9223372036854775807L ? (arrayList3.isEmpty() ? ((C11220g.C11224d) C3976z0.m33215c(arrayList2)).f25085w : arrayList3).size() - 1 : -1);
                                    Uri parse = Uri.parse(C7548n0.m22234c(str, m10391z(b, f38989K, hashMap)));
                                    hashMap3.put(parse, new C11220g.C11223c(parse, t, s));
                                    arrayList4 = arrayList4;
                                    bVar2 = bVar2;
                                    j11 = j11;
                                    str5 = str5;
                                    z4 = false;
                                    z9 = z9;
                                    z3 = z4;
                                    str4 = str4;
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    z2 = z3;
                                    z7 = z2;
                                } else {
                                    if (!b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                        hashMap3 = hashMap3;
                                        bVar2 = bVar2;
                                        str5 = str5;
                                        z9 = z9;
                                        if (b.startsWith("#EXT-X-PART")) {
                                            String e = m10412e(j11, str4, str5);
                                            String z16 = m10391z(b, f38989K, hashMap);
                                            long j16 = (long) (m10407j(b, f25117n) * 1000000.0d);
                                            boolean q = m10400q(b, f39001W, false) | (z8 && arrayList3.isEmpty());
                                            boolean q2 = m10400q(b, f39002X, false);
                                            String v4 = m10395v(b, f38983E, hashMap);
                                            if (v4 != null) {
                                                String[] N03 = C7557q0.m22188N0(v4, "@");
                                                j = Long.parseLong(N03[0]);
                                                if (N03.length > 1) {
                                                    j13 = Long.parseLong(N03[1]);
                                                }
                                            } else {
                                                j = -1;
                                            }
                                            int i9 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                                            if (i9 == 0) {
                                                j13 = 0;
                                            }
                                            if (lVar3 == null && !treeMap.isEmpty()) {
                                                C9798l.C9800b[] bVarArr = (C9798l.C9800b[]) treeMap.values().toArray(new C9798l.C9800b[0]);
                                                C9798l lVar5 = new C9798l(str6, bVarArr);
                                                if (lVar2 == null) {
                                                    lVar2 = m10413d(str6, bVarArr);
                                                }
                                                lVar3 = lVar5;
                                            }
                                            arrayList3.add(new C11220g.C11222b(z16, dVar2, j16, i3, j8, lVar3, str4, e, j13, j, q2, q, false));
                                            j8 += j16;
                                            if (i9 != 0) {
                                                j13 += j;
                                            }
                                            fVar2 = fVar;
                                            gVar2 = gVar;
                                            str6 = str6;
                                            str4 = str4;
                                            j11 = j11;
                                            z9 = z9;
                                            arrayList4 = arrayList4;
                                            z2 = false;
                                            z7 = z2;
                                        } else {
                                            arrayList4 = arrayList4;
                                            if (!b.startsWith("#")) {
                                                String e2 = m10412e(j11, str4, str5);
                                                j11++;
                                                String A = m10417A(b, hashMap);
                                                C11220g.C11224d dVar5 = (C11220g.C11224d) hashMap2.get(A);
                                                int i10 = (j9 > (-1L) ? 1 : (j9 == (-1L) ? 0 : -1));
                                                if (i10 == 0) {
                                                    j7 = 0;
                                                } else {
                                                    if (z12 && dVar2 == null && dVar5 == null) {
                                                        dVar5 = new C11220g.C11224d(A, 0L, j7, null, null);
                                                        hashMap2.put(A, dVar5);
                                                    }
                                                    j7 = j7;
                                                }
                                                if (lVar3 != null || treeMap.isEmpty()) {
                                                    dVar = dVar5;
                                                    z5 = false;
                                                    lVar = lVar3;
                                                } else {
                                                    dVar = dVar5;
                                                    z5 = false;
                                                    z5 = false;
                                                    C9798l.C9800b[] bVarArr2 = (C9798l.C9800b[]) treeMap.values().toArray(new C9798l.C9800b[0]);
                                                    lVar = new C9798l(str6, bVarArr2);
                                                    if (lVar2 == null) {
                                                        lVar2 = m10413d(str6, bVarArr2);
                                                    }
                                                }
                                                if (dVar2 != null) {
                                                    dVar = dVar2;
                                                }
                                                arrayList2.add(new C11220g.C11224d(A, dVar, str3, j12, i3, j10, lVar, str4, e2, j7, j9, z11, arrayList3));
                                                j8 = j10 + j12;
                                                arrayList3 = new ArrayList();
                                                if (i10 != 0) {
                                                    j7 += j9;
                                                }
                                                fVar2 = fVar;
                                                gVar2 = gVar;
                                                str6 = str6;
                                                lVar3 = lVar;
                                                boolean z17 = z5 ? 1 : 0;
                                                boolean z18 = z5 ? 1 : 0;
                                                boolean z19 = z5 ? 1 : 0;
                                                z11 = z17;
                                                str4 = str4;
                                                j10 = j8;
                                                z9 = z9;
                                                j9 = -1;
                                                arrayList4 = arrayList4;
                                                str3 = str2;
                                                j12 = 0;
                                                bVar2 = bVar2;
                                                str5 = str5;
                                                str2 = str3;
                                                z7 = z5;
                                            } else {
                                                j11 = j11;
                                            }
                                        }
                                    } else if (bVar2 == null && "PART".equals(m10391z(b, f38992N, hashMap))) {
                                        String z20 = m10391z(b, f38989K, hashMap);
                                        long t2 = m10397t(b, f38984F, -1L);
                                        long t3 = m10397t(b, f38985G, -1L);
                                        String e3 = m10412e(j11, str4, str5);
                                        if (lVar3 != null || treeMap.isEmpty()) {
                                            str5 = str5;
                                        } else {
                                            str5 = str5;
                                            C9798l.C9800b[] bVarArr3 = (C9798l.C9800b[]) treeMap.values().toArray(new C9798l.C9800b[0]);
                                            C9798l lVar6 = new C9798l(str6, bVarArr3);
                                            if (lVar2 == null) {
                                                lVar2 = m10413d(str6, bVarArr3);
                                            }
                                            lVar3 = lVar6;
                                        }
                                        int i11 = (t2 > (-1L) ? 1 : (t2 == (-1L) ? 0 : -1));
                                        if (i11 == 0 || t3 != -1) {
                                            bVar2 = new C11220g.C11222b(z20, dVar2, 0L, i3, j8, lVar3, str4, e3, i11 != 0 ? t2 : 0L, t3, false, false, true);
                                        } else {
                                            bVar2 = bVar2;
                                        }
                                        j11 = j11;
                                        str6 = str6;
                                        str4 = str4;
                                        str2 = str2;
                                        hashMap3 = hashMap3;
                                        z7 = false;
                                        fVar2 = fVar;
                                        gVar2 = gVar;
                                    } else {
                                        hashMap3 = hashMap3;
                                        bVar2 = bVar2;
                                        z9 = z9;
                                        arrayList4 = arrayList4;
                                        j11 = j11;
                                        str5 = str5;
                                    }
                                    z3 = false;
                                    str4 = str4;
                                    fVar2 = fVar;
                                    gVar2 = gVar;
                                    z2 = z3;
                                    z7 = z2;
                                }
                                fVar2 = fVar;
                                gVar2 = gVar;
                                str6 = str6;
                                str4 = str4;
                                str5 = str5;
                                str2 = str2;
                                hashMap3 = hashMap3;
                            }
                        }
                        z7 = false;
                    }
                    j11 = j11;
                    str5 = str5;
                    z4 = false;
                    z9 = z9;
                    z3 = z4;
                    str4 = str4;
                    fVar2 = fVar;
                    gVar2 = gVar;
                    z2 = z3;
                    z7 = z2;
                }
                str4 = str4;
                str5 = str5;
                z7 = false;
            }
        }
        if (bVar2 != null) {
            arrayList3.add(bVar2);
        }
        if (j3 != 0) {
            arrayList = arrayList3;
            z = true;
        } else {
            arrayList = arrayList3;
            boolean z21 = z7 ? 1 : 0;
            boolean z22 = z7 ? 1 : 0;
            boolean z23 = z7 ? 1 : 0;
            boolean z24 = z7 ? 1 : 0;
            boolean z25 = z7 ? 1 : 0;
            boolean z26 = z7 ? 1 : 0;
            boolean z27 = z7 ? 1 : 0;
            boolean z28 = z7 ? 1 : 0;
            boolean z29 = z7 ? 1 : 0;
            boolean z30 = z7 ? 1 : 0;
            boolean z31 = z7 ? 1 : 0;
            boolean z32 = z7 ? 1 : 0;
            boolean z33 = z7 ? 1 : 0;
            boolean z34 = z7 ? 1 : 0;
            boolean z35 = z7 ? 1 : 0;
            boolean z36 = z7 ? 1 : 0;
            z = z21;
        }
        return new C11220g(i, str, arrayList4, j2, j3, z9, i2, j4, i4, j5, j6, z8, z10, z, lVar2, arrayList2, arrayList, fVar4, hashMap3);
    }

    /* renamed from: q */
    private static boolean m10400q(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return z;
    }

    /* renamed from: r */
    private static double m10399r(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Double.parseDouble((String) C7510a.m22367e(matcher.group(1)));
        }
        return d;
    }

    /* renamed from: s */
    private static int m10398s(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt((String) C7510a.m22367e(matcher.group(1)));
        }
        return i;
    }

    /* renamed from: t */
    private static long m10397t(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Long.parseLong((String) C7510a.m22367e(matcher.group(1)));
        }
        return j;
    }

    /* renamed from: u */
    private static String m10396u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) C7510a.m22367e(matcher.group(1));
        }
        if (map.isEmpty() || str2 == null) {
            return str2;
        }
        return m10417A(str2, map);
    }

    /* renamed from: v */
    private static String m10395v(String str, Pattern pattern, Map<String, String> map) {
        return m10396u(str, pattern, null, map);
    }

    /* renamed from: w */
    private static int m10394w(String str, Map<String, String> map) {
        String v = m10395v(str, f38996R, map);
        int i = 0;
        if (TextUtils.isEmpty(v)) {
            return 0;
        }
        String[] N0 = C7557q0.m22188N0(v, ",");
        if (C7557q0.m22125t(N0, "public.accessibility.describes-video")) {
            i = 512;
        }
        if (C7557q0.m22125t(N0, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (C7557q0.m22125t(N0, "public.accessibility.describes-music-and-sound")) {
            i |= Spliterator.IMMUTABLE;
        }
        if (C7557q0.m22125t(N0, "public.easy-to-read")) {
            return i | 8192;
        }
        return i;
    }

    /* renamed from: x */
    private static int m10393x(String str) {
        boolean q = m10400q(str, f38999U, false);
        if (m10400q(str, f39000V, false)) {
            q = (q ? 1 : 0) | true;
        }
        if (!m10400q(str, f38998T, false)) {
            int i = q ? 1 : 0;
            int i2 = q ? 1 : 0;
            int i3 = q ? 1 : 0;
            return i;
        }
        int i4 = q ? 1 : 0;
        char c = q ? 1 : 0;
        return i4 | 4;
    }

    /* renamed from: y */
    private static C11220g.C11226f m10392y(String str) {
        long j;
        long j2;
        double r = m10399r(str, f25121r, -9.223372036854776E18d);
        long j3 = -9223372036854775807L;
        if (r == -9.223372036854776E18d) {
            j = -9223372036854775807L;
        } else {
            j = (long) (r * 1000000.0d);
        }
        boolean q = m10400q(str, f25122s, false);
        double r2 = m10399r(str, f25124u, -9.223372036854776E18d);
        if (r2 == -9.223372036854776E18d) {
            j2 = -9223372036854775807L;
        } else {
            j2 = (long) (r2 * 1000000.0d);
        }
        double r3 = m10399r(str, f25125v, -9.223372036854776E18d);
        if (r3 != -9.223372036854776E18d) {
            j3 = (long) (r3 * 1000000.0d);
        }
        return new C11220g.C11226f(j, q, j2, j3, m10400q(str, f25126w, false));
    }

    /* renamed from: z */
    private static String m10391z(String str, Pattern pattern, Map<String, String> map) {
        String v = m10395v(str, pattern, map);
        if (v != null) {
            return v;
        }
        throw new C6728o("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: i */
    public AbstractC11227h mo7921a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (m10415b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                }
                                arrayDeque.add(trim);
                            } else {
                                arrayDeque.add(trim);
                                return m10402o(new C11230b(arrayDeque, bufferedReader), uri.toString());
                            }
                        }
                    } else {
                        C7557q0.m22135o(bufferedReader);
                        throw new C6728o("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return m10401p(this.f25130a, this.f25131b, new C11230b(arrayDeque, bufferedReader), uri.toString());
            }
            throw new C8305v0("Input does not start with the #EXTM3U header.", uri);
        } finally {
            C7557q0.m22135o(bufferedReader);
        }
    }

    public C11228i(C11217f fVar, C11220g gVar) {
        this.f25130a = fVar;
        this.f25131b = gVar;
    }
}
