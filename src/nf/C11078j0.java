package nf;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\b@\bX\u0088\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lnf/j0;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "a", "", "toString", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "initializer", "", "l", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: nf.j0 */
/* loaded from: classes8.dex */
public final class C11078j0<T> implements Lazy<T>, Serializable {

    /* renamed from: k */
    private Function0<? extends T> f24592k;

    /* renamed from: l */
    private Object f24593l = C11068f0.f24585a;

    public C11078j0(Function0<? extends T> initializer) {
        C9971q.m14633g(initializer, "initializer");
        this.f24592k = initializer;
    }

    /* renamed from: a */
    public boolean m10956a() {
        return this.f24593l != C11068f0.f24585a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.f24593l == C11068f0.f24585a) {
            Function0<? extends T> function0 = this.f24592k;
            C9971q.m14636d(function0);
            this.f24593l = function0.invoke();
            this.f24592k = null;
        }
        return (T) this.f24593l;
    }

    public String toString() {
        return m10956a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
