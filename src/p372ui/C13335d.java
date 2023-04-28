package p372ui;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9897e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10106l0;
import kotlinx.coroutines.internal.C10125x;
import nf.C11088q;

@Metadata(m15074d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020&\u0012 \u0010F\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010Dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`E¢\u0006\u0004\bG\u0010HJ\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00107\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010=\u001a\u00020\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u0014\u0010?\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010C\u001a\u00020@8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006I"}, m15073d2 = {"Lui/d;", "E", "Lui/a;", "", "currentSize", "Lkotlinx/coroutines/internal/d0;", "c0", "(I)Lkotlinx/coroutines/internal/d0;", "element", "", "a0", "(ILjava/lang/Object;)V", "b0", "(I)V", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lui/w;", "send", "i", "(Lui/w;)Ljava/lang/Object;", "U", "()Ljava/lang/Object;", "Lkotlinx/coroutines/selects/d;", "select", "V", "(Lkotlinx/coroutines/selects/d;)Ljava/lang/Object;", "Lui/s;", "receive", "", "K", "(Lui/s;)Z", "wasClosed", "Q", "(Z)V", "n", "I", "capacity", "Lui/e;", "o", "Lui/e;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "p", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "q", "[Ljava/lang/Object;", "buffer", "r", "head", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "s", "isBufferAlwaysFull", "u", "isBufferFull", "O", "isClosedForReceive", "", "j", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILui/e;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: ui.d */
/* loaded from: classes8.dex */
public class C13335d<E> extends AbstractC13323a<E> {

    /* renamed from: n */
    private final int f29891n;

    /* renamed from: o */
    private final EnumC13337e f29892o;

    /* renamed from: p */
    private final ReentrantLock f29893p;

    /* renamed from: q */
    private Object[] f29894q;

    /* renamed from: r */
    private int f29895r;
    private volatile /* synthetic */ int size;

    @Metadata(m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: ui.d$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C13336a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29896a;

        static {
            int[] iArr = new int[EnumC13337e.values().length];
            iArr[EnumC13337e.SUSPEND.ordinal()] = 1;
            iArr[EnumC13337e.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC13337e.DROP_OLDEST.ordinal()] = 3;
            f29896a = iArr;
        }
    }

    public C13335d(int i, EnumC13337e eVar, Function1<? super E, Unit> function1) {
        super(function1);
        this.f29891n = i;
        this.f29892o = eVar;
        if (i < 1 ? false : true) {
            this.f29893p = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C9897e.m14982m(objArr, C13331b.f29880a, 0, 0, 6, null);
            this.f29894q = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: a0 */
    private final void m3919a0(int i, E e) {
        if (i < this.f29891n) {
            m3918b0(i);
            Object[] objArr = this.f29894q;
            objArr[(this.f29895r + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f29894q;
        int i2 = this.f29895r;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f29895r = (i2 + 1) % objArr2.length;
    }

    /* renamed from: b0 */
    private final void m3918b0(int i) {
        Object[] objArr = this.f29894q;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f29891n);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f29894q;
                objArr2[i2] = objArr3[(this.f29895r + i2) % objArr3.length];
            }
            C9897e.m14983l(objArr2, C13331b.f29880a, i, min);
            this.f29894q = objArr2;
            this.f29895r = 0;
        }
    }

    /* renamed from: c0 */
    private final C10087d0 m3917c0(int i) {
        if (i < this.f29891n) {
            this.size = i + 1;
            return null;
        }
        int i2 = C13336a.f29896a[this.f29892o.ordinal()];
        if (i2 == 1) {
            return C13331b.f29882c;
        }
        if (i2 == 2) {
            return C13331b.f29881b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C11088q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13323a
    /* renamed from: K */
    public boolean mo3889K(AbstractC13357s<? super E> sVar) {
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            return super.mo3889K(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: M */
    protected final boolean mo3863M() {
        return false;
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: N */
    protected final boolean mo3862N() {
        return this.size == 0;
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: O */
    public boolean mo3920O() {
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            return super.mo3920O();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    @Override // p372ui.AbstractC13323a
    /* renamed from: Q */
    public void mo3888Q(boolean z) {
        Function1<E, Unit> function1 = this.f29887k;
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            int i = this.size;
            C10106l0 l0Var = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f29894q[this.f29895r];
                if (!(function1 == null || obj == C13331b.f29880a)) {
                    l0Var = C10125x.m14201c(function1, obj, l0Var);
                }
                Object[] objArr = this.f29894q;
                int i3 = this.f29895r;
                objArr[i3] = C13331b.f29880a;
                this.f29895r = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.f22042a;
            reentrantLock.unlock();
            super.mo3888Q(z);
            if (l0Var != null) {
                throw l0Var;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // p372ui.AbstractC13323a
    /* renamed from: U */
    protected Object mo3887U() {
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object l = m3931l();
                if (l == null) {
                    l = C13331b.f29883d;
                }
                return l;
            }
            Object[] objArr = this.f29894q;
            int i2 = this.f29895r;
            Object obj = objArr[i2];
            AbstractC13361w wVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C13331b.f29883d;
            boolean z = false;
            if (i == this.f29891n) {
                AbstractC13361w wVar2 = null;
                while (true) {
                    AbstractC13361w D = m3936D();
                    if (D == null) {
                        wVar = wVar2;
                        break;
                    }
                    C9971q.m14636d(D);
                    if (D.mo3850Z(null) != null) {
                        obj2 = D.mo3852X();
                        z = true;
                        wVar = D;
                        break;
                    }
                    D.mo3848a0();
                    wVar2 = D;
                }
            }
            if (obj2 != C13331b.f29883d && !(obj2 instanceof C13348l)) {
                this.size = i;
                Object[] objArr2 = this.f29894q;
                objArr2[(this.f29895r + i) % objArr2.length] = obj2;
            }
            this.f29895r = (this.f29895r + 1) % this.f29894q.length;
            Unit unit = Unit.f22042a;
            if (z) {
                C9971q.m14636d(wVar);
                wVar.mo3853W();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:15:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x0051, B:24:0x005d, B:27:0x0065, B:28:0x007f, B:30:0x0081, B:32:0x0085, B:34:0x0089, B:35:0x0095, B:37:0x009b, B:40:0x00ab), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // p372ui.AbstractC13323a
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object mo3886V(kotlinx.coroutines.selects.AbstractC10198d<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f29893p
            r0.lock()
            int r1 = r8.size     // Catch: all -> 0x00c4
            if (r1 != 0) goto L_0x0015
            ui.l r9 = r8.m3931l()     // Catch: all -> 0x00c4
            if (r9 != 0) goto L_0x0011
            kotlinx.coroutines.internal.d0 r9 = p372ui.C13331b.f29883d     // Catch: all -> 0x00c4
        L_0x0011:
            r0.unlock()
            return r9
        L_0x0015:
            java.lang.Object[] r2 = r8.f29894q     // Catch: all -> 0x00c4
            int r3 = r8.f29895r     // Catch: all -> 0x00c4
            r4 = r2[r3]     // Catch: all -> 0x00c4
            r5 = 0
            r2[r3] = r5     // Catch: all -> 0x00c4
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: all -> 0x00c4
            kotlinx.coroutines.internal.d0 r2 = p372ui.C13331b.f29883d     // Catch: all -> 0x00c4
            int r3 = r8.f29891n     // Catch: all -> 0x00c4
            r6 = 1
            if (r1 != r3) goto L_0x0080
        L_0x0029:
            ui.a$e r3 = r8.m3956I()     // Catch: all -> 0x00c4
            java.lang.Object r7 = r9.mo14016y(r3)     // Catch: all -> 0x00c4
            if (r7 != 0) goto L_0x0043
            java.lang.Object r5 = r3.m14232o()     // Catch: all -> 0x00c4
            kotlin.jvm.internal.C9971q.m14636d(r5)     // Catch: all -> 0x00c4
            r2 = r5
            ui.w r2 = (p372ui.AbstractC13361w) r2     // Catch: all -> 0x00c4
            java.lang.Object r2 = r2.mo3852X()     // Catch: all -> 0x00c4
            r3 = r6
            goto L_0x0081
        L_0x0043:
            kotlinx.coroutines.internal.d0 r3 = p372ui.C13331b.f29883d     // Catch: all -> 0x00c4
            if (r7 == r3) goto L_0x0080
            java.lang.Object r3 = kotlinx.coroutines.internal.C10084c.f22271b     // Catch: all -> 0x00c4
            if (r7 == r3) goto L_0x0029
            java.lang.Object r2 = kotlinx.coroutines.selects.C10199e.m14012d()     // Catch: all -> 0x00c4
            if (r7 != r2) goto L_0x005d
            r8.size = r1     // Catch: all -> 0x00c4
            java.lang.Object[] r9 = r8.f29894q     // Catch: all -> 0x00c4
            int r1 = r8.f29895r     // Catch: all -> 0x00c4
            r9[r1] = r4     // Catch: all -> 0x00c4
            r0.unlock()
            return r7
        L_0x005d:
            boolean r2 = r7 instanceof p372ui.C13348l     // Catch: all -> 0x00c4
            if (r2 == 0) goto L_0x0065
            r3 = r6
            r2 = r7
            r5 = r2
            goto L_0x0081
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: all -> 0x00c4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00c4
            r1.<init>()     // Catch: all -> 0x00c4
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch: all -> 0x00c4
            r1.append(r7)     // Catch: all -> 0x00c4
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00c4
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00c4
            r9.<init>(r1)     // Catch: all -> 0x00c4
            throw r9     // Catch: all -> 0x00c4
        L_0x0080:
            r3 = 0
        L_0x0081:
            kotlinx.coroutines.internal.d0 r7 = p372ui.C13331b.f29883d     // Catch: all -> 0x00c4
            if (r2 == r7) goto L_0x0095
            boolean r7 = r2 instanceof p372ui.C13348l     // Catch: all -> 0x00c4
            if (r7 != 0) goto L_0x0095
            r8.size = r1     // Catch: all -> 0x00c4
            java.lang.Object[] r9 = r8.f29894q     // Catch: all -> 0x00c4
            int r7 = r8.f29895r     // Catch: all -> 0x00c4
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: all -> 0x00c4
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: all -> 0x00c4
            goto L_0x00ab
        L_0x0095:
            boolean r9 = r9.mo14019s()     // Catch: all -> 0x00c4
            if (r9 != 0) goto L_0x00ab
            r8.size = r1     // Catch: all -> 0x00c4
            java.lang.Object[] r9 = r8.f29894q     // Catch: all -> 0x00c4
            int r1 = r8.f29895r     // Catch: all -> 0x00c4
            r9[r1] = r4     // Catch: all -> 0x00c4
            java.lang.Object r9 = kotlinx.coroutines.selects.C10199e.m14012d()     // Catch: all -> 0x00c4
            r0.unlock()
            return r9
        L_0x00ab:
            int r9 = r8.f29895r     // Catch: all -> 0x00c4
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f29894q     // Catch: all -> 0x00c4
            int r1 = r1.length     // Catch: all -> 0x00c4
            int r9 = r9 % r1
            r8.f29895r = r9     // Catch: all -> 0x00c4
            kotlin.Unit r9 = kotlin.Unit.f22042a     // Catch: all -> 0x00c4
            r0.unlock()
            if (r3 == 0) goto L_0x00c3
            kotlin.jvm.internal.C9971q.m14636d(r5)
            ui.w r5 = (p372ui.AbstractC13361w) r5
            r5.mo3853W()
        L_0x00c3:
            return r4
        L_0x00c4:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p372ui.C13335d.mo3886V(kotlinx.coroutines.selects.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13332c
    /* renamed from: i */
    public Object mo3916i(AbstractC13361w wVar) {
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            return super.mo3916i(wVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: j */
    protected String mo3884j() {
        return "(buffer:capacity=" + this.f29891n + ",size=" + this.size + ')';
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: s */
    protected final boolean mo3861s() {
        return false;
    }

    @Override // p372ui.AbstractC13332c
    /* renamed from: u */
    protected final boolean mo3860u() {
        return this.size == this.f29891n && this.f29892o == EnumC13337e.SUSPEND;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p372ui.AbstractC13332c
    /* renamed from: y */
    public Object mo3882y(E e) {
        AbstractC13359u<E> C;
        ReentrantLock reentrantLock = this.f29893p;
        reentrantLock.lock();
        try {
            int i = this.size;
            C13348l<?> l = m3931l();
            if (l != null) {
                return l;
            }
            C10087d0 c0 = m3917c0(i);
            if (c0 != null) {
                return c0;
            }
            if (i == 0) {
                do {
                    C = mo3937C();
                    if (C != null) {
                        if (C instanceof C13348l) {
                            this.size = i;
                            return C;
                        }
                        C9971q.m14636d(C);
                    }
                } while (C.mo3864z(e, null) == null);
                this.size = i;
                Unit unit = Unit.f22042a;
                reentrantLock.unlock();
                C.mo3865l(e);
                return C.mo3866a();
            }
            m3919a0(i, e);
            return C13331b.f29881b;
        } finally {
            reentrantLock.unlock();
        }
    }
}
