package p390w;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w.p2 */
/* loaded from: classes.dex */
public final class C13654p2 {

    /* renamed from: a */
    private final List<AbstractC13658q2> f30505a = new ArrayList();

    /* renamed from: b */
    private static void m3112b(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m3112b(list, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: c */
    private List<int[]> m3111c(int i) {
        ArrayList arrayList = new ArrayList();
        m3112b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* renamed from: a */
    public boolean m3113a(AbstractC13658q2 q2Var) {
        return this.f30505a.add(q2Var);
    }

    /* renamed from: d */
    public boolean m3110d(List<AbstractC13658q2> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f30505a.size()) {
            return false;
        }
        for (int[] iArr : m3111c(this.f30505a.size())) {
            boolean z = true;
            for (int i = 0; i < this.f30505a.size() && (iArr[i] >= list.size() || ((z = z & this.f30505a.get(i).m3104d(list.get(iArr[i]))))); i++) {
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
