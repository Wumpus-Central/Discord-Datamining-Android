package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p018os.C2458t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GapWorker implements Runnable {

    /* renamed from: o */
    static final ThreadLocal<GapWorker> f4576o = new ThreadLocal<>();

    /* renamed from: p */
    static Comparator<C3077b> f4577p = new C3076a();

    /* renamed from: l */
    long f4579l;

    /* renamed from: m */
    long f4580m;

    /* renamed from: k */
    ArrayList<RecyclerView> f4578k = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<C3077b> f4581n = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.AbstractC3096c {

        /* renamed from: a */
        int f4582a;

        /* renamed from: b */
        int f4583b;

        /* renamed from: c */
        int[] f4584c;

        /* renamed from: d */
        int f4585d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.AbstractC3096c
        /* renamed from: a */
        public void mo35418a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4585d * 2;
                int[] iArr = this.f4584c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4584c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.f4584c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4584c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f4585d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m35637b() {
            int[] iArr = this.f4584c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4585d = 0;
        }

        /* renamed from: c */
        void m35636c(RecyclerView recyclerView, boolean z) {
            this.f4585d = 0;
            int[] iArr = this.f4584c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.m35512B0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.m35687p()) {
                        layoutManager.mo35515A(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.mo35245z(this.f4582a, this.f4583b, recyclerView.mState, this);
                }
                int i = this.f4585d;
                if (i > layoutManager.f4684w) {
                    layoutManager.f4684w = i;
                    layoutManager.f4685x = z;
                    recyclerView.mRecycler.m35394K();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m35635d(int i) {
            if (this.f4584c != null) {
                int i2 = this.f4585d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4584c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m35634e(int i, int i2) {
            this.f4582a = i;
            this.f4583b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GapWorker$a */
    /* loaded from: classes.dex */
    class C3076a implements Comparator<C3077b> {
        C3076a() {
        }

        /* renamed from: b */
        public int compare(C3077b bVar, C3077b bVar2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = bVar.f4589d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar2.f4589d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                boolean z3 = bVar.f4586a;
                if (z3 == bVar2.f4586a) {
                    int i = bVar2.f4587b - bVar.f4587b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = bVar.f4588c - bVar2.f4588c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.GapWorker$b */
    /* loaded from: classes.dex */
    public static class C3077b {

        /* renamed from: a */
        public boolean f4586a;

        /* renamed from: b */
        public int f4587b;

        /* renamed from: c */
        public int f4588c;

        /* renamed from: d */
        public RecyclerView f4589d;

        /* renamed from: e */
        public int f4590e;

        C3077b() {
        }

        /* renamed from: a */
        public void m35632a() {
            this.f4586a = false;
            this.f4587b = 0;
            this.f4588c = 0;
            this.f4589d = null;
            this.f4590e = 0;
        }
    }

    /* renamed from: b */
    private void m35646b() {
        C3077b bVar;
        boolean z;
        int size = this.f4578k.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4578k.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m35636c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4585d;
            }
        }
        this.f4581n.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4578k.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.f4582a) + Math.abs(layoutPrefetchRegistryImpl.f4583b);
                for (int i5 = 0; i5 < layoutPrefetchRegistryImpl.f4585d * 2; i5 += 2) {
                    if (i3 >= this.f4581n.size()) {
                        bVar = new C3077b();
                        this.f4581n.add(bVar);
                    } else {
                        bVar = this.f4581n.get(i3);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f4584c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f4586a = z;
                    bVar.f4587b = abs;
                    bVar.f4588c = i6;
                    bVar.f4589d = recyclerView2;
                    bVar.f4590e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4581n, f4577p);
    }

    /* renamed from: c */
    private void m35645c(C3077b bVar, long j) {
        long j2;
        if (bVar.f4586a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.ViewHolder i = m35639i(bVar.f4589d, bVar.f4590e, j2);
        if (i != null && i.mNestedRecyclerView != null && i.isBound() && !i.isInvalid()) {
            m35640h(i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    private void m35644d(long j) {
        for (int i = 0; i < this.f4581n.size(); i++) {
            C3077b bVar = this.f4581n.get(i);
            if (bVar.f4589d != null) {
                m35645c(bVar, j);
                bVar.m35632a();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m35643e(RecyclerView recyclerView, int i) {
        int j = recyclerView.mChildHelper.m35666j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m35667i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m35640h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m35666j() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
            layoutPrefetchRegistryImpl.m35636c(recyclerView, true);
            if (layoutPrefetchRegistryImpl.f4585d != 0) {
                try {
                    C2458t.m37717a("RV Nested Prefetch");
                    recyclerView.mState.m35348f(recyclerView.mAdapter);
                    for (int i = 0; i < layoutPrefetchRegistryImpl.f4585d * 2; i += 2) {
                        m35639i(recyclerView, layoutPrefetchRegistryImpl.f4584c[i], j);
                    }
                } finally {
                    C2458t.m37716b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.ViewHolder m35639i(RecyclerView recyclerView, int i, long j) {
        if (m35643e(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder I = recycler.m35396I(i, false, j);
            if (I != null) {
                if (!I.isBound() || I.isInvalid()) {
                    recycler.m35391a(I, false);
                } else {
                    recycler.m35403B(I.itemView);
                }
            }
            return I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m35647a(RecyclerView recyclerView) {
        this.f4578k.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m35642f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4579l == 0) {
            this.f4579l = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m35634e(i, i2);
    }

    /* renamed from: g */
    void m35641g(long j) {
        m35646b();
        m35644d(j);
    }

    /* renamed from: j */
    public void m35638j(RecyclerView recyclerView) {
        this.f4578k.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C2458t.m37717a("RV Prefetch");
            if (!this.f4578k.isEmpty()) {
                int size = this.f4578k.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4578k.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m35641g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4580m);
                }
            }
        } finally {
            this.f4579l = 0L;
            C2458t.m37716b();
        }
    }
}
