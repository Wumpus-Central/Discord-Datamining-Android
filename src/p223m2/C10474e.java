package p223m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: m2.e */
/* loaded from: classes.dex */
public class C10474e {

    /* renamed from: c */
    public static final C10474e f23132c = new C10474e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f23133a;

    /* renamed from: b */
    private AbstractC10475f f23134b;

    public C10474e(String... strArr) {
        this.f23133a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m13095b() {
        List<String> list = this.f23133a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m13091f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C10474e m13096a(String str) {
        C10474e eVar = new C10474e(this);
        eVar.f23133a.add(str);
        return eVar;
    }

    /* renamed from: c */
    public boolean m13094c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f23133a.size()) {
            return false;
        }
        if (i == this.f23133a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f23133a.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f23133a.size() - 2 && m13095b())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !this.f23133a.get(i + 1).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f23133a.size() - 2 || (i == this.f23133a.size() - 3 && m13095b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f23133a.size() - 1) {
                return false;
            }
            return this.f23133a.get(i2).equals(str);
        }
    }

    /* renamed from: d */
    public AbstractC10475f m13093d() {
        return this.f23134b;
    }

    /* renamed from: e */
    public int m13092e(String str, int i) {
        if (m13091f(str)) {
            return 0;
        }
        if (!this.f23133a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f23133a.size() - 1 && this.f23133a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10474e eVar = (C10474e) obj;
        if (!this.f23133a.equals(eVar.f23133a)) {
            return false;
        }
        AbstractC10475f fVar = this.f23134b;
        AbstractC10475f fVar2 = eVar.f23134b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m13090g(String str, int i) {
        if (m13091f(str)) {
            return true;
        }
        if (i >= this.f23133a.size()) {
            return false;
        }
        if (this.f23133a.get(i).equals(str) || this.f23133a.get(i).equals("**") || this.f23133a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m13089h(String str, int i) {
        if (!"__container".equals(str) && i >= this.f23133a.size() - 1 && !this.f23133a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f23133a.hashCode() * 31;
        AbstractC10475f fVar = this.f23134b;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public C10474e m13088i(AbstractC10475f fVar) {
        C10474e eVar = new C10474e(this);
        eVar.f23134b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f23133a);
        sb2.append(",resolved=");
        sb2.append(this.f23134b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private C10474e(C10474e eVar) {
        this.f23133a = new ArrayList(eVar.f23133a);
        this.f23134b = eVar.f23134b;
    }
}
