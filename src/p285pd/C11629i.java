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
import p301qd.C12111e;
import p322rd.C12571d;

/* renamed from: pd.i */
/* loaded from: classes3.dex */
public final class C11629i extends AbstractC11631k {

    /* renamed from: a */
    private final AbstractC11631k[] f25932a;

    public C11629i(Map<EnumC6436e, ?> map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC6436e.POSSIBLE_FORMATS);
        }
        if (map == null || map.get(EnumC6436e.ASSUME_CODE_39_CHECK_DIGIT) == null) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC6432a.EAN_13) || collection.contains(EnumC6432a.UPC_A) || collection.contains(EnumC6432a.EAN_8) || collection.contains(EnumC6432a.UPC_E)) {
                arrayList.add(new C11630j(map));
            }
            if (collection.contains(EnumC6432a.CODE_39)) {
                arrayList.add(new C11623c(z));
            }
            if (collection.contains(EnumC6432a.CODE_93)) {
                arrayList.add(new C11624d());
            }
            if (collection.contains(EnumC6432a.CODE_128)) {
                arrayList.add(new C11622b());
            }
            if (collection.contains(EnumC6432a.ITF)) {
                arrayList.add(new C11628h());
            }
            if (collection.contains(EnumC6432a.CODABAR)) {
                arrayList.add(new C11621a());
            }
            if (collection.contains(EnumC6432a.RSS_14)) {
                arrayList.add(new C12111e());
            }
            if (collection.contains(EnumC6432a.RSS_EXPANDED)) {
                arrayList.add(new C12571d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C11630j(map));
            arrayList.add(new C11623c());
            arrayList.add(new C11621a());
            arrayList.add(new C11624d());
            arrayList.add(new C11622b());
            arrayList.add(new C11628h());
            arrayList.add(new C12111e());
            arrayList.add(new C12571d());
        }
        this.f25932a = (AbstractC11631k[]) arrayList.toArray(new AbstractC11631k[arrayList.size()]);
    }

    @Override // p285pd.AbstractC11631k
    /* renamed from: b */
    public Result mo6515b(int i, C7996a aVar, Map<EnumC6436e, ?> map) {
        for (AbstractC11631k kVar : this.f25932a) {
            try {
                return kVar.mo6515b(i, aVar, map);
            } catch (AbstractC6444m unused) {
            }
        }
        throw C6441j.m25551a();
    }

    @Override // p285pd.AbstractC11631k, p066dd.AbstractC6443l
    public void reset() {
        for (AbstractC11631k kVar : this.f25932a) {
            kVar.reset();
        }
    }
}
