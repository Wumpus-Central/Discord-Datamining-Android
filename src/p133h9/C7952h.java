package p133h9;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.discord.media.utils.DiscordVideoMediaSource;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6732s;
import p119g9.C7510a;
import p119g9.C7546m0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p133h9.AbstractC7940a0;
import p152i7.C8221f;
import p152i7.C8223h;
import p152i7.C8225i;
import p163j$.util.Spliterator;
import p439y7.AbstractC14284k;
import p439y7.AbstractC14289n;
import p439y7.AbstractC14292p;
import p439y7.C14287l;
import p439y7.C14288m;
import p439y7.C14300x;
import p439y7.C14308y;

/* renamed from: h9.h */
/* loaded from: classes5.dex */
public class C7952h extends AbstractC14289n {

    /* renamed from: E1 */
    private static final int[] f38461E1 = {1920, 1600, 1440, 1280, 960, 854, DiscordVideoMediaSource.DEFAULT_WIDTH, 540, DiscordVideoMediaSource.DEFAULT_HEIGHT};

    /* renamed from: F1 */
    private static boolean f38462F1;

    /* renamed from: G1 */
    private static boolean f38463G1;

    /* renamed from: A1 */
    private boolean f38464A1;

    /* renamed from: B1 */
    private int f38465B1;

    /* renamed from: C1 */
    C7954b f38466C1;

    /* renamed from: D1 */
    private AbstractC7959m f38467D1;

    /* renamed from: S0 */
    private final Context f38468S0;

    /* renamed from: T0 */
    private final C7961o f38469T0;

    /* renamed from: U0 */
    private final AbstractC7940a0.C7941a f38470U0;

    /* renamed from: V0 */
    private final long f38471V0;

    /* renamed from: W0 */
    private final int f38472W0;

    /* renamed from: X0 */
    private final boolean f38473X0;

    /* renamed from: Y0 */
    private C7953a f38474Y0;

    /* renamed from: Z0 */
    private boolean f38475Z0;

    /* renamed from: a1 */
    private boolean f17082a1;

    /* renamed from: b1 */
    private Surface f17083b1;

    /* renamed from: c1 */
    private Surface f17084c1;

    /* renamed from: d1 */
    private boolean f17085d1;

    /* renamed from: e1 */
    private int f17086e1;

    /* renamed from: f1 */
    private boolean f17087f1;

    /* renamed from: g1 */
    private boolean f17088g1;

    /* renamed from: h1 */
    private boolean f17089h1;

    /* renamed from: i1 */
    private long f17090i1;

    /* renamed from: j1 */
    private long f17091j1;

    /* renamed from: k1 */
    private long f17092k1;

    /* renamed from: l1 */
    private int f17093l1;

    /* renamed from: m1 */
    private int f17094m1;

    /* renamed from: n1 */
    private int f17095n1;

    /* renamed from: o1 */
    private long f17096o1;

    /* renamed from: p1 */
    private long f17097p1;

    /* renamed from: q1 */
    private long f17098q1;

    /* renamed from: r1 */
    private int f17099r1;

    /* renamed from: s1 */
    private int f17100s1;

    /* renamed from: t1 */
    private int f17101t1;

    /* renamed from: u1 */
    private int f17102u1;

    /* renamed from: v1 */
    private float f17103v1;

    /* renamed from: w1 */
    private int f17104w1;

    /* renamed from: x1 */
    private int f17105x1;

    /* renamed from: y1 */
    private int f17106y1;

    /* renamed from: z1 */
    private float f17107z1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h9.h$a */
    /* loaded from: classes5.dex */
    public static final class C7953a {

        /* renamed from: a */
        public final int f17108a;

        /* renamed from: b */
        public final int f17109b;

        /* renamed from: c */
        public final int f17110c;

        public C7953a(int i, int i2, int i3) {
            this.f17108a = i;
            this.f17109b = i2;
            this.f17110c = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h9.h$b */
    /* loaded from: classes5.dex */
    public final class C7954b implements AbstractC14284k.AbstractC14286b, Handler.Callback {

        /* renamed from: k */
        private final Handler f17111k;

        public C7954b(AbstractC14284k kVar) {
            Handler y = C7557q0.m22115y(this);
            this.f17111k = y;
            kVar.mo1138e(this, y);
        }

        /* renamed from: b */
        private void m21014b(long j) {
            C7952h hVar = C7952h.this;
            if (this == hVar.f38466C1) {
                if (j == Long.MAX_VALUE) {
                    hVar.m21042M1();
                    return;
                }
                try {
                    hVar.m21043L1(j);
                } catch (ExoPlaybackException e) {
                    C7952h.this.m1054c1(e);
                }
            }
        }

        @Override // p439y7.AbstractC14284k.AbstractC14286b
        /* renamed from: a */
        public void mo1132a(AbstractC14284k kVar, long j, long j2) {
            if (C7557q0.f16368a < 30) {
                this.f17111k.sendMessageAtFrontOfQueue(Message.obtain(this.f17111k, 0, (int) (j >> 32), (int) j));
                return;
            }
            m21014b(j);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m21014b(C7557q0.m22176T0(message.arg1, message.arg2));
            return true;
        }
    }

    public C7952h(Context context, AbstractC14292p pVar, long j, boolean z, Handler handler, AbstractC7940a0 a0Var, int i) {
        this(context, AbstractC14284k.AbstractC14285a.f32301a, pVar, j, z, handler, a0Var, i);
    }

    /* renamed from: B1 */
    private static boolean m21053B1(long j) {
        return j < -30000;
    }

    /* renamed from: C1 */
    private static boolean m21052C1(long j) {
        return j < -500000;
    }

    /* renamed from: E1 */
    private void m21050E1() {
        if (this.f17093l1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f38470U0.m21093m(this.f17093l1, elapsedRealtime - this.f17092k1);
            this.f17093l1 = 0;
            this.f17092k1 = elapsedRealtime;
        }
    }

    /* renamed from: G1 */
    private void m21048G1() {
        int i = this.f17099r1;
        if (i != 0) {
            this.f38470U0.m21080z(this.f17098q1, i);
            this.f17098q1 = 0L;
            this.f17099r1 = 0;
        }
    }

    /* renamed from: H1 */
    private void m21047H1() {
        int i = this.f17100s1;
        if (i != -1 || this.f17101t1 != -1) {
            if (this.f17104w1 != i || this.f17105x1 != this.f17101t1 || this.f17106y1 != this.f17102u1 || this.f17107z1 != this.f17103v1) {
                this.f38470U0.m21106A(i, this.f17101t1, this.f17102u1, this.f17103v1);
                this.f17104w1 = this.f17100s1;
                this.f17105x1 = this.f17101t1;
                this.f17106y1 = this.f17102u1;
                this.f17107z1 = this.f17103v1;
            }
        }
    }

    /* renamed from: I1 */
    private void m21046I1() {
        if (this.f17085d1) {
            this.f38470U0.m21081y(this.f17083b1);
        }
    }

    /* renamed from: J1 */
    private void m21045J1() {
        int i = this.f17104w1;
        if (i != -1 || this.f17105x1 != -1) {
            this.f38470U0.m21106A(i, this.f17105x1, this.f17106y1, this.f17107z1);
        }
    }

    /* renamed from: K1 */
    private void m21044K1(long j, long j2, C6722k kVar) {
        AbstractC7959m mVar = this.f38467D1;
        if (mVar != null) {
            mVar.mo21012b(j, j2, kVar, m1027s0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public void m21042M1() {
        m1056b1();
    }

    /* renamed from: P1 */
    private static void m21039P1(AbstractC14284k kVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        kVar.setParameters(bundle);
    }

    /* renamed from: Q1 */
    private void m21038Q1() {
        long j;
        if (this.f38471V0 > 0) {
            j = SystemClock.elapsedRealtime() + this.f38471V0;
        } else {
            j = -9223372036854775807L;
        }
        this.f17091j1 = j;
    }

    /* renamed from: S1 */
    private void m21036S1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f17084c1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C14288m p0 = m1031p0();
                if (p0 != null && m21032W1(p0)) {
                    surface = C7945d.m21074e(this.f38468S0, p0.f32310g);
                    this.f17084c1 = surface;
                }
            }
        }
        if (this.f17083b1 != surface) {
            this.f17083b1 = surface;
            this.f38469T0.m20996o(surface);
            this.f17085d1 = false;
            int state = getState();
            AbstractC14284k o0 = m1033o0();
            if (o0 != null) {
                if (C7557q0.f16368a < 23 || surface == null || this.f38475Z0) {
                    m1070U0();
                    m1097F0();
                } else {
                    m21037R1(o0, surface);
                }
            }
            if (surface == null || surface == this.f17084c1) {
                m21025p1();
                m21026o1();
                return;
            }
            m21045J1();
            m21026o1();
            if (state == 2) {
                m21038Q1();
            }
        } else if (surface != null && surface != this.f17084c1) {
            m21045J1();
            m21046I1();
        }
    }

    /* renamed from: W1 */
    private boolean m21032W1(C14288m mVar) {
        if (C7557q0.f16368a < 23 || this.f38464A1 || m21024q1(mVar.f32304a) || (mVar.f32310g && !C7945d.m21075b(this.f38468S0))) {
            return false;
        }
        return true;
    }

    /* renamed from: o1 */
    private void m21026o1() {
        AbstractC14284k o0;
        this.f17087f1 = false;
        if (C7557q0.f16368a >= 23 && this.f38464A1 && (o0 = m1033o0()) != null) {
            this.f38466C1 = new C7954b(o0);
        }
    }

    /* renamed from: p1 */
    private void m21025p1() {
        this.f17104w1 = -1;
        this.f17105x1 = -1;
        this.f17107z1 = -1.0f;
        this.f17106y1 = -1;
    }

    /* renamed from: r1 */
    private static void m21023r1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: s1 */
    private static boolean m21022s1() {
        return "NVIDIA".equals(C7557q0.f16370c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x07cd, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x082f, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0827;
     */
    /* renamed from: u1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m21020u1() {
        /*
            Method dump skipped, instructions count: 3044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p133h9.C7952h.m21020u1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: v1 */
    private static int m21019v1(C14288m mVar, String str, int i, int i2) {
        char c;
        int i3;
        if (!(i == -1 || i2 == -1)) {
            str.hashCode();
            int i4 = 4;
            switch (str.hashCode()) {
                case -1851077871:
                    if (str.equals("video/dolby-vision")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c = 6;
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
                case 4:
                    String str2 = C7557q0.f16371d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(C7557q0.f16370c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mVar.f32310g)))) {
                        i3 = C7557q0.m22141l(i, 16) * C7557q0.m22141l(i2, 16) * 16 * 16;
                        i4 = 2;
                        break;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                    i3 = i * i2;
                    i4 = 2;
                    break;
                case 2:
                case 6:
                    i3 = i * i2;
                    break;
                default:
                    return -1;
            }
            return (i3 * 3) / (i4 * 2);
        }
        return -1;
    }

    /* renamed from: w1 */
    private static Point m21018w1(C14288m mVar, C6722k kVar) {
        boolean z;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4 = kVar.f37962B;
        int i5 = kVar.f37961A;
        if (i4 > i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i4;
        } else {
            i = i5;
        }
        if (z) {
            i4 = i5;
        }
        float f = i4 / i;
        for (int i6 : f38461E1) {
            int i7 = (int) (i6 * f);
            if (i6 <= i || i7 <= i4) {
                break;
            }
            if (C7557q0.f16368a >= 21) {
                if (z) {
                    i3 = i7;
                } else {
                    i3 = i6;
                }
                if (!z) {
                    i6 = i7;
                }
                Point b = mVar.m1128b(i3, i6);
                if (mVar.m1110t(b.x, b.y, kVar.f37963C)) {
                    return b;
                }
            } else {
                try {
                    int l = C7557q0.m22141l(i6, 16) * 16;
                    int l2 = C7557q0.m22141l(i7, 16) * 16;
                    if (l * l2 <= C14300x.m999M()) {
                        if (z) {
                            i2 = l2;
                        } else {
                            i2 = l;
                        }
                        if (!z) {
                            l = l2;
                        }
                        return new Point(i2, l);
                    }
                } catch (C14300x.C14303c unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: y1 */
    private static List<C14288m> m21016y1(AbstractC14292p pVar, C6722k kVar, boolean z, boolean z2) {
        Pair<Integer, Integer> p;
        String str = kVar.f14329v;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C14288m> t = C14300x.m975t(pVar.mo1015a(str, z, z2), kVar);
        if ("video/dolby-vision".equals(str) && (p = C14300x.m979p(kVar)) != null) {
            int intValue = ((Integer) p.first).intValue();
            if (intValue == 16 || intValue == 256) {
                t.addAll(pVar.mo1015a("video/hevc", z, z2));
            } else if (intValue == 512) {
                t.addAll(pVar.mo1015a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(t);
    }

    /* renamed from: z1 */
    protected static int m21015z1(C14288m mVar, C6722k kVar) {
        if (kVar.f14330w == -1) {
            return m21019v1(mVar, kVar.f14329v, kVar.f37961A, kVar.f37962B);
        }
        int size = kVar.f14331x.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += kVar.f14331x.get(i2).length;
        }
        return kVar.f14330w + i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: A1 */
    protected MediaFormat m21054A1(C6722k kVar, String str, C7953a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> p;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", kVar.f37961A);
        mediaFormat.setInteger("height", kVar.f37962B);
        C14308y.m957e(mediaFormat, kVar.f14331x);
        C14308y.m959c(mediaFormat, "frame-rate", kVar.f37963C);
        C14308y.m958d(mediaFormat, "rotation-degrees", kVar.f37964D);
        C14308y.m960b(mediaFormat, kVar.f37968H);
        if ("video/dolby-vision".equals(kVar.f14329v) && (p = C14300x.m979p(kVar)) != null) {
            C14308y.m958d(mediaFormat, "profile", ((Integer) p.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f17108a);
        mediaFormat.setInteger("max-height", aVar.f17109b);
        C14308y.m958d(mediaFormat, "max-input-size", aVar.f17110c);
        if (C7557q0.f16368a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m21023r1(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: D */
    public void mo173D() {
        m21025p1();
        m21026o1();
        this.f17085d1 = false;
        this.f38469T0.m21004g();
        this.f38466C1 = null;
        try {
            super.mo173D();
        } finally {
            this.f38470U0.m21094l(this.f39479N0);
        }
    }

    /* renamed from: D1 */
    protected boolean m21051D1(long j, boolean z) {
        int L = m24583L(j);
        if (L == 0) {
            return false;
        }
        C8221f fVar = this.f39479N0;
        fVar.f17794i++;
        int i = this.f17095n1 + L;
        if (z) {
            fVar.f17791f += i;
        } else {
            m21030Y1(i);
        }
        m1037l0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: E */
    public void mo1099E(boolean z, boolean z2) {
        boolean z3;
        super.mo1099E(z, z2);
        boolean z4 = m24570y().f14366a;
        if (!z4 || this.f38465B1 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C7510a.m22366f(z3);
        if (this.f38464A1 != z4) {
            this.f38464A1 = z4;
            m1070U0();
        }
        this.f38470U0.m21092n(this.f39479N0);
        this.f38469T0.m21003h();
        this.f17088g1 = z2;
        this.f17089h1 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: F */
    public void mo172F(long j, boolean z) {
        super.mo172F(j, z);
        m21026o1();
        this.f38469T0.m20999l();
        this.f17096o1 = -9223372036854775807L;
        this.f17090i1 = -9223372036854775807L;
        this.f17094m1 = 0;
        if (z) {
            m21038Q1();
        } else {
            this.f17091j1 = -9223372036854775807L;
        }
    }

    /* renamed from: F1 */
    void m21049F1() {
        this.f17089h1 = true;
        if (!this.f17087f1) {
            this.f17087f1 = true;
            this.f38470U0.m21081y(this.f17083b1);
            this.f17085d1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: G */
    public void mo1096G() {
        try {
            super.mo1096G();
            Surface surface = this.f17084c1;
            if (surface != null) {
                if (this.f17083b1 == surface) {
                    this.f17083b1 = null;
                }
                surface.release();
                this.f17084c1 = null;
            }
        } catch (Throwable th2) {
            if (this.f17084c1 != null) {
                Surface surface2 = this.f17083b1;
                Surface surface3 = this.f17084c1;
                if (surface2 == surface3) {
                    this.f17083b1 = null;
                }
                surface3.release();
                this.f17084c1 = null;
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: H */
    public void mo1094H() {
        super.mo1094H();
        this.f17093l1 = 0;
        this.f17092k1 = SystemClock.elapsedRealtime();
        this.f17097p1 = SystemClock.elapsedRealtime() * 1000;
        this.f17098q1 = 0L;
        this.f17099r1 = 0;
        this.f38469T0.m20998m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: I */
    public void mo1092I() {
        this.f17091j1 = -9223372036854775807L;
        m21050E1();
        m21048G1();
        this.f38469T0.m20997n();
        super.mo1092I();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: I0 */
    protected void mo1091I0(String str, long j, long j2) {
        this.f38470U0.m21096j(str, j, j2);
        this.f38475Z0 = m21024q1(str);
        this.f17082a1 = ((C14288m) C7510a.m22367e(m1031p0())).m1116n();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: J0 */
    protected void mo1090J0(String str) {
        this.f38470U0.m21095k(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: K0 */
    public C8225i mo1089K0(C6725l lVar) {
        C8225i K0 = super.mo1089K0(lVar);
        this.f38470U0.m21091o(lVar.f14361b, K0);
        return K0;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: L0 */
    protected void mo1088L0(C6722k kVar, MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        AbstractC14284k o0 = m1033o0();
        if (o0 != null) {
            o0.mo1141b(this.f17086e1);
        }
        if (this.f38464A1) {
            this.f17100s1 = kVar.f37961A;
            this.f17101t1 = kVar.f37962B;
        } else {
            C7510a.m22367e(mediaFormat);
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f17100s1 = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f17101t1 = i2;
        }
        float f = kVar.f37965E;
        this.f17103v1 = f;
        if (C7557q0.f16368a >= 21) {
            int i3 = kVar.f37964D;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f17100s1;
                this.f17100s1 = this.f17101t1;
                this.f17101t1 = i4;
                this.f17103v1 = 1.0f / f;
            }
        } else {
            this.f17102u1 = kVar.f37964D;
        }
        this.f38469T0.m21002i(kVar.f37963C);
    }

    /* renamed from: L1 */
    protected void m21043L1(long j) {
        m1036l1(j);
        m21047H1();
        this.f39479N0.f17790e++;
        m21049F1();
        mo1086M0(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: M0 */
    public void mo1086M0(long j) {
        super.mo1086M0(j);
        if (!this.f38464A1) {
            this.f17095n1--;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: N0 */
    public void mo1084N0() {
        super.mo1084N0();
        m21026o1();
    }

    /* renamed from: N1 */
    protected void m21041N1(AbstractC14284k kVar, int i, long j) {
        m21047H1();
        C7546m0.m22245a("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i, true);
        C7546m0.m22243c();
        this.f17097p1 = SystemClock.elapsedRealtime() * 1000;
        this.f39479N0.f17790e++;
        this.f17094m1 = 0;
        m21049F1();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: O */
    protected C8225i mo1083O(C14288m mVar, C6722k kVar, C6722k kVar2) {
        int i;
        C8225i e = mVar.m1125e(kVar, kVar2);
        int i2 = e.f17810e;
        int i3 = kVar2.f37961A;
        C7953a aVar = this.f38474Y0;
        if (i3 > aVar.f17108a || kVar2.f37962B > aVar.f17109b) {
            i2 |= Spliterator.NONNULL;
        }
        if (m21015z1(mVar, kVar2) > this.f38474Y0.f17110c) {
            i2 |= 64;
        }
        String str = mVar.f32304a;
        if (i2 != 0) {
            i = 0;
        } else {
            i = e.f17809d;
        }
        return new C8225i(str, kVar, kVar2, i, i2);
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: O0 */
    protected void mo1082O0(C8223h hVar) {
        boolean z = this.f38464A1;
        if (!z) {
            this.f17095n1++;
        }
        if (C7557q0.f16368a < 23 && z) {
            m21043L1(hVar.f17800o);
        }
    }

    /* renamed from: O1 */
    protected void m21040O1(AbstractC14284k kVar, int i, long j, long j2) {
        m21047H1();
        C7546m0.m22245a("releaseOutputBuffer");
        kVar.mo1137f(i, j2);
        C7546m0.m22243c();
        this.f17097p1 = SystemClock.elapsedRealtime() * 1000;
        this.f39479N0.f17790e++;
        this.f17094m1 = 0;
        m21049F1();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: Q0 */
    protected boolean mo1078Q0(long j, long j2, AbstractC14284k kVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6722k kVar2) {
        long j4;
        boolean z3;
        C7510a.m22367e(kVar);
        if (this.f17090i1 == -9223372036854775807L) {
            this.f17090i1 = j;
        }
        if (j3 != this.f17096o1) {
            this.f38469T0.m21001j(j3);
            this.f17096o1 = j3;
        }
        long v0 = m1024v0();
        long j5 = j3 - v0;
        if (!z || z2) {
            double w0 = m1023w0();
            boolean z4 = getState() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j6 = (long) ((j3 - j) / w0);
            if (z4) {
                j6 -= elapsedRealtime - j2;
            }
            if (this.f17083b1 != this.f17084c1) {
                long j7 = elapsedRealtime - this.f17097p1;
                if (this.f17089h1 ? this.f17087f1 : !z4 && !this.f17088g1) {
                    j4 = j7;
                    z3 = false;
                } else {
                    z3 = true;
                    j4 = j7;
                }
                if (this.f17091j1 == -9223372036854775807L && j >= v0 && (z3 || (z4 && m21033V1(j6, j4)))) {
                    long nanoTime = System.nanoTime();
                    m21044K1(j5, nanoTime, kVar2);
                    if (C7557q0.f16368a >= 21) {
                        m21040O1(kVar, i, j5, nanoTime);
                    } else {
                        m21041N1(kVar, i, j5);
                    }
                    m21029Z1(j6);
                    return true;
                }
                if (z4 && j != this.f17090i1) {
                    long nanoTime2 = System.nanoTime();
                    long b = this.f38469T0.m21009b((j6 * 1000) + nanoTime2);
                    long j8 = (b - nanoTime2) / 1000;
                    boolean z5 = this.f17091j1 != -9223372036854775807L;
                    if (m21035T1(j8, j2, z2) && m21051D1(j, z5)) {
                        return false;
                    }
                    if (m21034U1(j8, j2, z2)) {
                        if (z5) {
                            m21031X1(kVar, i, j5);
                        } else {
                            m21021t1(kVar, i, j5);
                        }
                        m21029Z1(j8);
                        return true;
                    } else if (C7557q0.f16368a >= 21) {
                        if (j8 < 50000) {
                            m21044K1(j5, b, kVar2);
                            m21040O1(kVar, i, j5, b);
                            m21029Z1(j8);
                            return true;
                        }
                    } else if (j8 < 30000) {
                        if (j8 > 11000) {
                            try {
                                Thread.sleep((j8 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m21044K1(j5, b, kVar2);
                        m21041N1(kVar, i, j5);
                        m21029Z1(j8);
                        return true;
                    }
                }
                return false;
            } else if (!m21053B1(j6)) {
                return false;
            } else {
                m21031X1(kVar, i, j5);
                m21029Z1(j6);
                return true;
            }
        } else {
            m21031X1(kVar, i, j5);
            return true;
        }
    }

    /* renamed from: R1 */
    protected void m21037R1(AbstractC14284k kVar, Surface surface) {
        kVar.mo1139d(surface);
    }

    /* renamed from: T1 */
    protected boolean m21035T1(long j, long j2, boolean z) {
        return m21052C1(j) && !z;
    }

    /* renamed from: U1 */
    protected boolean m21034U1(long j, long j2, boolean z) {
        return m21053B1(j) && !z;
    }

    /* renamed from: V1 */
    protected boolean m21033V1(long j, long j2) {
        return m21053B1(j) && j2 > 100000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: W0 */
    public void mo1066W0() {
        super.mo1066W0();
        this.f17095n1 = 0;
    }

    /* renamed from: X1 */
    protected void m21031X1(AbstractC14284k kVar, int i, long j) {
        C7546m0.m22245a("skipVideoBuffer");
        kVar.releaseOutputBuffer(i, false);
        C7546m0.m22243c();
        this.f39479N0.f17791f++;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: Y */
    protected void mo1063Y(C14288m mVar, AbstractC14284k kVar, C6722k kVar2, MediaCrypto mediaCrypto, float f) {
        int i;
        String str = mVar.f32306c;
        C7953a x1 = m21017x1(mVar, kVar2, m24586B());
        this.f38474Y0 = x1;
        boolean z = this.f38473X0;
        if (this.f38464A1) {
            i = this.f38465B1;
        } else {
            i = 0;
        }
        MediaFormat A1 = m21054A1(kVar2, str, x1, f, z, i);
        if (this.f17083b1 == null) {
            if (m21032W1(mVar)) {
                if (this.f17084c1 == null) {
                    this.f17084c1 = C7945d.m21074e(this.f38468S0, mVar.f32310g);
                }
                this.f17083b1 = this.f17084c1;
            } else {
                throw new IllegalStateException();
            }
        }
        kVar.configure(A1, this.f17083b1, mediaCrypto, 0);
        if (C7557q0.f16368a >= 23 && this.f38464A1) {
            this.f38466C1 = new C7954b(kVar);
        }
    }

    /* renamed from: Y1 */
    protected void m21030Y1(int i) {
        C8221f fVar = this.f39479N0;
        fVar.f17792g += i;
        this.f17093l1 += i;
        int i2 = this.f17094m1 + i;
        this.f17094m1 = i2;
        fVar.f17793h = Math.max(i2, fVar.f17793h);
        int i3 = this.f38472W0;
        if (i3 > 0 && this.f17093l1 >= i3) {
            m21050E1();
        }
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: Z */
    protected C14287l mo1061Z(Throwable th2, C14288m mVar) {
        return new C7951g(th2, mVar, this.f17083b1);
    }

    /* renamed from: Z1 */
    protected void m21029Z1(long j) {
        this.f39479N0.m20289a(j);
        this.f17098q1 += j;
        this.f17099r1++;
    }

    @Override // p439y7.AbstractC14289n, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        Surface surface;
        if (super.mo164e() && (this.f17087f1 || (((surface = this.f17084c1) != null && this.f17083b1 == surface) || m1033o0() == null || this.f38464A1))) {
            this.f17091j1 = -9223372036854775807L;
            return true;
        } else if (this.f17091j1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f17091j1) {
                return true;
            }
            this.f17091j1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: f1 */
    protected boolean mo1048f1(C14288m mVar) {
        return this.f17083b1 != null || m21032W1(mVar);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: h1 */
    protected int mo1044h1(AbstractC14292p pVar, C6722k kVar) {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        if (!C7562u.m22069s(kVar.f14329v)) {
            return C6732s.m24429a(0);
        }
        if (kVar.f14332y != null) {
            z = true;
        } else {
            z = false;
        }
        List<C14288m> y1 = m21016y1(pVar, kVar, z, false);
        if (z && y1.isEmpty()) {
            y1 = m21016y1(pVar, kVar, false, false);
        }
        if (y1.isEmpty()) {
            return C6732s.m24429a(1);
        }
        if (!AbstractC14289n.m1042i1(kVar)) {
            return C6732s.m24429a(2);
        }
        C14288m mVar = y1.get(0);
        boolean m = mVar.m1117m(kVar);
        if (mVar.m1115o(kVar)) {
            i = 16;
        } else {
            i = 8;
        }
        if (m) {
            List<C14288m> y12 = m21016y1(pVar, kVar, z, true);
            if (!y12.isEmpty()) {
                C14288m mVar2 = y12.get(0);
                if (mVar2.m1117m(kVar) && mVar2.m1115o(kVar)) {
                    i3 = 32;
                }
            }
        }
        if (m) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        return C6732s.m24428b(i2, i, i3);
    }

    @Override // p079e7.AbstractC6712b, com.google.android.exoplayer2.C5218r0.AbstractC5220b
    /* renamed from: i */
    public void mo19982i(int i, Object obj) {
        if (i == 1) {
            m21036S1((Surface) obj);
        } else if (i == 4) {
            this.f17086e1 = ((Integer) obj).intValue();
            AbstractC14284k o0 = m1033o0();
            if (o0 != null) {
                o0.mo1141b(this.f17086e1);
            }
        } else if (i == 6) {
            this.f38467D1 = (AbstractC7959m) obj;
        } else if (i != 102) {
            super.mo19982i(i, obj);
        } else {
            int intValue = ((Integer) obj).intValue();
            if (this.f38465B1 != intValue) {
                this.f38465B1 = intValue;
                if (this.f38464A1) {
                    m1070U0();
                }
            }
        }
    }

    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: p */
    public void mo1032p(float f, float f2) {
        super.mo1032p(f, f2);
        this.f38469T0.m21000k(f);
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: q0 */
    protected boolean mo1029q0() {
        return this.f38464A1 && C7557q0.f16368a < 23;
    }

    /* renamed from: q1 */
    protected boolean m21024q1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C7952h.class) {
            if (!f38462F1) {
                f38463G1 = m21020u1();
                f38462F1 = true;
            }
        }
        return f38463G1;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: r0 */
    protected float mo1028r0(float f, C6722k kVar, C6722k[] kVarArr) {
        float f2 = -1.0f;
        for (C6722k kVar2 : kVarArr) {
            float f3 = kVar2.f37963C;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: t0 */
    protected List<C14288m> mo1026t0(AbstractC14292p pVar, C6722k kVar, boolean z) {
        return m21016y1(pVar, kVar, z, this.f38464A1);
    }

    /* renamed from: t1 */
    protected void m21021t1(AbstractC14284k kVar, int i, long j) {
        C7546m0.m22245a("dropVideoBuffer");
        kVar.releaseOutputBuffer(i, false);
        C7546m0.m22243c();
        m21030Y1(1);
    }

    @Override // p439y7.AbstractC14289n
    @TargetApi(29)
    /* renamed from: x0 */
    protected void mo1022x0(C8223h hVar) {
        if (this.f17082a1) {
            ByteBuffer byteBuffer = (ByteBuffer) C7510a.m22367e(hVar.f17801p);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m21039P1(m1033o0(), bArr);
                }
            }
        }
    }

    /* renamed from: x1 */
    protected C7953a m21017x1(C14288m mVar, C6722k kVar, C6722k[] kVarArr) {
        boolean z;
        int v1;
        int i = kVar.f37961A;
        int i2 = kVar.f37962B;
        int z1 = m21015z1(mVar, kVar);
        if (kVarArr.length == 1) {
            if (!(z1 == -1 || (v1 = m21019v1(mVar, kVar.f14329v, kVar.f37961A, kVar.f37962B)) == -1)) {
                z1 = Math.min((int) (z1 * 1.5f), v1);
            }
            return new C7953a(i, i2, z1);
        }
        int length = kVarArr.length;
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            C6722k kVar2 = kVarArr[i3];
            if (kVar.f37968H != null && kVar2.f37968H == null) {
                kVar2 = kVar2.m24531a().m24514J(kVar.f37968H).m24519E();
            }
            if (mVar.m1125e(kVar, kVar2).f17809d != 0) {
                int i4 = kVar2.f37961A;
                if (i4 == -1 || kVar2.f37962B == -1) {
                    z = true;
                } else {
                    z = false;
                }
                z2 |= z;
                i = Math.max(i, i4);
                i2 = Math.max(i2, kVar2.f37962B);
                z1 = Math.max(z1, m21015z1(mVar, kVar2));
            }
        }
        if (z2) {
            C7558r.m22104h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point w1 = m21018w1(mVar, kVar);
            if (w1 != null) {
                i = Math.max(i, w1.x);
                i2 = Math.max(i2, w1.y);
                z1 = Math.max(z1, m21019v1(mVar, kVar.f14329v, i, i2));
                C7558r.m22104h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C7953a(i, i2, z1);
    }

    public C7952h(Context context, AbstractC14284k.AbstractC14285a aVar, AbstractC14292p pVar, long j, boolean z, Handler handler, AbstractC7940a0 a0Var, int i) {
        super(2, aVar, pVar, z, 30.0f);
        this.f38471V0 = j;
        this.f38472W0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f38468S0 = applicationContext;
        this.f38469T0 = new C7961o(applicationContext);
        this.f38470U0 = new AbstractC7940a0.C7941a(handler, a0Var);
        this.f38473X0 = m21022s1();
        this.f17091j1 = -9223372036854775807L;
        this.f17100s1 = -1;
        this.f17101t1 = -1;
        this.f17103v1 = -1.0f;
        this.f17086e1 = 1;
        this.f38465B1 = 0;
        m21025p1();
    }
}
