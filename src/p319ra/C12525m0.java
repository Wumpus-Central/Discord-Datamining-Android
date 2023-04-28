package p319ra;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import p441y9.AbstractC14320a;

/* renamed from: ra.m0 */
/* loaded from: classes3.dex */
public final class C12525m0 extends AbstractC14320a {
    public static final Parcelable.Creator<C12525m0> CREATOR = new C12523l0();

    /* renamed from: k */
    private byte[] f28190k;

    /* renamed from: l */
    private ParcelFileDescriptor f28191l;

    private C12525m0() {
        this.f28190k = new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static byte[] m6589t(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            m6588u(dataInputStream);
        }
    }

    /* renamed from: u */
    private static void m6588u(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12525m0) {
            return Arrays.equals(this.f28190k, ((C12525m0) obj).f28190k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28190k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
        if (r5 == null) goto L_0x00b4;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b9: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:37:0x00b9 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ParcelByteArray"
            byte[] r1 = r7.f28190k
            r2 = 0
            if (r1 == 0) goto L_0x00c0
            android.os.ParcelFileDescriptor r3 = r7.f28191l
            if (r3 != 0) goto L_0x00c0
            java.io.File r3 = p319ra.C12535r0.m6578a()     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            if (r3 == 0) goto L_0x006e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            java.lang.String r5 = "teleporter"
            r4.<init>(r5)     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            r4.append(r5)     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            java.lang.String r4 = r4.toString()     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: IOException -> 0x0065, all -> 0x0076, IllegalStateException -> 0x0095
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: FileNotFoundException -> 0x005c, all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            r4.<init>(r3)     // Catch: FileNotFoundException -> 0x005c, all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch: FileNotFoundException -> 0x005c, all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            r3.delete()     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            android.util.Pair r3 = android.util.Pair.create(r4, r5)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.lang.Object r5 = r3.first     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            r4.<init>(r5)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            r5.<init>(r4)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            int r4 = r1.length     // Catch: IOException -> 0x0058, IllegalStateException -> 0x005a, all -> 0x00b8
            r5.writeInt(r4)     // Catch: IOException -> 0x0058, IllegalStateException -> 0x005a, all -> 0x00b8
            r5.write(r1)     // Catch: IOException -> 0x0058, IllegalStateException -> 0x005a, all -> 0x00b8
            java.lang.Object r1 = r3.second     // Catch: IOException -> 0x0058, IllegalStateException -> 0x005a, all -> 0x00b8
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1     // Catch: IOException -> 0x0058, IllegalStateException -> 0x005a, all -> 0x00b8
            m6588u(r5)
            goto L_0x00b5
        L_0x0058:
            r1 = move-exception
            goto L_0x007a
        L_0x005a:
            r1 = move-exception
            goto L_0x0097
        L_0x005c:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.lang.String r4 = "Temporary file is somehow already deleted"
            r3.<init>(r4, r1)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            throw r3     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
        L_0x0065:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.lang.String r4 = "Could not create temporary file"
            r3.<init>(r4, r1)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            throw r3     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
        L_0x006e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            java.lang.String r3 = "Must set temp dir before writing this object to a parcel"
            r1.<init>(r3)     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
            throw r1     // Catch: all -> 0x0076, IOException -> 0x0078, IllegalStateException -> 0x0095
        L_0x0076:
            r8 = move-exception
            goto L_0x00ba
        L_0x0078:
            r1 = move-exception
            r5 = r2
        L_0x007a:
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00b8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x00b8
            r3.<init>()     // Catch: all -> 0x00b8
            java.lang.String r4 = "Could not write into unlinked file. "
            r3.append(r4)     // Catch: all -> 0x00b8
            r3.append(r1)     // Catch: all -> 0x00b8
            java.lang.String r1 = r3.toString()     // Catch: all -> 0x00b8
            android.util.Log.e(r0, r1)     // Catch: all -> 0x00b8
            if (r5 == 0) goto L_0x00b4
            goto L_0x00b1
        L_0x0095:
            r1 = move-exception
            r5 = r2
        L_0x0097:
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00b8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x00b8
            r3.<init>()     // Catch: all -> 0x00b8
            java.lang.String r4 = "Could not create unlinked file. "
            r3.append(r4)     // Catch: all -> 0x00b8
            r3.append(r1)     // Catch: all -> 0x00b8
            java.lang.String r1 = r3.toString()     // Catch: all -> 0x00b8
            android.util.Log.e(r0, r1)     // Catch: all -> 0x00b8
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            m6588u(r5)
        L_0x00b4:
            r1 = r2
        L_0x00b5:
            r7.f28191l = r1
            goto L_0x00c0
        L_0x00b8:
            r8 = move-exception
            r2 = r5
        L_0x00ba:
            if (r2 == 0) goto L_0x00bf
            m6588u(r2)
        L_0x00bf:
            throw r8
        L_0x00c0:
            int r0 = p441y9.C14323c.m857a(r8)
            android.os.ParcelFileDescriptor r1 = r7.f28191l
            r3 = 1
            r9 = r9 | r3
            r4 = 0
            p441y9.C14323c.m844n(r8, r3, r1, r9, r4)
            p441y9.C14323c.m856b(r8, r0)
            r7.f28191l = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p319ra.C12525m0.writeToParcel(android.os.Parcel, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12525m0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f28190k = new byte[0];
        this.f28191l = parcelFileDescriptor;
    }
}
