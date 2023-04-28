package p085ef;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: ef.u */
/* loaded from: classes8.dex */
public class C6865u {

    /* renamed from: a */
    private final Context f15006a;

    /* renamed from: b */
    private final AbstractC6867b f15007b;

    /* renamed from: c */
    private float f15008c;

    /* renamed from: d */
    private float f15009d;

    /* renamed from: e */
    private boolean f15010e;

    /* renamed from: f */
    private boolean f15011f;

    /* renamed from: g */
    private float f15012g;

    /* renamed from: h */
    private float f15013h;

    /* renamed from: i */
    private float f15014i;

    /* renamed from: j */
    private float f15015j;

    /* renamed from: k */
    private float f15016k;

    /* renamed from: l */
    private float f15017l;

    /* renamed from: m */
    private float f15018m;

    /* renamed from: n */
    private long f15019n;

    /* renamed from: o */
    private long f15020o;

    /* renamed from: p */
    private boolean f15021p;

    /* renamed from: q */
    private int f15022q;

    /* renamed from: r */
    private int f15023r;

    /* renamed from: s */
    private final Handler f15024s;

    /* renamed from: t */
    private float f15025t;

    /* renamed from: u */
    private float f15026u;

    /* renamed from: v */
    private int f15027v;

    /* renamed from: w */
    private GestureDetector f15028w;

    /* renamed from: x */
    private boolean f15029x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ef.u$a */
    /* loaded from: classes8.dex */
    public class C6866a extends GestureDetector.SimpleOnGestureListener {
        C6866a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            C6865u.this.f15025t = motionEvent.getX();
            C6865u.this.f15026u = motionEvent.getY();
            C6865u.this.f15027v = 1;
            return true;
        }
    }

    /* renamed from: ef.u$b */
    /* loaded from: classes8.dex */
    public interface AbstractC6867b {
        /* renamed from: a */
        void mo24014a(C6865u uVar);

        /* renamed from: b */
        boolean mo24013b(C6865u uVar);

        /* renamed from: c */
        boolean mo24012c(C6865u uVar);
    }

    public C6865u(Context context, AbstractC6867b bVar) {
        this(context, bVar, null);
    }

    /* renamed from: i */
    private boolean m24018i() {
        return this.f15027v != 0;
    }

    /* renamed from: d */
    public float m24023d() {
        return this.f15012g;
    }

    /* renamed from: e */
    public float m24022e() {
        return this.f15008c;
    }

    /* renamed from: f */
    public float m24021f() {
        return this.f15009d;
    }

    /* renamed from: g */
    public float m24020g() {
        boolean z;
        if (m24018i()) {
            boolean z2 = this.f15029x;
            if ((!z2 || this.f15012g >= this.f15013h) && (z2 || this.f15012g <= this.f15013h)) {
                z = false;
            } else {
                z = true;
            }
            float abs = Math.abs(1.0f - (this.f15012g / this.f15013h)) * 0.5f;
            if (this.f15013h <= this.f15022q) {
                return 1.0f;
            }
            if (z) {
                return 1.0f + abs;
            }
            return 1.0f - abs;
        }
        float f = this.f15013h;
        if (f > 0.0f) {
            return this.f15012g / f;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public long m24019h() {
        return this.f15019n - this.f15020o;
    }

    /* renamed from: j */
    public boolean m24017j(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float f;
        float f2;
        float f3;
        int i2;
        boolean z6;
        this.f15019n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f15010e) {
            this.f15028w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getButtonState() & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f15027v != 2 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (actionMasked == 1 || actionMasked == 3 || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f4 = 0.0f;
        if (actionMasked == 0 || z3) {
            if (this.f15021p) {
                this.f15007b.mo24014a(this);
                this.f15021p = false;
                this.f15014i = 0.0f;
                this.f15027v = 0;
            } else if (m24018i() && z3) {
                this.f15021p = false;
                this.f15014i = 0.0f;
                this.f15027v = 0;
            }
            if (z3) {
                return true;
            }
        }
        if (!this.f15021p && this.f15011f && !m24018i() && !z3 && z) {
            this.f15025t = motionEvent.getX();
            this.f15026u = motionEvent.getY();
            this.f15027v = 2;
            this.f15014i = 0.0f;
        }
        if (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (actionMasked == 6) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        int i3 = z5 ? pointerCount - 1 : pointerCount;
        if (m24018i()) {
            f2 = this.f15025t;
            f = this.f15026u;
            if (motionEvent.getY() < f) {
                this.f15029x = true;
            } else {
                this.f15029x = false;
            }
        } else {
            float f5 = 0.0f;
            float f6 = 0.0f;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                if (i != i4) {
                    f5 += motionEvent.getX(i4);
                    f6 += motionEvent.getY(i4);
                }
            }
            float f7 = i3;
            float f8 = f5 / f7;
            f = f6 / f7;
            f2 = f8;
        }
        float f9 = 0.0f;
        for (int i5 = 0; i5 < pointerCount; i5++) {
            if (i != i5) {
                f4 += Math.abs(motionEvent.getX(i5) - f2);
                f9 += Math.abs(motionEvent.getY(i5) - f);
            }
        }
        float f10 = i3;
        float f11 = (f4 / f10) * 2.0f;
        float f12 = (f9 / f10) * 2.0f;
        if (m24018i()) {
            f3 = f12;
        } else {
            f3 = (float) Math.hypot(f11, f12);
        }
        boolean z7 = this.f15021p;
        this.f15008c = f2;
        this.f15009d = f;
        if (!m24018i() && this.f15021p && (f3 < this.f15023r || z4)) {
            this.f15007b.mo24014a(this);
            this.f15021p = false;
            this.f15014i = f3;
        }
        if (z4) {
            this.f15015j = f11;
            this.f15017l = f11;
            this.f15016k = f12;
            this.f15018m = f12;
            this.f15012g = f3;
            this.f15013h = f3;
            this.f15014i = f3;
        }
        if (m24018i()) {
            i2 = this.f15022q;
        } else {
            i2 = this.f15023r;
        }
        if (!this.f15021p && f3 >= i2 && (z7 || Math.abs(f3 - this.f15014i) > this.f15022q)) {
            this.f15015j = f11;
            this.f15017l = f11;
            this.f15016k = f12;
            this.f15018m = f12;
            this.f15012g = f3;
            this.f15013h = f3;
            this.f15020o = this.f15019n;
            this.f15021p = this.f15007b.mo24012c(this);
        }
        if (actionMasked == 2) {
            this.f15015j = f11;
            this.f15016k = f12;
            this.f15012g = f3;
            if (this.f15021p) {
                z6 = this.f15007b.mo24013b(this);
            } else {
                z6 = true;
            }
            if (z6) {
                this.f15017l = this.f15015j;
                this.f15018m = this.f15016k;
                this.f15013h = this.f15012g;
                this.f15020o = this.f15019n;
            }
        }
        return true;
    }

    /* renamed from: k */
    public void m24016k(boolean z) {
        this.f15010e = z;
        if (z && this.f15028w == null) {
            this.f15028w = new GestureDetector(this.f15006a, new C6866a(), this.f15024s);
        }
    }

    /* renamed from: l */
    public void m24015l(boolean z) {
        this.f15011f = z;
    }

    public C6865u(Context context, AbstractC6867b bVar, Handler handler) {
        this.f15027v = 0;
        this.f15006a = context;
        this.f15007b = bVar;
        this.f15022q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f15023r = 0;
        this.f15024s = handler;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            m24016k(true);
        }
        if (i > 22) {
            m24015l(true);
        }
    }
}
