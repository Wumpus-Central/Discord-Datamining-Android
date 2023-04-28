package p217lg;

import java.util.ServiceLoader;
import kotlin.Lazy;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import nf.C11084n;
import nf.EnumC11087p;
import p087ei.AbstractC6944n;
import p268og.AbstractC11327h0;
import p268og.AbstractC11347m0;
import p304qg.AbstractC12125a;
import p304qg.AbstractC12126b;
import p304qg.AbstractC12127c;

/* renamed from: lg.a */
/* loaded from: classes8.dex */
public interface AbstractC10412a {

    /* renamed from: a */
    public static final C0325a f22820a = C0325a.f22821a;

    /* renamed from: lg.a$a */
    /* loaded from: classes8.dex */
    public static final class C0325a {

        /* renamed from: a */
        static final /* synthetic */ C0325a f22821a = new C0325a();

        /* renamed from: b */
        private static final Lazy<AbstractC10412a> f22822b;

        /* renamed from: lg.a$a$a */
        /* loaded from: classes8.dex */
        static final class C0326a extends AbstractC9973s implements Function0<AbstractC10412a> {

            /* renamed from: k */
            public static final C0326a f22823k = new C0326a();

            C0326a() {
                super(0);
            }

            /* renamed from: a */
            public final AbstractC10412a invoke() {
                Object V;
                ServiceLoader implementations = ServiceLoader.load(AbstractC10412a.class, AbstractC10412a.class.getClassLoader());
                C9971q.m14634f(implementations, "implementations");
                V = C9914r.m14769V(implementations);
                AbstractC10412a aVar = (AbstractC10412a) V;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            Lazy<AbstractC10412a> b;
            b = C11084n.m10944b(EnumC11087p.PUBLICATION, C0326a.f22823k);
            f22822b = b;
        }

        private C0325a() {
        }

        /* renamed from: a */
        public final AbstractC10412a m13458a() {
            return f22822b.getValue();
        }
    }

    /* renamed from: a */
    AbstractC11347m0 mo13459a(AbstractC6944n nVar, AbstractC11327h0 h0Var, Iterable<? extends AbstractC12126b> iterable, AbstractC12127c cVar, AbstractC12125a aVar, boolean z);
}
