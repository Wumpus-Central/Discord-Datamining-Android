package p306qi;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import tf.C13076c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\f\b\u0002\u0010\u000e\"\u00020\r2\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m15073d2 = {"T", "Lkotlin/Function2;", "Lqi/i;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlin/sequences/Sequence;", "b", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "", "a", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "", "State", "kotlin-stdlib"}, m15072k = 5, m15071mv = {1, 8, 0}, m15068xs = "kotlin/sequences/SequencesKt")
/* renamed from: qi.k */
/* loaded from: classes8.dex */
public class C12190k {

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"qi/k$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: qi.k$a */
    /* loaded from: classes8.dex */
    public static final class C12191a implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Function2 f27351a;

        public C12191a(Function2 function2) {
            this.f27351a = function2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            Iterator<T> a;
            a = C12190k.m7452a(this.f27351a);
            return a;
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m7452a(Function2<? super AbstractC12188i<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        Continuation<? super Unit> b;
        C9971q.m14633g(block, "block");
        C12187h hVar = new C12187h();
        b = C13076c.m4648b(block, hVar, hVar);
        hVar.m7480i(b);
        return hVar;
    }

    /* renamed from: b */
    public static <T> Sequence<T> m7451b(Function2<? super AbstractC12188i<? super T>, ? super Continuation<? super Unit>, ? extends Object> block) {
        C9971q.m14633g(block, "block");
        return new C12191a(block);
    }
}
