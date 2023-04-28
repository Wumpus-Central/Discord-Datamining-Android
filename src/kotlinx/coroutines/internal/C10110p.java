package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9940a0;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10149n0;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001:\u00041234B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00065"}, m15073d2 = {"Lkotlinx/coroutines/internal/p;", "", "Lkotlinx/coroutines/internal/z;", "U", "()Lkotlinx/coroutines/internal/z;", "Lkotlinx/coroutines/internal/Node;", "current", "J", "(Lkotlinx/coroutines/internal/p;)Lkotlinx/coroutines/internal/p;", "next", "", "K", "(Lkotlinx/coroutines/internal/p;)V", "Lkotlinx/coroutines/internal/y;", "op", "I", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;", "node", "", "H", "(Lkotlinx/coroutines/internal/p;)Z", "F", "G", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Z", "Lkotlinx/coroutines/internal/p$b;", "condAdd", "", "V", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p$b;)I", "R", "()Z", "T", "()Lkotlinx/coroutines/internal/p;", "O", "()V", "P", "S", "", "toString", "()Ljava/lang/String;", "Q", "isRemoved", "L", "()Ljava/lang/Object;", "M", "nextNode", "N", "prevNode", "<init>", "a", "b", "c", "d", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: classes8.dex */
public class C10110p {

    /* renamed from: k */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22307k = AtomicReferenceFieldUpdater.newUpdater(C10110p.class, Object.class, "_next");

    /* renamed from: l */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22308l = AtomicReferenceFieldUpdater.newUpdater(C10110p.class, Object.class, "_prev");

    /* renamed from: m */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f22309m = AtomicReferenceFieldUpdater.newUpdater(C10110p.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, m15073d2 = {"Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/y;", "op", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "", "f", "n", "Lkotlinx/coroutines/internal/p$c;", "prepareOp", "g", "j", "k", "Lkotlinx/coroutines/internal/d;", "c", "failure", "a", "h", "()Lkotlinx/coroutines/internal/p;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC10111a extends AbstractC10082b {
        @Override // kotlinx.coroutines.internal.AbstractC10082b
        /* renamed from: a */
        public final void mo14243a(AbstractC10086d<?> dVar, Object obj) {
            boolean z;
            C10110p i;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            C10110p h = mo14237h();
            if (h != null && (i = mo14236i()) != null) {
                if (z) {
                    obj2 = mo14233n(h, i);
                } else {
                    obj2 = i;
                }
                if (C2113b.m38965a(C10110p.f22307k, h, dVar, obj2) && z) {
                    mo14239f(h, i);
                }
            }
        }

        @Override // kotlinx.coroutines.internal.AbstractC10082b
        /* renamed from: c */
        public final Object mo14242c(AbstractC10086d<?> dVar) {
            while (true) {
                C10110p m = mo14234m(dVar);
                if (m == null) {
                    return C10084c.f22271b;
                }
                C10113c cVar = m._next;
                if (cVar == dVar || dVar.m14331h()) {
                    return null;
                }
                if (cVar instanceof AbstractC10127y) {
                    AbstractC10127y yVar = (AbstractC10127y) cVar;
                    if (dVar.m14199b(yVar)) {
                        return C10084c.f22271b;
                    }
                    yVar.mo14023c(m);
                } else {
                    Object e = mo3944e(m);
                    if (e != null) {
                        return e;
                    }
                    if (!mo14235l(m, cVar)) {
                        cVar = new C10113c(m, (C10110p) cVar, this);
                        if (C2113b.m38965a(r4, m, cVar, cVar)) {
                            try {
                                if (cVar.mo14023c(m) != C10116q.f22318a) {
                                    return null;
                                }
                            } finally {
                                C2113b.m38965a(C10110p.f22307k, m, cVar, cVar);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        /* renamed from: e */
        protected abstract Object mo3944e(C10110p pVar);

        /* renamed from: f */
        protected abstract void mo14239f(C10110p pVar, C10110p pVar2);

        /* renamed from: g */
        public abstract void mo14238g(C10113c cVar);

        /* renamed from: h */
        protected abstract C10110p mo14237h();

        /* renamed from: i */
        protected abstract C10110p mo14236i();

        /* renamed from: j */
        public Object mo3943j(C10113c cVar) {
            mo14238g(cVar);
            return null;
        }

        /* renamed from: k */
        public void mo3942k(C10110p pVar) {
        }

        /* renamed from: l */
        protected abstract boolean mo14235l(C10110p pVar, Object obj);

        /* renamed from: m */
        protected abstract C10110p mo14234m(AbstractC10127y yVar);

        /* renamed from: n */
        public abstract Object mo14233n(C10110p pVar, C10110p pVar2);
    }

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "", "j", "b", "Lkotlinx/coroutines/internal/p;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC10112b extends AbstractC10086d<C10110p> {

        /* renamed from: b */
        public final C10110p f22310b;

        /* renamed from: c */
        public C10110p f22311c;

        public AbstractC10112b(C10110p pVar) {
            this.f22310b = pVar;
        }

        /* renamed from: j */
        public void mo14002d(C10110p pVar, Object obj) {
            boolean z;
            C10110p pVar2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                pVar2 = this.f22310b;
            } else {
                pVar2 = this.f22311c;
            }
            if (pVar2 != null && C2113b.m38965a(C10110p.f22307k, pVar, this, pVar2) && z) {
                C10110p pVar3 = this.f22310b;
                C10110p pVar4 = this.f22311c;
                C9971q.m14636d(pVar4);
                pVar3.m14254K(pVar4);
            }
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lkotlinx/coroutines/internal/p$c;", "Lkotlinx/coroutines/internal/y;", "", "affected", "c", "", "d", "", "toString", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/p;", "b", "next", "Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/p$a;", "desc", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p$a;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$c */
    /* loaded from: classes8.dex */
    public static final class C10113c extends AbstractC10127y {

        /* renamed from: a */
        public final C10110p f22312a;

        /* renamed from: b */
        public final C10110p f22313b;

        /* renamed from: c */
        public final AbstractC10111a f22314c;

        public C10113c(C10110p pVar, C10110p pVar2, AbstractC10111a aVar) {
            this.f22312a = pVar;
            this.f22313b = pVar2;
            this.f22314c = aVar;
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        /* renamed from: a */
        public AbstractC10086d<?> mo14024a() {
            return this.f22314c.m14338b();
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        /* renamed from: c */
        public Object mo14023c(Object obj) {
            Object obj2;
            Object obj3;
            if (obj != null) {
                C10110p pVar = (C10110p) obj;
                Object j = this.f22314c.mo3943j(this);
                Object obj4 = C10116q.f22318a;
                if (j == obj4) {
                    C10110p pVar2 = this.f22313b;
                    if (C2113b.m38965a(C10110p.f22307k, pVar, this, pVar2.m14245U())) {
                        this.f22314c.mo3942k(pVar);
                        pVar2.m14256I(null);
                    }
                    return obj4;
                }
                if (j != null) {
                    obj2 = mo14024a().m14333e(j);
                } else {
                    obj2 = mo14024a().m14332f();
                }
                if (obj2 == C10084c.f22270a) {
                    obj3 = mo14024a();
                } else if (obj2 == null) {
                    obj3 = this.f22314c.mo14233n(pVar, this.f22313b);
                } else {
                    obj3 = this.f22313b;
                }
                C2113b.m38965a(C10110p.f22307k, pVar, this, obj3);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        /* renamed from: d */
        public final void m14240d() {
            this.f22314c.mo14238g(this);
        }

        @Override // kotlinx.coroutines.internal.AbstractC10127y
        public String toString() {
            return "PrepareOp(op=" + mo14024a() + ')';
        }
    }

    @Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, m15073d2 = {"Lkotlinx/coroutines/internal/p$d;", "T", "Lkotlinx/coroutines/internal/p$a;", "Lkotlinx/coroutines/internal/y;", "op", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/p;", "affected", "", "e", "(Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;", "next", "", "l", "(Lkotlinx/coroutines/internal/p;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/p$c;", "prepareOp", "", "g", "(Lkotlinx/coroutines/internal/p$c;)V", "n", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/p;Lkotlinx/coroutines/internal/p;)V", "b", "Lkotlinx/coroutines/internal/p;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lkotlinx/coroutines/internal/p;", "affectedNode", "i", "originalNext", "<init>", "(Lkotlinx/coroutines/internal/p;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.p$d */
    /* loaded from: classes8.dex */
    public static class C10114d<T> extends AbstractC10111a {

        /* renamed from: c */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f22315c = AtomicReferenceFieldUpdater.newUpdater(C10114d.class, Object.class, "_affectedNode");

        /* renamed from: d */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f22316d = AtomicReferenceFieldUpdater.newUpdater(C10114d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b */
        public final C10110p f22317b;

        public C10114d(C10110p pVar) {
            this.f22317b = pVar;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: e */
        protected Object mo3944e(C10110p pVar) {
            if (pVar == this.f22317b) {
                return C10109o.m14264b();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: f */
        protected final void mo14239f(C10110p pVar, C10110p pVar2) {
            pVar2.m14256I(null);
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: g */
        public void mo14238g(C10113c cVar) {
            C2113b.m38965a(f22315c, this, null, cVar.f22312a);
            C2113b.m38965a(f22316d, this, null, cVar.f22313b);
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: h */
        protected final C10110p mo14237h() {
            return (C10110p) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: i */
        protected final C10110p mo14236i() {
            return (C10110p) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: l */
        protected final boolean mo14235l(C10110p pVar, Object obj) {
            if (!(obj instanceof C10128z)) {
                return false;
            }
            ((C10128z) obj).f22338a.m14249P();
            return true;
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: m */
        protected final C10110p mo14234m(AbstractC10127y yVar) {
            C10110p pVar = this.f22317b;
            while (true) {
                Object obj = pVar._next;
                if (!(obj instanceof AbstractC10127y)) {
                    return (C10110p) obj;
                }
                AbstractC10127y yVar2 = (AbstractC10127y) obj;
                if (yVar.m14199b(yVar2)) {
                    return null;
                }
                yVar2.mo14023c(this.f22317b);
            }
        }

        @Override // kotlinx.coroutines.internal.C10110p.AbstractC10111a
        /* renamed from: n */
        public final Object mo14233n(C10110p pVar, C10110p pVar2) {
            return pVar2.m14245U();
        }

        /* renamed from: o */
        public final T m14232o() {
            T t = (T) mo14237h();
            C9971q.m14636d(t);
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        if (androidx.concurrent.futures.C2113b.m38965a(kotlinx.coroutines.internal.C10110p.f22307k, r3, r2, ((kotlinx.coroutines.internal.C10128z) r4).f22338a) != false) goto L_0x004b;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.internal.C10110p m14256I(kotlinx.coroutines.internal.AbstractC10127y r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.p r0 = (kotlinx.coroutines.internal.C10110p) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C10110p.f22308l
            boolean r0 = androidx.concurrent.futures.C2113b.m38965a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo14248Q()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC10127y
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.AbstractC10127y) r0
            boolean r0 = r8.m14199b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.y r4 = (kotlinx.coroutines.internal.AbstractC10127y) r4
            r4.mo14023c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C10128z
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C10110p.f22307k
            kotlinx.coroutines.internal.z r4 = (kotlinx.coroutines.internal.C10128z) r4
            kotlinx.coroutines.internal.p r4 = r4.f22338a
            boolean r2 = androidx.concurrent.futures.C2113b.m38965a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.p r2 = (kotlinx.coroutines.internal.C10110p) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.C10110p) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10110p.m14256I(kotlinx.coroutines.internal.y):kotlinx.coroutines.internal.p");
    }

    /* renamed from: J */
    private final C10110p m14255J(C10110p pVar) {
        while (pVar.mo14248Q()) {
            pVar = (C10110p) pVar._prev;
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final void m14254K(C10110p pVar) {
        C10110p pVar2;
        do {
            pVar2 = (C10110p) pVar._prev;
            if (m14253L() != pVar) {
                return;
            }
        } while (!C2113b.m38965a(f22308l, pVar, pVar2, this));
        if (mo14248Q()) {
            pVar.m14256I(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final C10128z m14245U() {
        C10128z zVar = (C10128z) this._removedRef;
        if (zVar != null) {
            return zVar;
        }
        C10128z zVar2 = new C10128z(this);
        f22309m.lazySet(this, zVar2);
        return zVar2;
    }

    /* renamed from: F */
    public final void m14259F(C10110p pVar) {
        do {
        } while (!m14251N().m14258G(pVar, this));
    }

    /* renamed from: G */
    public final boolean m14258G(C10110p pVar, C10110p pVar2) {
        f22308l.lazySet(pVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22307k;
        atomicReferenceFieldUpdater.lazySet(pVar, pVar2);
        if (!C2113b.m38965a(atomicReferenceFieldUpdater, this, pVar2, pVar)) {
            return false;
        }
        pVar.m14254K(pVar2);
        return true;
    }

    /* renamed from: H */
    public final boolean m14257H(C10110p pVar) {
        f22308l.lazySet(pVar, this);
        f22307k.lazySet(pVar, this);
        while (m14253L() == this) {
            if (C2113b.m38965a(f22307k, this, this, pVar)) {
                pVar.m14254K(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final Object m14253L() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC10127y)) {
                return obj;
            }
            ((AbstractC10127y) obj).mo14023c(this);
        }
    }

    /* renamed from: M */
    public final C10110p m14252M() {
        return C10109o.m14263c(m14253L());
    }

    /* renamed from: N */
    public final C10110p m14251N() {
        C10110p I = m14256I(null);
        return I == null ? m14255J((C10110p) this._prev) : I;
    }

    /* renamed from: O */
    public final void m14250O() {
        ((C10128z) m14253L()).f22338a.m14249P();
    }

    /* renamed from: P */
    public final void m14249P() {
        C10110p pVar = this;
        while (true) {
            Object L = pVar.m14253L();
            if (L instanceof C10128z) {
                pVar = ((C10128z) L).f22338a;
            } else {
                pVar.m14256I(null);
                return;
            }
        }
    }

    /* renamed from: Q */
    public boolean mo14248Q() {
        return m14253L() instanceof C10128z;
    }

    /* renamed from: R */
    public boolean mo3849R() {
        return m14246T() == null;
    }

    /* renamed from: S */
    public final C10110p m14247S() {
        while (true) {
            C10110p pVar = (C10110p) m14253L();
            if (pVar == this) {
                return null;
            }
            if (pVar.mo3849R()) {
                return pVar;
            }
            pVar.m14250O();
        }
    }

    /* renamed from: T */
    public final C10110p m14246T() {
        Object L;
        C10110p pVar;
        do {
            L = m14253L();
            if (L instanceof C10128z) {
                return ((C10128z) L).f22338a;
            }
            if (L == this) {
                return (C10110p) L;
            }
            pVar = (C10110p) L;
        } while (!C2113b.m38965a(f22307k, this, L, pVar.m14245U()));
        pVar.m14256I(null);
        return null;
    }

    /* renamed from: V */
    public final int m14244V(C10110p pVar, C10110p pVar2, AbstractC10112b bVar) {
        f22308l.lazySet(pVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22307k;
        atomicReferenceFieldUpdater.lazySet(pVar, pVar2);
        bVar.f22311c = pVar2;
        if (!C2113b.m38965a(atomicReferenceFieldUpdater, this, pVar2, bVar)) {
            return 0;
        }
        if (bVar.mo14023c(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new C9940a0(this) { // from class: kotlinx.coroutines.internal.p.e
            @Override // p107fg.AbstractC7146g
            public Object get() {
                return C10149n0.m14165a(this.receiver);
            }
        } + '@' + C10149n0.m14164b(this);
    }
}
