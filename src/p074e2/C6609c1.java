package p074e2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e2.c1 */
/* loaded from: classes.dex */
public class C6609c1 {

    /* renamed from: a */
    Map<String, String> f13889a;

    /* renamed from: b */
    Map<String, String> f13890b;

    /* renamed from: a */
    public C6609c1 m25102a() {
        C6609c1 c1Var = new C6609c1();
        if (this.f13889a != null) {
            c1Var.f13889a = new HashMap(this.f13889a);
        }
        if (this.f13890b != null) {
            c1Var.f13890b = new HashMap(this.f13890b);
        }
        return c1Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6609c1 c1Var = (C6609c1) obj;
        if (C6629i1.m24909i(this.f13889a, c1Var.f13889a) && C6629i1.m24909i(this.f13890b, c1Var.f13890b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((629 + C6629i1.m24937O(this.f13889a)) * 37) + C6629i1.m24937O(this.f13890b);
    }
}
