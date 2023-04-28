package p085ef;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p085ef.C6865u;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016R$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m15073d2 = {"Lef/q;", "Lef/d;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "", "force", "k", "g0", "l0", "", "<set-?>", "L", "D", "R0", "()D", "scale", "M", "S0", "velocity", "", "N", "F", "P0", "()F", "focalPointX", "O", "Q0", "focalPointY", "Lef/u;", "P", "Lef/u;", "scaleGestureDetector", "Q", "startingSpan", "R", "spanSlop", "Lef/u$b;", "S", "Lef/u$b;", "gestureListener", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.q */
/* loaded from: classes8.dex */
public final class C6857q extends C6832d<C6857q> {

    /* renamed from: L */
    private double f38285L;

    /* renamed from: M */
    private double f38286M;

    /* renamed from: P */
    private C6865u f38289P;

    /* renamed from: Q */
    private float f38290Q;

    /* renamed from: R */
    private float f38291R;

    /* renamed from: N */
    private float f38287N = Float.NaN;

    /* renamed from: O */
    private float f38288O = Float.NaN;

    /* renamed from: S */
    private final C6865u.AbstractC6867b f38292S = new C6858a();

    @Metadata(m15074d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m15073d2 = {"ef/q$a", "Lef/u$b;", "Lef/u;", "detector", "", "b", "c", "", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.q$a */
    /* loaded from: classes8.dex */
    public static final class C6858a implements C6865u.AbstractC6867b {
        C6858a() {
            C6857q.this.m24175y0(false);
        }

        @Override // p085ef.C6865u.AbstractC6867b
        /* renamed from: a */
        public void mo24014a(C6865u detector) {
            C9971q.m14633g(detector, "detector");
        }

        @Override // p085ef.C6865u.AbstractC6867b
        /* renamed from: b */
        public boolean mo24013b(C6865u detector) {
            C9971q.m14633g(detector, "detector");
            double R0 = C6857q.this.m24046R0();
            C6857q qVar = C6857q.this;
            qVar.f38285L = qVar.m24046R0() * detector.m24020g();
            long h = detector.m24019h();
            if (h > 0) {
                C6857q qVar2 = C6857q.this;
                qVar2.f38286M = (qVar2.m24046R0() - R0) / h;
            }
            if (Math.abs(C6857q.this.f38290Q - detector.m24023d()) < C6857q.this.f38291R || C6857q.this.m24226O() != 2) {
                return true;
            }
            C6857q.this.m24201j();
            return true;
        }

        @Override // p085ef.C6865u.AbstractC6867b
        /* renamed from: c */
        public boolean mo24012c(C6865u detector) {
            C9971q.m14633g(detector, "detector");
            C6857q.this.f38290Q = detector.m24023d();
            return true;
        }
    }

    /* renamed from: P0 */
    public final float m24048P0() {
        return this.f38287N;
    }

    /* renamed from: Q0 */
    public final float m24047Q0() {
        return this.f38288O;
    }

    /* renamed from: R0 */
    public final double m24046R0() {
        return this.f38285L;
    }

    /* renamed from: S0 */
    public final double m24045S0() {
        return this.f38286M;
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        if (m24226O() == 0) {
            View S = m24222S();
            C9971q.m14636d(S);
            Context context = S.getContext();
            mo24030l0();
            this.f38289P = new C6865u(context, this.f38292S);
            this.f38291R = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f38287N = event.getX();
            this.f38288O = event.getY();
            m24194o();
        }
        C6865u uVar = this.f38289P;
        if (uVar != null) {
            uVar.m24017j(sourceEvent);
        }
        C6865u uVar2 = this.f38289P;
        if (uVar2 != null) {
            PointF H0 = m24235H0(new PointF(uVar2.m24022e(), uVar2.m24021f()));
            this.f38287N = H0.x;
            this.f38288O = H0.y;
        }
        int pointerCount = sourceEvent.getPointerCount();
        if (sourceEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (m24226O() == 4 && pointerCount < 2) {
            m24248A();
        } else if (sourceEvent.getActionMasked() == 1) {
            m24245C();
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        this.f38289P = null;
        this.f38287N = Float.NaN;
        this.f38288O = Float.NaN;
        mo24030l0();
    }

    @Override // p085ef.C6832d
    /* renamed from: k */
    public void mo23996k(boolean z) {
        if (m24226O() != 4) {
            mo24030l0();
        }
        super.mo23996k(z);
    }

    @Override // p085ef.C6832d
    /* renamed from: l0 */
    public void mo24030l0() {
        this.f38286M = 0.0d;
        this.f38285L = 1.0d;
    }
}
