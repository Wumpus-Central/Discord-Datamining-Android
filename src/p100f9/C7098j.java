package p100f9;

import com.google.android.exoplayer2.upstream.cache.AbstractC5293a;
import com.google.android.exoplayer2.upstream.cache.AbstractC5299d;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: f9.j */
/* loaded from: classes5.dex */
public final class C7098j implements AbstractC5299d {

    /* renamed from: a */
    private final long f15482a;

    /* renamed from: b */
    private final TreeSet<C7092d> f15483b = new TreeSet<>(new Comparator() { // from class: f9.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int h;
            h = C7098j.m23403h((C7092d) obj, (C7092d) obj2);
            return h;
        }
    });

    /* renamed from: c */
    private long f15484c;

    public C7098j(long j) {
        this.f15482a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m23403h(C7092d dVar, C7092d dVar2) {
        long j = dVar.f15476p;
        long j2 = dVar2.f15476p;
        if (j - j2 == 0) {
            return dVar.compareTo(dVar2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: i */
    private void m23402i(AbstractC5293a aVar, long j) {
        while (this.f15484c + j > this.f15482a && !this.f15483b.isEmpty()) {
            aVar.mo29580e(this.f15483b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a.AbstractC5294b
    /* renamed from: a */
    public void mo23410a(AbstractC5293a aVar, C7092d dVar, C7092d dVar2) {
        mo23409b(aVar, dVar);
        mo23407d(aVar, dVar2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a.AbstractC5294b
    /* renamed from: b */
    public void mo23409b(AbstractC5293a aVar, C7092d dVar) {
        this.f15483b.remove(dVar);
        this.f15484c -= dVar.f15473m;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5299d
    /* renamed from: c */
    public boolean mo23408c() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5293a.AbstractC5294b
    /* renamed from: d */
    public void mo23407d(AbstractC5293a aVar, C7092d dVar) {
        this.f15483b.add(dVar);
        this.f15484c += dVar.f15473m;
        m23402i(aVar, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5299d
    /* renamed from: e */
    public void mo23406e(AbstractC5293a aVar, String str, long j, long j2) {
        if (j2 != -1) {
            m23402i(aVar, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.AbstractC5299d
    /* renamed from: f */
    public void mo23405f() {
    }
}
