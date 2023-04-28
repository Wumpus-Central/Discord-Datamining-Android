package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.th3rdwave.safeareacontext.d */
/* loaded from: classes8.dex */
public class ViewTreeObserver$OnPreDrawListenerC6352d extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: k */
    private EnumC6356g f12954k = EnumC6356g.PADDING;

    /* renamed from: l */
    private EdgeInsets f12955l;

    /* renamed from: m */
    private EnumSet<EnumC6354e> f12956m;

    /* renamed from: n */
    private View f12957n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.th3rdwave.safeareacontext.d$a */
    /* loaded from: classes8.dex */
    public class RunnableC6353a implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AtomicBoolean f12958k;

        RunnableC6353a(AtomicBoolean atomicBoolean) {
            this.f12958k = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f12958k) {
                if (this.f12958k.compareAndSet(false, true)) {
                    this.f12958k.notify();
                }
            }
        }
    }

    public ViewTreeObserver$OnPreDrawListenerC6352d(Context context) {
        super(context);
    }

    /* renamed from: a */
    private View m25778a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof SafeAreaProvider) {
                return (View) parent;
            }
        }
        return this;
    }

    /* renamed from: b */
    private static ReactContext m25777b(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    /* renamed from: c */
    private boolean m25776c() {
        EdgeInsets c;
        EdgeInsets edgeInsets;
        View view = this.f12957n;
        if (view == null || (c = C6351c.m25779c(view)) == null || ((edgeInsets = this.f12955l) != null && edgeInsets.m25784a(c))) {
            return false;
        }
        this.f12955l = c;
        m25775d();
        return true;
    }

    /* renamed from: d */
    private void m25775d() {
        if (this.f12955l != null) {
            EnumSet<EnumC6354e> enumSet = this.f12956m;
            if (enumSet == null) {
                enumSet = EnumSet.allOf(EnumC6354e.class);
            }
            C6355f fVar = new C6355f(this.f12955l, this.f12954k, enumSet);
            UIManagerModule uIManagerModule = (UIManagerModule) m25777b(this).getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), fVar);
                m25774e();
            }
        }
    }

    /* renamed from: e */
    private void m25774e() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long nanoTime = System.nanoTime();
        m25777b(this).runOnNativeModulesQueueThread(new RunnableC6353a(atomicBoolean));
        synchronized (atomicBoolean) {
            long j = 0;
            while (!atomicBoolean.get() && j < 500000000) {
                try {
                    atomicBoolean.wait(500L);
                } catch (InterruptedException unused) {
                    atomicBoolean.set(true);
                }
                j += System.nanoTime() - nanoTime;
            }
            if (j >= 500000000) {
                Log.w("SafeAreaView", "Timed out waiting for layout.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View a = m25778a();
        this.f12957n = a;
        a.getViewTreeObserver().addOnPreDrawListener(this);
        m25776c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.f12957n;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f12957n = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean c = m25776c();
        if (c) {
            requestLayout();
        }
        return !c;
    }

    public void setEdges(EnumSet<EnumC6354e> enumSet) {
        this.f12956m = enumSet;
        m25775d();
    }

    public void setMode(EnumC6356g gVar) {
        this.f12954k = gVar;
        m25775d();
    }
}
