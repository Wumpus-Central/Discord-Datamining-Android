package p326ri;

import ag.AbstractC1385a;
import eg.C6884j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m15073d2 = {"Lri/e;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "iterator", "", "a", "Ljava/lang/CharSequence;", "input", "", "b", "I", "startIndex", "c", "limit", "Lkotlin/Function2;", "Lkotlin/Pair;", "d", "Lkotlin/jvm/functions/Function2;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: ri.e */
/* loaded from: classes8.dex */
public final class C12696e implements Sequence<IntRange> {

    /* renamed from: a */
    private final CharSequence f28544a;

    /* renamed from: b */
    private final int f28545b;

    /* renamed from: c */
    private final int f28546c;

    /* renamed from: d */
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> f28547d;

    @Metadata(m15074d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000e¨\u0006#"}, m15073d2 = {"ri/e$a", "", "Lkotlin/ranges/IntRange;", "", "b", "d", "", "hasNext", "", "k", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "l", "getCurrentStartIndex", "setCurrentStartIndex", "currentStartIndex", "m", "getNextSearchIndex", "setNextSearchIndex", "nextSearchIndex", "n", "Lkotlin/ranges/IntRange;", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextItem", "o", "getCounter", "setCounter", "counter", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: ri.e$a */
    /* loaded from: classes8.dex */
    public static final class C12697a implements Iterator<IntRange>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private int f28548k = -1;

        /* renamed from: l */
        private int f28549l;

        /* renamed from: m */
        private int f28550m;

        /* renamed from: n */
        private IntRange f28551n;

        /* renamed from: o */
        private int f28552o;

        C12697a() {
            int j;
            j = C6884j.m23954j(C12696e.this.f28545b, 0, C12696e.this.f28544a.length());
            this.f28549l = j;
            this.f28550m = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
            if (r0 < r6.f28553p.f28546c) goto L_0x0023;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m5845b() {
            /*
                r6 = this;
                int r0 = r6.f28550m
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f28548k = r1
                r0 = 0
                r6.f28551n = r0
                goto L_0x009e
            L_0x000c:
                ri.e r0 = p326ri.C12696e.this
                int r0 = p326ri.C12696e.m5847d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f28552o
                int r0 = r0 + r3
                r6.f28552o = r0
                ri.e r4 = p326ri.C12696e.this
                int r4 = p326ri.C12696e.m5847d(r4)
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f28550m
                ri.e r4 = p326ri.C12696e.this
                java.lang.CharSequence r4 = p326ri.C12696e.m5848c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f28549l
                ri.e r4 = p326ri.C12696e.this
                java.lang.CharSequence r4 = p326ri.C12696e.m5848c(r4)
                int r4 = p326ri.C12707l.m5800T(r4)
                r0.<init>(r1, r4)
                r6.f28551n = r0
                r6.f28550m = r2
                goto L_0x009c
            L_0x0047:
                ri.e r0 = p326ri.C12696e.this
                kotlin.jvm.functions.Function2 r0 = p326ri.C12696e.m5849b(r0)
                ri.e r4 = p326ri.C12696e.this
                java.lang.CharSequence r4 = p326ri.C12696e.m5848c(r4)
                int r5 = r6.f28550m
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L_0x0077
                kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
                int r1 = r6.f28549l
                ri.e r4 = p326ri.C12696e.this
                java.lang.CharSequence r4 = p326ri.C12696e.m5848c(r4)
                int r4 = p326ri.C12707l.m5800T(r4)
                r0.<init>(r1, r4)
                r6.f28551n = r0
                r6.f28550m = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.m15067a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m15066b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f28549l
                kotlin.ranges.IntRange r4 = eg.C6882h.m23964q(r4, r2)
                r6.f28551n = r4
                int r2 = r2 + r0
                r6.f28549l = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f28550m = r2
            L_0x009c:
                r6.f28548k = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p326ri.C12696e.C12697a.m5845b():void");
        }

        /* renamed from: d */
        public IntRange next() {
            if (this.f28548k == -1) {
                m5845b();
            }
            if (this.f28548k != 0) {
                IntRange intRange = this.f28551n;
                C9971q.m14635e(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f28551n = null;
                this.f28548k = -1;
                return intRange;
            }
            throw new NoSuchElementException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super IntRange> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            if (this.f28548k == -1) {
                m5845b();
            }
            if (this.f28548k == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12696e(CharSequence input, int i, int i2, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        C9971q.m14633g(input, "input");
        C9971q.m14633g(getNextMatch, "getNextMatch");
        this.f28544a = input;
        this.f28545b = i;
        this.f28546c = i2;
        this.f28547d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<IntRange> iterator() {
        return new C12697a();
    }
}
