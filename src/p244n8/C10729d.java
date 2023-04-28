package p244n8;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p079e7.C6722k;
import p103fc.C7115d;
import p119g9.C7510a;
import p119g9.C7541k;
import p119g9.C7544l0;
import p119g9.C7562u;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p336s7.C12809f;
import p348t7.C12985g;
import p398w7.C13754b;
import p398w7.C13760e;
import p398w7.C13767h;
import p398w7.C13768h0;
import p398w7.C13777j;
import p459z7.C14576a;

/* renamed from: n8.d */
/* loaded from: classes7.dex */
public final class C10729d implements AbstractC10739h {

    /* renamed from: d */
    private static final int[] f23792d = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b */
    private final int f23793b;

    /* renamed from: c */
    private final boolean f23794c;

    public C10729d() {
        this(0, true);
    }

    /* renamed from: b */
    private static void m12537b(int i, List<Integer> list) {
        if (C7115d.m23362f(f23792d, i) != -1 && !list.contains(Integer.valueOf(i))) {
            list.add(Integer.valueOf(i));
        }
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    private AbstractC10514i m12535d(int i, C6722k kVar, List<C6722k> list, C7544l0 l0Var) {
        if (i == 0) {
            return new C13754b();
        }
        if (i == 1) {
            return new C13760e();
        }
        if (i == 2) {
            return new C13767h();
        }
        if (i == 7) {
            return new C12809f(0, 0L);
        }
        if (i == 8) {
            return m12534e(l0Var, kVar, list);
        }
        if (i == 11) {
            return m12533f(this.f23793b, this.f23794c, kVar, list, l0Var);
        }
        if (i != 13) {
            return null;
        }
        return new C10759u(kVar.f14320m, l0Var);
    }

    /* renamed from: e */
    private static C12985g m12534e(C7544l0 l0Var, C6722k kVar, List<C6722k> list) {
        int i;
        if (m12532g(kVar)) {
            i = 4;
        } else {
            i = 0;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C12985g(i, l0Var, null, list);
    }

    /* renamed from: f */
    private static C13768h0 m12533f(int i, boolean z, C6722k kVar, List<C6722k> list, C7544l0 l0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(new C6722k.C6724b().m24488e0("application/cea-608").m24519E());
        } else {
            list = Collections.emptyList();
        }
        String str = kVar.f14326s;
        if (!TextUtils.isEmpty(str)) {
            if (!C7562u.m22086b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!C7562u.m22086b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new C13768h0(2, l0Var, new C13777j(i2, list));
    }

    /* renamed from: g */
    private static boolean m12532g(C6722k kVar) {
        C14576a.AbstractC14577b e;
        C14576a aVar = kVar.f14327t;
        if (aVar == null) {
            return false;
        }
        for (int i = 0; i < aVar.m183f(); i++) {
            if (aVar.m184e(i) instanceof C10753r) {
                return !((C10753r) e).f23902m.isEmpty();
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: h */
    private static boolean m12531h(AbstractC10514i iVar, AbstractC10515j jVar) {
        try {
            boolean d = iVar.mo2225d(jVar);
            jVar.mo12936f();
            return d;
        } catch (EOFException unused) {
            jVar.mo12936f();
            return false;
        } catch (Throwable th2) {
            jVar.mo12936f();
            throw th2;
        }
    }

    /* renamed from: c */
    public C10727b mo12498a(Uri uri, C6722k kVar, List<C6722k> list, C7544l0 l0Var, Map<String, List<String>> map, AbstractC10515j jVar) {
        int a = C7541k.m22290a(kVar.f14329v);
        int b = C7541k.m22289b(map);
        int c = C7541k.m22288c(uri);
        int[] iArr = f23792d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m12537b(a, arrayList);
        m12537b(b, arrayList);
        m12537b(c, arrayList);
        for (int i : iArr) {
            m12537b(i, arrayList);
        }
        jVar.mo12936f();
        AbstractC10514i iVar = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            AbstractC10514i iVar2 = (AbstractC10514i) C7510a.m22367e(m12535d(intValue, kVar, list, l0Var));
            if (m12531h(iVar2, jVar)) {
                return new C10727b(iVar2, kVar, l0Var);
            }
            if (iVar == null && (intValue == a || intValue == b || intValue == c || intValue == 11)) {
                iVar = iVar2;
            }
        }
        return new C10727b((AbstractC10514i) C7510a.m22367e(iVar), kVar, l0Var);
    }

    public C10729d(int i, boolean z) {
        this.f23793b = i;
        this.f23794c = z;
    }
}
