package p026b6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.OutputStream;
import p170j5.C9489b;
import p170j5.C9490c;
import p380v5.C13434e;
import p414x3.C13925a;

/* renamed from: b6.g */
/* loaded from: classes7.dex */
public class C3391g implements AbstractC3387c {

    /* renamed from: a */
    private final boolean f5423a;

    /* renamed from: b */
    private final int f5424b;

    public C3391g(boolean z, int i) {
        this.f5423a = z;
        this.f5424b = i;
    }

    /* renamed from: e */
    private static Bitmap.CompressFormat m34523e(C9490c cVar) {
        if (cVar == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == C9489b.f21011a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (cVar == C9489b.f21012b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (C9489b.m16146a(cVar)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: f */
    private int m34522f(C13434e eVar, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (!this.f5423a) {
            return 1;
        }
        return C3385a.m34544b(rotationOptions, resizeOptions, eVar, this.f5424b);
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: a */
    public String mo31261a() {
        return "SimpleImageTranscoder";
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: b */
    public boolean mo31260b(C9490c cVar) {
        return cVar == C9489b.f21021k || cVar == C9489b.f21011a;
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: c */
    public C3386b mo31259c(C13434e eVar, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, C9490c cVar, Integer num) {
        Integer num2;
        C3391g gVar;
        RotationOptions rotationOptions2;
        Bitmap bitmap;
        Throwable th2;
        if (num == null) {
            num2 = 85;
        } else {
            num2 = num;
        }
        if (rotationOptions == null) {
            rotationOptions2 = RotationOptions.m31497a();
            gVar = this;
        } else {
            gVar = this;
            rotationOptions2 = rotationOptions;
        }
        int f = gVar.m34522f(eVar, rotationOptions2, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = f;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(eVar.m3696z(), null, options);
            if (decodeStream == null) {
                C13925a.m2288j("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C3386b(2);
            }
            Matrix g = C3389e.m34532g(eVar, rotationOptions2);
            if (g != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    C13925a.m2287k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C3386b bVar = new C3386b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th2;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(m34523e(cVar), num2.intValue(), outputStream);
                    int i = 1;
                    if (f > 1) {
                        i = 0;
                    }
                    C3386b bVar2 = new C3386b(i);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar2;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    C13925a.m2287k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C3386b bVar3 = new C3386b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return bVar3;
                }
            } catch (Throwable th4) {
                th2 = th4;
                bitmap.recycle();
                decodeStream.recycle();
                throw th2;
            }
        } catch (OutOfMemoryError e3) {
            C13925a.m2287k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new C3386b(2);
        }
    }

    @Override // p026b6.AbstractC3387c
    /* renamed from: d */
    public boolean mo31258d(C13434e eVar, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31497a();
        }
        if (!this.f5423a || C3385a.m34544b(rotationOptions, resizeOptions, eVar, this.f5424b) <= 1) {
            return false;
        }
        return true;
    }
}
