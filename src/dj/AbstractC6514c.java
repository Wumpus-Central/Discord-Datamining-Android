package dj;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H'J9\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H'¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H'\u0082\u0001\u0001\u0018¨\u0006\u0019"}, m15073d2 = {"Ldj/c;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "baseClass", "value", "Lyi/h;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lyi/h;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "d", "Ldj/e;", "collector", "", "a", "<init>", "()V", "Ldj/b;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: dj.c */
/* loaded from: classes8.dex */
public abstract class AbstractC6514c {
    private AbstractC6514c() {
    }

    public /* synthetic */ AbstractC6514c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static /* synthetic */ KSerializer m25389c(AbstractC6514c cVar, KClass kClass, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = C9906j.m14820i();
            }
            return cVar.mo25390b(kClass, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    /* renamed from: a */
    public abstract void mo25391a(AbstractC6516e eVar);

    /* renamed from: b */
    public abstract <T> KSerializer<T> mo25390b(KClass<T> kClass, List<? extends KSerializer<?>> list);

    /* renamed from: d */
    public abstract <T> DeserializationStrategy<T> mo25388d(KClass<? super T> kClass, String str);

    /* renamed from: e */
    public abstract <T> AbstractC14437h<T> mo25387e(KClass<? super T> kClass, T t);
}
