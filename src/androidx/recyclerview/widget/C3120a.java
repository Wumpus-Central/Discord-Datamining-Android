package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C3120a implements AbstractC3137h {

    /* renamed from: a */
    private final RecyclerView.Adapter f4795a;

    public C3120a(RecyclerView.Adapter adapter) {
        this.f4795a = adapter;
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: a */
    public void mo35122a(int i, int i2) {
        this.f4795a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: b */
    public void mo35121b(int i, int i2) {
        this.f4795a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: c */
    public void mo35120c(int i, int i2, Object obj) {
        this.f4795a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.AbstractC3137h
    /* renamed from: d */
    public void mo35119d(int i, int i2) {
        this.f4795a.notifyItemMoved(i, i2);
    }
}
