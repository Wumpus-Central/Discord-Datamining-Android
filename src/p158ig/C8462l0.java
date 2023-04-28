package p158ig;

import fi.AbstractC7267g0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p107fg.AbstractC7144f;
import p249nh.C11142f;
import p268og.AbstractC11297a;
import p268og.AbstractC11335j1;
import p268og.AbstractC11388u0;
import p268og.AbstractC11396x0;
import p268og.AbstractC11397y;
import p305qh.AbstractC12137c;

@Metadata(m15074d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, m15073d2 = {"Lig/l0;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Log/x0;", "receiver", "", "a", "Log/a;", "callable", "b", "descriptor", "", "c", "Log/u0;", "g", "Log/y;", "d", "invoke", "e", "Lig/w;", "parameter", "f", "Lfi/g0;", "type", "h", "Lqh/c;", "Lqh/c;", "renderer", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ig.l0 */
/* loaded from: classes8.dex */
public final class C8462l0 {

    /* renamed from: a */
    public static final C8462l0 f18419a = new C8462l0();

    /* renamed from: b */
    private static final AbstractC12137c f18420b = AbstractC12137c.f27230g;

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: ig.l0$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18421a;

        static {
            int[] iArr = new int[AbstractC7144f.EnumC7145a.values().length];
            try {
                iArr[AbstractC7144f.EnumC7145a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC7144f.EnumC7145a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC7144f.EnumC7145a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18421a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Log/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Log/j1;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.l0$b */
    /* loaded from: classes8.dex */
    public static final class C8464b extends AbstractC9973s implements Function1<AbstractC11335j1, CharSequence> {

        /* renamed from: k */
        public static final C8464b f18422k = new C8464b();

        C8464b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC11335j1 j1Var) {
            C8462l0 l0Var = C8462l0.f18419a;
            AbstractC7267g0 type = j1Var.getType();
            C9971q.m14634f(type, "it.type");
            return l0Var.m19730h(type);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"Log/j1;", "kotlin.jvm.PlatformType", "it", "", "a", "(Log/j1;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: ig.l0$c */
    /* loaded from: classes8.dex */
    public static final class C8465c extends AbstractC9973s implements Function1<AbstractC11335j1, CharSequence> {

        /* renamed from: k */
        public static final C8465c f18423k = new C8465c();

        C8465c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(AbstractC11335j1 j1Var) {
            C8462l0 l0Var = C8462l0.f18419a;
            AbstractC7267g0 type = j1Var.getType();
            C9971q.m14634f(type, "it.type");
            return l0Var.m19730h(type);
        }
    }

    private C8462l0() {
    }

    /* renamed from: a */
    private final void m19737a(StringBuilder sb2, AbstractC11396x0 x0Var) {
        if (x0Var != null) {
            AbstractC7267g0 type = x0Var.getType();
            C9971q.m14634f(type, "receiver.type");
            sb2.append(m19730h(type));
            sb2.append(".");
        }
    }

    /* renamed from: b */
    private final void m19736b(StringBuilder sb2, AbstractC11297a aVar) {
        boolean z;
        AbstractC11396x0 i = C8503p0.m19651i(aVar);
        AbstractC11396x0 M = aVar.mo6264M();
        m19737a(sb2, i);
        if (i == null || M == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb2.append("(");
        }
        m19737a(sb2, M);
        if (z) {
            sb2.append(")");
        }
    }

    /* renamed from: c */
    private final String m19735c(AbstractC11297a aVar) {
        if (aVar instanceof AbstractC11388u0) {
            return m19731g((AbstractC11388u0) aVar);
        }
        if (aVar instanceof AbstractC11397y) {
            return m19734d((AbstractC11397y) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* renamed from: d */
    public final String m19734d(AbstractC11397y descriptor) {
        C9971q.m14633g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        C8462l0 l0Var = f18419a;
        l0Var.m19736b(sb2, descriptor);
        AbstractC12137c cVar = f18420b;
        C11142f name = descriptor.getName();
        C9971q.m14634f(name, "descriptor.name");
        sb2.append(cVar.mo7616v(name, true));
        List<AbstractC11335j1> i = descriptor.mo6242i();
        C9971q.m14634f(i, "descriptor.valueParameters");
        C9914r.m14762c0(i, sb2, ", ", "(", ")", 0, null, C8464b.f18422k, 48, null);
        sb2.append(": ");
        AbstractC7267g0 returnType = descriptor.getReturnType();
        C9971q.m14636d(returnType);
        sb2.append(l0Var.m19730h(returnType));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: e */
    public final String m19733e(AbstractC11397y invoke) {
        C9971q.m14633g(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        C8462l0 l0Var = f18419a;
        l0Var.m19736b(sb2, invoke);
        List<AbstractC11335j1> i = invoke.mo6242i();
        C9971q.m14634f(i, "invoke.valueParameters");
        C9914r.m14762c0(i, sb2, ", ", "(", ")", 0, null, C8465c.f18423k, 48, null);
        sb2.append(" -> ");
        AbstractC7267g0 returnType = invoke.getReturnType();
        C9971q.m14636d(returnType);
        sb2.append(l0Var.m19730h(returnType));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: f */
    public final String m19732f(C8527w parameter) {
        C9971q.m14633g(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i = C8463a.f18421a[parameter.mo19586g().ordinal()];
        if (i == 1) {
            sb2.append("extension receiver parameter");
        } else if (i == 2) {
            sb2.append("instance parameter");
        } else if (i == 3) {
            sb2.append("parameter #" + parameter.m19581p() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f18419a.m19735c(parameter.m19584m().mo19626x()));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: g */
    public final String m19731g(AbstractC11388u0 descriptor) {
        String str;
        C9971q.m14633g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (descriptor.mo6277L()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        C8462l0 l0Var = f18419a;
        l0Var.m19736b(sb2, descriptor);
        AbstractC12137c cVar = f18420b;
        C11142f name = descriptor.getName();
        C9971q.m14634f(name, "descriptor.name");
        sb2.append(cVar.mo7616v(name, true));
        sb2.append(": ");
        AbstractC7267g0 type = descriptor.getType();
        C9971q.m14634f(type, "descriptor.type");
        sb2.append(l0Var.m19730h(type));
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: h */
    public final String m19730h(AbstractC7267g0 type) {
        C9971q.m14633g(type, "type");
        return f18420b.mo7613w(type);
    }
}
