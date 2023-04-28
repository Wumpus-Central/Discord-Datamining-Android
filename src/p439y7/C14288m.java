package p439y7;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p152i7.C8225i;
import p163j$.util.Spliterator;

/* renamed from: y7.m */
/* loaded from: classes7.dex */
public final class C14288m {

    /* renamed from: a */
    public final String f32304a;

    /* renamed from: b */
    public final String f32305b;

    /* renamed from: c */
    public final String f32306c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f32307d;

    /* renamed from: e */
    public final boolean f32308e;

    /* renamed from: f */
    public final boolean f32309f;

    /* renamed from: g */
    public final boolean f32310g;

    /* renamed from: h */
    public final boolean f32311h;

    /* renamed from: i */
    public final boolean f32312i;

    /* renamed from: j */
    public final boolean f32313j;

    /* renamed from: k */
    private final boolean f32314k;

    C14288m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f32304a = (String) C7510a.m22367e(str);
        this.f32305b = str2;
        this.f32306c = str3;
        this.f32307d = codecCapabilities;
        this.f32311h = z;
        this.f32312i = z2;
        this.f32313j = z3;
        this.f32308e = z4;
        this.f32309f = z5;
        this.f32310g = z6;
        this.f32314k = C7562u.m22069s(str2);
    }

    /* renamed from: A */
    public static C14288m m1130A(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (z4 || codecCapabilities == null || !m1122h(codecCapabilities) || m1105y(str)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (codecCapabilities == null || !m1112r(codecCapabilities)) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z5 || (codecCapabilities != null && m1114p(codecCapabilities))) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new C14288m(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    /* renamed from: a */
    private static int m1129a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((C7557q0.f16368a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else if ("audio/eac3".equals(str2)) {
            i2 = 16;
        } else {
            i2 = 30;
        }
        C7558r.m22104h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: c */
    private static Point m1127c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C7557q0.m22141l(i, widthAlignment) * widthAlignment, C7557q0.m22141l(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    private static boolean m1126d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = m1127c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: f */
    private static MediaCodecInfo.CodecProfileLevel[] m1124f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            i = 0;
        } else {
            i = videoCapabilities.getBitrateRange().getUpper().intValue();
        }
        if (i >= 180000000) {
            i2 = Spliterator.IMMUTABLE;
        } else if (i >= 120000000) {
            i2 = 512;
        } else if (i >= 60000000) {
            i2 = Spliterator.NONNULL;
        } else if (i >= 30000000) {
            i2 = 128;
        } else if (i >= 18000000) {
            i2 = 64;
        } else if (i >= 12000000) {
            i2 = 32;
        } else if (i >= 7200000) {
            i2 = 16;
        } else if (i >= 3600000) {
            i2 = 8;
        } else if (i >= 1800000) {
            i2 = 4;
        } else if (i >= 800000) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* renamed from: h */
    private static boolean m1122h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7557q0.f16368a >= 19 && m1121i(codecCapabilities);
    }

    /* renamed from: i */
    private static boolean m1121i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: p */
    private static boolean m1114p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7557q0.f16368a >= 21 && m1113q(codecCapabilities);
    }

    /* renamed from: q */
    private static boolean m1113q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: r */
    private static boolean m1112r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C7557q0.f16368a >= 21 && m1111s(codecCapabilities);
    }

    /* renamed from: s */
    private static boolean m1111s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: u */
    private void m1109u(String str) {
        C7558r.m22110b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f32304a + ", " + this.f32305b + "] [" + C7557q0.f16372e + "]");
    }

    /* renamed from: v */
    private void m1108v(String str) {
        C7558r.m22110b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f32304a + ", " + this.f32305b + "] [" + C7557q0.f16372e + "]");
    }

    /* renamed from: w */
    private static boolean m1107w(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: x */
    private static boolean m1106x(String str) {
        return C7557q0.f16371d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: y */
    private static boolean m1105y(String str) {
        if (C7557q0.f16368a <= 22) {
            String str2 = C7557q0.f16371d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private static final boolean m1104z(String str) {
        if (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(C7557q0.f16369b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Point m1128b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32307d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m1127c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public C8225i m1125e(C6722k kVar, C6722k kVar2) {
        int i;
        int i2;
        if (!C7557q0.m22159c(kVar.f14329v, kVar2.f14329v)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f32314k) {
            if (kVar.f37964D != kVar2.f37964D) {
                i |= Spliterator.IMMUTABLE;
            }
            if (!this.f32308e && !(kVar.f37961A == kVar2.f37961A && kVar.f37962B == kVar2.f37962B)) {
                i |= 512;
            }
            if (!C7557q0.m22159c(kVar.f37968H, kVar2.f37968H)) {
                i |= RecyclerView.ItemAnimator.FLAG_MOVED;
            }
            if (m1106x(this.f32304a) && !kVar.m24527i(kVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str = this.f32304a;
                if (kVar.m24527i(kVar2)) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                return new C8225i(str, kVar, kVar2, i2, 0);
            }
        } else {
            if (kVar.f37969I != kVar2.f37969I) {
                i |= 4096;
            }
            if (kVar.f37970J != kVar2.f37970J) {
                i |= 8192;
            }
            if (kVar.f37971K != kVar2.f37971K) {
                i |= Spliterator.SUBSIZED;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f32305b)) {
                Pair<Integer, Integer> p = C14300x.m979p(kVar);
                Pair<Integer, Integer> p2 = C14300x.m979p(kVar2);
                if (!(p == null || p2 == null)) {
                    int intValue = ((Integer) p.first).intValue();
                    int intValue2 = ((Integer) p2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C8225i(this.f32304a, kVar, kVar2, 3, 0);
                    }
                }
            }
            if (!kVar.m24527i(kVar2)) {
                i |= 32;
            }
            if (m1107w(this.f32305b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C8225i(this.f32304a, kVar, kVar2, 1, 0);
            }
        }
        return new C8225i(this.f32304a, kVar, kVar2, 0, i);
    }

    /* renamed from: g */
    public MediaCodecInfo.CodecProfileLevel[] m1123g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32307d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: j */
    public boolean m1120j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32307d;
        if (codecCapabilities == null) {
            m1108v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m1108v("channelCount.aCaps");
            return false;
        } else if (m1129a(this.f32304a, this.f32305b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            m1108v("channelCount.support, " + i);
            return false;
        }
    }

    /* renamed from: k */
    public boolean m1119k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32307d;
        if (codecCapabilities == null) {
            m1108v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m1108v("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m1108v("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: l */
    public boolean m1118l(C6722k kVar) {
        String g;
        String str = kVar.f14326s;
        if (str == null || this.f32305b == null || (g = C7562u.m22081g(str)) == null) {
            return true;
        }
        if (!this.f32305b.equals(g)) {
            m1108v("codec.mime " + kVar.f14326s + ", " + g);
            return false;
        }
        Pair<Integer, Integer> p = C14300x.m979p(kVar);
        if (p == null) {
            return true;
        }
        int intValue = ((Integer) p.first).intValue();
        int intValue2 = ((Integer) p.second).intValue();
        if (!(this.f32314k || intValue == 42)) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g2 = m1123g();
        if (C7557q0.f16368a <= 23 && "video/x-vnd.on2.vp9".equals(this.f32305b) && g2.length == 0) {
            g2 = m1124f(this.f32307d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g2) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2) {
                return true;
            }
        }
        m1108v("codec.profileLevel, " + kVar.f14326s + ", " + g);
        return false;
    }

    /* renamed from: m */
    public boolean m1117m(C6722k kVar) {
        int i;
        boolean z = false;
        if (!m1118l(kVar)) {
            return false;
        }
        if (this.f32314k) {
            int i2 = kVar.f37961A;
            if (i2 <= 0 || (i = kVar.f37962B) <= 0) {
                return true;
            }
            if (C7557q0.f16368a >= 21) {
                return m1110t(i2, i, kVar.f37963C);
            }
            if (i2 * i <= C14300x.m999M()) {
                z = true;
            }
            if (!z) {
                m1108v("legacyFrameSize, " + kVar.f37961A + "x" + kVar.f37962B);
            }
            return z;
        }
        if (C7557q0.f16368a >= 21) {
            int i3 = kVar.f37970J;
            if (i3 != -1 && !m1119k(i3)) {
                return false;
            }
            int i4 = kVar.f37969I;
            if (i4 != -1 && !m1120j(i4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean m1116n() {
        if (C7557q0.f16368a >= 29 && "video/x-vnd.on2.vp9".equals(this.f32305b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m1123g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o */
    public boolean m1115o(C6722k kVar) {
        if (this.f32314k) {
            return this.f32308e;
        }
        Pair<Integer, Integer> p = C14300x.m979p(kVar);
        if (p == null || ((Integer) p.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m1110t(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f32307d;
        if (codecCapabilities == null) {
            m1108v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m1108v("sizeAndRate.vCaps");
            return false;
        } else if (m1126d(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m1104z(this.f32304a) || !m1126d(videoCapabilities, i2, i, d)) {
                m1108v("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            m1109u("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
    }

    public String toString() {
        return this.f32304a;
    }
}
