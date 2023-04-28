package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import net.time4j.C10892f0;
import p143hj.EnumC8042a0;

/* renamed from: net.time4j.history.g */
/* loaded from: classes8.dex */
public final class C10933g {

    /* renamed from: d */
    static final C10933g f24277d = new C10933g();

    /* renamed from: e */
    private static final C10934h f24278e = C10934h.m11540g(EnumC10937j.AD, 1, 1, 1);

    /* renamed from: f */
    private static final C10934h f24279f = C10934h.m11540g(EnumC10937j.BC, 38, 1, 1);

    /* renamed from: g */
    private static final C10892f0 f24280g = C10892f0.m11876K0(2000, 1);

    /* renamed from: a */
    private final EnumC10937j f24281a;

    /* renamed from: b */
    private final C10892f0 f24282b;

    /* renamed from: c */
    private final C10892f0 f24283c;

    private C10933g() {
        this.f24281a = null;
        this.f24282b = C10892f0.m11835v0().m20708P();
        this.f24283c = C10892f0.m11835v0().m20709O();
    }

    /* renamed from: a */
    public static C10933g m11554a(C10892f0 f0Var, C10892f0 f0Var2) {
        return new C10933g(EnumC10937j.AB_URBE_CONDITA, f0Var, f0Var2);
    }

    /* renamed from: b */
    public static C10933g m11553b(C10892f0 f0Var, C10892f0 f0Var2) {
        return new C10933g(EnumC10937j.BYZANTINE, f0Var, f0Var2);
    }

    /* renamed from: c */
    public static C10933g m11552c(C10892f0 f0Var) {
        return m11553b(C10892f0.m11835v0().m20708P(), f0Var);
    }

    /* renamed from: e */
    public static C10933g m11550e(C10892f0 f0Var, C10892f0 f0Var2) {
        return new C10933g(EnumC10937j.HISPANIC, f0Var, f0Var2);
    }

    /* renamed from: f */
    public static C10933g m11549f(C10892f0 f0Var) {
        return m11550e(C10892f0.m11835v0().m20708P(), f0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C10933g m11548g(DataInput dataInput) {
        if (dataInput.readByte() != Byte.MAX_VALUE) {
            return f24277d;
        }
        EnumC10937j valueOf = EnumC10937j.valueOf(dataInput.readUTF());
        long readLong = dataInput.readLong();
        long readLong2 = dataInput.readLong();
        C10892f0 f0Var = f24280g;
        EnumC8042a0 a0Var = EnumC8042a0.MODIFIED_JULIAN_DATE;
        return new C10933g(valueOf, (C10892f0) f0Var.m20661C(a0Var, readLong), (C10892f0) f0Var.m20661C(a0Var, readLong2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public EnumC10937j m11551d(C10934h hVar, C10892f0 f0Var) {
        if (this.f24281a == null || f0Var.m20669T(this.f24282b) || f0Var.m20670R(this.f24283c)) {
            if (hVar.compareTo(f24278e) < 0) {
                return EnumC10937j.BC;
            }
            return EnumC10937j.AD;
        } else if (this.f24281a != EnumC10937j.HISPANIC || hVar.compareTo(f24279f) >= 0) {
            return this.f24281a;
        } else {
            return EnumC10937j.BC;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10933g)) {
            return false;
        }
        C10933g gVar = (C10933g) obj;
        C10933g gVar2 = f24277d;
        if (this == gVar2) {
            if (gVar == gVar2) {
                return true;
            }
            return false;
        } else if (this.f24281a != gVar.f24281a || !this.f24282b.equals(gVar.f24282b) || !this.f24283c.equals(gVar.f24283c)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m11547h(DataOutput dataOutput) {
        if (this == f24277d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f24281a.name());
        C10892f0 f0Var = this.f24282b;
        EnumC8042a0 a0Var = EnumC8042a0.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) f0Var.mo11371r(a0Var)).longValue());
        dataOutput.writeLong(((Long) this.f24283c.mo11371r(a0Var)).longValue());
    }

    public int hashCode() {
        return (this.f24281a.hashCode() * 17) + (this.f24282b.hashCode() * 31) + (this.f24283c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this == f24277d) {
            sb2.append("default");
        } else {
            sb2.append("era->");
            sb2.append(this.f24281a);
            sb2.append(",start->");
            sb2.append(this.f24282b);
            sb2.append(",end->");
            sb2.append(this.f24283c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    private C10933g(EnumC10937j jVar, C10892f0 f0Var, C10892f0 f0Var2) {
        if (jVar.compareTo(EnumC10937j.AD) <= 0) {
            throw new UnsupportedOperationException(jVar.name());
        } else if (!f0Var2.m20669T(f0Var)) {
            this.f24281a = jVar;
            this.f24282b = f0Var;
            this.f24283c = f0Var2;
        } else {
            throw new IllegalArgumentException("End before start: " + f0Var + "/" + f0Var2);
        }
    }
}
