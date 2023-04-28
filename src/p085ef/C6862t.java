package p085ef;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085ef.C6860s;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R$\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+"}, m15073d2 = {"Lef/t;", "Lef/d;", "Landroid/view/MotionEvent;", "event", "sourceEvent", "", "e0", "", "force", "k", "g0", "l0", "Lef/s;", "L", "Lef/s;", "rotationGestureDetector", "", "<set-?>", "M", "D", "O0", "()D", ViewProps.ROTATION, "N", "P0", "velocity", "", "O", "F", "M0", "()F", "anchorX", "P", "N0", "anchorY", "Lef/s$a;", "Q", "Lef/s$a;", "gestureListener", "<init>", "()V", "R", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.t */
/* loaded from: classes8.dex */
public final class C6862t extends C6832d<C6862t> {

    /* renamed from: R */
    public static final C6863a f38293R = new C6863a(null);

    /* renamed from: L */
    private C6860s f38294L;

    /* renamed from: M */
    private double f38295M;

    /* renamed from: N */
    private double f38296N;

    /* renamed from: O */
    private float f38297O = Float.NaN;

    /* renamed from: P */
    private float f38298P = Float.NaN;

    /* renamed from: Q */
    private final C6860s.AbstractC6861a f38299Q = new C6864b();

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"Lef/t$a;", "", "", "ROTATION_RECOGNITION_THRESHOLD", "D", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.t$a */
    /* loaded from: classes8.dex */
    public static final class C6863a {
        private C6863a() {
        }

        public /* synthetic */ C6863a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m15073d2 = {"ef/t$b", "Lef/s$a;", "Lef/s;", "detector", "", "a", "b", "", "c", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.t$b */
    /* loaded from: classes8.dex */
    public static final class C6864b implements C6860s.AbstractC6861a {
        C6864b() {
        }

        @Override // p085ef.C6860s.AbstractC6861a
        /* renamed from: a */
        public boolean mo24029a(C6860s detector) {
            C9971q.m14633g(detector, "detector");
            double O0 = C6862t.this.m24032O0();
            C6862t tVar = C6862t.this;
            tVar.f38295M = tVar.m24032O0() + detector.m24040d();
            long e = detector.m24039e();
            if (e > 0) {
                C6862t tVar2 = C6862t.this;
                tVar2.f38296N = (tVar2.m24032O0() - O0) / e;
            }
            if (Math.abs(C6862t.this.m24032O0()) < 0.08726646259971647d || C6862t.this.m24226O() != 2) {
                return true;
            }
            C6862t.this.m24201j();
            return true;
        }

        @Override // p085ef.C6860s.AbstractC6861a
        /* renamed from: b */
        public boolean mo24028b(C6860s detector) {
            C9971q.m14633g(detector, "detector");
            return true;
        }

        @Override // p085ef.C6860s.AbstractC6861a
        /* renamed from: c */
        public void mo24027c(C6860s detector) {
            C9971q.m14633g(detector, "detector");
            C6862t.this.m24248A();
        }
    }

    public C6862t() {
        m24175y0(false);
    }

    /* renamed from: M0 */
    public final float m24034M0() {
        return this.f38297O;
    }

    /* renamed from: N0 */
    public final float m24033N0() {
        return this.f38298P;
    }

    /* renamed from: O0 */
    public final double m24032O0() {
        return this.f38295M;
    }

    /* renamed from: P0 */
    public final double m24031P0() {
        return this.f38296N;
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        if (m24226O() == 0) {
            mo24030l0();
            this.f38294L = new C6860s(this.f38299Q);
            this.f38297O = event.getX();
            this.f38298P = event.getY();
            m24194o();
        }
        C6860s sVar = this.f38294L;
        if (sVar != null) {
            sVar.m24038f(sourceEvent);
        }
        C6860s sVar2 = this.f38294L;
        if (sVar2 != null) {
            PointF H0 = m24235H0(new PointF(sVar2.m24042b(), sVar2.m24041c()));
            this.f38297O = H0.x;
            this.f38298P = H0.y;
        }
        if (sourceEvent.getActionMasked() != 1) {
            return;
        }
        if (m24226O() == 4) {
            m24248A();
        } else {
            m24245C();
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        this.f38294L = null;
        this.f38297O = Float.NaN;
        this.f38298P = Float.NaN;
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
        this.f38296N = 0.0d;
        this.f38295M = 0.0d;
    }
}
