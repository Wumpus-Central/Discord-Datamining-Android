package p267of;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, m15073d2 = {"Lof/m;", "T", "", "", "a", "b", "()Ljava/lang/Object;", "", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "index", "Ljava/lang/Object;", "d", "value", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: of.m */
/* loaded from: classes8.dex */
public final class C11280m<T> {

    /* renamed from: a */
    private final int f25203a;

    /* renamed from: b */
    private final T f25204b;

    public C11280m(int i, T t) {
        this.f25203a = i;
        this.f25204b = t;
    }

    /* renamed from: a */
    public final int m10279a() {
        return this.f25203a;
    }

    /* renamed from: b */
    public final T m10278b() {
        return this.f25204b;
    }

    /* renamed from: c */
    public final int m10277c() {
        return this.f25203a;
    }

    /* renamed from: d */
    public final T m10276d() {
        return this.f25204b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11280m)) {
            return false;
        }
        C11280m mVar = (C11280m) obj;
        return this.f25203a == mVar.f25203a && C9971q.m14638b(this.f25204b, mVar.f25204b);
    }

    public int hashCode() {
        int i = this.f25203a * 31;
        T t = this.f25204b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f25203a + ", value=" + this.f25204b + ')';
    }
}
