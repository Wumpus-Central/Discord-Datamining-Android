package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import p380v5.C13434e;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.z */
/* loaded from: classes7.dex */
public class C5058z extends AbstractC4960c0 {

    /* renamed from: c */
    private final AssetManager f8686c;

    public C5058z(Executor executor, AbstractC14537h hVar, AssetManager assetManager) {
        super(executor, hVar);
        this.f8686c = assetManager;
    }

    /* renamed from: g */
    private static String m30908g(ImageRequest imageRequest) {
        return imageRequest.getSourceUri().getPath().substring(1);
    }

    /* renamed from: h */
    private int m30907h(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f8686c.openFd(m30908g(imageRequest));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            return length;
        } catch (IOException unused2) {
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

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        return m31173e(this.f8686c.open(m30908g(imageRequest), 2), m30907h(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "LocalAssetFetchProducer";
    }
}
