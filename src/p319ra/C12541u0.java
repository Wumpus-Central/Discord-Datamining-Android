package p319ra;

import android.os.ParcelUuid;
import android.util.SparseArray;
import ca.C3800g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: ra.u0 */
/* loaded from: classes3.dex */
public final class C12541u0 {

    /* renamed from: h */
    private static final ParcelUuid f28218h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    private final int f28219a;

    /* renamed from: b */
    private final List f28220b;

    /* renamed from: c */
    private final SparseArray f28221c;

    /* renamed from: d */
    private final Map f28222d;

    /* renamed from: e */
    private final int f28223e;

    /* renamed from: f */
    private final String f28224f;

    /* renamed from: g */
    private final byte[] f28225g;

    private C12541u0(List list, SparseArray sparseArray, Map map, int i, int i2, String str, byte[] bArr) {
        this.f28220b = list;
        this.f28221c = sparseArray;
        this.f28222d = map;
        this.f28224f = str;
        this.f28219a = i;
        this.f28223e = i2;
        this.f28225g = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p319ra.C12541u0 m6576a(byte[] r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r2 = -1
            r3 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r0
            r7 = r6
            r6 = r2
        L_0x001a:
            int r2 = r13.length     // Catch: Exception -> 0x0098
            if (r3 >= r2) goto L_0x0086
            int r2 = r3 + 1
            byte r3 = r13[r3]     // Catch: Exception -> 0x0098
            r9 = 255(0xff, float:3.57E-43)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x0027
            goto L_0x0086
        L_0x0027:
            int r3 = r3 + (-1)
            int r10 = r2 + 1
            byte r2 = r13[r2]     // Catch: Exception -> 0x0098
            r2 = r2 & r9
            r11 = 22
            r12 = 2
            if (r2 == r11) goto L_0x0071
            if (r2 == r9) goto L_0x005a
            switch(r2) {
                case 1: goto L_0x0055;
                case 2: goto L_0x0051;
                case 3: goto L_0x0051;
                case 4: goto L_0x004c;
                case 5: goto L_0x004c;
                case 6: goto L_0x0046;
                case 7: goto L_0x0046;
                case 8: goto L_0x003c;
                case 9: goto L_0x003c;
                case 10: goto L_0x0039;
                default: goto L_0x0038;
            }     // Catch: Exception -> 0x0098
        L_0x0038:
            goto L_0x0084
        L_0x0039:
            byte r7 = r13[r10]     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x003c:
            java.lang.String r8 = new java.lang.String     // Catch: Exception -> 0x0098
            byte[] r2 = m6573d(r13, r10, r3)     // Catch: Exception -> 0x0098
            r8.<init>(r2)     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x0046:
            r2 = 16
            m6575b(r13, r10, r3, r2, r1)     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x004c:
            r2 = 4
            m6575b(r13, r10, r3, r2, r1)     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x0051:
            m6575b(r13, r10, r3, r12, r1)     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x0055:
            byte r2 = r13[r10]     // Catch: Exception -> 0x0098
            r6 = r2 & 255(0xff, float:3.57E-43)
            goto L_0x0084
        L_0x005a:
            int r2 = r10 + 1
            byte r2 = r13[r2]     // Catch: Exception -> 0x0098
            r2 = r2 & r9
            int r2 = r2 << 8
            byte r11 = r13[r10]     // Catch: Exception -> 0x0098
            r9 = r9 & r11
            int r2 = r2 + r9
            int r9 = r10 + 2
            int r11 = r3 + (-2)
            byte[] r9 = m6573d(r13, r9, r11)     // Catch: Exception -> 0x0098
            r4.put(r2, r9)     // Catch: Exception -> 0x0098
            goto L_0x0084
        L_0x0071:
            byte[] r2 = m6573d(r13, r10, r12)     // Catch: Exception -> 0x0098
            android.os.ParcelUuid r2 = m6574c(r2)     // Catch: Exception -> 0x0098
            int r9 = r10 + 2
            int r11 = r3 + (-2)
            byte[] r9 = m6573d(r13, r9, r11)     // Catch: Exception -> 0x0098
            r5.put(r2, r9)     // Catch: Exception -> 0x0098
        L_0x0084:
            int r3 = r3 + r10
            goto L_0x001a
        L_0x0086:
            boolean r2 = r1.isEmpty()     // Catch: Exception -> 0x0098
            r3 = 1
            if (r3 == r2) goto L_0x008f
            r3 = r1
            goto L_0x0090
        L_0x008f:
            r3 = r0
        L_0x0090:
            ra.u0 r1 = new ra.u0     // Catch: Exception -> 0x0098
            r2 = r1
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: Exception -> 0x0098
            return r1
        L_0x0098:
            r1 = move-exception
            java.lang.String r13 = java.util.Arrays.toString(r13)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r2 = "Unable to parse scan record: "
            java.lang.String r13 = r2.concat(r13)
            java.lang.String r2 = "BleRecord"
            android.util.Log.w(r2, r13, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p319ra.C12541u0.m6576a(byte[]):ra.u0");
    }

    /* renamed from: b */
    private static int m6575b(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(m6574c(m6573d(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: c */
    private static ParcelUuid m6574c(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
            } else {
                j = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
            }
            ParcelUuid parcelUuid = f28218h;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    /* renamed from: d */
    private static byte[] m6573d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12541u0)) {
            return false;
        }
        return Arrays.equals(this.f28225g, ((C12541u0) obj).f28225g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28225g);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f28219a;
        String valueOf = String.valueOf(this.f28220b);
        SparseArray sparseArray = this.f28221c;
        StringBuilder sb2 = new StringBuilder();
        String str4 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str4;
        } else {
            sb2.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb2.append(keyAt);
                sb2.append('=');
                if (bArr == null) {
                    str3 = null;
                } else {
                    str3 = C3800g.m33572a(bArr);
                }
                sb2.append(str3);
            }
            sb2.append('}');
            str = sb2.toString();
        }
        Map map = this.f28222d;
        StringBuilder sb3 = new StringBuilder();
        if (map.keySet().size() > 0) {
            sb3.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb3.append(", ");
                }
                sb3.append(entry.getKey());
                sb3.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 == null) {
                    str2 = null;
                } else {
                    str2 = C3800g.m33572a(bArr2);
                }
                sb3.append(str2);
                i2++;
            }
            sb3.append('}');
            str4 = sb3.toString();
        }
        return "BleRecord [mAdvertiseFlags=" + i + ", mServiceUuids=" + valueOf + ", mManufacturerSpecificData=" + str + ", mServiceData=" + str4 + ", mTxPowerLevel=" + this.f28223e + ", mDeviceName=" + this.f28224f + "]";
    }
}
