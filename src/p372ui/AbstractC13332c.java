package p372ui;

import androidx.concurrent.futures.C2113b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9964l0;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.C10149n0;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.C10164r;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10103k;
import kotlinx.coroutines.internal.C10106l0;
import kotlinx.coroutines.internal.C10108n;
import kotlinx.coroutines.internal.C10109o;
import kotlinx.coroutines.internal.C10110p;
import kotlinx.coroutines.internal.C10125x;
import nf.C11067f;
import nf.C11090s;
import nf.C11093t;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001QB)\u0012 \u00109\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`6¢\u0006\u0004\bP\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\t2\u0018\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0)j\u0002`*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105R.\u00109\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`68\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010D\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u00105R\u0014\u0010F\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010H\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u0010IR\u001a\u0010K\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u0010IR\u0011\u0010M\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bL\u0010AR\u0014\u0010O\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bN\u00105\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, m15073d2 = {"Lui/c;", "E", "Lui/x;", "Lui/l;", "closed", "", "p", "(Lui/l;)Ljava/lang/Throwable;", "element", "", "B", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "q", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lui/l;)V", "cause", "r", "(Ljava/lang/Throwable;)V", "o", "(Lui/l;)V", "", "g", "()I", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lui/w;", "D", "()Lui/w;", "Lui/u;", "A", "(Ljava/lang/Object;)Lui/u;", "w", "Lui/i;", "d", "send", "i", "(Lui/w;)Ljava/lang/Object;", "", "t", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "c", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/p;", "z", "(Lkotlinx/coroutines/internal/p;)V", "C", "()Lui/u;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "k", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Lkotlinx/coroutines/internal/n;", "l", "Lkotlinx/coroutines/internal/n;", "m", "()Lkotlinx/coroutines/internal/n;", "queue", "v", "()Z", "isFullImpl", "n", "queueDebugStateString", "s", "isBufferAlwaysFull", "u", "isBufferFull", "()Lui/l;", "closedForSend", "closedForReceive", "x", "isClosedForSend", "j", "bufferDebugString", "<init>", "a", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.c */
/* loaded from: classes8.dex */
public abstract class AbstractC13332c<E> implements AbstractC13362x<E> {

    /* renamed from: m */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29886m = AtomicReferenceFieldUpdater.newUpdater(AbstractC13332c.class, Object.class, "onCloseHandler");

    /* renamed from: k */
    protected final Function1<E, Unit> f29887k;

    /* renamed from: l */
    private final C10108n f29888l = new C10108n();
    private volatile /* synthetic */ Object onCloseHandler = null;

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m15073d2 = {"Lui/c$a;", "E", "Lui/w;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "Lui/l;", "closed", "Y", "", "toString", "n", "Ljava/lang/Object;", "element", "", "X", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.c$a */
    /* loaded from: classes8.dex */
    public static final class C13333a<E> extends AbstractC13361w {

        /* renamed from: n */
        public final E f29889n;

        public C13333a(E e) {
            this.f29889n = e;
        }

        @Override // p372ui.AbstractC13361w
        /* renamed from: W */
        public void mo3853W() {
        }

        @Override // p372ui.AbstractC13361w
        /* renamed from: X */
        public Object mo3852X() {
            return this.f29889n;
        }

        @Override // p372ui.AbstractC13361w
        /* renamed from: Y */
        public void mo3851Y(C13348l<?> lVar) {
        }

        @Override // p372ui.AbstractC13361w
        /* renamed from: Z */
        public C10087d0 mo3850Z(C10110p.C10113c cVar) {
            C10087d0 d0Var = C10160q.f22367a;
            if (cVar != null) {
                cVar.m14240d();
            }
            return d0Var;
        }

        @Override // kotlinx.coroutines.internal.C10110p
        public String toString() {
            return "SendBuffered@" + C10149n0.m14164b(this) + '(' + this.f29889n + ')';
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, m15073d2 = {"ui/c$b", "Lkotlinx/coroutines/internal/p$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: ui.c$b */
    /* loaded from: classes8.dex */
    public static final class C13334b extends C10110p.AbstractC10112b {

        /* renamed from: d */
        final /* synthetic */ AbstractC13332c f29890d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13334b(C10110p pVar, AbstractC13332c cVar) {
            super(pVar);
            this.f29890d = cVar;
        }

        /* renamed from: k */
        public Object mo3922i(C10110p pVar) {
            if (this.f29890d.mo3860u()) {
                return null;
            }
            return C10109o.m14265a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC13332c(Function1<? super E, Unit> function1) {
        this.f29887k = function1;
    }

    /* renamed from: B */
    private final Object m3938B(E e, Continuation<? super Unit> continuation) {
        Continuation c;
        Object d;
        Object d2;
        AbstractC13361w wVar;
        c = C13076c.m4647c(continuation);
        C10156p b = C10164r.m14106b(c);
        while (true) {
            if (m3924v()) {
                if (this.f29887k == null) {
                    wVar = new C13364y(e, b);
                } else {
                    wVar = new C13365z(e, b, this.f29887k);
                }
                Object i = mo3916i(wVar);
                if (i == null) {
                    C10164r.m14105c(b, wVar);
                    break;
                } else if (i instanceof C13348l) {
                    m3926q(b, e, (C13348l) i);
                    break;
                } else if (i != C13331b.f29884e && !(i instanceof AbstractC13357s)) {
                    throw new IllegalStateException(("enqueueSend returned " + i).toString());
                }
            }
            Object y = mo3882y(e);
            if (y == C13331b.f29881b) {
                C11090s.C11091a aVar = C11090s.f24606l;
                b.resumeWith(C11090s.m10940b(Unit.f22042a));
                break;
            } else if (y != C13331b.f29882c) {
                if (y instanceof C13348l) {
                    m3926q(b, e, (C13348l) y);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + y).toString());
                }
            }
        }
        Object y2 = b.m14117y();
        d = C13080d.m4646d();
        if (y2 == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (y2 == d2) {
            return y2;
        }
        return Unit.f22042a;
    }

    /* renamed from: g */
    private final int m3933g() {
        C10108n nVar = this.f29888l;
        int i = 0;
        for (C10110p pVar = (C10110p) nVar.m14253L(); !C9971q.m14638b(pVar, nVar); pVar = pVar.m14252M()) {
            if (pVar instanceof C10110p) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: n */
    private final String m3929n() {
        String str;
        C10110p M = this.f29888l.m14252M();
        if (M == this.f29888l) {
            return "EmptyQueue";
        }
        if (M instanceof C13348l) {
            str = M.toString();
        } else if (M instanceof AbstractC13357s) {
            str = "ReceiveQueued";
        } else if (M instanceof AbstractC13361w) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + M;
        }
        C10110p N = this.f29888l.m14251N();
        if (N == M) {
            return str;
        }
        String str2 = str + ",queueSize=" + m3933g();
        if (!(N instanceof C13348l)) {
            return str2;
        }
        return str2 + ",closedForSend=" + N;
    }

    /* renamed from: o */
    private final void m3928o(C13348l<?> lVar) {
        AbstractC13357s sVar;
        Object b = C10103k.m14274b(null, 1, null);
        while (true) {
            C10110p N = lVar.m14251N();
            if (N instanceof AbstractC13357s) {
                sVar = (AbstractC13357s) N;
            } else {
                sVar = null;
            }
            if (sVar == null) {
                break;
            } else if (!sVar.mo3849R()) {
                sVar.m14250O();
            } else {
                b = C10103k.m14273c(b, sVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((AbstractC13357s) b).mo3870Y(lVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((AbstractC13357s) arrayList.get(size)).mo3870Y(lVar);
                }
            }
        }
        m3923z(lVar);
    }

    /* renamed from: p */
    private final Throwable m3927p(C13348l<?> lVar) {
        m3928o(lVar);
        return lVar.m3890e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m3926q(Continuation<?> continuation, E e, C13348l<?> lVar) {
        C10106l0 d;
        m3928o(lVar);
        Throwable e0 = lVar.m3890e0();
        Function1<E, Unit> function1 = this.f29887k;
        if (function1 == null || (d = C10125x.m14200d(function1, e, null, 2, null)) == null) {
            C11090s.C11091a aVar = C11090s.f24606l;
            continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(e0)));
            return;
        }
        C11067f.m10981a(d, e0);
        C11090s.C11091a aVar2 = C11090s.f24606l;
        continuation.resumeWith(C11090s.m10940b(C11093t.m10931a(d)));
    }

    /* renamed from: r */
    private final void m3925r(Throwable th2) {
        C10087d0 d0Var;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (d0Var = C13331b.f29885f) && C2113b.m38965a(f29886m, this, obj, d0Var)) {
            ((Function1) C9964l0.m14653d(obj, 1)).invoke(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final boolean m3924v() {
        return !(this.f29888l.m14252M() instanceof AbstractC13359u) && mo3860u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final AbstractC13359u<?> m3939A(E e) {
        C10110p N;
        C10110p pVar = this.f29888l;
        C13333a aVar = new C13333a(e);
        do {
            N = pVar.m14251N();
            if (N instanceof AbstractC13359u) {
                return (AbstractC13359u) N;
            }
        } while (!N.m14258G(aVar, pVar));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public AbstractC13359u<E> mo3937C() {
        C10110p pVar;
        C10110p T;
        C10108n nVar = this.f29888l;
        while (true) {
            pVar = (C10110p) nVar.m14253L();
            if (pVar != nVar && (pVar instanceof AbstractC13359u)) {
                if (((((AbstractC13359u) pVar) instanceof C13348l) && !pVar.mo14248Q()) || (T = pVar.m14246T()) == null) {
                    break;
                }
                T.m14249P();
            }
        }
        pVar = null;
        return (AbstractC13359u) pVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final AbstractC13361w m3936D() {
        C10110p pVar;
        C10110p T;
        C10108n nVar = this.f29888l;
        while (true) {
            pVar = (C10110p) nVar.m14253L();
            if (pVar != nVar && (pVar instanceof AbstractC13361w)) {
                if (((((AbstractC13361w) pVar) instanceof C13348l) && !pVar.mo14248Q()) || (T = pVar.m14246T()) == null) {
                    break;
                }
                T.m14249P();
            }
        }
        pVar = null;
        return (AbstractC13361w) pVar;
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: c */
    public void mo3859c(Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29886m;
        if (!C2113b.m38965a(atomicReferenceFieldUpdater, this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == C13331b.f29885f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        C13348l<?> l = m3931l();
        if (l != null && C2113b.m38965a(atomicReferenceFieldUpdater, this, function1, C13331b.f29885f)) {
            function1.invoke(l.f29909n);
        }
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: d */
    public final Object mo3858d(E e) {
        Object y = mo3882y(e);
        if (y == C13331b.f29881b) {
            return C13342i.f29905b.m3896c(Unit.f22042a);
        }
        if (y == C13331b.f29882c) {
            C13348l<?> l = m3931l();
            if (l == null) {
                return C13342i.f29905b.m3897b();
            }
            return C13342i.f29905b.m3898a(m3927p(l));
        } else if (y instanceof C13348l) {
            return C13342i.f29905b.m3898a(m3927p((C13348l) y));
        } else {
            throw new IllegalStateException(("trySend returned " + y).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo3916i(AbstractC13361w wVar) {
        boolean z;
        C10110p N;
        if (mo3861s()) {
            C10110p pVar = this.f29888l;
            do {
                N = pVar.m14251N();
                if (N instanceof AbstractC13359u) {
                    return N;
                }
            } while (!N.m14258G(wVar, pVar));
            return null;
        }
        C10110p pVar2 = this.f29888l;
        C13334b bVar = new C13334b(wVar, this);
        while (true) {
            C10110p N2 = pVar2.m14251N();
            if (!(N2 instanceof AbstractC13359u)) {
                int V = N2.m14244V(wVar, pVar2, bVar);
                z = true;
                if (V != 1) {
                    if (V == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return N2;
            }
        }
        if (!z) {
            return C13331b.f29884e;
        }
        return null;
    }

    /* renamed from: j */
    protected String mo3884j() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final C13348l<?> m3932k() {
        C10110p M = this.f29888l.m14252M();
        C13348l<?> lVar = M instanceof C13348l ? (C13348l) M : null;
        if (lVar == null) {
            return null;
        }
        m3928o(lVar);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final C13348l<?> m3931l() {
        C10110p N = this.f29888l.m14251N();
        C13348l<?> lVar = N instanceof C13348l ? (C13348l) N : null;
        if (lVar == null) {
            return null;
        }
        m3928o(lVar);
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final C10108n m3930m() {
        return this.f29888l;
    }

    /* renamed from: s */
    protected abstract boolean mo3861s();

    @Override // p372ui.AbstractC13362x
    /* renamed from: t */
    public boolean mo3857t(Throwable th2) {
        boolean z;
        C13348l<?> lVar = new C13348l<>(th2);
        C10110p pVar = this.f29888l;
        while (true) {
            C10110p N = pVar.m14251N();
            z = true;
            if (!(N instanceof C13348l)) {
                if (N.m14258G(lVar, pVar)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            lVar = (C13348l) this.f29888l.m14251N();
        }
        m3928o(lVar);
        if (z) {
            m3925r(th2);
        }
        return z;
    }

    public String toString() {
        return C10149n0.m14165a(this) + '@' + C10149n0.m14164b(this) + '{' + m3929n() + '}' + mo3884j();
    }

    /* renamed from: u */
    protected abstract boolean mo3860u();

    @Override // p372ui.AbstractC13362x
    /* renamed from: w */
    public final Object mo3856w(E e, Continuation<? super Unit> continuation) {
        Object d;
        if (mo3882y(e) == C13331b.f29881b) {
            return Unit.f22042a;
        }
        Object B = m3938B(e, continuation);
        d = C13080d.m4646d();
        if (B == d) {
            return B;
        }
        return Unit.f22042a;
    }

    @Override // p372ui.AbstractC13362x
    /* renamed from: x */
    public final boolean mo3855x() {
        return m3931l() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public Object mo3882y(E e) {
        AbstractC13359u<E> C;
        do {
            C = mo3937C();
            if (C == null) {
                return C13331b.f29882c;
            }
        } while (C.mo3864z(e, null) == null);
        C.mo3865l(e);
        return C.mo3866a();
    }

    /* renamed from: z */
    protected void m3923z(C10110p pVar) {
    }
}
