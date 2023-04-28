package nf;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0018\u001a\u00028\u0001\u0012\u0006\u0010\u001b\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0015\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0018\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u001b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\t¨\u0006\u001e"}, m15073d2 = {"Lnf/w;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "c", "", "hashCode", "", "other", "", "equals", "k", "Ljava/lang/Object;", "d", "first", "l", "e", "second", "m", "f", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.w */
/* loaded from: classes8.dex */
public final class C11097w<A, B, C> implements Serializable {

    /* renamed from: k */
    private final A f24617k;

    /* renamed from: l */
    private final B f24618l;

    /* renamed from: m */
    private final C f24619m;

    public C11097w(A a, B b, C c) {
        this.f24617k = a;
        this.f24618l = b;
        this.f24619m = c;
    }

    /* renamed from: a */
    public final A m10927a() {
        return this.f24617k;
    }

    /* renamed from: b */
    public final B m10926b() {
        return this.f24618l;
    }

    /* renamed from: c */
    public final C m10925c() {
        return this.f24619m;
    }

    /* renamed from: d */
    public final A m10924d() {
        return this.f24617k;
    }

    /* renamed from: e */
    public final B m10923e() {
        return this.f24618l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11097w)) {
            return false;
        }
        C11097w wVar = (C11097w) obj;
        return C9971q.m14638b(this.f24617k, wVar.f24617k) && C9971q.m14638b(this.f24618l, wVar.f24618l) && C9971q.m14638b(this.f24619m, wVar.f24619m);
    }

    /* renamed from: f */
    public final C m10922f() {
        return this.f24619m;
    }

    public int hashCode() {
        A a = this.f24617k;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f24618l;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f24619m;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return '(' + this.f24617k + ", " + this.f24618l + ", " + this.f24619m + ')';
    }
}
