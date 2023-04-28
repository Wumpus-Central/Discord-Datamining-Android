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

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0001\u0002)*¨\u0006+"}, m15073d2 = {"Lbj/y0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "e", "name", "c", "", "j", "", "", "f", "h", "", "other", "equals", "hashCode", "toString", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeyDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "keyDescriptor", "getValueDescriptor", "valueDescriptor", "d", "I", "()I", "elementsCount", "Laj/h;", "g", "()Laj/h;", "kind", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lbj/g0;", "Lbj/q0;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.y0 */
/* loaded from: classes8.dex */
public abstract class AbstractC3718y0 implements SerialDescriptor {

    /* renamed from: a */
    private final String f6047a;

    /* renamed from: b */
    private final SerialDescriptor f6048b;

    /* renamed from: c */
    private final SerialDescriptor f6049c;

    /* renamed from: d */
    private final int f6050d;

    private AbstractC3718y0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f6047a = str;
        this.f6048b = serialDescriptor;
        this.f6049c = serialDescriptor2;
        this.f6050d = 2;
    }

    public /* synthetic */ AbstractC3718y0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return this.f6050d;
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
        if (!(obj instanceof AbstractC3718y0)) {
            return false;
        }
        AbstractC3718y0 y0Var = (AbstractC3718y0) obj;
        if (C9971q.m14638b(mo13676i(), y0Var.mo13676i()) && C9971q.m14638b(this.f6048b, y0Var.f6048b) && C9971q.m14638b(this.f6049c, y0Var.f6049c)) {
            return true;
        }
        return false;
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
        return AbstractC1432i.C1435c.f483a;
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
            int i2 = i % 2;
            if (i2 == 0) {
                return this.f6048b;
            }
            if (i2 == 1) {
                return this.f6049c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo13676i() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((mo13676i().hashCode() * 31) + this.f6048b.hashCode()) * 31) + this.f6049c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f6047a;
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
        return mo13676i() + '(' + this.f6048b + ", " + this.f6049c + ')';
    }
}
