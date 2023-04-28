package nf;

import androidx.concurrent.futures.C2113b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000 \u0018*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0006B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m15073d2 = {"Lnf/u;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "", "toString", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "initializer", "", "l", "Ljava/lang/Object;", "_value", "m", "final", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "n", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.u */
/* loaded from: classes8.dex */
public final class C11094u<T> implements Lazy<T>, Serializable {

    /* renamed from: n */
    public static final C11095a f24609n = new C11095a(null);

    /* renamed from: o */
    private static final AtomicReferenceFieldUpdater<C11094u<?>, Object> f24610o = AtomicReferenceFieldUpdater.newUpdater(C11094u.class, Object.class, "l");

    /* renamed from: k */
    private volatile Function0<? extends T> f24611k;

    /* renamed from: l */
    private volatile Object f24612l;

    /* renamed from: m */
    private final Object f24613m;

    @Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRd\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m15073d2 = {"Lnf/u$a;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lnf/u;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: nf.u$a */
    /* loaded from: classes8.dex */
    public static final class C11095a {
        private C11095a() {
        }

        public /* synthetic */ C11095a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11094u(Function0<? extends T> initializer) {
        C9971q.m14633g(initializer, "initializer");
        this.f24611k = initializer;
        C11068f0 f0Var = C11068f0.f24585a;
        this.f24612l = f0Var;
        this.f24613m = f0Var;
    }

    /* renamed from: a */
    public boolean m10929a() {
        return this.f24612l != C11068f0.f24585a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t = (T) this.f24612l;
        C11068f0 f0Var = C11068f0.f24585a;
        if (t != f0Var) {
            return t;
        }
        Function0<? extends T> function0 = this.f24611k;
        if (function0 != null) {
            T t2 = (T) function0.invoke();
            if (C2113b.m38965a(f24610o, this, f0Var, t2)) {
                this.f24611k = null;
                return t2;
            }
        }
        return (T) this.f24612l;
    }

    public String toString() {
        return m10929a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
