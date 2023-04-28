package net.time4j.p248tz.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.C10906g0;
import net.time4j.EnumC10809b0;
import net.time4j.EnumC11039x0;
import net.time4j.base.C10813c;
import net.time4j.p248tz.C11028p;
import net.time4j.p248tz.C11029q;

/* renamed from: net.time4j.tz.model.SPX */
/* loaded from: classes8.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* renamed from: k */
    private transient Object f24469k;

    /* renamed from: l */
    private transient int f24470l;

    public SPX() {
    }

    /* renamed from: a */
    private static Object m11280a(ObjectInput objectInput) {
        return new C11009a(m11271j(objectInput), false, false);
    }

    /* renamed from: b */
    private static Object m11279b(ObjectInput objectInput) {
        List<C11029q> j = m11271j(objectInput);
        return AbstractC11024l.m11206g(C11028p.m11181p(j.get(0).m11172f()), j, m11273h(objectInput), false, false);
    }

    /* renamed from: c */
    private static AbstractC11012d m11278c(DataInput dataInput) {
        boolean z;
        int i;
        int readByte = dataInput.readByte() & 255;
        EnumC10809b0 d = EnumC10809b0.m12219d(readByte >>> 4);
        int i2 = readByte & 15;
        EnumC11017i iVar = EnumC11017i.f24493n[i2 % 3];
        int i3 = m11272i(i2);
        int readByte2 = dataInput.readByte() & 255;
        int i4 = readByte2 >>> 3;
        EnumC11039x0 f = EnumC11039x0.m11154f(readByte2 & 7);
        int readByte3 = dataInput.readByte() & 255;
        if ((readByte3 >>> 7) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i5 = readByte3 & 63;
        if (i3 == -1) {
            i3 = m11275f(dataInput);
        }
        if (i5 == 63) {
            i = dataInput.readInt();
        } else {
            i = i5 * 1800;
        }
        return new C11011c(d, i4, f, i, iVar, i3, z);
    }

    /* renamed from: d */
    private static AbstractC11012d m11277d(DataInput dataInput) {
        int i;
        int readByte = dataInput.readByte() & 255;
        int i2 = readByte >>> 4;
        int i3 = readByte & 15;
        EnumC11017i iVar = EnumC11017i.f24493n[i3 % 3];
        int i4 = m11272i(i3);
        int readByte2 = dataInput.readByte() & 255;
        int i5 = readByte2 >>> 3;
        int n = m11267n(readByte2 & 7);
        if (i4 == -1) {
            i4 = m11275f(dataInput);
        }
        if (n == -1) {
            i = dataInput.readInt();
        } else {
            i = n;
        }
        return new C11014f(EnumC10809b0.m12219d(i2), i5, i, iVar, i4);
    }

    /* renamed from: e */
    private static AbstractC11012d m11276e(DataInput dataInput) {
        int i;
        int readByte = dataInput.readByte() & 255;
        EnumC10809b0 d = EnumC10809b0.m12219d(readByte >>> 4);
        int i2 = readByte & 15;
        EnumC11017i iVar = EnumC11017i.f24493n[i2 % 3];
        int i3 = m11272i(i2);
        int readByte2 = dataInput.readByte() & 255;
        EnumC11039x0 f = EnumC11039x0.m11154f(readByte2 >>> 5);
        int i4 = readByte2 & 31;
        if (i3 == -1) {
            i3 = m11275f(dataInput);
        }
        if (i4 == 31) {
            i = dataInput.readInt();
        } else {
            i = i4 * 3600;
        }
        return new C11016h(d, f, i, iVar, i3);
    }

    /* renamed from: f */
    private static int m11275f(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return dataInput.readInt();
        }
        return readByte * 900;
    }

    /* renamed from: g */
    private static Object m11274g(ObjectInput objectInput) {
        int readByte;
        long j;
        if ((objectInput.readByte() & 255) == 255) {
            j = objectInput.readLong();
        } else {
            j = ((((readByte << 16) + ((objectInput.readByte() & 255) << 8)) + (255 & objectInput.readByte())) * 900) - 4575744000L;
        }
        return new C11021j(new C11029q(j, m11275f(objectInput), m11275f(objectInput), m11275f(objectInput)), m11273h(objectInput), false);
    }

    /* renamed from: h */
    private static List<AbstractC11012d> m11273h(ObjectInput objectInput) {
        AbstractC11012d dVar;
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readByte);
        AbstractC11012d dVar2 = null;
        int i = 0;
        while (i < readByte) {
            switch (objectInput.readByte()) {
                case 120:
                    dVar = m11277d(objectInput);
                    break;
                case 121:
                    dVar = m11278c(objectInput);
                    break;
                case 122:
                    dVar = m11276e(objectInput);
                    break;
                default:
                    dVar = (AbstractC11012d) objectInput.readObject();
                    break;
            }
            if (dVar2 == null || EnumC11023k.INSTANCE.compare(dVar2, dVar) < 0) {
                arrayList.add(dVar);
                i++;
                dVar2 = dVar;
            } else {
                throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private static int m11272i(int i) {
        int i2 = i / 3;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1800;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 7200;
        }
        return 3600;
    }

    /* renamed from: j */
    private static List<C11029q> m11271j(ObjectInput objectInput) {
        boolean z;
        long j;
        int i;
        int i2;
        int i3;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(readInt);
        int f = m11275f(objectInput);
        long j2 = Long.MIN_VALUE;
        int i4 = f;
        int i5 = 0;
        while (i5 < readInt) {
            byte readByte = objectInput.readByte();
            if (readByte < 0) {
                z = true;
            } else {
                z = false;
            }
            int i6 = (readByte >>> 5) & 3;
            int o = m11266o((readByte >>> 2) & 7);
            if (o == -1) {
                j = objectInput.readLong();
            } else {
                j = ((((((((readByte & 3) << 16) | ((objectInput.readByte() & 255) << 8)) | (objectInput.readByte() & 255)) * 86400) - 4575744000L) + o) - 7200) - f;
            }
            if (j > j2) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        i3 = 3600;
                    } else if (i6 != 3) {
                        i3 = m11275f(objectInput);
                    } else {
                        i3 = 7200;
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                if (z) {
                    f = m11275f(objectInput);
                }
                if (i == Integer.MAX_VALUE) {
                    i2 = 0;
                } else {
                    i2 = i;
                }
                int i7 = f + i2;
                arrayList.add(new C11029q(j, i4, i7, i));
                i5++;
                i4 = i7;
                j2 = j;
            } else {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static int m11270k(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 3600) {
            return 2;
        }
        if (i == 7200) {
            return 3;
        }
        if (i == 10800) {
            return 4;
        }
        if (i == 79200) {
            return 5;
        }
        if (i != 82800) {
            return i != 86400 ? 0 : 7;
        }
        return 6;
    }

    /* renamed from: l */
    private static int m11269l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 60) {
            return 2;
        }
        if (i == 3600) {
            return 3;
        }
        if (i == 7200) {
            return 4;
        }
        if (i == 10800) {
            return 5;
        }
        if (i != 14400) {
            return i != 18000 ? 0 : 7;
        }
        return 6;
    }

    /* renamed from: m */
    private static int m11268m(C11015g gVar) {
        return gVar.m11235f().mo11370s(C10906g0.f38917J) + C10813c.m12196g(gVar.m11238c() * 86400);
    }

    /* renamed from: n */
    private static int m11267n(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 3600;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return 86400;
            default:
                return -1;
        }
    }

    /* renamed from: o */
    private static int m11266o(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return 3600;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    /* renamed from: p */
    private static void m11265p(Object obj, ObjectOutput objectOutput) {
        ((C11009a) obj).m11244u(objectOutput);
    }

    /* renamed from: q */
    private static void m11264q(Object obj, ObjectOutput objectOutput) {
        C11010b bVar = (C11010b) obj;
        bVar.m11242l(objectOutput);
        m11257x(bVar.m11243k(), objectOutput);
    }

    /* renamed from: r */
    private static void m11263r(Object obj, DataOutput dataOutput) {
        int i;
        int i2;
        C11011c cVar = (C11011c) obj;
        boolean u = m11260u(cVar, dataOutput);
        dataOutput.writeByte(((cVar.m11241m() << 3) | cVar.m11240n()) & 255);
        boolean z = false;
        if (cVar.m11239o()) {
            i = 128;
        } else {
            i = 0;
        }
        int m = m11268m(cVar);
        if (m % 1800 == 0) {
            i2 = i | (m / 1800);
            z = true;
        } else {
            i2 = i | 63;
        }
        dataOutput.writeByte(i2 & 255);
        if (!u) {
            m11259v(dataOutput, cVar.m11236e());
        }
        if (!z) {
            dataOutput.writeInt(m);
        }
    }

    private Object readResolve() {
        return this.f24469k;
    }

    /* renamed from: s */
    private static void m11262s(Object obj, DataOutput dataOutput) {
        C11014f fVar = (C11014f) obj;
        boolean u = m11260u(fVar, dataOutput);
        int m = m11268m(fVar);
        int k = m11270k(m);
        dataOutput.writeByte(((fVar.m11234m() << 3) | k) & 255);
        if (!u) {
            m11259v(dataOutput, fVar.m11236e());
        }
        if (k == 0) {
            dataOutput.writeInt(m);
        }
    }

    /* renamed from: t */
    private static void m11261t(Object obj, DataOutput dataOutput) {
        boolean z;
        int i;
        C11016h hVar = (C11016h) obj;
        boolean u = m11260u(hVar, dataOutput);
        int m = hVar.m11225m() << 5;
        int m2 = m11268m(hVar);
        if (m2 % 3600 == 0) {
            i = m | (m2 / 3600);
            z = true;
        } else {
            i = m | 31;
            z = false;
        }
        dataOutput.writeByte(i & 255);
        if (!u) {
            m11259v(dataOutput, hVar.m11236e());
        }
        if (!z) {
            dataOutput.writeInt(m2);
        }
    }

    /* renamed from: u */
    private static boolean m11260u(C11015g gVar, DataOutput dataOutput) {
        int i;
        int k = gVar.m11229k() << 4;
        int ordinal = gVar.m11237d().ordinal();
        int e = gVar.m11236e();
        boolean z = true;
        if (e != 0) {
            if (e == 1800) {
                ordinal += 3;
            } else if (e == 3600) {
                ordinal += 6;
            } else if (e != 7200) {
                i = k | (ordinal + 12);
                z = false;
                dataOutput.writeByte(i & 255);
                return z;
            } else {
                ordinal += 9;
            }
        }
        i = k | ordinal;
        dataOutput.writeByte(i & 255);
        return z;
    }

    /* renamed from: v */
    private static void m11259v(DataOutput dataOutput, int i) {
        if (i % 900 == 0) {
            dataOutput.writeByte(i / 900);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeInt(i);
    }

    /* renamed from: w */
    private static void m11258w(Object obj, ObjectOutput objectOutput) {
        C11021j jVar = (C11021j) obj;
        C11029q l = jVar.m11218l();
        long e = l.m11173e();
        if (e < -4575744000L || e >= 10464767099L || e % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(l.m11173e());
        } else {
            int i = (int) ((e - (-4575744000L)) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
        }
        m11259v(objectOutput, l.m11172f());
        m11259v(objectOutput, l.m11169i());
        m11259v(objectOutput, l.m11174d());
        m11257x(jVar.m11216n(), objectOutput);
    }

    /* renamed from: x */
    private static void m11257x(List<AbstractC11012d> list, ObjectOutput objectOutput) {
        objectOutput.writeByte(list.size());
        for (AbstractC11012d dVar : list) {
            objectOutput.writeByte(dVar.mo11227g());
            switch (dVar.mo11227g()) {
                case 120:
                    m11262s(dVar, objectOutput);
                    break;
                case 121:
                    m11263r(dVar, objectOutput);
                    break;
                case 122:
                    m11261t(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    /* renamed from: y */
    private static int m11256y(C11029q qVar, int i, DataOutput dataOutput) {
        boolean z;
        byte b;
        int h = qVar.m11170h();
        int i2 = 1;
        int i3 = 0;
        if (h != i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b = (byte) 128;
        } else {
            b = 0;
        }
        int d = qVar.m11174d();
        if (d != 0) {
            if (d == 3600) {
                i2 = 2;
            } else if (d != 7200) {
                i2 = 0;
            } else {
                i2 = 3;
            }
        }
        byte b2 = (byte) (b | (i2 << 5));
        long e = qVar.m11173e() + i + 7200;
        if (e >= -4575744000L && e < 18067104000L) {
            i3 = m11269l(C10813c.m12199d(e, 86400));
        }
        byte b3 = (byte) ((i3 << 2) | b2);
        if (i3 == 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeLong(qVar.m11173e());
        } else {
            int i4 = (int) ((e - (-4575744000L)) / 86400);
            dataOutput.writeByte((byte) (b3 | ((byte) ((i4 >>> 16) & 3))));
            dataOutput.writeByte((i4 >>> 8) & 255);
            dataOutput.writeByte(i4 & 255);
        }
        if (i2 == 0) {
            m11259v(dataOutput, d);
        }
        if (z) {
            m11259v(dataOutput, h);
        }
        return h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static void m11255z(C11029q[] qVarArr, int i, DataOutput dataOutput) {
        int min = Math.min(i, qVarArr.length);
        dataOutput.writeInt(min);
        if (min > 0) {
            int f = qVarArr[0].m11172f();
            m11259v(dataOutput, f);
            for (int i2 = 0; i2 < min; i2++) {
                f = m11256y(qVarArr[i2], f, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        switch (objectInput.readByte()) {
            case 120:
                this.f24469k = m11277d(objectInput);
                return;
            case 121:
                this.f24469k = m11278c(objectInput);
                return;
            case 122:
                this.f24469k = m11276e(objectInput);
                return;
            case 123:
            case 124:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                this.f24469k = m11274g(objectInput);
                return;
            case 126:
                this.f24469k = m11280a(objectInput);
                return;
            case Byte.MAX_VALUE:
                this.f24469k = m11279b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.f24470l);
        switch (this.f24470l) {
            case 120:
                m11262s(this.f24469k, objectOutput);
                return;
            case 121:
                m11263r(this.f24469k, objectOutput);
                return;
            case 122:
                m11261t(this.f24469k, objectOutput);
                return;
            case 123:
            case 124:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                m11258w(this.f24469k, objectOutput);
                return;
            case 126:
                m11265p(this.f24469k, objectOutput);
                return;
            case 127:
                m11264q(this.f24469k, objectOutput);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f24469k = obj;
        this.f24470l = i;
    }
}
