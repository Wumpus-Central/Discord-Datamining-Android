package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import net.time4j.base.C10812b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.f */
/* loaded from: classes8.dex */
public final class C11014f extends C11015g {
    private static final long serialVersionUID = 3957240859230862745L;

    /* renamed from: p */
    private final transient byte f24487p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11014f(EnumC10809b0 b0Var, int i, int i2, EnumC11017i iVar, int i3) {
        super(b0Var, i2, iVar, i3);
        C10812b.m12215a(2000, b0Var.m12221b(), i);
        this.f24487p = (byte) i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, mo11227g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11014f)) {
            return false;
        }
        C11014f fVar = (C11014f) obj;
        if (this.f24487p != fVar.f24487p || !super.m11228l(fVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: g */
    public int mo11227g() {
        return 120;
    }

    public int hashCode() {
        return this.f24487p + (m11229k() * 37);
    }

    @Override // net.time4j.p248tz.model.C11015g
    /* renamed from: j */
    protected C10892f0 mo11226j(int i) {
        return C10892f0.m11875L0(i, m11229k(), this.f24487p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m11234m() {
        return this.f24487p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("FixedDayPattern:[month=");
        sb2.append((int) m11229k());
        sb2.append(",day-of-month=");
        sb2.append((int) this.f24487p);
        sb2.append(",day-overflow=");
        sb2.append(m11238c());
        sb2.append(",time-of-day=");
        sb2.append(m11235f());
        sb2.append(",offset-indicator=");
        sb2.append(m11237d());
        sb2.append(",dst-offset=");
        sb2.append(m11236e());
        sb2.append(']');
        return sb2.toString();
    }
}
