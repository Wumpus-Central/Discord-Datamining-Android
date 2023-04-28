package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000e"}, m15073d2 = {"Lkotlin/coroutines/jvm/internal/h;", "", "Lkotlin/coroutines/jvm/internal/a;", "continuation", "Lkotlin/coroutines/jvm/internal/h$a;", "a", "", "b", "Lkotlin/coroutines/jvm/internal/h$a;", "notOnJava9", "c", "cache", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.h */
/* loaded from: classes8.dex */
public final class C9934h {

    /* renamed from: a */
    public static final C9934h f22060a = new C9934h();

    /* renamed from: b */
    private static final C9935a f22061b = new C9935a(null, null, null);

    /* renamed from: c */
    private static C9935a f22062c;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, m15073d2 = {"Lkotlin/coroutines/jvm/internal/h$a;", "", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getModuleMethod", "b", "getDescriptorMethod", "c", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.jvm.internal.h$a */
    /* loaded from: classes8.dex */
    public static final class C9935a {

        /* renamed from: a */
        public final Method f22063a;

        /* renamed from: b */
        public final Method f22064b;

        /* renamed from: c */
        public final Method f22065c;

        public C9935a(Method method, Method method2, Method method3) {
            this.f22063a = method;
            this.f22064b = method2;
            this.f22065c = method3;
        }
    }

    private C9934h() {
    }

    /* renamed from: a */
    private final C9935a m14690a(AbstractC9927a aVar) {
        try {
            C9935a aVar2 = new C9935a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f22062c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C9935a aVar3 = f22061b;
            f22062c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String m14689b(AbstractC9927a continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        C9971q.m14633g(continuation, "continuation");
        C9935a aVar = f22062c;
        if (aVar == null) {
            aVar = m14690a(continuation);
        }
        if (aVar == f22061b) {
            return null;
        }
        Method method = aVar.f22063a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f22064b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f22065c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
