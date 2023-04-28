package net.time4j.p248tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.AbstractC10818g;
import net.time4j.base.C10812b;
import net.time4j.base.C10813c;
import net.time4j.p248tz.AbstractC11008m;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;
import p143hj.EnumC8042a0;

/* renamed from: net.time4j.tz.model.l */
/* loaded from: classes8.dex */
public abstract class AbstractC11024l implements AbstractC11008m, Serializable {

    /* renamed from: k */
    static final String f24504k = System.getProperty("line.separator");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static long m11207f(int i) {
        return (System.currentTimeMillis() / 1000) + ((long) (i * 3.1556952E7d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static AbstractC11008m m11206g(C11028p pVar, List<C11029q> list, List<AbstractC11012d> list2, boolean z, boolean z2) {
        List<AbstractC11012d> list3;
        ArrayList arrayList;
        if (z) {
            ArrayList arrayList2 = new ArrayList(list);
            list3 = new ArrayList<>(list2);
            Collections.sort(arrayList2);
            Collections.sort(list3, EnumC11023k.INSTANCE);
            arrayList = arrayList2;
        } else {
            arrayList = list;
            list3 = list2;
        }
        int size = arrayList.size();
        if (size != 0) {
            C11028p p = C11028p.m11181p(arrayList.get(0).m11172f());
            if (z2 && !pVar.equals(p)) {
                throw new IllegalArgumentException("Initial offset " + pVar + " not equal to previous offset of first transition: " + p);
            } else if (list3.isEmpty()) {
                return new C11009a(arrayList, false, z2);
            } else {
                C11029q qVar = arrayList.get(size - 1);
                long e = qVar.m11173e() + 1;
                long f = m11207f(1);
                if (e < f) {
                    arrayList.addAll(C11021j.m11211s(qVar, list3, e, f));
                }
                return new C11010b(size, arrayList, list3, false, z2);
            }
        } else if (list3.isEmpty()) {
            return new C11013e(pVar);
        } else {
            return new C11021j(pVar, list3, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static List<C11028p> m11205h(int i) {
        return Collections.singletonList(C11028p.m11181p(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static List<C11028p> m11204i(int i, int i2) {
        C11028p p = C11028p.m11181p(i);
        C11028p p2 = C11028p.m11181p(i2);
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(p);
        arrayList.add(p2);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static long m11203j(AbstractC10811a aVar, AbstractC10818g gVar) {
        return C10813c.m12194i(EnumC8042a0.UNIX.m20754h(C10812b.m12206j(aVar.mo11643m(), aVar.mo11642n(), aVar.mo11641o()), EnumC8042a0.MODIFIED_JULIAN_DATE), 86400L) + (gVar.mo11640p() * 3600) + (gVar.mo11644j() * 60) + gVar.mo11648g();
    }

    @Override // net.time4j.p248tz.AbstractC11008m
    public boolean isEmpty() {
        return false;
    }
}
