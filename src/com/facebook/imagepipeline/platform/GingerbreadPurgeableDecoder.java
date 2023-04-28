package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p037c4.C3763a;
import p095f4.AbstractC7012b;
import p095f4.C7014c;
import p394w3.AbstractC13731d;
import p394w3.C13728a;
import p394w3.C13729b;
import p394w3.C13740j;
import p394w3.C13747n;
import p455z3.AbstractC14535g;
import p455z3.C14538i;

@AbstractC13731d
/* loaded from: classes7.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d */
    private static Method f8355d;

    /* renamed from: c */
    private final AbstractC7012b f8356c = C7014c.m23649i();

    /* renamed from: h */
    private static MemoryFile m31243h(CloseableReference<AbstractC14535g> closeableReference, int i, byte[] bArr) {
        int i2;
        OutputStream outputStream;
        Throwable th2;
        C3763a aVar;
        if (bArr == null) {
            i2 = 0;
        } else {
            i2 = bArr.length;
        }
        C14538i iVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, i2 + i);
        memoryFile.allowPurging(false);
        try {
            C14538i iVar2 = new C14538i(closeableReference.m32039C());
            try {
                aVar = new C3763a(iVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    C13728a.m2859a(aVar, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    CloseableReference.m32025t(closeableReference);
                    C13729b.m2856b(iVar2);
                    C13729b.m2856b(aVar);
                    C13729b.m2857a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th3) {
                    th2 = th3;
                    outputStream = outputStream2;
                    iVar = iVar2;
                    CloseableReference.m32025t(closeableReference);
                    C13729b.m2856b(iVar);
                    C13729b.m2856b(aVar);
                    C13729b.m2857a(outputStream, true);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                outputStream = null;
                aVar = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            outputStream = null;
            aVar = null;
        }
    }

    /* renamed from: i */
    private Bitmap m31242i(CloseableReference<AbstractC14535g> closeableReference, int i, byte[] bArr, BitmapFactory.Options options) {
        Throwable th2;
        IOException e;
        MemoryFile h;
        MemoryFile memoryFile = null;
        try {
            try {
                h = m31243h(closeableReference, i, bArr);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            FileDescriptor k = m31240k(h);
            AbstractC7012b bVar = this.f8356c;
            if (bVar != null) {
                Bitmap bitmap = (Bitmap) C13740j.m2833h(bVar.mo23658b(k, null, options), "BitmapFactory returned null");
                if (h != null) {
                    h.close();
                }
                return bitmap;
            }
            throw new IllegalStateException("WebpBitmapFactory is null");
        } catch (IOException e3) {
            e = e3;
            memoryFile = h;
            throw C13747n.m2823a(e);
        } catch (Throwable th4) {
            th2 = th4;
            memoryFile = h;
            if (memoryFile != null) {
                memoryFile.close();
            }
            throw th2;
        }
    }

    /* renamed from: j */
    private synchronized Method m31241j() {
        if (f8355d == null) {
            try {
                f8355d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e) {
                throw C13747n.m2823a(e);
            }
        }
        return f8355d;
    }

    /* renamed from: k */
    private FileDescriptor m31240k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) C13740j.m2834g(m31241j().invoke(memoryFile, new Object[0]));
        } catch (Exception e) {
            throw C13747n.m2823a(e);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    protected Bitmap mo31239c(CloseableReference<AbstractC14535g> closeableReference, BitmapFactory.Options options) {
        return m31242i(closeableReference, closeableReference.m32039C().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    protected Bitmap mo31238d(CloseableReference<AbstractC14535g> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.m31266e(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f8342b;
        }
        return m31242i(closeableReference, i, bArr, options);
    }
}
