package bj;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p014aj.AbstractC1429h;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0018\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\r8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)¨\u00061"}, m15073d2 = {"Lbj/w1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lbj/l;", "", "index", "", "", "f", "h", "", "name", "c", "e", "", "j", "", "other", "equals", "toString", "hashCode", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "k", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "b", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "Laj/h;", "g", "()Laj/h;", "kind", "isNullable", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.w1 */
/* loaded from: classes8.dex */
public final class C3711w1 implements SerialDescriptor, AbstractC3671l {

    /* renamed from: a */
    private final SerialDescriptor f6035a;

    /* renamed from: b */
    private final String f6036b;

    /* renamed from: c */
    private final Set<String> f6037c;

    public C3711w1(SerialDescriptor original) {
        C9971q.m14633g(original, "original");
        this.f6035a = original;
        this.f6036b = original.mo13676i() + '?';
        this.f6037c = C3677m1.m33830a(original);
    }

    @Override // bj.AbstractC3671l
    /* renamed from: a */
    public Set<String> mo13843a() {
        return this.f6037c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo13683b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo13682c(String name) {
        C9971q.m14633g(name, "name");
        return this.f6035a.mo13682c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return this.f6035a.mo13681d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        return this.f6035a.mo13680e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3711w1) && C9971q.m14638b(this.f6035a, ((C3711w1) obj).f6035a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo13679f(int i) {
        return this.f6035a.mo13679f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return this.f6035a.mo13678g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f6035a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        return this.f6035a.mo13677h(i);
    }

    public int hashCode() {
        return this.f6035a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f6036b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f6035a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        return this.f6035a.mo13675j(i);
    }

    /* renamed from: k */
    public final SerialDescriptor m33762k() {
        return this.f6035a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6035a);
        sb2.append('?');
        return sb2.toString();
    }
}
