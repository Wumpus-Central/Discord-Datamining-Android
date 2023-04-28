package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.hannesdorfmann.adapterdelegates4.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5876a<T> extends RecyclerView.Adapter {
    protected AdapterDelegatesManager<T> delegatesManager;
    protected T items;

    public AbstractC5876a() {
        this(new AdapterDelegatesManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.delegatesManager.m26996e(this.items, i);
    }

    public T getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.delegatesManager.m26994g(this.items, i, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.delegatesManager.m26993h(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.delegatesManager.m26992i(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26991j(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26990k(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26989l(viewHolder);
    }

    public void setItems(T t) {
        this.items = t;
    }

    public AbstractC5876a(AdapterDelegatesManager<T> adapterDelegatesManager) {
        if (adapterDelegatesManager != null) {
            this.delegatesManager = adapterDelegatesManager;
            return;
        }
        throw new NullPointerException("AdapterDelegatesManager is null");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        this.delegatesManager.m26994g(this.items, i, viewHolder, list);
    }

    public AbstractC5876a(AdapterDelegate<T>... adapterDelegateArr) {
        this(new AdapterDelegatesManager(adapterDelegateArr));
    }
}
