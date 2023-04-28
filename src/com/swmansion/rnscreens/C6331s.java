package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.C6338v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002@AB\u0011\b\u0017\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>B\t\b\u0016¢\u0006\u0004\b=\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u001cH\u0016J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006B"}, m15073d2 = {"Lcom/swmansion/rnscreens/s;", "Lcom/swmansion/rnscreens/n;", "", "E", "", "K", "Landroid/view/Menu;", "menu", "L", "F", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "H", ViewProps.HIDDEN, "I", "translucent", "J", "r", "s", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "C", "dismiss", "Lcom/google/android/material/appbar/AppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "mAppBarLayout", "t", "Landroidx/appcompat/widget/Toolbar;", "mToolbar", "u", "Z", "mShadowHidden", "v", "mIsTranslucent", "Lcom/swmansion/rnscreens/c;", "w", "Lcom/swmansion/rnscreens/c;", "D", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "x", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "G", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "Lcom/swmansion/rnscreens/j;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/j;)V", "()V", "a", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.s */
/* loaded from: classes8.dex */
public final class C6331s extends C6319n {

    /* renamed from: s */
    private AppBarLayout f12882s;

    /* renamed from: t */
    private Toolbar f12883t;

    /* renamed from: u */
    private boolean f12884u;

    /* renamed from: v */
    private boolean f12885v;

    /* renamed from: w */
    private C6285c f12886w;

    /* renamed from: x */
    private Function1<? super C6285c, Unit> f12887x;

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m15073d2 = {"Lcom/swmansion/rnscreens/s$a;", "Landroid/view/animation/Animation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "", "applyTransformation", "Lcom/swmansion/rnscreens/n;", "k", "Lcom/swmansion/rnscreens/n;", "mFragment", "<init>", "(Lcom/swmansion/rnscreens/n;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.s$a */
    /* loaded from: classes8.dex */
    private static final class C6332a extends Animation {

        /* renamed from: k */
        private final C6319n f12888k;

        public C6332a(C6319n mFragment) {
            C9971q.m14633g(mFragment, "mFragment");
            this.f12888k = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation t) {
            C9971q.m14633g(t, "t");
            super.applyTransformation(f, t);
            C6319n nVar = this.f12888k;
            nVar.m25888m(f, !nVar.isResumed());
        }
    }

    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m15073d2 = {"Lcom/swmansion/rnscreens/s$b;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/view/animation/Animation;", "animation", "", "startAnimation", "clearFocus", "Lcom/swmansion/rnscreens/n;", "J", "Lcom/swmansion/rnscreens/n;", "mFragment", "Landroid/view/animation/Animation$AnimationListener;", "K", "Landroid/view/animation/Animation$AnimationListener;", "mAnimationListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/n;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.s$b */
    /* loaded from: classes8.dex */
    private static final class C6333b extends CoordinatorLayout {

        /* renamed from: J */
        private final C6319n f37681J;

        /* renamed from: K */
        private final Animation.AnimationListener f37682K = new animationAnimation$AnimationListenerC6334a();

        @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"com/swmansion/rnscreens/s$b$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationRepeat", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.s$b$a  reason: invalid class name */
        /* loaded from: classes8.dex */
        public static final class animationAnimation$AnimationListenerC6334a implements Animation.AnimationListener {
            animationAnimation$AnimationListenerC6334a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C9971q.m14633g(animation, "animation");
                C6333b.this.f37681J.mo25833s();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                C9971q.m14633g(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                C9971q.m14633g(animation, "animation");
                C6333b.this.f37681J.m25883t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6333b(Context context, C6319n mFragment) {
            super(context);
            C9971q.m14633g(context, "context");
            C9971q.m14633g(mFragment, "mFragment");
            this.f37681J = mFragment;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            C9971q.m14633g(animation, "animation");
            C6332a aVar = new C6332a(this.f37681J);
            aVar.setDuration(animation.getDuration());
            if (!(animation instanceof AnimationSet) || this.f37681J.isRemoving()) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(animation);
                animationSet.addAnimation(aVar);
                animationSet.setAnimationListener(this.f37682K);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = (AnimationSet) animation;
            animationSet2.addAnimation(aVar);
            animationSet2.setAnimationListener(this.f37682K);
            super.startAnimation(animationSet2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ValidFragment"})
    public C6331s(C6308j screenView) {
        super(screenView);
        C9971q.m14633g(screenView, "screenView");
    }

    /* renamed from: E */
    private final void m25842E() {
        ViewParent viewParent;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof C6327r) {
            ((C6327r) viewParent).m25866I();
        }
    }

    /* renamed from: K */
    private final boolean m25836K() {
        int i;
        C6336u headerConfig = m25884q().getHeaderConfig();
        if (headerConfig != null) {
            i = headerConfig.getConfigSubviewsCount();
        } else {
            i = 0;
        }
        if (headerConfig != null && i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                if (headerConfig.m25828d(i2).getType() == C6338v.EnumC6339a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: L */
    private final void m25835L(Menu menu) {
        menu.clear();
        if (m25836K()) {
            Context context = getContext();
            if (this.f12886w == null && context != null) {
                C6285c cVar = new C6285c(context, this);
                this.f12886w = cVar;
                Function1<? super C6285c, Unit> function1 = this.f12887x;
                if (function1 != null) {
                    function1.invoke(cVar);
                }
            }
            MenuItem add = menu.add("");
            add.setShowAsAction(2);
            add.setActionView(this.f12886w);
        }
    }

    /* renamed from: C */
    public final boolean m25844C() {
        C6316l<?> container = m25884q().getContainer();
        if (!(container instanceof C6327r)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        } else if (!C9971q.m14638b(((C6327r) container).getRootScreen(), m25884q())) {
            return true;
        } else {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C6331s) {
                return ((C6331s) parentFragment).m25844C();
            }
            return false;
        }
    }

    /* renamed from: D */
    public final C6285c m25843D() {
        return this.f12886w;
    }

    /* renamed from: F */
    public final void m25841F() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f12882s;
        if (!(appBarLayout == null || (toolbar = this.f12883t) == null || toolbar.getParent() != appBarLayout)) {
            appBarLayout.removeView(toolbar);
        }
        this.f12883t = null;
    }

    /* renamed from: G */
    public final void m25840G(Function1<? super C6285c, Unit> function1) {
        this.f12887x = function1;
    }

    /* renamed from: H */
    public final void m25839H(Toolbar toolbar) {
        C9971q.m14633g(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f12882s;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.C5508f fVar = new AppBarLayout.C5508f(-1, -2);
        fVar.m28770g(0);
        toolbar.setLayoutParams(fVar);
        this.f12883t = toolbar;
    }

    /* renamed from: I */
    public final void m25838I(boolean z) {
        float f;
        if (this.f12884u != z) {
            AppBarLayout appBarLayout = this.f12882s;
            if (appBarLayout != null) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = PixelUtil.toPixelFromDIP(4.0f);
                }
                appBarLayout.setTargetElevation(f);
            }
            this.f12884u = z;
        }
    }

    /* renamed from: J */
    public final void m25837J(boolean z) {
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        if (this.f12885v != z) {
            ViewGroup.LayoutParams layoutParams = m25884q().getLayoutParams();
            C9971q.m14635e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.C2155f fVar = (CoordinatorLayout.C2155f) layoutParams;
            if (z) {
                scrollingViewBehavior = null;
            } else {
                scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
            }
            fVar.m38674o(scrollingViewBehavior);
            this.f12885v = z;
        }
    }

    public final void dismiss() {
        C6316l<?> container = m25884q().getContainer();
        if (container instanceof C6327r) {
            ((C6327r) container).m25873B(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        C9971q.m14633g(menu, "menu");
        C9971q.m14633g(inflater, "inflater");
        m25835L(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.C6319n, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C6333b bVar;
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        C9971q.m14633g(inflater, "inflater");
        Context context = getContext();
        AppBarLayout appBarLayout3 = null;
        if (context != null) {
            bVar = new C6333b(context, this);
        } else {
            bVar = null;
        }
        C6308j q = m25884q();
        CoordinatorLayout.C2155f fVar = new CoordinatorLayout.C2155f(-1, -1);
        if (this.f12885v) {
            scrollingViewBehavior = null;
        } else {
            scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
        }
        fVar.m38674o(scrollingViewBehavior);
        q.setLayoutParams(fVar);
        if (bVar != null) {
            bVar.addView(C6319n.m25882u(m25884q()));
        }
        Context context2 = getContext();
        if (context2 != null) {
            appBarLayout3 = new AppBarLayout(context2);
            appBarLayout3.setBackgroundColor(0);
            appBarLayout3.setLayoutParams(new AppBarLayout.C5508f(-1, -2));
        }
        this.f12882s = appBarLayout3;
        if (bVar != null) {
            bVar.addView(appBarLayout3);
        }
        if (this.f12884u && (appBarLayout2 = this.f12882s) != null) {
            appBarLayout2.setTargetElevation(0.0f);
        }
        Toolbar toolbar = this.f12883t;
        if (!(toolbar == null || (appBarLayout = this.f12882s) == null)) {
            appBarLayout.addView(C6319n.m25882u(toolbar));
        }
        setHasOptionsMenu(true);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        C9971q.m14633g(menu, "menu");
        m25835L(menu);
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.swmansion.rnscreens.C6319n
    /* renamed from: r */
    public void mo25834r() {
        C6336u headerConfig = m25884q().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.m25825g();
        }
    }

    @Override // com.swmansion.rnscreens.C6319n
    /* renamed from: s */
    public void mo25833s() {
        super.mo25833s();
        m25842E();
    }

    public C6331s() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
