package kotlin.jvm.internal;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Lkotlin/jvm/internal/y;", "Lkotlin/jvm/internal/g;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "k", "Ljava/lang/Class;", "i", "()Ljava/lang/Class;", "jClass", "l", "Ljava/lang/String;", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes8.dex */
public final class C9979y implements AbstractC9952g {

    /* renamed from: k */
    private final Class<?> f22096k;

    /* renamed from: l */
    private final String f22097l;

    public C9979y(Class<?> jClass, String moduleName) {
        C9971q.m14633g(jClass, "jClass");
        C9971q.m14633g(moduleName, "moduleName");
        this.f22096k = jClass;
        this.f22097l = moduleName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9979y) && C9971q.m14638b(mo14611i(), ((C9979y) obj).mo14611i());
    }

    public int hashCode() {
        return mo14611i().hashCode();
    }

    @Override // kotlin.jvm.internal.AbstractC9952g
    /* renamed from: i */
    public Class<?> mo14611i() {
        return this.f22096k;
    }

    public String toString() {
        return mo14611i().toString() + " (Kotlin reflection is not available)";
    }
}
