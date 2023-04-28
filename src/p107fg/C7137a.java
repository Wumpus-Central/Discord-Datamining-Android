package p107fg;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m15073d2 = {"Lfg/a;", "Ljava/lang/reflect/GenericArrayType;", "", "Ljava/lang/reflect/Type;", "getGenericComponentType", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "k", "Ljava/lang/reflect/Type;", "elementType", "<init>", "(Ljava/lang/reflect/Type;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: fg.a */
/* loaded from: classes8.dex */
public final class C7137a implements GenericArrayType, Type {

    /* renamed from: k */
    private final Type f15538k;

    public C7137a(Type elementType) {
        C9971q.m14633g(elementType, "elementType");
        this.f15538k = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && C9971q.m14638b(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f15538k;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String h;
        StringBuilder sb2 = new StringBuilder();
        h = C7158n.m23320h(this.f15538k);
        sb2.append(h);
        sb2.append("[]");
        return sb2.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
