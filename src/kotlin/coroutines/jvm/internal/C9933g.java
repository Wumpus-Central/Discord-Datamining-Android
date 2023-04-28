package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b"}, m15073d2 = {"T", "Lkotlin/coroutines/Continuation;", "completion", "a", "frame", "", "b", "c", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: classes8.dex */
public final class C9933g {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Continuation<T> m14693a(Continuation<? super T> completion) {
        C9971q.m14633g(completion, "completion");
        return completion;
    }

    /* renamed from: b */
    public static final void m14692b(Continuation<?> frame) {
        C9971q.m14633g(frame, "frame");
    }

    /* renamed from: c */
    public static final void m14691c(Continuation<?> frame) {
        C9971q.m14633g(frame, "frame");
    }
}
