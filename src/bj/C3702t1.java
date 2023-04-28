package bj;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nf.C11075i;
import p014aj.AbstractC1413e;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m15073d2 = {"Lbj/t1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "", "index", "", "e", "name", "c", "", "j", "h", "", "", "f", "toString", "", "other", "equals", "hashCode", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "Laj/e;", "b", "Laj/e;", "k", "()Laj/e;", "kind", "d", "()I", "elementsCount", "<init>", "(Ljava/lang/String;Laj/e;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.t1 */
/* loaded from: classes8.dex */
public final class C3702t1 implements SerialDescriptor {

    /* renamed from: a */
    private final String f6018a;

    /* renamed from: b */
    private final AbstractC1413e f6019b;

    public C3702t1(String serialName, AbstractC1413e kind) {
        C9971q.m14633g(serialName, "serialName");
        C9971q.m14633g(kind, "kind");
        this.f6018a = serialName;
        this.f6019b = kind;
    }

    /* renamed from: a */
    private final Void m33789a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo13683b() {
        return SerialDescriptor.C10240a.m13923c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo13682c(String name) {
        C9971q.m14633g(name, "name");
        m33789a();
        throw new C11075i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        m33789a();
        throw new C11075i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3702t1)) {
            return false;
        }
        C3702t1 t1Var = (C3702t1) obj;
        if (!C9971q.m14638b(mo13676i(), t1Var.mo13676i()) || !C9971q.m14638b(mo13678g(), t1Var.mo13678g())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo13679f(int i) {
        m33789a();
        throw new C11075i();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C10240a.m13925a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        m33789a();
        throw new C11075i();
    }

    public int hashCode() {
        return mo13676i().hashCode() + (mo13678g().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f6018a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C10240a.m13924b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        m33789a();
        throw new C11075i();
    }

    /* renamed from: k */
    public AbstractC1413e mo13678g() {
        return this.f6019b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo13676i() + ')';
    }
}
