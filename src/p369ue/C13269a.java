package p369ue;

import android.view.MotionEvent;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0011B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m15073d2 = {"Lue/a;", "", "", "state", "", "g", "newState", "o", "Landroid/view/MotionEvent;", "event", "j", "", "p", "ev", "h", "(Landroid/view/MotionEvent;)Z", "i", "b", "()Z", "e", "d", "a", "c", "l", "n", "m", "k", "f", "Lue/a$a;", "Lue/a$a;", "callback", "<set-?>", "I", "getState$library_release", "()I", "getState$library_release$annotations", "()V", "<init>", "(Lue/a$a;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: ue.a */
/* loaded from: classes6.dex */
public final class C13269a {

    /* renamed from: c */
    public static final C13270b f29790c = new C13270b(null);

    /* renamed from: d */
    private static final String f29791d;

    /* renamed from: e */
    private static final ZoomLogger f29792e;

    /* renamed from: a */
    private final AbstractC0431a f29793a;

    /* renamed from: b */
    private int f29794b;

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u000f"}, m15073d2 = {"Lue/a$a;", "", "", "newState", "", "i", "", "c", "oldState", "b", "Landroid/view/MotionEvent;", "event", "h", "g", "f", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: ue.a$a */
    /* loaded from: classes6.dex */
    public interface AbstractC0431a {
        /* renamed from: b */
        void mo4095b(int i);

        /* renamed from: c */
        void mo4094c();

        /* renamed from: f */
        void mo4093f();

        /* renamed from: g */
        boolean mo4092g(MotionEvent motionEvent);

        /* renamed from: h */
        boolean mo4091h(MotionEvent motionEvent);

        /* renamed from: i */
        boolean mo4090i(int i);
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, m15073d2 = {"Lue/a$b;", "", "", "ANIMATING", "I", "FLINGING", "IDLE", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "PINCHING", "SCROLLING", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_LISTEN", "TOUCH_NO", "TOUCH_STEAL", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: ue.a$b */
    /* loaded from: classes6.dex */
    public static final class C13270b {
        private C13270b() {
        }

        public /* synthetic */ C13270b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String TAG = C13269a.class.getSimpleName();
        f29791d = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f29792e = aVar.m26250a(TAG);
    }

    public C13269a(AbstractC0431a callback) {
        C9971q.m14633g(callback, "callback");
        this.f29793a = callback;
    }

    /* renamed from: g */
    private final boolean m4105g(int i) {
        return i == 3;
    }

    /* renamed from: j */
    private final int m4102j(MotionEvent motionEvent) {
        int actionMasked;
        ZoomLogger zoomLogger = f29792e;
        zoomLogger.m26253f("processTouchEvent:", "start.");
        if (m4111a()) {
            return 2;
        }
        boolean h = this.f29793a.mo4091h(motionEvent);
        zoomLogger.m26253f("processTouchEvent:", "scaleResult:", Boolean.valueOf(h));
        if (!m4108d()) {
            h |= this.f29793a.mo4092g(motionEvent);
            zoomLogger.m26253f("processTouchEvent:", "flingResult:", Boolean.valueOf(h));
        }
        if (m4107e() && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            zoomLogger.m26257b("processTouchEvent:", "up event while scrolling, dispatching endScrollGesture.");
            this.f29793a.mo4093f();
        }
        if (h && !m4109c()) {
            zoomLogger.m26253f("processTouchEvent:", "returning: TOUCH_STEAL");
            return 2;
        } else if (h) {
            zoomLogger.m26253f("processTouchEvent:", "returning: TOUCH_LISTEN");
            return 1;
        } else {
            zoomLogger.m26253f("processTouchEvent:", "returning: TOUCH_NO");
            m4106f();
            return 0;
        }
    }

    /* renamed from: o */
    private final boolean m4097o(int i) {
        ZoomLogger zoomLogger = f29792e;
        zoomLogger.m26253f("trySetState:", m4096p(i));
        if (!this.f29793a.mo4090i(i)) {
            return false;
        }
        if (i == this.f29794b && !m4105g(i)) {
            return true;
        }
        int i2 = this.f29794b;
        if (i == 0) {
            this.f29793a.mo4094c();
        } else if (i != 1) {
            if (i != 2) {
                if (i == 4 && i2 == 3) {
                    return false;
                }
            } else if (i2 == 3) {
                return false;
            }
        } else if (i2 == 2 || i2 == 3) {
            return false;
        }
        this.f29793a.mo4095b(i2);
        zoomLogger.m26257b("setState:", m4096p(i));
        this.f29794b = i;
        return true;
    }

    /* renamed from: p */
    private final String m4096p(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "FLINGING" : "ANIMATING" : "PINCHING" : "SCROLLING" : "IDLE";
    }

    /* renamed from: a */
    public final boolean m4111a() {
        return this.f29794b == 3;
    }

    /* renamed from: b */
    public final boolean m4110b() {
        return this.f29794b == 4;
    }

    /* renamed from: c */
    public final boolean m4109c() {
        return this.f29794b == 0;
    }

    /* renamed from: d */
    public final boolean m4108d() {
        return this.f29794b == 2;
    }

    /* renamed from: e */
    public final boolean m4107e() {
        return this.f29794b == 1;
    }

    /* renamed from: f */
    public final boolean m4106f() {
        return m4097o(0);
    }

    /* renamed from: h */
    public final boolean m4104h(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        if (m4102j(ev) > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m4103i(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        if (m4102j(ev) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m4101k() {
        return m4097o(3);
    }

    /* renamed from: l */
    public final boolean m4100l() {
        return m4097o(4);
    }

    /* renamed from: m */
    public final boolean m4099m() {
        return m4097o(2);
    }

    /* renamed from: n */
    public final boolean m4098n() {
        return m4097o(1);
    }
}
