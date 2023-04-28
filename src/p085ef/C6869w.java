package p085ef;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001IB\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0014J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0002H\u0014J\b\u0010 \u001a\u00020\u0002H\u0014R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\"R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\"R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\"R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u00109\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010\"R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\"R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010,R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006J"}, m15073d2 = {"Lef/w;", "Lef/d;", "", "V0", "L0", "", "U0", "k0", "", "numberOfTaps", "T0", "", "maxDelayMs", "N0", "maxDurationMs", "P0", "", "deltaX", "Q0", "deltaY", "R0", "maxDist", "O0", "minNumberOfPointers", "S0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "force", "k", "d0", "g0", "L", "F", "maxDeltaX", "M", "maxDeltaY", "N", "maxDistSq", "O", "J", "P", "Q", "I", "R", "S", "currentMaxNumberOfPointers", "T", "startX", "U", "startY", "V", "offsetX", "W", "offsetY", "X", "lastX", "Y", "lastY", "Landroid/os/Handler;", "Z", "Landroid/os/Handler;", "handler", "a0", "tapsSoFar", "Ljava/lang/Runnable;", "b0", "Ljava/lang/Runnable;", "failDelayed", "<init>", "()V", "c0", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.w */
/* loaded from: classes8.dex */
public final class C6869w extends C6832d<C6869w> {

    /* renamed from: c0 */
    public static final C6870a f15032c0 = new C6870a(null);

    /* renamed from: T */
    private float f38308T;

    /* renamed from: U */
    private float f38309U;

    /* renamed from: V */
    private float f38310V;

    /* renamed from: W */
    private float f38311W;

    /* renamed from: X */
    private float f38312X;

    /* renamed from: Y */
    private float f38313Y;

    /* renamed from: Z */
    private Handler f38314Z;

    /* renamed from: a0 */
    private int f15033a0;

    /* renamed from: L */
    private float f38300L = Float.MIN_VALUE;

    /* renamed from: M */
    private float f38301M = Float.MIN_VALUE;

    /* renamed from: N */
    private float f38302N = Float.MIN_VALUE;

    /* renamed from: O */
    private long f38303O = 500;

    /* renamed from: P */
    private long f38304P = 200;

    /* renamed from: Q */
    private int f38305Q = 1;

    /* renamed from: R */
    private int f38306R = 1;

    /* renamed from: S */
    private int f38307S = 1;

    /* renamed from: b0 */
    private final Runnable f15034b0 = new Runnable() { // from class: ef.v
        @Override // java.lang.Runnable
        public final void run() {
            C6869w.m24009M0(C6869w.this);
        }
    };

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m15073d2 = {"Lef/w$a;", "", "", "DEFAULT_MAX_DELAY_MS", "J", "DEFAULT_MAX_DURATION_MS", "", "DEFAULT_MIN_NUMBER_OF_POINTERS", "I", "DEFAULT_NUMBER_OF_TAPS", "", "MAX_VALUE_IGNORE", "F", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.w$a */
    /* loaded from: classes8.dex */
    public static final class C6870a {
        private C6870a() {
        }

        public /* synthetic */ C6870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6869w() {
        m24175y0(true);
    }

    /* renamed from: L0 */
    private final void m24010L0() {
        Handler handler = this.f38314Z;
        if (handler == null) {
            this.f38314Z = new Handler(Looper.getMainLooper());
        } else {
            C9971q.m14636d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.f15033a0 + 1;
        this.f15033a0 = i;
        if (i != this.f38305Q || this.f38307S < this.f38306R) {
            Handler handler2 = this.f38314Z;
            C9971q.m14636d(handler2);
            handler2.postDelayed(this.f15034b0, this.f38304P);
            return;
        }
        m24201j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m24009M0(C6869w this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m24245C();
    }

    /* renamed from: U0 */
    private final boolean m24001U0() {
        boolean z;
        boolean z2;
        boolean z3;
        float f = (this.f38312X - this.f38308T) + this.f38310V;
        if (this.f38300L == Float.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Math.abs(f) > this.f38300L) {
            return true;
        }
        float f2 = (this.f38313Y - this.f38309U) + this.f38311W;
        if (this.f38301M == Float.MIN_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && Math.abs(f2) > this.f38301M) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f38302N;
        if (f4 == Float.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || f3 <= f4) {
            return false;
        }
        return true;
    }

    /* renamed from: V0 */
    private final void m24000V0() {
        Handler handler = this.f38314Z;
        if (handler == null) {
            this.f38314Z = new Handler(Looper.getMainLooper());
        } else {
            C9971q.m14636d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f38314Z;
        C9971q.m14636d(handler2);
        handler2.postDelayed(this.f15034b0, this.f38303O);
    }

    /* renamed from: N0 */
    public final C6869w m24008N0(long j) {
        this.f38304P = j;
        return this;
    }

    /* renamed from: O0 */
    public final C6869w m24007O0(float f) {
        this.f38302N = f * f;
        return this;
    }

    /* renamed from: P0 */
    public final C6869w m24006P0(long j) {
        this.f38303O = j;
        return this;
    }

    /* renamed from: Q0 */
    public final C6869w m24005Q0(float f) {
        this.f38300L = f;
        return this;
    }

    /* renamed from: R0 */
    public final C6869w m24004R0(float f) {
        this.f38301M = f;
        return this;
    }

    /* renamed from: S0 */
    public final C6869w m24003S0(int i) {
        this.f38306R = i;
        return this;
    }

    /* renamed from: T0 */
    public final C6869w m24002T0(int i) {
        this.f38305Q = i;
        return this;
    }

    @Override // p085ef.C6832d
    /* renamed from: d0 */
    protected void mo23999d0() {
        Handler handler = this.f38314Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        int O = m24226O();
        int actionMasked = sourceEvent.getActionMasked();
        if (O == 0) {
            this.f38310V = 0.0f;
            this.f38311W = 0.0f;
            C6842i iVar = C6842i.f14968a;
            this.f38308T = iVar.m24112a(sourceEvent, true);
            this.f38309U = iVar.m24111b(sourceEvent, true);
        }
        if (actionMasked == 5 || actionMasked == 6) {
            this.f38310V += this.f38312X - this.f38308T;
            this.f38311W += this.f38313Y - this.f38309U;
            C6842i iVar2 = C6842i.f14968a;
            this.f38312X = iVar2.m24112a(sourceEvent, true);
            float b = iVar2.m24111b(sourceEvent, true);
            this.f38313Y = b;
            this.f38308T = this.f38312X;
            this.f38309U = b;
        } else {
            C6842i iVar3 = C6842i.f14968a;
            this.f38312X = iVar3.m24112a(sourceEvent, true);
            this.f38313Y = iVar3.m24111b(sourceEvent, true);
        }
        if (this.f38307S < sourceEvent.getPointerCount()) {
            this.f38307S = sourceEvent.getPointerCount();
        }
        if (m24001U0()) {
            m24245C();
        } else if (O == 0) {
            if (actionMasked == 0) {
                m24194o();
            }
            m24000V0();
        } else if (O != 2) {
        } else {
            if (actionMasked == 0) {
                m24000V0();
            } else if (actionMasked == 1) {
                m24010L0();
            }
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        this.f15033a0 = 0;
        this.f38307S = 0;
        Handler handler = this.f38314Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: k */
    public void mo23996k(boolean z) {
        super.mo23996k(z);
        m24248A();
    }

    @Override // p085ef.C6832d
    /* renamed from: k0 */
    public void mo23995k0() {
        super.mo23995k0();
        this.f38300L = Float.MIN_VALUE;
        this.f38301M = Float.MIN_VALUE;
        this.f38302N = Float.MIN_VALUE;
        this.f38303O = 500L;
        this.f38304P = 200L;
        this.f38305Q = 1;
        this.f38306R = 1;
    }
}
