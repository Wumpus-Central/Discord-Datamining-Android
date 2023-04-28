package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* renamed from: kotlin.jvm.internal.d0 */
/* loaded from: classes8.dex */
public abstract class AbstractC9946d0 extends AbstractC9947e implements KProperty {
    public AbstractC9946d0() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9946d0) {
            AbstractC9946d0 d0Var = (AbstractC9946d0) obj;
            if (!getOwner().equals(d0Var.getOwner()) || !getName().equals(d0Var.getName()) || !getSignature().equals(d0Var.getSignature()) || !C9971q.m14638b(getBoundReceiver(), d0Var.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC9946d0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }
}
