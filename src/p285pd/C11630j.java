package p285pd;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p066dd.AbstractC6444m;
import p066dd.C6441j;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p137hd.C7996a;

/* renamed from: pd.j */
/* loaded from: classes3.dex */
public final class C11630j extends AbstractC11631k {

    /* renamed from: a */
    private final AbstractC11636p[] f25933a;

    public C11630j(Map<EnumC6436e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC6436e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC6432a.EAN_13)) {
                arrayList.add(new C11625e());
            } else if (collection.contains(EnumC6432a.UPC_A)) {
                arrayList.add(new C11632l());
            }
            if (collection.contains(EnumC6432a.EAN_8)) {
                arrayList.add(new C11626f());
            }
            if (collection.contains(EnumC6432a.UPC_E)) {
                arrayList.add(new C11637q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C11625e());
            arrayList.add(new C11626f());
            arrayList.add(new C11637q());
        }
        this.f25933a = (AbstractC11636p[]) arrayList.toArray(new AbstractC11636p[arrayList.size()]);
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        boolean z;
        Collection collection;
        boolean z2;
        int[] o = AbstractC11636p.m9182o(aVar);
        for (AbstractC11636p pVar : this.f25933a) {
            try {
                Result l = pVar.mo9185l(i, aVar, o, map);
                if (l.m27007b() == EnumC6432a.EAN_13 && l.m27003f().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(EnumC6436e.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(EnumC6432a.UPC_A)) {
                    z2 = false;
                    if (z || !z2) {
                        return l;
                    }
                    Result result = new Result(l.m27003f().substring(1), l.m27006c(), l.m27004e(), EnumC6432a.UPC_A);
                    result.m27002g(l.m27005d());
                    return result;
                }
                z2 = true;
                if (z) {
                }
                return l;
            } catch (AbstractC6444m unused) {
            }
        }
        throw C6441j.m25551a();
    }

    @Override // p285pd.AbstractC11631k, p066dd.AbstractC6443l
    public void reset() {
        for (AbstractC11636p pVar : this.f25933a) {
            pVar.reset();
        }
    }
}
