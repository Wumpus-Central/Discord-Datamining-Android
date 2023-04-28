package p326ri;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lri/f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "Lkotlin/ranges/IntRange;", "b", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ri.f */
/* loaded from: classes8.dex */
public final class C12698f {

    /* renamed from: a */
    private final String f28554a;

    /* renamed from: b */
    private final IntRange f28555b;

    public C12698f(String value, IntRange range) {
        C9971q.m14633g(value, "value");
        C9971q.m14633g(range, "range");
        this.f28554a = value;
        this.f28555b = range;
    }

    /* renamed from: a */
    public final String m5843a() {
        return this.f28554a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12698f)) {
            return false;
        }
        C12698f fVar = (C12698f) obj;
        return C9971q.m14638b(this.f28554a, fVar.f28554a) && C9971q.m14638b(this.f28555b, fVar.f28555b);
    }

    public int hashCode() {
        return (this.f28554a.hashCode() * 31) + this.f28555b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f28554a + ", range=" + this.f28555b + ')';
    }
}
