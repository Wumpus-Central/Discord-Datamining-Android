package p014aj;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m15073d2 = {"Laj/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "index", "", "", "f", "h", "", "name", "c", "e", "", "j", "", "other", "equals", "hashCode", "toString", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "serialName", "getAnnotations", "()Ljava/util/List;", "annotations", "d", "()I", "elementsCount", "isInline", "()Z", "isNullable", "Laj/h;", "g", "()Laj/h;", "kind", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: aj.c */
/* loaded from: classes8.dex */
final class C1409c implements SerialDescriptor {

    /* renamed from: a */
    private final SerialDescriptor f458a;

    /* renamed from: b */
    public final KClass<?> f459b;

    /* renamed from: c */
    private final String f460c;

    public C1409c(SerialDescriptor original, KClass<?> kClass) {
        C9971q.m14633g(original, "original");
        C9971q.m14633g(kClass, "kClass");
        this.f458a = original;
        this.f459b = kClass;
        this.f460c = original.mo13676i() + '<' + kClass.mo14598l() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo13683b() {
        return this.f458a.mo13683b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo13682c(String name) {
        C9971q.m14633g(name, "name");
        return this.f458a.mo13682c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: d */
    public int mo13681d() {
        return this.f458a.mo13681d();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public String mo13680e(int i) {
        return this.f458a.mo13680e(i);
    }

    public boolean equals(Object obj) {
        C1409c cVar;
        if (obj instanceof C1409c) {
            cVar = (C1409c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null && C9971q.m14638b(this.f458a, cVar.f458a) && C9971q.m14638b(cVar.f459b, this.f459b)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public List<Annotation> mo13679f(int i) {
        return this.f458a.mo13679f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: g */
    public AbstractC1429h mo13678g() {
        return this.f458a.mo13678g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.f458a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: h */
    public SerialDescriptor mo13677h(int i) {
        return this.f458a.mo13677h(i);
    }

    public int hashCode() {
        return (this.f459b.hashCode() * 31) + mo13676i().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public String mo13676i() {
        return this.f460c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f458a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: j */
    public boolean mo13675j(int i) {
        return this.f458a.mo13675j(i);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f459b + ", original: " + this.f458a + ')';
    }
}
