package p405we;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.otaliastudios.zoom.AbsolutePoint;
import com.otaliastudios.zoom.ScaledPoint;
import com.otaliastudios.zoom.ZoomLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p369ue.C13269a;
import p405we.C13873c;
import p425xe.C14076b;
import p425xe.C14078c;

@Metadata(m15074d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u001f*\u0001^\b\u0000\u0018\u0000 f2\u00020\u0001:\u0002$(B'\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/¢\u0006\u0004\bz\u0010{J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0000¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00104R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108R$\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010A\u001a\u0002078@X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\bB\u0010CR$\u0010F\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\bE\u0010CR\u001a\u0010K\u001a\u00020G8@X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010P\u001a\u00020L8@X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010M\u001a\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010c\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bb\u0010 \u001a\u0004\b_\u0010CR\u001a\u0010e\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bd\u0010 \u001a\u0004\b[\u0010CR\u001a\u0010h\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bg\u0010 \u001a\u0004\bf\u0010CR\u001a\u0010j\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bi\u0010 \u001a\u0004\bR\u0010CR\u001a\u0010m\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bl\u0010 \u001a\u0004\bk\u0010CR\u001a\u0010p\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bo\u0010 \u001a\u0004\bn\u0010CR\u001a\u0010s\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\br\u0010 \u001a\u0004\bq\u0010CR\u001a\u0010v\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bu\u0010 \u001a\u0004\bt\u0010CR\u001a\u0010y\u001a\u00020\u00028@X\u0080\u0004¢\u0006\f\u0012\u0004\bx\u0010 \u001a\u0004\bw\u0010C¨\u0006|"}, m15073d2 = {"Lwe/b;", "", "", "oldZoom", "", "forceReset", "", "A", "G", "j", "allowOverPan", "k", "Ljava/lang/Runnable;", "action", "B", "(Ljava/lang/Runnable;)Z", "C", "(Ljava/lang/Runnable;)V", "width", "height", "F", "(FFZ)V", "E", "Lkotlin/Function1;", "Lwe/c$a;", "update", "g", "(Lkotlin/jvm/functions/Function1;)V", "Lwe/c;", "h", "(Lwe/c;)V", "i", "()V", "e", "f", "Lxe/c;", "a", "Lxe/c;", "zoomManager", "Lxe/b;", "b", "Lxe/b;", "panManager", "Lue/a;", "c", "Lue/a;", "stateController", "Lwe/b$a;", "d", "Lwe/b$a;", "callback", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "contentScaledRect", "contentRect", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "stub", "<set-?>", "Z", "z", "()Z", "isInitialized", "r", "()Landroid/graphics/Matrix;", "matrix", "m", "()F", "containerWidth", "l", "containerHeight", "Lcom/otaliastudios/zoom/ScaledPoint;", "Lcom/otaliastudios/zoom/ScaledPoint;", "v", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "Lcom/otaliastudios/zoom/AbsolutePoint;", "Lcom/otaliastudios/zoom/AbsolutePoint;", "s", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "", "n", "J", "getAnimationDuration$library_release", "()J", "D", "(J)V", "animationDuration", "", "Landroid/animation/ValueAnimator;", "o", "Ljava/util/Set;", "activeAnimators", "we/b$d", "p", "Lwe/b$d;", "cancelAnimationListener", "getContentScaledWidth$library_release$annotations", "contentScaledWidth", "getContentScaledHeight$library_release$annotations", "contentScaledHeight", "q", "getContentWidth$library_release$annotations", "contentWidth", "getContentHeight$library_release$annotations", "contentHeight", "w", "getScaledPanX$library_release$annotations", "scaledPanX", "x", "getScaledPanY$library_release$annotations", "scaledPanY", "y", "getZoom$library_release$annotations", "zoom", "t", "getPanX$library_release$annotations", "panX", "u", "getPanY$library_release$annotations", "panY", "<init>", "(Lxe/c;Lxe/b;Lue/a;Lwe/b$a;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: we.b */
/* loaded from: classes6.dex */
public final class C13869b {

    /* renamed from: r */
    private static final String f31229r;

    /* renamed from: s */
    private static final ZoomLogger f31230s;

    /* renamed from: a */
    private final C14078c f31232a;

    /* renamed from: b */
    private final C14076b f31233b;

    /* renamed from: c */
    private final C13269a f31234c;

    /* renamed from: d */
    private final AbstractC13870a f31235d;

    /* renamed from: h */
    private boolean f31239h;

    /* renamed from: j */
    private float f31241j;

    /* renamed from: k */
    private float f31242k;

    /* renamed from: q */
    public static final C0446b f31228q = new C0446b(null);

    /* renamed from: t */
    private static final AccelerateDecelerateInterpolator f31231t = new AccelerateDecelerateInterpolator();

    /* renamed from: e */
    private RectF f31236e = new RectF();

    /* renamed from: f */
    private RectF f31237f = new RectF();

    /* renamed from: g */
    private Matrix f31238g = new Matrix();

    /* renamed from: i */
    private final Matrix f31240i = new Matrix();

    /* renamed from: l */
    private final ScaledPoint f31243l = new ScaledPoint(0.0f, 0.0f, 3, null);

    /* renamed from: m */
    private final AbsolutePoint f31244m = new AbsolutePoint(0.0f, 0.0f, 3, null);

    /* renamed from: n */
    private long f31245n = 280;

    /* renamed from: o */
    private final Set<ValueAnimator> f31246o = new LinkedHashSet();

    /* renamed from: p */
    private final C13872d f31247p = new C13872d();

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, m15073d2 = {"Lwe/b$a;", "", "", "j", "", "oldZoom", "", "firstTime", "d", "Ljava/lang/Runnable;", "action", "a", "e", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: we.b$a */
    /* loaded from: classes6.dex */
    public interface AbstractC13870a {
        /* renamed from: a */
        boolean mo2442a(Runnable runnable);

        /* renamed from: d */
        void mo2441d(float f, boolean z);

        /* renamed from: e */
        void mo2440e(Runnable runnable);

        /* renamed from: j */
        void mo2439j();
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m15073d2 = {"Lwe/b$b;", "", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "ANIMATION_INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: we.b$b */
    /* loaded from: classes6.dex */
    public static final class C0446b {
        private C0446b() {
        }

        public /* synthetic */ C0446b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: we.b$c */
    /* loaded from: classes6.dex */
    public static final class C13871c extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ C13873c f31248k;

        /* renamed from: l */
        final /* synthetic */ ValueAnimator f31249l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13871c(C13873c cVar, ValueAnimator valueAnimator) {
            super(1);
            this.f31248k = cVar;
            this.f31249l = valueAnimator;
        }

        /* renamed from: a */
        public final void m2438a(C13873c.C13874a applyUpdate) {
            C9971q.m14633g(applyUpdate, "$this$applyUpdate");
            if (this.f31248k.m2433d()) {
                Object animatedValue = this.f31249l.getAnimatedValue("zoom");
                if (animatedValue != null) {
                    applyUpdate.m2416i(((Float) animatedValue).floatValue(), this.f31248k.m2435b());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            if (this.f31248k.m2431f() != null) {
                Object animatedValue2 = this.f31249l.getAnimatedValue("panX");
                if (animatedValue2 != null) {
                    float floatValue = ((Float) animatedValue2).floatValue();
                    Object animatedValue3 = this.f31249l.getAnimatedValue("panY");
                    if (animatedValue3 != null) {
                        applyUpdate.m2421d(new AbsolutePoint(floatValue, ((Float) animatedValue3).floatValue()), this.f31248k.m2436a());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            } else if (this.f31248k.m2428i() != null) {
                Object animatedValue4 = this.f31249l.getAnimatedValue("panX");
                if (animatedValue4 != null) {
                    float floatValue2 = ((Float) animatedValue4).floatValue();
                    Object animatedValue5 = this.f31249l.getAnimatedValue("panY");
                    if (animatedValue5 != null) {
                        applyUpdate.m2420e(new ScaledPoint(floatValue2, ((Float) animatedValue5).floatValue()), this.f31248k.m2436a());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
            }
            applyUpdate.m2419f(this.f31248k.m2430g(), this.f31248k.m2429h());
            applyUpdate.m2418g(this.f31248k.m2432e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m2438a(aVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"we/b$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animator", "", "a", "onAnimationEnd", "onAnimationCancel", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: we.b$d */
    /* loaded from: classes6.dex */
    public static final class C13872d extends AnimatorListenerAdapter {
        C13872d() {
        }

        /* renamed from: a */
        private final void m2437a(Animator animator) {
            animator.removeListener(this);
            Set set = C13869b.this.f31246o;
            if (set != null) {
                C9964l0.m14656a(set).remove(animator);
                if (C13869b.this.f31246o.isEmpty()) {
                    C13869b.this.f31234c.m4106f();
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C9971q.m14633g(animator, "animator");
            m2437a(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C9971q.m14633g(animator, "animator");
            m2437a(animator);
        }
    }

    static {
        String TAG = C13869b.class.getSimpleName();
        f31229r = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f31230s = aVar.m26250a(TAG);
    }

    public C13869b(C14078c zoomManager, C14076b panManager, C13269a stateController, AbstractC13870a callback) {
        C9971q.m14633g(zoomManager, "zoomManager");
        C9971q.m14633g(panManager, "panManager");
        C9971q.m14633g(stateController, "stateController");
        C9971q.m14633g(callback, "callback");
        this.f31232a = zoomManager;
        this.f31233b = panManager;
        this.f31234c = stateController;
        this.f31235d = callback;
    }

    /* renamed from: A */
    private final void m2475A(float f, boolean z) {
        m2469G();
        if (m2452q() > 0.0f && m2455n() > 0.0f) {
            float f2 = this.f31241j;
            if (f2 > 0.0f && this.f31242k > 0.0f) {
                boolean z2 = false;
                f31230s.m26251h("onSizeChanged:", "containerWidth:", Float.valueOf(f2), "containerHeight:", Float.valueOf(this.f31242k), "contentWidth:", Float.valueOf(m2452q()), "contentHeight:", Float.valueOf(m2455n()));
                if (!this.f31239h || z) {
                    z2 = true;
                }
                this.f31239h = true;
                this.f31235d.mo2441d(f, z2);
            }
        }
    }

    /* renamed from: G */
    private final void m2469G() {
        this.f31238g.mapRect(this.f31236e, this.f31237f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m2465d(C13869b this$0, C13873c update, ValueAnimator valueAnimator) {
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(update, "$update");
        this$0.m2462g(new C13871c(update, valueAnimator));
    }

    /* renamed from: j */
    private final void m2459j() {
        this.f31235d.mo2439j();
    }

    /* renamed from: k */
    private final void m2458k(boolean z) {
        boolean z2;
        boolean z3 = true;
        float c = this.f31233b.m1762c(true, z);
        float c2 = this.f31233b.m1762c(false, z);
        if (c == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (c2 != 0.0f) {
                z3 = false;
            }
            if (z3) {
                return;
            }
        }
        this.f31238g.postTranslate(c, c2);
        m2469G();
    }

    /* renamed from: B */
    public final boolean m2474B(Runnable action) {
        C9971q.m14633g(action, "action");
        return this.f31235d.mo2442a(action);
    }

    /* renamed from: C */
    public final void m2473C(Runnable action) {
        C9971q.m14633g(action, "action");
        this.f31235d.mo2440e(action);
    }

    /* renamed from: D */
    public final void m2472D(long j) {
        this.f31245n = j;
    }

    /* renamed from: E */
    public final void m2471E(float f, float f2, boolean z) {
        boolean z2;
        if (f > 0.0f && f2 > 0.0f) {
            boolean z3 = true;
            if (f == this.f31241j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (f2 != this.f31242k) {
                    z3 = false;
                }
                if (z3 && !z) {
                    return;
                }
            }
            this.f31241j = f;
            this.f31242k = f2;
            m2475A(m2444y(), z);
        }
    }

    /* renamed from: F */
    public final void m2470F(float f, float f2, boolean z) {
        boolean z2;
        if (f > 0.0f && f2 > 0.0f) {
            boolean z3 = true;
            if (m2452q() == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m2455n() != f2) {
                    z3 = false;
                }
                if (z3 && !z) {
                    return;
                }
            }
            float y = m2444y();
            this.f31237f.set(0.0f, 0.0f, f, f2);
            m2475A(y, z);
        }
    }

    /* renamed from: e */
    public final void m2464e(Function1<? super C13873c.C13874a, Unit> update) {
        C9971q.m14633g(update, "update");
        m2463f(C13873c.f31251l.m2415a(update));
    }

    @SuppressLint({"ObjectAnimatorBinding"})
    /* renamed from: f */
    public final void m2463f(final C13873c update) {
        float f;
        ScaledPoint scaledPoint;
        AbsolutePoint absolutePoint;
        C9971q.m14633g(update, "update");
        if (this.f31239h && this.f31234c.m4101k()) {
            ArrayList arrayList = new ArrayList();
            if (update.m2431f() != null) {
                if (update.m2426k()) {
                    absolutePoint = m2450s().m26357f(update.m2431f());
                } else {
                    absolutePoint = update.m2431f();
                }
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("panX", m2449t(), absolutePoint.m26360c());
                C9971q.m14634f(ofFloat, "ofFloat(\"panX\", panX, target.x)");
                arrayList.add(ofFloat);
                PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("panY", m2448u(), absolutePoint.m26359d());
                C9971q.m14634f(ofFloat2, "ofFloat(\"panY\", panY, target.y)");
                arrayList.add(ofFloat2);
            } else if (update.m2428i() != null) {
                if (update.m2426k()) {
                    scaledPoint = m2447v().m26345f(update.m2428i());
                } else {
                    scaledPoint = update.m2428i();
                }
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("panX", m2446w(), scaledPoint.m26348c());
                C9971q.m14634f(ofFloat3, "ofFloat(\"panX\", scaledPanX, target.x)");
                arrayList.add(ofFloat3);
                PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("panY", m2445x(), scaledPoint.m26347d());
                C9971q.m14634f(ofFloat4, "ofFloat(\"panY\", scaledPanY, target.y)");
                arrayList.add(ofFloat4);
            }
            if (update.m2433d()) {
                if (update.m2425l()) {
                    f = m2444y() * update.m2427j();
                } else {
                    f = update.m2427j();
                }
                PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("zoom", m2444y(), this.f31232a.m1736b(f, update.m2435b()));
                C9971q.m14634f(ofFloat5, "ofFloat(\"zoom\", zoom, newZoom)");
                arrayList.add(ofFloat5);
            }
            Object[] array = arrayList.toArray(new PropertyValuesHolder[0]);
            if (array != null) {
                PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) array;
                ValueAnimator animator = ValueAnimator.ofPropertyValuesHolder((PropertyValuesHolder[]) Arrays.copyOf(propertyValuesHolderArr, propertyValuesHolderArr.length));
                animator.setDuration(this.f31245n);
                animator.setInterpolator(f31231t);
                animator.addListener(this.f31247p);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: we.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C13869b.m2465d(C13869b.this, update, valueAnimator);
                    }
                });
                animator.start();
                Set<ValueAnimator> set = this.f31246o;
                C9971q.m14634f(animator, "animator");
                set.add(animator);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: g */
    public final void m2462g(Function1<? super C13873c.C13874a, Unit> update) {
        C9971q.m14633g(update, "update");
        m2461h(C13873c.f31251l.m2415a(update));
    }

    /* renamed from: h */
    public final void m2461h(C13873c update) {
        float f;
        float f2;
        ScaledPoint scaledPoint;
        AbsolutePoint absolutePoint;
        C9971q.m14633g(update, "update");
        if (this.f31239h) {
            if (update.m2431f() != null) {
                if (update.m2426k()) {
                    absolutePoint = update.m2431f();
                } else {
                    absolutePoint = update.m2431f().m26358e(m2450s());
                }
                this.f31238g.preTranslate(absolutePoint.m26360c(), absolutePoint.m26359d());
                m2469G();
            } else if (update.m2428i() != null) {
                if (update.m2426k()) {
                    scaledPoint = update.m2428i();
                } else {
                    scaledPoint = update.m2428i().m26346e(m2447v());
                }
                this.f31238g.postTranslate(scaledPoint.m26348c(), scaledPoint.m26347d());
                m2469G();
            }
            if (update.m2433d()) {
                if (update.m2425l()) {
                    f = m2444y() * update.m2427j();
                } else {
                    f = update.m2427j();
                }
                float b = this.f31232a.m1736b(f, update.m2435b()) / m2444y();
                float f3 = 0.0f;
                if (update.m2430g() != null) {
                    f2 = update.m2430g().floatValue();
                } else if (update.m2434c()) {
                    f2 = 0.0f;
                } else {
                    f2 = this.f31241j / 2.0f;
                }
                if (update.m2429h() != null) {
                    f3 = update.m2429h().floatValue();
                } else if (!update.m2434c()) {
                    f3 = this.f31242k / 2.0f;
                }
                this.f31238g.postScale(b, b, f2, f3);
                m2469G();
            }
            m2458k(update.m2436a());
            if (update.m2432e()) {
                m2459j();
            }
        }
    }

    /* renamed from: i */
    public final void m2460i() {
        for (ValueAnimator valueAnimator : this.f31246o) {
            valueAnimator.cancel();
        }
        this.f31246o.clear();
    }

    /* renamed from: l */
    public final float m2457l() {
        return this.f31242k;
    }

    /* renamed from: m */
    public final float m2456m() {
        return this.f31241j;
    }

    /* renamed from: n */
    public final float m2455n() {
        return this.f31237f.height();
    }

    /* renamed from: o */
    public final float m2454o() {
        return this.f31236e.height();
    }

    /* renamed from: p */
    public final float m2453p() {
        return this.f31236e.width();
    }

    /* renamed from: q */
    public final float m2452q() {
        return this.f31237f.width();
    }

    /* renamed from: r */
    public final Matrix m2451r() {
        this.f31240i.set(this.f31238g);
        return this.f31240i;
    }

    /* renamed from: s */
    public final AbsolutePoint m2450s() {
        this.f31244m.m26355h(Float.valueOf(m2449t()), Float.valueOf(m2448u()));
        return this.f31244m;
    }

    /* renamed from: t */
    public final float m2449t() {
        return m2446w() / m2444y();
    }

    /* renamed from: u */
    public final float m2448u() {
        return m2445x() / m2444y();
    }

    /* renamed from: v */
    public final ScaledPoint m2447v() {
        this.f31243l.m26344g(Float.valueOf(m2446w()), Float.valueOf(m2445x()));
        return this.f31243l;
    }

    /* renamed from: w */
    public final float m2446w() {
        return this.f31236e.left;
    }

    /* renamed from: x */
    public final float m2445x() {
        return this.f31236e.top;
    }

    /* renamed from: y */
    public final float m2444y() {
        return this.f31236e.width() / this.f31237f.width();
    }

    /* renamed from: z */
    public final boolean m2443z() {
        return this.f31239h;
    }
}
