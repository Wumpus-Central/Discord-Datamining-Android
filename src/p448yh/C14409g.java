package p448yh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import p087ei.AbstractC6938i;
import p087ei.AbstractC6944n;

/* renamed from: yh.g */
/* loaded from: classes8.dex */
public final class C14409g extends AbstractC14397a {

    /* renamed from: b */
    private final AbstractC6938i<AbstractC14411h> f32620b;

    /* renamed from: yh.g$a */
    /* loaded from: classes8.dex */
    static final class C14410a extends AbstractC9973s implements Function0<AbstractC14411h> {

        /* renamed from: k */
        final /* synthetic */ Function0<AbstractC14411h> f32621k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C14410a(Function0<? extends AbstractC14411h> function0) {
            super(0);
            this.f32621k = function0;
        }

        /* renamed from: a */
        public final AbstractC14411h invoke() {
            AbstractC14411h invoke = this.f32621k.invoke();
            if (invoke instanceof AbstractC14397a) {
                return ((AbstractC14397a) invoke).m688h();
            }
            return invoke;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C14409g(p087ei.AbstractC6944n r1, kotlin.jvm.functions.Function0 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L_0x000b
            ei.n r1 = p087ei.C6920f.f15067e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.C9971q.m14634f(r1, r3)
        L_0x000b:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p448yh.C14409g.<init>(ei.n, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14409g(Function0<? extends AbstractC14411h> getScope) {
        this(null, getScope, 1, null);
        C9971q.m14633g(getScope, "getScope");
    }

    @Override // p448yh.AbstractC14397a
    /* renamed from: i */
    protected AbstractC14411h mo624i() {
        return this.f32620b.invoke();
    }

    public C14409g(AbstractC6944n storageManager, Function0<? extends AbstractC14411h> getScope) {
        C9971q.m14633g(storageManager, "storageManager");
        C9971q.m14633g(getScope, "getScope");
        this.f32620b = storageManager.mo23898c(new C14410a(getScope));
    }
}
