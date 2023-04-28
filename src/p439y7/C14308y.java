package p439y7;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;
import p133h9.C7942b;

/* renamed from: y7.y */
/* loaded from: classes7.dex */
public final class C14308y {
    /* renamed from: a */
    public static void m961a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m960b(MediaFormat mediaFormat, C7942b bVar) {
        if (bVar != null) {
            m958d(mediaFormat, "color-transfer", bVar.f17047m);
            m958d(mediaFormat, "color-standard", bVar.f17045k);
            m958d(mediaFormat, "color-range", bVar.f17046l);
            m961a(mediaFormat, "hdr-static-info", bVar.f17048n);
        }
    }

    /* renamed from: c */
    public static void m959c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m958d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m957e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
