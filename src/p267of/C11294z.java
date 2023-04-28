package p267of;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9937j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p306qi.AbstractC12188i;
import p306qi.C12190k;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001aH\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\f\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¨\u0006\u000f"}, m15073d2 = {"", "size", "step", "", "a", "T", "Lkotlin/sequences/Sequence;", "", "partialWindows", "reuseBuffer", "", "c", "", "iterator", "b", "kotlin-stdlib"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: of.z */
/* loaded from: classes8.dex */
public final class C11294z {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m15073d2 = {"T", "Lqi/i;", "", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m14701f = "SlidingWindow.kt", m14700l = {34, 40, 49, 55, 58}, m14699m = "invokeSuspend")
    /* renamed from: of.z$a */
    /* loaded from: classes8.dex */
    public static final class C11295a extends AbstractC9937j implements Function2<AbstractC12188i<? super List<? extends T>>, Continuation<? super Unit>, Object> {

        /* renamed from: l */
        Object f25215l;

        /* renamed from: m */
        Object f25216m;

        /* renamed from: n */
        int f25217n;

        /* renamed from: o */
        int f25218o;

        /* renamed from: p */
        private /* synthetic */ Object f25219p;

        /* renamed from: q */
        final /* synthetic */ int f25220q;

        /* renamed from: r */
        final /* synthetic */ int f25221r;

        /* renamed from: s */
        final /* synthetic */ Iterator<T> f25222s;

        /* renamed from: t */
        final /* synthetic */ boolean f25223t;

        /* renamed from: u */
        final /* synthetic */ boolean f25224u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11295a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super C11295a> continuation) {
            super(2, continuation);
            this.f25220q = i;
            this.f25221r = i2;
            this.f25222s = it;
            this.f25223t = z;
            this.f25224u = z2;
        }

        /* renamed from: a */
        public final Object invoke(AbstractC12188i<? super List<? extends T>> iVar, Continuation<? super Unit> continuation) {
            return ((C11295a) create(iVar, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11295a aVar = new C11295a(this.f25220q, this.f25221r, this.f25222s, this.f25223t, this.f25224u, continuation);
            aVar.f25219p = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a6 -> B:15:0x0058). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x011d -> B:58:0x0120). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014b -> B:71:0x014e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p267of.C11294z.C11295a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m15073d2 = {"of/z$b", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: of.z$b */
    /* loaded from: classes8.dex */
    public static final class C11296b implements Sequence<List<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Sequence f25225a;

        /* renamed from: b */
        final /* synthetic */ int f25226b;

        /* renamed from: c */
        final /* synthetic */ int f25227c;

        /* renamed from: d */
        final /* synthetic */ boolean f25228d;

        /* renamed from: e */
        final /* synthetic */ boolean f25229e;

        public C11296b(Sequence sequence, int i, int i2, boolean z, boolean z2) {
            this.f25225a = sequence;
            this.f25226b = i;
            this.f25227c = i2;
            this.f25228d = z;
            this.f25229e = z2;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<List<? extends T>> iterator() {
            return C11294z.m10228b(this.f25225a.iterator(), this.f25226b, this.f25227c, this.f25228d, this.f25229e);
        }
    }

    /* renamed from: a */
    public static final void m10229a(int i, int i2) {
        boolean z;
        String str;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final <T> Iterator<List<T>> m10228b(Iterator<? extends T> iterator, int i, int i2, boolean z, boolean z2) {
        Iterator<List<T>> a;
        C9971q.m14633g(iterator, "iterator");
        if (!iterator.hasNext()) {
            return C11275h.f25199k;
        }
        a = C12190k.m7452a(new C11295a(i, i2, iterator, z2, z, null));
        return a;
    }

    /* renamed from: c */
    public static final <T> Sequence<List<T>> m10227c(Sequence<? extends T> sequence, int i, int i2, boolean z, boolean z2) {
        C9971q.m14633g(sequence, "<this>");
        m10229a(i, i2);
        return new C11296b(sequence, i, i2, z, z2);
    }
}
