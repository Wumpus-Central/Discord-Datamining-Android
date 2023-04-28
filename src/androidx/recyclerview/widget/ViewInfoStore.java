package androidx.recyclerview.widget;

import androidx.collection.C2098d;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.AbstractC2516f;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ViewInfoStore {

    /* renamed from: a */
    final SimpleArrayMap<RecyclerView.ViewHolder, C3119a> f4789a = new SimpleArrayMap<>();

    /* renamed from: b */
    final C2098d<RecyclerView.ViewHolder> f4790b = new C2098d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface ProcessCallback {
        /* renamed from: a */
        void mo35177a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        void mo35176b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo35175c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        void mo35174d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ViewInfoStore$a */
    /* loaded from: classes.dex */
    public static class C3119a {

        /* renamed from: d */
        static AbstractC2516f<C3119a> f4791d = new Pools$SimplePool(20);

        /* renamed from: a */
        int f4792a;

        /* renamed from: b */
        RecyclerView.ItemAnimator.ItemHolderInfo f4793b;

        /* renamed from: c */
        RecyclerView.ItemAnimator.ItemHolderInfo f4794c;

        private C3119a() {
        }

        /* renamed from: a */
        static void m35173a() {
            do {
            } while (f4791d.acquire() != null);
        }

        /* renamed from: b */
        static C3119a m35172b() {
            C3119a acquire = f4791d.acquire();
            if (acquire == null) {
                return new C3119a();
            }
            return acquire;
        }

        /* renamed from: c */
        static void m35171c(C3119a aVar) {
            aVar.f4792a = 0;
            aVar.f4793b = null;
            aVar.f4794c = null;
            f4791d.release(aVar);
        }
    }

    /* renamed from: l */
    private RecyclerView.ItemAnimator.ItemHolderInfo m35183l(RecyclerView.ViewHolder viewHolder, int i) {
        C3119a n;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int g = this.f4789a.m39055g(viewHolder);
        if (g >= 0 && (n = this.f4789a.m39048n(g)) != null) {
            int i2 = n.f4792a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                n.f4792a = i3;
                if (i == 4) {
                    itemHolderInfo = n.f4793b;
                } else if (i == 8) {
                    itemHolderInfo = n.f4794c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4789a.m39050l(g);
                    C3119a.m35171c(n);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35194a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null) {
            aVar = C3119a.m35172b();
            this.f4789a.put(viewHolder, aVar);
        }
        aVar.f4792a |= 2;
        aVar.f4793b = itemHolderInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35193b(RecyclerView.ViewHolder viewHolder) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null) {
            aVar = C3119a.m35172b();
            this.f4789a.put(viewHolder, aVar);
        }
        aVar.f4792a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35192c(long j, RecyclerView.ViewHolder viewHolder) {
        this.f4790b.m39011m(j, viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35191d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null) {
            aVar = C3119a.m35172b();
            this.f4789a.put(viewHolder, aVar);
        }
        aVar.f4794c = itemHolderInfo;
        aVar.f4792a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35190e(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null) {
            aVar = C3119a.m35172b();
            this.f4789a.put(viewHolder, aVar);
        }
        aVar.f4793b = itemHolderInfo;
        aVar.f4792a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35189f() {
        this.f4789a.clear();
        this.f4790b.m39019c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.ViewHolder m35188g(long j) {
        return this.f4790b.m39015h(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m35187h(RecyclerView.ViewHolder viewHolder) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null || (aVar.f4792a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m35186i(RecyclerView.ViewHolder viewHolder) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar == null || (aVar.f4792a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35185j() {
        C3119a.m35173a();
    }

    /* renamed from: k */
    public void m35184k(RecyclerView.ViewHolder viewHolder) {
        m35179p(viewHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.ItemAnimator.ItemHolderInfo m35182m(RecyclerView.ViewHolder viewHolder) {
        return m35183l(viewHolder, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.ItemAnimator.ItemHolderInfo m35181n(RecyclerView.ViewHolder viewHolder) {
        return m35183l(viewHolder, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35180o(ProcessCallback processCallback) {
        for (int size = this.f4789a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder j = this.f4789a.m39052j(size);
            C3119a l = this.f4789a.m39050l(size);
            int i = l.f4792a;
            if ((i & 3) == 3) {
                processCallback.mo35176b(j);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = l.f4793b;
                if (itemHolderInfo == null) {
                    processCallback.mo35176b(j);
                } else {
                    processCallback.mo35175c(j, itemHolderInfo, l.f4794c);
                }
            } else if ((i & 14) == 14) {
                processCallback.mo35177a(j, l.f4793b, l.f4794c);
            } else if ((i & 12) == 12) {
                processCallback.mo35174d(j, l.f4793b, l.f4794c);
            } else if ((i & 4) != 0) {
                processCallback.mo35175c(j, l.f4793b, null);
            } else if ((i & 8) != 0) {
                processCallback.mo35177a(j, l.f4793b, l.f4794c);
            }
            C3119a.m35171c(l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35179p(RecyclerView.ViewHolder viewHolder) {
        C3119a aVar = this.f4789a.get(viewHolder);
        if (aVar != null) {
            aVar.f4792a &= -2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m35178q(RecyclerView.ViewHolder viewHolder) {
        int q = this.f4790b.m39008q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (viewHolder == this.f4790b.m39007r(q)) {
                this.f4790b.m39009o(q);
                break;
            } else {
                q--;
            }
        }
        C3119a remove = this.f4789a.remove(viewHolder);
        if (remove != null) {
            C3119a.m35171c(remove);
        }
    }
}
