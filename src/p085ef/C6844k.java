package p085ef;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00013B\u000f\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0014J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010&\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00064"}, m15073d2 = {"Lef/k;", "Lef/d;", "", "k0", "", "maxDist", "N0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "", "newState", "previousState", "h0", "prevState", "v", "u", "", "L", "J", "getMinDurationMs", "()J", "O0", "(J)V", "minDurationMs", "M", "F", "defaultMaxDistSq", "N", "maxDistSq", "O", "startX", "P", "startY", "Q", "startTime", "R", "previousTime", "Landroid/os/Handler;", "S", "Landroid/os/Handler;", "handler", "L0", "()I", "duration", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "T", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.k */
/* loaded from: classes8.dex */
public final class C6844k extends C6832d<C6844k> {

    /* renamed from: T */
    public static final C6845a f38256T = new C6845a(null);

    /* renamed from: L */
    private long f38257L = 500;

    /* renamed from: M */
    private final float f38258M;

    /* renamed from: N */
    private float f38259N;

    /* renamed from: O */
    private float f38260O;

    /* renamed from: P */
    private float f38261P;

    /* renamed from: Q */
    private long f38262Q;

    /* renamed from: R */
    private long f38263R;

    /* renamed from: S */
    private Handler f38264S;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m15073d2 = {"Lef/k$a;", "", "", "DEFAULT_MAX_DIST_DP", "F", "", "DEFAULT_MIN_DURATION_MS", "J", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.k$a */
    /* loaded from: classes8.dex */
    public static final class C6845a {
        private C6845a() {
        }

        public /* synthetic */ C6845a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6844k(Context context) {
        C9971q.m14633g(context, "context");
        m24175y0(true);
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        float f2 = f * f;
        this.f38258M = f2;
        this.f38259N = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m24108M0(C6844k this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m24201j();
    }

    /* renamed from: L0 */
    public final int m24109L0() {
        return (int) (this.f38263R - this.f38262Q);
    }

    /* renamed from: N0 */
    public final C6844k m24107N0(float f) {
        this.f38259N = f * f;
        return this;
    }

    /* renamed from: O0 */
    public final void m24106O0(long j) {
        this.f38257L = j;
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        if (m24226O() == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f38263R = uptimeMillis;
            this.f38262Q = uptimeMillis;
            m24194o();
            this.f38260O = sourceEvent.getRawX();
            this.f38261P = sourceEvent.getRawY();
            Handler handler = new Handler(Looper.getMainLooper());
            this.f38264S = handler;
            long j = this.f38257L;
            if (j > 0) {
                C9971q.m14636d(handler);
                handler.postDelayed(new Runnable() { // from class: ef.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6844k.m24108M0(C6844k.this);
                    }
                }, this.f38257L);
            } else if (j == 0) {
                m24201j();
            }
        }
        if (sourceEvent.getActionMasked() == 1) {
            Handler handler2 = this.f38264S;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.f38264S = null;
            }
            if (m24226O() == 4) {
                m24248A();
            } else {
                m24245C();
            }
        } else {
            float rawX = sourceEvent.getRawX() - this.f38260O;
            float rawY = sourceEvent.getRawY() - this.f38261P;
            if ((rawX * rawX) + (rawY * rawY) <= this.f38259N) {
                return;
            }
            if (m24226O() == 4) {
                m24192p();
            } else {
                m24245C();
            }
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: h0 */
    protected void mo24105h0(int i, int i2) {
        Handler handler = this.f38264S;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f38264S = null;
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: k0 */
    public void mo23995k0() {
        super.mo23995k0();
        this.f38257L = 500L;
        this.f38259N = this.f38258M;
    }

    @Override // p085ef.C6832d
    /* renamed from: u */
    public void mo24104u(MotionEvent event) {
        C9971q.m14633g(event, "event");
        this.f38263R = SystemClock.uptimeMillis();
        super.mo24104u(event);
    }

    @Override // p085ef.C6832d
    /* renamed from: v */
    public void mo24103v(int i, int i2) {
        this.f38263R = SystemClock.uptimeMillis();
        super.mo24103v(i, i2);
    }
}
