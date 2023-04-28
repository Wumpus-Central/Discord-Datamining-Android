package p355u;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p340t.C12921i;
import p340t.C12931s;
import p390w.AbstractC13658q2;

/* renamed from: u.l */
/* loaded from: classes.dex */
public class C13172l {

    /* renamed from: a */
    private final C12931s f29526a;

    public C13172l() {
        this((C12931s) C12921i.m5067a(C12931s.class));
    }

    /* renamed from: a */
    public List<Size> m4423a(AbstractC13658q2.EnumC13660b bVar, List<Size> list) {
        C12931s sVar = this.f29526a;
        if (sVar == null) {
            return list;
        }
        Size c = sVar.m5040c(bVar);
        if (c == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        for (Size size : list) {
            if (!size.equals(c)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    C13172l(C12931s sVar) {
        this.f29526a = sVar;
    }
}
