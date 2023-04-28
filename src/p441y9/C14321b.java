package p441y9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: y9.b */
/* loaded from: classes5.dex */
public class C14321b {

    /* renamed from: y9.b$a */
    /* loaded from: classes5.dex */
    public static class C14322a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C14322a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p441y9.C14321b.C14322a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    /* renamed from: a */
    public static Bundle m883a(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + v);
        return readBundle;
    }

    /* renamed from: b */
    public static byte[] m882b(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + v);
        return createByteArray;
    }

    /* renamed from: c */
    public static int[] m881c(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + v);
        return createIntArray;
    }

    /* renamed from: d */
    public static <T extends Parcelable> T m880d(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + v);
        return createFromParcel;
    }

    /* renamed from: e */
    public static String m879e(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + v);
        return readString;
    }

    /* renamed from: f */
    public static String[] m878f(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + v);
        return createStringArray;
    }

    /* renamed from: g */
    public static ArrayList<String> m877g(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + v);
        return createStringArrayList;
    }

    /* renamed from: h */
    public static <T> T[] m876h(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + v);
        return tArr;
    }

    /* renamed from: i */
    public static <T> ArrayList<T> m875i(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + v);
        return createTypedArrayList;
    }

    /* renamed from: j */
    public static void m874j(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Overread allowed size end=");
            sb2.append(i);
            throw new C14322a(sb2.toString(), parcel);
        }
    }

    /* renamed from: k */
    public static int m873k(int i) {
        return (char) i;
    }

    /* renamed from: l */
    public static boolean m872l(Parcel parcel, int i) {
        m858z(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static Boolean m871m(Parcel parcel, int i) {
        boolean z;
        int v = m862v(parcel, i);
        if (v == 0) {
            return null;
        }
        m859y(parcel, i, v, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: n */
    public static double m870n(Parcel parcel, int i) {
        m858z(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m869o(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        if (v == 0) {
            return null;
        }
        m859y(parcel, i, v, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static int m868p(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: q */
    public static IBinder m867q(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + v);
        return readStrongBinder;
    }

    /* renamed from: r */
    public static int m866r(Parcel parcel, int i) {
        m858z(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: s */
    public static Integer m865s(Parcel parcel, int i) {
        int v = m862v(parcel, i);
        if (v == 0) {
            return null;
        }
        m859y(parcel, i, v, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: t */
    public static long m864t(Parcel parcel, int i) {
        m858z(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: u */
    public static short m863u(Parcel parcel, int i) {
        m858z(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: v */
    public static int m862v(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: w */
    public static void m861w(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m862v(parcel, i));
    }

    /* renamed from: x */
    public static int m860x(Parcel parcel) {
        String str;
        int p = m868p(parcel);
        int v = m862v(parcel, p);
        int dataPosition = parcel.dataPosition();
        if (m873k(p) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(p));
            if (valueOf.length() != 0) {
                str = "Expected object header. Got 0x".concat(valueOf);
            } else {
                str = new String("Expected object header. Got 0x");
            }
            throw new C14322a(str, parcel);
        }
        int i = v + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i);
        throw new C14322a(sb2.toString(), parcel);
    }

    /* renamed from: y */
    private static void m859y(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i3);
            sb2.append(" got ");
            sb2.append(i2);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new C14322a(sb2.toString(), parcel);
        }
    }

    /* renamed from: z */
    private static void m858z(Parcel parcel, int i, int i2) {
        int v = m862v(parcel, i);
        if (v != i2) {
            String hexString = Integer.toHexString(v);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i2);
            sb2.append(" got ");
            sb2.append(v);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new C14322a(sb2.toString(), parcel);
        }
    }
}
