package bj;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1429h;
import p014aj.AbstractC1432i;
import p326ri.C12717t;

@Metadata(m15074d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0005#$%&'¨\u0006("}, m15073d2 = {"Lbj/u0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", "name", "c", "", "j", "", "", "f", "h", "", "other", "equals", "hashCode", "toString", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptor", "b", "I", "d", "()I", "elementsCount", "Laj/h;", "g", "()Laj/h;", "kind", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lbj/d;", "Lbj/e;", "Lbj/i0;", "Lbj/s0;", "Lbj/r1;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.u0 */
/* loaded from: classes8.dex */
public abstract class AbstractC3704u0 implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f6022a;

    /* renamed from: b */
    private final int f6023b;

    private AbstractC3704u0(SerialDescriptor serialDescriptor) {
        this.f6022a = serialDescriptor;
        this.f6023b = 1;
    }

    public /* synthetic */ AbstractC3704u0(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo13683b() {
        return SerialDescriptor.C10240a.m13923c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo13682c(String name) {
        Integer m;
        C9971q.m14633g(name, "name");
        m = C12717t.m5747m(name);
        if (m != null) {
            return m.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return this.f6023b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        return String.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3704u0)) {
            return false;
        }
        AbstractC3704u0 u0Var = (AbstractC3704u0) obj;
        if (!C9971q.m14638b(this.f6022a, u0Var.f6022a) || !C9971q.m14638b(mo13676i(), u0Var.mo13676i())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo13679f(int i) {
        boolean z;
        List<Annotation> i2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = C9906j.m14820i();
            return i2;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo13676i() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return AbstractC1432i.C1434b.f482a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C10240a.m13925a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f6022a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo13676i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f6022a.hashCode() * 31) + mo13676i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C10240a.m13924b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo13676i() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return mo13676i() + '(' + this.f6022a + ')';
    }
}
