package p325rh;

import java.util.Comparator;
import p268og.AbstractC11313e;
import p268og.AbstractC11316e1;
import p268og.AbstractC11343l;
import p268og.AbstractC11346m;
import p268og.AbstractC11388u0;
import p268og.AbstractC11397y;

/* renamed from: rh.h */
/* loaded from: classes8.dex */
public class C12666h implements Comparator<AbstractC11346m> {

    /* renamed from: k */
    public static final C12666h f28505k = new C12666h();

    private C12666h() {
    }

    /* renamed from: c */
    private static Integer m6021c(AbstractC11346m mVar, AbstractC11346m mVar2) {
        int d = m6020d(mVar2) - m6020d(mVar);
        if (d != 0) {
            return Integer.valueOf(d);
        }
        if (C12661e.m6065B(mVar) && C12661e.m6065B(mVar2)) {
            return 0;
        }
        int c = mVar.getName().compareTo(mVar2.getName());
        if (c != 0) {
            return Integer.valueOf(c);
        }
        return null;
    }

    /* renamed from: d */
    private static int m6020d(AbstractC11346m mVar) {
        if (C12661e.m6065B(mVar)) {
            return 8;
        }
        if (mVar instanceof AbstractC11343l) {
            return 7;
        }
        if (mVar instanceof AbstractC11388u0) {
            if (((AbstractC11388u0) mVar).mo6264M() == null) {
                return 6;
            }
            return 5;
        } else if (mVar instanceof AbstractC11397y) {
            if (((AbstractC11397y) mVar).mo6264M() == null) {
                return 4;
            }
            return 3;
        } else if (mVar instanceof AbstractC11313e) {
            return 2;
        } else {
            if (mVar instanceof AbstractC11316e1) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: b */
    public int compare(AbstractC11346m mVar, AbstractC11346m mVar2) {
        Integer c = m6021c(mVar, mVar2);
        if (c != null) {
            return c.intValue();
        }
        return 0;
    }
}
