package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AdapterDelegate<T> {
    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isForViewType(T t, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onBindViewHolder(T t, int i, RecyclerView.ViewHolder viewHolder, List<Object> list);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
    }
}
