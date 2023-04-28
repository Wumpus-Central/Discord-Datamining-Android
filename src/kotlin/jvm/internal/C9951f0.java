package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p107fg.AbstractC7142e;
import p107fg.AbstractC7146g;
import p107fg.AbstractC7148h;
import p158ig.C8452k0;

/* renamed from: kotlin.jvm.internal.f0 */
/* loaded from: classes8.dex */
public class C9951f0 {

    /* renamed from: a */
    private static final C9953g0 f22077a;

    /* renamed from: b */
    private static final KClass[] f22078b;

    static {
        C9953g0 g0Var = null;
        try {
            g0Var = (C9953g0) C8452k0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g0Var == null) {
            g0Var = new C9953g0();
        }
        f22077a = g0Var;
        f22078b = new KClass[0];
    }

    /* renamed from: a */
    public static KFunction m14685a(C9965m mVar) {
        return f22077a.mo14676a(mVar);
    }

    /* renamed from: b */
    public static KClass m14684b(Class cls) {
        return f22077a.mo14675b(cls);
    }

    /* renamed from: c */
    public static KDeclarationContainer m14683c(Class cls) {
        return f22077a.mo14674c(cls, "");
    }

    /* renamed from: d */
    public static KDeclarationContainer m14682d(Class cls, String str) {
        return f22077a.mo14674c(cls, str);
    }

    /* renamed from: e */
    public static AbstractC7142e m14681e(AbstractC9976v vVar) {
        return f22077a.mo14673d(vVar);
    }

    /* renamed from: f */
    public static AbstractC7146g m14680f(AbstractC9980z zVar) {
        return f22077a.mo14672e(zVar);
    }

    /* renamed from: g */
    public static AbstractC7148h m14679g(AbstractC9942b0 b0Var) {
        return f22077a.mo14671f(b0Var);
    }

    /* renamed from: h */
    public static String m14678h(AbstractC9963l lVar) {
        return f22077a.mo14670g(lVar);
    }

    /* renamed from: i */
    public static String m14677i(AbstractC9973s sVar) {
        return f22077a.mo14669h(sVar);
    }
}
