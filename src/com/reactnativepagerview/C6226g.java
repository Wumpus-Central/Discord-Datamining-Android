package com.reactnativepagerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C3313f;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bJ\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t¨\u0006%"}, m15073d2 = {"Lcom/reactnativepagerview/g;", "", "Landroid/view/View;", "view", "", "i", "Lcom/reactnativepagerview/a;", "Landroidx/viewpager2/widget/f;", "g", "", "selectedTab", "", "scrollSmooth", "n", "host", "child", "index", "d", "parent", "f", "e", "l", "k", "m", "h", "value", "w", "", "q", "o", "s", "r", "t", ViewProps.MARGIN, "u", "<init>", "()V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.g */
/* loaded from: classes6.dex */
public final class C6226g {

    /* renamed from: a */
    public static final C6226g f12655a = new C6226g();

    private C6226g() {
    }

    /* renamed from: i */
    private final void m26086i(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.f
            @Override // java.lang.Runnable
            public final void run() {
                C6226g.m26085j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m26085j(View view) {
        C9971q.m14633g(view, "$view");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m26079p(C6220a host) {
        C9971q.m14633g(host, "$host");
        host.setDidSetInitialIndex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m26073v(int i, C3313f pager, View page, float f) {
        C9971q.m14633g(pager, "$pager");
        C9971q.m14633g(page, "page");
        float f2 = i * f;
        if (pager.getOrientation() == 0) {
            boolean z = true;
            if (pager.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                f2 = -f2;
            }
            page.setTranslationX(f2);
            return;
        }
        page.setTranslationY(f2);
    }

    /* renamed from: d */
    public final void m26091d(C6220a host, View view, int i) {
        Integer initialIndex;
        C9971q.m14633g(host, "host");
        if (view != null) {
            C3313f g = m26088g(host);
            C6227h hVar = (C6227h) g.getAdapter();
            if (hVar != null) {
                hVar.m26071a(view, i);
            }
            if (g.getCurrentItem() == i) {
                m26086i(g);
            }
            if (!host.getDidSetInitialIndex() && (initialIndex = host.getInitialIndex()) != null && initialIndex.intValue() == i) {
                host.setDidSetInitialIndex(true);
                m26081n(g, i, false);
            }
        }
    }

    /* renamed from: e */
    public final View m26090e(C6220a parent, int i) {
        C9971q.m14633g(parent, "parent");
        C6227h hVar = (C6227h) m26088g(parent).getAdapter();
        C9971q.m14636d(hVar);
        return hVar.m26070b(i);
    }

    /* renamed from: f */
    public final int m26089f(C6220a parent) {
        C9971q.m14633g(parent, "parent");
        RecyclerView.Adapter adapter = m26088g(parent).getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    /* renamed from: g */
    public final C3313f m26088g(C6220a view) {
        C9971q.m14633g(view, "view");
        if (view.getChildAt(0) instanceof C3313f) {
            View childAt = view.getChildAt(0);
            C9971q.m14635e(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            return (C3313f) childAt;
        }
        throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
    }

    /* renamed from: h */
    public final boolean m26087h() {
        return true;
    }

    /* renamed from: k */
    public final void m26084k(C6220a parent) {
        C9971q.m14633g(parent, "parent");
        C3313f g = m26088g(parent);
        g.setUserInputEnabled(false);
        C6227h hVar = (C6227h) g.getAdapter();
        if (hVar != null) {
            hVar.m26067e();
        }
    }

    /* renamed from: l */
    public final void m26083l(C6220a parent, View view) {
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(view, "view");
        C3313f g = m26088g(parent);
        C6227h hVar = (C6227h) g.getAdapter();
        if (hVar != null) {
            hVar.m26066f(view);
        }
        m26086i(g);
    }

    /* renamed from: m */
    public final void m26082m(C6220a parent, int i) {
        C9971q.m14633g(parent, "parent");
        C3313f g = m26088g(parent);
        C6227h hVar = (C6227h) g.getAdapter();
        if (hVar != null) {
            hVar.m26065g(i);
        }
        m26086i(g);
    }

    /* renamed from: n */
    public final void m26081n(C3313f view, int i, boolean z) {
        C9971q.m14633g(view, "view");
        m26086i(view);
        view.m34669j(i, z);
    }

    /* renamed from: o */
    public final void m26080o(final C6220a host, int i) {
        C9971q.m14633g(host, "host");
        C3313f g = m26088g(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(i));
            g.post(new Runnable() { // from class: com.reactnativepagerview.d
                @Override // java.lang.Runnable
                public final void run() {
                    C6226g.m26079p(C6220a.this);
                }
            });
        }
    }

    /* renamed from: q */
    public final void m26078q(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        C3313f g = m26088g(host);
        if (C9971q.m14638b(value, "rtl")) {
            g.setLayoutDirection(1);
        } else {
            g.setLayoutDirection(0);
        }
    }

    /* renamed from: r */
    public final void m26077r(C6220a host, int i) {
        C9971q.m14633g(host, "host");
        m26088g(host).setOffscreenPageLimit(i);
    }

    /* renamed from: s */
    public final void m26076s(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        m26088g(host).setOrientation(C9971q.m14638b(value, "vertical") ? 1 : 0);
    }

    /* renamed from: t */
    public final void m26075t(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        View childAt = m26088g(host).getChildAt(0);
        if (C9971q.m14638b(value, ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
            childAt.setOverScrollMode(2);
        } else if (C9971q.m14638b(value, ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    /* renamed from: u */
    public final void m26074u(C6220a host, int i) {
        C9971q.m14633g(host, "host");
        final C3313f g = m26088g(host);
        final int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(i);
        g.setPageTransformer(new C3313f.AbstractC3326k() { // from class: com.reactnativepagerview.e
            @Override // androidx.viewpager2.widget.C3313f.AbstractC3326k
            /* renamed from: a */
            public final void mo26095a(View view, float f) {
                C6226g.m26073v(pixelFromDIP, g, view, f);
            }
        });
    }

    /* renamed from: w */
    public final void m26072w(C6220a host, boolean z) {
        C9971q.m14633g(host, "host");
        m26088g(host).setUserInputEnabled(z);
    }
}
