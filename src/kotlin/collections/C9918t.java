package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p267of.AbstractC11267c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lkotlin/collections/t;", "T", "Lof/c;", "", "index", "get", "(I)Ljava/lang/Object;", "", "l", "Ljava/util/List;", "delegate", "a", "()I", "size", "<init>", "(Ljava/util/List;)V", "kotlin-stdlib"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlin.collections.t */
/* loaded from: classes8.dex */
public class C9918t<T> extends AbstractC11267c<T> {

    /* renamed from: l */
    private final List<T> f22057l;

    /* JADX WARN: Multi-variable type inference failed */
    public C9918t(List<? extends T> delegate) {
        C9971q.m14633g(delegate, "delegate");
        this.f22057l = delegate;
    }

    @Override // p267of.AbstractC11263a
    /* renamed from: a */
    public int mo5832a() {
        return this.f22057l.size();
    }

    @Override // p267of.AbstractC11267c, java.util.List
    public T get(int i) {
        int H;
        List<T> list = this.f22057l;
        H = C9912p.m14795H(this, i);
        return list.get(H);
    }
}
