package net.time4j;

import java.io.Serializable;
import net.time4j.EnumC10882f;
import p143hj.AbstractC8052f;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8080q;
import p143hj.C8087x;

/* renamed from: net.time4j.e0 */
/* loaded from: classes8.dex */
final class C10881e0 extends AbstractC8052f implements AbstractC11032u, Serializable {
    private static final long serialVersionUID = 1988843503875912054L;
    private final int policy;
    private final EnumC10882f unit;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10881e0(EnumC10882f fVar, int i) {
        this.unit = fVar;
        this.policy = i;
    }

    @Override // net.time4j.AbstractC11036w
    /* renamed from: a */
    public char mo11166a() {
        return (char) 0;
    }

    @Override // p143hj.AbstractC8086w
    /* renamed from: b */
    public boolean mo11165b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8052f
    /* renamed from: c */
    public <T extends AbstractC8080q<T>> AbstractC8074m0<T> mo11164c(C8087x<T> xVar) {
        if (xVar.m20657A(C10892f0.f24172x)) {
            return new EnumC10882f.C10891j(this.unit, this.policy);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10881e0)) {
            return false;
        }
        C10881e0 e0Var = (C10881e0) obj;
        if (this.unit == e0Var.unit && this.policy == e0Var.policy) {
            return true;
        }
        return false;
    }

    @Override // p143hj.AbstractC8086w
    public double getLength() {
        return this.unit.getLength();
    }

    public int hashCode() {
        return (this.unit.hashCode() * 23) + (this.policy * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.unit.mo11166a());
        sb2.append('-');
        switch (this.policy) {
            case 1:
                sb2.append("NEXT_VALID_DATE");
                break;
            case 2:
                sb2.append("END_OF_MONTH");
                break;
            case 3:
                sb2.append("CARRY_OVER");
                break;
            case 4:
                sb2.append("UNLESS_INVALID");
                break;
            case 5:
                sb2.append("KEEPING_LAST_DATE");
                break;
            case 6:
                sb2.append("JODA_METRIC");
                break;
            default:
                sb2.append("PREVIOUS_VALID_DATE");
                break;
        }
        return sb2.toString();
    }
}
