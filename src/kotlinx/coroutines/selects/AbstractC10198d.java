package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractC10000a1;
import kotlinx.coroutines.internal.AbstractC10082b;
import kotlinx.coroutines.internal.C10110p;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H&J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&R\u0014\u0010\u0015\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m15073d2 = {"Lkotlinx/coroutines/selects/d;", "R", "", "", "s", "Lkotlinx/coroutines/internal/p$c;", "Lkotlinx/coroutines/internal/PrepareOp;", "otherOp", "r", "Lkotlinx/coroutines/internal/b;", "desc", "y", "", "exception", "", "x", "Lkotlinx/coroutines/a1;", "handle", "n", "e", "()Z", "isSelected", "Lkotlin/coroutines/Continuation;", "w", "()Lkotlin/coroutines/Continuation;", "completion", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.d */
/* loaded from: classes8.dex */
public interface AbstractC10198d<R> {
    /* renamed from: e */
    boolean mo14022e();

    /* renamed from: n */
    void mo14021n(AbstractC10000a1 a1Var);

    /* renamed from: r */
    Object mo14020r(C10110p.C10113c cVar);

    /* renamed from: s */
    boolean mo14019s();

    /* renamed from: w */
    Continuation<R> mo14018w();

    /* renamed from: x */
    void mo14017x(Throwable th2);

    /* renamed from: y */
    Object mo14016y(AbstractC10082b bVar);
}
