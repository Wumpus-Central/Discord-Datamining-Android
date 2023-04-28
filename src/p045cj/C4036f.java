package p045cj;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lcj/f;", "", "", "size", "", "b", "array", "", "a", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "arrays", "I", "charsTotal", "<init>", "()V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: cj.f */
/* loaded from: classes8.dex */
public class C4036f {

    /* renamed from: a */
    private final ArrayDeque<char[]> f6631a = new ArrayDeque<>();

    /* renamed from: b */
    private int f6632b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m32981a(char[] array) {
        int i;
        C9971q.m14633g(array, "array");
        synchronized (this) {
            int length = this.f6632b + array.length;
            i = C4032d.f6628a;
            if (length < i) {
                this.f6632b += array.length;
                this.f6631a.addLast(array);
            }
            Unit unit = Unit.f22042a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final char[] m32980b(int i) {
        char[] u;
        synchronized (this) {
            u = this.f6631a.m15055u();
            if (u != null) {
                this.f6632b -= u.length;
            } else {
                u = null;
            }
        }
        if (u == null) {
            return new char[i];
        }
        return u;
    }
}
