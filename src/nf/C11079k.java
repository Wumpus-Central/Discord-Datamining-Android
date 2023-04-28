package nf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u001d"}, m15073d2 = {"Lnf/k;", "", "", "major", "minor", "patch", "b", "", "toString", "", "other", "", "equals", "hashCode", "a", "k", "I", "getMajor", "()I", "l", "getMinor", "m", "getPatch", "n", "version", "<init>", "(III)V", "(II)V", "o", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.k */
/* loaded from: classes8.dex */
public final class C11079k implements Comparable<C11079k> {

    /* renamed from: o */
    public static final C11080a f24594o = new C11080a(null);

    /* renamed from: p */
    public static final C11079k f24595p = C11082l.m10949a();

    /* renamed from: k */
    private final int f24596k;

    /* renamed from: l */
    private final int f24597l;

    /* renamed from: m */
    private final int f24598m;

    /* renamed from: n */
    private final int f24599n;

    @Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m15073d2 = {"Lnf/k$a;", "", "Lnf/k;", "CURRENT", "Lnf/k;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.k$a */
    /* loaded from: classes8.dex */
    public static final class C11080a {
        private C11080a() {
        }

        public /* synthetic */ C11080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11079k(int i, int i2, int i3) {
        this.f24596k = i;
        this.f24597l = i2;
        this.f24598m = i3;
        this.f24599n = m10954b(i, i2, i3);
    }

    /* renamed from: b */
    private final int m10954b(int i, int i2, int i3) {
        boolean z = false;
        if (new IntRange(0, 255).contains(i) && new IntRange(0, 255).contains(i2) && new IntRange(0, 255).contains(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* renamed from: a */
    public int compareTo(C11079k other) {
        C9971q.m14633g(other, "other");
        return this.f24599n - other.f24599n;
    }

    public boolean equals(Object obj) {
        C11079k kVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11079k) {
            kVar = (C11079k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null && this.f24599n == kVar.f24599n) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f24599n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24596k);
        sb2.append('.');
        sb2.append(this.f24597l);
        sb2.append('.');
        sb2.append(this.f24598m);
        return sb2.toString();
    }

    public C11079k(int i, int i2) {
        this(i, i2, 0);
    }
}
