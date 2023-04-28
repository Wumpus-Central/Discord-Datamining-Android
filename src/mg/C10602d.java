package mg;

import java.util.List;
import kotlin.collections.C9905i;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6944n;
import p268og.AbstractC11313e;
import p268og.AbstractC11397y;
import p448yh.AbstractC14405e;

/* renamed from: mg.d */
/* loaded from: classes8.dex */
public final class C10602d extends AbstractC14405e {

    /* renamed from: mg.d$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10603a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23485a;

        static {
            int[] iArr = new int[EnumC10600c.values().length];
            try {
                iArr[EnumC10600c.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC10600c.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23485a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10602d(AbstractC6944n storageManager, C10598b containingClass) {
        super(storageManager, containingClass);
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(containingClass, "containingClass");
    }

    @Override // p448yh.AbstractC14405e
    /* renamed from: i */
    protected List<AbstractC11397y> mo656i() {
        List<AbstractC11397y> d;
        List<AbstractC11397y> d2;
        List<AbstractC11397y> i;
        AbstractC11313e l = m653l();
        C9971q.m14635e(l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i2 = C10603a.f23485a[((C10598b) l).m12767U0().ordinal()];
        if (i2 == 1) {
            d = C9905i.m14825d(C10604e.f38801O.m12748a((C10598b) m653l(), false));
            return d;
        } else if (i2 != 2) {
            i = C9906j.m14820i();
            return i;
        } else {
            d2 = C9905i.m14825d(C10604e.f38801O.m12748a((C10598b) m653l(), true));
            return d2;
        }
    }
}
