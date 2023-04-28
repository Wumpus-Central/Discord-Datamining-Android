package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9930d;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.C10164r;
import nf.C11090s;
import p372ui.EnumC13337e;
import tf.C13076c;
import tf.C13080d;
import vi.AbstractC13511a;
import vi.AbstractC13526k;
import vi.C13512b;

@Metadata(m15074d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001EB\u001f\u0012\u0006\u0010H\u001a\u00020\u0015\u0012\u0006\u0010J\u001a\u00020\u0015\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\b`\u0010aJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00052\u0006\u0010(\u001a\u00020\u000eH\u0002J\u001b\u0010*\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u00132\u0014\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u0013H\u0002¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u0002022\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u0010\nJ\u001b\u00106\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u0010\u001bJ\u000f\u0010\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0001\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010,0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010>J&\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010C\u001a\u00020BH\u0016R\u0014\u0010H\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010U\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010GR\u0016\u0010V\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010GR\u0014\u0010X\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u00107R\u0014\u0010Z\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010YR\u0014\u0010\\\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u00107R\u0014\u0010_\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006b"}, m15073d2 = {"Lkotlinx/coroutines/flow/l;", "T", "Lvi/a;", "Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lvi/k;", "value", "", "N", "(Ljava/lang/Object;)Z", "O", "", "A", "", "newHead", "x", "item", "D", "", "curBuffer", "", "curSize", "newSize", "L", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "C", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/l$a;", "emitter", "u", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "R", "v", "slot", "Q", "P", "index", "H", "t", "(Lkotlinx/coroutines/flow/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "E", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "M", "emit", "()J", "oldIndex", "S", "(J)[Lkotlin/coroutines/Continuation;", "y", "size", "z", "(I)[Lkotlinx/coroutines/flow/n;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lui/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "a", "n", "I", "replay", "o", "bufferCapacity", "p", "Lui/e;", "q", "[Ljava/lang/Object;", "buffer", "r", "J", "replayIndex", "s", "minCollectorIndex", "bufferSize", "queueSize", "G", "head", "()I", "replaySize", "K", "totalSize", "F", "bufferEndIndex", "queueEndIndex", "<init>", "(IILui/e;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.l */
/* loaded from: classes8.dex */
public class C10053l<T> extends AbstractC13511a<C10058n> implements MutableSharedFlow<T>, Flow, AbstractC13526k<T> {

    /* renamed from: n */
    private final int f22213n;

    /* renamed from: o */
    private final int f22214o;

    /* renamed from: p */
    private final EnumC13337e f22215p;

    /* renamed from: q */
    private Object[] f22216q;

    /* renamed from: r */
    private long f22217r;

    /* renamed from: s */
    private long f22218s;

    /* renamed from: t */
    private int f22219t;

    /* renamed from: u */
    private int f22220u;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lkotlinx/coroutines/flow/l$a;", "Lkotlinx/coroutines/a1;", "", "dispose", "Lkotlinx/coroutines/flow/l;", "k", "Lkotlinx/coroutines/flow/l;", "flow", "", "l", "J", "index", "", "m", "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", "n", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(Lkotlinx/coroutines/flow/l;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.l$a */
    /* loaded from: classes8.dex */
    public static final class C10054a implements AbstractC10000a1 {

        /* renamed from: k */
        public final C10053l<?> f22221k;

        /* renamed from: l */
        public long f22222l;

        /* renamed from: m */
        public final Object f22223m;

        /* renamed from: n */
        public final Continuation<Unit> f22224n;

        /* JADX WARN: Multi-variable type inference failed */
        public C10054a(C10053l<?> lVar, long j, Object obj, Continuation<? super Unit> continuation) {
            this.f22221k = lVar;
            this.f22222l = j;
            this.f22223m = obj;
            this.f22224n = continuation;
        }

        @Override // kotlinx.coroutines.AbstractC10000a1
        public void dispose() {
            this.f22221k.m14381u(this);
        }
    }

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.flow.l$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C10055b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22225a;

        static {
            int[] iArr = new int[EnumC13337e.values().length];
            iArr[EnumC13337e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13337e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13337e.DROP_OLDEST.ordinal()] = 3;
            f22225a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    @AbstractC9931e(m14702c = "kotlinx.coroutines.flow.SharedFlowImpl", m14701f = "SharedFlow.kt", m14700l = {373, 380, 383}, m14699m = "collect$suspendImpl")
    /* renamed from: kotlinx.coroutines.flow.l$c */
    /* loaded from: classes8.dex */
    public static final class C10056c extends AbstractC9930d {

        /* renamed from: k */
        Object f22226k;

        /* renamed from: l */
        Object f22227l;

        /* renamed from: m */
        Object f22228m;

        /* renamed from: n */
        Object f22229n;

        /* renamed from: o */
        /* synthetic */ Object f22230o;

        /* renamed from: p */
        final /* synthetic */ C10053l<T> f22231p;

        /* renamed from: q */
        int f22232q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10056c(C10053l<T> lVar, Continuation<? super C10056c> continuation) {
            super(continuation);
            this.f22231p = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            this.f22230o = obj;
            this.f22232q |= Integer.MIN_VALUE;
            return C10053l.m14379w(this.f22231p, null, this);
        }
    }

    public C10053l(int i, int i2, EnumC13337e eVar) {
        this.f22213n = i;
        this.f22214o = i2;
        this.f22215p = eVar;
    }

    /* renamed from: A */
    private final void m14412A() {
        Object[] objArr = this.f22216q;
        C9971q.m14636d(objArr);
        C10057m.m14370f(objArr, m14406G(), null);
        this.f22219t--;
        long G = m14406G() + 1;
        if (this.f22217r < G) {
            this.f22217r = G;
        }
        if (this.f22218s < G) {
            m14378x(G);
        }
    }

    /* renamed from: B */
    static /* synthetic */ Object m14411B(C10053l lVar, Object obj, Continuation continuation) {
        Object d;
        if (lVar.m14400M(obj)) {
            return Unit.f22042a;
        }
        Object C = lVar.m14410C(obj, continuation);
        d = C13080d.m4646d();
        if (C == d) {
            return C;
        }
        return Unit.f22042a;
    }

    /* renamed from: C */
    private final Object m14410C(T t, Continuation<? super Unit> continuation) {
        Continuation c;
        Continuation<Unit>[] continuationArr;
        C10054a aVar;
        Object d;
        Object d2;
        c = C13076c.m4647c(continuation);
        C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        Continuation<Unit>[] continuationArr2 = C13512b.f30197a;
        synchronized (this) {
            if (m14399N(t)) {
                C11090s.C11091a aVar2 = C11090s.f24606l;
                pVar.resumeWith(C11090s.m10940b(Unit.f22042a));
                continuationArr = m14408E(continuationArr2);
                aVar = null;
            } else {
                C10054a aVar3 = new C10054a(this, m14402K() + m14406G(), t, pVar);
                m14409D(aVar3);
                this.f22220u++;
                if (this.f22214o == 0) {
                    continuationArr2 = m14408E(continuationArr2);
                }
                continuationArr = continuationArr2;
                aVar = aVar3;
            }
        }
        if (aVar != null) {
            C10164r.m14107a(pVar, aVar);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                C11090s.C11091a aVar4 = C11090s.f24606l;
                continuation2.resumeWith(C11090s.m10940b(Unit.f22042a));
            }
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (y == d2) {
            return y;
        }
        return Unit.f22042a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m14409D(Object obj) {
        int K = m14402K();
        Object[] objArr = this.f22216q;
        if (objArr == null) {
            objArr = m14401L(null, 0, 2);
        } else if (K >= objArr.length) {
            objArr = m14401L(objArr, K, objArr.length * 2);
        }
        C10057m.m14370f(objArr, m14406G() + K, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = ((vi.AbstractC13511a) r10).f30194k;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m14408E(kotlin.coroutines.Continuation<kotlin.Unit>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = vi.AbstractC13511a.m3510b(r10)
            if (r1 == 0) goto L_0x0047
            vi.c[] r1 = vi.AbstractC13511a.m3509c(r10)
            if (r1 == 0) goto L_0x0047
            int r2 = r1.length
            r3 = 0
        L_0x000f:
            if (r3 >= r2) goto L_0x0047
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0044
            kotlinx.coroutines.flow.n r4 = (kotlinx.coroutines.flow.C10058n) r4
            kotlin.coroutines.Continuation<? super kotlin.Unit> r5 = r4.f22235b
            if (r5 != 0) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            long r6 = r10.m14397P(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            int r6 = r11.length
            if (r0 < r6) goto L_0x0039
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C9971q.m14634f(r11, r6)
        L_0x0039:
            r6 = r11
            kotlin.coroutines.Continuation[] r6 = (kotlin.coroutines.Continuation[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f22235b = r0
            r0 = r7
        L_0x0044:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0047:
            kotlin.coroutines.Continuation[] r11 = (kotlin.coroutines.Continuation[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10053l.m14408E(kotlin.coroutines.Continuation[]):kotlin.coroutines.Continuation[]");
    }

    /* renamed from: F */
    private final long m14407F() {
        return m14406G() + this.f22219t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final long m14406G() {
        return Math.min(this.f22218s, this.f22217r);
    }

    /* renamed from: H */
    private final Object m14405H(long j) {
        Object e;
        Object[] objArr = this.f22216q;
        C9971q.m14636d(objArr);
        e = C10057m.m14371e(objArr, j);
        if (e instanceof C10054a) {
            return ((C10054a) e).f22223m;
        }
        return e;
    }

    /* renamed from: I */
    private final long m14404I() {
        return m14406G() + this.f22219t + this.f22220u;
    }

    /* renamed from: J */
    private final int m14403J() {
        return (int) ((m14406G() + this.f22219t) - this.f22217r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final int m14402K() {
        return this.f22219t + this.f22220u;
    }

    /* renamed from: L */
    private final Object[] m14401L(Object[] objArr, int i, int i2) {
        boolean z;
        Object e;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f22216q = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long G = m14406G();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + G;
                e = C10057m.m14371e(objArr, j);
                C10057m.m14370f(objArr2, j, e);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final boolean m14399N(T t) {
        if (m3504h() == 0) {
            return m14398O(t);
        }
        if (this.f22219t >= this.f22214o && this.f22218s <= this.f22217r) {
            int i = C10055b.f22225a[this.f22215p.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        m14409D(t);
        int i2 = this.f22219t + 1;
        this.f22219t = i2;
        if (i2 > this.f22214o) {
            m14412A();
        }
        if (m14403J() > this.f22213n) {
            m14395R(this.f22217r + 1, this.f22218s, m14407F(), m14404I());
        }
        return true;
    }

    /* renamed from: O */
    private final boolean m14398O(T t) {
        if (this.f22213n == 0) {
            return true;
        }
        m14409D(t);
        int i = this.f22219t + 1;
        this.f22219t = i;
        if (i > this.f22213n) {
            m14412A();
        }
        this.f22218s = m14406G() + this.f22219t;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final long m14397P(C10058n nVar) {
        long j = nVar.f22234a;
        if (j < m14407F()) {
            return j;
        }
        if (this.f22214o <= 0 && j <= m14406G() && this.f22220u != 0) {
            return j;
        }
        return -1L;
    }

    /* renamed from: Q */
    private final Object m14396Q(C10058n nVar) {
        Object obj;
        Continuation<Unit>[] continuationArr = C13512b.f30197a;
        synchronized (this) {
            long P = m14397P(nVar);
            if (P < 0) {
                obj = C10057m.f22233a;
            } else {
                long j = nVar.f22234a;
                Object H = m14405H(P);
                nVar.f22234a = P + 1;
                continuationArr = m14394S(j);
                obj = H;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                C11090s.C11091a aVar = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(Unit.f22042a));
            }
        }
        return obj;
    }

    /* renamed from: R */
    private final void m14395R(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long G = m14406G(); G < min; G++) {
            Object[] objArr = this.f22216q;
            C9971q.m14636d(objArr);
            C10057m.m14370f(objArr, G, null);
        }
        this.f22217r = j;
        this.f22218s = j2;
        this.f22219t = (int) (j3 - min);
        this.f22220u = (int) (j4 - j3);
    }

    /* renamed from: t */
    private final Object m14382t(C10058n nVar, Continuation<? super Unit> continuation) {
        Continuation c;
        Object d;
        Object d2;
        c = C13076c.m4647c(continuation);
        C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        synchronized (this) {
            if (m14397P(nVar) < 0) {
                nVar.f22235b = pVar;
            } else {
                C11090s.C11091a aVar = C11090s.f24606l;
                pVar.resumeWith(C11090s.m10940b(Unit.f22042a));
            }
            Unit unit = Unit.f22042a;
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        d2 = C13080d.m4646d();
        if (y == d2) {
            return y;
        }
        return Unit.f22042a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m14381u(C10054a aVar) {
        Object e;
        synchronized (this) {
            if (aVar.f22222l >= m14406G()) {
                Object[] objArr = this.f22216q;
                C9971q.m14636d(objArr);
                e = C10057m.m14371e(objArr, aVar.f22222l);
                if (e == aVar) {
                    C10057m.m14370f(objArr, aVar.f22222l, C10057m.f22233a);
                    m14380v();
                    Unit unit = Unit.f22042a;
                }
            }
        }
    }

    /* renamed from: v */
    private final void m14380v() {
        Object e;
        if (this.f22214o != 0 || this.f22220u > 1) {
            Object[] objArr = this.f22216q;
            C9971q.m14636d(objArr);
            while (this.f22220u > 0) {
                e = C10057m.m14371e(objArr, (m14406G() + m14402K()) - 1);
                if (e == C10057m.f22233a) {
                    this.f22220u--;
                    C10057m.m14370f(objArr, m14406G() + m14402K(), null);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|(3:(6:(1:(1:13)(2:14|15))(1:16)|55|17|18|64|(3:33|(3:59|35|(2:57|37)(1:62))(4:58|(1:39)|40|(2:60|42)(1:63))|61))(4:20|49|21|22)|47|48)(5:25|53|26|(2:28|(1:30))|31)|51|32|64|(3:33|(0)(0)|61)))|7|8|(0)(0)|51|32|64|(3:33|(0)(0)|61)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab A[SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m14379w(kotlinx.coroutines.flow.C10053l r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10053l.m14379w(kotlinx.coroutines.flow.l, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = ((vi.AbstractC13511a) r8).f30194k;
     */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m14378x(long r9) {
        /*
            r8 = this;
            int r0 = vi.AbstractC13511a.m3510b(r8)
            if (r0 == 0) goto L_0x0027
            vi.c[] r0 = vi.AbstractC13511a.m3509c(r8)
            if (r0 == 0) goto L_0x0027
            int r1 = r0.length
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x0027
            r3 = r0[r2]
            if (r3 == 0) goto L_0x0024
            kotlinx.coroutines.flow.n r3 = (kotlinx.coroutines.flow.C10058n) r3
            long r4 = r3.f22234a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0024
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0024
            r3.f22234a = r9
        L_0x0024:
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0027:
            r8.f22218s = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10053l.m14378x(long):void");
    }

    /* renamed from: M */
    public boolean m14400M(T t) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArr = C13512b.f30197a;
        synchronized (this) {
            if (m14399N(t)) {
                continuationArr = m14408E(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                C11090s.C11091a aVar = C11090s.f24606l;
                continuation.resumeWith(C11090s.m10940b(Unit.f22042a));
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4 = ((vi.AbstractC13511a) r21).f30194k;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] m14394S(long r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10053l.m14394S(long):kotlin.coroutines.Continuation[]");
    }

    /* renamed from: T */
    public final long m14393T() {
        long j = this.f22217r;
        if (j < this.f22218s) {
            this.f22218s = j;
        }
        return j;
    }

    @Override // vi.AbstractC13526k
    /* renamed from: a */
    public Flow<T> mo3478a(CoroutineContext coroutineContext, int i, EnumC13337e eVar) {
        return C10057m.m14372d(this, coroutineContext, i, eVar);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return m14379w(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return m14411B(this, t, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public C10058n mo3507e() {
        return new C10058n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public C10058n[] mo3506f(int i) {
        return new C10058n[i];
    }
}
