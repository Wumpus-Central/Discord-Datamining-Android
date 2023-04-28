package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class AdapterDelegatesManager<T> {

    /* renamed from: c */
    private static final List<Object> f11685c = Collections.emptyList();

    /* renamed from: a */
    protected SparseArrayCompat<AdapterDelegate<T>> f11686a = new SparseArrayCompat<>();

    /* renamed from: b */
    protected AdapterDelegate<T> f11687b;

    public AdapterDelegatesManager() {
    }

    /* renamed from: a */
    public AdapterDelegatesManager<T> m27000a(int i, AdapterDelegate<T> adapterDelegate) {
        return m26999b(i, false, adapterDelegate);
    }

    /* renamed from: b */
    public AdapterDelegatesManager<T> m26999b(int i, boolean z, AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        } else if (i == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (z || this.f11686a.m39043f(i) == null) {
            this.f11686a.m39039l(i, adapterDelegate);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + i + ". Already registered AdapterDelegate is " + this.f11686a.m39043f(i));
        }
    }

    /* renamed from: c */
    public AdapterDelegatesManager<T> m26998c(AdapterDelegate<T> adapterDelegate) {
        int m = this.f11686a.m39038m();
        while (this.f11686a.m39043f(m) != null) {
            m++;
            if (m == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return m26999b(m, false, adapterDelegate);
    }

    /* renamed from: d */
    public AdapterDelegate<T> m26997d(int i) {
        return this.f11686a.m39042h(i, this.f11687b);
    }

    /* renamed from: e */
    public int m26996e(T t, int i) {
        String str;
        if (t != null) {
            int m = this.f11686a.m39038m();
            for (int i2 = 0; i2 < m; i2++) {
                if (this.f11686a.m39037n(i2).isForViewType(t, i)) {
                    return this.f11686a.m39040k(i2);
                }
            }
            if (this.f11687b != null) {
                return 2147483646;
            }
            if (t instanceof List) {
                str = "No AdapterDelegate added that matches item=" + ((List) t).get(i).toString() + " at position=" + i + " in data source";
            } else {
                str = "No AdapterDelegate added for item at position=" + i + ". items=" + t;
            }
            throw new NullPointerException(str);
        }
        throw new NullPointerException("Items datasource is null!");
    }

    /* renamed from: f */
    public int m26995f(AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate != null) {
            int j = this.f11686a.m39041j(adapterDelegate);
            if (j == -1) {
                return -1;
            }
            return this.f11686a.m39040k(j);
        }
        throw new NullPointerException("Delegate is null");
    }

    /* renamed from: g */
    public void m26994g(T t, int i, RecyclerView.ViewHolder viewHolder, List list) {
        AdapterDelegate<T> d = m26997d(viewHolder.getItemViewType());
        if (d != null) {
            if (list == null) {
                list = f11685c;
            }
            d.onBindViewHolder(t, i, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: h */
    public RecyclerView.ViewHolder m26993h(ViewGroup viewGroup, int i) {
        AdapterDelegate<T> d = m26997d(i);
        if (d != null) {
            RecyclerView.ViewHolder onCreateViewHolder = d.onCreateViewHolder(viewGroup);
            if (onCreateViewHolder != null) {
                return onCreateViewHolder;
            }
            throw new NullPointerException("ViewHolder returned from AdapterDelegate " + d + " for ViewType =" + i + " is null!");
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType " + i);
    }

    /* renamed from: i */
    public boolean m26992i(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> d = m26997d(viewHolder.getItemViewType());
        if (d != null) {
            return d.onFailedToRecycleView(viewHolder);
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: j */
    public void m26991j(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> d = m26997d(viewHolder.getItemViewType());
        if (d != null) {
            d.onViewAttachedToWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: k */
    public void m26990k(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> d = m26997d(viewHolder.getItemViewType());
        if (d != null) {
            d.onViewDetachedFromWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: l */
    public void m26989l(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> d = m26997d(viewHolder.getItemViewType());
        if (d != null) {
            d.onViewRecycled(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public AdapterDelegatesManager(AdapterDelegate<T>... adapterDelegateArr) {
        for (AdapterDelegate<T> adapterDelegate : adapterDelegateArr) {
            m26998c(adapterDelegate);
        }
    }
}
