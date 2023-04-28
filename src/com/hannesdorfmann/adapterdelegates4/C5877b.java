package com.hannesdorfmann.adapterdelegates4;

import java.util.List;

/* renamed from: com.hannesdorfmann.adapterdelegates4.b */
/* loaded from: classes3.dex */
public class C5877b<T extends List<?>> extends AbstractC5876a<T> {
    public C5877b() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        T t = this.items;
        if (t == 0) {
            return 0;
        }
        return ((List) t).size();
    }

    public C5877b(AdapterDelegatesManager<T> adapterDelegatesManager) {
        super(adapterDelegatesManager);
    }

    public C5877b(AdapterDelegate<T>... adapterDelegateArr) {
        super(adapterDelegateArr);
    }
}
