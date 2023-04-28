package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m15073d2 = {"Lkotlin/jvm/internal/s;", "R", "Lkotlin/jvm/internal/l;", "Ljava/io/Serializable;", "", "toString", "", "arity", "I", "getArity", "()I", "<init>", "(I)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.s */
/* loaded from: classes8.dex */
public abstract class AbstractC9973s<R> implements AbstractC9963l<R>, Serializable {
    private final int arity;

    public AbstractC9973s(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.AbstractC9963l
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String i = C9951f0.m14677i(this);
        C9971q.m14634f(i, "renderLambdaToString(this)");
        return i;
    }
}
