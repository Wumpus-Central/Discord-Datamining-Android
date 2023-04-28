package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C5066c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import p076e4.C6706f;
import p380v5.C13434e;
import p394w3.C13740j;
import p414x3.C13925a;
import p455z3.AbstractC14537h;

/* renamed from: com.facebook.imagepipeline.producers.b0 */
/* loaded from: classes7.dex */
public class C4955b0 extends AbstractC4960c0 implements AbstractC5059z0<C13434e> {

    /* renamed from: d */
    private static final Class<?> f8383d = C4955b0.class;

    /* renamed from: e */
    private static final String[] f8384e = {"_id", "_data"};

    /* renamed from: f */
    private static final String[] f8385f = {"_data"};

    /* renamed from: g */
    private static final Rect f8386g = new Rect(0, 0, 512, 384);

    /* renamed from: h */
    private static final Rect f8387h = new Rect(0, 0, 96, 96);

    /* renamed from: c */
    private final ContentResolver f8388c;

    public C4955b0(Executor executor, AbstractC14537h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f8388c = contentResolver;
    }

    /* renamed from: g */
    private C13434e m31190g(Uri uri, ResizeOptions resizeOptions) {
        Cursor query;
        C13434e j;
        if (resizeOptions == null || (query = this.f8388c.query(uri, f8384e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j = m31187j(resizeOptions, query.getLong(query.getColumnIndex("_id")))) == null) {
                return null;
            }
            j.m3718L0(m31188i(query.getString(query.getColumnIndex("_data"))));
            return j;
        } finally {
            query.close();
        }
    }

    /* renamed from: h */
    private static int m31189h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* renamed from: i */
    private static int m31188i(String str) {
        if (str != null) {
            try {
                return C5066c.m30856a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C13925a.m2289i(f8383d, e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: j */
    private C13434e m31187j(ResizeOptions resizeOptions, long j) {
        Cursor queryMiniThumbnail;
        int k = m31186k(resizeOptions);
        if (k == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f8388c, j, k, f8385f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String str = (String) C13740j.m2834g(queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data")));
                if (new File(str).exists()) {
                    return m31173e(new FileInputStream(str), m31189h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    /* renamed from: k */
    private static int m31186k(ResizeOptions resizeOptions) {
        Rect rect = f8387h;
        if (C4953a1.m31202b(rect.width(), rect.height(), resizeOptions)) {
            return 3;
        }
        Rect rect2 = f8386g;
        if (C4953a1.m31202b(rect2.width(), rect2.height(), resizeOptions)) {
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5059z0
    /* renamed from: a */
    public boolean mo30906a(ResizeOptions resizeOptions) {
        Rect rect = f8386g;
        return C4953a1.m31202b(rect.width(), rect.height(), resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: d */
    protected C13434e mo30910d(ImageRequest imageRequest) {
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6706f.m24602h(sourceUri)) {
            return m31190g(sourceUri, imageRequest.getResizeOptions());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC4960c0
    /* renamed from: f */
    protected String mo30909f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}
