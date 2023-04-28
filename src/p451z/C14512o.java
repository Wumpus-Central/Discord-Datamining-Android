package p451z;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1915r1;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.utils.C1858m;
import androidx.core.util.C2517g;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p001a0.C1230a;
import p390w.AbstractC13645o0;

/* renamed from: z.o */
/* loaded from: classes.dex */
public class C14512o implements AbstractC13645o0 {

    /* renamed from: h */
    private static final Rect f32903h = new Rect(0, 0, 0, 0);

    /* renamed from: a */
    private int f32904a;

    /* renamed from: b */
    private final int f32905b;

    /* renamed from: f */
    private ImageWriter f32909f;

    /* renamed from: c */
    private final Object f32906c = new Object();

    /* renamed from: d */
    private boolean f32907d = false;

    /* renamed from: e */
    private int f32908e = 0;

    /* renamed from: g */
    private Rect f32910g = f32903h;

    public C14512o(int i, int i2) {
        this.f32904a = i;
        this.f32905b = i2;
    }

    /* renamed from: e */
    private static C1858m m287e(ImageProxy imageProxy) {
        C1858m.C1860b a = C1858m.m39640a();
        imageProxy.mo39604p0().mo344b(a);
        return a.m39628j(imageProxy.getWidth()).m39629i(imageProxy.getHeight()).m39637a();
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: a */
    public void mo291a(Surface surface, int i) {
        boolean z;
        if (i == 256) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37585j(z, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f32906c) {
            if (this.f32907d) {
                C1915r1.m39517k("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
            } else if (this.f32909f == null) {
                this.f32909f = C1230a.m41556d(surface, this.f32905b, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131 A[Catch: all -> 0x0154, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0154, blocks: (B:43:0x00e3, B:77:0x0131), top: B:129:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    @Override // p390w.AbstractC13645o0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo290b(p390w.AbstractC13629l1 r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p451z.C14512o.mo290b(w.l1):void");
    }

    @Override // p390w.AbstractC13645o0
    /* renamed from: c */
    public void mo289c(Size size) {
        synchronized (this.f32906c) {
            this.f32910g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* renamed from: d */
    public void m288d() {
        synchronized (this.f32906c) {
            if (!this.f32907d) {
                this.f32907d = true;
                if (this.f32908e != 0 || this.f32909f == null) {
                    C1915r1.m39527a("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                } else {
                    C1915r1.m39527a("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                    this.f32909f.close();
                }
            }
        }
    }

    /* renamed from: f */
    public void m286f(int i) {
        this.f32904a = i;
    }

    /* renamed from: z.o$a */
    /* loaded from: classes.dex */
    private static final class C14513a extends OutputStream {

        /* renamed from: k */
        private final ByteBuffer f32911k;

        C14513a(ByteBuffer byteBuffer) {
            this.f32911k = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            if (this.f32911k.hasRemaining()) {
                this.f32911k.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.f32911k.remaining() >= i2) {
                    this.f32911k.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
