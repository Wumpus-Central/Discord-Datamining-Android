package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import net.time4j.C10892f0;
import p143hj.EnumC8042a0;
import p234mj.EnumC10669b;

/* loaded from: classes8.dex */
final class SPX implements Externalizable {

    /* renamed from: m */
    private static final int[] f24236m = new int[0];
    private static final long serialVersionUID = 1;

    /* renamed from: k */
    private transient Object f24237k;

    /* renamed from: l */
    private transient int f24238l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.history.SPX$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C10923a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24239a;

        static {
            int[] iArr = new int[EnumC10669b.values().length];
            f24239a = iArr;
            try {
                iArr[EnumC10669b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24239a[EnumC10669b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24239a[EnumC10669b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24239a[EnumC10669b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24239a[EnumC10669b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    /* renamed from: a */
    private static EnumC10669b m11613a(int i) {
        EnumC10669b[] values;
        for (EnumC10669b bVar : EnumC10669b.values()) {
            if (bVar.m12673a() == i) {
                return bVar;
            }
        }
        throw new StreamCorruptedException("Unknown variant of chronological history.");
    }

    /* renamed from: b */
    private C10929d m11612b(DataInput dataInput, byte b) {
        int i = C10923a.f24239a[m11613a(b & 15).ordinal()];
        if (i == 1) {
            return C10929d.f38933A;
        }
        if (i == 2) {
            return C10929d.f38934B;
        }
        if (i == 3) {
            return C10929d.f38935C;
        }
        if (i == 4) {
            return C10929d.m11587H();
        }
        if (i != 5) {
            return C10929d.m11588G(C10892f0.m11869Q0(dataInput.readLong(), EnumC8042a0.MODIFIED_JULIAN_DATE));
        }
        return C10929d.m11590E();
    }

    /* renamed from: c */
    private static C10924a m11611c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i = 0; i < readInt; i++) {
            iArr[i] = 1 - dataInput.readInt();
        }
        return C10924a.m11604f(iArr);
    }

    /* renamed from: d */
    private void m11610d(DataOutput dataOutput) {
        int[] iArr;
        C10929d dVar = (C10929d) this.f24237k;
        dataOutput.writeByte(dVar.m11562t().m12673a() | (this.f24238l << 4));
        if (dVar.m11562t() == EnumC10669b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(dVar.m11565q().get(0).f24273a);
        }
        if (dVar.m11558x()) {
            iArr = dVar.m11569m().m11605e();
        } else {
            iArr = f24236m;
        }
        dataOutput.writeInt(iArr.length);
        for (int i : iArr) {
            dataOutput.writeInt(i);
        }
        dVar.m11559w().m11477g(dataOutput);
        dVar.m11566p().m11547h(dataOutput);
    }

    private Object readResolve() {
        return this.f24237k;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        C10929d dVar;
        byte readByte = objectInput.readByte();
        int i = (readByte & 255) >> 4;
        if (i == 1) {
            dVar = m11612b(objectInput, readByte);
        } else if (i == 2) {
            C10929d b = m11612b(objectInput, readByte);
            C10924a c = m11611c(objectInput);
            if (c != null) {
                dVar = b.m11586I(c);
            } else {
                dVar = b;
            }
        } else if (i == 3) {
            C10929d b2 = m11612b(objectInput, readByte);
            C10924a c2 = m11611c(objectInput);
            if (c2 != null) {
                b2 = b2.m11586I(c2);
            }
            dVar = b2.m11584K(C10954o.m11479e(objectInput)).m11585J(C10933g.m11548g(objectInput));
        } else {
            throw new StreamCorruptedException("Unknown serialized type.");
        }
        this.f24237k = dVar;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int i = this.f24238l;
        if (i == 1 || i == 2 || i == 3) {
            m11610d(objectOutput);
            return;
        }
        throw new InvalidClassException("Unknown serialized type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i) {
        this.f24237k = obj;
        this.f24238l = i;
    }
}
