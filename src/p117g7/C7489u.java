package p117g7;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import p079e7.C6713c;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: g7.u */
/* loaded from: classes7.dex */
final class C7489u {

    /* renamed from: A */
    private long f38365A;

    /* renamed from: B */
    private long f38366B;

    /* renamed from: C */
    private long f38367C;

    /* renamed from: D */
    private boolean f38368D;

    /* renamed from: E */
    private long f38369E;

    /* renamed from: F */
    private long f38370F;

    /* renamed from: a */
    private final AbstractC7490a f16211a;

    /* renamed from: b */
    private final long[] f16212b;

    /* renamed from: c */
    private AudioTrack f16213c;

    /* renamed from: d */
    private int f16214d;

    /* renamed from: e */
    private int f16215e;

    /* renamed from: f */
    private C7487t f16216f;

    /* renamed from: g */
    private int f16217g;

    /* renamed from: h */
    private boolean f16218h;

    /* renamed from: i */
    private long f16219i;

    /* renamed from: j */
    private float f16220j;

    /* renamed from: k */
    private boolean f16221k;

    /* renamed from: l */
    private long f16222l;

    /* renamed from: m */
    private long f16223m;

    /* renamed from: n */
    private Method f16224n;

    /* renamed from: o */
    private long f16225o;

    /* renamed from: p */
    private boolean f16226p;

    /* renamed from: q */
    private boolean f16227q;

    /* renamed from: r */
    private long f16228r;

    /* renamed from: s */
    private long f16229s;

    /* renamed from: t */
    private long f16230t;

    /* renamed from: u */
    private long f16231u;

    /* renamed from: v */
    private int f16232v;

    /* renamed from: w */
    private int f16233w;

    /* renamed from: x */
    private long f16234x;

    /* renamed from: y */
    private long f16235y;

    /* renamed from: z */
    private long f16236z;

    /* renamed from: g7.u$a */
    /* loaded from: classes7.dex */
    public interface AbstractC7490a {
        /* renamed from: a */
        void mo22418a(int i, long j);

        /* renamed from: b */
        void mo22417b(long j);

        /* renamed from: c */
        void mo22416c(long j);

        /* renamed from: d */
        void mo22415d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo22414e(long j, long j2, long j3, long j4);
    }

    public C7489u(AbstractC7490a aVar) {
        this.f16211a = (AbstractC7490a) C7510a.m22367e(aVar);
        if (C7557q0.f16368a >= 18) {
            try {
                this.f16224n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f16212b = new long[10];
    }

    /* renamed from: a */
    private boolean m22440a() {
        if (this.f16218h && ((AudioTrack) C7510a.m22367e(this.f16213c)).getPlayState() == 2 && m22435f() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private long m22439b(long j) {
        return (j * 1000000) / this.f16217g;
    }

    /* renamed from: f */
    private long m22435f() {
        AudioTrack audioTrack = (AudioTrack) C7510a.m22367e(this.f16213c);
        if (this.f16234x != -9223372036854775807L) {
            return Math.min(this.f38365A, this.f16236z + ((((SystemClock.elapsedRealtime() * 1000) - this.f16234x) * this.f16217g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f16218h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f16231u = this.f16229s;
            }
            playbackHeadPosition += this.f16231u;
        }
        if (C7557q0.f16368a <= 29) {
            if (playbackHeadPosition == 0 && this.f16229s > 0 && playState == 3) {
                if (this.f16235y == -9223372036854775807L) {
                    this.f16235y = SystemClock.elapsedRealtime();
                }
                return this.f16229s;
            }
            this.f16235y = -9223372036854775807L;
        }
        if (this.f16229s > playbackHeadPosition) {
            this.f16230t++;
        }
        this.f16229s = playbackHeadPosition;
        return playbackHeadPosition + (this.f16230t << 32);
    }

    /* renamed from: g */
    private long m22434g() {
        return m22439b(m22435f());
    }

    /* renamed from: m */
    private void m22428m(long j, long j2) {
        C7487t tVar = (C7487t) C7510a.m22367e(this.f16216f);
        if (tVar.m22447e(j)) {
            long c = tVar.m22449c();
            long b = tVar.m22450b();
            if (Math.abs(c - j) > 5000000) {
                this.f16211a.mo22414e(b, c, j, j2);
                tVar.m22446f();
            } else if (Math.abs(m22439b(b) - j2) > 5000000) {
                this.f16211a.mo22415d(b, c, j, j2);
                tVar.m22446f();
            } else {
                tVar.m22451a();
            }
        }
    }

    /* renamed from: n */
    private void m22427n() {
        long g = m22434g();
        if (g != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f16223m >= 30000) {
                long[] jArr = this.f16212b;
                int i = this.f16232v;
                jArr[i] = g - nanoTime;
                this.f16232v = (i + 1) % 10;
                int i2 = this.f16233w;
                if (i2 < 10) {
                    this.f16233w = i2 + 1;
                }
                this.f16223m = nanoTime;
                this.f16222l = 0L;
                int i3 = 0;
                while (true) {
                    int i4 = this.f16233w;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f16222l += this.f16212b[i3] / i4;
                    i3++;
                }
            }
            if (!this.f16218h) {
                m22428m(nanoTime, g);
                m22426o(nanoTime);
            }
        }
    }

    /* renamed from: o */
    private void m22426o(long j) {
        Method method;
        if (this.f16227q && (method = this.f16224n) != null && j - this.f16228r >= 500000) {
            try {
                long intValue = (((Integer) C7557q0.m22145j((Integer) method.invoke(C7510a.m22367e(this.f16213c), new Object[0]))).intValue() * 1000) - this.f16219i;
                this.f16225o = intValue;
                long max = Math.max(intValue, 0L);
                this.f16225o = max;
                if (max > 5000000) {
                    this.f16211a.mo22416c(max);
                    this.f16225o = 0L;
                }
            } catch (Exception unused) {
                this.f16224n = null;
            }
            this.f16228r = j;
        }
    }

    /* renamed from: p */
    private static boolean m22425p(int i) {
        return C7557q0.f16368a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: s */
    private void m22422s() {
        this.f16222l = 0L;
        this.f16233w = 0;
        this.f16232v = 0;
        this.f16223m = 0L;
        this.f38367C = 0L;
        this.f38370F = 0L;
        this.f16221k = false;
    }

    /* renamed from: c */
    public int m22438c(long j) {
        return this.f16215e - ((int) (j - (m22435f() * this.f16214d)));
    }

    /* renamed from: d */
    public long m22437d(boolean z) {
        long j;
        if (((AudioTrack) C7510a.m22367e(this.f16213c)).getPlayState() == 3) {
            m22427n();
        }
        long nanoTime = System.nanoTime() / 1000;
        C7487t tVar = (C7487t) C7510a.m22367e(this.f16216f);
        boolean d = tVar.m22448d();
        if (d) {
            j = m22439b(tVar.m22450b()) + C7557q0.m22171W(nanoTime - tVar.m22449c(), this.f16220j);
        } else {
            if (this.f16233w == 0) {
                j = m22434g();
            } else {
                j = this.f16222l + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.f16225o);
            }
        }
        if (this.f38368D != d) {
            this.f38370F = this.f38367C;
            this.f38369E = this.f38366B;
        }
        long j2 = nanoTime - this.f38370F;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.f38369E + C7557q0.m22171W(j2, this.f16220j)))) / 1000;
        }
        if (!this.f16221k) {
            long j4 = this.f38366B;
            if (j > j4) {
                this.f16221k = true;
                this.f16211a.mo22417b(System.currentTimeMillis() - C6713c.m24565d(C7557q0.m22156d0(C6713c.m24565d(j - j4), this.f16220j)));
            }
        }
        this.f38367C = nanoTime;
        this.f38366B = j;
        this.f38368D = d;
        return j;
    }

    /* renamed from: e */
    public long m22436e(long j) {
        return C6713c.m24565d(m22439b(j - m22435f()));
    }

    /* renamed from: h */
    public void m22433h(long j) {
        this.f16236z = m22435f();
        this.f16234x = SystemClock.elapsedRealtime() * 1000;
        this.f38365A = j;
    }

    /* renamed from: i */
    public boolean m22432i(long j) {
        if (j > m22435f() || m22440a()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m22431j() {
        return ((AudioTrack) C7510a.m22367e(this.f16213c)).getPlayState() == 3;
    }

    /* renamed from: k */
    public boolean m22430k(long j) {
        if (this.f16235y == -9223372036854775807L || j <= 0 || SystemClock.elapsedRealtime() - this.f16235y < 200) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m22429l(long j) {
        int playState = ((AudioTrack) C7510a.m22367e(this.f16213c)).getPlayState();
        if (this.f16218h) {
            if (playState == 2) {
                this.f16226p = false;
                return false;
            } else if (playState == 1 && m22435f() == 0) {
                return false;
            }
        }
        boolean z = this.f16226p;
        boolean i = m22432i(j);
        this.f16226p = i;
        if (z && !i && playState != 1) {
            this.f16211a.mo22418a(this.f16215e, C6713c.m24565d(this.f16219i));
        }
        return true;
    }

    /* renamed from: q */
    public boolean m22424q() {
        m22422s();
        if (this.f16234x != -9223372036854775807L) {
            return false;
        }
        ((C7487t) C7510a.m22367e(this.f16216f)).m22445g();
        return true;
    }

    /* renamed from: r */
    public void m22423r() {
        m22422s();
        this.f16213c = null;
        this.f16216f = null;
    }

    /* renamed from: t */
    public void m22421t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        long j;
        this.f16213c = audioTrack;
        this.f16214d = i2;
        this.f16215e = i3;
        this.f16216f = new C7487t(audioTrack);
        this.f16217g = audioTrack.getSampleRate();
        if (!z || !m22425p(i)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f16218h = z2;
        boolean p0 = C7557q0.m22132p0(i);
        this.f16227q = p0;
        if (p0) {
            j = m22439b(i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f16219i = j;
        this.f16229s = 0L;
        this.f16230t = 0L;
        this.f16231u = 0L;
        this.f16226p = false;
        this.f16234x = -9223372036854775807L;
        this.f16235y = -9223372036854775807L;
        this.f16228r = 0L;
        this.f16225o = 0L;
        this.f16220j = 1.0f;
    }

    /* renamed from: u */
    public void m22420u(float f) {
        this.f16220j = f;
        C7487t tVar = this.f16216f;
        if (tVar != null) {
            tVar.m22445g();
        }
    }

    /* renamed from: v */
    public void m22419v() {
        ((C7487t) C7510a.m22367e(this.f16216f)).m22445g();
    }
}
