package com.otaliastudios.zoom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.ViewProps;
import com.otaliastudios.zoom.AbstractC6108c;
import com.otaliastudios.zoom.ZoomLogger;
import eg.C6884j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p369ue.C13269a;
import p369ue.C13271b;
import p405we.C13869b;
import p405we.C13873c;
import p425xe.C14076b;
import p425xe.C14078c;
import ve.GestureDetector$OnGestureListenerC13499b;
import ve.ScaleGestureDetector$OnScaleGestureListenerC13493a;

@Metadata(m15074d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0097\u00012\u00020\u0001:\u0006 \u0001¡\u0001¢\u0001B\u0013\u0012\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\rH\u0016J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0006H\u0016J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\"\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\rH\u0007J\"\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\rH\u0007J\u000e\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200J\u000e\u00103\u001a\u00020\r2\u0006\u00101\u001a\u000200J(\u00108\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J!\u00109\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u00107\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J \u0010;\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J \u0010>\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010?\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\u0018\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\b\u0010B\u001a\u00020\u000bH\u0016J\b\u0010C\u001a\u00020\u000bH\u0016J\u0018\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u00022\u0006\u00107\u001a\u00020\rH\u0016J\b\u0010F\u001a\u00020\u0002H\u0016J\b\u0010G\u001a\u00020\u0006H\u0016J\u0018\u0010J\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\b\u0010K\u001a\u00020\u0002H\u0016J\b\u0010L\u001a\u00020\u0006H\u0016J\u0018\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0006H\u0016J\u0010\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020OH\u0016J\b\u0010R\u001a\u00020\rH\u0016J\u0006\u0010S\u001a\u00020\u0006J\u0006\u0010T\u001a\u00020\u0006J\u0006\u0010U\u001a\u00020\u0006J\u0006\u0010V\u001a\u00020\u0006R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010XR\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010[R\u0018\u0010^\u001a\u00060\\R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010]R\u001a\u0010c\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bT\u0010`\u0012\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010eR\u001a\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010h\u0012\u0004\bi\u0010bR \u0010p\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010l\u0012\u0004\bo\u0010b\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010uR\u0014\u0010z\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010D\u001a\u00020\u00028VX\u0096\u0004¢\u0006\f\u0012\u0004\b}\u0010b\u001a\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001d\u0010\u0084\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u0083\u0001\u0010b\u001a\u0005\b\u0082\u0001\u0010|R\u001d\u0010\u0087\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u0086\u0001\u0010b\u001a\u0005\b\u0085\u0001\u0010|R\u0017\u0010\u008a\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010\u008b\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010|R\u0016\u0010\u008d\u0001\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010|R\u001b\u0010\u0091\u0001\u001a\u00030\u008e\u00018F¢\u0006\u000e\u0012\u0005\b\u0090\u0001\u0010b\u001a\u0005\b6\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00028F¢\u0006\r\u0012\u0005\b\u0092\u0001\u0010b\u001a\u0004\b5\u0010|R\u001a\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\u000e\u0012\u0005\b\u0095\u0001\u0010b\u001a\u0005\b\u0094\u0001\u0010|R\u0013\u0010\u0098\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010|R\u0012\u0010\u0099\u0001\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bx\u0010|R\u001c\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u000e\u0012\u0005\b\u009b\u0001\u0010b\u001a\u0005\b\u009a\u0001\u0010|¨\u0006£\u0001"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomEngine;", "Lcom/otaliastudios/zoom/c;", "", "r", "Lcom/otaliastudios/zoom/ScaledPoint;", "q", "", "input", "p", "Lcom/otaliastudios/zoom/ZoomEngine$c;", "listener", "", "l", "", "overScroll", "i0", "j0", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "g0", ViewProps.ENABLED, "c0", "p0", "overPinchable", "h0", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "k0", "q0", "b0", "l0", "f0", "o0", "m0", "allow", "U", "transformation", "gravity", "setTransformation", "alignment", "T", "Landroid/view/View;", "container", "W", "width", "height", "applyTransformation", "Z", "X", "Landroid/view/MotionEvent;", "ev", "O", "P", "zoom", "x", "y", "animate", "M", "N", "(Ljava/lang/Float;Z)V", "R", "dx", "dy", "Q", "u0", "zoomFactor", "r0", "s0", "t0", "realZoom", "S", "z", "A", "maxZoom", "type", "setMaxZoom", "B", "C", "minZoom", "setMinZoom", "", "duration", "V", "m", "n", "o", "s", "t", "k", "I", "transformationType", "transformationGravity", "Landroid/view/View;", "Lcom/otaliastudios/zoom/ZoomEngine$a;", "Lcom/otaliastudios/zoom/ZoomEngine$a;", "callbacks", "Lue/b;", "Lue/b;", "getDispatcher$annotations", "()V", "dispatcher", "Lue/a;", "Lue/a;", "stateController", "Lxe/b;", "Lxe/b;", "getPanManager$annotations", "panManager", "Lxe/c;", "Lxe/c;", "L", "()Lxe/c;", "getZoomManager$library_release$annotations", "zoomManager", "Lwe/b;", "Lwe/b;", "matrixController", "Lve/b;", "Lve/b;", "scrollFlingDetector", "Lve/a;", "u", "Lve/a;", "pinchDetector", "G", "()F", "getRealZoom$annotations", "Lcom/otaliastudios/zoom/AbsolutePoint;", "D", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "E", "getPanX$annotations", "panX", "F", "getPanY$annotations", "panY", "H", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "scaledPanX", "J", "scaledPanY", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "getMatrix$annotations", "matrix", "getContentWidth$annotations", "contentWidth", "w", "getContentHeight$annotations", "contentHeight", "v", "containerWidth", "containerHeight", "K", "getZoom$annotations", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "b", "c", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* loaded from: classes6.dex */
public class ZoomEngine implements AbstractC6108c {

    /* renamed from: v */
    public static final C6096b f12388v = new C6096b(null);

    /* renamed from: w */
    private static final String f12389w;

    /* renamed from: x */
    private static final ZoomLogger f12390x;

    /* renamed from: k */
    private int f12391k;

    /* renamed from: l */
    private int f12392l;

    /* renamed from: m */
    private View f12393m;

    /* renamed from: n */
    private final ViewTreeObserver$OnGlobalLayoutListenerC6093a f12394n;

    /* renamed from: o */
    private final C13271b f12395o = new C13271b(this);

    /* renamed from: p */
    private final C13269a f12396p;

    /* renamed from: q */
    private final C14076b f12397q;

    /* renamed from: r */
    private final C14078c f12398r;

    /* renamed from: s */
    private final C13869b f12399s;

    /* renamed from: t */
    private final GestureDetector$OnGestureListenerC13499b f12400t;

    /* renamed from: u */
    private final ScaleGestureDetector$OnScaleGestureListenerC13493a f12401u;

    @Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¨\u0006\u001d"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lue/a$a;", "Lwe/b$a;", "", "onGlobalLayout", "Ljava/lang/Runnable;", "action", "", "a", "e", "j", "", "oldZoom", "firstTime", "d", "", "newState", "i", "c", "oldState", "b", "f", "Landroid/view/MotionEvent;", "event", "h", "g", "<init>", "(Lcom/otaliastudios/zoom/ZoomEngine;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$a */
    /* loaded from: classes6.dex */
    private final class ViewTreeObserver$OnGlobalLayoutListenerC6093a implements ViewTreeObserver.OnGlobalLayoutListener, C13269a.AbstractC0431a, C13869b.AbstractC13870a {

        /* renamed from: k */
        final /* synthetic */ ZoomEngine f12402k;

        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$a */
        /* loaded from: classes6.dex */
        static final class C0180a extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

            /* renamed from: k */
            final /* synthetic */ ZoomEngine f12403k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0180a(ZoomEngine zoomEngine) {
                super(1);
                this.f12403k = zoomEngine;
            }

            /* renamed from: a */
            public final void m26266a(C13873c.C13874a applyUpdate) {
                C9971q.m14633g(applyUpdate, "$this$applyUpdate");
                applyUpdate.m2416i(this.f12403k.m26328L().m1727k(), false);
                applyUpdate.m2418g(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
                m26266a(aVar);
                return Unit.f22042a;
            }
        }

        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$b */
        /* loaded from: classes6.dex */
        static final class C6094b extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

            /* renamed from: k */
            final /* synthetic */ ScaledPoint f12404k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6094b(ScaledPoint scaledPoint) {
                super(1);
                this.f12404k = scaledPoint;
            }

            /* renamed from: a */
            public final void m26265a(C13873c.C13874a applyUpdate) {
                C9971q.m14633g(applyUpdate, "$this$applyUpdate");
                applyUpdate.m2420e(this.f12404k, false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
                m26265a(aVar);
                return Unit.f22042a;
            }
        }

        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
        /* renamed from: com.otaliastudios.zoom.ZoomEngine$a$c */
        /* loaded from: classes6.dex */
        static final class C6095c extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

            /* renamed from: k */
            final /* synthetic */ ZoomEngine f12405k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C6095c(ZoomEngine zoomEngine) {
                super(1);
                this.f12405k = zoomEngine;
            }

            /* renamed from: a */
            public final void m26264a(C13873c.C13874a applyUpdate) {
                C9971q.m14633g(applyUpdate, "$this$applyUpdate");
                applyUpdate.m2416i(this.f12405k.m26333G(), false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
                m26264a(aVar);
                return Unit.f22042a;
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC6093a(ZoomEngine this$0) {
            C9971q.m14633g(this$0, "this$0");
            this.f12402k = this$0;
        }

        @Override // p405we.C13869b.AbstractC13870a
        /* renamed from: a */
        public boolean mo2442a(Runnable action) {
            C9971q.m14633g(action, "action");
            View view = this.f12402k.f12393m;
            if (view != null) {
                return view.post(action);
            }
            C9971q.m14615y("container");
            throw null;
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: b */
        public void mo4095b(int i) {
            if (i == 3) {
                this.f12402k.f12399s.m2460i();
            } else if (i == 4) {
                this.f12402k.f12400t.m3559e();
            }
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: c */
        public void mo4094c() {
            this.f12402k.f12395o.m4088b();
        }

        @Override // p405we.C13869b.AbstractC13870a
        /* renamed from: d */
        public void mo2441d(float f, boolean z) {
            ZoomEngine.f12390x.m26251h("onMatrixSizeChanged: firstTime:", Boolean.valueOf(z), "oldZoom:", Float.valueOf(f), "transformation:", Integer.valueOf(this.f12402k.f12391k), "transformationZoom:", Float.valueOf(this.f12402k.m26328L().m1727k()));
            this.f12402k.f12396p.m4106f();
            if (z) {
                this.f12402k.m26328L().m1718t(this.f12402k.m26279r());
                this.f12402k.f12399s.m2462g(new C0180a(this.f12402k));
                this.f12402k.f12399s.m2462g(new C6094b(this.f12402k.m26281q()));
            } else {
                this.f12402k.m26328L().m1718t(this.f12402k.m26279r());
                this.f12402k.f12399s.m2462g(new C6095c(this.f12402k));
            }
            ZoomEngine.f12390x.m26257b("onMatrixSizeChanged: newTransformationZoom:", Float.valueOf(this.f12402k.m26328L().m1727k()), "newRealZoom:", Float.valueOf(this.f12402k.m26333G()), "newZoom:", Float.valueOf(this.f12402k.m26329K()));
        }

        @Override // p405we.C13869b.AbstractC13870a
        /* renamed from: e */
        public void mo2440e(Runnable action) {
            C9971q.m14633g(action, "action");
            View view = this.f12402k.f12393m;
            if (view != null) {
                view.postOnAnimation(action);
            } else {
                C9971q.m14615y("container");
                throw null;
            }
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: f */
        public void mo4093f() {
            this.f12402k.f12400t.m3558f();
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: g */
        public boolean mo4092g(MotionEvent event) {
            C9971q.m14633g(event, "event");
            return this.f12402k.f12400t.m3556h(event);
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: h */
        public boolean mo4091h(MotionEvent event) {
            C9971q.m14633g(event, "event");
            return this.f12402k.f12401u.m3569f(event);
        }

        @Override // p369ue.C13269a.AbstractC0431a
        /* renamed from: i */
        public boolean mo4090i(int i) {
            return this.f12402k.f12399s.m2443z();
        }

        @Override // p405we.C13869b.AbstractC13870a
        /* renamed from: j */
        public void mo2439j() {
            this.f12402k.f12395o.m4087c();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view;
            ZoomEngine zoomEngine = this.f12402k;
            View view2 = zoomEngine.f12393m;
            if (view2 != null) {
                float width = view2.getWidth();
                if (this.f12402k.f12393m != null) {
                    ZoomEngine.m26315Y(zoomEngine, width, view.getHeight(), false, 4, null);
                } else {
                    C9971q.m14615y("container");
                    throw null;
                }
            } else {
                C9971q.m14615y("container");
                throw null;
            }
        }
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$b;", "", "", "DEFAULT_ANIMATION_DURATION", "J", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "<init>", "()V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$b */
    /* loaded from: classes6.dex */
    public static final class C6096b {
        private C6096b() {
        }

        public /* synthetic */ C6096b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, m15073d2 = {"Lcom/otaliastudios/zoom/ZoomEngine$c;", "", "Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Landroid/graphics/Matrix;", "matrix", "", "onUpdate", "onIdle", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$c */
    /* loaded from: classes6.dex */
    public interface AbstractC6097c {
        void onIdle(ZoomEngine zoomEngine);

        void onUpdate(ZoomEngine zoomEngine, Matrix matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$d */
    /* loaded from: classes6.dex */
    public static final class C6098d extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f12406k;

        /* renamed from: l */
        final /* synthetic */ float f12407l;

        /* renamed from: m */
        final /* synthetic */ float f12408m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6098d(float f, float f2, float f3) {
            super(1);
            this.f12406k = f;
            this.f12407l = f2;
            this.f12408m = f3;
        }

        /* renamed from: a */
        public final void m26263a(C13873c.C13874a obtain) {
            C9971q.m14633g(obtain, "$this$obtain");
            obtain.m2416i(this.f12406k, false);
            obtain.m2421d(new AbsolutePoint(this.f12407l, this.f12408m), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m26263a(aVar);
            return Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$e */
    /* loaded from: classes6.dex */
    public static final class C6099e extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f12409k;

        /* renamed from: l */
        final /* synthetic */ float f12410l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6099e(float f, float f2) {
            super(1);
            this.f12409k = f;
            this.f12410l = f2;
        }

        /* renamed from: a */
        public final void m26262a(C13873c.C13874a obtain) {
            C9971q.m14633g(obtain, "$this$obtain");
            obtain.m2423b(new AbsolutePoint(this.f12409k, this.f12410l), false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m26262a(aVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m15073d2 = {"Lwe/b;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$f */
    /* loaded from: classes6.dex */
    static final class C6100f extends AbstractC9973s implements Function0<C13869b> {
        C6100f() {
            super(0);
        }

        /* renamed from: a */
        public final C13869b invoke() {
            return ZoomEngine.this.f12399s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, m15073d2 = {"Lwe/c$a;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$g */
    /* loaded from: classes6.dex */
    public static final class C6101g extends AbstractC9973s implements Function1<C13873c.C13874a, Unit> {

        /* renamed from: k */
        final /* synthetic */ float f12412k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6101g(float f) {
            super(1);
            this.f12412k = f;
        }

        /* renamed from: a */
        public final void m26260a(C13873c.C13874a obtain) {
            C9971q.m14633g(obtain, "$this$obtain");
            obtain.m2416i(this.f12412k, false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13873c.C13874a aVar) {
            m26260a(aVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m15073d2 = {"com/otaliastudios/zoom/ZoomEngine$h", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$h */
    /* loaded from: classes6.dex */
    public static final class View$OnAttachStateChangeListenerC6102h implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC6102h() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C9971q.m14633g(view, "view");
            view.getViewTreeObserver().addOnGlobalLayoutListener(ZoomEngine.this.f12394n);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C9971q.m14633g(view, "view");
            view.getViewTreeObserver().removeOnGlobalLayoutListener(ZoomEngine.this.f12394n);
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m15073d2 = {"Lwe/b;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 5, 1})
    /* renamed from: com.otaliastudios.zoom.ZoomEngine$i */
    /* loaded from: classes6.dex */
    static final class C6103i extends AbstractC9973s implements Function0<C13869b> {
        C6103i() {
            super(0);
        }

        /* renamed from: a */
        public final C13869b invoke() {
            return ZoomEngine.this.f12399s;
        }
    }

    static {
        String TAG = ZoomEngine.class.getSimpleName();
        f12389w = TAG;
        ZoomLogger.C6105a aVar = ZoomLogger.f12416b;
        C9971q.m14634f(TAG, "TAG");
        f12390x = aVar.m26250a(TAG);
    }

    public ZoomEngine(Context context) {
        C9971q.m14633g(context, "context");
        ViewTreeObserver$OnGlobalLayoutListenerC6093a aVar = new ViewTreeObserver$OnGlobalLayoutListenerC6093a(this);
        this.f12394n = aVar;
        C13269a aVar2 = new C13269a(aVar);
        this.f12396p = aVar2;
        C14076b bVar = new C14076b(this, new C6100f());
        this.f12397q = bVar;
        C14078c cVar = new C14078c(this, new C6103i());
        this.f12398r = cVar;
        C13869b bVar2 = new C13869b(cVar, bVar, aVar2, aVar);
        this.f12399s = bVar2;
        this.f12400t = new GestureDetector$OnGestureListenerC13499b(context, bVar, aVar2, bVar2);
        this.f12401u = new ScaleGestureDetector$OnScaleGestureListenerC13493a(context, cVar, bVar, aVar2, bVar2);
    }

    /* renamed from: Y */
    public static /* synthetic */ void m26315Y(ZoomEngine zoomEngine, float f, float f2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            zoomEngine.m26316X(f, f2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContainerSize");
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m26312a0(ZoomEngine zoomEngine, float f, float f2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            zoomEngine.m26314Z(f, f2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContentSize");
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: p */
    private final int m26283p(int i) {
        if (i != 0) {
            return i;
        }
        C6106a aVar = C6106a.f12421a;
        return aVar.m26245e(this.f12397q.m1760e(), 16) | aVar.m26246d(this.f12397q.m1760e(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final ScaledPoint m26281q() {
        float x = (m26269x() * m26333G()) - m26271v();
        float w = (m26270w() * m26333G()) - m26273u();
        int p = m26283p(this.f12392l);
        return new ScaledPoint(-this.f12397q.m1763b(p, x, true), -this.f12397q.m1763b(p, w, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final float m26279r() {
        int i = this.f12391k;
        if (i == 0) {
            float v = m26271v() / m26269x();
            float u = m26273u() / m26270w();
            f12390x.m26253f("computeTransformationZoom", "centerInside", "scaleX:", Float.valueOf(v), "scaleY:", Float.valueOf(u));
            return Math.min(v, u);
        } else if (i != 1) {
            return 1.0f;
        } else {
            float v2 = m26271v() / m26269x();
            float u2 = m26273u() / m26270w();
            f12390x.m26253f("computeTransformationZoom", "centerCrop", "scaleX:", Float.valueOf(v2), "scaleY:", Float.valueOf(u2));
            return Math.max(v2, u2);
        }
    }

    /* renamed from: A */
    public int m26339A() {
        return this.f12398r.m1731g();
    }

    /* renamed from: B */
    public float m26338B() {
        return this.f12398r.m1730h();
    }

    /* renamed from: C */
    public int m26337C() {
        return this.f12398r.m1728j();
    }

    /* renamed from: D */
    public AbsolutePoint m26336D() {
        return AbsolutePoint.m26361b(this.f12399s.m2450s(), 0.0f, 0.0f, 3, null);
    }

    /* renamed from: E */
    public float m26335E() {
        return this.f12399s.m2449t();
    }

    /* renamed from: F */
    public float m26334F() {
        return this.f12399s.m2448u();
    }

    /* renamed from: G */
    public float m26333G() {
        return this.f12399s.m2444y();
    }

    /* renamed from: H */
    public ScaledPoint m26332H() {
        return ScaledPoint.m26349b(this.f12399s.m2447v(), 0.0f, 0.0f, 3, null);
    }

    /* renamed from: I */
    public float m26331I() {
        return this.f12399s.m2446w();
    }

    /* renamed from: J */
    public float m26330J() {
        return this.f12399s.m2445x();
    }

    /* renamed from: K */
    public float m26329K() {
        return this.f12398r.m1724n(m26333G());
    }

    /* renamed from: L */
    public final C14078c m26328L() {
        return this.f12398r;
    }

    /* renamed from: M */
    public void m26327M(float f, float f2, float f3, boolean z) {
        C13873c a = C13873c.f31251l.m2415a(new C6098d(this.f12398r.m1717u(f), f2, f3));
        if (z) {
            this.f12399s.m2463f(a);
            return;
        }
        m26289m();
        this.f12399s.m2461h(a);
    }

    /* renamed from: N */
    public void m26326N(Float f, boolean z) {
        Float f2;
        float f3;
        float i;
        if (f == null) {
            f2 = null;
        } else {
            float floatValue = f.floatValue();
            C14078c cVar = this.f12398r;
            float n = cVar.m1724n(cVar.m1729i());
            C14078c cVar2 = this.f12398r;
            i = C6884j.m23955i(floatValue, n, cVar2.m1724n(cVar2.m1732f()));
            f2 = Float.valueOf(i);
        }
        if (f2 == null) {
            f3 = m26329K();
        } else {
            f3 = f2.floatValue();
        }
        float u = this.f12398r.m1717u(f3);
        m26327M(f3, -((m26269x() / 2.0f) - ((m26271v() / u) / 2.0f)), -((m26270w() / 2.0f) - ((m26273u() / u) / 2.0f)), z);
    }

    /* renamed from: O */
    public final boolean m26325O(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        return this.f12396p.m4104h(ev);
    }

    /* renamed from: P */
    public final boolean m26324P(MotionEvent ev) {
        C9971q.m14633g(ev, "ev");
        return this.f12396p.m4103i(ev);
    }

    /* renamed from: Q */
    public void m26323Q(float f, float f2, boolean z) {
        C13873c a = C13873c.f31251l.m2415a(new C6099e(f, f2));
        if (z) {
            this.f12399s.m2463f(a);
            return;
        }
        m26289m();
        this.f12399s.m2461h(a);
    }

    /* renamed from: R */
    public void m26322R(float f, float f2, boolean z) {
        m26323Q(f - m26335E(), f2 - m26334F(), z);
    }

    /* renamed from: S */
    public void m26321S(float f, boolean z) {
        C13873c a = C13873c.f31251l.m2415a(new C6101g(f));
        if (z) {
            this.f12399s.m2463f(a);
            return;
        }
        m26289m();
        this.f12399s.m2461h(a);
    }

    /* renamed from: T */
    public void m26320T(int i) {
        this.f12397q.m1750o(i);
    }

    /* renamed from: U */
    public void m26319U(boolean z) {
        this.f12400t.m3554j(z);
    }

    /* renamed from: V */
    public void m26318V(long j) {
        this.f12399s.m2472D(j);
    }

    /* renamed from: W */
    public final void m26317W(View container) {
        C9971q.m14633g(container, "container");
        if (this.f12393m == null) {
            this.f12393m = container;
            if (container != null) {
                container.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC6102h());
            } else {
                C9971q.m14615y("container");
                throw null;
            }
        } else {
            throw new IllegalStateException("container already set".toString());
        }
    }

    /* renamed from: X */
    public final void m26316X(float f, float f2, boolean z) {
        this.f12399s.m2471E(f, f2, z);
    }

    /* renamed from: Z */
    public final void m26314Z(float f, float f2, boolean z) {
        this.f12399s.m2470F(f, f2, z);
    }

    /* renamed from: b0 */
    public void m26310b0(boolean z) {
        this.f12400t.m3555i(z);
    }

    /* renamed from: c0 */
    public void m26308c0(boolean z) {
        this.f12397q.m1748q(z);
    }

    /* renamed from: d0 */
    public void m26306d0(float f) {
        AbstractC6108c.C6109a.m26244a(this, f);
    }

    /* renamed from: e0 */
    public void m26304e0(float f) {
        AbstractC6108c.C6109a.m26243b(this, f);
    }

    /* renamed from: f0 */
    public void m26302f0(boolean z) {
        this.f12400t.m3553k(z);
    }

    /* renamed from: g0 */
    public void m26300g0(OverPanRangeProvider provider) {
        C9971q.m14633g(provider, "provider");
        this.f12397q.m1747r(provider);
    }

    /* renamed from: h0 */
    public void m26298h0(boolean z) {
        this.f12398r.m1720r(z);
    }

    /* renamed from: i0 */
    public void m26296i0(boolean z) {
        this.f12397q.m1749p(z);
    }

    /* renamed from: j0 */
    public void m26294j0(boolean z) {
        this.f12397q.m1746s(z);
    }

    /* renamed from: k0 */
    public void m26292k0(OverZoomRangeProvider provider) {
        C9971q.m14633g(provider, "provider");
        this.f12398r.m1719s(provider);
    }

    /* renamed from: l */
    public final void m26291l(AbstractC6097c listener) {
        C9971q.m14633g(listener, "listener");
        if (this.f12393m != null) {
            this.f12395o.m4089a(listener);
            return;
        }
        throw new IllegalStateException("container is not initialized.".toString());
    }

    /* renamed from: l0 */
    public void m26290l0(boolean z) {
        this.f12400t.m3552l(z);
    }

    /* renamed from: m */
    public boolean m26289m() {
        if (this.f12396p.m4110b()) {
            this.f12400t.m3559e();
            return true;
        } else if (!this.f12396p.m4111a()) {
            return false;
        } else {
            this.f12396p.m4106f();
            return true;
        }
    }

    /* renamed from: m0 */
    public void m26288m0(boolean z) {
        this.f12400t.m3551m(z);
    }

    /* renamed from: n */
    public final int m26287n() {
        return (int) (-this.f12399s.m2446w());
    }

    /* renamed from: n0 */
    public void m26286n0(int i) {
        AbstractC6108c.C6109a.m26242c(this, i);
    }

    /* renamed from: o */
    public final int m26285o() {
        return (int) this.f12399s.m2453p();
    }

    /* renamed from: o0 */
    public void m26284o0(boolean z) {
        this.f12400t.m3550n(z);
    }

    /* renamed from: p0 */
    public void m26282p0(boolean z) {
        this.f12397q.m1745t(z);
    }

    /* renamed from: q0 */
    public void m26280q0(boolean z) {
        this.f12398r.m1723o(z);
    }

    /* renamed from: r0 */
    public void m26278r0(float f, boolean z) {
        m26272u0(m26329K() * f, z);
    }

    /* renamed from: s */
    public final int m26277s() {
        return (int) (-this.f12399s.m2445x());
    }

    /* renamed from: s0 */
    public void m26276s0() {
        m26278r0(1.3f, true);
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setMaxZoom(float f, int i) {
        this.f12398r.m1722p(f, i);
        if (m26329K() > this.f12398r.m1732f()) {
            m26321S(this.f12398r.m1732f(), true);
        }
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setMinZoom(float f, int i) {
        this.f12398r.m1721q(f, i);
        if (m26333G() <= this.f12398r.m1729i()) {
            m26321S(this.f12398r.m1729i(), true);
        }
    }

    @Override // com.otaliastudios.zoom.AbstractC6108c
    public void setTransformation(int i, int i2) {
        this.f12391k = i;
        this.f12392l = i2;
    }

    /* renamed from: t */
    public final int m26275t() {
        return (int) this.f12399s.m2454o();
    }

    /* renamed from: t0 */
    public void m26274t0() {
        m26278r0(0.7f, true);
    }

    /* renamed from: u */
    public final float m26273u() {
        return this.f12399s.m2457l();
    }

    /* renamed from: u0 */
    public void m26272u0(float f, boolean z) {
        m26321S(this.f12398r.m1717u(f), z);
    }

    /* renamed from: v */
    public final float m26271v() {
        return this.f12399s.m2456m();
    }

    /* renamed from: w */
    public final float m26270w() {
        return this.f12399s.m2455n();
    }

    /* renamed from: x */
    public final float m26269x() {
        return this.f12399s.m2452q();
    }

    /* renamed from: y */
    public final Matrix m26268y() {
        return this.f12399s.m2451r();
    }

    /* renamed from: z */
    public float m26267z() {
        return this.f12398r.m1733e();
    }
}
