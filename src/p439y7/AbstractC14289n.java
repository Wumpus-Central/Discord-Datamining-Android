package p439y7;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p079e7.AbstractC6712b;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6725l;
import p119g9.C7510a;
import p119g9.C7542k0;
import p119g9.C7546m0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7566w;
import p152i7.C8221f;
import p152i7.C8223h;
import p152i7.C8225i;
import p193k7.AbstractC9761b0;
import p193k7.AbstractC9805n;
import p193k7.C9770d0;
import p193k7.C9803m;
import p439y7.AbstractC14284k;
import p439y7.C14272c;
import p439y7.C14300x;

/* renamed from: y7.n */
/* loaded from: classes7.dex */
public abstract class AbstractC14289n extends AbstractC6712b {

    /* renamed from: R0 */
    private static final byte[] f39451R0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0 */
    private boolean f39453A0;

    /* renamed from: B0 */
    private boolean f39455B0;

    /* renamed from: C0 */
    private boolean f39457C0;

    /* renamed from: D */
    private final C14282i f39458D;

    /* renamed from: D0 */
    private long f39459D0;

    /* renamed from: E0 */
    private long f39461E0;

    /* renamed from: F0 */
    private boolean f39463F0;

    /* renamed from: G0 */
    private boolean f39465G0;

    /* renamed from: H0 */
    private boolean f39467H0;

    /* renamed from: I0 */
    private boolean f39469I0;

    /* renamed from: J0 */
    private boolean f39471J0;

    /* renamed from: K */
    private C6722k f39472K;

    /* renamed from: K0 */
    private boolean f39473K0;

    /* renamed from: L */
    private C6722k f39474L;

    /* renamed from: L0 */
    private boolean f39475L0;

    /* renamed from: M */
    private AbstractC9805n f39476M;

    /* renamed from: M0 */
    private ExoPlaybackException f39477M0;

    /* renamed from: N */
    private AbstractC9805n f39478N;

    /* renamed from: N0 */
    protected C8221f f39479N0;

    /* renamed from: O */
    private MediaCrypto f39480O;

    /* renamed from: P */
    private boolean f39482P;

    /* renamed from: Q0 */
    private int f39485Q0;

    /* renamed from: T */
    private AbstractC14284k f39488T;

    /* renamed from: U */
    private C6722k f39489U;

    /* renamed from: V */
    private MediaFormat f39490V;

    /* renamed from: W */
    private boolean f39491W;

    /* renamed from: X */
    private float f39492X;

    /* renamed from: Y */
    private ArrayDeque<C14288m> f39493Y;

    /* renamed from: Z */
    private C14290a f39494Z;

    /* renamed from: a0 */
    private C14288m f32315a0;

    /* renamed from: b0 */
    private int f32316b0;

    /* renamed from: c0 */
    private boolean f32317c0;

    /* renamed from: d0 */
    private boolean f32318d0;

    /* renamed from: e0 */
    private boolean f32319e0;

    /* renamed from: f0 */
    private boolean f32320f0;

    /* renamed from: g0 */
    private boolean f32321g0;

    /* renamed from: h0 */
    private boolean f32322h0;

    /* renamed from: i0 */
    private boolean f32323i0;

    /* renamed from: j0 */
    private boolean f32324j0;

    /* renamed from: k0 */
    private boolean f32325k0;

    /* renamed from: l0 */
    private boolean f32326l0;

    /* renamed from: m0 */
    private C14283j f32327m0;

    /* renamed from: n0 */
    private long f32328n0;

    /* renamed from: o0 */
    private int f32329o0;

    /* renamed from: p0 */
    private int f32330p0;

    /* renamed from: q0 */
    private ByteBuffer f32331q0;

    /* renamed from: r0 */
    private boolean f32332r0;

    /* renamed from: s0 */
    private boolean f32333s0;

    /* renamed from: t0 */
    private boolean f32334t0;

    /* renamed from: u0 */
    private boolean f32335u0;

    /* renamed from: v0 */
    private boolean f32336v0;

    /* renamed from: w */
    private final AbstractC14284k.AbstractC14285a f32337w;

    /* renamed from: w0 */
    private boolean f32338w0;

    /* renamed from: x */
    private final AbstractC14292p f32339x;

    /* renamed from: x0 */
    private int f32340x0;

    /* renamed from: y */
    private final boolean f32341y;

    /* renamed from: y0 */
    private int f32342y0;

    /* renamed from: z */
    private final float f32343z;

    /* renamed from: z0 */
    private int f32344z0;

    /* renamed from: A */
    private final C8223h f39452A = C8223h.m20281s();

    /* renamed from: B */
    private final C8223h f39454B = new C8223h(0);

    /* renamed from: C */
    private final C8223h f39456C = new C8223h(2);

    /* renamed from: E */
    private final C7542k0<C6722k> f39460E = new C7542k0<>();

    /* renamed from: F */
    private final ArrayList<Long> f39462F = new ArrayList<>();

    /* renamed from: G */
    private final MediaCodec.BufferInfo f39464G = new MediaCodec.BufferInfo();

    /* renamed from: R */
    private float f39486R = 1.0f;

    /* renamed from: S */
    private float f39487S = 1.0f;

    /* renamed from: Q */
    private long f39484Q = -9223372036854775807L;

    /* renamed from: H */
    private final long[] f39466H = new long[10];

    /* renamed from: I */
    private final long[] f39468I = new long[10];

    /* renamed from: J */
    private final long[] f39470J = new long[10];

    /* renamed from: O0 */
    private long f39481O0 = -9223372036854775807L;

    /* renamed from: P0 */
    private long f39483P0 = -9223372036854775807L;

    public AbstractC14289n(int i, AbstractC14284k.AbstractC14285a aVar, AbstractC14292p pVar, boolean z, float f) {
        super(i);
        this.f32337w = aVar;
        this.f32339x = (AbstractC14292p) C7510a.m22367e(pVar);
        this.f32341y = z;
        this.f32343z = f;
        C14282i iVar = new C14282i();
        this.f39458D = iVar;
        iVar.m20285o(0);
        iVar.f17798m.order(ByteOrder.nativeOrder());
        m1064X0();
    }

    /* renamed from: A0 */
    private void m1103A0(C14288m mVar, MediaCrypto mediaCrypto) {
        float f;
        float f2;
        Exception e;
        long elapsedRealtime;
        AbstractC14284k kVar;
        boolean z;
        String str = mVar.f32304a;
        int i = C7557q0.f16368a;
        if (i < 23) {
            f = -1.0f;
        } else {
            f = mo1028r0(this.f39487S, this.f39472K, m24586B());
        }
        if (f <= this.f32343z) {
            f2 = -1.0f;
        } else {
            f2 = f;
        }
        AbstractC14284k kVar2 = null;
        try {
            elapsedRealtime = SystemClock.elapsedRealtime();
            C7546m0.m22245a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            if (!this.f39471J0 || i < 23) {
                kVar = this.f32337w.mo1133a(createByCodecName);
            } else {
                kVar = new C14272c.C14274b(mo24424d(), this.f39473K0, this.f39475L0).mo1133a(createByCodecName);
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            C7546m0.m22243c();
            C7546m0.m22245a("configureCodec");
            mo1063Y(mVar, kVar, this.f39472K, mediaCrypto, f2);
            C7546m0.m22243c();
            C7546m0.m22245a("startCodec");
            kVar.start();
            C7546m0.m22243c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f39488T = kVar;
            this.f32315a0 = mVar;
            this.f39492X = f2;
            this.f39489U = this.f39472K;
            this.f32316b0 = m1081P(str);
            this.f32317c0 = m1079Q(str, this.f39489U);
            this.f32318d0 = m1069V(str);
            this.f32319e0 = m1065X(str);
            this.f32320f0 = m1075S(str);
            this.f32321g0 = m1073T(str);
            this.f32322h0 = m1077R(str);
            this.f32323i0 = m1067W(str, this.f39489U);
            if (m1071U(mVar) || mo1029q0()) {
                z = true;
            } else {
                z = false;
            }
            this.f32326l0 = z;
            if ("c2.android.mp3.decoder".equals(mVar.f32304a)) {
                this.f32327m0 = new C14283j();
            }
            if (getState() == 2) {
                this.f32328n0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f39479N0.f17786a++;
            mo1091I0(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Exception e3) {
            e = e3;
            kVar2 = kVar;
            if (kVar2 != null) {
                kVar2.release();
            }
            throw e;
        }
    }

    /* renamed from: B0 */
    private boolean m1102B0(long j) {
        int size = this.f39462F.size();
        for (int i = 0; i < size; i++) {
            if (this.f39462F.get(i).longValue() == j) {
                this.f39462F.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: C0 */
    private static boolean m1101C0(IllegalStateException illegalStateException) {
        if (C7557q0.f16368a >= 21 && m1100D0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    private static boolean m1100D0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: G0 */
    private void m1095G0(MediaCrypto mediaCrypto, boolean z) {
        if (this.f39493Y == null) {
            try {
                List<C14288m> n0 = m1034n0(z);
                ArrayDeque<C14288m> arrayDeque = new ArrayDeque<>();
                this.f39493Y = arrayDeque;
                if (this.f32341y) {
                    arrayDeque.addAll(n0);
                } else if (!n0.isEmpty()) {
                    this.f39493Y.add(n0.get(0));
                }
                this.f39494Z = null;
            } catch (C14300x.C14303c e) {
                throw new C14290a(this.f39472K, e, z, -49998);
            }
        }
        if (!this.f39493Y.isEmpty()) {
            while (this.f39488T == null) {
                C14288m peekFirst = this.f39493Y.peekFirst();
                if (mo1048f1(peekFirst)) {
                    try {
                        m1103A0(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        C7558r.m22103i("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst, e2);
                        this.f39493Y.removeFirst();
                        C14290a aVar = new C14290a(this.f39472K, e2, z, peekFirst);
                        if (this.f39494Z == null) {
                            this.f39494Z = aVar;
                        } else {
                            this.f39494Z = this.f39494Z.m1017c(aVar);
                        }
                        if (this.f39493Y.isEmpty()) {
                            throw this.f39494Z;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f39493Y = null;
            return;
        }
        throw new C14290a(this.f39472K, (Throwable) null, z, -49999);
    }

    /* renamed from: H0 */
    private boolean m1093H0(C9770d0 d0Var, C6722k kVar) {
        if (d0Var.f21743c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(d0Var.f21741a, d0Var.f21742b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(kVar.f14329v);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    /* renamed from: M */
    private void m1087M() {
        C7510a.m22366f(!this.f39463F0);
        C6725l z = m24569z();
        this.f39456C.mo1151f();
        do {
            this.f39456C.mo1151f();
            int K = m24584K(z, this.f39456C, false);
            if (K == -5) {
                mo1089K0(z);
                return;
            } else if (K != -4) {
                if (K != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f39456C.m20299k()) {
                this.f39463F0 = true;
                return;
            } else {
                if (this.f39467H0) {
                    C6722k kVar = (C6722k) C7510a.m22367e(this.f39472K);
                    this.f39474L = kVar;
                    mo1088L0(kVar, null);
                    this.f39467H0 = false;
                }
                this.f39456C.m20284p();
            }
        } while (this.f39458D.m1150u(this.f39456C));
        this.f32335u0 = true;
    }

    /* renamed from: N */
    private boolean m1085N(long j, long j2) {
        boolean z;
        C7510a.m22366f(!this.f39465G0);
        if (this.f39458D.m1153B()) {
            C14282i iVar = this.f39458D;
            if (!mo1078Q0(j, j2, null, iVar.f17798m, this.f32330p0, 0, iVar.m1146z(), this.f39458D.m1148x(), this.f39458D.m20300j(), this.f39458D.m20299k(), this.f39474L)) {
                return false;
            }
            mo1086M0(this.f39458D.m1147y());
            this.f39458D.mo1151f();
            z = false;
        } else {
            z = false;
        }
        if (this.f39463F0) {
            this.f39465G0 = true;
            return z;
        }
        if (this.f32335u0) {
            C7510a.m22366f(this.f39458D.m1150u(this.f39456C));
            this.f32335u0 = z;
        }
        if (this.f32336v0) {
            if (this.f39458D.m1153B()) {
                return true;
            }
            m1059a0();
            this.f32336v0 = z;
            m1097F0();
            if (!this.f32334t0) {
                return z;
            }
        }
        m1087M();
        if (this.f39458D.m1153B()) {
            this.f39458D.m20284p();
        }
        if (this.f39458D.m1153B() || this.f39463F0 || this.f32336v0) {
            return true;
        }
        return z;
    }

    /* renamed from: P */
    private int m1081P(String str) {
        int i = C7557q0.f16368a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C7557q0.f16371d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C7557q0.f16369b;
        if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
            return 1;
        }
        return 0;
    }

    @TargetApi(23)
    /* renamed from: P0 */
    private void m1080P0() {
        int i = this.f32344z0;
        if (i == 1) {
            m1039k0();
        } else if (i == 2) {
            m1039k0();
            m1038k1();
        } else if (i != 3) {
            this.f39465G0 = true;
            mo1068V0();
        } else {
            m1072T0();
        }
    }

    /* renamed from: Q */
    private static boolean m1079Q(String str, C6722k kVar) {
        if (C7557q0.f16368a >= 21 || !kVar.f14331x.isEmpty() || !"OMX.MTK.VIDEO.DECODER.AVC".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private static boolean m1077R(String str) {
        if (C7557q0.f16368a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C7557q0.f16370c)) {
            String str2 = C7557q0.f16369b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: R0 */
    private void m1076R0() {
        this.f39457C0 = true;
        MediaFormat outputFormat = this.f39488T.getOutputFormat();
        if (this.f32316b0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f32325k0 = true;
            return;
        }
        if (this.f32323i0) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.f39490V = outputFormat;
        this.f39491W = true;
    }

    /* renamed from: S */
    private static boolean m1075S(String str) {
        int i = C7557q0.f16368a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = C7557q0.f16369b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: S0 */
    private boolean m1074S0(boolean z) {
        C6725l z2 = m24569z();
        this.f39452A.mo1151f();
        int K = m24584K(z2, this.f39452A, z);
        if (K == -5) {
            mo1089K0(z2);
            return true;
        } else if (K != -4 || !this.f39452A.m20299k()) {
            return false;
        } else {
            this.f39463F0 = true;
            m1080P0();
            return false;
        }
    }

    /* renamed from: T */
    private static boolean m1073T(String str) {
        return C7557q0.f16368a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: T0 */
    private void m1072T0() {
        m1070U0();
        m1097F0();
    }

    /* renamed from: U */
    private static boolean m1071U(C14288m mVar) {
        String str = mVar.f32304a;
        int i = C7557q0.f16368a;
        if ((i > 25 || !"OMX.rk.video_decoder.avc".equals(str)) && ((i > 17 || !"OMX.allwinner.video.decoder.avc".equals(str)) && ((i > 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str))) && (!"Amazon".equals(C7557q0.f16370c) || !"AFTS".equals(C7557q0.f16371d) || !mVar.f32310g)))) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private static boolean m1069V(String str) {
        int i = C7557q0.f16368a;
        if (i < 18 || ((i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && C7557q0.f16371d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private static boolean m1067W(String str, C6722k kVar) {
        if (C7557q0.f16368a > 18 || kVar.f37969I != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private static boolean m1065X(String str) {
        return C7557q0.f16368a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: Y0 */
    private void m1062Y0() {
        this.f32329o0 = -1;
        this.f39454B.f17798m = null;
    }

    /* renamed from: Z0 */
    private void m1060Z0() {
        this.f32330p0 = -1;
        this.f32331q0 = null;
    }

    /* renamed from: a0 */
    private void m1059a0() {
        this.f32336v0 = false;
        this.f39458D.mo1151f();
        this.f39456C.mo1151f();
        this.f32335u0 = false;
        this.f32334t0 = false;
    }

    /* renamed from: a1 */
    private void m1058a1(AbstractC9805n nVar) {
        C9803m.m15317a(this.f39476M, nVar);
        this.f39476M = nVar;
    }

    /* renamed from: b0 */
    private boolean m1057b0() {
        if (this.f39453A0) {
            this.f32342y0 = 1;
            if (this.f32318d0 || this.f32320f0) {
                this.f32344z0 = 3;
                return false;
            }
            this.f32344z0 = 1;
        }
        return true;
    }

    /* renamed from: c0 */
    private void m1055c0() {
        if (this.f39453A0) {
            this.f32342y0 = 1;
            this.f32344z0 = 3;
            return;
        }
        m1072T0();
    }

    @TargetApi(23)
    /* renamed from: d0 */
    private boolean m1053d0() {
        if (this.f39453A0) {
            this.f32342y0 = 1;
            if (this.f32318d0 || this.f32320f0) {
                this.f32344z0 = 3;
                return false;
            }
            this.f32344z0 = 2;
        } else {
            m1038k1();
        }
        return true;
    }

    /* renamed from: d1 */
    private void m1052d1(AbstractC9805n nVar) {
        C9803m.m15317a(this.f39478N, nVar);
        this.f39478N = nVar;
    }

    /* renamed from: e0 */
    private boolean m1051e0(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC14284k kVar;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int i2;
        boolean z4;
        if (!m1021y0()) {
            if (!this.f32321g0 || !this.f39455B0) {
                i2 = this.f39488T.mo1135h(this.f39464G);
            } else {
                try {
                    i2 = this.f39488T.mo1135h(this.f39464G);
                } catch (IllegalStateException unused) {
                    m1080P0();
                    if (this.f39465G0) {
                        m1070U0();
                    }
                    return false;
                }
            }
            if (i2 < 0) {
                if (i2 == -2) {
                    m1076R0();
                    return true;
                }
                if (this.f32326l0 && (this.f39463F0 || this.f32342y0 == 2)) {
                    m1080P0();
                }
                return false;
            } else if (this.f32325k0) {
                this.f32325k0 = false;
                this.f39488T.releaseOutputBuffer(i2, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.f39464G;
                if (bufferInfo2.size != 0 || (bufferInfo2.flags & 4) == 0) {
                    this.f32330p0 = i2;
                    ByteBuffer i3 = this.f39488T.mo1134i(i2);
                    this.f32331q0 = i3;
                    if (i3 != null) {
                        i3.position(this.f39464G.offset);
                        ByteBuffer byteBuffer2 = this.f32331q0;
                        MediaCodec.BufferInfo bufferInfo3 = this.f39464G;
                        byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                    }
                    if (this.f32322h0) {
                        MediaCodec.BufferInfo bufferInfo4 = this.f39464G;
                        if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                            long j3 = this.f39459D0;
                            if (j3 != -9223372036854775807L) {
                                bufferInfo4.presentationTimeUs = j3;
                            }
                        }
                    }
                    this.f32332r0 = m1102B0(this.f39464G.presentationTimeUs);
                    long j4 = this.f39461E0;
                    long j5 = this.f39464G.presentationTimeUs;
                    if (j4 == j5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f32333s0 = z4;
                    m1036l1(j5);
                } else {
                    m1080P0();
                    return false;
                }
            }
        }
        if (!this.f32321g0 || !this.f39455B0) {
            z = false;
            AbstractC14284k kVar2 = this.f39488T;
            ByteBuffer byteBuffer3 = this.f32331q0;
            int i4 = this.f32330p0;
            MediaCodec.BufferInfo bufferInfo5 = this.f39464G;
            z2 = mo1078Q0(j, j2, kVar2, byteBuffer3, i4, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f32332r0, this.f32333s0, this.f39474L);
        } else {
            try {
                kVar = this.f39488T;
                byteBuffer = this.f32331q0;
                i = this.f32330p0;
                bufferInfo = this.f39464G;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                z2 = mo1078Q0(j, j2, kVar, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f32332r0, this.f32333s0, this.f39474L);
            } catch (IllegalStateException unused3) {
                m1080P0();
                if (this.f39465G0) {
                    m1070U0();
                }
                return z;
            }
        }
        if (z2) {
            mo1086M0(this.f39464G.presentationTimeUs);
            if ((this.f39464G.flags & 4) != 0) {
                z3 = true;
            } else {
                z3 = z;
            }
            m1060Z0();
            if (!z3) {
                return true;
            }
            m1080P0();
        }
        return z;
    }

    /* renamed from: e1 */
    private boolean m1050e1(long j) {
        if (this.f39484Q == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f39484Q) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m1049f0(C14288m mVar, C6722k kVar, AbstractC9805n nVar, AbstractC9805n nVar2) {
        C9770d0 u0;
        if (nVar == nVar2) {
            return false;
        }
        if (nVar2 == null || nVar == null || C7557q0.f16368a < 23) {
            return true;
        }
        UUID uuid = C6713c.f14281e;
        if (uuid.equals(nVar.mo15316a()) || uuid.equals(nVar2.mo15316a()) || (u0 = m1025u0(nVar2)) == null) {
            return true;
        }
        if (mVar.f32310g || !m1093H0(u0, kVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i1 */
    public static boolean m1042i1(C6722k kVar) {
        Class<? extends AbstractC9761b0> cls = kVar.f37975O;
        if (cls == null || C9770d0.class.equals(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m1041j0() {
        AbstractC14284k kVar = this.f39488T;
        if (kVar == null || this.f32342y0 == 2 || this.f39463F0) {
            return false;
        }
        if (this.f32329o0 < 0) {
            int g = kVar.mo1136g();
            this.f32329o0 = g;
            if (g < 0) {
                return false;
            }
            this.f39454B.f17798m = this.f39488T.mo1140c(g);
            this.f39454B.mo1151f();
        }
        if (this.f32342y0 == 1) {
            if (!this.f32326l0) {
                this.f39455B0 = true;
                this.f39488T.queueInputBuffer(this.f32329o0, 0, 0, 0L, 4);
                m1062Y0();
            }
            this.f32342y0 = 2;
            return false;
        } else if (this.f32324j0) {
            this.f32324j0 = false;
            ByteBuffer byteBuffer = this.f39454B.f17798m;
            byte[] bArr = f39451R0;
            byteBuffer.put(bArr);
            this.f39488T.queueInputBuffer(this.f32329o0, 0, bArr.length, 0L, 0);
            m1062Y0();
            this.f39453A0 = true;
            return true;
        } else {
            if (this.f32340x0 == 1) {
                for (int i = 0; i < this.f39489U.f14331x.size(); i++) {
                    this.f39454B.f17798m.put(this.f39489U.f14331x.get(i));
                }
                this.f32340x0 = 2;
            }
            int position = this.f39454B.f17798m.position();
            C6725l z = m24569z();
            int K = m24584K(z, this.f39454B, false);
            if (mo24582g()) {
                this.f39461E0 = this.f39459D0;
            }
            if (K == -3) {
                return false;
            }
            if (K == -5) {
                if (this.f32340x0 == 2) {
                    this.f39454B.mo1151f();
                    this.f32340x0 = 1;
                }
                mo1089K0(z);
                return true;
            } else if (this.f39454B.m20299k()) {
                if (this.f32340x0 == 2) {
                    this.f39454B.mo1151f();
                    this.f32340x0 = 1;
                }
                this.f39463F0 = true;
                if (!this.f39453A0) {
                    m1080P0();
                    return false;
                }
                try {
                    if (!this.f32326l0) {
                        this.f39455B0 = true;
                        this.f39488T.queueInputBuffer(this.f32329o0, 0, 0, 0L, 4);
                        m1062Y0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw m24572w(e, this.f39472K);
                }
            } else if (this.f39453A0 || this.f39454B.m20298l()) {
                boolean q = this.f39454B.m20283q();
                if (q) {
                    this.f39454B.f17797l.m20295b(position);
                }
                if (this.f32317c0 && !q) {
                    C7566w.m22061b(this.f39454B.f17798m);
                    if (this.f39454B.f17798m.position() == 0) {
                        return true;
                    }
                    this.f32317c0 = false;
                }
                C8223h hVar = this.f39454B;
                long j = hVar.f17800o;
                C14283j jVar = this.f32327m0;
                if (jVar != null) {
                    j = jVar.m1143c(this.f39472K, hVar);
                }
                if (this.f39454B.m20300j()) {
                    this.f39462F.add(Long.valueOf(j));
                }
                if (this.f39467H0) {
                    this.f39460E.m22287a(j, this.f39472K);
                    this.f39467H0 = false;
                }
                if (this.f32327m0 != null) {
                    this.f39459D0 = Math.max(this.f39459D0, this.f39454B.f17800o);
                } else {
                    this.f39459D0 = Math.max(this.f39459D0, j);
                }
                this.f39454B.m20284p();
                if (this.f39454B.m20301i()) {
                    mo1022x0(this.f39454B);
                }
                mo1082O0(this.f39454B);
                try {
                    if (q) {
                        this.f39488T.mo1142a(this.f32329o0, 0, this.f39454B.f17797l, j, 0);
                    } else {
                        this.f39488T.queueInputBuffer(this.f32329o0, 0, this.f39454B.f17798m.limit(), j, 0);
                    }
                    m1062Y0();
                    this.f39453A0 = true;
                    this.f32340x0 = 0;
                    this.f39479N0.f17788c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw m24572w(e2, this.f39472K);
                }
            } else {
                this.f39454B.mo1151f();
                if (this.f32340x0 == 2) {
                    this.f32340x0 = 1;
                }
                return true;
            }
        }
    }

    /* renamed from: j1 */
    private boolean m1040j1(C6722k kVar) {
        if (C7557q0.f16368a < 23) {
            return true;
        }
        float r0 = mo1028r0(this.f39487S, kVar, m24586B());
        float f = this.f39492X;
        if (f == r0) {
            return true;
        }
        if (r0 == -1.0f) {
            m1055c0();
            return false;
        } else if (f == -1.0f && r0 <= this.f32343z) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", r0);
            this.f39488T.setParameters(bundle);
            this.f39492X = r0;
            return true;
        }
    }

    /* renamed from: k0 */
    private void m1039k0() {
        try {
            this.f39488T.flush();
        } finally {
            mo1066W0();
        }
    }

    /* renamed from: k1 */
    private void m1038k1() {
        try {
            this.f39480O.setMediaDrmSession(m1025u0(this.f39478N).f21742b);
            m1058a1(this.f39478N);
            this.f32342y0 = 0;
            this.f32344z0 = 0;
        } catch (MediaCryptoException e) {
            throw m24572w(e, this.f39472K);
        }
    }

    /* renamed from: n0 */
    private List<C14288m> m1034n0(boolean z) {
        List<C14288m> t0 = mo1026t0(this.f32339x, this.f39472K, z);
        if (t0.isEmpty() && z) {
            t0 = mo1026t0(this.f32339x, this.f39472K, false);
            if (!t0.isEmpty()) {
                C7558r.m22104h("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f39472K.f14329v + ", but no secure decoder available. Trying to proceed with " + t0 + ".");
            }
        }
        return t0;
    }

    /* renamed from: u0 */
    private C9770d0 m1025u0(AbstractC9805n nVar) {
        AbstractC9761b0 c = nVar.mo15314c();
        if (c == null || (c instanceof C9770d0)) {
            return (C9770d0) c;
        }
        throw m24572w(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + c), this.f39472K);
    }

    /* renamed from: y0 */
    private boolean m1021y0() {
        return this.f32330p0 >= 0;
    }

    /* renamed from: z0 */
    private void m1020z0(C6722k kVar) {
        m1059a0();
        String str = kVar.f14329v;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f39458D.m1152C(32);
        } else {
            this.f39458D.m1152C(1);
        }
        this.f32334t0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: D */
    public void mo173D() {
        this.f39472K = null;
        this.f39481O0 = -9223372036854775807L;
        this.f39483P0 = -9223372036854775807L;
        this.f39485Q0 = 0;
        if (this.f39478N == null && this.f39476M == null) {
            m1035m0();
        } else {
            mo1096G();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: E */
    public void mo1099E(boolean z, boolean z2) {
        this.f39479N0 = new C8221f();
    }

    /* renamed from: E0 */
    protected boolean m1098E0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: F */
    public void mo172F(long j, boolean z) {
        this.f39463F0 = false;
        this.f39465G0 = false;
        this.f39469I0 = false;
        if (this.f32334t0) {
            this.f39458D.mo1151f();
            this.f39456C.mo1151f();
            this.f32335u0 = false;
        } else {
            m1037l0();
        }
        if (this.f39460E.m22276l() > 0) {
            this.f39467H0 = true;
        }
        this.f39460E.m22285c();
        int i = this.f39485Q0;
        if (i != 0) {
            this.f39483P0 = this.f39468I[i - 1];
            this.f39481O0 = this.f39466H[i - 1];
            this.f39485Q0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public final void m1097F0() {
        C6722k kVar;
        boolean z;
        if (this.f39488T == null && !this.f32334t0 && (kVar = this.f39472K) != null) {
            if (this.f39478N != null || !mo1046g1(kVar)) {
                m1058a1(this.f39478N);
                String str = this.f39472K.f14329v;
                AbstractC9805n nVar = this.f39476M;
                if (nVar != null) {
                    if (this.f39480O == null) {
                        C9770d0 u0 = m1025u0(nVar);
                        if (u0 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(u0.f21741a, u0.f21742b);
                                this.f39480O = mediaCrypto;
                                if (u0.f21743c || !mediaCrypto.requiresSecureDecoderComponent(str)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.f39482P = z;
                            } catch (MediaCryptoException e) {
                                throw m24572w(e, this.f39472K);
                            }
                        } else if (this.f39476M.mo15313d() == null) {
                            return;
                        }
                    }
                    if (C9770d0.f21740d) {
                        int state = this.f39476M.getState();
                        if (state == 1) {
                            throw m24572w(this.f39476M.mo15313d(), this.f39472K);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    m1095G0(this.f39480O, this.f39482P);
                } catch (C14290a e2) {
                    throw m24572w(e2, this.f39472K);
                }
            } else {
                m1020z0(this.f39472K);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: G */
    public void mo1096G() {
        try {
            m1059a0();
            m1070U0();
        } finally {
            m1052d1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: H */
    public void mo1094H() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p079e7.AbstractC6712b
    /* renamed from: I */
    public void mo1092I() {
    }

    /* renamed from: I0 */
    protected abstract void mo1091I0(String str, long j, long j2);

    @Override // p079e7.AbstractC6712b
    /* renamed from: J */
    protected void mo171J(C6722k[] kVarArr, long j, long j2) {
        boolean z = true;
        if (this.f39483P0 == -9223372036854775807L) {
            if (this.f39481O0 != -9223372036854775807L) {
                z = false;
            }
            C7510a.m22366f(z);
            this.f39481O0 = j;
            this.f39483P0 = j2;
            return;
        }
        int i = this.f39485Q0;
        if (i == this.f39468I.length) {
            C7558r.m22104h("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f39468I[this.f39485Q0 - 1]);
        } else {
            this.f39485Q0 = i + 1;
        }
        long[] jArr = this.f39466H;
        int i2 = this.f39485Q0;
        jArr[i2 - 1] = j;
        this.f39468I[i2 - 1] = j2;
        this.f39470J[i2 - 1] = this.f39459D0;
    }

    /* renamed from: J0 */
    protected abstract void mo1090J0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (m1053d0() == false) goto L_0x00d4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (m1053d0() == false) goto L_0x00d4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
        r7 = 2;
     */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p152i7.C8225i mo1089K0(p079e7.C6725l r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p439y7.AbstractC14289n.mo1089K0(e7.l):i7.i");
    }

    /* renamed from: L0 */
    protected abstract void mo1088L0(C6722k kVar, MediaFormat mediaFormat);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo1086M0(long j) {
        while (true) {
            int i = this.f39485Q0;
            if (i != 0 && j >= this.f39470J[0]) {
                long[] jArr = this.f39466H;
                this.f39481O0 = jArr[0];
                this.f39483P0 = this.f39468I[0];
                int i2 = i - 1;
                this.f39485Q0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f39468I;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f39485Q0);
                long[] jArr3 = this.f39470J;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f39485Q0);
                mo1084N0();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo1084N0() {
    }

    /* renamed from: O */
    protected abstract C8225i mo1083O(C14288m mVar, C6722k kVar, C6722k kVar2);

    /* renamed from: O0 */
    protected abstract void mo1082O0(C8223h hVar);

    /* renamed from: Q0 */
    protected abstract boolean mo1078Q0(long j, long j2, AbstractC14284k kVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6722k kVar2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaCrypto, k7.n] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1070U0() {
        /*
            r3 = this;
            r0 = 0
            y7.k r1 = r3.f39488T     // Catch: all -> 0x0033
            if (r1 == 0) goto L_0x0017
            r1.release()     // Catch: all -> 0x0033
            i7.f r1 = r3.f39479N0     // Catch: all -> 0x0033
            int r2 = r1.f17787b     // Catch: all -> 0x0033
            int r2 = r2 + 1
            r1.f17787b = r2     // Catch: all -> 0x0033
            y7.m r1 = r3.f32315a0     // Catch: all -> 0x0033
            java.lang.String r1 = r1.f32304a     // Catch: all -> 0x0033
            r3.mo1090J0(r1)     // Catch: all -> 0x0033
        L_0x0017:
            r3.f39488T = r0
            android.media.MediaCrypto r1 = r3.f39480O     // Catch: all -> 0x0029
            if (r1 == 0) goto L_0x0020
            r1.release()     // Catch: all -> 0x0029
        L_0x0020:
            r3.f39480O = r0
            r3.m1058a1(r0)
            r3.m1064X0()
            return
        L_0x0029:
            r1 = move-exception
            r3.f39480O = r0
            r3.m1058a1(r0)
            r3.m1064X0()
            throw r1
        L_0x0033:
            r1 = move-exception
            r3.f39488T = r0
            android.media.MediaCrypto r2 = r3.f39480O     // Catch: all -> 0x0046
            if (r2 == 0) goto L_0x003d
            r2.release()     // Catch: all -> 0x0046
        L_0x003d:
            r3.f39480O = r0
            r3.m1058a1(r0)
            r3.m1064X0()
            throw r1
        L_0x0046:
            r1 = move-exception
            r3.f39480O = r0
            r3.m1058a1(r0)
            r3.m1064X0()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p439y7.AbstractC14289n.m1070U0():void");
    }

    /* renamed from: V0 */
    protected void mo1068V0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo1066W0() {
        m1062Y0();
        m1060Z0();
        this.f32328n0 = -9223372036854775807L;
        this.f39455B0 = false;
        this.f39453A0 = false;
        this.f32324j0 = false;
        this.f32325k0 = false;
        this.f32332r0 = false;
        this.f32333s0 = false;
        this.f39462F.clear();
        this.f39459D0 = -9223372036854775807L;
        this.f39461E0 = -9223372036854775807L;
        C14283j jVar = this.f32327m0;
        if (jVar != null) {
            jVar.m1144b();
        }
        this.f32342y0 = 0;
        this.f32344z0 = 0;
        this.f32340x0 = this.f32338w0 ? 1 : 0;
    }

    /* renamed from: X0 */
    protected void m1064X0() {
        mo1066W0();
        this.f39477M0 = null;
        this.f32327m0 = null;
        this.f39493Y = null;
        this.f32315a0 = null;
        this.f39489U = null;
        this.f39490V = null;
        this.f39491W = false;
        this.f39457C0 = false;
        this.f39492X = -1.0f;
        this.f32316b0 = 0;
        this.f32317c0 = false;
        this.f32318d0 = false;
        this.f32319e0 = false;
        this.f32320f0 = false;
        this.f32321g0 = false;
        this.f32322h0 = false;
        this.f32323i0 = false;
        this.f32326l0 = false;
        this.f32338w0 = false;
        this.f32340x0 = 0;
        this.f39482P = false;
    }

    /* renamed from: Y */
    protected abstract void mo1063Y(C14288m mVar, AbstractC14284k kVar, C6722k kVar2, MediaCrypto mediaCrypto, float f);

    /* renamed from: Z */
    protected C14287l mo1061Z(Throwable th2, C14288m mVar) {
        return new C14287l(th2, mVar);
    }

    @Override // p079e7.AbstractC6733t
    /* renamed from: a */
    public final int mo166a(C6722k kVar) {
        try {
            return mo1044h1(this.f32339x, kVar);
        } catch (C14300x.C14303c e) {
            throw m24572w(e, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b1 */
    public final void m1056b1() {
        this.f39469I0 = true;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: c */
    public boolean mo165c() {
        return this.f39465G0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void m1054c1(ExoPlaybackException exoPlaybackException) {
        this.f39477M0 = exoPlaybackException;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        if (this.f39472K == null || (!m24585C() && !m1021y0() && (this.f32328n0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f32328n0))) {
            return false;
        }
        return true;
    }

    /* renamed from: f1 */
    protected boolean mo1048f1(C14288m mVar) {
        return true;
    }

    /* renamed from: g0 */
    public void m1047g0(boolean z) {
        this.f39471J0 = z;
    }

    /* renamed from: g1 */
    protected boolean mo1046g1(C6722k kVar) {
        return false;
    }

    /* renamed from: h0 */
    public void m1045h0(boolean z) {
        this.f39473K0 = z;
    }

    /* renamed from: h1 */
    protected abstract int mo1044h1(AbstractC14292p pVar, C6722k kVar);

    /* renamed from: i0 */
    public void m1043i0(boolean z) {
        this.f39475L0 = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l0 */
    public final boolean m1037l0() {
        boolean m0 = m1035m0();
        if (m0) {
            m1097F0();
        }
        return m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public final void m1036l1(long j) {
        boolean z;
        C6722k j2 = this.f39460E.m22278j(j);
        if (j2 == null && this.f39491W) {
            j2 = this.f39460E.m22279i();
        }
        if (j2 != null) {
            this.f39474L = j2;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f39491W && this.f39474L != null)) {
            mo1088L0(this.f39474L, this.f39490V);
            this.f39491W = false;
        }
    }

    /* renamed from: m0 */
    protected boolean m1035m0() {
        if (this.f39488T == null) {
            return false;
        }
        if (this.f32344z0 == 3 || this.f32318d0 || ((this.f32319e0 && !this.f39457C0) || (this.f32320f0 && this.f39455B0))) {
            m1070U0();
            return true;
        }
        m1039k0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public final AbstractC14284k m1033o0() {
        return this.f39488T;
    }

    @Override // p079e7.AbstractC6712b, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: p */
    public void mo1032p(float f, float f2) {
        this.f39486R = f;
        this.f39487S = f2;
        if (this.f39488T != null && this.f32344z0 != 3 && getState() != 0) {
            m1040j1(this.f39489U);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public final C14288m m1031p0() {
        return this.f32315a0;
    }

    @Override // p079e7.AbstractC6712b, p079e7.AbstractC6733t
    /* renamed from: q */
    public final int mo1030q() {
        return 8;
    }

    /* renamed from: q0 */
    protected boolean mo1029q0() {
        return false;
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: r */
    public void mo163r(long j, long j2) {
        if (this.f39469I0) {
            this.f39469I0 = false;
            m1080P0();
        }
        ExoPlaybackException exoPlaybackException = this.f39477M0;
        if (exoPlaybackException == null) {
            try {
                if (this.f39465G0) {
                    mo1068V0();
                } else if (this.f39472K != null || m1074S0(true)) {
                    m1097F0();
                    if (this.f32334t0) {
                        C7546m0.m22245a("bypassRender");
                        while (m1085N(j, j2)) {
                        }
                        C7546m0.m22243c();
                    } else if (this.f39488T != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C7546m0.m22245a("drainAndFeed");
                        while (m1051e0(j, j2) && m1050e1(elapsedRealtime)) {
                        }
                        while (m1041j0() && m1050e1(elapsedRealtime)) {
                        }
                        C7546m0.m22243c();
                    } else {
                        this.f39479N0.f17789d += m24583L(j);
                        m1074S0(false);
                    }
                    this.f39479N0.m20287c();
                }
            } catch (IllegalStateException e) {
                if (m1101C0(e)) {
                    throw m24572w(mo1061Z(e, m1031p0()), this.f39472K);
                }
                throw e;
            }
        } else {
            this.f39477M0 = null;
            throw exoPlaybackException;
        }
    }

    /* renamed from: r0 */
    protected abstract float mo1028r0(float f, C6722k kVar, C6722k[] kVarArr);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s0 */
    public final MediaFormat m1027s0() {
        return this.f39490V;
    }

    /* renamed from: t0 */
    protected abstract List<C14288m> mo1026t0(AbstractC14292p pVar, C6722k kVar, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v0 */
    public final long m1024v0() {
        return this.f39483P0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w0 */
    public float m1023w0() {
        return this.f39486R;
    }

    /* renamed from: x0 */
    protected void mo1022x0(C8223h hVar) {
    }

    /* renamed from: y7.n$a */
    /* loaded from: classes7.dex */
    public static class C14290a extends Exception {

        /* renamed from: k */
        public final String f32345k;

        /* renamed from: l */
        public final boolean f32346l;

        /* renamed from: m */
        public final C14288m f32347m;

        /* renamed from: n */
        public final String f32348n;

        /* renamed from: o */
        public final C14290a f32349o;

        public C14290a(C6722k kVar, Throwable th2, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + kVar, th2, kVar.f14329v, z, null, m1018b(i), null);
        }

        /* renamed from: b */
        private static String m1018b(int i) {
            String str;
            if (i < 0) {
                str = "neg_";
            } else {
                str = "";
            }
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public C14290a m1017c(C14290a aVar) {
            return new C14290a(getMessage(), getCause(), this.f32345k, this.f32346l, this.f32347m, this.f32348n, aVar);
        }

        /* renamed from: d */
        private static String m1016d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public C14290a(C6722k kVar, Throwable th2, boolean z, C14288m mVar) {
            this("Decoder init failed: " + mVar.f32304a + ", " + kVar, th2, kVar.f14329v, z, mVar, C7557q0.f16368a >= 21 ? m1016d(th2) : null, null);
        }

        private C14290a(String str, Throwable th2, String str2, boolean z, C14288m mVar, String str3, C14290a aVar) {
            super(str, th2);
            this.f32345k = str2;
            this.f32346l = z;
            this.f32347m = mVar;
            this.f32348n = str3;
            this.f32349o = aVar;
        }
    }
}
