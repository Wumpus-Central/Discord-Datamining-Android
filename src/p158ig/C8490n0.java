package p158ig;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C9899f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import ug.C13283d;

@Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m15073d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: ig.n0 */
/* loaded from: classes8.dex */
public final class C8490n0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.n0$a */
    /* loaded from: classes8.dex */
    public static final class C8491a extends AbstractC9973s implements Function1<Class<?>, CharSequence> {

        /* renamed from: k */
        public static final C8491a f18477k = new C8491a();

        C8491a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Class<?> it) {
            C9971q.m14634f(it, "it");
            return C13283d.m4052b(it);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m19689a(Method method) {
        return m19688b(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m19688b(Method method) {
        String c0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9971q.m14634f(parameterTypes, "parameterTypes");
        c0 = C9899f.m14934c0(parameterTypes, "", "(", ")", 0, null, C8491a.f18477k, 24, null);
        sb2.append(c0);
        Class<?> returnType = method.getReturnType();
        C9971q.m14634f(returnType, "returnType");
        sb2.append(C13283d.m4052b(returnType));
        return sb2.toString();
    }
}
