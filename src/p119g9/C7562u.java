package p119g9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import p117g7.C7423a;

/* renamed from: g9.u */
/* loaded from: classes5.dex */
public final class C7562u {

    /* renamed from: a */
    private static final ArrayList<C7563a> f16387a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f16388b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g9.u$a */
    /* loaded from: classes5.dex */
    public static final class C7563a {

        /* renamed from: a */
        public final String f16389a;

        /* renamed from: b */
        public final String f16390b;

        /* renamed from: c */
        public final int f16391c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g9.u$b */
    /* loaded from: classes5.dex */
    public static final class C7564b {

        /* renamed from: a */
        public final int f16392a;

        /* renamed from: b */
        public final int f16393b;

        public C7564b(int i, int i2) {
            this.f16392a = i;
            this.f16393b = i2;
        }
    }

    /* renamed from: a */
    public static boolean m22087a(String str, String str2) {
        C7564b i;
        int d;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (i = m22079i(str2)) == null || (d = C7423a.m22703d(i.f16393b)) == 0 || d == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m22086b(String str, String str2) {
        return m22084d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m22085c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C7557q0.m22184P0(str)) {
            String g = m22081g(str2);
            if (g != null && m22072p(g)) {
                return g;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m22084d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] P0 = C7557q0.m22184P0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : P0) {
            if (str2.equals(m22081g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: e */
    private static String m22083e(String str) {
        int size = f16387a.size();
        for (int i = 0; i < size; i++) {
            C7563a aVar = f16387a.get(i);
            if (str.startsWith(aVar.f16390b)) {
                return aVar.f16389a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m22082f(String str, String str2) {
        C7564b i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i = m22079i(str2)) == null) {
                    return 0;
                }
                return C7423a.m22703d(i.f16393b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m22081g(String str) {
        C7564b i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String U0 = C7557q0.m22174U0(str.trim());
        if (U0.startsWith("avc1") || U0.startsWith("avc3")) {
            return "video/avc";
        }
        if (U0.startsWith("hev1") || U0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (U0.startsWith("dvav") || U0.startsWith("dva1") || U0.startsWith("dvhe") || U0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (U0.startsWith("av01")) {
            return "video/av01";
        }
        if (U0.startsWith("vp9") || U0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (U0.startsWith("vp8") || U0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (U0.startsWith("mp4a")) {
            if (U0.startsWith("mp4a.") && (i = m22079i(U0)) != null) {
                str2 = m22080h(i.f16392a);
            }
            if (str2 == null) {
                return "audio/mp4a-latm";
            }
            return str2;
        } else if (U0.startsWith("ac-3") || U0.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (U0.startsWith("ec-3") || U0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (U0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (U0.startsWith("ac-4") || U0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (U0.startsWith("dtsc") || U0.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (U0.startsWith("dtsh") || U0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (U0.startsWith("opus")) {
                return "audio/opus";
            }
            if (U0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (U0.startsWith("flac")) {
                return "audio/flac";
            }
            if (U0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (U0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (U0.contains("cea708")) {
                return "application/cea-708";
            }
            if (U0.contains("eia608") || U0.contains("cea608")) {
                return "application/cea-608";
            }
            return m22083e(U0);
        }
    }

    /* renamed from: h */
    public static String m22080h(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: i */
    static C7564b m22079i(String str) {
        int i;
        Matcher matcher = f16388b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C7510a.m22367e(matcher.group(1));
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            } else {
                i = 0;
            }
            return new C7564b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m22078j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C7557q0.m22184P0(str)) {
            String g = m22081g(str2);
            if (g != null && m22070r(g)) {
                return g;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static String m22077k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: l */
    public static int m22076l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m22072p(str)) {
            return 1;
        }
        if (m22069s(str)) {
            return 2;
        }
        if (m22070r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m22075m(str);
    }

    /* renamed from: m */
    private static int m22075m(String str) {
        int size = f16387a.size();
        for (int i = 0; i < size; i++) {
            C7563a aVar = f16387a.get(i);
            if (str.equals(aVar.f16389a)) {
                return aVar.f16391c;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public static int m22074n(String str) {
        return m22076l(m22081g(str));
    }

    /* renamed from: o */
    public static String m22073o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C7557q0.m22184P0(str)) {
            String g = m22081g(str2);
            if (g != null && m22069s(g)) {
                return g;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static boolean m22072p(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(m22077k(str));
    }

    /* renamed from: q */
    public static boolean m22071q(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m22070r(String str) {
        if ("text".equals(m22077k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m22069s(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(m22077k(str));
    }

    /* renamed from: t */
    public static String m22068t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
