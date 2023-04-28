package p079e7;

import com.google.android.exoplayer2.AbstractC5252t0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p029b9.AbstractC3415h;
import p081e9.AbstractC6765b;
import p081e9.C6780n;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* renamed from: e7.e */
/* loaded from: classes7.dex */
public class C6715e implements AbstractC6727n {

    /* renamed from: a */
    private final C6780n f14282a;

    /* renamed from: b */
    private final long f14283b;

    /* renamed from: c */
    private final long f14284c;

    /* renamed from: d */
    private final long f14285d;

    /* renamed from: e */
    private final long f14286e;

    /* renamed from: f */
    private final int f14287f;

    /* renamed from: g */
    private final boolean f14288g;

    /* renamed from: h */
    private final long f14289h;

    /* renamed from: i */
    private final boolean f14290i;

    /* renamed from: j */
    private int f14291j;

    /* renamed from: k */
    private boolean f14292k;

    /* renamed from: e7.e$a */
    /* loaded from: classes7.dex */
    public static final class C6716a {

        /* renamed from: a */
        private C6780n f14293a;

        /* renamed from: b */
        private int f14294b = 50000;

        /* renamed from: c */
        private int f14295c = 50000;

        /* renamed from: d */
        private int f14296d = 2500;

        /* renamed from: e */
        private int f14297e = 5000;

        /* renamed from: f */
        private int f14298f = -1;

        /* renamed from: g */
        private boolean f14299g = false;

        /* renamed from: h */
        private int f14300h = 0;

        /* renamed from: i */
        private boolean f14301i = false;

        /* renamed from: j */
        private boolean f14302j;

        /* renamed from: a */
        public C6715e m24548a() {
            C7510a.m22366f(!this.f14302j);
            this.f14302j = true;
            if (this.f14293a == null) {
                this.f14293a = new C6780n(true, 65536);
            }
            return new C6715e(this.f14293a, this.f14294b, this.f14295c, this.f14296d, this.f14297e, this.f14298f, this.f14299g, this.f14300h, this.f14301i);
        }

        @Deprecated
        /* renamed from: b */
        public C6715e m24547b() {
            return m24548a();
        }

        /* renamed from: c */
        public C6716a m24546c(C6780n nVar) {
            C7510a.m22366f(!this.f14302j);
            this.f14293a = nVar;
            return this;
        }

        /* renamed from: d */
        public C6716a m24545d(int i, int i2, int i3, int i4) {
            C7510a.m22366f(!this.f14302j);
            C6715e.m24552k(i3, 0, "bufferForPlaybackMs", "0");
            C6715e.m24552k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            C6715e.m24552k(i, i3, "minBufferMs", "bufferForPlaybackMs");
            C6715e.m24552k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            C6715e.m24552k(i2, i, "maxBufferMs", "minBufferMs");
            this.f14294b = i;
            this.f14295c = i2;
            this.f14296d = i3;
            this.f14297e = i4;
            return this;
        }

        /* renamed from: e */
        public C6716a m24544e(boolean z) {
            C7510a.m22366f(!this.f14302j);
            this.f14299g = z;
            return this;
        }

        /* renamed from: f */
        public C6716a m24543f(int i) {
            C7510a.m22366f(!this.f14302j);
            this.f14298f = i;
            return this;
        }
    }

    public C6715e() {
        this(new C6780n(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static void m24552k(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C7510a.m22370b(z, str + " cannot be less than " + str2);
    }

    /* renamed from: m */
    private static int m24550m(int i) {
        if (i == 0) {
            return 144310272;
        }
        if (i == 1) {
            return 13107200;
        }
        if (i == 2) {
            return 131072000;
        }
        if (i == 3 || i == 5 || i == 6) {
            return 131072;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    private void m24549n(boolean z) {
        int i = this.f14287f;
        if (i == -1) {
            i = 13107200;
        }
        this.f14291j = i;
        this.f14292k = false;
        if (z) {
            this.f14282a.m24345g();
        }
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: a */
    public void mo24460a() {
        m24549n(false);
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: b */
    public boolean mo24459b() {
        return this.f14290i;
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: c */
    public void mo24458c(AbstractC5252t0[] t0VarArr, TrackGroupArray trackGroupArray, AbstractC3415h[] hVarArr) {
        int i = this.f14287f;
        if (i == -1) {
            i = m24551l(t0VarArr, hVarArr);
        }
        this.f14291j = i;
        this.f14282a.m24344h(i);
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: d */
    public long mo24457d() {
        return this.f14289h;
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: e */
    public boolean mo24456e(long j, float f, boolean z, long j2) {
        long j3;
        long d0 = C7557q0.m22156d0(j, f);
        if (z) {
            j3 = this.f14286e;
        } else {
            j3 = this.f14285d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 <= 0 || d0 >= j3 || (!this.f14288g && this.f14282a.m24346f() >= this.f14291j)) {
            return true;
        }
        return false;
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: f */
    public AbstractC6765b mo24455f() {
        return this.f14282a;
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: g */
    public void mo24454g() {
        m24549n(true);
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: h */
    public void mo24453h() {
        m24549n(true);
    }

    @Override // p079e7.AbstractC6727n
    /* renamed from: i */
    public boolean mo24452i(long j, long j2, float f) {
        boolean z;
        boolean z2 = true;
        if (this.f14282a.m24346f() >= this.f14291j) {
            z = true;
        } else {
            z = false;
        }
        long j3 = this.f14283b;
        if (f > 1.0f) {
            j3 = Math.min(C7557q0.m22171W(j3, f), this.f14284c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            if (!this.f14288g && z) {
                z2 = false;
            }
            this.f14292k = z2;
            if (!z2 && j2 < 500000) {
                C7558r.m22104h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f14284c || z) {
            this.f14292k = false;
        }
        return this.f14292k;
    }

    /* renamed from: l */
    protected int m24551l(AbstractC5252t0[] t0VarArr, AbstractC3415h[] hVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < t0VarArr.length; i2++) {
            if (hVarArr[i2] != null) {
                i += m24550m(t0VarArr[i2].mo24424d());
            }
        }
        return Math.max(13107200, i);
    }

    protected C6715e(C6780n nVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m24552k(i3, 0, "bufferForPlaybackMs", "0");
        m24552k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m24552k(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m24552k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m24552k(i2, i, "maxBufferMs", "minBufferMs");
        m24552k(i6, 0, "backBufferDurationMs", "0");
        this.f14282a = nVar;
        this.f14283b = C6713c.m24566c(i);
        this.f14284c = C6713c.m24566c(i2);
        this.f14285d = C6713c.m24566c(i3);
        this.f14286e = C6713c.m24566c(i4);
        this.f14287f = i5;
        this.f14291j = i5 == -1 ? 13107200 : i5;
        this.f14288g = z;
        this.f14289h = C6713c.m24566c(i6);
        this.f14290i = z2;
    }
}
