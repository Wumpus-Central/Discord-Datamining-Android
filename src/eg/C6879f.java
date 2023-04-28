package eg;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import p267of.AbstractC11284q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0015"}, m15073d2 = {"Leg/f;", "Lof/q;", "", "hasNext", "", "nextLong", "k", "J", "getStep", "()J", "step", "l", "finalElement", "m", "Z", "n", "next", "first", "last", "<init>", "(JJJ)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.f */
/* loaded from: classes8.dex */
public final class C6879f extends AbstractC11284q {

    /* renamed from: k */
    private final long f15053k;

    /* renamed from: l */
    private final long f15054l;

    /* renamed from: m */
    private boolean f15055m;

    /* renamed from: n */
    private long f15056n;

    public C6879f(long j, long j2, long j3) {
        this.f15053k = j3;
        this.f15054l = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f15055m = z;
        this.f15056n = !z ? j2 : j;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public boolean hasNext() {
        return this.f15055m;
    }

    @Override // p267of.AbstractC11284q
    public long nextLong() {
        long j = this.f15056n;
        if (j != this.f15054l) {
            this.f15056n = this.f15053k + j;
        } else if (this.f15055m) {
            this.f15055m = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }
}
