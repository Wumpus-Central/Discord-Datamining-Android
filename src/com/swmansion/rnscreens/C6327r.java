package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.C6308j;
import eg.C6884j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9912p;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import p106ff.C7135h;

@Metadata(m15074d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002NOB\u0011\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\u00032\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002J\f\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0003J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0014J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0014J \u0010&\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0014R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00020'j\b\u0012\u0004\u0012\u00020\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u001e\u00102\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00103\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u0015R\"\u0010D\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006P"}, m15073d2 = {"Lcom/swmansion/rnscreens/r;", "Lcom/swmansion/rnscreens/l;", "Lcom/swmansion/rnscreens/s;", "", "C", "visibleBottom", "K", "D", "Lcom/swmansion/rnscreens/r$b;", "op", "J", "E", "screenFragment", "B", "Lcom/swmansion/rnscreens/j;", "screen", "A", "Landroid/view/View;", "view", "startViewTransition", "endViewTransition", "I", "", "index", "u", "s", "Lcom/swmansion/rnscreens/n;", "", "k", "p", "m", "removeView", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "child", "", "drawingTime", "drawChild", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "r", "Ljava/util/ArrayList;", "mStack", "", "Ljava/util/Set;", "mDismissed", "", "t", "Ljava/util/List;", "drawingOpPool", "drawingOps", "v", "Lcom/swmansion/rnscreens/s;", "mTopScreen", "w", "Z", "mRemovalTransitionStarted", "x", "isDetachingCurrentScreen", "y", "reverseLastTwoChildren", "z", "previousChildrenCount", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "goingForward", "getTopScreen", "()Lcom/swmansion/rnscreens/j;", "topScreen", "getRootScreen", "rootScreen", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.r */
/* loaded from: classes8.dex */
public final class C6327r extends C6316l<C6331s> {

    /* renamed from: B */
    public static final C6328a f37679B = new C6328a(null);

    /* renamed from: A */
    private boolean f37680A;

    /* renamed from: r */
    private final ArrayList<C6331s> f12868r = new ArrayList<>();

    /* renamed from: s */
    private final Set<C6331s> f12869s = new HashSet();

    /* renamed from: t */
    private final List<C6329b> f12870t = new ArrayList();

    /* renamed from: u */
    private List<C6329b> f12871u = new ArrayList();

    /* renamed from: v */
    private C6331s f12872v;

    /* renamed from: w */
    private boolean f12873w;

    /* renamed from: x */
    private boolean f12874x;

    /* renamed from: y */
    private boolean f12875y;

    /* renamed from: z */
    private int f12876z;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\t"}, m15073d2 = {"Lcom/swmansion/rnscreens/r$a;", "", "Lcom/swmansion/rnscreens/s;", "fragment", "", "c", "d", "<init>", "()V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.r$a */
    /* loaded from: classes8.dex */
    public static final class C6328a {
        private C6328a() {
        }

        public /* synthetic */ C6328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final boolean m25851c(C6331s sVar) {
            return sVar.m25884q().getStackPresentation() == C6308j.EnumC6312d.TRANSPARENT_MODAL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m25850d(C6331s sVar) {
            if (sVar.m25884q().getStackAnimation() == C6308j.EnumC6311c.SLIDE_FROM_BOTTOM || sVar.m25884q().getStackAnimation() == C6308j.EnumC6311c.FADE_FROM_BOTTOM) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\t\u001a\u00060\u0000R\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m15073d2 = {"Lcom/swmansion/rnscreens/r$b;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "child", "", "drawingTime", "Lcom/swmansion/rnscreens/r;", "e", "", "a", "Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "c", "()Landroid/view/View;", "setChild", "(Landroid/view/View;)V", "J", "d", "()J", "setDrawingTime", "(J)V", "<init>", "(Lcom/swmansion/rnscreens/r;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.r$b */
    /* loaded from: classes8.dex */
    public final class C6329b {

        /* renamed from: a */
        private Canvas f12877a;

        /* renamed from: b */
        private View f12878b;

        /* renamed from: c */
        private long f12879c;

        public C6329b() {
        }

        /* renamed from: a */
        public final void m25849a() {
            C6327r.this.m25865J(this);
            this.f12877a = null;
            this.f12878b = null;
            this.f12879c = 0L;
        }

        /* renamed from: b */
        public final Canvas m25848b() {
            return this.f12877a;
        }

        /* renamed from: c */
        public final View m25847c() {
            return this.f12878b;
        }

        /* renamed from: d */
        public final long m25846d() {
            return this.f12879c;
        }

        /* renamed from: e */
        public final C6329b m25845e(Canvas canvas, View view, long j) {
            this.f12877a = canvas;
            this.f12878b = view;
            this.f12879c = j;
            return this;
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.swmansion.rnscreens.r$c */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6330c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12881a;

        static {
            int[] iArr = new int[C6308j.EnumC6311c.values().length];
            try {
                iArr[C6308j.EnumC6311c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6308j.EnumC6311c.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6308j.EnumC6311c.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C6308j.EnumC6311c.SLIDE_FROM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C6308j.EnumC6311c.SLIDE_FROM_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C6308j.EnumC6311c.SLIDE_FROM_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C6308j.EnumC6311c.FADE_FROM_BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12881a = iArr;
        }
    }

    public C6327r(Context context) {
        super(context);
    }

    /* renamed from: C */
    private final void m25872C() {
        Context context = getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C7135h(getId()));
        }
    }

    /* renamed from: D */
    private final void m25871D() {
        List<C6329b> list = this.f12871u;
        this.f12871u = new ArrayList();
        for (C6329b bVar : list) {
            bVar.m25849a();
            this.f12870t.add(bVar);
        }
    }

    /* renamed from: E */
    private final C6329b m25870E() {
        if (this.f12870t.isEmpty()) {
            return new C6329b();
        }
        List<C6329b> list = this.f12870t;
        return list.remove(list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m25869F(C6331s sVar) {
        C6308j q;
        if (sVar != null && (q = sVar.m25884q()) != null) {
            q.bringToFront();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final void m25868G(Ref$ObjectRef newTop) {
        C9971q.m14633g(newTop, "$newTop");
        ((C6331s) newTop.f22069k).m25884q().bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m25867H(Ref$ObjectRef newTop) {
        C9971q.m14633g(newTop, "$newTop");
        ((C6331s) newTop.f22069k).m25884q().bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public final void m25865J(C6329b bVar) {
        super.drawChild(bVar.m25848b(), bVar.m25847c(), bVar.m25846d());
    }

    /* renamed from: K */
    private final void m25864K(C6331s sVar) {
        C6331s sVar2;
        IntRange q;
        List u0;
        List<C6331s> F;
        if (this.f12841k.size() > 1 && sVar != null && (sVar2 = this.f12872v) != null && f37679B.m25851c(sVar2)) {
            ArrayList<T> arrayList = this.f12841k;
            q = C6884j.m23947q(0, arrayList.size() - 1);
            u0 = C9914r.m14744u0(arrayList, q);
            F = C9912p.m14797F(u0);
            for (C6331s sVar3 : F) {
                sVar3.m25884q().m25927a(4);
                if (C9971q.m14638b(sVar3, sVar)) {
                    break;
                }
            }
        }
        C6308j topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.m25927a(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public C6331s mo25863c(C6308j screen) {
        C9971q.m14633g(screen, "screen");
        return new C6331s(screen);
    }

    /* renamed from: B */
    public final void m25873B(C6331s screenFragment) {
        C9971q.m14633g(screenFragment, "screenFragment");
        this.f12869s.add(screenFragment);
        m25902r();
    }

    /* renamed from: I */
    public final void m25866I() {
        if (!this.f12873w) {
            m25872C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C9971q.m14633g(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f12871u.size() < this.f12876z) {
            this.f12875y = false;
        }
        this.f12876z = this.f12871u.size();
        if (this.f12875y && this.f12871u.size() >= 2) {
            List<C6329b> list = this.f12871u;
            Collections.swap(list, list.size() - 1, this.f12871u.size() - 2);
        }
        m25871D();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j) {
        C9971q.m14633g(canvas, "canvas");
        C9971q.m14633g(child, "child");
        this.f12871u.add(m25870E().m25845e(canvas, child, j));
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        C9971q.m14633g(view, "view");
        super.endViewTransition(view);
        if (this.f12873w) {
            this.f12873w = false;
            m25872C();
        }
    }

    public final boolean getGoingForward() {
        return this.f37680A;
    }

    public final C6308j getRootScreen() {
        boolean M;
        int screenCount = getScreenCount();
        for (int i = 0; i < screenCount; i++) {
            C6308j j = m25907j(i);
            M = C9914r.m14778M(this.f12869s, j.getFragment());
            if (!M) {
                return j;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    @Override // com.swmansion.rnscreens.C6316l
    public C6308j getTopScreen() {
        C6331s sVar = this.f12872v;
        if (sVar != null) {
            return sVar.m25884q();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.C6316l
    /* renamed from: k */
    public boolean mo25862k(C6319n nVar) {
        boolean M;
        if (super.mo25862k(nVar)) {
            M = C9914r.m14778M(this.f12869s, nVar);
            if (!M) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.C6316l
    /* renamed from: m */
    protected void mo25861m() {
        for (C6331s sVar : this.f12868r) {
            sVar.mo25834r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f6, code lost:
        if (r5.isAdded() != false) goto L_0x022c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f8, code lost:
        r2 = (com.swmansion.rnscreens.C6331s) r0.f22069k;
        r3 = r10.f12841k.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
        if (r3.hasNext() == false) goto L_0x0280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0208, code lost:
        r6 = (com.swmansion.rnscreens.C6331s) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020e, code lost:
        if (r7 == false) goto L_0x0213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0210, code lost:
        if (r6 != r5) goto L_0x0202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0212, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0213, code lost:
        if (r6 == null) goto L_0x0202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0219, code lost:
        if (r6.isAdded() != false) goto L_0x0202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021b, code lost:
        r4.m36074b(getId(), r6).m36066p(new com.swmansion.rnscreens.RunnableC6324o(r2));
     */
    /* JADX WARN: Type inference failed for: r8v39, types: [com.swmansion.rnscreens.s, T, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.swmansion.rnscreens.C6316l
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo25860p() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C6327r.mo25860p():void");
    }

    @Override // com.swmansion.rnscreens.C6316l, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C9971q.m14633g(view, "view");
        if (this.f12874x) {
            this.f12874x = false;
            this.f12875y = true;
        }
        super.removeView(view);
    }

    @Override // com.swmansion.rnscreens.C6316l
    /* renamed from: s */
    public void mo25859s() {
        this.f12869s.clear();
        super.mo25859s();
    }

    public final void setGoingForward(boolean z) {
        this.f37680A = z;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        C9971q.m14633g(view, "view");
        super.startViewTransition(view);
        this.f12873w = true;
    }

    @Override // com.swmansion.rnscreens.C6316l
    /* renamed from: u */
    public void mo25858u(int i) {
        Set<C6331s> set = this.f12869s;
        C9964l0.m14656a(set).remove(m25907j(i).getFragment());
        super.mo25858u(i);
    }
}
