package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AbstractC9963l;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m15073d2 = {"Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/coroutines/jvm/internal/i;", "Lkotlin/jvm/internal/l;", "", "", "toString", "", "k", "I", "getArity", "()I", "arity", "Lkotlin/coroutines/Continuation;", "completion", "<init>", "(ILkotlin/coroutines/Continuation;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.j */
/* loaded from: classes8.dex */
public abstract class AbstractC9937j extends AbstractC9936i implements AbstractC9963l<Object> {

    /* renamed from: k */
    private final int f22066k;

    public AbstractC9937j(int i, Continuation<Object> continuation) {
        super(continuation);
        this.f22066k = i;
    }

    @Override // kotlin.jvm.internal.AbstractC9963l
    public int getArity() {
        return this.f22066k;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h = C9951f0.m14678h(this);
        C9971q.m14634f(h, "renderLambdaToString(this)");
        return h;
    }
}
