package eg;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.AbstractC11274g;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0016"}, m15073d2 = {"Leg/b;", "Lof/g;", "", "hasNext", "", "b", "", "k", "I", "getStep", "()I", "step", "l", "finalElement", "m", "Z", "n", "next", "first", "last", "<init>", "(CCI)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: eg.b */
/* loaded from: classes8.dex */
public final class C6873b extends AbstractC11274g {

    /* renamed from: k */
    private final int f15039k;

    /* renamed from: l */
    private final int f15040l;

    /* renamed from: m */
    private boolean f15041m;

    /* renamed from: n */
    private int f15042n;

    public C6873b(char c, char c2, int i) {
        this.f15039k = i;
        this.f15040l = c2;
        boolean z = true;
        if (i <= 0 ? C9971q.m14631i(c, c2) < 0 : C9971q.m14631i(c, c2) > 0) {
            z = false;
        }
        this.f15041m = z;
        this.f15042n = !z ? c2 : c;
    }

    @Override // p267of.AbstractC11274g
    /* renamed from: b */
    public char mo10298b() {
        int i = this.f15042n;
        if (i != this.f15040l) {
            this.f15042n = this.f15039k + i;
        } else if (this.f15041m) {
            this.f15041m = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }

    @Override // java.util.Iterator, p163j$.util.Iterator
    public boolean hasNext() {
        return this.f15041m;
    }
}
