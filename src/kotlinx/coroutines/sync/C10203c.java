package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C2113b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.C10160q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.AbstractC10086d;
import kotlinx.coroutines.internal.AbstractC10127y;
import kotlinx.coroutines.internal.C10087d0;
import kotlinx.coroutines.internal.C10108n;
import kotlinx.coroutines.internal.C10110p;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\n\u000b\u0005\bB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m15073d2 = {"Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/sync/b;", "", "owner", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "(Ljava/lang/Object;)Z", "a", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.sync.c */
/* loaded from: classes8.dex */
public final class C10203c implements AbstractC10202b {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f22447a = AtomicReferenceFieldUpdater.newUpdater(C10203c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m15073d2 = {"Lkotlinx/coroutines/sync/c$a;", "Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/sync/c;", "", "Y", "", "W", "", "toString", "Lkotlinx/coroutines/CancellableContinuation;", "q", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$a */
    /* loaded from: classes8.dex */
    public final class C10204a extends AbstractC10205b {

        /* renamed from: q */
        private final CancellableContinuation<Unit> f22448q;

        @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
        /* renamed from: kotlinx.coroutines.sync.c$a$a */
        /* loaded from: classes8.dex */
        static final class C0313a extends AbstractC9973s implements Function1<Throwable, Unit> {

            /* renamed from: k */
            final /* synthetic */ C10203c f22450k;

            /* renamed from: l */
            final /* synthetic */ C10204a f22451l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0313a(C10203c cVar, C10204a aVar) {
                super(1);
                this.f22450k = cVar;
                this.f22451l = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f22042a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                this.f22450k.mo14008b(this.f22451l.f22453n);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C10204a(Object obj, CancellableContinuation<? super Unit> cancellableContinuation) {
            super(obj);
            this.f22448q = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.sync.C10203c.AbstractC10205b
        /* renamed from: W */
        public void mo14005W() {
            this.f22448q.mo14151B(C10160q.f22367a);
        }

        @Override // kotlinx.coroutines.sync.C10203c.AbstractC10205b
        /* renamed from: Y */
        public boolean mo14003Y() {
            if (m14004X() && this.f22448q.mo14121u(Unit.f22042a, null, new C0313a(C10203c.this, this)) != null) {
                return true;
            }
            return false;
        }

        @Override // kotlinx.coroutines.internal.C10110p
        public String toString() {
            return "LockCont[" + this.f22453n + ", " + this.f22448q + "] for " + C10203c.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m15073d2 = {"Lkotlinx/coroutines/sync/c$b;", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/a1;", "", "X", "()Z", "", "dispose", "()V", "Y", "W", "", "n", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$b */
    /* loaded from: classes8.dex */
    public abstract class AbstractC10205b extends C10110p implements AbstractC10000a1 {

        /* renamed from: p */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f22452p = AtomicIntegerFieldUpdater.newUpdater(AbstractC10205b.class, "isTaken");
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: n */
        public final Object f22453n;

        public AbstractC10205b(Object obj) {
            this.f22453n = obj;
        }

        /* renamed from: W */
        public abstract void mo14005W();

        /* renamed from: X */
        public final boolean m14004X() {
            return f22452p.compareAndSet(this, 0, 1);
        }

        /* renamed from: Y */
        public abstract boolean mo14003Y();

        @Override // kotlinx.coroutines.AbstractC10000a1
        public final void dispose() {
            mo3849R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m15073d2 = {"Lkotlinx/coroutines/sync/c$c;", "Lkotlinx/coroutines/internal/n;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$c */
    /* loaded from: classes8.dex */
    public static final class C0314c extends C10108n {
        public volatile Object owner;

        public C0314c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.C10110p
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m15073d2 = {"Lkotlinx/coroutines/sync/c$d;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/sync/c;", "affected", "", "k", "failure", "", "j", "Lkotlinx/coroutines/sync/c$c;", "b", "Lkotlinx/coroutines/sync/c$c;", "queue", "<init>", "(Lkotlinx/coroutines/sync/c$c;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.c$d */
    /* loaded from: classes8.dex */
    public static final class C10206d extends AbstractC10086d<C10203c> {

        /* renamed from: b */
        public final C0314c f22455b;

        public C10206d(C0314c cVar) {
            this.f22455b = cVar;
        }

        /* renamed from: j */
        public void mo14002d(C10203c cVar, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = C10208d.f22463f;
            } else {
                obj2 = this.f22455b;
            }
            C2113b.m38965a(C10203c.f22447a, cVar, this, obj2);
        }

        /* renamed from: k */
        public Object mo3922i(C10203c cVar) {
            C10087d0 d0Var;
            if (this.f22455b.m14267W()) {
                return null;
            }
            d0Var = C10208d.f22459b;
            return d0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 6, 0}, m15069xi = 48)
    /* renamed from: kotlinx.coroutines.sync.c$e */
    /* loaded from: classes8.dex */
    public static final class C10207e extends AbstractC9973s implements Function1<Throwable, Unit> {

        /* renamed from: l */
        final /* synthetic */ Object f22457l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10207e(Object obj) {
            super(1);
            this.f22457l = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f22042a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C10203c.this.mo14008b(this.f22457l);
        }
    }

    public C10203c(boolean z) {
        C10201a aVar;
        if (z) {
            aVar = C10208d.f22462e;
        } else {
            aVar = C10208d.f22463f;
        }
        this._state = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        kotlinx.coroutines.C10164r.m14105c(r0, r1);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m14007c(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            kotlin.coroutines.Continuation r0 = tf.C13075b.m4651c(r8)
            kotlinx.coroutines.p r0 = kotlinx.coroutines.C10164r.m14106b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        L_0x000d:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C10201a
            if (r3 == 0) goto L_0x004a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.C10201a) r3
            java.lang.Object r4 = r3.f22446a
            kotlinx.coroutines.internal.d0 r5 = kotlinx.coroutines.sync.C10208d.m13994f()
            if (r4 == r5) goto L_0x002b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C10203c.f22447a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f22446a
            r5.<init>(r3)
            androidx.concurrent.futures.C2113b.m38965a(r4, r6, r2, r5)
            goto L_0x000d
        L_0x002b:
            if (r7 != 0) goto L_0x0032
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.C10208d.m13997c()
            goto L_0x0037
        L_0x0032:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L_0x0037:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.C10203c.f22447a
            boolean r2 = androidx.concurrent.futures.C2113b.m38965a(r4, r6, r2, r3)
            if (r2 == 0) goto L_0x000d
            kotlin.Unit r1 = kotlin.Unit.f22042a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.mo14127o(r1, r2)
            goto L_0x0071
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.C10203c.C0314c
            if (r3 == 0) goto L_0x00a3
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.C10203c.C0314c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 == 0) goto L_0x0088
            r3.m14259F(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L_0x006e
            boolean r2 = r1.m14004X()
            if (r2 != 0) goto L_0x0068
            goto L_0x006e
        L_0x0068:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto L_0x000d
        L_0x006e:
            kotlinx.coroutines.C10164r.m14105c(r0, r1)
        L_0x0071:
            java.lang.Object r7 = r0.m14117y()
            java.lang.Object r0 = tf.C13075b.m4650d()
            if (r7 != r0) goto L_0x007e
            kotlin.coroutines.jvm.internal.C9933g.m14691c(r8)
        L_0x007e:
            java.lang.Object r8 = tf.C13075b.m4650d()
            if (r7 != r8) goto L_0x0085
            return r7
        L_0x0085:
            kotlin.Unit r7 = kotlin.Unit.f22042a
            return r7
        L_0x0088:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x00a3:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.AbstractC10127y
            if (r3 == 0) goto L_0x00ae
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.AbstractC10127y) r2
            r2.mo14023c(r6)
            goto L_0x000d
        L_0x00ae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C10203c.m14007c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.sync.AbstractC10202b
    /* renamed from: a */
    public Object mo14009a(Object obj, Continuation<? super Unit> continuation) {
        Object d;
        if (m14006d(obj)) {
            return Unit.f22042a;
        }
        Object c = m14007c(obj, continuation);
        d = C13080d.m4646d();
        if (c == d) {
            return c;
        }
        return Unit.f22042a;
    }

    @Override // kotlinx.coroutines.sync.AbstractC10202b
    /* renamed from: b */
    public void mo14008b(Object obj) {
        C10201a aVar;
        C10201a aVar2;
        C10087d0 d0Var;
        C0314c cVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C10201a) {
                if (obj == null) {
                    Object obj3 = ((C10201a) obj2).f22446a;
                    d0Var = C10208d.f22461d;
                    if (obj3 == d0Var) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (((C10201a) obj2).f22446a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar2.f22446a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22447a;
                aVar = C10208d.f22463f;
                if (C2113b.m38965a(atomicReferenceFieldUpdater, this, obj2, aVar)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC10127y) {
                ((AbstractC10127y) obj2).mo14023c(this);
            } else if (obj2 instanceof C0314c) {
                if (obj != null) {
                    if (((C0314c) obj2).owner != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                C0314c cVar2 = (C0314c) obj2;
                C10110p S = cVar2.m14247S();
                if (S == null) {
                    C10206d dVar = new C10206d(cVar2);
                    if (C2113b.m38965a(f22447a, this, obj2, dVar) && dVar.mo14023c(this) == null) {
                        return;
                    }
                } else {
                    AbstractC10205b bVar = (AbstractC10205b) S;
                    if (bVar.mo14003Y()) {
                        Object obj4 = bVar.f22453n;
                        if (obj4 == null) {
                            obj4 = C10208d.f22460c;
                        }
                        cVar2.owner = obj4;
                        bVar.mo14005W();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean m14006d(Object obj) {
        C10087d0 d0Var;
        C10201a aVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C10201a) {
                Object obj3 = ((C10201a) obj2).f22446a;
                d0Var = C10208d.f22461d;
                if (obj3 != d0Var) {
                    return false;
                }
                if (obj == null) {
                    aVar = C10208d.f22462e;
                } else {
                    aVar = new C10201a(obj);
                }
                if (C2113b.m38965a(f22447a, this, obj2, aVar)) {
                    return true;
                }
            } else if (obj2 instanceof C0314c) {
                if (((C0314c) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof AbstractC10127y) {
                ((AbstractC10127y) obj2).mo14023c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C10201a) {
                return "Mutex[" + ((C10201a) obj).f22446a + ']';
            } else if (obj instanceof AbstractC10127y) {
                ((AbstractC10127y) obj).mo14023c(this);
            } else if (obj instanceof C0314c) {
                return "Mutex[" + ((C0314c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
