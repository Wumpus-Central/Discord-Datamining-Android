package p038c5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.DrawableProperties;
import p077e5.AbstractC6708b;
import p077e5.C6707a;
import p169j4.AbstractC9487a;
import p414x3.C13925a;
import p415x4.AbstractC13928a;

/* renamed from: c5.a */
/* loaded from: classes7.dex */
public class C3765a extends Drawable implements Animatable, AbstractC9487a {

    /* renamed from: A */
    private static final Class<?> f35868A = C3765a.class;

    /* renamed from: B */
    private static final AbstractC3766b f35869B = new C3767c();

    /* renamed from: k */
    private AbstractC13928a f6171k;

    /* renamed from: l */
    private AbstractC6708b f6172l;

    /* renamed from: m */
    private volatile boolean f6173m;

    /* renamed from: n */
    private long f6174n;

    /* renamed from: o */
    private long f6175o;

    /* renamed from: p */
    private long f6176p;

    /* renamed from: q */
    private int f6177q;

    /* renamed from: r */
    private long f6178r;

    /* renamed from: s */
    private long f6179s;

    /* renamed from: t */
    private int f6180t;

    /* renamed from: u */
    private long f6181u;

    /* renamed from: v */
    private long f6182v;

    /* renamed from: w */
    private int f6183w;

    /* renamed from: x */
    private volatile AbstractC3766b f6184x;

    /* renamed from: y */
    private DrawableProperties f6185y;

    /* renamed from: z */
    private final Runnable f6186z;

    /* renamed from: c5.a$a */
    /* loaded from: classes7.dex */
    class RunnableC0096a implements Runnable {
        RunnableC0096a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3765a aVar = C3765a.this;
            aVar.unscheduleSelf(aVar.f6186z);
            C3765a.this.invalidateSelf();
        }
    }

    public C3765a() {
        this(null);
    }

    /* renamed from: c */
    private static AbstractC6708b m33622c(AbstractC13928a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C6707a(aVar);
    }

    /* renamed from: d */
    private long m33621d() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    private void m33620e() {
        this.f6183w++;
        if (C13925a.m2276v(2)) {
            C13925a.m2274x(f35868A, "Dropped a frame. Count: %s", Integer.valueOf(this.f6183w));
        }
    }

    /* renamed from: f */
    private void m33619f(long j) {
        long j2 = this.f6174n + j;
        this.f6176p = j2;
        scheduleSelf(this.f6186z, j2);
    }

    @Override // p169j4.AbstractC9487a
    /* renamed from: a */
    public void mo16155a() {
        AbstractC13928a aVar = this.f6171k;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j;
        if (this.f6171k != null && this.f6172l != null) {
            long d = m33621d();
            if (this.f6173m) {
                j = (d - this.f6174n) + this.f6182v;
            } else {
                j = Math.max(this.f6175o, 0L);
            }
            int b = this.f6172l.mo24589b(j, this.f6175o);
            if (b == -1) {
                b = this.f6171k.mo1344a() - 1;
                this.f6184x.mo33615d(this);
                this.f6173m = false;
            } else if (b == 0 && this.f6177q != -1 && d >= this.f6176p) {
                this.f6184x.mo33618a(this);
            }
            boolean g = this.f6171k.mo1338g(this, canvas, b);
            if (g) {
                this.f6184x.mo33617b(this, b);
                this.f6177q = b;
            }
            if (!g) {
                m33620e();
            }
            long d2 = m33621d();
            if (this.f6173m) {
                long a = this.f6172l.mo24590a(d2 - this.f6174n);
                if (a != -1) {
                    m33619f(a + this.f6181u);
                } else {
                    this.f6184x.mo33615d(this);
                    this.f6173m = false;
                }
            }
            this.f6175o = j;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        AbstractC13928a aVar = this.f6171k;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.mo1342c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        AbstractC13928a aVar = this.f6171k;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.mo1340e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6173m;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        AbstractC13928a aVar = this.f6171k;
        if (aVar != null) {
            aVar.mo1341d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f6173m) {
            return false;
        }
        long j = i;
        if (this.f6175o == j) {
            return false;
        }
        this.f6175o = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f6185y == null) {
            this.f6185y = new DrawableProperties();
        }
        this.f6185y.m31851b(i);
        AbstractC13928a aVar = this.f6171k;
        if (aVar != null) {
            aVar.mo1335j(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f6185y == null) {
            this.f6185y = new DrawableProperties();
        }
        this.f6185y.m31850c(colorFilter);
        AbstractC13928a aVar = this.f6171k;
        if (aVar != null) {
            aVar.mo1339f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        AbstractC13928a aVar;
        if (!this.f6173m && (aVar = this.f6171k) != null && aVar.mo1344a() > 1) {
            this.f6173m = true;
            long d = m33621d();
            long j = d - this.f6178r;
            this.f6174n = j;
            this.f6176p = j;
            this.f6175o = d - this.f6179s;
            this.f6177q = this.f6180t;
            invalidateSelf();
            this.f6184x.mo33616c(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f6173m) {
            long d = m33621d();
            this.f6178r = d - this.f6174n;
            this.f6179s = d - this.f6175o;
            this.f6180t = this.f6177q;
            this.f6173m = false;
            this.f6174n = 0L;
            this.f6176p = 0L;
            this.f6175o = -1L;
            this.f6177q = -1;
            unscheduleSelf(this.f6186z);
            this.f6184x.mo33615d(this);
        }
    }

    public C3765a(AbstractC13928a aVar) {
        this.f6181u = 8L;
        this.f6182v = 0L;
        this.f6184x = f35869B;
        this.f6186z = new RunnableC0096a();
        this.f6171k = aVar;
        this.f6172l = m33622c(aVar);
    }
}
