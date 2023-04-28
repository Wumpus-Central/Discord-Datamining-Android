package p085ef;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00066"}, m15073d2 = {"Lef/b;", "Lef/d;", "Landroid/view/MotionEvent;", "event", "", "P0", "", "Q0", "L0", "k0", "force", "k", "sourceEvent", "e0", "d0", "g0", "", "L", "I", "getNumberOfPointersRequired", "()I", "O0", "(I)V", "numberOfPointersRequired", "M", "getDirection", "N0", "direction", "", "N", "J", "maxDurationMs", "O", "minAcceptableDelta", "", "P", "F", "startX", "Q", "startY", "Landroid/os/Handler;", "R", "Landroid/os/Handler;", "handler", "S", "maxNumberOfPointersSimultaneously", "Ljava/lang/Runnable;", "T", "Ljava/lang/Runnable;", "failDelayed", "<init>", "()V", "U", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.b */
/* loaded from: classes8.dex */
public final class C6829b extends C6832d<C6829b> {

    /* renamed from: U */
    public static final C6830a f38235U = new C6830a(null);

    /* renamed from: P */
    private float f38240P;

    /* renamed from: Q */
    private float f38241Q;

    /* renamed from: R */
    private Handler f38242R;

    /* renamed from: S */
    private int f38243S;

    /* renamed from: L */
    private int f38236L = 1;

    /* renamed from: M */
    private int f38237M = 1;

    /* renamed from: N */
    private final long f38238N = 800;

    /* renamed from: O */
    private final long f38239O = 160;

    /* renamed from: T */
    private final Runnable f38244T = new Runnable() { // from class: ef.a
        @Override // java.lang.Runnable
        public final void run() {
            C6829b.m24253M0(C6829b.this);
        }
    };

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m15073d2 = {"Lef/b$a;", "", "", "DEFAULT_DIRECTION", "I", "", "DEFAULT_MAX_DURATION_MS", "J", "DEFAULT_MIN_ACCEPTABLE_DELTA", "DEFAULT_NUMBER_OF_TOUCHES_REQUIRED", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.b$a */
    /* loaded from: classes8.dex */
    public static final class C6830a {
        private C6830a() {
        }

        public /* synthetic */ C6830a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: L0 */
    private final void m24254L0(MotionEvent motionEvent) {
        if (!m24249Q0(motionEvent)) {
            m24245C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m24253M0(C6829b this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m24245C();
    }

    /* renamed from: P0 */
    private final void m24250P0(MotionEvent motionEvent) {
        this.f38240P = motionEvent.getRawX();
        this.f38241Q = motionEvent.getRawY();
        m24194o();
        this.f38243S = 1;
        Handler handler = this.f38242R;
        if (handler == null) {
            this.f38242R = new Handler(Looper.getMainLooper());
        } else {
            C9971q.m14636d(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f38242R;
        C9971q.m14636d(handler2);
        handler2.postDelayed(this.f38244T, this.f38238N);
    }

    /* renamed from: Q0 */
    private final boolean m24249Q0(MotionEvent motionEvent) {
        if (this.f38243S != this.f38236L || (((this.f38237M & 1) == 0 || motionEvent.getRawX() - this.f38240P <= ((float) this.f38239O)) && (((this.f38237M & 2) == 0 || this.f38240P - motionEvent.getRawX() <= ((float) this.f38239O)) && (((this.f38237M & 4) == 0 || this.f38241Q - motionEvent.getRawY() <= ((float) this.f38239O)) && ((this.f38237M & 8) == 0 || motionEvent.getRawY() - this.f38241Q <= ((float) this.f38239O)))))) {
            return false;
        }
        Handler handler = this.f38242R;
        C9971q.m14636d(handler);
        handler.removeCallbacksAndMessages(null);
        m24201j();
        return true;
    }

    /* renamed from: N0 */
    public final void m24252N0(int i) {
        this.f38237M = i;
    }

    /* renamed from: O0 */
    public final void m24251O0(int i) {
        this.f38236L = i;
    }

    @Override // p085ef.C6832d
    /* renamed from: d0 */
    protected void mo23999d0() {
        Handler handler = this.f38242R;
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
        if (O == 0) {
            m24250P0(sourceEvent);
        }
        if (O == 2) {
            m24249Q0(sourceEvent);
            if (sourceEvent.getPointerCount() > this.f38243S) {
                this.f38243S = sourceEvent.getPointerCount();
            }
            if (sourceEvent.getActionMasked() == 1) {
                m24254L0(sourceEvent);
            }
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        Handler handler = this.f38242R;
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
        this.f38236L = 1;
        this.f38237M = 1;
    }
}
