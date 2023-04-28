package p010a9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p119g9.C7510a;
import p119g9.C7557q0;
import p317r8.AbstractC12458f;
import p317r8.C12453b;

/* renamed from: a9.k */
/* loaded from: classes7.dex */
final class C1349k implements AbstractC12458f {

    /* renamed from: k */
    private final List<C1338e> f277k;

    /* renamed from: l */
    private final long[] f278l;

    /* renamed from: m */
    private final long[] f279m;

    public C1349k(List<C1338e> list) {
        this.f277k = Collections.unmodifiableList(new ArrayList(list));
        this.f278l = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            C1338e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f278l;
            jArr[i2] = eVar.f248b;
            jArr[i2 + 1] = eVar.f249c;
        }
        long[] jArr2 = this.f278l;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f279m = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m41259f(C1338e eVar, C1338e eVar2) {
        return Long.compare(eVar.f248b, eVar2.f248b);
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: a */
    public int mo153a(long j) {
        int e = C7557q0.m22155e(this.f279m, j, false, false);
        if (e < this.f279m.length) {
            return e;
        }
        return -1;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: b */
    public List<C12453b> mo152b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f277k.size(); i++) {
            long[] jArr = this.f278l;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                C1338e eVar = this.f277k.get(i);
                C12453b bVar = eVar.f247a;
                if (bVar.f28082d == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: a9.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f;
                f = C1349k.m41259f((C1338e) obj, (C1338e) obj2);
                return f;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C1338e) arrayList2.get(i3)).f247a.m6696a().m6688h((-1) - i3, 1).m6695a());
        }
        return arrayList;
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: c */
    public long mo151c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        if (i >= this.f279m.length) {
            z2 = false;
        }
        C7510a.m22371a(z2);
        return this.f279m[i];
    }

    @Override // p317r8.AbstractC12458f
    /* renamed from: d */
    public int mo150d() {
        return this.f279m.length;
    }
}
