package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import net.time4j.C10961k;
import p143hj.AbstractC8071l0;
import p271oj.EnumC11413f;

/* loaded from: classes8.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: k */
    private transient Object f23927k;

    /* renamed from: l */
    private transient int f23928l;

    public SPX() {
    }

    /* renamed from: a */
    private C10892f0 m12352a(DataInput dataInput, byte b) {
        int i;
        int i2 = b & 15;
        byte readByte = dataInput.readByte();
        int i3 = (readByte >> 5) & 3;
        int i4 = readByte & 31;
        if (i3 == 1) {
            i = dataInput.readByte() + 1850 + 128;
        } else if (i3 == 2) {
            i = dataInput.readShort();
        } else if (i3 == 3) {
            i = dataInput.readInt();
        } else {
            throw new StreamCorruptedException("Unknown year range.");
        }
        return C10892f0.m11870P0(i, EnumC10809b0.m12219d(i2), i4);
    }

    /* renamed from: b */
    private Object m12351b(ObjectInput objectInput, byte b) {
        boolean z;
        boolean z2;
        Locale locale;
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((b & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new C10961k.C10963b(z, C10961k.m11446s((Map) objectInput.readObject()));
        }
        String readUTF = objectInput.readUTF();
        String readUTF2 = objectInput.readUTF();
        int indexOf = readUTF.indexOf("-");
        if (indexOf == -1) {
            locale = new Locale(readUTF);
        } else {
            locale = new Locale(readUTF.substring(0, indexOf), readUTF.substring(indexOf + 1));
        }
        return new C10961k.C10963b(z, locale, readUTF2);
    }

    /* renamed from: c */
    private Object m12350c(ObjectInput objectInput, byte b) {
        long j;
        boolean z = true;
        if ((b & 15) != 1) {
            z = false;
        }
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return C10971n.m11410j();
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            if (z) {
                j = objectInput.readLong();
            } else {
                j = objectInput.readInt();
            }
            arrayList.add(AbstractC8071l0.C8072a.m20673c(j, (AbstractC11036w) objectInput.readObject()));
        }
        return new C10971n(arrayList, objectInput.readBoolean());
    }

    /* renamed from: d */
    private Object m12349d(ObjectInput objectInput, byte b) {
        EnumC11413f fVar;
        int i;
        if ((b & 1) == 1) {
            fVar = EnumC11413f.UTC;
        } else {
            fVar = EnumC11413f.POSIX;
        }
        long readLong = objectInput.readLong();
        if ((b & 2) == 2) {
            i = objectInput.readInt();
        } else {
            i = 0;
        }
        if (fVar == EnumC11413f.UTC) {
            return C11040y.m11146i(readLong, i);
        }
        return C11040y.m11147h(readLong, i);
    }

    /* renamed from: e */
    private Object m12348e(DataInput dataInput, byte b) {
        int i = b & 1;
        boolean z = true;
        int i2 = (b & 2) >>> 1;
        boolean z2 = i != 0;
        if (i2 == 0) {
            z = false;
        }
        return C10779a0.m12305r0(dataInput, z2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* renamed from: f */
    private C10906g0 m12347f(DataInput dataInput) {
        int i;
        byte readByte = dataInput.readByte();
        if (readByte < 0) {
            return C10906g0.m11775J0(~readByte);
        }
        int readByte2 = dataInput.readByte();
        byte b = 0;
        if (readByte2 < 0) {
            readByte2 = ~readByte2;
            i = 0;
        } else {
            byte readByte3 = dataInput.readByte();
            if (readByte3 < 0) {
                b = ~readByte3;
                i = 0;
            } else {
                i = dataInput.readInt();
                b = readByte3;
            }
        }
        return C10906g0.m11771M0(readByte, readByte2, b, i);
    }

    /* renamed from: g */
    private Object m12346g(DataInput dataInput, byte b) {
        return C10917h0.m11650e0(m12352a(dataInput, b), m12347f(dataInput));
    }

    /* renamed from: h */
    private Object m12345h(DataInput dataInput, byte b) {
        byte readByte = dataInput.readByte();
        EnumC11039x0 f = EnumC11039x0.m11154f(readByte >> 4);
        int i = readByte & 15;
        EnumC11039x0 x0Var = EnumC11039x0.SATURDAY;
        EnumC11039x0 x0Var2 = EnumC11039x0.SUNDAY;
        if ((b & 15) == 1) {
            byte readByte2 = dataInput.readByte();
            x0Var = EnumC11039x0.m11154f(readByte2 >> 4);
            x0Var2 = EnumC11039x0.m11154f(readByte2 & 15);
        }
        return C11045z0.m11127l(f, i, x0Var, x0Var2);
    }

    /* renamed from: i */
    private void m12344i(DataOutput dataOutput) {
        m12343j((C10892f0) this.f23927k, 1, dataOutput);
    }

    /* renamed from: j */
    private static void m12343j(C10892f0 f0Var, int i, DataOutput dataOutput) {
        int i2;
        int m = f0Var.mo11643m();
        if (m >= 1850 && m <= 2100) {
            i2 = 1;
        } else if (Math.abs(m) < 10000) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        dataOutput.writeByte((i << 4) | f0Var.mo11642n());
        dataOutput.writeByte(f0Var.mo11641o() | (i2 << 5));
        if (i2 == 1) {
            dataOutput.writeByte((m - 1850) - 128);
        } else if (i2 == 2) {
            dataOutput.writeShort(m);
        } else {
            dataOutput.writeInt(m);
        }
    }

    /* renamed from: k */
    private void m12342k(ObjectOutput objectOutput) {
        int i;
        C10961k.C10963b bVar = (C10961k.C10963b) C10961k.C10963b.class.cast(this.f23927k);
        Locale J = bVar.m11437J();
        if (bVar.m11433O()) {
            i = 113;
        } else {
            i = 112;
        }
        if (J == null) {
            i |= 2;
        }
        objectOutput.writeByte(i);
        if (J == null) {
            objectOutput.writeObject(bVar.m11440G());
            return;
        }
        String language = J.getLanguage();
        if (!J.getCountry().isEmpty()) {
            language = language + "-" + J.getCountry();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(bVar.m11443D());
    }

    /* renamed from: l */
    private void m12341l(ObjectOutput objectOutput) {
        boolean z;
        int i;
        C10971n nVar = (C10971n) C10971n.class.cast(this.f23927k);
        int size = nVar.mo11418a().size();
        int min = Math.min(size, 6);
        int i2 = 0;
        while (true) {
            if (i2 >= min) {
                z = false;
                break;
            } else if (((AbstractC8071l0.C8072a) nVar.mo11418a().get(i2)).m20675a() >= 1000) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            i = 97;
        } else {
            i = 96;
        }
        objectOutput.writeByte(i);
        objectOutput.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC8071l0.C8072a aVar = (AbstractC8071l0.C8072a) nVar.mo11418a().get(i3);
            if (z) {
                objectOutput.writeLong(aVar.m20675a());
            } else {
                objectOutput.writeInt((int) aVar.m20675a());
            }
            objectOutput.writeObject(aVar.m20674b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(nVar.m11411i());
        }
    }

    /* renamed from: m */
    private void m12340m(ObjectOutput objectOutput) {
        int i;
        C11040y yVar = (C11040y) C11040y.class.cast(this.f23927k);
        if (yVar.m11150e() == EnumC11413f.UTC) {
            i = 81;
        } else {
            i = 80;
        }
        if (yVar.m11151d() == 0) {
            objectOutput.writeByte(i);
            objectOutput.writeLong(yVar.m11149f());
            return;
        }
        objectOutput.writeByte(i | 2);
        objectOutput.writeLong(yVar.m11149f());
        objectOutput.writeInt(yVar.m11151d());
    }

    /* renamed from: n */
    private void m12339n(DataOutput dataOutput) {
        ((C10779a0) this.f23927k).m12297z0(dataOutput);
    }

    /* renamed from: o */
    private void m12338o(DataOutput dataOutput) {
        dataOutput.writeByte(32);
        m12337p((C10906g0) this.f23927k, dataOutput);
    }

    /* renamed from: p */
    private static void m12337p(C10906g0 g0Var, DataOutput dataOutput) {
        if (g0Var.mo11655a() != 0) {
            dataOutput.writeByte(g0Var.mo11640p());
            dataOutput.writeByte(g0Var.mo11644j());
            dataOutput.writeByte(g0Var.mo11648g());
            dataOutput.writeInt(g0Var.mo11655a());
        } else if (g0Var.mo11648g() != 0) {
            dataOutput.writeByte(g0Var.mo11640p());
            dataOutput.writeByte(g0Var.mo11644j());
            dataOutput.writeByte(~g0Var.mo11648g());
        } else if (g0Var.mo11644j() == 0) {
            dataOutput.writeByte(~g0Var.mo11640p());
        } else {
            dataOutput.writeByte(g0Var.mo11640p());
            dataOutput.writeByte(~g0Var.mo11644j());
        }
    }

    /* renamed from: q */
    private void m12336q(DataOutput dataOutput) {
        C10917h0 h0Var = (C10917h0) this.f23927k;
        m12343j(h0Var.m11657Y(), 8, dataOutput);
        m12337p(h0Var.m11654a0(), dataOutput);
    }

    /* renamed from: r */
    private void m12335r(DataOutput dataOutput) {
        boolean z;
        int i;
        C11045z0 z0Var = (C11045z0) this.f23927k;
        if (z0Var.m11131h() == EnumC11039x0.SATURDAY && z0Var.m11134e() == EnumC11039x0.SUNDAY) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 49;
        } else {
            i = 48;
        }
        dataOutput.writeByte(i);
        dataOutput.writeByte((z0Var.m11133f().m11158b() << 4) | z0Var.m11132g());
        if (!z) {
            dataOutput.writeByte(z0Var.m11134e().m11158b() | (z0Var.m11131h().m11158b() << 4));
        }
    }

    private Object readResolve() {
        return this.f23927k;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 1:
                this.f23927k = m12352a(objectInput, readByte);
                return;
            case 2:
                this.f23927k = m12347f(objectInput);
                return;
            case 3:
                this.f23927k = m12345h(objectInput, readByte);
                return;
            case 4:
                this.f23927k = m12348e(objectInput, readByte);
                return;
            case 5:
                this.f23927k = m12349d(objectInput, readByte);
                return;
            case 6:
                this.f23927k = m12350c(objectInput, readByte);
                return;
            case 7:
                this.f23927k = m12351b(objectInput, readByte);
                return;
            case 8:
                this.f23927k = m12346g(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f23928l) {
            case 1:
                m12344i(objectOutput);
                return;
            case 2:
                m12338o(objectOutput);
                return;
            case 3:
                m12335r(objectOutput);
                return;
            case 4:
                m12339n(objectOutput);
                return;
            case 5:
                m12340m(objectOutput);
                return;
            case 6:
                m12341l(objectOutput);
                return;
            case 7:
                m12342k(objectOutput);
                return;
            case 8:
                m12336q(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f23927k = obj;
        this.f23928l = i;
    }
}
