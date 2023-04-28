package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import net.time4j.base.C10813c;
import p143hj.AbstractC8067j0;
import p143hj.AbstractC8071l0;
import p271oj.EnumC11413f;

/* renamed from: net.time4j.y */
/* loaded from: classes8.dex */
public final class C11040y<U> implements AbstractC8071l0<U>, Comparable<C11040y<U>>, Serializable {

    /* renamed from: n */
    private static final C11040y<TimeUnit> f24534n;

    /* renamed from: o */
    private static final C11040y<EnumC10974n0> f24535o;

    /* renamed from: p */
    public static final AbstractC8067j0<TimeUnit, C11040y<TimeUnit>> f24536p;

    /* renamed from: q */
    public static final AbstractC8067j0<TimeUnit, C11040y<EnumC10974n0>> f24537q;
    private static final long serialVersionUID = -4150291820807606229L;

    /* renamed from: k */
    private final transient long f24538k;

    /* renamed from: l */
    private final transient int f24539l;

    /* renamed from: m */
    private final transient EnumC11413f f24540m;

    /* renamed from: net.time4j.y$b */
    /* loaded from: classes8.dex */
    private static class C11042b<U> implements AbstractC8067j0<TimeUnit, C11040y<U>> {

        /* renamed from: k */
        private final EnumC11413f f24541k;

        private C11042b(EnumC11413f fVar) {
            this.f24541k = fVar;
        }
    }

    static {
        EnumC11413f fVar = EnumC11413f.POSIX;
        f24534n = new C11040y<>(0L, 0, fVar);
        EnumC11413f fVar2 = EnumC11413f.UTC;
        f24535o = new C11040y<>(0L, 0, fVar2);
        f24536p = new C11042b(fVar);
        f24537q = new C11042b(fVar2);
    }

    private C11040y(long j, int i, EnumC11413f fVar) {
        while (i < 0) {
            i += 1000000000;
            j = C10813c.m12190m(j, 1L);
        }
        while (i >= 1000000000) {
            i -= 1000000000;
            j = C10813c.m12197f(j, 1L);
        }
        if (j < 0 && i > 0) {
            j++;
            i -= 1000000000;
        }
        this.f24538k = j;
        this.f24539l = i;
        this.f24540m = fVar;
    }

    /* renamed from: c */
    private void m11152c(StringBuilder sb2) {
        if (m11148g()) {
            sb2.append('-');
            sb2.append(Math.abs(this.f24538k));
        } else {
            sb2.append(this.f24538k);
        }
        if (this.f24539l != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(Math.abs(this.f24539l));
            for (int length = 9 - valueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(valueOf);
        }
    }

    /* renamed from: h */
    public static C11040y<TimeUnit> m11147h(long j, int i) {
        if (j == 0 && i == 0) {
            return f24534n;
        }
        return new C11040y<>(j, i, EnumC11413f.POSIX);
    }

    /* renamed from: i */
    public static C11040y<EnumC10974n0> m11146i(long j, int i) {
        if (j == 0 && i == 0) {
            return f24535o;
        }
        return new C11040y<>(j, i, EnumC11413f.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    /* renamed from: b */
    public int compareTo(C11040y<U> yVar) {
        if (this.f24540m == yVar.f24540m) {
            long j = this.f24538k;
            long j2 = yVar.f24538k;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f24539l - yVar.f24539l;
        }
        throw new ClassCastException("Different time scales.");
    }

    /* renamed from: d */
    public int m11151d() {
        int i = this.f24539l;
        return i < 0 ? i + 1000000000 : i;
    }

    /* renamed from: e */
    public EnumC11413f m11150e() {
        return this.f24540m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11040y)) {
            return false;
        }
        C11040y yVar = (C11040y) obj;
        if (this.f24538k == yVar.f24538k && this.f24539l == yVar.f24539l && this.f24540m == yVar.f24540m) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long m11149f() {
        long j = this.f24538k;
        if (this.f24539l < 0) {
            return j - 1;
        }
        return j;
    }

    /* renamed from: g */
    public boolean m11148g() {
        return this.f24538k < 0 || this.f24539l < 0;
    }

    public int hashCode() {
        long j = this.f24538k;
        return ((((161 + ((int) (j ^ (j >>> 32)))) * 23) + this.f24539l) * 23) + this.f24540m.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        m11152c(sb2);
        sb2.append("s [");
        sb2.append(this.f24540m.name());
        sb2.append(']');
        return sb2.toString();
    }
}
