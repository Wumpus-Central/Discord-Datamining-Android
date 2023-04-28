package p085ef;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.react.views.textinput.ReactEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003 !\"B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u0014\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\b\u0010\u0012\u001a\u00020\u0002H\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006#"}, m15073d2 = {"Lef/m;", "Lef/d;", "", "k0", "", "shouldActivateOnStart", "M0", "disallowInterruption", "L0", "handler", "C0", "B0", "f0", "Landroid/view/MotionEvent;", "event", "sourceEvent", "e0", "d0", "g0", "L", "Z", "<set-?>", "M", "K0", "()Z", "Lef/m$d;", "N", "Lef/m$d;", "hook", "<init>", "()V", "O", "b", "c", "d", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.m */
/* loaded from: classes8.dex */
public final class C6847m extends C6832d<C6847m> {

    /* renamed from: O */
    public static final C6849b f38265O = new C6849b(null);

    /* renamed from: P */
    private static final C6848a f38266P = new C6848a();

    /* renamed from: L */
    private boolean f38267L;

    /* renamed from: M */
    private boolean f38268M;

    /* renamed from: N */
    private AbstractC6851d f38269N = f38266P;

    @Metadata(m15074d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m15073d2 = {"ef/m$a", "Lef/m$d;", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.m$a */
    /* loaded from: classes8.dex */
    public static final class C6848a implements AbstractC6851d {
        C6848a() {
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: a */
        public boolean mo24094a() {
            return AbstractC6851d.C6852a.m24085d(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: b */
        public boolean mo24093b() {
            return AbstractC6851d.C6852a.m24083f(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: c */
        public boolean mo24092c() {
            return AbstractC6851d.C6852a.m24087b(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: d */
        public boolean mo24091d(C6832d<?> dVar) {
            return AbstractC6851d.C6852a.m24084e(this, dVar);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: e */
        public void mo24090e(MotionEvent motionEvent) {
            AbstractC6851d.C6852a.m24086c(this, motionEvent);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: f */
        public void mo24089f(MotionEvent motionEvent) {
            AbstractC6851d.C6852a.m24088a(this, motionEvent);
        }
    }

    @Metadata(m15074d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0006*\u0001\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m15073d2 = {"Lef/m$b;", "", "Landroid/view/View;", "view", "Landroid/view/MotionEvent;", "event", "", "b", "ef/m$a", "defaultHook", "Lef/m$a;", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.m$b */
    /* loaded from: classes8.dex */
    public static final class C6849b {
        private C6849b() {
        }

        public /* synthetic */ C6849b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m24095b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    @Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m15073d2 = {"Lef/m$c;", "Lef/m$d;", "Landroid/view/MotionEvent;", "event", "", "f", "Lef/d;", "handler", "", "d", "b", "e", "a", "Lef/m;", "k", "Lef/m;", "Lcom/facebook/react/views/textinput/ReactEditText;", "l", "Lcom/facebook/react/views/textinput/ReactEditText;", "editText", "", "m", "F", "startX", "n", "startY", "", "o", "I", "touchSlopSquared", "<init>", "(Lef/m;Lcom/facebook/react/views/textinput/ReactEditText;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.m$c */
    /* loaded from: classes8.dex */
    private static final class C6850c implements AbstractC6851d {

        /* renamed from: k */
        private final C6847m f14970k;

        /* renamed from: l */
        private final ReactEditText f14971l;

        /* renamed from: m */
        private float f14972m;

        /* renamed from: n */
        private float f14973n;

        /* renamed from: o */
        private int f14974o;

        public C6850c(C6847m handler, ReactEditText editText) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(editText, "editText");
            this.f14970k = handler;
            this.f14971l = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f14974o = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: a */
        public boolean mo24094a() {
            return true;
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: b */
        public boolean mo24093b() {
            return true;
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: c */
        public boolean mo24092c() {
            return AbstractC6851d.C6852a.m24087b(this);
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: d */
        public boolean mo24091d(C6832d<?> handler) {
            C9971q.m14633g(handler, "handler");
            if (handler.m24225P() <= 0 || (handler instanceof C6847m)) {
                return false;
            }
            return true;
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: e */
        public void mo24090e(MotionEvent event) {
            C9971q.m14633g(event, "event");
            this.f14970k.m24201j();
            this.f14971l.onTouchEvent(event);
            this.f14972m = event.getX();
            this.f14973n = event.getY();
        }

        @Override // p085ef.C6847m.AbstractC6851d
        /* renamed from: f */
        public void mo24089f(MotionEvent event) {
            C9971q.m14633g(event, "event");
            if (((event.getX() - this.f14972m) * (event.getX() - this.f14972m)) + ((event.getY() - this.f14973n) * (event.getY() - this.f14973n)) < this.f14974o) {
                this.f14971l.requestFocusFromJS();
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m15073d2 = {"Lef/m$d;", "", "", "c", "Landroid/view/MotionEvent;", "event", "", "f", "Lef/d;", "handler", "d", "b", "e", "a", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.m$d */
    /* loaded from: classes8.dex */
    public interface AbstractC6851d {

        @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* renamed from: ef.m$d$a */
        /* loaded from: classes8.dex */
        public static final class C6852a {
            /* renamed from: a */
            public static void m24088a(AbstractC6851d dVar, MotionEvent event) {
                C9971q.m14633g(event, "event");
            }

            /* renamed from: b */
            public static boolean m24087b(AbstractC6851d dVar) {
                return true;
            }

            /* renamed from: c */
            public static void m24086c(AbstractC6851d dVar, MotionEvent event) {
                C9971q.m14633g(event, "event");
            }

            /* renamed from: d */
            public static boolean m24085d(AbstractC6851d dVar) {
                return false;
            }

            /* renamed from: e */
            public static boolean m24084e(AbstractC6851d dVar, C6832d<?> handler) {
                C9971q.m14633g(handler, "handler");
                return false;
            }

            /* renamed from: f */
            public static boolean m24083f(AbstractC6851d dVar) {
                return false;
            }
        }

        /* renamed from: a */
        boolean mo24094a();

        /* renamed from: b */
        boolean mo24093b();

        /* renamed from: c */
        boolean mo24092c();

        /* renamed from: d */
        boolean mo24091d(C6832d<?> dVar);

        /* renamed from: e */
        void mo24090e(MotionEvent motionEvent);

        /* renamed from: f */
        void mo24089f(MotionEvent motionEvent);
    }

    public C6847m() {
        m24175y0(true);
    }

    @Override // p085ef.C6832d
    /* renamed from: B0 */
    public boolean mo24102B0(C6832d<?> handler) {
        C9971q.m14633g(handler, "handler");
        return !this.f38268M;
    }

    @Override // p085ef.C6832d
    /* renamed from: C0 */
    public boolean mo24101C0(C6832d<?> handler) {
        C9971q.m14633g(handler, "handler");
        if (super.mo24101C0(handler) || this.f38269N.mo24091d(handler)) {
            return true;
        }
        if ((handler instanceof C6847m) && handler.m24226O() == 4 && ((C6847m) handler).f38268M) {
            return false;
        }
        boolean z = !this.f38268M;
        int O = handler.m24226O();
        if ((m24226O() != 4 || O != 4 || !z) && m24226O() == 4 && z && (!this.f38269N.mo24094a() || handler.m24225P() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: K0 */
    public final boolean m24100K0() {
        return this.f38268M;
    }

    /* renamed from: L0 */
    public final C6847m m24099L0(boolean z) {
        this.f38268M = z;
        return this;
    }

    /* renamed from: M0 */
    public final C6847m m24098M0(boolean z) {
        this.f38267L = z;
        return this;
    }

    @Override // p085ef.C6832d
    /* renamed from: d0 */
    protected void mo23999d0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        View S = m24222S();
        C9971q.m14636d(S);
        S.onTouchEvent(obtain);
    }

    @Override // p085ef.C6832d
    /* renamed from: e0 */
    protected void mo23998e0(MotionEvent event, MotionEvent sourceEvent) {
        C9971q.m14633g(event, "event");
        C9971q.m14633g(sourceEvent, "sourceEvent");
        View S = m24222S();
        C9971q.m14636d(S);
        if (event.getActionMasked() == 1) {
            S.onTouchEvent(event);
            if ((m24226O() == 0 || m24226O() == 2) && S.isPressed()) {
                m24201j();
            }
            m24248A();
            this.f38269N.mo24089f(event);
        } else if (m24226O() == 0 || m24226O() == 2) {
            if (this.f38267L) {
                f38265O.m24095b(S, event);
                S.onTouchEvent(event);
                m24201j();
            } else if (f38265O.m24095b(S, event)) {
                S.onTouchEvent(event);
                m24201j();
            } else if (this.f38269N.mo24093b()) {
                this.f38269N.mo24090e(event);
            } else if (m24226O() == 2) {
            } else {
                if (this.f38269N.mo24092c()) {
                    m24194o();
                } else {
                    m24192p();
                }
            }
        } else if (m24226O() == 4) {
            S.onTouchEvent(event);
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: f0 */
    protected void mo24097f0() {
        View S = m24222S();
        if (S instanceof AbstractC6851d) {
            this.f38269N = (AbstractC6851d) S;
        } else if (S instanceof ReactEditText) {
            this.f38269N = new C6850c(this, (ReactEditText) S);
        }
    }

    @Override // p085ef.C6832d
    /* renamed from: g0 */
    protected void mo23997g0() {
        this.f38269N = f38266P;
    }

    @Override // p085ef.C6832d
    /* renamed from: k0 */
    public void mo23995k0() {
        super.mo23995k0();
        this.f38267L = false;
        this.f38268M = false;
    }
}
