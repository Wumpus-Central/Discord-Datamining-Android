package p339sf;

import com.facebook.react.uimanager.ViewProps;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0002J*\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u00002\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m15073d2 = {"Lsf/c;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "d", "Lkotlin/coroutines/CoroutineContext$b;", "element", "", "a", "context", "c", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "i", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "R", "initial", "Lkotlin/Function2;", "operation", "w0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "j0", "", "other", "equals", "hashCode", "", "toString", "k", "Lkotlin/coroutines/CoroutineContext;", ViewProps.LEFT, "l", "Lkotlin/coroutines/CoroutineContext$b;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: sf.c */
/* loaded from: classes8.dex */
public final class C12887c implements CoroutineContext, Serializable {

    /* renamed from: k */
    private final CoroutineContext f28961k;

    /* renamed from: l */
    private final CoroutineContext.AbstractC9924b f28962l;

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$b;)Ljava/lang/String;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: sf.c$a */
    /* loaded from: classes8.dex */
    static final class C12888a extends AbstractC9973s implements Function2<String, CoroutineContext.AbstractC9924b, String> {

        /* renamed from: k */
        public static final C12888a f28963k = new C12888a();

        C12888a() {
            super(2);
        }

        /* renamed from: a */
        public final String invoke(String acc, CoroutineContext.AbstractC9924b element) {
            boolean z;
            C9971q.m14633g(acc, "acc");
            C9971q.m14633g(element, "element");
            if (acc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C12887c(CoroutineContext left, CoroutineContext.AbstractC9924b element) {
        C9971q.m14633g(left, "left");
        C9971q.m14633g(element, "element");
        this.f28961k = left;
        this.f28962l = element;
    }

    /* renamed from: a */
    private final boolean m5187a(CoroutineContext.AbstractC9924b bVar) {
        return C9971q.m14638b(mo3484i(bVar.getKey()), bVar);
    }

    /* renamed from: c */
    private final boolean m5186c(C12887c cVar) {
        while (m5187a(cVar.f28962l)) {
            CoroutineContext coroutineContext = cVar.f28961k;
            if (coroutineContext instanceof C12887c) {
                cVar = (C12887c) coroutineContext;
            } else {
                C9971q.m14635e(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m5187a((CoroutineContext.AbstractC9924b) coroutineContext);
            }
        }
        return false;
    }

    /* renamed from: d */
    private final int m5185d() {
        int i = 2;
        C12887c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f28961k;
            cVar = coroutineContext instanceof C12887c ? (C12887c) coroutineContext : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12887c) {
                C12887c cVar = (C12887c) obj;
                if (cVar.m5185d() != m5185d() || !cVar.m5186c(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: f0 */
    public CoroutineContext mo3485f0(CoroutineContext coroutineContext) {
        return CoroutineContext.C9923a.m14712a(this, coroutineContext);
    }

    public int hashCode() {
        return this.f28961k.hashCode() + this.f28962l.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: i */
    public <E extends CoroutineContext.AbstractC9924b> E mo3484i(CoroutineContext.AbstractC9926c<E> key) {
        C9971q.m14633g(key, "key");
        C12887c cVar = this;
        while (true) {
            E e = (E) cVar.f28962l.mo3484i(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = cVar.f28961k;
            if (!(coroutineContext instanceof C12887c)) {
                return (E) coroutineContext.mo3484i(key);
            }
            cVar = (C12887c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo3483j0(CoroutineContext.AbstractC9926c<?> key) {
        C9971q.m14633g(key, "key");
        if (this.f28962l.mo3484i(key) != null) {
            return this.f28961k;
        }
        CoroutineContext j0 = this.f28961k.mo3483j0(key);
        if (j0 == this.f28961k) {
            return this;
        }
        if (j0 == C12893f.f28966k) {
            return this.f28962l;
        }
        return new C12887c(j0, this.f28962l);
    }

    public String toString() {
        return '[' + ((String) mo3482w0("", C12888a.f28963k)) + ']';
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: w0 */
    public <R> R mo3482w0(R r, Function2<? super R, ? super CoroutineContext.AbstractC9924b, ? extends R> operation) {
        C9971q.m14633g(operation, "operation");
        return (R) operation.invoke((Object) this.f28961k.mo3482w0(r, operation), this.f28962l);
    }
}
