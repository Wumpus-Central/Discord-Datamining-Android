package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u001a\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004JQ\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001e¨\u0006\""}, m15073d2 = {"Lkotlinx/coroutines/y;", "", "Lkotlinx/coroutines/p;", "cont", "", "cause", "", "d", "result", "Lkotlinx/coroutines/n;", "cancelHandler", "Lkotlin/Function1;", "onCancellation", "idempotentResume", "cancelCause", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/n;", "c", "Lkotlin/jvm/functions/Function1;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/n;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y */
/* loaded from: classes8.dex */
final class C10229y {

    /* renamed from: a */
    public final Object f22476a;

    /* renamed from: b */
    public final AbstractC10148n f22477b;

    /* renamed from: c */
    public final Function1<Throwable, Unit> f22478c;

    /* renamed from: d */
    public final Object f22479d;

    /* renamed from: e */
    public final Throwable f22480e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10229y(Object obj, AbstractC10148n nVar, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th2) {
        this.f22476a = obj;
        this.f22477b = nVar;
        this.f22478c = function1;
        this.f22479d = obj2;
        this.f22480e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C10229y m13950b(C10229y yVar, Object obj, AbstractC10148n nVar, Function1 function1, Object obj2, Throwable th2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = yVar.f22476a;
        }
        if ((i & 2) != 0) {
            nVar = yVar.f22477b;
        }
        if ((i & 4) != 0) {
            function1 = yVar.f22478c;
        }
        if ((i & 8) != 0) {
            obj2 = yVar.f22479d;
        }
        if ((i & 16) != 0) {
            th2 = yVar.f22480e;
        }
        return yVar.m13951a(obj, nVar, function1, obj2, th2);
    }

    /* renamed from: a */
    public final C10229y m13951a(Object obj, AbstractC10148n nVar, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th2) {
        return new C10229y(obj, nVar, function1, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m13949c() {
        return this.f22480e != null;
    }

    /* renamed from: d */
    public final void m13948d(C10156p<?> pVar, Throwable th2) {
        AbstractC10148n nVar = this.f22477b;
        if (nVar != null) {
            pVar.m14128n(nVar, th2);
        }
        Function1<Throwable, Unit> function1 = this.f22478c;
        if (function1 != null) {
            pVar.m14126p(function1, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10229y)) {
            return false;
        }
        C10229y yVar = (C10229y) obj;
        return C9971q.m14638b(this.f22476a, yVar.f22476a) && C9971q.m14638b(this.f22477b, yVar.f22477b) && C9971q.m14638b(this.f22478c, yVar.f22478c) && C9971q.m14638b(this.f22479d, yVar.f22479d) && C9971q.m14638b(this.f22480e, yVar.f22480e);
    }

    public int hashCode() {
        Object obj = this.f22476a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC10148n nVar = this.f22477b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.f22478c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f22479d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f22480e;
        if (th2 != null) {
            i = th2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f22476a + ", cancelHandler=" + this.f22477b + ", onCancellation=" + this.f22478c + ", idempotentResume=" + this.f22479d + ", cancelCause=" + this.f22480e + ')';
    }

    public /* synthetic */ C10229y(Object obj, AbstractC10148n nVar, Function1 function1, Object obj2, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : nVar, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th2);
    }
}
