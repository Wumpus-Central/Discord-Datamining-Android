package p188k2;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p254o2.C11175h;
import p254o2.C11184n;

/* renamed from: k2.h */
/* loaded from: classes.dex */
public class C9734h {

    /* renamed from: a */
    private final List<AbstractC9721a<C11184n, Path>> f21630a;

    /* renamed from: b */
    private final List<AbstractC9721a<Integer, Integer>> f21631b;

    /* renamed from: c */
    private final List<C11175h> f21632c;

    public C9734h(List<C11175h> list) {
        this.f21632c = list;
        this.f21630a = new ArrayList(list.size());
        this.f21631b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f21630a.add(list.get(i).m10588b().mo12624a());
            this.f21631b.add(list.get(i).m10587c().mo12624a());
        }
    }

    /* renamed from: a */
    public List<AbstractC9721a<C11184n, Path>> m15479a() {
        return this.f21630a;
    }

    /* renamed from: b */
    public List<C11175h> m15478b() {
        return this.f21632c;
    }

    /* renamed from: c */
    public List<AbstractC9721a<Integer, Integer>> m15477c() {
        return this.f21631b;
    }
}
