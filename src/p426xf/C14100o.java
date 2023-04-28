package p426xf;

import ag.AbstractC1385a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.sequences.Sequence;
import p163j$.util.Iterator;
import p163j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Lxf/o;", "Lkotlin/sequences/Sequence;", "", "", "iterator", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: xf.o */
/* loaded from: classes8.dex */
public final class C14100o implements Sequence<String> {

    /* renamed from: a */
    private final BufferedReader f31824a;

    @Metadata(m15074d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m15073d2 = {"xf/o$a", "", "", "", "hasNext", "b", "k", "Ljava/lang/String;", "nextValue", "l", "Z", "done", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: xf.o$a */
    /* loaded from: classes8.dex */
    public static final class C14101a implements Iterator<String>, AbstractC1385a, p163j$.util.Iterator {

        /* renamed from: k */
        private String f31825k;

        /* renamed from: l */
        private boolean f31826l;

        C14101a() {
        }

        /* renamed from: b */
        public String next() {
            if (hasNext()) {
                String str = this.f31825k;
                this.f31825k = null;
                C9971q.m14636d(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // p163j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public boolean hasNext() {
            if (this.f31825k == null && !this.f31826l) {
                String readLine = C14100o.this.f31824a.readLine();
                this.f31825k = readLine;
                if (readLine == null) {
                    this.f31826l = true;
                }
            }
            if (this.f31825k != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, p163j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14100o(BufferedReader reader) {
        C9971q.m14633g(reader, "reader");
        this.f31824a = reader;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<String> iterator() {
        return new C14101a();
    }
}
