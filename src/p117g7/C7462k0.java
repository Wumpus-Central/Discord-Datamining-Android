package p117g7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.AbstractC5252t0;
import com.google.android.exoplayer2.PlaybackParameters;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6732s;
import p117g7.AbstractC7478r;
import p117g7.AbstractC7481s;
import p119g9.AbstractC7561t;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7562u;
import p152i7.C8223h;
import p152i7.C8225i;
import p439y7.AbstractC14284k;
import p439y7.AbstractC14289n;
import p439y7.AbstractC14292p;
import p439y7.C14288m;
import p439y7.C14300x;
import p439y7.C14308y;

/* renamed from: g7.k0 */
/* loaded from: classes7.dex */
public class C7462k0 extends AbstractC14289n implements AbstractC7561t {

    /* renamed from: S0 */
    private final Context f38357S0;

    /* renamed from: T0 */
    private final AbstractC7478r.C7479a f38358T0;

    /* renamed from: U0 */
    private final AbstractC7481s f38359U0;

    /* renamed from: V0 */
    private int f38360V0;

    /* renamed from: W0 */
    private boolean f38361W0;

    /* renamed from: X0 */
    private C6722k f38362X0;

    /* renamed from: Y0 */
    private long f38363Y0;

    /* renamed from: Z0 */
    private boolean f38364Z0;

    /* renamed from: a1 */
    private boolean f16100a1;

    /* renamed from: b1 */
    private boolean f16101b1;

    /* renamed from: c1 */
    private boolean f16102c1;

    /* renamed from: d1 */
    private AbstractC5252t0.AbstractC5253a f16103d1;

    /* renamed from: g7.k0$b */
    /* loaded from: classes7.dex */
    private final class C7464b implements AbstractC7481s.AbstractC7484c {
        private C7464b() {
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: a */
        public void mo22459a(boolean z) {
            C7462k0.this.f38358T0.m22485z(z);
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: b */
        public void mo22458b(long j) {
            C7462k0.this.f38358T0.m22486y(j);
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: c */
        public void mo22457c(Exception exc) {
            C7462k0.this.f38358T0.m22501j(exc);
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: d */
        public void mo22456d(long j) {
            if (C7462k0.this.f16103d1 != null) {
                C7462k0.this.f16103d1.mo29829b(j);
            }
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: e */
        public void mo22455e(int i, long j, long j2) {
            C7462k0.this.f38358T0.m22511A(i, j, j2);
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: f */
        public void mo22454f() {
            C7462k0.this.m22579t1();
        }

        @Override // p117g7.AbstractC7481s.AbstractC7484c
        /* renamed from: g */
        public void mo22453g() {
            if (C7462k0.this.f16103d1 != null) {
                C7462k0.this.f16103d1.mo29830a();
            }
        }
    }

    public C7462k0(Context context, AbstractC14292p pVar, boolean z, Handler handler, AbstractC7478r rVar, AbstractC7481s sVar) {
        this(context, AbstractC14284k.AbstractC14285a.f32301a, pVar, z, handler, rVar, sVar);
    }

    /* renamed from: o1 */
    private static boolean m22584o1(String str) {
        if (C7557q0.f16368a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C7557q0.f16370c)) {
            String str2 = C7557q0.f16369b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p1 */
    private static boolean m22583p1() {
        if (C7557q0.f16368a == 23) {
            String str = C7557q0.f16371d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q1 */
    private int m22582q1(C14288m mVar, C6722k kVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mVar.f32304a) || (i = C7557q0.f16368a) >= 24 || (i == 23 && C7557q0.m22126s0(this.f38357S0))) {
            return kVar.f14330w;
        }
        return -1;
    }

    /* renamed from: u1 */
    private void m22578u1() {
        long s = this.f38359U0.mo22465s(mo165c());
        if (s != Long.MIN_VALUE) {
            if (!this.f16100a1) {
                s = Math.max(this.f38363Y0, s);
            }
            this.f38363Y0 = s;
            this.f16100a1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: D */
    public void mo173D() {
        this.f16101b1 = true;
        try {
            this.f38359U0.flush();
            try {
                super.mo173D();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.mo173D();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: E */
    public void mo1099E(boolean z, boolean z2) {
        super.mo1099E(z, z2);
        this.f38358T0.m22497n(this.f39479N0);
        if (m24570y().f14366a) {
            this.f38359U0.mo22462v();
        } else {
            this.f38359U0.mo22473k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: F */
    public void mo172F(long j, boolean z) {
        super.mo172F(j, z);
        if (this.f16102c1) {
            this.f38359U0.mo22468p();
        } else {
            this.f38359U0.flush();
        }
        this.f38363Y0 = j;
        this.f38364Z0 = true;
        this.f16100a1 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: G */
    public void mo1096G() {
        try {
            super.mo1096G();
        } finally {
            if (this.f16101b1) {
                this.f16101b1 = false;
                this.f38359U0.reset();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: H */
    public void mo1094H() {
        super.mo1094H();
        this.f38359U0.mo22461w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n, p079e7.AbstractC6712b
    /* renamed from: I */
    public void mo1092I() {
        m22578u1();
        this.f38359U0.mo22474j();
        super.mo1092I();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: I0 */
    protected void mo1091I0(String str, long j, long j2) {
        this.f38358T0.m22500k(str, j, j2);
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: J0 */
    protected void mo1090J0(String str) {
        this.f38358T0.m22499l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: K0 */
    public C8225i mo1089K0(C6725l lVar) {
        C8225i K0 = super.mo1089K0(lVar);
        this.f38358T0.m22496o(lVar.f14361b, K0);
        return K0;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: L0 */
    protected void mo1088L0(C6722k kVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        C6722k kVar2 = this.f38362X0;
        int[] iArr = null;
        if (kVar2 != null) {
            kVar = kVar2;
        } else if (m1033o0() != null) {
            if ("audio/raw".equals(kVar.f14329v)) {
                i = kVar.f37971K;
            } else if (C7557q0.f16368a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = C7557q0.m22162a0(mediaFormat.getInteger("v-bits-per-sample"));
            } else if ("audio/raw".equals(kVar.f14329v)) {
                i = kVar.f37971K;
            } else {
                i = 2;
            }
            C6722k E = new C6722k.C6724b().m24488e0("audio/raw").m24499Y(i).m24511M(kVar.f37972L).m24510N(kVar.f37973M).m24516H(mediaFormat.getInteger("channel-count")).m24486f0(mediaFormat.getInteger("sample-rate")).m24519E();
            if (this.f38361W0 && E.f37969I == 6 && (i2 = kVar.f37969I) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < kVar.f37969I; i3++) {
                    iArr[i3] = i3;
                }
            }
            kVar = E;
        }
        try {
            this.f38359U0.mo22471m(kVar, 0, iArr);
        } catch (AbstractC7481s.C7482a e) {
            throw m24572w(e, e.f16193k);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p439y7.AbstractC14289n
    /* renamed from: N0 */
    public void mo1084N0() {
        super.mo1084N0();
        this.f38359U0.mo22464t();
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: O */
    protected C8225i mo1083O(C14288m mVar, C6722k kVar, C6722k kVar2) {
        int i;
        C8225i e = mVar.m1125e(kVar, kVar2);
        int i2 = e.f17810e;
        if (m22582q1(mVar, kVar2) > this.f38360V0) {
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
        if (this.f38364Z0 && !hVar.m20300j()) {
            if (Math.abs(hVar.f17800o - this.f38363Y0) > 500000) {
                this.f38363Y0 = hVar.f17800o;
            }
            this.f38364Z0 = false;
        }
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: Q0 */
    protected boolean mo1078Q0(long j, long j2, AbstractC14284k kVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6722k kVar2) {
        C7510a.m22367e(byteBuffer);
        if (this.f38362X0 != null && (i2 & 2) != 0) {
            ((AbstractC14284k) C7510a.m22367e(kVar)).releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            if (kVar != null) {
                kVar.releaseOutputBuffer(i, false);
            }
            this.f39479N0.f17791f += i3;
            this.f38359U0.mo22464t();
            return true;
        } else {
            try {
                if (!this.f38359U0.mo22469o(byteBuffer, j3, i3)) {
                    return false;
                }
                if (kVar != null) {
                    kVar.releaseOutputBuffer(i, false);
                }
                this.f39479N0.f17790e += i3;
                return true;
            } catch (AbstractC7481s.C7483b e) {
                throw m24571x(e, e.f16196m, e.f16195l);
            } catch (AbstractC7481s.C7485d e2) {
                throw m24571x(e2, kVar2, e2.f16198l);
            }
        }
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: V0 */
    protected void mo1068V0() {
        try {
            this.f38359U0.mo22466r();
        } catch (AbstractC7481s.C7485d e) {
            throw m24571x(e, e.f16199m, e.f16198l);
        }
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: Y */
    protected void mo1063Y(C14288m mVar, AbstractC14284k kVar, C6722k kVar2, MediaCrypto mediaCrypto, float f) {
        this.f38360V0 = m22581r1(mVar, kVar2, m24586B());
        this.f38361W0 = m22584o1(mVar.f32304a);
        boolean z = false;
        kVar.configure(m22580s1(kVar2, mVar.f32306c, this.f38360V0, f), null, mediaCrypto, 0);
        if ("audio/raw".equals(mVar.f32305b) && !"audio/raw".equals(kVar2.f14329v)) {
            z = true;
        }
        if (!z) {
            kVar2 = null;
        }
        this.f38362X0 = kVar2;
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: b */
    public PlaybackParameters mo22090b() {
        return this.f38359U0.mo22480b();
    }

    @Override // p439y7.AbstractC14289n, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: c */
    public boolean mo165c() {
        return super.mo165c() && this.f38359U0.mo22479c();
    }

    @Override // p439y7.AbstractC14289n, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: e */
    public boolean mo164e() {
        return this.f38359U0.mo22476h() || super.mo164e();
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: f */
    public void mo22089f(PlaybackParameters playbackParameters) {
        this.f38359U0.mo22478f(playbackParameters);
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: g1 */
    protected boolean mo1046g1(C6722k kVar) {
        return this.f38359U0.mo22481a(kVar);
    }

    @Override // com.google.android.exoplayer2.AbstractC5252t0, p079e7.AbstractC6733t
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: h1 */
    protected int mo1044h1(AbstractC14292p pVar, C6722k kVar) {
        int i;
        boolean z;
        if (!C7562u.m22072p(kVar.f14329v)) {
            return C6732s.m24429a(0);
        }
        if (C7557q0.f16368a >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        if (kVar.f37975O != null) {
            z = true;
        } else {
            z = false;
        }
        boolean i1 = AbstractC14289n.m1042i1(kVar);
        int i2 = 8;
        int i3 = 4;
        if (i1 && this.f38359U0.mo22481a(kVar) && (!z || C14300x.m974u() != null)) {
            return C6732s.m24428b(4, 8, i);
        }
        if ("audio/raw".equals(kVar.f14329v) && !this.f38359U0.mo22481a(kVar)) {
            return C6732s.m24429a(1);
        }
        if (!this.f38359U0.mo22481a(C7557q0.m22160b0(2, kVar.f37969I, kVar.f37970J))) {
            return C6732s.m24429a(1);
        }
        List<C14288m> t0 = mo1026t0(pVar, kVar, false);
        if (t0.isEmpty()) {
            return C6732s.m24429a(1);
        }
        if (!i1) {
            return C6732s.m24429a(2);
        }
        C14288m mVar = t0.get(0);
        boolean m = mVar.m1117m(kVar);
        if (m && mVar.m1115o(kVar)) {
            i2 = 16;
        }
        if (!m) {
            i3 = 3;
        }
        return C6732s.m24428b(i3, i2, i);
    }

    @Override // p079e7.AbstractC6712b, com.google.android.exoplayer2.C5218r0.AbstractC5220b
    /* renamed from: i */
    public void mo19982i(int i, Object obj) {
        if (i == 2) {
            this.f38359U0.mo22463u(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f38359U0.mo22477g((C7445e) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f38359U0.mo22460x(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f38359U0.mo22475i(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f16103d1 = (AbstractC5252t0.AbstractC5253a) obj;
                    return;
                default:
                    super.mo19982i(i, obj);
                    return;
            }
        } else {
            this.f38359U0.mo22467q((C7491v) obj);
        }
    }

    @Override // p119g9.AbstractC7561t
    /* renamed from: o */
    public long mo22088o() {
        if (getState() == 2) {
            m22578u1();
        }
        return this.f38363Y0;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: r0 */
    protected float mo1028r0(float f, C6722k kVar, C6722k[] kVarArr) {
        int i = -1;
        for (C6722k kVar2 : kVarArr) {
            int i2 = kVar2.f37970J;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    /* renamed from: r1 */
    protected int m22581r1(C14288m mVar, C6722k kVar, C6722k[] kVarArr) {
        int q1 = m22582q1(mVar, kVar);
        if (kVarArr.length == 1) {
            return q1;
        }
        for (C6722k kVar2 : kVarArr) {
            if (mVar.m1125e(kVar, kVar2).f17809d != 0) {
                q1 = Math.max(q1, m22582q1(mVar, kVar2));
            }
        }
        return q1;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: s1 */
    protected MediaFormat m22580s1(C6722k kVar, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", kVar.f37969I);
        mediaFormat.setInteger("sample-rate", kVar.f37970J);
        C14308y.m957e(mediaFormat, kVar.f14331x);
        C14308y.m958d(mediaFormat, "max-input-size", i);
        int i2 = C7557q0.f16368a;
        if (i2 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !m22583p1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && "audio/ac4".equals(kVar.f14329v)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.f38359U0.mo22472l(C7557q0.m22160b0(4, kVar.f37969I, kVar.f37970J)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // p439y7.AbstractC14289n
    /* renamed from: t0 */
    protected List<C14288m> mo1026t0(AbstractC14292p pVar, C6722k kVar, boolean z) {
        C14288m u;
        String str = kVar.f14329v;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f38359U0.mo22481a(kVar) && (u = C14300x.m974u()) != null) {
            return Collections.singletonList(u);
        }
        List<C14288m> t = C14300x.m975t(pVar.mo1015a(str, z, false), kVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(t);
            arrayList.addAll(pVar.mo1015a("audio/eac3", z, false));
            t = arrayList;
        }
        return Collections.unmodifiableList(t);
    }

    /* renamed from: t1 */
    protected void m22579t1() {
        this.f16100a1 = true;
    }

    @Override // p079e7.AbstractC6712b, com.google.android.exoplayer2.AbstractC5252t0
    /* renamed from: v */
    public AbstractC7561t mo22577v() {
        return this;
    }

    public C7462k0(Context context, AbstractC14284k.AbstractC14285a aVar, AbstractC14292p pVar, boolean z, Handler handler, AbstractC7478r rVar, AbstractC7481s sVar) {
        super(1, aVar, pVar, z, 44100.0f);
        this.f38357S0 = context.getApplicationContext();
        this.f38359U0 = sVar;
        this.f38358T0 = new AbstractC7478r.C7479a(handler, rVar);
        sVar.mo22470n(new C7464b());
    }
}
