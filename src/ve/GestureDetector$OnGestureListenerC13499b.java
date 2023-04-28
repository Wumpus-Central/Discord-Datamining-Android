package ve;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p369ue.C13269a;
import p405we.C13869b;
import p405we.C13873c;
import p425xe.C14076b;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 N2\u00020\u0001:\u0001OB'\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\bL\u0010MJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016J,\u0010\u0012\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J,\u0010\u0015\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0018\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\"\u00109\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b;\u00106\"\u0004\b\u001e\u00108R\"\u0010?\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u00106\"\u0004\b\u001a\u00108R\"\u0010B\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bA\u00106\"\u0004\b&\u00108R\"\u0010E\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u00104\u001a\u0004\bD\u00106\"\u0004\b\"\u00108R\"\u0010I\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u00104\u001a\u0004\bG\u00106\"\u0004\bH\u00108¨\u0006P"}, m15073d2 = {"Lve/b;", "Landroid/view/GestureDetector$OnGestureListener;", "", "g", "Landroid/view/MotionEvent;", "event", "h", "(Landroid/view/MotionEvent;)Z", "", "e", "()V", "f", "onDown", "e1", "e2", "", "velocityX", "velocityY", "onFling", "distanceX", "distanceY", "onScroll", "onShowPress", "onSingleTapUp", "onLongPress", "Lxe/b;", "k", "Lxe/b;", "panManager", "Lue/a;", "l", "Lue/a;", "stateController", "Lwe/b;", "m", "Lwe/b;", "matrixController", "Landroid/view/GestureDetector;", "n", "Landroid/view/GestureDetector;", "detector", "Landroid/widget/OverScroller;", "o", "Landroid/widget/OverScroller;", "flingScroller", "Lxe/b$b;", "p", "Lxe/b$b;", "panStatusX", "q", "panStatusY", "r", "Z", "getFlingEnabled$library_release", "()Z", "i", "(Z)V", "flingEnabled", "s", "getScrollEnabled$library_release", "scrollEnabled", "t", "getOneFingerScrollEnabled$library_release", "oneFingerScrollEnabled", "u", "getTwoFingersScrollEnabled$library_release", "twoFingersScrollEnabled", "v", "getThreeFingersScrollEnabled$library_release", "threeFingersScrollEnabled", "w", "getFlingInOverPanEnabled$library_release", "j", "flingInOverPanEnabled", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lxe/b;Lue/a;Lwe/b;)V", "x", "a", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: ve.b */
/* loaded from: classes6.dex */
public final class GestureDetector$OnGestureListenerC13499b implements GestureDetector.OnGestureListener {

    /* renamed from: x */
    public static final C13500a f30165x = new C13500a(null);

    /* renamed from: y */
    private static final String f30166y;

    /* renamed from: z */
    private static final ZoomLogger f30167z;

    /* renamed from: k */
    private final C14076b f30168k;

    /* renamed from: l */
    private final C13269a f30169l;

    /* renamed from: m */
    private final C13869b f30170m;

    /* renamed from: n */
    private final GestureDetector f30171n;

    /* renamed from: o */
    private final OverScroller f30172o;

    /* renamed from: p */
    private final C14076b.C0455b f30173p = new C14076b.C0455b();

    /* renamed from: q */
    private final C14076b.C0455b f30174q = new C14076b.C0455b();

    /* renamed from: r */
    private boolean f30175r = true;

    /* renamed from: s */
    private boolean f30176s = true;

    /* renamed from: t */
    private boolean f30177t = true;

    /* renamed from: u */
    private boolean f30178u = true;

    /* renamed from: v */
    private boolean f30179v = true;

    /* renamed from: w */
    private boolean f30180w;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lve/b$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: ve.b$a */
    /* loaded from: classes6.dex */
    public static final class C13500a {
        private C13500a() {
        }

        public /* synthetic */ C13500a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.b$b */
    /* loaded from: classes6.dex */
    public static final class C0442b extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ ScaledPoint f30181k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0442b(ScaledPoint scaledPoint) {
            super(1);
            this.f30181k = scaledPoint;
        }

        /* renamed from: a */
        public final void m3549a(C13873c.C13874a animateUpdate) {
            C9971q.m14633g(animateUpdate, "$this$animateUpdate");
            animateUpdate.m2422c(this.f30181k, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3549a(aVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"ve/b$c", "Ljava/lang/Runnable;", "", "run", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: ve.b$c */
    /* loaded from: classes6.dex */
    public static final class RunnableC13501c implements Runnable {

        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
        /* renamed from: ve.b$c$a */
        /* loaded from: classes6.dex */
        static final class C13502a extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

            /* renamed from: k */
            final /* synthetic */ ScaledPoint f30183k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13502a(ScaledPoint scaledPoint) {
                super(1);
                this.f30183k = scaledPoint;
            }

            /* renamed from: a */
            public final void m3548a(C13873c.C13874a applyUpdate) {
                C9971q.m14633g(applyUpdate, "$this$applyUpdate");
                applyUpdate.m2420e(this.f30183k, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
                m3548a(aVar);
                return Unit.f22042a;
            }
        }

        RunnableC13501c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GestureDetector$OnGestureListenerC13499b.this.f30172o.isFinished()) {
                GestureDetector$OnGestureListenerC13499b.this.f30169l.m4106f();
                GestureDetector$OnGestureListenerC13499b.this.f30171n.setIsLongpressEnabled(true);
            } else if (GestureDetector$OnGestureListenerC13499b.this.f30172o.computeScrollOffset()) {
                GestureDetector$OnGestureListenerC13499b.this.f30170m.m2462g(new C13502a(new ScaledPoint(GestureDetector$OnGestureListenerC13499b.this.f30172o.getCurrX(), GestureDetector$OnGestureListenerC13499b.this.f30172o.getCurrY())));
                GestureDetector$OnGestureListenerC13499b.this.f30170m.m2473C(this);
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.b$d */
    /* loaded from: classes6.dex */
    static final class C13503d extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ ScaledPoint f30184k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13503d(ScaledPoint scaledPoint) {
            super(1);
            this.f30184k = scaledPoint;
        }

        /* renamed from: a */
        public final void m3547a(C13873c.C13874a applyUpdate) {
            C9971q.m14633g(applyUpdate, "$this$applyUpdate");
            applyUpdate.m2422c(this.f30184k, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3547a(aVar);
            return Unit.f22042a;
        }
    }

    static {
        String TAG = GestureDetector$OnGestureListenerC13499b.class.getSimpleName();
        f30166y = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f30167z = aVar.m26250a(TAG);
    }

    public GestureDetector$OnGestureListenerC13499b(Context context, C14076b panManager, C13269a stateController, C13869b matrixController) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(panManager, "panManager");
        C9971q.m14633g(stateController, "stateController");
        C9971q.m14633g(matrixController, "matrixController");
        this.f30168k = panManager;
        this.f30169l = stateController;
        this.f30170m = matrixController;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(null);
        Unit unit = Unit.f22042a;
        this.f30171n = gestureDetector;
        this.f30172o = new OverScroller(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r2 == false) goto L_0x002b;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m3557g() {
        /*
            r5 = this;
            xe.b r0 = r5.f30168k
            boolean r0 = r0.m1751n()
            r1 = 0
            if (r0 == 0) goto L_0x0036
            xe.b r0 = r5.f30168k
            com.otaliastudios.zoom.ScaledPoint r0 = r0.m1759f()
            float r2 = r0.m26348c()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            if (r2 != 0) goto L_0x001b
            r2 = r4
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x002b
            float r2 = r0.m26347d()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0028
            r2 = r4
            goto L_0x0029
        L_0x0028:
            r2 = r1
        L_0x0029:
            if (r2 != 0) goto L_0x0036
        L_0x002b:
            we.b r1 = r5.f30170m
            ve.b$b r2 = new ve.b$b
            r2.<init>(r0)
            r1.m2464e(r2)
            return r4
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.GestureDetector$OnGestureListenerC13499b.m3557g():boolean");
    }

    /* renamed from: e */
    public final void m3559e() {
        this.f30172o.forceFinished(true);
    }

    /* renamed from: f */
    public final void m3558f() {
        if (!m3557g()) {
            this.f30169l.m4106f();
        }
    }

    /* renamed from: h */
    public final boolean m3556h(MotionEvent event) {
        C9971q.m14633g(event, "event");
        return this.f30171n.onTouchEvent(event);
    }

    /* renamed from: i */
    public final void m3555i(boolean z) {
        this.f30175r = z;
    }

    /* renamed from: j */
    public final void m3554j(boolean z) {
        this.f30180w = z;
    }

    /* renamed from: k */
    public final void m3553k(boolean z) {
        this.f30177t = z;
    }

    /* renamed from: l */
    public final void m3552l(boolean z) {
        this.f30176s = z;
    }

    /* renamed from: m */
    public final void m3551m(boolean z) {
        this.f30179v = z;
    }

    /* renamed from: n */
    public final void m3550n(boolean z) {
        this.f30178u = z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        C9971q.m14633g(e, "e");
        m3559e();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        float f5;
        if (!this.f30175r || !this.f30168k.m1752m()) {
            return false;
        }
        float f6 = 0.0f;
        if (this.f30168k.m1757h()) {
            f3 = f;
        } else {
            f3 = 0.0f;
        }
        int i = (int) f3;
        if (this.f30168k.m1753l()) {
            f4 = f2;
        } else {
            f4 = 0.0f;
        }
        int i2 = (int) f4;
        this.f30168k.m1761d(true, this.f30173p);
        this.f30168k.m1761d(false, this.f30174q);
        int c = this.f30173p.m1742c();
        int a = this.f30173p.m1744a();
        int b = this.f30173p.m1743b();
        int c2 = this.f30174q.m1742c();
        int a2 = this.f30174q.m1744a();
        int b2 = this.f30174q.m1743b();
        if (!this.f30180w && (this.f30173p.m1741d() || this.f30174q.m1741d())) {
            return false;
        }
        if ((c >= b && c2 >= b2 && !this.f30168k.m1751n()) || !this.f30169l.m4100l()) {
            return false;
        }
        this.f30171n.setIsLongpressEnabled(false);
        if (this.f30168k.m1758g()) {
            f5 = this.f30168k.m1756i();
        } else {
            f5 = 0.0f;
        }
        if (this.f30168k.m1754k()) {
            f6 = this.f30168k.m1755j();
        }
        ZoomLogger zoomLogger = f30167z;
        zoomLogger.m26257b("startFling", "velocityX:", Integer.valueOf(i), "velocityY:", Integer.valueOf(i2));
        zoomLogger.m26257b("startFling", "flingX:", "min:", Integer.valueOf(c), "max:", Integer.valueOf(b), "start:", Integer.valueOf(a), "overScroll:", Float.valueOf(f6));
        zoomLogger.m26257b("startFling", "flingY:", "min:", Integer.valueOf(c2), "max:", Integer.valueOf(b2), "start:", Integer.valueOf(a2), "overScroll:", Float.valueOf(f5));
        this.f30172o.fling(a, a2, i, i2, c, b, c2, b2, (int) f5, (int) f6);
        this.f30170m.m2474B(new RunnableC13501c());
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
        if (r2 == false) goto L_0x0144;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.GestureDetector$OnGestureListenerC13499b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
