package p126h2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p147i2.C8210a;
import p206l2.C10332a;
import p206l2.C10333b;
import p223m2.C10474e;
import p223m2.C10477h;
import p275p2.C11513c;
import p311r2.C12358v;
import p343t2.C12945f;
import p343t2.C12948i;
import p343t2.Choreographer$FrameCallbackC12946g;
import p358u2.C13180c;

/* renamed from: h2.e0 */
/* loaded from: classes.dex */
public class C7748e0 extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: B */
    private boolean f38402B;

    /* renamed from: C */
    private boolean f38403C;

    /* renamed from: D */
    private boolean f38404D;

    /* renamed from: H */
    private Bitmap f38408H;

    /* renamed from: I */
    private Canvas f38409I;

    /* renamed from: J */
    private Rect f38410J;

    /* renamed from: K */
    private RectF f38411K;

    /* renamed from: L */
    private Paint f38412L;

    /* renamed from: M */
    private Rect f38413M;

    /* renamed from: N */
    private Rect f38414N;

    /* renamed from: O */
    private RectF f38415O;

    /* renamed from: P */
    private RectF f38416P;

    /* renamed from: Q */
    private Matrix f38417Q;

    /* renamed from: R */
    private Matrix f38418R;

    /* renamed from: k */
    private C7762i f16798k;

    /* renamed from: l */
    private final Choreographer$FrameCallbackC12946g f16799l;

    /* renamed from: r */
    private final ValueAnimator.AnimatorUpdateListener f16805r;

    /* renamed from: s */
    private C10333b f16806s;

    /* renamed from: t */
    private String f16807t;

    /* renamed from: u */
    private C10332a f16808u;

    /* renamed from: v */
    C7787s0 f16809v;

    /* renamed from: w */
    private boolean f16810w;

    /* renamed from: z */
    private C11513c f16813z;

    /* renamed from: m */
    private boolean f16800m = true;

    /* renamed from: n */
    private boolean f16801n = false;

    /* renamed from: o */
    private boolean f16802o = false;

    /* renamed from: p */
    private EnumC7751c f16803p = EnumC7751c.NONE;

    /* renamed from: q */
    private final ArrayList<AbstractC7750b> f16804q = new ArrayList<>();

    /* renamed from: x */
    private boolean f16811x = false;

    /* renamed from: y */
    private boolean f16812y = true;

    /* renamed from: A */
    private int f38401A = 255;

    /* renamed from: E */
    private EnumC7782q0 f38405E = EnumC7782q0.AUTOMATIC;

    /* renamed from: F */
    private boolean f38406F = false;

    /* renamed from: G */
    private final Matrix f38407G = new Matrix();

    /* renamed from: S */
    private boolean f38419S = false;

    /* renamed from: h2.e0$a */
    /* loaded from: classes.dex */
    class C7749a implements ValueAnimator.AnimatorUpdateListener {
        C7749a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C7748e0.this.f16813z != null) {
                C7748e0.this.f16813z.mo9504M(C7748e0.this.f16799l.m4998k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2.e0$b */
    /* loaded from: classes.dex */
    public interface AbstractC7750b {
        /* renamed from: a */
        void mo21321a(C7762i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h2.e0$c */
    /* loaded from: classes.dex */
    public enum EnumC7751c {
        NONE,
        PLAY,
        RESUME
    }

    public C7748e0() {
        Choreographer$FrameCallbackC12946g gVar = new Choreographer$FrameCallbackC12946g();
        this.f16799l = gVar;
        C7749a aVar = new C7749a();
        this.f16805r = aVar;
        gVar.addUpdateListener(aVar);
    }

    /* renamed from: C */
    private void m21535C(int i, int i2) {
        Bitmap bitmap = this.f38408H;
        if (bitmap == null || bitmap.getWidth() < i || this.f38408H.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f38408H = createBitmap;
            this.f38409I.setBitmap(createBitmap);
            this.f38419S = true;
        } else if (this.f38408H.getWidth() > i || this.f38408H.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f38408H, 0, 0, i, i2);
            this.f38408H = createBitmap2;
            this.f38409I.setBitmap(createBitmap2);
            this.f38419S = true;
        }
    }

    /* renamed from: D */
    private void m21533D() {
        if (this.f38409I == null) {
            this.f38409I = new Canvas();
            this.f38416P = new RectF();
            this.f38417Q = new Matrix();
            this.f38418R = new Matrix();
            this.f38410J = new Rect();
            this.f38411K = new RectF();
            this.f38412L = new C8210a();
            this.f38413M = new Rect();
            this.f38414N = new Rect();
            this.f38415O = new RectF();
        }
    }

    /* renamed from: H */
    private Context m21525H() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: I */
    private C10332a m21523I() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f16808u == null) {
            this.f16808u = new C10332a(getCallback(), null);
        }
        return this.f16808u;
    }

    /* renamed from: K */
    private C10333b m21519K() {
        if (getCallback() == null) {
            return null;
        }
        C10333b bVar = this.f16806s;
        if (bVar != null && !bVar.m13594b(m21525H())) {
            this.f16806s = null;
        }
        if (this.f16806s == null) {
            this.f16806s = new C10333b(getCallback(), this.f16807t, null, this.f16798k.m21394j());
        }
        return this.f16806s;
    }

    /* renamed from: Y */
    private boolean m21491Y() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m21484c0(C10474e eVar, Object obj, C13180c cVar, C7762i iVar) {
        m21457q(eVar, obj, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m21482d0(C7762i iVar) {
        m21456q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m21480e0(C7762i iVar) {
        m21450t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m21478f0(int i, C7762i iVar) {
        m21538A0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m21476g0(int i, C7762i iVar) {
        m21528F0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m21474h0(String str, C7762i iVar) {
        m21526G0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m21472i0(float f, C7762i iVar) {
        m21524H0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m21470j0(int i, int i2, C7762i iVar) {
        m21522I0(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public /* synthetic */ void m21468k0(String str, C7762i iVar) {
        m21520J0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public /* synthetic */ void m21466l0(int i, C7762i iVar) {
        m21518K0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ void m21464m0(String str, C7762i iVar) {
        m21516L0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m21462n0(float f, C7762i iVar) {
        m21514M0(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m21460o0(float f, C7762i iVar) {
        m21508P0(f);
    }

    /* renamed from: r */
    private boolean m21455r() {
        return this.f16800m || this.f16801n;
    }

    /* renamed from: r0 */
    private void m21454r0(Canvas canvas, C11513c cVar) {
        if (this.f16798k != null && cVar != null) {
            m21533D();
            canvas.getMatrix(this.f38417Q);
            canvas.getClipBounds(this.f38410J);
            m21445w(this.f38410J, this.f38411K);
            this.f38417Q.mapRect(this.f38411K);
            m21443x(this.f38411K, this.f38410J);
            if (this.f16812y) {
                this.f38416P.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                cVar.mo9457f(this.f38416P, null, false);
            }
            this.f38417Q.mapRect(this.f38416P);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            m21446v0(this.f38416P, width, height);
            if (!m21491Y()) {
                RectF rectF = this.f38416P;
                Rect rect = this.f38410J;
                rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
            }
            int ceil = (int) Math.ceil(this.f38416P.width());
            int ceil2 = (int) Math.ceil(this.f38416P.height());
            if (ceil != 0 && ceil2 != 0) {
                m21535C(ceil, ceil2);
                if (this.f38419S) {
                    this.f38407G.set(this.f38417Q);
                    this.f38407G.preScale(width, height);
                    Matrix matrix = this.f38407G;
                    RectF rectF2 = this.f38416P;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f38408H.eraseColor(0);
                    cVar.mo9521h(this.f38409I, this.f38407G, this.f38401A);
                    this.f38417Q.invert(this.f38418R);
                    this.f38418R.mapRect(this.f38415O, this.f38416P);
                    m21443x(this.f38415O, this.f38414N);
                }
                this.f38413M.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f38408H, this.f38413M, this.f38414N, this.f38412L);
            }
        }
    }

    /* renamed from: s */
    private void m21453s() {
        C7762i iVar = this.f16798k;
        if (iVar != null) {
            C11513c cVar = new C11513c(this, C12358v.m7078a(iVar), iVar.m21393k(), iVar);
            this.f16813z = cVar;
            if (this.f38403C) {
                cVar.mo9505K(true);
            }
            this.f16813z.m9503P(this.f16812y);
        }
    }

    /* renamed from: v */
    private void m21447v() {
        C7762i iVar = this.f16798k;
        if (iVar != null) {
            this.f38406F = this.f38405E.m21327a(Build.VERSION.SDK_INT, iVar.m21387q(), iVar.m21391m());
        }
    }

    /* renamed from: v0 */
    private void m21446v0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* renamed from: w */
    private void m21445w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: x */
    private void m21443x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: y */
    private void m21441y(Canvas canvas) {
        C11513c cVar = this.f16813z;
        C7762i iVar = this.f16798k;
        if (cVar != null && iVar != null) {
            this.f38407G.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                float height = bounds.height() / iVar.m21402b().height();
                this.f38407G.preScale(bounds.width() / iVar.m21402b().width(), height);
            }
            cVar.mo9521h(canvas, this.f38407G, this.f38401A);
        }
    }

    /* renamed from: A */
    public boolean m21539A() {
        return this.f16810w;
    }

    /* renamed from: A0 */
    public void m21538A0(final int i) {
        if (this.f16798k == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.s
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21478f0(i, iVar);
                }
            });
        } else {
            this.f16799l.m5007A(i);
        }
    }

    /* renamed from: B */
    public void m21537B() {
        this.f16804q.clear();
        this.f16799l.m4999j();
        if (!isVisible()) {
            this.f16803p = EnumC7751c.NONE;
        }
    }

    /* renamed from: B0 */
    public void m21536B0(boolean z) {
        this.f16801n = z;
    }

    /* renamed from: C0 */
    public void m21534C0(AbstractC7740b bVar) {
        C10333b bVar2 = this.f16806s;
        if (bVar2 != null) {
            bVar2.m13592d(bVar);
        }
    }

    /* renamed from: D0 */
    public void m21532D0(String str) {
        this.f16807t = str;
    }

    /* renamed from: E */
    public Bitmap m21531E(String str) {
        C10333b K = m21519K();
        if (K != null) {
            return K.m13595a(str);
        }
        return null;
    }

    /* renamed from: E0 */
    public void m21530E0(boolean z) {
        this.f16811x = z;
    }

    /* renamed from: F */
    public boolean m21529F() {
        return this.f16812y;
    }

    /* renamed from: F0 */
    public void m21528F0(final int i) {
        if (this.f16798k == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.x
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21476g0(i, iVar);
                }
            });
        } else {
            this.f16799l.m5006B(i + 0.99f);
        }
    }

    /* renamed from: G */
    public C7762i m21527G() {
        return this.f16798k;
    }

    /* renamed from: G0 */
    public void m21526G0(final String str) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.z
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar2) {
                    C7748e0.this.m21474h0(str, iVar2);
                }
            });
            return;
        }
        C10477h l = iVar.m21392l(str);
        if (l != null) {
            m21528F0((int) (l.f23138b + l.f23139c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: H0 */
    public void m21524H0(final float f) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.c0
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar2) {
                    C7748e0.this.m21472i0(f, iVar2);
                }
            });
        } else {
            this.f16799l.m5006B(C12948i.m4974i(iVar.m21388p(), this.f16798k.m21398f(), f));
        }
    }

    /* renamed from: I0 */
    public void m21522I0(final int i, final int i2) {
        if (this.f16798k == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.t
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21470j0(i, i2, iVar);
                }
            });
        } else {
            this.f16799l.m5005C(i, i2 + 0.99f);
        }
    }

    /* renamed from: J */
    public int m21521J() {
        return (int) this.f16799l.m4997l();
    }

    /* renamed from: J0 */
    public void m21520J0(final String str) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.u
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar2) {
                    C7748e0.this.m21468k0(str, iVar2);
                }
            });
            return;
        }
        C10477h l = iVar.m21392l(str);
        if (l != null) {
            int i = (int) l.f23138b;
            m21522I0(i, ((int) l.f23139c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: K0 */
    public void m21518K0(final int i) {
        if (this.f16798k == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.v
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21466l0(i, iVar);
                }
            });
        } else {
            this.f16799l.m5004D(i);
        }
    }

    /* renamed from: L */
    public String m21517L() {
        return this.f16807t;
    }

    /* renamed from: L0 */
    public void m21516L0(final String str) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.a0
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar2) {
                    C7748e0.this.m21464m0(str, iVar2);
                }
            });
            return;
        }
        C10477h l = iVar.m21392l(str);
        if (l != null) {
            m21518K0((int) l.f23138b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: M */
    public C7753f0 m21515M(String str) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            return null;
        }
        return iVar.m21394j().get(str);
    }

    /* renamed from: M0 */
    public void m21514M0(final float f) {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.w
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar2) {
                    C7748e0.this.m21462n0(f, iVar2);
                }
            });
        } else {
            m21518K0((int) C12948i.m4974i(iVar.m21388p(), this.f16798k.m21398f(), f));
        }
    }

    /* renamed from: N */
    public boolean m21513N() {
        return this.f16811x;
    }

    /* renamed from: N0 */
    public void m21512N0(boolean z) {
        if (this.f38403C != z) {
            this.f38403C = z;
            C11513c cVar = this.f16813z;
            if (cVar != null) {
                cVar.mo9505K(z);
            }
        }
    }

    /* renamed from: O */
    public float m21511O() {
        return this.f16799l.m4995n();
    }

    /* renamed from: O0 */
    public void m21510O0(boolean z) {
        this.f38402B = z;
        C7762i iVar = this.f16798k;
        if (iVar != null) {
            iVar.m21382v(z);
        }
    }

    /* renamed from: P */
    public float m21509P() {
        return this.f16799l.m4994o();
    }

    /* renamed from: P0 */
    public void m21508P0(final float f) {
        if (this.f16798k == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.r
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21460o0(f, iVar);
                }
            });
            return;
        }
        C7742c.m21543a("Drawable#setProgress");
        this.f16799l.m5007A(this.f16798k.m21396h(f));
        C7742c.m21542b("Drawable#setProgress");
    }

    /* renamed from: Q */
    public C7774n0 m21507Q() {
        C7762i iVar = this.f16798k;
        if (iVar != null) {
            return iVar.m21390n();
        }
        return null;
    }

    /* renamed from: Q0 */
    public void m21506Q0(EnumC7782q0 q0Var) {
        this.f38405E = q0Var;
        m21447v();
    }

    /* renamed from: R */
    public float m21505R() {
        return this.f16799l.m4998k();
    }

    /* renamed from: R0 */
    public void m21504R0(int i) {
        this.f16799l.setRepeatCount(i);
    }

    /* renamed from: S */
    public EnumC7782q0 m21503S() {
        return this.f38406F ? EnumC7782q0.SOFTWARE : EnumC7782q0.HARDWARE;
    }

    /* renamed from: S0 */
    public void m21502S0(int i) {
        this.f16799l.setRepeatMode(i);
    }

    /* renamed from: T */
    public int m21501T() {
        return this.f16799l.getRepeatCount();
    }

    /* renamed from: T0 */
    public void m21500T0(boolean z) {
        this.f16802o = z;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: U */
    public int m21499U() {
        return this.f16799l.getRepeatMode();
    }

    /* renamed from: U0 */
    public void m21498U0(float f) {
        this.f16799l.m5003E(f);
    }

    /* renamed from: V */
    public float m21497V() {
        return this.f16799l.m4993q();
    }

    /* renamed from: V0 */
    public void m21496V0(Boolean bool) {
        this.f16800m = bool.booleanValue();
    }

    /* renamed from: W */
    public C7787s0 m21495W() {
        return this.f16809v;
    }

    /* renamed from: W0 */
    public void m21494W0(C7787s0 s0Var) {
        this.f16809v = s0Var;
    }

    /* renamed from: X */
    public Typeface m21493X(String str, String str2) {
        C10332a I = m21523I();
        if (I != null) {
            return I.m13598b(str, str2);
        }
        return null;
    }

    /* renamed from: X0 */
    public boolean m21492X0() {
        return this.f16809v == null && this.f16798k.m21401c().m39038m() > 0;
    }

    /* renamed from: Z */
    public boolean m21490Z() {
        Choreographer$FrameCallbackC12946g gVar = this.f16799l;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public boolean m21488a0() {
        if (isVisible()) {
            return this.f16799l.isRunning();
        }
        EnumC7751c cVar = this.f16803p;
        if (cVar == EnumC7751c.PLAY || cVar == EnumC7751c.RESUME) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public boolean m21486b0() {
        return this.f38404D;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C7742c.m21543a("Drawable#draw");
        if (this.f16802o) {
            try {
                if (this.f38406F) {
                    m21454r0(canvas, this.f16813z);
                } else {
                    m21441y(canvas);
                }
            } catch (Throwable th2) {
                C12945f.m5010b("Lottie crashed in draw!", th2);
            }
        } else if (this.f38406F) {
            m21454r0(canvas, this.f16813z);
        } else {
            m21441y(canvas);
        }
        this.f38419S = false;
        C7742c.m21542b("Drawable#draw");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38401A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            return -1;
        }
        return iVar.m21402b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C7762i iVar = this.f16798k;
        if (iVar == null) {
            return -1;
        }
        return iVar.m21402b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (!this.f38419S) {
            this.f38419S = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m21490Z();
    }

    /* renamed from: p */
    public void m21459p(Animator.AnimatorListener animatorListener) {
        this.f16799l.addListener(animatorListener);
    }

    /* renamed from: p0 */
    public void m21458p0() {
        this.f16804q.clear();
        this.f16799l.m4991s();
        if (!isVisible()) {
            this.f16803p = EnumC7751c.NONE;
        }
    }

    /* renamed from: q */
    public <T> void m21457q(final C10474e eVar, final T t, final C13180c<T> cVar) {
        C11513c cVar2 = this.f16813z;
        if (cVar2 == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.b0
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21484c0(eVar, t, cVar, iVar);
                }
            });
            return;
        }
        boolean z = true;
        if (eVar == C10474e.f23132c) {
            cVar2.mo9460c(t, cVar);
        } else if (eVar.m13093d() != null) {
            eVar.m13093d().mo9460c(t, cVar);
        } else {
            List<C10474e> s0 = m21452s0(eVar);
            for (int i = 0; i < s0.size(); i++) {
                s0.get(i).m13093d().mo9460c(t, cVar);
            }
            z = true ^ s0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == AbstractC7765j0.f38424E) {
                m21508P0(m21505R());
            }
        }
    }

    /* renamed from: q0 */
    public void m21456q0() {
        float f;
        if (this.f16813z == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.d0
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21482d0(iVar);
                }
            });
            return;
        }
        m21447v();
        if (m21455r() || m21501T() == 0) {
            if (isVisible()) {
                this.f16799l.m4990t();
                this.f16803p = EnumC7751c.NONE;
            } else {
                this.f16803p = EnumC7751c.PLAY;
            }
        }
        if (!m21455r()) {
            if (m21497V() < 0.0f) {
                f = m21509P();
            } else {
                f = m21511O();
            }
            m21538A0((int) f);
            this.f16799l.m4999j();
            if (!isVisible()) {
                this.f16803p = EnumC7751c.NONE;
            }
        }
    }

    /* renamed from: s0 */
    public List<C10474e> m21452s0(C10474e eVar) {
        if (this.f16813z == null) {
            C12945f.m5009c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f16813z.mo9520i(eVar, 0, arrayList, new C10474e(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f38401A = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C12945f.m5009c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            EnumC7751c cVar = this.f16803p;
            if (cVar == EnumC7751c.PLAY) {
                m21456q0();
            } else if (cVar == EnumC7751c.RESUME) {
                m21450t0();
            }
        } else if (this.f16799l.isRunning()) {
            m21458p0();
            this.f16803p = EnumC7751c.RESUME;
        } else if (!z3) {
            this.f16803p = EnumC7751c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            m21456q0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m21537B();
    }

    /* renamed from: t */
    public void m21451t() {
        this.f16804q.clear();
        this.f16799l.cancel();
        if (!isVisible()) {
            this.f16803p = EnumC7751c.NONE;
        }
    }

    /* renamed from: t0 */
    public void m21450t0() {
        float f;
        if (this.f16813z == null) {
            this.f16804q.add(new AbstractC7750b() { // from class: h2.y
                @Override // p126h2.C7748e0.AbstractC7750b
                /* renamed from: a */
                public final void mo21321a(C7762i iVar) {
                    C7748e0.this.m21480e0(iVar);
                }
            });
            return;
        }
        m21447v();
        if (m21455r() || m21501T() == 0) {
            if (isVisible()) {
                this.f16799l.m4986x();
                this.f16803p = EnumC7751c.NONE;
            } else {
                this.f16803p = EnumC7751c.RESUME;
            }
        }
        if (!m21455r()) {
            if (m21497V() < 0.0f) {
                f = m21509P();
            } else {
                f = m21511O();
            }
            m21538A0((int) f);
            this.f16799l.m4999j();
            if (!isVisible()) {
                this.f16803p = EnumC7751c.NONE;
            }
        }
    }

    /* renamed from: u */
    public void m21449u() {
        if (this.f16799l.isRunning()) {
            this.f16799l.cancel();
            if (!isVisible()) {
                this.f16803p = EnumC7751c.NONE;
            }
        }
        this.f16798k = null;
        this.f16813z = null;
        this.f16806s = null;
        this.f16799l.m5000h();
        invalidateSelf();
    }

    /* renamed from: u0 */
    public void m21448u0() {
        this.f16799l.m4985y();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: w0 */
    public void m21444w0(boolean z) {
        this.f38404D = z;
    }

    /* renamed from: x0 */
    public void m21442x0(boolean z) {
        if (z != this.f16812y) {
            this.f16812y = z;
            C11513c cVar = this.f16813z;
            if (cVar != null) {
                cVar.m9503P(z);
            }
            invalidateSelf();
        }
    }

    /* renamed from: y0 */
    public boolean m21440y0(C7762i iVar) {
        if (this.f16798k == iVar) {
            return false;
        }
        this.f38419S = true;
        m21449u();
        this.f16798k = iVar;
        m21453s();
        this.f16799l.m4984z(iVar);
        m21508P0(this.f16799l.getAnimatedFraction());
        Iterator it = new ArrayList(this.f16804q).iterator();
        while (it.hasNext()) {
            AbstractC7750b bVar = (AbstractC7750b) it.next();
            if (bVar != null) {
                bVar.mo21321a(iVar);
            }
            it.remove();
        }
        this.f16804q.clear();
        iVar.m21382v(this.f38402B);
        m21447v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* renamed from: z */
    public void m21439z(boolean z) {
        if (this.f16810w != z) {
            this.f16810w = z;
            if (this.f16798k != null) {
                m21453s();
            }
        }
    }

    /* renamed from: z0 */
    public void m21438z0(C7738a aVar) {
        C10332a aVar2 = this.f16808u;
        if (aVar2 != null) {
            aVar2.m13597c(aVar);
        }
    }
}
