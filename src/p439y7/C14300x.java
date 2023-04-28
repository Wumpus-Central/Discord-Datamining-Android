package p439y7;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.nearby.NearbyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079e7.C6722k;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p133h9.C7942b;
import p163j$.util.Spliterator;
import p439y7.C14300x;

@SuppressLint({"InlinedApi"})
/* renamed from: y7.x */
/* loaded from: classes7.dex */
public final class C14300x {

    /* renamed from: a */
    private static final Pattern f32353a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C14302b, List<C14288m>> f32354b = new HashMap<>();

    /* renamed from: c */
    private static int f32355c = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.x$b */
    /* loaded from: classes7.dex */
    public static final class C14302b {

        /* renamed from: a */
        public final String f32356a;

        /* renamed from: b */
        public final boolean f32357b;

        /* renamed from: c */
        public final boolean f32358c;

        public C14302b(String str, boolean z, boolean z2) {
            this.f32356a = str;
            this.f32357b = z;
            this.f32358c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C14302b.class) {
                return false;
            }
            C14302b bVar = (C14302b) obj;
            if (TextUtils.equals(this.f32356a, bVar.f32356a) && this.f32357b == bVar.f32357b && this.f32358c == bVar.f32358c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = (this.f32356a.hashCode() + 31) * 31;
            int i2 = 1231;
            if (this.f32357b) {
                i = 1231;
            } else {
                i = 1237;
            }
            int i3 = (hashCode + i) * 31;
            if (!this.f32358c) {
                i2 = 1237;
            }
            return i3 + i2;
        }
    }

    /* renamed from: y7.x$c */
    /* loaded from: classes7.dex */
    public static class C14303c extends Exception {
        private C14303c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.x$d */
    /* loaded from: classes7.dex */
    public interface AbstractC14304d {
        /* renamed from: a */
        MediaCodecInfo mo968a(int i);

        /* renamed from: b */
        boolean mo967b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo966c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo965d();

        /* renamed from: e */
        boolean mo964e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.x$e */
    /* loaded from: classes7.dex */
    public static final class C14305e implements AbstractC14304d {
        private C14305e() {
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: a */
        public MediaCodecInfo mo968a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: b */
        public boolean mo967b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
                return false;
            }
            return true;
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: c */
        public boolean mo966c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: d */
        public int mo965d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: e */
        public boolean mo964e() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.x$f */
    /* loaded from: classes7.dex */
    public static final class C14306f implements AbstractC14304d {

        /* renamed from: a */
        private final int f32359a;

        /* renamed from: b */
        private MediaCodecInfo[] f32360b;

        public C14306f(boolean z, boolean z2) {
            int i;
            if (z || z2) {
                i = 1;
            } else {
                i = 0;
            }
            this.f32359a = i;
        }

        /* renamed from: f */
        private void m963f() {
            if (this.f32360b == null) {
                this.f32360b = new MediaCodecList(this.f32359a).getCodecInfos();
            }
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: a */
        public MediaCodecInfo mo968a(int i) {
            m963f();
            return this.f32360b[i];
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: b */
        public boolean mo967b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: c */
        public boolean mo966c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: d */
        public int mo965d() {
            m963f();
            return this.f32360b.length;
        }

        @Override // p439y7.C14300x.AbstractC14304d
        /* renamed from: e */
        public boolean mo964e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.x$g */
    /* loaded from: classes7.dex */
    public interface AbstractC14307g<T> {
        /* renamed from: a */
        int mo962a(T t);
    }

    /* renamed from: A */
    private static boolean m1011A(MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    /* renamed from: B */
    private static boolean m1010B(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C7557q0.f16368a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C7557q0.f16369b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C7557q0.f16370c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C7557q0.f16369b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C7557q0.f16369b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C7557q0.f16370c))) {
            String str6 = C7557q0.f16369b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C7557q0.f16370c)) {
            String str7 = C7557q0.f16369b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i > 19 || !C7557q0.f16369b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
            return !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str);
        }
        return false;
    }

    /* renamed from: C */
    private static boolean m1009C(MediaCodecInfo mediaCodecInfo) {
        if (C7557q0.f16368a >= 29) {
            return m1008D(mediaCodecInfo);
        }
        return !m1007E(mediaCodecInfo);
    }

    /* renamed from: D */
    private static boolean m1008D(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    /* renamed from: E */
    private static boolean m1007E(MediaCodecInfo mediaCodecInfo) {
        if (C7557q0.f16368a >= 29) {
            return m1006F(mediaCodecInfo);
        }
        String U0 = C7557q0.m22174U0(mediaCodecInfo.getName());
        if (U0.startsWith("arc.")) {
            return false;
        }
        if (U0.startsWith("omx.google.") || U0.startsWith("omx.ffmpeg.") || ((U0.startsWith("omx.sec.") && U0.contains(".sw.")) || U0.equals("omx.qcom.video.decoder.hevcswvdec") || U0.startsWith("c2.android.") || U0.startsWith("c2.google.") || (!U0.startsWith("omx.") && !U0.startsWith("c2.")))) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m1006F(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    /* renamed from: G */
    private static boolean m1005G(MediaCodecInfo mediaCodecInfo) {
        if (C7557q0.f16368a >= 29) {
            return m1004H(mediaCodecInfo);
        }
        String U0 = C7557q0.m22174U0(mediaCodecInfo.getName());
        if (U0.startsWith("omx.google.") || U0.startsWith("c2.android.") || U0.startsWith("c2.google.")) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private static boolean m1004H(MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ int m1003I(C14288m mVar) {
        String str = mVar.f32304a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (C7557q0.f16368a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ int m1002J(C14288m mVar) {
        return mVar.f32304a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ int m1001K(C6722k kVar, C14288m mVar) {
        try {
            return mVar.m1117m(kVar) ? 1 : 0;
        } catch (C14303c unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ int m1000L(AbstractC14307g gVar, Object obj, Object obj2) {
        return gVar.mo962a(obj2) - gVar.mo962a(obj);
    }

    /* renamed from: M */
    public static int m999M() {
        int i;
        if (f32355c == -1) {
            int i2 = 0;
            C14288m q = m978q("video/avc", false, false);
            if (q != null) {
                MediaCodecInfo.CodecProfileLevel[] g = q.m1123g();
                int length = g.length;
                int i3 = 0;
                while (i2 < length) {
                    i3 = Math.max(m987h(g[i2].level), i3);
                    i2++;
                }
                if (C7557q0.f16368a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i2 = Math.max(i3, i);
            }
            f32355c = i2;
        }
        return f32355c;
    }

    /* renamed from: N */
    private static int m998N(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: O */
    private static <T> void m997O(List<T> list, final AbstractC14307g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: y7.w
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int L;
                L = C14300x.m1000L(C14300x.AbstractC14307g.this, obj, obj2);
                return L;
            }
        });
    }

    /* renamed from: P */
    private static int m996P(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return Spliterator.NONNULL;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: Q */
    private static int m995Q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    private static void m990e(String str, List<C14288m> list) {
        if ("audio/raw".equals(str)) {
            if (C7557q0.f16368a < 26 && C7557q0.f16369b.equals("R9") && list.size() == 1 && list.get(0).f32304a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C14288m.m1130A("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m997O(list, new AbstractC14307g() { // from class: y7.t
                @Override // p439y7.C14300x.AbstractC14307g
                /* renamed from: a */
                public final int mo962a(Object obj) {
                    int I;
                    I = C14300x.m1003I((C14288m) obj);
                    return I;
                }
            });
        }
        int i = C7557q0.f16368a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f32304a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m997O(list, new AbstractC14307g() { // from class: y7.u
                    @Override // p439y7.C14300x.AbstractC14307g
                    /* renamed from: a */
                    public final int mo962a(Object obj) {
                        int J;
                        J = C14300x.m1002J((C14288m) obj);
                        return J;
                    }
                });
            }
        }
        if (i < 30 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f32304a)) {
            list.add(list.remove(0));
        }
    }

    /* renamed from: f */
    private static int m989f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return Spliterator.NONNULL;
            case 9:
                return 512;
            case 10:
                return Spliterator.IMMUTABLE;
            case 11:
                return RecyclerView.ItemAnimator.FLAG_MOVED;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return Spliterator.SUBSIZED;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    private static int m988g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return Spliterator.NONNULL;
                            case 31:
                                return 512;
                            case 32:
                                return Spliterator.IMMUTABLE;
                            default:
                                switch (i) {
                                    case 40:
                                        return RecyclerView.ItemAnimator.FLAG_MOVED;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return Spliterator.SUBSIZED;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    private static int m987h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case Spliterator.NONNULL /* 256 */:
                return 414720;
            case 512:
                return 921600;
            case Spliterator.IMMUTABLE /* 1024 */:
                return 1310720;
            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case Spliterator.SUBSIZED /* 16384 */:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    private static int m986i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    private static Integer m985j(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return Integer.valueOf((int) Spliterator.NONNULL);
            case '\t':
                return 512;
            case '\n':
                return Integer.valueOf((int) Spliterator.IMMUTABLE);
            case 11:
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_MOVED);
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    /* renamed from: k */
    private static Integer m984k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return Integer.valueOf((int) Spliterator.NONNULL);
            case '\t':
                return 512;
            default:
                return null;
        }
    }

    /* renamed from: l */
    private static Pair<Integer, Integer> m983l(String str, String[] strArr) {
        int N;
        if (strArr.length != 3) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C7562u.m22080h(Integer.parseInt(strArr[1], 16))) && (N = m998N(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(N), 0);
            }
        } catch (NumberFormatException unused) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    private static Pair<Integer, Integer> m982m(String str, String[] strArr, C7942b bVar) {
        int i;
        if (strArr.length < 4) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                C7558r.m22104h("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            } else if (parseInt3 == 8 || parseInt3 == 10) {
                if (parseInt3 != 8) {
                    if (bVar == null || !(bVar.f17048n != null || (i = bVar.f17047m) == 7 || i == 6)) {
                        i2 = 2;
                    } else {
                        i2 = 4096;
                    }
                }
                int f = m989f(parseInt2);
                if (f != -1) {
                    return new Pair<>(Integer.valueOf(i2), Integer.valueOf(f));
                }
                C7558r.m22104h("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                return null;
            } else {
                C7558r.m22104h("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
        } catch (NumberFormatException unused) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* renamed from: n */
    private static Pair<Integer, Integer> m981n(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = parseInt;
            } else {
                C7558r.m22104h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i3 = m986i(i2);
            if (i3 == -1) {
                C7558r.m22104h("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int g = m988g(i);
            if (g != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(g));
            }
            C7558r.m22104h("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: o */
    private static String m980o(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (!str2.equals("audio/flac") || !"OMX.lge.flac.decoder".equals(str)) {
                return null;
            }
            return "audio/x-lg-flac";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m979p(p079e7.C6722k r6) {
        /*
            java.lang.String r0 = r6.f14326s
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.f14329v
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f14326s
            android.util.Pair r6 = m973v(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = r5
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f14326s
            android.util.Pair r6 = m971x(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f14326s
            android.util.Pair r6 = m983l(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f14326s
            android.util.Pair r6 = m972w(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f14326s
            android.util.Pair r6 = m981n(r6, r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f14326s
            h9.b r6 = r6.f37968H
            android.util.Pair r6 = m982m(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p439y7.C14300x.m979p(e7.k):android.util.Pair");
    }

    /* renamed from: q */
    public static C14288m m978q(String str, boolean z, boolean z2) {
        List<C14288m> r = m977r(str, z, z2);
        if (r.isEmpty()) {
            return null;
        }
        return r.get(0);
    }

    /* renamed from: r */
    public static synchronized List<C14288m> m977r(String str, boolean z, boolean z2) {
        AbstractC14304d dVar;
        synchronized (C14300x.class) {
            C14302b bVar = new C14302b(str, z, z2);
            HashMap<C14302b, List<C14288m>> hashMap = f32354b;
            List<C14288m> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = C7557q0.f16368a;
            if (i >= 21) {
                dVar = new C14306f(z, z2);
            } else {
                dVar = new C14305e();
            }
            ArrayList<C14288m> s = m976s(bVar, dVar);
            if (z && s.isEmpty() && 21 <= i && i <= 23) {
                s = m976s(bVar, new C14305e());
                if (!s.isEmpty()) {
                    C7558r.m22104h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + s.get(0).f32304a);
                }
            }
            m990e(str, s);
            List<C14288m> unmodifiableList = Collections.unmodifiableList(s);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:25|(4:(2:73|30)|38|(9:41|42|69|43|44|71|45|79|46)|58)|32|75|33|83|58) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r1.f32357b == false) goto L_0x0081;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: Exception -> 0x014f, TRY_ENTER, TryCatch #1 {Exception -> 0x014f, blocks: (B:3:0x0008, B:5:0x001b, B:8:0x002d, B:11:0x0038, B:52:0x00f9, B:55:0x0101, B:57:0x0107, B:58:0x0120, B:59:0x012a, B:60:0x014d), top: B:67:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<p439y7.C14288m> m976s(p439y7.C14300x.C14302b r24, p439y7.C14300x.AbstractC14304d r25) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p439y7.C14300x.m976s(y7.x$b, y7.x$d):java.util.ArrayList");
    }

    /* renamed from: t */
    public static List<C14288m> m975t(List<C14288m> list, final C6722k kVar) {
        ArrayList arrayList = new ArrayList(list);
        m997O(arrayList, new AbstractC14307g() { // from class: y7.v
            @Override // p439y7.C14300x.AbstractC14307g
            /* renamed from: a */
            public final int mo962a(Object obj) {
                int K;
                K = C14300x.m1001K(C6722k.this, (C14288m) obj);
                return K;
            }
        });
        return arrayList;
    }

    /* renamed from: u */
    public static C14288m m974u() {
        return m978q("audio/raw", false, false);
    }

    /* renamed from: v */
    private static Pair<Integer, Integer> m973v(String str, String[] strArr) {
        if (strArr.length < 3) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f32353a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k = m984k(group);
        if (k == null) {
            C7558r.m22104h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j = m985j(str2);
        if (j != null) {
            return new Pair<>(k, j);
        }
        C7558r.m22104h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    /* renamed from: w */
    private static Pair<Integer, Integer> m972w(String str, String[] strArr) {
        if (strArr.length < 4) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f32353a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!NearbyManager.PERMISSION_DENIED.equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                C7558r.m22104h("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer y = m970y(str2);
        if (y != null) {
            return new Pair<>(Integer.valueOf(i), y);
        }
        C7558r.m22104h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m971x(String str, String[] strArr) {
        if (strArr.length < 3) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int Q = m995Q(parseInt);
            if (Q == -1) {
                C7558r.m22104h("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int P = m996P(parseInt2);
            if (P != -1) {
                return new Pair<>(Integer.valueOf(Q), Integer.valueOf(P));
            }
            C7558r.m22104h("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            C7558r.m22104h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: y */
    private static Integer m970y(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return Integer.valueOf((int) Spliterator.NONNULL);
            case '\n':
                return Integer.valueOf((int) RecyclerView.ItemAnimator.FLAG_MOVED);
            case 11:
                return 8192;
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return Integer.valueOf((int) Spliterator.IMMUTABLE);
            case 19:
                return 4096;
            case 20:
                return Integer.valueOf((int) Spliterator.SUBSIZED);
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    /* renamed from: z */
    private static boolean m969z(MediaCodecInfo mediaCodecInfo) {
        return C7557q0.f16368a >= 29 && m1011A(mediaCodecInfo);
    }
}
