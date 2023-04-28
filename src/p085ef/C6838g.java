package p085ef;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\u0018\u0000 \b2\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010/\u001a\u00020\u001f\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204¢\u0006\u0004\bN\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0014\u0010\t\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u001c\u0010\u0011\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u0015\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002J\u001c\u0010\u0016\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J \u0010\"\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fJ\"\u0010(\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001aJ\u0018\u0010)\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010,\u001a\u00020*2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020*R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010@R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0016\u0010F\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0016\u0010G\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0016\u0010I\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010HR\u0016\u0010J\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u0016\u0010K\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010HR\u0016\u0010M\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010E¨\u0006P"}, m15073d2 = {"Lef/g;", "", "", "x", "h", "Lef/d;", "handler", "", "o", "C", "g", "s", "Landroid/view/MotionEvent;", "event", "j", "f", "sourceEvent", "i", "Landroid/view/View;", "view", "q", "d", "v", "r", "", "coords", "", "pointerId", "k", "w", "l", "Landroid/view/ViewGroup;", "viewGroup", "m", "B", "e", "p", "u", "newState", "prevState", "t", "z", "Landroid/graphics/PointF;", "point", "A", "a", "Landroid/view/ViewGroup;", "wrapperView", "Lef/h;", "b", "Lef/h;", "handlerRegistry", "Lef/x;", "c", "Lef/x;", "viewConfigHelper", "", "F", "getMinimumAlphaForTraversal", "()F", "y", "(F)V", "minimumAlphaForTraversal", "", "[Lef/d;", "gestureHandlers", "awaitingHandlers", "preparedHandlers", "handlersToCancel", "I", "gestureHandlersCount", "awaitingHandlersCount", "Z", "isHandlingTouch", "handlingChangeSemaphore", "finishedHandlersCleanupScheduled", "n", "activationIndex", "<init>", "(Landroid/view/ViewGroup;Lef/h;Lef/x;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ef.g */
/* loaded from: classes8.dex */
public final class C6838g {

    /* renamed from: o */
    public static final C6839a f14947o = new C6839a(null);

    /* renamed from: p */
    private static final PointF f14948p = new PointF();

    /* renamed from: q */
    private static final float[] f14949q = new float[2];

    /* renamed from: r */
    private static final Matrix f14950r = new Matrix();

    /* renamed from: s */
    private static final float[] f14951s = new float[2];

    /* renamed from: t */
    private static final Comparator<C6832d<?>> f14952t = new Comparator() { // from class: ef.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int n;
            n = C6838g.m24139n((C6832d) obj, (C6832d) obj2);
            return n;
        }
    };

    /* renamed from: a */
    private final ViewGroup f14953a;

    /* renamed from: b */
    private final AbstractC6841h f14954b;

    /* renamed from: c */
    private final AbstractC6871x f14955c;

    /* renamed from: d */
    private float f14956d;

    /* renamed from: e */
    private final C6832d<?>[] f14957e = new C6832d[20];

    /* renamed from: f */
    private final C6832d<?>[] f14958f = new C6832d[20];

    /* renamed from: g */
    private final C6832d<?>[] f14959g = new C6832d[20];

    /* renamed from: h */
    private final C6832d<?>[] f14960h = new C6832d[20];

    /* renamed from: i */
    private int f14961i;

    /* renamed from: j */
    private int f14962j;

    /* renamed from: k */
    private boolean f14963k;

    /* renamed from: l */
    private int f14964l;

    /* renamed from: m */
    private boolean f14965m;

    /* renamed from: n */
    private int f14966n;

    @Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u00020\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J \u0010\u0019\u001a\u00020\u00062\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J \u0010\u001a\u001a\u00020\u00062\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m15073d2 = {"Lef/g$a;", "", "Landroid/view/View;", "view", "", "coords", "", "l", "", "x", "y", "Landroid/view/ViewGroup;", "parent", "child", "Landroid/graphics/PointF;", "outLocalPoint", "", "m", "i", "Lef/d;", "handler", "other", "k", "a", "b", "g", "j", "", "state", "h", "DEFAULT_MIN_ALPHA_FOR_TRAVERSAL", "F", "SIMULTANEOUS_GESTURE_HANDLER_LIMIT", "I", "Ljava/util/Comparator;", "handlersComparator", "Ljava/util/Comparator;", "Landroid/graphics/Matrix;", "inverseMatrix", "Landroid/graphics/Matrix;", "matrixTransformCoords", "[F", "tempCoords", "tempPoint", "Landroid/graphics/PointF;", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ef.g$a */
    /* loaded from: classes8.dex */
    public static final class C6839a {
        private C6839a() {
        }

        public /* synthetic */ C6839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        private final boolean m24120g(C6832d<?> dVar, C6832d<?> dVar2) {
            return dVar == dVar2 || dVar.mo24101C0(dVar2) || dVar2.mo24101C0(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final boolean m24119h(int i) {
            return i == 3 || i == 1 || i == 5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final boolean m24118i(float f, float f2, View view) {
            if (0.0f <= f && f <= ((float) view.getWidth())) {
                if (0.0f <= f2 && f2 <= ((float) view.getHeight())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final boolean m24117j(C6832d<?> dVar, C6832d<?> dVar2) {
            if (!dVar.m24219V(dVar2) || m24120g(dVar, dVar2)) {
                return false;
            }
            if (dVar == dVar2 || (!dVar.m24217X() && dVar.m24226O() != 4)) {
                return true;
            }
            return dVar.mo24102B0(dVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public final boolean m24116k(C6832d<?> dVar, C6832d<?> dVar2) {
            if (dVar == dVar2 || (!dVar.m24241E0(dVar2) && !dVar2.m24243D0(dVar))) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final boolean m24115l(View view, float[] fArr) {
            boolean z;
            if (!(view instanceof ViewGroup) || view.getBackground() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !m24118i(fArr[0], fArr[1], view)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final void m24114m(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
            float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
            float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
            Matrix matrix = view.getMatrix();
            if (!matrix.isIdentity()) {
                float[] fArr = C6838g.f14949q;
                fArr[0] = scrollX;
                fArr[1] = scrollY;
                matrix.invert(C6838g.f14950r);
                C6838g.f14950r.mapPoints(fArr);
                float f3 = fArr[0];
                scrollY = fArr[1];
                scrollX = f3;
            }
            pointF.set(scrollX, scrollY);
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ef.g$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6840b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14967a;

        static {
            int[] iArr = new int[EnumC6859r.values().length];
            try {
                iArr[EnumC6859r.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6859r.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6859r.BOX_NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6859r.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14967a = iArr;
        }
    }

    public C6838g(ViewGroup wrapperView, AbstractC6841h handlerRegistry, AbstractC6871x viewConfigHelper) {
        C9971q.m14633g(wrapperView, "wrapperView");
        C9971q.m14633g(handlerRegistry, "handlerRegistry");
        C9971q.m14633g(viewConfigHelper, "viewConfigHelper");
        this.f14953a = wrapperView;
        this.f14954b = handlerRegistry;
        this.f14955c = viewConfigHelper;
    }

    /* renamed from: B */
    private final boolean m24154B(View view, float[] fArr, int i) {
        boolean z;
        int i2 = C6840b.f14967a[this.f14955c.mo23994a(view).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (view instanceof ViewGroup) {
                            z = m24140m((ViewGroup) view, fArr, i);
                        } else {
                            z = false;
                        }
                        if (m24130w(view, fArr, i) || z || f14947o.m24115l(view, fArr)) {
                            return true;
                        }
                    } else {
                        throw new C11088q();
                    }
                } else if (view instanceof ViewGroup) {
                    boolean m = m24140m((ViewGroup) view, fArr, i);
                    if (!m) {
                        return m;
                    }
                    m24130w(view, fArr, i);
                    return m;
                } else if (view instanceof EditText) {
                    return m24130w(view, fArr, i);
                }
            } else if (m24130w(view, fArr, i) || f14947o.m24115l(view, fArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    private final void m24153C(C6832d<?> dVar) {
        if (m24138o(dVar)) {
            m24149d(dVar);
            return;
        }
        m24134s(dVar);
        dVar.m24189q0(false);
    }

    /* renamed from: d */
    private final void m24149d(C6832d<?> dVar) {
        int i = this.f14962j;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14958f[i2] == dVar) {
                return;
            }
        }
        int i3 = this.f14962j;
        C6832d<?>[] dVarArr = this.f14958f;
        if (i3 < dVarArr.length) {
            z = true;
        }
        if (z) {
            this.f14962j = i3 + 1;
            dVarArr[i3] = dVar;
            dVar.m24189q0(true);
            int i4 = this.f14966n;
            this.f14966n = i4 + 1;
            dVar.m24193o0(i4);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: e */
    private final boolean m24148e(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f14956d;
    }

    /* renamed from: f */
    private final void m24147f() {
        int i = this.f14962j;
        while (true) {
            i--;
            if (-1 >= i) {
                break;
            }
            C6832d<?> dVar = this.f14958f[i];
            C9971q.m14636d(dVar);
            dVar.m24192p();
        }
        int i2 = this.f14961i;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f14959g[i3] = this.f14957e[i3];
        }
        for (int i4 = i2 - 1; -1 < i4; i4--) {
            C6832d<?> dVar2 = this.f14959g[i4];
            C9971q.m14636d(dVar2);
            dVar2.m24192p();
        }
    }

    /* renamed from: g */
    private final void m24146g() {
        C6832d<?>[] dVarArr = this.f14958f;
        int i = this.f14962j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C6832d<?> dVar = dVarArr[i3];
            C9971q.m14636d(dVar);
            if (dVar.m24217X()) {
                dVarArr[i2] = dVarArr[i3];
                i2++;
            }
        }
        this.f14962j = i2;
    }

    /* renamed from: h */
    private final void m24145h() {
        boolean z;
        boolean z2 = false;
        for (int i = this.f14961i - 1; -1 < i; i--) {
            C6832d<?> dVar = this.f14957e[i];
            C9971q.m14636d(dVar);
            if (f14947o.m24119h(dVar.m24226O()) && !dVar.m24217X()) {
                this.f14957e[i] = null;
                dVar.m24200j0();
                dVar.m24191p0(false);
                dVar.m24189q0(false);
                dVar.m24193o0(ViewDefaults.NUMBER_OF_LINES);
                z2 = true;
            }
        }
        if (z2) {
            C6832d<?>[] dVarArr = this.f14957e;
            int i2 = this.f14961i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                C6832d<?> dVar2 = dVarArr[i4];
                if (dVar2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    dVarArr[i3] = dVar2;
                    i3++;
                }
            }
            this.f14961i = i3;
        }
        this.f14965m = false;
    }

    /* renamed from: i */
    private final void m24144i(C6832d<?> dVar, MotionEvent motionEvent) {
        boolean z;
        if (!m24136q(dVar.m24222S())) {
            dVar.m24192p();
        } else if (dVar.m24231J0()) {
            int actionMasked = motionEvent.getActionMasked();
            View S = dVar.m24222S();
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            C9971q.m14634f(obtain, "obtain(sourceEvent)");
            MotionEvent z2 = m24127z(S, obtain);
            if (dVar.m24229L() && dVar.m24226O() != 0) {
                dVar.m24233I0(z2);
            }
            if (!dVar.m24217X() || actionMasked != 2) {
                if (dVar.m24226O() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                dVar.m24220U(z2, motionEvent);
                if (dVar.m24218W()) {
                    if (dVar.m24227N()) {
                        dVar.m24173z0(false);
                        dVar.mo24030l0();
                    }
                    dVar.mo24104u(z2);
                }
                if (dVar.m24229L() && z) {
                    dVar.m24233I0(z2);
                }
                if (actionMasked == 1 || actionMasked == 6) {
                    dVar.m24237G0(z2.getPointerId(z2.getActionIndex()));
                }
            }
            z2.recycle();
        }
    }

    /* renamed from: j */
    private final void m24143j(MotionEvent motionEvent) {
        int i = this.f14961i;
        C9897e.m14989f(this.f14957e, this.f14959g, 0, 0, i);
        C9897e.m14976s(this.f14959g, f14952t, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C6832d<?> dVar = this.f14959g[i2];
            C9971q.m14636d(dVar);
            m24144i(dVar, motionEvent);
        }
    }

    /* renamed from: k */
    private final boolean m24142k(View view, float[] fArr, int i) {
        boolean z = false;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                ArrayList<C6832d<?>> a = this.f14954b.mo24113a((View) parent);
                if (a != null) {
                    synchronized (a) {
                        Iterator<C6832d<?>> it = a.iterator();
                        while (it.hasNext()) {
                            C6832d<?> handler = it.next();
                            if (handler.m24216Y() && handler.m24213a0(view, fArr[0], fArr[1])) {
                                C9971q.m14634f(handler, "handler");
                                m24131v(handler, viewGroup);
                                handler.m24239F0(i);
                                z = true;
                            }
                        }
                        Unit unit = Unit.f22042a;
                    }
                } else {
                    continue;
                }
            }
        }
        return z;
    }

    /* renamed from: l */
    private final void m24141l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float[] fArr = f14951s;
        fArr[0] = motionEvent.getX(actionIndex);
        fArr[1] = motionEvent.getY(actionIndex);
        m24154B(this.f14953a, fArr, pointerId);
        m24140m(this.f14953a, fArr, pointerId);
    }

    /* renamed from: m */
    private final boolean m24140m(ViewGroup viewGroup, float[] fArr, int i) {
        boolean z;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View c = this.f14955c.mo23992c(viewGroup, childCount);
            if (m24148e(c)) {
                PointF pointF = f14948p;
                C6839a aVar = f14947o;
                aVar.m24114m(fArr[0], fArr[1], viewGroup, c, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (!m24137p(c) || aVar.m24118i(fArr[0], fArr[1], c)) {
                    z = m24154B(c, fArr, i);
                } else {
                    z = false;
                }
                fArr[0] = f;
                fArr[1] = f2;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final int m24139n(C6832d dVar, C6832d dVar2) {
        if ((dVar.m24218W() && dVar2.m24218W()) || (dVar.m24217X() && dVar2.m24217X())) {
            return Integer.signum(dVar2.m24240F() - dVar.m24240F());
        }
        if (!dVar.m24218W()) {
            if (!dVar2.m24218W()) {
                if (!dVar.m24217X()) {
                    if (!dVar2.m24217X()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: o */
    private final boolean m24138o(C6832d<?> dVar) {
        int i = this.f14961i;
        for (int i2 = 0; i2 < i; i2++) {
            C6832d<?> dVar2 = this.f14957e[i2];
            C9971q.m14636d(dVar2);
            C6839a aVar = f14947o;
            if (!aVar.m24119h(dVar2.m24226O()) && aVar.m24116k(dVar, dVar2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m24137p(View view) {
        return !(view instanceof ViewGroup) || this.f14955c.mo23993b((ViewGroup) view);
    }

    /* renamed from: q */
    private final boolean m24136q(View view) {
        if (view == null) {
            return false;
        }
        if (view == this.f14953a) {
            return true;
        }
        ViewParent parent = view.getParent();
        while (parent != null && parent != this.f14953a) {
            parent = parent.getParent();
        }
        if (parent == this.f14953a) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private final boolean m24135r(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        Matrix matrix = view.getMatrix();
        float[] fArr = f14949q;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float left = fArr[0] + view.getLeft();
        float top = fArr[1] + view.getTop();
        if (left < 0.0f || left + view.getWidth() > viewGroup.getWidth() || top < 0.0f || top + view.getHeight() > viewGroup.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final void m24134s(C6832d<?> dVar) {
        int O = dVar.m24226O();
        dVar.m24189q0(false);
        dVar.m24191p0(true);
        dVar.m24173z0(true);
        int i = this.f14966n;
        this.f14966n = i + 1;
        dVar.m24193o0(i);
        int i2 = this.f14961i;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            C6832d<?> dVar2 = this.f14957e[i4];
            C9971q.m14636d(dVar2);
            if (f14947o.m24117j(dVar2, dVar)) {
                this.f14960h[i3] = dVar2;
                i3++;
            }
        }
        for (int i5 = i3 - 1; -1 < i5; i5--) {
            C6832d<?> dVar3 = this.f14960h[i5];
            C9971q.m14636d(dVar3);
            dVar3.m24192p();
        }
        for (int i6 = this.f14962j - 1; -1 < i6; i6--) {
            C6832d<?> dVar4 = this.f14958f[i6];
            C9971q.m14636d(dVar4);
            if (f14947o.m24117j(dVar4, dVar)) {
                dVar4.m24192p();
                dVar4.m24189q0(false);
            }
        }
        m24146g();
        dVar.mo24103v(4, 2);
        if (O != 4) {
            dVar.mo24103v(5, 4);
            if (O != 5) {
                dVar.mo24103v(0, 5);
            }
        }
    }

    /* renamed from: v */
    private final void m24131v(C6832d<?> dVar, View view) {
        boolean z;
        int i = this.f14961i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14957e[i2] == dVar) {
                return;
            }
        }
        int i3 = this.f14961i;
        C6832d<?>[] dVarArr = this.f14957e;
        if (i3 < dVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f14961i = i3 + 1;
            dVarArr[i3] = dVar;
            dVar.m24191p0(false);
            dVar.m24189q0(false);
            dVar.m24193o0(ViewDefaults.NUMBER_OF_LINES);
            dVar.m24202i0(view, this);
            return;
        }
        throw new IllegalStateException("Too many recognizers".toString());
    }

    /* renamed from: w */
    private final boolean m24130w(View view, float[] fArr, int i) {
        boolean z;
        boolean z2;
        ArrayList<C6832d<?>> a = this.f14954b.mo24113a(view);
        boolean z3 = false;
        if (a != null) {
            synchronized (a) {
                Iterator<C6832d<?>> it = a.iterator();
                z = false;
                while (it.hasNext()) {
                    C6832d<?> handler = it.next();
                    if (handler.m24216Y() && handler.m24213a0(view, fArr[0], fArr[1])) {
                        C9971q.m14634f(handler, "handler");
                        m24131v(handler, view);
                        handler.m24239F0(i);
                        z = true;
                    }
                }
                Unit unit = Unit.f22042a;
            }
        } else {
            z = false;
        }
        float width = view.getWidth();
        float f = fArr[0];
        if (0.0f > f || f > width) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            float height = view.getHeight();
            float f2 = fArr[1];
            if (0.0f <= f2 && f2 <= height) {
                z3 = true;
            }
            if (z3 && m24135r(view) && m24142k(view, fArr, i)) {
                return true;
            }
        }
        return z;
    }

    /* renamed from: x */
    private final void m24129x() {
        if (this.f14963k || this.f14964l != 0) {
            this.f14965m = true;
        } else {
            m24145h();
        }
    }

    /* renamed from: A */
    public final PointF m24155A(View view, PointF point) {
        ViewGroup viewGroup;
        C9971q.m14633g(point, "point");
        if (view == null) {
            return point;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C9971q.m14638b(viewGroup, this.f14953a)) {
            m24155A(viewGroup, point);
        }
        if (viewGroup != null) {
            point.x += viewGroup.getScrollX() - view.getLeft();
            point.y += viewGroup.getScrollY() - view.getTop();
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f14950r;
            matrix.invert(matrix2);
            float[] fArr = f14951s;
            fArr[0] = point.x;
            fArr[1] = point.y;
            matrix2.mapPoints(fArr);
            point.x = fArr[0];
            point.y = fArr[1];
        }
        return point;
    }

    /* renamed from: t */
    public final void m24133t(C6832d<?> handler, int i, int i2) {
        C9971q.m14633g(handler, "handler");
        this.f14964l++;
        if (f14947o.m24119h(i)) {
            int i3 = this.f14962j;
            for (int i4 = 0; i4 < i3; i4++) {
                C6832d<?> dVar = this.f14958f[i4];
                C6839a aVar = f14947o;
                C9971q.m14636d(dVar);
                if (aVar.m24116k(dVar, handler)) {
                    if (i == 5) {
                        dVar.m24192p();
                        if (dVar.m24226O() == 5) {
                            dVar.mo24103v(3, 2);
                        }
                        dVar.m24189q0(false);
                    } else {
                        m24153C(dVar);
                    }
                }
            }
            m24146g();
        }
        if (i == 4) {
            m24153C(handler);
        } else if (i2 == 4 || i2 == 5) {
            if (handler.m24218W()) {
                handler.mo24103v(i, i2);
            } else if (i2 == 4 && (i == 3 || i == 1)) {
                handler.mo24103v(i, 2);
            }
        } else if (!(i2 == 0 && i == 3)) {
            handler.mo24103v(i, i2);
        }
        this.f14964l--;
        m24129x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 != 5) goto L_0x001c;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m24132u(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C9971q.m14633g(r4, r0)
            r0 = 1
            r3.f14963k = r0
            int r1 = r4.getActionMasked()
            if (r1 == 0) goto L_0x0019
            r2 = 3
            if (r1 == r2) goto L_0x0015
            r2 = 5
            if (r1 == r2) goto L_0x0019
            goto L_0x001c
        L_0x0015:
            r3.m24147f()
            goto L_0x001c
        L_0x0019:
            r3.m24141l(r4)
        L_0x001c:
            r3.m24143j(r4)
            r4 = 0
            r3.f14963k = r4
            boolean r4 = r3.f14965m
            if (r4 == 0) goto L_0x002d
            int r4 = r3.f14964l
            if (r4 != 0) goto L_0x002d
            r3.m24145h()
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p085ef.C6838g.m24132u(android.view.MotionEvent):boolean");
    }

    /* renamed from: y */
    public final void m24128y(float f) {
        this.f14956d = f;
    }

    /* renamed from: z */
    public final MotionEvent m24127z(View view, MotionEvent event) {
        ViewGroup viewGroup;
        C9971q.m14633g(event, "event");
        if (view == null) {
            return event;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (!C9971q.m14638b(viewGroup, this.f14953a)) {
            m24127z(viewGroup, event);
        }
        if (viewGroup != null) {
            event.setLocation((event.getX() + viewGroup.getScrollX()) - view.getLeft(), (event.getY() + viewGroup.getScrollY()) - view.getTop());
        }
        if (!view.getMatrix().isIdentity()) {
            Matrix matrix = view.getMatrix();
            Matrix matrix2 = f14950r;
            matrix.invert(matrix2);
            event.transform(matrix2);
        }
        return event;
    }
}
