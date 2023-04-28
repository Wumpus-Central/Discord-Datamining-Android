package bj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9907k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import nf.C11090s;
import nf.C11093t;
import p163j$.util.concurrent.ConcurrentHashMap;
import p446yf.C14376a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fR:\u0010\u000f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, m15073d2 = {"Lbj/q;", "T", "Lbj/k1;", "Lkotlin/reflect/KClass;", "", "key", "", "Lkotlin/reflect/KType;", "types", "Lnf/s;", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "compute", "Lbj/r;", "Lbj/j1;", "b", "Lbj/r;", "classValue", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.q */
/* loaded from: classes8.dex */
public final class C3690q<T> implements AbstractC3669k1<T> {

    /* renamed from: a */
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> f6011a;

    /* renamed from: b */
    private final C3694r<C3664j1<T>> f6012b = new C3694r<>();

    @Metadata(m15074d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.q$a */
    /* loaded from: classes8.dex */
    public static final class C3691a extends AbstractC9973s implements Function0<T> {
        public C3691a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C3664j1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3690q(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        C9971q.m14633g(compute, "compute");
        this.f6011a = compute;
    }

    @Override // bj.AbstractC3669k1
    /* renamed from: a */
    public Object mo33783a(KClass<Object> key, List<? extends KType> types) {
        int t;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        C9971q.m14633g(key, "key");
        C9971q.m14633g(types, "types");
        Object obj2 = this.f6012b.get(C14376a.m737b(key));
        C9971q.m14634f(obj2, "get(key)");
        C3621a1 a1Var = (C3621a1) obj2;
        T t2 = a1Var.f5916a.get();
        if (t2 == null) {
            t2 = (T) a1Var.m33963a(new C3691a());
        }
        C3664j1 j1Var = (C3664j1) t2;
        t = C9907k.m14809t(types, 10);
        ArrayList arrayList = new ArrayList(t);
        for (KType kType : types) {
            arrayList.add(new C3684o0(kType));
        }
        concurrentHashMap = j1Var.f5980a;
        Object obj3 = concurrentHashMap.get(arrayList);
        if (obj3 == null) {
            try {
                C11090s.C11091a aVar = C11090s.f24606l;
                obj = C11090s.m10940b(this.f6011a.invoke(key, types));
            } catch (Throwable th2) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                obj = C11090s.m10940b(C11093t.m10931a(th2));
            }
            C11090s a = C11090s.m10941a(obj);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, a);
            if (putIfAbsent == null) {
                obj3 = a;
            } else {
                obj3 = putIfAbsent;
            }
        }
        C9971q.m14634f(obj3, "serializers.getOrPut(wra… { producer() }\n        }");
        return ((C11090s) obj3).m10932j();
    }
}
