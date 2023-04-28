package p066dd;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p084ed.C6818b;
import p199kd.C9849a;
import p247nd.C10776a;
import p285pd.C11629i;
import p424xd.C14074a;
import td.C13055b;

/* renamed from: dd.i */
/* loaded from: classes3.dex */
public final class C6440i implements AbstractC6443l {

    /* renamed from: a */
    private Map<EnumC6436e, ?> f13509a;

    /* renamed from: b */
    private AbstractC6443l[] f13510b;

    /* renamed from: b */
    private Result m25554b(C6434c cVar) {
        AbstractC6443l[] lVarArr = this.f13510b;
        if (lVarArr != null) {
            for (AbstractC6443l lVar : lVarArr) {
                try {
                    return lVar.mo1767a(cVar, this.f13509a);
                } catch (AbstractC6444m unused) {
                }
            }
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        m25552d(map);
        return m25554b(cVar);
    }

    /* renamed from: c */
    public Result m25553c(C6434c cVar) {
        if (this.f13510b == null) {
            m25552d(null);
        }
        return m25554b(cVar);
    }

    /* renamed from: d */
    public void m25552d(Map<EnumC6436e, ?> map) {
        boolean z;
        Collection collection;
        this.f13509a = map;
        boolean z2 = true;
        if (map == null || !map.containsKey(EnumC6436e.TRY_HARDER)) {
            z = false;
        } else {
            z = true;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC6436e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC6432a.UPC_A) && !collection.contains(EnumC6432a.UPC_E) && !collection.contains(EnumC6432a.EAN_13) && !collection.contains(EnumC6432a.EAN_8) && !collection.contains(EnumC6432a.CODABAR) && !collection.contains(EnumC6432a.CODE_39) && !collection.contains(EnumC6432a.CODE_93) && !collection.contains(EnumC6432a.CODE_128) && !collection.contains(EnumC6432a.ITF) && !collection.contains(EnumC6432a.RSS_14) && !collection.contains(EnumC6432a.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new C11629i(map));
            }
            if (collection.contains(EnumC6432a.QR_CODE)) {
                arrayList.add(new C14074a());
            }
            if (collection.contains(EnumC6432a.DATA_MATRIX)) {
                arrayList.add(new C9849a());
            }
            if (collection.contains(EnumC6432a.AZTEC)) {
                arrayList.add(new C6818b());
            }
            if (collection.contains(EnumC6432a.PDF_417)) {
                arrayList.add(new C13055b());
            }
            if (collection.contains(EnumC6432a.MAXICODE)) {
                arrayList.add(new C10776a());
            }
            if (z2 && z) {
                arrayList.add(new C11629i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C11629i(map));
            }
            arrayList.add(new C14074a());
            arrayList.add(new C9849a());
            arrayList.add(new C6818b());
            arrayList.add(new C13055b());
            arrayList.add(new C10776a());
            if (z) {
                arrayList.add(new C11629i(map));
            }
        }
        this.f13510b = (AbstractC6443l[]) arrayList.toArray(new AbstractC6443l[arrayList.size()]);
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
        AbstractC6443l[] lVarArr = this.f13510b;
        if (lVarArr != null) {
            for (AbstractC6443l lVar : lVarArr) {
                lVar.reset();
            }
        }
    }
}
