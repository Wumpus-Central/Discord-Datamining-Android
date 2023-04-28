package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p085ef.AbstractC6841h;
import p085ef.C6832d;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u0014\u0010\b\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0006J\u001a\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R$\u0010\u001b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00110\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001e"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/h;", "Lef/h;", "", "viewTag", "Lef/d;", "handler", "", "k", "d", "j", "handlerTag", "h", "actionType", "", "c", "g", "f", "Ljava/util/ArrayList;", "i", "Landroid/view/View;", "view", "a", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "handlers", "b", "attachedTo", "handlersForView", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.h */
/* loaded from: classes8.dex */
public final class C6257h implements AbstractC6841h {

    /* renamed from: a */
    private final SparseArray<C6832d<?>> f12707a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f12708b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C6832d<?>>> f12709c = new SparseArray<>();

    /* renamed from: d */
    private final synchronized void m26000d(final C6832d<?> dVar) {
        Integer num = this.f12708b.get(dVar.m24225P());
        if (num != null) {
            this.f12708b.remove(dVar.m24225P());
            ArrayList<C6832d<?>> arrayList = this.f12709c.get(num.intValue());
            if (arrayList != null) {
                synchronized (arrayList) {
                    arrayList.remove(dVar);
                }
                if (arrayList.size() == 0) {
                    this.f12709c.remove(num.intValue());
                }
            }
        }
        if (dVar.m24222S() != null) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.g
                @Override // java.lang.Runnable
                public final void run() {
                    C6257h.m25999e(C6832d.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m25999e(C6832d handler) {
        C9971q.m14633g(handler, "$handler");
        handler.m24192p();
    }

    /* renamed from: k */
    private final synchronized void m25993k(int i, C6832d<?> dVar) {
        boolean z;
        if (this.f12708b.get(dVar.m24225P()) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f12708b.put(dVar.m24225P(), Integer.valueOf(i));
            ArrayList<C6832d<?>> arrayList = this.f12709c.get(i);
            if (arrayList == null) {
                ArrayList<C6832d<?>> arrayList2 = new ArrayList<>(1);
                arrayList2.add(dVar);
                this.f12709c.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(dVar);
                }
            }
        } else {
            throw new IllegalStateException(("Handler " + dVar + " already attached").toString());
        }
    }

    @Override // p085ef.AbstractC6841h
    /* renamed from: a */
    public synchronized ArrayList<C6832d<?>> mo24113a(View view) {
        C9971q.m14633g(view, "view");
        return m25995i(view.getId());
    }

    /* renamed from: c */
    public final synchronized boolean m26001c(int i, int i2, int i3) {
        boolean z;
        C6832d<?> dVar = this.f12707a.get(i);
        if (dVar != null) {
            m26000d(dVar);
            dVar.m24195n0(i3);
            m25993k(i2, dVar);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final synchronized void m25998f() {
        this.f12707a.clear();
        this.f12708b.clear();
        this.f12709c.clear();
    }

    /* renamed from: g */
    public final synchronized void m25997g(int i) {
        C6832d<?> dVar = this.f12707a.get(i);
        if (dVar != null) {
            m26000d(dVar);
            this.f12707a.remove(i);
        }
    }

    /* renamed from: h */
    public final synchronized C6832d<?> m25996h(int i) {
        return this.f12707a.get(i);
    }

    /* renamed from: i */
    public final synchronized ArrayList<C6832d<?>> m25995i(int i) {
        return this.f12709c.get(i);
    }

    /* renamed from: j */
    public final synchronized void m25994j(C6832d<?> handler) {
        C9971q.m14633g(handler, "handler");
        this.f12707a.put(handler.m24225P(), handler);
    }
}
