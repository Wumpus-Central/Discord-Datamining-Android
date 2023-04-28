package p085ef;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001oB\u0011\u0012\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bl\u0010mJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0007J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0014J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0002H\u0016J\b\u00100\u001a\u00020\u0005H\u0014J\b\u00101\u001a\u00020\u0005H\u0014J\b\u00102\u001a\u00020\u0005H\u0016R$\u00108\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105R\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00105R\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00105R\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00105R\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00105R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00105R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00105R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00105R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00105R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010P\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00105R\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00105R\u0016\u0010R\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00105R\u0016\u0010T\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00105R\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00105R\u0016\u0010W\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00105R\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010JR\u0016\u0010^\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bf\u00107R\u0011\u0010i\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u00107¨\u0006p"}, m15073d2 = {"Lef/p;", "Lef/d;", "", "g1", "h1", "", "k0", "", "activeOffsetXStart", "S0", "activeOffsetXEnd", "R0", "failOffsetXStart", "X0", "failOffsetXEnd", "W0", "activeOffsetYStart", "U0", "activeOffsetYEnd", "T0", "failOffsetYStart", "Z0", "failOffsetYEnd", "Y0", "minDist", "b1", "", "minPointers", "c1", "maxPointers", "a1", "averageTouches", "V0", "", "time", "Q0", "minVelocity", "d1", "minVelocityX", "e1", "minVelocityY", "f1", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "force", "k", "d0", "g0", "l0", "<set-?>", "L", "F", "O0", "()F", "velocityX", "M", "P0", "velocityY", "N", "defaultMinDistSq", "O", "minDistSq", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "minVelocitySq", "a0", "I", "b0", "c0", "startX", "startY", "offsetX", "f0", "offsetY", "lastX", "h0", "lastY", "Landroid/view/VelocityTracker;", "i0", "Landroid/view/VelocityTracker;", "velocityTracker", "j0", "J", "activateAfterLongPress", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "activateDelayed", "Landroid/os/Handler;", "m0", "Landroid/os/Handler;", "handler", "M0", "translationX", "N0", "translationY", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "n0", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.p */
/* loaded from: classes8.dex */
public final class C6855p extends C6832d<C6855p> {

    /* renamed from: n0 */
    public static final C6856a f14976n0 = new C6856a(null);

    /* renamed from: L */
    private float f38270L;

    /* renamed from: M */
    private float f38271M;

    /* renamed from: N */
    private final float f38272N;

    /* renamed from: O */
    private float f38273O;

    /* renamed from: c0 */
    private float f14979c0;

    /* renamed from: d0 */
    private float f14980d0;

    /* renamed from: e0 */
    private float f14981e0;

    /* renamed from: f0 */
    private float f14982f0;

    /* renamed from: g0 */
    private float f14983g0;

    /* renamed from: h0 */
    private float f14984h0;

    /* renamed from: i0 */
    private VelocityTracker f14985i0;

    /* renamed from: j0 */
    private boolean f14986j0;

    /* renamed from: k0 */
    private long f14987k0;

    /* renamed from: m0 */
    private Handler f14989m0;

    /* renamed from: P */
    private float f38274P = Float.MAX_VALUE;

    /* renamed from: Q */
    private float f38275Q = Float.MIN_VALUE;

    /* renamed from: R */
    private float f38276R = Float.MIN_VALUE;

    /* renamed from: S */
    private float f38277S = Float.MAX_VALUE;

    /* renamed from: T */
    private float f38278T = Float.MAX_VALUE;

    /* renamed from: U */
    private float f38279U = Float.MIN_VALUE;

    /* renamed from: V */
    private float f38280V = Float.MIN_VALUE;

    /* renamed from: W */
    private float f38281W = Float.MAX_VALUE;

    /* renamed from: X */
    private float f38282X = Float.MAX_VALUE;

    /* renamed from: Y */
    private float f38283Y = Float.MAX_VALUE;

    /* renamed from: Z */
    private float f38284Z = Float.MAX_VALUE;

    /* renamed from: a0 */
    private int f14977a0 = 1;

    /* renamed from: b0 */
    private int f14978b0 = 10;

    /* renamed from: l0 */
    private final Runnable f14988l0 = new Runnable() { // from class: ef.o
        @Override // java.lang.Runnable
        public final void run() {
            C6855p.m24078L0(C6855p.this);
        }
    };

    @Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lef/p$a;", "", "Landroid/view/VelocityTracker;", "tracker", "Landroid/view/MotionEvent;", "event", "", "b", "", "DEFAULT_ACTIVATE_AFTER_LONG_PRESS", "J", "", "DEFAULT_MAX_POINTERS", "I", "DEFAULT_MIN_POINTERS", "", "MAX_VALUE_IGNORE", "F", "MIN_VALUE_IGNORE", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.p$a */
    /* loaded from: classes8.dex */
    public static final class C6856a {
        private C6856a() {
        }

        public /* synthetic */ C6856a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m24054b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            C9971q.m14636d(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public C6855p(Context context) {
        this.f38273O = Float.MIN_VALUE;
        C9971q.m14636d(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f = scaledTouchSlop * scaledTouchSlop;
        this.f38272N = f;
        this.f38273O = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m24078L0(C6855p this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m24201j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
        if (r1 != false) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
        if (r3 != false) goto L_0x00af;
     */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m24057g1() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p085ef.C6855p.m24057g1():boolean");
    }

    /* renamed from: h1 */
    private final boolean m24056h1() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f = (this.f14983g0 - this.f14979c0) + this.f14981e0;
        float f2 = (this.f14984h0 - this.f14980d0) + this.f14982f0;
        if (this.f14987k0 <= 0 || (f * f) + (f2 * f2) <= this.f38272N) {
            float f3 = this.f38276R;
            if (f3 == Float.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            if (!z && f < f3) {
                return true;
            }
            float f4 = this.f38277S;
            if (f4 == Float.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && f > f4) {
                return true;
            }
            float f5 = this.f38280V;
            if (f5 == Float.MIN_VALUE) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && f2 < f5) {
                return true;
            }
            float f6 = this.f38281W;
            if (f6 == Float.MAX_VALUE) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || f2 <= f6) {
                return false;
            }
            return true;
        }
        Handler handler = this.f14989m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return true;
    }

    /* renamed from: M0 */
    public final float m24077M0() {
        return (this.f14983g0 - this.f14979c0) + this.f14981e0;
    }

    /* renamed from: N0 */
    public final float m24076N0() {
        return (this.f14984h0 - this.f14980d0) + this.f14982f0;
    }

    /* renamed from: O0 */
    public final float m24075O0() {
        return this.f38270L;
    }

    /* renamed from: P0 */
    public final float m24074P0() {
        return this.f38271M;
    }

    /* renamed from: Q0 */
    public final C6855p m24073Q0(long j) {
        this.f14987k0 = j;
        return this;
    }

    /* renamed from: R0 */
    public final C6855p m24072R0(float f) {
        this.f38275Q = f;
        return this;
    }

    /* renamed from: S0 */
    public final C6855p m24071S0(float f) {
        this.f38274P = f;
        return this;
    }

    /* renamed from: T0 */
    public final C6855p m24070T0(float f) {
        this.f38279U = f;
        return this;
    }

    /* renamed from: U0 */
    public final C6855p m24069U0(float f) {
        this.f38278T = f;
        return this;
    }

    /* renamed from: V0 */
    public final C6855p m24068V0(boolean z) {
        this.f14986j0 = z;
        return this;
    }

    /* renamed from: W0 */
    public final C6855p m24067W0(float f) {
        this.f38277S = f;
        return this;
    }

    /* renamed from: X0 */
    public final C6855p m24066X0(float f) {
        this.f38276R = f;
        return this;
    }

    /* renamed from: Y0 */
    public final C6855p m24065Y0(float f) {
        this.f38281W = f;
        return this;
    }

    /* renamed from: Z0 */
    public final C6855p m24064Z0(float f) {
        this.f38280V = f;
        return this;
    }

    /* renamed from: a1 */
    public final C6855p m24063a1(int i) {
        this.f14978b0 = i;
        return this;
    }

    /* renamed from: b1 */
    public final C6855p m24062b1(float f) {
        this.f38273O = f * f;
        return this;
    }

    /* renamed from: c1 */
    public final C6855p m24061c1(int i) {
        this.f14977a0 = i;
        return this;
    }

    @Override // p085ef.C6832d
    /* renamed from: d0 */
    protected void mo23999d0() {
        Handler handler = this.f14989m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: d1 */
    public final C6855p m24060d1(float f) {
        this.f38284Z = f * f;
        return this;
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        int O = m24226O();
        int actionMasked = sourceEvent.getActionMasked();
        if (actionMasked == 5 || actionMasked == 6) {
            this.f14981e0 += this.f14983g0 - this.f14979c0;
            this.f14982f0 += this.f14984h0 - this.f14980d0;
            C6842i iVar = C6842i.f14968a;
            this.f14983g0 = iVar.m24112a(sourceEvent, this.f14986j0);
            float b = iVar.m24111b(sourceEvent, this.f14986j0);
            this.f14984h0 = b;
            this.f14979c0 = this.f14983g0;
            this.f14980d0 = b;
        } else {
            C6842i iVar2 = C6842i.f14968a;
            this.f14983g0 = iVar2.m24112a(sourceEvent, this.f14986j0);
            this.f14984h0 = iVar2.m24111b(sourceEvent, this.f14986j0);
        }
        if (O != 0 || sourceEvent.getPointerCount() < this.f14977a0) {
            VelocityTracker velocityTracker = this.f14985i0;
            if (velocityTracker != null) {
                f14976n0.m24054b(velocityTracker, sourceEvent);
                VelocityTracker velocityTracker2 = this.f14985i0;
                C9971q.m14636d(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                VelocityTracker velocityTracker3 = this.f14985i0;
                C9971q.m14636d(velocityTracker3);
                this.f38270L = velocityTracker3.getXVelocity();
                VelocityTracker velocityTracker4 = this.f14985i0;
                C9971q.m14636d(velocityTracker4);
                this.f38271M = velocityTracker4.getYVelocity();
            }
        } else {
            mo24030l0();
            this.f14981e0 = 0.0f;
            this.f14982f0 = 0.0f;
            this.f38270L = 0.0f;
            this.f38271M = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f14985i0 = obtain;
            f14976n0.m24054b(obtain, sourceEvent);
            m24194o();
            if (this.f14987k0 > 0) {
                if (this.f14989m0 == null) {
                    this.f14989m0 = new Handler(Looper.getMainLooper());
                }
                Handler handler = this.f14989m0;
                C9971q.m14636d(handler);
                handler.postDelayed(this.f14988l0, this.f14987k0);
            }
        }
        if (actionMasked == 1) {
            if (O == 4) {
                m24248A();
            } else {
                m24245C();
            }
        } else if (actionMasked != 5 || sourceEvent.getPointerCount() <= this.f14978b0) {
            if (actionMasked == 6 && O == 4 && sourceEvent.getPointerCount() < this.f14977a0) {
                m24245C();
            } else if (O != 2) {
            } else {
                if (m24056h1()) {
                    m24245C();
                } else if (m24057g1()) {
                    m24201j();
                }
            }
        } else if (O == 4) {
            m24192p();
        } else {
            m24245C();
        }
    }

    /* renamed from: e1 */
    public final C6855p m24059e1(float f) {
        this.f38282X = f;
        return this;
    }

    /* renamed from: f1 */
    public final C6855p m24058f1(float f) {
        this.f38283Y = f;
        return this;
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        Handler handler = this.f14989m0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f14985i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14985i0 = null;
        }
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
    /* renamed from: k0 */
    public void mo23995k0() {
        super.mo23995k0();
        this.f38274P = Float.MAX_VALUE;
        this.f38275Q = Float.MIN_VALUE;
        this.f38276R = Float.MIN_VALUE;
        this.f38277S = Float.MAX_VALUE;
        this.f38278T = Float.MAX_VALUE;
        this.f38279U = Float.MIN_VALUE;
        this.f38280V = Float.MIN_VALUE;
        this.f38281W = Float.MAX_VALUE;
        this.f38282X = Float.MAX_VALUE;
        this.f38283Y = Float.MAX_VALUE;
        this.f38284Z = Float.MAX_VALUE;
        this.f38273O = this.f38272N;
        this.f14977a0 = 1;
        this.f14978b0 = 10;
        this.f14987k0 = 0L;
        this.f14986j0 = false;
    }

    @Override // p085ef.C6832d
    /* renamed from: l0 */
    public void mo24030l0() {
        this.f14979c0 = this.f14983g0;
        this.f14980d0 = this.f14984h0;
    }
}
