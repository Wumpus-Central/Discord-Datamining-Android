package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p076e4.C6706f;
import p380v5.C13434e;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.a0 */
/* loaded from: classes7.dex */
public class C4952a0 extends AbstractC4960c0 {

    /* renamed from: d */
    private static final String[] f8380d = {"_id", "_data"};

    /* renamed from: c */
    private final ContentResolver f8381c;

    public C4952a0(Executor executor, AbstractC14537h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f8381c = contentResolver;
    }

    /* renamed from: g */
    private C13434e m31204g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f8381c.openFileDescriptor(uri, "r");
            return m31173e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        C13434e g;
        InputStream inputStream;
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6706f.m24601i(sourceUri)) {
            if (sourceUri.toString().endsWith("/photo")) {
                inputStream = this.f8381c.openInputStream(sourceUri);
            } else if (sourceUri.toString().endsWith("/display_photo")) {
                try {
                    inputStream = this.f8381c.openAssetFileDescriptor(sourceUri, "r").createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f8381c, sourceUri);
                if (openContactPhotoInputStream != null) {
                    inputStream = openContactPhotoInputStream;
                } else {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            }
            return m31173e(inputStream, -1);
        } else if (!C6706f.m24602h(sourceUri) || (g = m31204g(sourceUri)) == null) {
            return m31173e(this.f8381c.openInputStream(sourceUri), -1);
        } else {
            return g;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "LocalContentUriFetchProducer";
    }
}
