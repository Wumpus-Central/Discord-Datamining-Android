package ca;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

@Deprecated
/* renamed from: ca.i */
/* loaded from: classes5.dex */
public final class C3802i {
    /* renamed from: a */
    public static void m33568a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m33567b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
