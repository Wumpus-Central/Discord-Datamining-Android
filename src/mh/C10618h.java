package mh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p218lh.C10440a;

/* renamed from: mh.h */
/* loaded from: classes8.dex */
public final class C10618h {
    /* renamed from: a */
    public static final List<C10440a.C10446e.C10448c> m12729a(List<C10440a.C10446e.C10448c> list) {
        C9971q.m14633g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C10440a.C10446e.C10448c cVar : list) {
            int G = cVar.m13192G();
            for (int i = 0; i < G; i++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
