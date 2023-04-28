package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m15073d2 = {"Lkotlinx/coroutines/a0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "result", "Lkotlin/Function1;", "", "", "b", "Lkotlin/jvm/functions/Function1;", "onCancellation", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a0 */
/* loaded from: classes8.dex */
public final class C9999a0 {

    /* renamed from: a */
    public final Object f22123a;

    /* renamed from: b */
    public final Function1<Throwable, Unit> f22124b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9999a0(Object obj, Function1<? super Throwable, Unit> function1) {
        this.f22123a = obj;
        this.f22124b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9999a0)) {
            return false;
        }
        C9999a0 a0Var = (C9999a0) obj;
        return C9971q.m14638b(this.f22123a, a0Var.f22123a) && C9971q.m14638b(this.f22124b, a0Var.f22124b);
    }

    public int hashCode() {
        Object obj = this.f22123a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f22124b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f22123a + ", onCancellation=" + this.f22124b + ')';
    }
}
