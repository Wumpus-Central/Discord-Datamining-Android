package th;

import fi.AbstractC7267g0;
import fi.AbstractC7304o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9899f;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p217lg.EnumC10426i;
import p268og.AbstractC11327h0;

/* renamed from: th.h */
/* loaded from: classes8.dex */
public final class C13105h {

    /* renamed from: a */
    public static final C13105h f29410a = new C13105h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.h$a */
    /* loaded from: classes8.dex */
    public static final class C13106a extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ AbstractC7267g0 f29411k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13106a(AbstractC7267g0 g0Var) {
            super(1);
            this.f29411k = g0Var;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11327h0 it) {
            C9971q.m14633g(it, "it");
            return this.f29411k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th.h$b */
    /* loaded from: classes8.dex */
    public static final class C13107b extends AbstractC9973s implements Function1<AbstractC11327h0, AbstractC7267g0> {

        /* renamed from: k */
        final /* synthetic */ EnumC10426i f29412k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13107b(EnumC10426i iVar) {
            super(1);
            this.f29412k = iVar;
        }

        /* renamed from: a */
        public final AbstractC7267g0 invoke(AbstractC11327h0 module) {
            C9971q.m14633g(module, "module");
            AbstractC7304o0 O = module.mo6136n().m13414O(this.f29412k);
            C9971q.m14634f(O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return O;
        }
    }

    private C13105h() {
    }

    /* renamed from: b */
    private final C13099b m4596b(List<?> list, EnumC10426i iVar) {
        List<Object> D0;
        D0 = C9914r.m14790D0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : D0) {
            AbstractC13104g<?> c = m4595c(obj);
            if (c != null) {
                arrayList.add(c);
            }
        }
        return new C13099b(arrayList, new C13107b(iVar));
    }

    /* renamed from: a */
    public final C13099b m4597a(List<? extends AbstractC13104g<?>> value, AbstractC7267g0 type) {
        C9971q.m14633g(value, "value");
        C9971q.m14633g(type, "type");
        return new C13099b(value, new C13106a(type));
    }

    /* renamed from: c */
    public final AbstractC13104g<?> m4595c(Object obj) {
        List<?> w0;
        List<?> q0;
        List<?> r0;
        List<?> p0;
        List<?> t0;
        List<?> s0;
        List<?> v0;
        List<?> o0;
        if (obj instanceof Byte) {
            return new C13101d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C13129u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C13114m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C13126r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C13102e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C13113l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C13108i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C13100c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C13130v((String) obj);
        }
        if (obj instanceof byte[]) {
            o0 = C9899f.m14922o0((byte[]) obj);
            return m4596b(o0, EnumC10426i.BYTE);
        } else if (obj instanceof short[]) {
            v0 = C9899f.m14912v0((short[]) obj);
            return m4596b(v0, EnumC10426i.SHORT);
        } else if (obj instanceof int[]) {
            s0 = C9899f.m14918s0((int[]) obj);
            return m4596b(s0, EnumC10426i.INT);
        } else if (obj instanceof long[]) {
            t0 = C9899f.m14916t0((long[]) obj);
            return m4596b(t0, EnumC10426i.LONG);
        } else if (obj instanceof char[]) {
            p0 = C9899f.m14921p0((char[]) obj);
            return m4596b(p0, EnumC10426i.CHAR);
        } else if (obj instanceof float[]) {
            r0 = C9899f.m14919r0((float[]) obj);
            return m4596b(r0, EnumC10426i.FLOAT);
        } else if (obj instanceof double[]) {
            q0 = C9899f.m14920q0((double[]) obj);
            return m4596b(q0, EnumC10426i.DOUBLE);
        } else if (obj instanceof boolean[]) {
            w0 = C9899f.m14910w0((boolean[]) obj);
            return m4596b(w0, EnumC10426i.BOOLEAN);
        } else if (obj == null) {
            return new C13127s();
        } else {
            return null;
        }
    }
}
