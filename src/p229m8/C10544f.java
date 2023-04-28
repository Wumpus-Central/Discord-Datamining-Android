package p229m8;

import java.util.Collections;
import java.util.List;

/* renamed from: m8.f */
/* loaded from: classes7.dex */
public class C10544f {

    /* renamed from: a */
    public final String f23337a;

    /* renamed from: b */
    public final long f23338b;

    /* renamed from: c */
    public final List<C10538a> f23339c;

    /* renamed from: d */
    public final List<C10543e> f23340d;

    /* renamed from: e */
    public final C10542d f23341e;

    public C10544f(String str, long j, List<C10538a> list, List<C10543e> list2) {
        this(str, j, list, list2, null);
    }

    /* renamed from: a */
    public int m12849a(int i) {
        int size = this.f23339c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f23339c.get(i2).f23299b == i) {
                return i2;
            }
        }
        return -1;
    }

    public C10544f(String str, long j, List<C10538a> list, List<C10543e> list2, C10542d dVar) {
        this.f23337a = str;
        this.f23338b = j;
        this.f23339c = Collections.unmodifiableList(list);
        this.f23340d = Collections.unmodifiableList(list2);
        this.f23341e = dVar;
    }
}
