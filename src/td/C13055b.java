package td;

import com.facebook.react.uimanager.ViewDefaults;
import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Map;
import p066dd.AbstractC6443l;
import p066dd.C6434c;
import p066dd.C6441j;
import p066dd.C6446o;
import p066dd.EnumC6432a;
import p066dd.EnumC6436e;
import p066dd.EnumC6445n;
import p137hd.C8000e;
import p368ud.C13268j;
import p404wd.C13866a;
import p404wd.C13867b;

/* renamed from: td.b */
/* loaded from: classes3.dex */
public final class C13055b implements AbstractC6443l {
    /* renamed from: b */
    private static Result[] m4696b(C6434c cVar, Map<EnumC6436e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C13867b c = C13866a.m2482c(cVar, map, z);
        for (C6446o[] oVarArr : c.m2476b()) {
            C8000e i = C13268j.m4126i(c.m2477a(), oVarArr[4], oVarArr[5], oVarArr[6], oVarArr[7], m4693e(oVarArr), m4695c(oVarArr));
            Result result = new Result(i.m20899h(), i.m20902e(), oVarArr, EnumC6432a.PDF_417);
            result.m27001h(EnumC6445n.ERROR_CORRECTION_LEVEL, i.m20905b());
            C13056c cVar2 = (C13056c) i.m20903d();
            if (cVar2 != null) {
                result.m27001h(EnumC6445n.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(result);
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }

    /* renamed from: c */
    private static int m4695c(C6446o[] oVarArr) {
        return Math.max(Math.max(m4694d(oVarArr[0], oVarArr[4]), (m4694d(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(m4694d(oVarArr[1], oVarArr[5]), (m4694d(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: d */
    private static int m4694d(C6446o oVar, C6446o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.m25545c() - oVar2.m25545c());
    }

    /* renamed from: e */
    private static int m4693e(C6446o[] oVarArr) {
        return Math.min(Math.min(m4692f(oVarArr[0], oVarArr[4]), (m4692f(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(m4692f(oVarArr[1], oVarArr[5]), (m4692f(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m4692f(C6446o oVar, C6446o oVar2) {
        return (oVar == null || oVar2 == null) ? ViewDefaults.NUMBER_OF_LINES : (int) Math.abs(oVar.m25545c() - oVar2.m25545c());
    }

    @Override // p066dd.AbstractC6443l
    /* renamed from: a */
    public Result mo1767a(C6434c cVar, Map<EnumC6436e, ?> map) {
        Result result;
        Result[] b = m4696b(cVar, map, false);
        if (b != null && b.length != 0 && (result = b[0]) != null) {
            return result;
        }
        throw C6441j.m25551a();
    }

    @Override // p066dd.AbstractC6443l
    public void reset() {
    }
}
