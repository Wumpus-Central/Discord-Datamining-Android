package ve;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.otaliastudios.zoom.AbsolutePoint;
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
import p425xe.C14078c;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006-"}, m15073d2 = {"Lve/a;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "", "e", "Lcom/otaliastudios/zoom/AbsolutePoint;", "fixPan", "Landroid/graphics/PointF;", "b", "containerPoint", "c", "contentPoint", "d", "Landroid/view/MotionEvent;", "event", "", "f", "(Landroid/view/MotionEvent;)Z", "Landroid/view/ScaleGestureDetector;", "detector", "onScaleBegin", "onScale", "onScaleEnd", "Lxe/c;", "a", "Lxe/c;", "zoomManager", "Lxe/b;", "Lxe/b;", "panManager", "Lue/a;", "Lue/a;", "stateController", "Lwe/b;", "Lwe/b;", "matrixController", "Landroid/view/ScaleGestureDetector;", "Lcom/otaliastudios/zoom/AbsolutePoint;", "initialFocusPoint", "g", "currentFocusOffset", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lxe/c;Lxe/b;Lue/a;Lwe/b;)V", "h", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: ve.a */
/* loaded from: classes6.dex */
public final class ScaleGestureDetector$OnScaleGestureListenerC13493a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: h */
    public static final C0441a f30144h = new C0441a(null);

    /* renamed from: i */
    private static final String f30145i;

    /* renamed from: j */
    private static final ZoomLogger f30146j;

    /* renamed from: a */
    private final C14078c f30147a;

    /* renamed from: b */
    private final C14076b f30148b;

    /* renamed from: c */
    private final C13269a f30149c;

    /* renamed from: d */
    private final C13869b f30150d;

    /* renamed from: e */
    private final ScaleGestureDetector f30151e;

    /* renamed from: f */
    private final AbsolutePoint f30152f = new AbsolutePoint(Float.NaN, Float.NaN);

    /* renamed from: g */
    private final AbsolutePoint f30153g = new AbsolutePoint(0.0f, 0.0f);

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m15073d2 = {"Lve/a$a;", "", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$a */
    /* loaded from: classes6.dex */
    public static final class C0441a {
        private C0441a() {
        }

        public /* synthetic */ C0441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$b */
    /* loaded from: classes6.dex */
    public static final class C13494b extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f30154k;

        /* renamed from: l */
        final /* synthetic */ PointF f30155l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13494b(float f, PointF pointF) {
            super(1);
            this.f30154k = f;
            this.f30155l = pointF;
        }

        /* renamed from: a */
        public final void m3568a(C13873c.C13874a applyUpdate) {
            C9971q.m14633g(applyUpdate, "$this$applyUpdate");
            applyUpdate.m2416i(this.f30154k, true);
            applyUpdate.m2419f(Float.valueOf(this.f30155l.x), Float.valueOf(this.f30155l.y));
            applyUpdate.m2417h(true);
            applyUpdate.m2418g(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3568a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$c */
    /* loaded from: classes6.dex */
    public static final class C13495c extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f30156k;

        /* renamed from: l */
        final /* synthetic */ AbsolutePoint f30157l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13495c(float f, AbsolutePoint absolutePoint) {
            super(1);
            this.f30156k = f;
            this.f30157l = absolutePoint;
        }

        /* renamed from: a */
        public final void m3567a(C13873c.C13874a applyUpdate) {
            C9971q.m14633g(applyUpdate, "$this$applyUpdate");
            applyUpdate.m2416i(this.f30156k, true);
            applyUpdate.m2421d(this.f30157l, true);
            applyUpdate.m2418g(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3567a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$d */
    /* loaded from: classes6.dex */
    public static final class C13496d extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f30158k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13496d(float f) {
            super(1);
            this.f30158k = f;
        }

        /* renamed from: a */
        public final void m3566a(C13873c.C13874a animateUpdate) {
            C9971q.m14633g(animateUpdate, "$this$animateUpdate");
            animateUpdate.m2416i(this.f30158k, true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3566a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$e */
    /* loaded from: classes6.dex */
    public static final class C13497e extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f30159k;

        /* renamed from: l */
        final /* synthetic */ AbsolutePoint f30160l;

        /* renamed from: m */
        final /* synthetic */ PointF f30161m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13497e(float f, AbsolutePoint absolutePoint, PointF pointF) {
            super(1);
            this.f30159k = f;
            this.f30160l = absolutePoint;
            this.f30161m = pointF;
        }

        /* renamed from: a */
        public final void m3565a(C13873c.C13874a animateUpdate) {
            C9971q.m14633g(animateUpdate, "$this$animateUpdate");
            animateUpdate.m2416i(this.f30159k, true);
            animateUpdate.m2421d(this.f30160l, true);
            animateUpdate.m2419f(Float.valueOf(this.f30161m.x), Float.valueOf(this.f30161m.y));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3565a(aVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: ve.a$f */
    /* loaded from: classes6.dex */
    static final class C13498f extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f30162k;

        /* renamed from: l */
        final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC13493a f30163l;

        /* renamed from: m */
        final /* synthetic */ ScaleGestureDetector f30164m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13498f(float f, ScaleGestureDetector$OnScaleGestureListenerC13493a aVar, ScaleGestureDetector scaleGestureDetector) {
            super(1);
            this.f30162k = f;
            this.f30163l = aVar;
            this.f30164m = scaleGestureDetector;
        }

        /* renamed from: a */
        public final void m3564a(C13873c.C13874a applyUpdate) {
            C9971q.m14633g(applyUpdate, "$this$applyUpdate");
            applyUpdate.m2416i(this.f30162k, true);
            applyUpdate.m2423b(this.f30163l.f30153g, true);
            applyUpdate.m2419f(Float.valueOf(this.f30164m.getFocusX()), Float.valueOf(this.f30164m.getFocusY()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m3564a(aVar);
            return Unit.f22042a;
        }
    }

    static {
        String TAG = ScaleGestureDetector$OnScaleGestureListenerC13493a.class.getSimpleName();
        f30145i = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f30146j = aVar.m26250a(TAG);
    }

    public ScaleGestureDetector$OnScaleGestureListenerC13493a(Context context, C14078c zoomManager, C14076b panManager, C13269a stateController, C13869b matrixController) {
        C9971q.m14633g(context, "context");
        C9971q.m14633g(zoomManager, "zoomManager");
        C9971q.m14633g(panManager, "panManager");
        C9971q.m14633g(stateController, "stateController");
        C9971q.m14633g(matrixController, "matrixController");
        this.f30147a = zoomManager;
        this.f30148b = panManager;
        this.f30149c = stateController;
        this.f30150d = matrixController;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.f30151e = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    /* renamed from: b */
    private final PointF m3573b(AbsolutePoint absolutePoint) {
        float f;
        if (this.f30150d.m2444y() <= 1.0f) {
            PointF d = m3571d(new AbsolutePoint((-this.f30150d.m2452q()) / 2.0f, (-this.f30150d.m2455n()) / 2.0f));
            d.set(-d.x, -d.y);
            return d;
        }
        float f2 = 0.0f;
        if (absolutePoint.m26360c() > 0.0f) {
            f = this.f30150d.m2456m();
        } else if (absolutePoint.m26360c() < 0.0f) {
            f = 0.0f;
        } else {
            f = this.f30150d.m2456m() / 2.0f;
        }
        if (absolutePoint.m26359d() > 0.0f) {
            f2 = this.f30150d.m2457l();
        } else if (absolutePoint.m26359d() >= 0.0f) {
            f2 = this.f30150d.m2457l() / 2.0f;
        }
        return new PointF(f, f2);
    }

    /* renamed from: c */
    private final AbsolutePoint m3572c(PointF pointF) {
        return ScaledPoint.m26340k(new ScaledPoint(this.f30150d.m2446w() + pointF.x, this.f30150d.m2445x() + pointF.y), this.f30150d.m2444y(), null, 2, null);
    }

    /* renamed from: d */
    private final PointF m3571d(AbsolutePoint absolutePoint) {
        ScaledPoint e = AbsolutePoint.m26353j(absolutePoint, this.f30150d.m2444y(), null, 2, null).m26346e(this.f30150d.m2447v());
        return new PointF(e.m26348c(), e.m26347d());
    }

    /* renamed from: e */
    private final void m3570e() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f30147a.m1725m() || this.f30148b.m1751n()) {
            float f = this.f30147a.m1732f();
            float i = this.f30147a.m1729i();
            boolean z4 = false;
            float b = this.f30147a.m1736b(this.f30150d.m2444y(), false);
            f30146j.m26257b("onScaleEnd:", "zoom:", Float.valueOf(this.f30150d.m2444y()), "newZoom:", Float.valueOf(b), "max:", Float.valueOf(f), "min:", Float.valueOf(i));
            AbsolutePoint k = ScaledPoint.m26340k(this.f30148b.m1759f(), this.f30150d.m2444y(), null, 2, null);
            if (k.m26360c() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (k.m26359d() == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 && Float.compare(b, this.f30150d.m2444y()) == 0) {
                    this.f30149c.m4106f();
                    return;
                }
            }
            PointF b2 = m3573b(k);
            AbsolutePoint f2 = this.f30150d.m2450s().m26357f(k);
            if (Float.compare(b, this.f30150d.m2444y()) != 0) {
                AbsolutePoint absolutePoint = new AbsolutePoint(this.f30150d.m2450s());
                float y = this.f30150d.m2444y();
                this.f30150d.m2462g(new C13494b(b, b2));
                AbsolutePoint k2 = ScaledPoint.m26340k(this.f30148b.m1759f(), this.f30150d.m2444y(), null, 2, null);
                f2.m26356g(this.f30150d.m2450s().m26357f(k2));
                this.f30150d.m2462g(new C13495c(y, absolutePoint));
                k = k2;
            }
            if (k.m26360c() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (k.m26359d() == 0.0f) {
                    z4 = true;
                }
                if (z4) {
                    this.f30150d.m2464e(new C13496d(b));
                    return;
                }
            }
            this.f30150d.m2464e(new C13497e(b, f2, b2));
            return;
        }
        this.f30149c.m4106f();
    }

    /* renamed from: f */
    public final boolean m3569f(MotionEvent event) {
        C9971q.m14633g(event, "event");
        return this.f30151e.onTouchEvent(event);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        C9971q.m14633g(detector, "detector");
        if (!this.f30147a.m1726l() || !this.f30149c.m4099m()) {
            return false;
        }
        AbsolutePoint c = m3572c(new PointF(-detector.getFocusX(), -detector.getFocusY()));
        if (Float.isNaN(this.f30152f.m26360c())) {
            this.f30152f.m26356g(c);
            f30146j.m26257b("onScale:", "Setting initial focus:", this.f30152f);
        } else {
            this.f30153g.m26356g(this.f30152f.m26358e(c));
            f30146j.m26257b("onScale:", "Got focus offset:", this.f30153g);
        }
        this.f30150d.m2462g(new C13498f(this.f30150d.m2444y() * detector.getScaleFactor(), this, detector));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        C9971q.m14633g(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        C9971q.m14633g(detector, "detector");
        f30146j.m26257b("onScaleEnd:", "mInitialAbsFocusPoint.x:", Float.valueOf(this.f30152f.m26360c()), "mInitialAbsFocusPoint.y:", Float.valueOf(this.f30152f.m26359d()), "mOverZoomEnabled;", Boolean.valueOf(this.f30147a.m1725m()));
        m3570e();
        AbsolutePoint absolutePoint = this.f30152f;
        Float valueOf = Float.valueOf(Float.NaN);
        absolutePoint.m26355h(valueOf, valueOf);
        AbsolutePoint absolutePoint2 = this.f30153g;
        Float valueOf2 = Float.valueOf(0.0f);
        absolutePoint2.m26355h(valueOf2, valueOf2);
    }
}
