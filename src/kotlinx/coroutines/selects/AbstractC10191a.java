package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002JG\u0010\t\u001a\u00020\b\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00042\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rH'ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/selects/a;", "R", "", "Q", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "", "A", "(Lkotlinx/coroutines/selects/c;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "Lkotlin/Function1;", "i", "(JLkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.selects.a */
/* loaded from: classes8.dex */
public interface AbstractC10191a<R> {
    /* renamed from: A */
    <Q> void mo14037A(AbstractC10197c<? extends Q> cVar, Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2);

    /* renamed from: i */
    void mo14029i(long j, Function1<? super Continuation<? super R>, ? extends Object> function1);
}
