package p441y9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: y9.c */
/* loaded from: classes5.dex */
public class C14323c {
    /* renamed from: a */
    public static int m857a(Parcel parcel) {
        return m837u(parcel, 20293);
    }

    /* renamed from: b */
    public static void m856b(Parcel parcel, int i) {
        m836v(parcel, i);
    }

    /* renamed from: c */
    public static void m855c(Parcel parcel, int i, boolean z) {
        m835w(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m854d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            m835w(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m853e(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int u = m837u(parcel, i);
            parcel.writeBundle(bundle);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m852f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int u = m837u(parcel, i);
            parcel.writeByteArray(bArr);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: g */
    public static void m851g(Parcel parcel, int i, double d) {
        m835w(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: h */
    public static void m850h(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m835w(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: i */
    public static void m849i(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int u = m837u(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m848j(Parcel parcel, int i, int i2) {
        m835w(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: k */
    public static void m847k(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int u = m837u(parcel, i);
            parcel.writeIntArray(iArr);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: l */
    public static void m846l(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m835w(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m845m(Parcel parcel, int i, long j) {
        m835w(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: n */
    public static void m844n(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int u = m837u(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: o */
    public static void m843o(Parcel parcel, int i, short s) {
        m835w(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: p */
    public static void m842p(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int u = m837u(parcel, i);
            parcel.writeString(str);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m841q(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int u = m837u(parcel, i);
            parcel.writeStringArray(strArr);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m840r(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            int u = m837u(parcel, i);
            parcel.writeStringList(list);
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static <T extends Parcelable> void m839s(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int u = m837u(parcel, i);
            parcel.writeInt(tArr.length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m834x(parcel, t, i2);
                }
            }
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: t */
    public static <T extends Parcelable> void m838t(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            int u = m837u(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m834x(parcel, t, 0);
                }
            }
            m836v(parcel, u);
        } else if (z) {
            m835w(parcel, i, 0);
        }
    }

    /* renamed from: u */
    private static int m837u(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: v */
    private static void m836v(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: w */
    private static void m835w(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: x */
    private static <T extends Parcelable> void m834x(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
