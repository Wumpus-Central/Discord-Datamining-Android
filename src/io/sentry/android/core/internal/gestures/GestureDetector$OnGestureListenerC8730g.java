package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.AbstractC8807b2;
import io.sentry.AbstractC8861f0;
import io.sentry.AbstractC8869g0;
import io.sentry.AbstractC8932m0;
import io.sentry.C8843d;
import io.sentry.C8944n4;
import io.sentry.C8965p4;
import io.sentry.C9116v;
import io.sentry.EnumC8866f4;
import io.sentry.EnumC8942n3;
import io.sentry.Scope;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.EnumC9019y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* renamed from: io.sentry.android.core.internal.gestures.g */
/* loaded from: classes8.dex */
public final class GestureDetector$OnGestureListenerC8730g implements GestureDetector.OnGestureListener {

    /* renamed from: k */
    private final WeakReference<Activity> f19306k;

    /* renamed from: l */
    private final AbstractC8861f0 f19307l;

    /* renamed from: m */
    private final SentryAndroidOptions f19308m;

    /* renamed from: n */
    private final boolean f19309n;

    /* renamed from: o */
    private WeakReference<View> f19310o = null;

    /* renamed from: p */
    private AbstractC8932m0 f19311p = null;

    /* renamed from: q */
    private String f19312q = null;

    /* renamed from: r */
    private final C8732b f19313r = new C8732b(null);

    /* renamed from: io.sentry.android.core.internal.gestures.g$a */
    /* loaded from: classes8.dex */
    class C8731a implements AbstractC8738k {
        C8731a() {
        }

        @Override // io.sentry.android.core.internal.gestures.AbstractC8738k
        /* renamed from: a */
        public boolean mo18234a(View view) {
            return C8739l.m18228e(view, GestureDetector$OnGestureListenerC8730g.this.f19309n);
        }

        @Override // io.sentry.android.core.internal.gestures.AbstractC8738k
        /* renamed from: b */
        public boolean mo18233b() {
            return true;
        }
    }

    public GestureDetector$OnGestureListenerC8730g(Activity activity, AbstractC8861f0 f0Var, SentryAndroidOptions sentryAndroidOptions, boolean z) {
        this.f19306k = new WeakReference<>(activity);
        this.f19307l = f0Var;
        this.f19308m = sentryAndroidOptions;
        this.f19309n = z;
    }

    /* renamed from: g */
    private void m18264g(View view, String str, Map<String, Object> map, MotionEvent motionEvent) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        C9116v vVar = new C9116v();
        vVar.m16973h("android:motionEvent", motionEvent);
        vVar.m16973h("android:view", view);
        this.f19307l.mo17830h(C8843d.m17903r(str, C8739l.m18230c(view), canonicalName, map), vVar);
    }

    /* renamed from: j */
    private View m18261j(String str) {
        Activity activity = this.f19306k.get();
        if (activity == null) {
            AbstractC8869g0 logger = this.f19308m.getLogger();
            EnumC8942n3 n3Var = EnumC8942n3.DEBUG;
            logger.mo17722c(n3Var, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            AbstractC8869g0 logger2 = this.f19308m.getLogger();
            EnumC8942n3 n3Var2 = EnumC8942n3.DEBUG;
            logger2.mo17722c(n3Var2, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        AbstractC8869g0 logger3 = this.f19308m.getLogger();
        EnumC8942n3 n3Var3 = EnumC8942n3.DEBUG;
        logger3.mo17722c(n3Var3, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    /* renamed from: k */
    private String m18260k(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m18259l(Scope scope, AbstractC8932m0 m0Var, AbstractC8932m0 m0Var2) {
        if (m0Var2 == null) {
            scope.m18370x(m0Var);
        } else {
            this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", m0Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m18258m(Scope scope, AbstractC8932m0 m0Var) {
        if (m0Var == this.f19311p) {
            scope.m18390d();
        }
    }

    /* renamed from: r */
    private void m18253r(View view, String str) {
        Activity activity;
        View view2;
        if (this.f19308m.isTracingEnabled() && this.f19308m.isEnableUserInteractionTracing()) {
            if (this.f19306k.get() == null) {
                this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            try {
                String b = C8739l.m18231b(view);
                WeakReference<View> weakReference = this.f19310o;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (this.f19311p != null) {
                    if (!view.equals(view2) || !str.equals(this.f19312q) || this.f19311p.mo16843a()) {
                        m18252s(EnumC8866f4.OK);
                    } else {
                        this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "The view with id: " + b + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                        if (this.f19308m.getIdleTimeout() != null) {
                            this.f19311p.mo16832l();
                            return;
                        }
                        return;
                    }
                }
                C8965p4 p4Var = new C8965p4();
                p4Var.m17535l(true);
                p4Var.m17539h(this.f19308m.getIdleTimeout());
                p4Var.m17536k(true);
                final AbstractC8932m0 s = this.f19307l.mo17819s(new C8944n4(m18260k(activity) + "." + b, EnumC9019y.COMPONENT, "ui.action." + str), p4Var);
                this.f19307l.mo17829i(new AbstractC8807b2() { // from class: io.sentry.android.core.internal.gestures.d
                    @Override // io.sentry.AbstractC8807b2
                    /* renamed from: a */
                    public final void mo16755a(Scope scope) {
                        GestureDetector$OnGestureListenerC8730g.this.m18256o(s, scope);
                    }
                });
                this.f19311p = s;
                this.f19310o = new WeakReference<>(view);
                this.f19312q = str;
            } catch (Resources.NotFoundException unused) {
                this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "View id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m18256o(final Scope scope, final AbstractC8932m0 m0Var) {
        scope.m18394B(new Scope.AbstractC8687b() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.Scope.AbstractC8687b
            /* renamed from: a */
            public final void mo16971a(AbstractC8932m0 m0Var2) {
                GestureDetector$OnGestureListenerC8730g.this.m18259l(scope, m0Var, m0Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m18255p(final Scope scope) {
        scope.m18394B(new Scope.AbstractC8687b() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.Scope.AbstractC8687b
            /* renamed from: a */
            public final void mo16971a(AbstractC8932m0 m0Var) {
                GestureDetector$OnGestureListenerC8730g.this.m18258m(scope, m0Var);
            }
        });
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f19313r.m18242j();
        this.f19313r.f19317c = motionEvent.getX();
        this.f19313r.f19318d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f19313r.f19315a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        View j = m18261j("onScroll");
        if (!(j == null || motionEvent == null || this.f19313r.f19315a != null)) {
            View a = C8739l.m18232a(j, motionEvent.getX(), motionEvent.getY(), new C8731a());
            if (a == null) {
                this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.f19313r.m18241k(a);
            this.f19313r.f19315a = ViewProps.SCROLL;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View j = m18261j("onSingleTapUp");
        if (!(j == null || motionEvent == null)) {
            View a = C8739l.m18232a(j, motionEvent.getX(), motionEvent.getY(), new AbstractC8738k() { // from class: io.sentry.android.core.internal.gestures.c
                @Override // io.sentry.android.core.internal.gestures.AbstractC8738k
                /* renamed from: a */
                public final boolean mo18234a(View view) {
                    boolean f;
                    f = C8739l.m18227f(view);
                    return f;
                }

                @Override // io.sentry.android.core.internal.gestures.AbstractC8738k
                /* renamed from: b */
                public /* synthetic */ boolean mo18233b() {
                    return C8737j.m18235a(this);
                }
            });
            if (a == null) {
                this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            m18264g(a, "click", Collections.emptyMap(), motionEvent);
            m18253r(a, "click");
        }
        return false;
    }

    /* renamed from: q */
    public void m18254q(MotionEvent motionEvent) {
        View j = m18261j("onUp");
        View view = (View) this.f19313r.f19316b.get();
        if (j != null && view != null) {
            if (this.f19313r.f19315a == null) {
                this.f19308m.getLogger().mo17722c(EnumC8942n3.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            m18264g(view, this.f19313r.f19315a, Collections.singletonMap("direction", this.f19313r.m18243i(motionEvent)), motionEvent);
            m18253r(view, this.f19313r.f19315a);
            this.f19313r.m18242j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m18252s(EnumC8866f4 f4Var) {
        AbstractC8932m0 m0Var = this.f19311p;
        if (m0Var != null) {
            m0Var.mo16834j(f4Var);
        }
        this.f19307l.mo17829i(new AbstractC8807b2() { // from class: io.sentry.android.core.internal.gestures.b
            @Override // io.sentry.AbstractC8807b2
            /* renamed from: a */
            public final void mo16755a(Scope scope) {
                GestureDetector$OnGestureListenerC8730g.this.m18255p(scope);
            }
        });
        this.f19311p = null;
        WeakReference<View> weakReference = this.f19310o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f19312q = null;
    }

    /* renamed from: io.sentry.android.core.internal.gestures.g$b */
    /* loaded from: classes8.dex */
    private static final class C8732b {

        /* renamed from: a */
        private String f19315a;

        /* renamed from: b */
        private WeakReference<View> f19316b;

        /* renamed from: c */
        private float f19317c;

        /* renamed from: d */
        private float f19318d;

        private C8732b() {
            this.f19315a = null;
            this.f19316b = new WeakReference<>(null);
            this.f19317c = 0.0f;
            this.f19318d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public String m18243i(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.f19317c;
            float y = motionEvent.getY() - this.f19318d;
            if (Math.abs(x) > Math.abs(y)) {
                if (x > 0.0f) {
                    return ViewProps.RIGHT;
                }
                return ViewProps.LEFT;
            } else if (y > 0.0f) {
                return "down";
            } else {
                return "up";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public void m18242j() {
            this.f19316b.clear();
            this.f19315a = null;
            this.f19317c = 0.0f;
            this.f19318d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m18241k(View view) {
            this.f19316b = new WeakReference<>(view);
        }

        /* synthetic */ C8732b(C8731a aVar) {
            this();
        }
    }
}
