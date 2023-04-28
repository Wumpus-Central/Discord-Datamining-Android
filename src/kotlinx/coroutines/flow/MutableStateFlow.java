package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003R\u001c\u0010\b\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m15073d2 = {"Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "Lkotlinx/coroutines/flow/o;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* loaded from: classes8.dex */
public interface MutableStateFlow<T> extends AbstractC10059o<T>, MutableSharedFlow<T> {
    T getValue();

    void setValue(T t);
}
