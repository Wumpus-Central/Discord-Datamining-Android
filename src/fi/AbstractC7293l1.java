package fi;

/* renamed from: fi.l1 */
/* loaded from: classes8.dex */
public abstract class AbstractC7293l1 implements AbstractC7290k1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7290k1)) {
            return false;
        }
        AbstractC7290k1 k1Var = (AbstractC7290k1) obj;
        if (mo22907a() == k1Var.mo22907a() && mo22906b() == k1Var.mo22906b() && getType().equals(k1Var.getType())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = mo22906b().hashCode();
        if (C7322s1.m22924w(getType())) {
            return (hashCode * 31) + 19;
        }
        int i2 = hashCode * 31;
        if (mo22907a()) {
            i = 17;
        } else {
            i = getType().hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        if (mo22907a()) {
            return "*";
        }
        if (mo22906b() == EnumC7338w1.INVARIANT) {
            return getType().toString();
        }
        return mo22906b() + " " + getType();
    }
}
