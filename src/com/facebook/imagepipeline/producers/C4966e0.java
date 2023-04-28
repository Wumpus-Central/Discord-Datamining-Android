package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import p380v5.C13434e;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.e0 */
/* loaded from: classes7.dex */
public class C4966e0 extends AbstractC4960c0 {

    /* renamed from: c */
    private final Resources f8420c;

    public C4966e0(Executor executor, AbstractC14537h hVar, Resources resources) {
        super(executor, hVar);
        this.f8420c = resources;
    }

    /* renamed from: g */
    private int m31145g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f8420c.openRawResourceFd(m31144h(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor == null) {
                return -1;
            }
            try {
                assetFileDescriptor.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: h */
    private static int m31144h(ImageRequest imageRequest) {
        return Integer.parseInt(imageRequest.getSourceUri().getPath().substring(1));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        return m31173e(this.f8420c.openRawResource(m31144h(imageRequest)), m31145g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "LocalResourceFetchProducer";
    }
}
