package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.C3143k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.AbstractC3306a;
import p433y1.C14219a;

/* renamed from: androidx.viewpager2.widget.f */
/* loaded from: classes.dex */
public final class C3313f extends ViewGroup {

    /* renamed from: E */
    static boolean f35775E = true;

    /* renamed from: D */
    AbstractC3318e f35779D;

    /* renamed from: n */
    int f5318n;

    /* renamed from: q */
    private LinearLayoutManager f5321q;

    /* renamed from: s */
    private Parcelable f5323s;

    /* renamed from: t */
    RecyclerView f5324t;

    /* renamed from: u */
    private C3143k f5325u;

    /* renamed from: v */
    C3311e f5326v;

    /* renamed from: w */
    private C3308b f5327w;

    /* renamed from: x */
    private C3309c f5328x;

    /* renamed from: y */
    private C3310d f5329y;

    /* renamed from: k */
    private final Rect f5315k = new Rect();

    /* renamed from: l */
    private final Rect f5316l = new Rect();

    /* renamed from: m */
    private C3308b f5317m = new C3308b(3);

    /* renamed from: o */
    boolean f5319o = false;

    /* renamed from: p */
    private RecyclerView.AdapterDataObserver f5320p = new C3314a();

    /* renamed from: r */
    private int f5322r = -1;

    /* renamed from: z */
    private RecyclerView.ItemAnimator f5330z = null;

    /* renamed from: A */
    private boolean f35776A = false;

    /* renamed from: B */
    private boolean f35777B = true;

    /* renamed from: C */
    private int f35778C = -1;

    /* renamed from: androidx.viewpager2.widget.f$a */
    /* loaded from: classes.dex */
    class C3314a extends AbstractC3319g {
        C3314a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3319g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public void mo34633a() {
            C3313f fVar = C3313f.this;
            fVar.f5319o = true;
            fVar.f5326v.m34685j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$b */
    /* loaded from: classes.dex */
    public class C3315b extends AbstractC3321i {
        C3315b() {
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: a */
        public void mo26100a(int i) {
            if (i == 0) {
                C3313f.this.m34665n();
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: c */
        public void mo26098c(int i) {
            C3313f fVar = C3313f.this;
            if (fVar.f5318n != i) {
                fVar.f5318n = i;
                fVar.f35779D.mo34640q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$c */
    /* loaded from: classes.dex */
    public class C3316c extends AbstractC3321i {
        C3316c() {
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: c */
        public void mo26098c(int i) {
            C3313f.this.clearFocus();
            if (C3313f.this.hasFocus()) {
                C3313f.this.f5324t.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$d */
    /* loaded from: classes.dex */
    public class C3317d implements RecyclerView.OnChildAttachStateChangeListener {
        C3317d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            RecyclerView.C3109i iVar = (RecyclerView.C3109i) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) iVar).width != -1 || ((ViewGroup.MarginLayoutParams) iVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$e */
    /* loaded from: classes.dex */
    public abstract class AbstractC3318e {
        private AbstractC3318e() {
        }

        /* renamed from: a */
        boolean mo34651a() {
            return false;
        }

        /* renamed from: b */
        boolean mo34664b(int i) {
            return false;
        }

        /* renamed from: c */
        boolean mo34650c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo34663d() {
            return false;
        }

        /* renamed from: e */
        void mo34649e(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: f */
        void mo34648f(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: g */
        String mo34647g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo34646h(C3308b bVar, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo34645i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo34662j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        /* renamed from: k */
        boolean mo34661k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo34644l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo34643m() {
        }

        /* renamed from: n */
        CharSequence mo34660n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo34642o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo34641p() {
        }

        /* renamed from: q */
        void mo34640q() {
        }

        /* renamed from: r */
        void mo34639r() {
        }

        /* renamed from: s */
        void mo34638s() {
        }

        /* synthetic */ AbstractC3318e(C3313f fVar, C3314a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$f */
    /* loaded from: classes.dex */
    public class C0071f extends AbstractC3318e {
        C0071f() {
            super(C3313f.this, null);
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: b */
        public boolean mo34664b(int i) {
            if ((i == 8192 || i == 4096) && !C3313f.this.m34674e()) {
                return true;
            }
            return false;
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: d */
        public boolean mo34663d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: j */
        public void mo34662j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (!C3313f.this.m34674e()) {
                accessibilityNodeInfoCompat.m37398S(AccessibilityNodeInfoCompat.C2556a.f3570r);
                accessibilityNodeInfoCompat.m37398S(AccessibilityNodeInfoCompat.C2556a.f3569q);
                accessibilityNodeInfoCompat.m37343x0(false);
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: k */
        public boolean mo34661k(int i) {
            if (mo34664b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: n */
        public CharSequence mo34660n() {
            if (mo34663d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$g */
    /* loaded from: classes.dex */
    private static abstract class AbstractC3319g extends RecyclerView.AdapterDataObserver {
        private AbstractC3319g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: a */
        public abstract void mo34633a();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: b */
        public final void mo34659b(int i, int i2) {
            mo34633a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: c */
        public final void mo34658c(int i, int i2, Object obj) {
            mo34633a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: d */
        public final void mo34657d(int i, int i2) {
            mo34633a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: e */
        public final void mo34656e(int i, int i2, int i3) {
            mo34633a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        /* renamed from: f */
        public final void mo34655f(int i, int i2) {
            mo34633a();
        }

        /* synthetic */ AbstractC3319g(C3314a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$h */
    /* loaded from: classes.dex */
    public class C3320h extends LinearLayoutManager {
        C3320h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: B1 */
        public boolean mo34654B1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: V0 */
        public void mo34653V0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.mo34653V0(recycler, state, accessibilityNodeInfoCompat);
            C3313f.this.f35779D.mo34662j(accessibilityNodeInfoCompat);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo28184V1(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = C3313f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo28184V1(state, iArr);
                return;
            }
            int pageSize = C3313f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        /* renamed from: p1 */
        public boolean mo34652p1(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            if (C3313f.this.f35779D.mo34664b(i)) {
                return C3313f.this.f35779D.mo34661k(i);
            }
            return super.mo34652p1(recycler, state, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3321i {
        /* renamed from: a */
        public void mo26100a(int i) {
        }

        /* renamed from: b */
        public void mo26099b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo26098c(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$j */
    /* loaded from: classes.dex */
    public class C3322j extends AbstractC3318e {

        /* renamed from: b */
        private final AccessibilityViewCommand f5337b = new C3323a();

        /* renamed from: c */
        private final AccessibilityViewCommand f5338c = new C3324b();

        /* renamed from: d */
        private RecyclerView.AdapterDataObserver f5339d;

        /* renamed from: androidx.viewpager2.widget.f$j$a */
        /* loaded from: classes.dex */
        class C3323a implements AccessibilityViewCommand {
            C3323a() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
                C3322j.this.m34635v(((C3313f) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.f$j$b */
        /* loaded from: classes.dex */
        class C3324b implements AccessibilityViewCommand {
            C3324b() {
            }

            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            /* renamed from: a */
            public boolean mo28572a(View view, AccessibilityViewCommand.AbstractC2563a aVar) {
                C3322j.this.m34635v(((C3313f) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.f$j$c */
        /* loaded from: classes.dex */
        class C3325c extends AbstractC3319g {
            C3325c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.C3313f.AbstractC3319g, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            /* renamed from: a */
            public void mo34633a() {
                C3322j.this.m34634w();
            }
        }

        C3322j() {
            super(C3313f.this, null);
        }

        /* renamed from: t */
        private void m34637t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (C3313f.this.getAdapter() == null) {
                i2 = 0;
                i = 0;
            } else if (C3313f.this.getOrientation() == 1) {
                i2 = C3313f.this.getAdapter().getItemCount();
                i = 0;
            } else {
                i = C3313f.this.getAdapter().getItemCount();
                i2 = 0;
            }
            AccessibilityNodeInfoCompat.m37408I0(accessibilityNodeInfo).m37385c0(AccessibilityNodeInfoCompat.C2557b.m37333b(i2, i, false, 0));
        }

        /* renamed from: u */
        private void m34636u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = C3313f.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && C3313f.this.m34674e()) {
                if (C3313f.this.f5318n > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (C3313f.this.f5318n < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: a */
        public boolean mo34651a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: c */
        public boolean mo34650c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: e */
        public void mo34649e(RecyclerView.Adapter<?> adapter) {
            m34634w();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f5339d);
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: f */
        public void mo34648f(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f5339d);
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: g */
        public String mo34647g() {
            if (mo34651a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: h */
        public void mo34646h(C3308b bVar, RecyclerView recyclerView) {
            C2733w0.m37064A0(recyclerView, 2);
            this.f5339d = new C3325c();
            if (C2733w0.m36973z(C3313f.this) == 0) {
                C2733w0.m37064A0(C3313f.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: i */
        public void mo34645i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m34637t(accessibilityNodeInfo);
            m34636u(accessibilityNodeInfo);
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: l */
        public boolean mo34644l(int i, Bundle bundle) {
            int i2;
            if (mo34650c(i, bundle)) {
                if (i == 8192) {
                    i2 = C3313f.this.getCurrentItem() - 1;
                } else {
                    i2 = C3313f.this.getCurrentItem() + 1;
                }
                m34635v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: m */
        public void mo34643m() {
            m34634w();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: o */
        public void mo34642o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(C3313f.this);
            accessibilityEvent.setClassName(mo34647g());
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: p */
        public void mo34641p() {
            m34634w();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: q */
        public void mo34640q() {
            m34634w();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: r */
        public void mo34639r() {
            m34634w();
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3318e
        /* renamed from: s */
        public void mo34638s() {
            m34634w();
        }

        /* renamed from: v */
        void m34635v(int i) {
            if (C3313f.this.m34674e()) {
                C3313f.this.m34668k(i, true);
            }
        }

        /* renamed from: w */
        void m34634w() {
            int itemCount;
            int i;
            C3313f fVar = C3313f.this;
            int i2 = 16908360;
            C2733w0.m37002k0(fVar, 16908360);
            C2733w0.m37002k0(fVar, 16908361);
            C2733w0.m37002k0(fVar, 16908358);
            C2733w0.m37002k0(fVar, 16908359);
            if (C3313f.this.getAdapter() != null && (itemCount = C3313f.this.getAdapter().getItemCount()) != 0 && C3313f.this.m34674e()) {
                if (C3313f.this.getOrientation() == 0) {
                    boolean d = C3313f.this.m34675d();
                    if (d) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (d) {
                        i2 = 16908361;
                    }
                    if (C3313f.this.f5318n < itemCount - 1) {
                        C2733w0.m36998m0(fVar, new AccessibilityNodeInfoCompat.C2556a(i, null), null, this.f5337b);
                    }
                    if (C3313f.this.f5318n > 0) {
                        C2733w0.m36998m0(fVar, new AccessibilityNodeInfoCompat.C2556a(i2, null), null, this.f5338c);
                        return;
                    }
                    return;
                }
                if (C3313f.this.f5318n < itemCount - 1) {
                    C2733w0.m36998m0(fVar, new AccessibilityNodeInfoCompat.C2556a(16908359, null), null, this.f5337b);
                }
                if (C3313f.this.f5318n > 0) {
                    C2733w0.m36998m0(fVar, new AccessibilityNodeInfoCompat.C2556a(16908358, null), null, this.f5338c);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.f$k */
    /* loaded from: classes.dex */
    public interface AbstractC3326k {
        /* renamed from: a */
        void mo26095a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$l */
    /* loaded from: classes.dex */
    public class C3327l extends C3143k {
        C3327l() {
        }

        @Override // androidx.recyclerview.widget.C3143k, androidx.recyclerview.widget.AbstractC3147n
        /* renamed from: f */
        public View mo34632f(RecyclerView.LayoutManager layoutManager) {
            if (C3313f.this.m34676c()) {
                return null;
            }
            return super.mo34632f(layoutManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$m */
    /* loaded from: classes.dex */
    public class C3328m extends RecyclerView {
        C3328m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (C3313f.this.f35779D.mo34663d()) {
                return C3313f.this.f35779D.mo34660n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(C3313f.this.f5318n);
            accessibilityEvent.setToIndex(C3313f.this.f5318n);
            C3313f.this.f35779D.mo34642o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return C3313f.this.m34674e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return C3313f.this.m34674e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.f$o */
    /* loaded from: classes.dex */
    public static class RunnableC3331o implements Runnable {

        /* renamed from: k */
        private final int f5349k;

        /* renamed from: l */
        private final RecyclerView f5350l;

        RunnableC3331o(int i, RecyclerView recyclerView) {
            this.f5349k = i;
            this.f5350l = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5350l.smoothScrollToPosition(this.f5349k);
        }
    }

    public C3313f(Context context) {
        super(context);
        m34677b(context, null);
    }

    /* renamed from: a */
    private RecyclerView.OnChildAttachStateChangeListener m34678a() {
        return new C3317d();
    }

    /* renamed from: b */
    private void m34677b(Context context, AttributeSet attributeSet) {
        AbstractC3318e eVar;
        if (f35775E) {
            eVar = new C3322j();
        } else {
            eVar = new C0071f();
        }
        this.f35779D = eVar;
        C3328m mVar = new C3328m(context);
        this.f5324t = mVar;
        mVar.setId(C2733w0.m37003k());
        this.f5324t.setDescendantFocusability(131072);
        C3320h hVar = new C3320h(context);
        this.f5321q = hVar;
        this.f5324t.setLayoutManager(hVar);
        this.f5324t.setScrollingTouchSlop(1);
        m34667l(context, attributeSet);
        this.f5324t.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5324t.addOnChildAttachStateChangeListener(m34678a());
        C3311e eVar2 = new C3311e(this);
        this.f5326v = eVar2;
        this.f5328x = new C3309c(this, eVar2, this.f5324t);
        C3327l lVar = new C3327l();
        this.f5325u = lVar;
        lVar.m35080b(this.f5324t);
        this.f5324t.addOnScrollListener(this.f5326v);
        C3308b bVar = new C3308b(3);
        this.f5327w = bVar;
        this.f5326v.m34682m(bVar);
        C3315b bVar2 = new C3315b();
        C3316c cVar = new C3316c();
        this.f5327w.m34699d(bVar2);
        this.f5327w.m34699d(cVar);
        this.f35779D.mo34646h(this.f5327w, this.f5324t);
        this.f5327w.m34699d(this.f5317m);
        C3310d dVar = new C3310d(this.f5321q);
        this.f5329y = dVar;
        this.f5327w.m34699d(dVar);
        RecyclerView recyclerView = this.f5324t;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m34673f(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f5320p);
        }
    }

    /* renamed from: i */
    private void m34670i() {
        RecyclerView.Adapter adapter;
        if (this.f5322r != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f5323s;
            if (parcelable != null) {
                if (adapter instanceof AbstractC3306a) {
                    ((AbstractC3306a) adapter).m34705b(parcelable);
                }
                this.f5323s = null;
            }
            int max = Math.max(0, Math.min(this.f5322r, adapter.getItemCount() - 1));
            this.f5318n = max;
            this.f5322r = -1;
            this.f5324t.scrollToPosition(max);
            this.f35779D.mo34643m();
        }
    }

    /* renamed from: l */
    private void m34667l(Context context, AttributeSet attributeSet) {
        int[] iArr = C14219a.f32132g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C14219a.f32133h, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m34666m(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f5320p);
        }
    }

    /* renamed from: c */
    public boolean m34676c() {
        return this.f5328x.m34697a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f5324t.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f5324t.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m34675d() {
        return this.f5321q.m35454k0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C3329n) {
            int i = ((C3329n) parcelable).f5346k;
            sparseArray.put(this.f5324t.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m34670i();
    }

    /* renamed from: e */
    public boolean m34674e() {
        return this.f35777B;
    }

    /* renamed from: g */
    public void m34672g(AbstractC3321i iVar) {
        this.f5317m.m34699d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f35779D.mo34651a()) {
            return this.f35779D.mo34647g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f5324t.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5318n;
    }

    public int getItemDecorationCount() {
        return this.f5324t.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f35778C;
    }

    public int getOrientation() {
        return this.f5321q.m35547w2();
    }

    int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f5324t;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f5326v.m34689f();
    }

    /* renamed from: h */
    public void m34671h() {
        if (this.f5329y.m34696d() != null) {
            double e = this.f5326v.m34690e();
            int i = (int) e;
            float f = (float) (e - i);
            this.f5329y.mo26099b(i, f, Math.round(getPageSize() * f));
        }
    }

    /* renamed from: j */
    public void m34669j(int i, boolean z) {
        if (!m34676c()) {
            m34668k(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: k */
    void m34668k(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f5322r != -1) {
                this.f5322r = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f5318n || !this.f5326v.m34687h()) {
                int i3 = this.f5318n;
                if (min != i3 || !z) {
                    double d = i3;
                    this.f5318n = min;
                    this.f35779D.mo34640q();
                    if (!this.f5326v.m34687h()) {
                        d = this.f5326v.m34690e();
                    }
                    this.f5326v.m34684k(min, z);
                    if (!z) {
                        this.f5324t.scrollToPosition(min);
                        return;
                    }
                    double d2 = min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        RecyclerView recyclerView = this.f5324t;
                        if (d2 > d) {
                            i2 = min - 3;
                        } else {
                            i2 = min + 3;
                        }
                        recyclerView.scrollToPosition(i2);
                        RecyclerView recyclerView2 = this.f5324t;
                        recyclerView2.post(new RunnableC3331o(min, recyclerView2));
                        return;
                    }
                    this.f5324t.smoothScrollToPosition(min);
                }
            }
        }
    }

    /* renamed from: n */
    void m34665n() {
        C3143k kVar = this.f5325u;
        if (kVar != null) {
            View f = kVar.mo34632f(this.f5321q);
            if (f != null) {
                int o0 = this.f5321q.m35446o0(f);
                if (o0 != this.f5318n && getScrollState() == 0) {
                    this.f5327w.mo26098c(o0);
                }
                this.f5319o = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f35779D.mo34645i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5324t.getMeasuredWidth();
        int measuredHeight = this.f5324t.getMeasuredHeight();
        this.f5315k.left = getPaddingLeft();
        this.f5315k.right = (i3 - i) - getPaddingRight();
        this.f5315k.top = getPaddingTop();
        this.f5315k.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5315k, this.f5316l);
        RecyclerView recyclerView = this.f5324t;
        Rect rect = this.f5316l;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5319o) {
            m34665n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChild(this.f5324t, i, i2);
        int measuredWidth = this.f5324t.getMeasuredWidth();
        int measuredHeight = this.f5324t.getMeasuredHeight();
        int measuredState = this.f5324t.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3329n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3329n nVar = (C3329n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f5322r = nVar.f5347l;
        this.f5323s = nVar.f5348m;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C3329n nVar = new C3329n(super.onSaveInstanceState());
        nVar.f5346k = this.f5324t.getId();
        int i = this.f5322r;
        if (i == -1) {
            i = this.f5318n;
        }
        nVar.f5347l = i;
        Parcelable parcelable = this.f5323s;
        if (parcelable != null) {
            nVar.f5348m = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f5324t.getAdapter();
            if (adapter instanceof AbstractC3306a) {
                nVar.f5348m = ((AbstractC3306a) adapter).m34706a();
            }
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(C3313f.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f35779D.mo34650c(i, bundle)) {
            return this.f35779D.mo34644l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f5324t.getAdapter();
        this.f35779D.mo34648f(adapter2);
        m34666m(adapter2);
        this.f5324t.setAdapter(adapter);
        this.f5318n = 0;
        m34670i();
        this.f35779D.mo34649e(adapter);
        m34673f(adapter);
    }

    public void setCurrentItem(int i) {
        m34669j(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f35779D.mo34641p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f35778C = i;
            this.f5324t.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f5321q.m35585L2(i);
        this.f35779D.mo34639r();
    }

    public void setPageTransformer(AbstractC3326k kVar) {
        if (kVar != null) {
            if (!this.f35776A) {
                this.f5330z = this.f5324t.getItemAnimator();
                this.f35776A = true;
            }
            this.f5324t.setItemAnimator(null);
        } else if (this.f35776A) {
            this.f5324t.setItemAnimator(this.f5330z);
            this.f5330z = null;
            this.f35776A = false;
        }
        if (kVar != this.f5329y.m34696d()) {
            this.f5329y.m34695e(kVar);
            m34671h();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f35777B = z;
        this.f35779D.mo34638s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$n */
    /* loaded from: classes.dex */
    public static class C3329n extends View.BaseSavedState {
        public static final Parcelable.Creator<C3329n> CREATOR = new C3330a();

        /* renamed from: k */
        int f5346k;

        /* renamed from: l */
        int f5347l;

        /* renamed from: m */
        Parcelable f5348m;

        /* renamed from: androidx.viewpager2.widget.f$n$a */
        /* loaded from: classes.dex */
        static class C3330a implements Parcelable.ClassLoaderCreator<C3329n> {
            C3330a() {
            }

            /* renamed from: a */
            public C3329n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* renamed from: b */
            public C3329n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C3329n(parcel, classLoader) : new C3329n(parcel);
            }

            /* renamed from: c */
            public C3329n[] newArray(int i) {
                return new C3329n[i];
            }
        }

        C3329n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m34631a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m34631a(Parcel parcel, ClassLoader classLoader) {
            this.f5346k = parcel.readInt();
            this.f5347l = parcel.readInt();
            this.f5348m = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5346k);
            parcel.writeInt(this.f5347l);
            parcel.writeParcelable(this.f5348m, i);
        }

        C3329n(Parcel parcel) {
            super(parcel);
            m34631a(parcel, null);
        }

        C3329n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
