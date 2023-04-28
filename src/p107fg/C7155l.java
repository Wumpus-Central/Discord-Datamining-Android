package p107fg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m15073d2 = {"Lfg/l;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "k", "Ljava/lang/Class;", "rawType", "l", "Ljava/lang/reflect/Type;", "ownerType", "m", "[Ljava/lang/reflect/Type;", "typeArguments", "", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: fg.l */
/* loaded from: classes8.dex */
public final class C7155l implements ParameterizedType, Type {

    /* renamed from: k */
    private final Class<?> f15552k;

    /* renamed from: l */
    private final Type f15553l;

    /* renamed from: m */
    private final Type[] f15554m;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: fg.l$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C7156a extends C9968n implements Function1<Type, String> {

        /* renamed from: k */
        public static final C7156a f15555k = new C7156a();

        C7156a() {
            super(1, C7158n.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        /* renamed from: i */
        public final String invoke(Type p0) {
            String h;
            C9971q.m14633g(p0, "p0");
            h = C7158n.m23320h(p0);
            return h;
        }
    }

    public C7155l(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        C9971q.m14633g(rawType, "rawType");
        C9971q.m14633g(typeArguments, "typeArguments");
        this.f15552k = rawType;
        this.f15553l = type;
        this.f15554m = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (C9971q.m14638b(this.f15552k, parameterizedType.getRawType()) && C9971q.m14638b(this.f15553l, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f15554m;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f15553l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f15552k;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        boolean z;
        String h;
        String h2;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f15553l;
        if (type != null) {
            h2 = C7158n.m23320h(type);
            sb2.append(h2);
            sb2.append("$");
            sb2.append(this.f15552k.getSimpleName());
        } else {
            h = C7158n.m23320h(this.f15552k);
            sb2.append(h);
        }
        Type[] typeArr = this.f15554m;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9899f.m14942U(typeArr, sb2, null, "<", ">", 0, null, C7156a.f15555k, 50, null);
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.f15552k.hashCode();
        Type type = this.f15553l;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
