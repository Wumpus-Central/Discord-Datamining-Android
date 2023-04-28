package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p107fg.AbstractC7142e;
import p107fg.AbstractC7146g;
import p107fg.AbstractC7148h;

/* renamed from: kotlin.jvm.internal.g0 */
/* loaded from: classes8.dex */
public class C9953g0 {
    /* renamed from: a */
    public KFunction mo14676a(C9965m mVar) {
        return mVar;
    }

    /* renamed from: b */
    public KClass mo14675b(Class cls) {
        return new C9954h(cls);
    }

    /* renamed from: c */
    public KDeclarationContainer mo14674c(Class cls, String str) {
        return new C9979y(cls, str);
    }

    /* renamed from: d */
    public AbstractC7142e mo14673d(AbstractC9976v vVar) {
        return vVar;
    }

    /* renamed from: e */
    public AbstractC7146g mo14672e(AbstractC9980z zVar) {
        return zVar;
    }

    /* renamed from: f */
    public AbstractC7148h mo14671f(AbstractC9942b0 b0Var) {
        return b0Var;
    }

    /* renamed from: g */
    public String mo14670g(AbstractC9963l lVar) {
        String obj = lVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: h */
    public String mo14669h(AbstractC9973s sVar) {
        return mo14670g(sVar);
    }
}
