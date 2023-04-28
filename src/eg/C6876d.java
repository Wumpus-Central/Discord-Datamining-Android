package eg;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import p267of.AbstractC11283p;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0015"}, m15073d2 = {"Leg/d;", "Lof/p;", "", "hasNext", "", "nextInt", "k", "I", "getStep", "()I", "step", "l", "finalElement", "m", "Z", "n", "next", "first", "last", "<init>", "(III)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.d */
/* loaded from: classes8.dex */
public final class C6876d extends AbstractC11283p {

    /* renamed from: k */
    private final int f15045k;

    /* renamed from: l */
    private final int f15046l;

    /* renamed from: m */
    private boolean f15047m;

    /* renamed from: n */
    private int f15048n;

    public C6876d(int i, int i2, int i3) {
        this.f15045k = i3;
        this.f15046l = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f15047m = z;
        this.f15048n = !z ? i2 : i;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public boolean hasNext() {
        return this.f15047m;
    }

    @Override // p267of.AbstractC11283p
    public int nextInt() {
        int i = this.f15048n;
        if (i != this.f15046l) {
            this.f15048n = this.f15045k + i;
        } else if (this.f15047m) {
            this.f15047m = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}
