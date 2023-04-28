package p158ig;

import kotlin.jvm.internal.AbstractC9942b0;
import kotlin.jvm.internal.AbstractC9947e;
import kotlin.jvm.internal.AbstractC9963l;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.AbstractC9976v;
import kotlin.jvm.internal.AbstractC9980z;
import kotlin.jvm.internal.C9953g0;
import kotlin.jvm.internal.C9965m;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p107fg.AbstractC7142e;
import p107fg.AbstractC7146g;
import p107fg.AbstractC7148h;
import p140hg.C8017d;

/* renamed from: ig.k0 */
/* loaded from: classes8.dex */
public class C8452k0 extends C9953g0 {
    /* renamed from: i */
    private static AbstractC8494p m19750i(AbstractC9947e eVar) {
        KDeclarationContainer owner = eVar.getOwner();
        if (owner instanceof AbstractC8494p) {
            return (AbstractC8494p) owner;
        }
        return C8429h.f18378n;
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: a */
    public KFunction mo14676a(C9965m mVar) {
        return new C8505q(m19750i(mVar), mVar.getName(), mVar.getSignature(), mVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: b */
    public KClass mo14675b(Class cls) {
        return C8399c.m19830a(cls);
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: c */
    public KDeclarationContainer mo14674c(Class cls, String str) {
        return C8399c.m19829b(cls);
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: d */
    public AbstractC7142e mo14673d(AbstractC9976v vVar) {
        return new C8513s(m19750i(vVar), vVar.getName(), vVar.getSignature(), vVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: e */
    public AbstractC7146g mo14672e(AbstractC9980z zVar) {
        return new C8530x(m19750i(zVar), zVar.getName(), zVar.getSignature(), zVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: f */
    public AbstractC7148h mo14671f(AbstractC9942b0 b0Var) {
        return new C8534y(m19750i(b0Var), b0Var.getName(), b0Var.getSignature(), b0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: g */
    public String mo14670g(AbstractC9963l lVar) {
        C8505q c;
        KFunction a = C8017d.m20846a(lVar);
        if (a == null || (c = C8503p0.m19657c(a)) == null) {
            return super.mo14670g(lVar);
        }
        return C8462l0.f18419a.m19733e(c.mo19626x());
    }

    @Override // kotlin.jvm.internal.C9953g0
    /* renamed from: h */
    public String mo14669h(AbstractC9973s sVar) {
        return mo14670g(sVar);
    }
}
