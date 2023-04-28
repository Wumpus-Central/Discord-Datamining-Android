package com.discord.media.utils;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m15073d2 = {"Lcom/discord/media/utils/BitmapUtils;", "", "()V", "DEFAULT_QUALITY", "", "toByteArray", "", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "mimeType", "", "media_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class BitmapUtils {
    private static final int DEFAULT_QUALITY = 80;
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 80;
        }
        return bitmapUtils.toByteArray(bitmap, compressFormat, i);
    }

    public final byte[] toByteArray(Bitmap bitmap, Bitmap.CompressFormat format, int i) {
        C9677q.m14633g(bitmap, "<this>");
        C9677q.m14633g(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C9677q.m14634f(byteArray, "ByteArrayOutputStream().…)\n        }.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 80;
        }
        return bitmapUtils.toByteArray(bitmap, str, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r4.equals("image/jpg") != false) goto L_0x0046;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r4.equals("image/jpeg") == false) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return toByteArray(r3, android.graphics.Bitmap.CompressFormat.JPEG, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] toByteArray(android.graphics.Bitmap r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9677q.m14633g(r3, r0)
            java.lang.String r0 = "mimeType"
            kotlin.jvm.internal.C9677q.m14633g(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1487394660(0xffffffffa758289c, float:-2.9998036E-15)
            if (r0 == r1) goto L_0x0037
            r1 = -879264467(0xffffffffcb977d2d, float:-1.9855962E7)
            if (r0 == r1) goto L_0x002e
            r1 = -879258763(0xffffffffcb979375, float:-1.986737E7)
            if (r0 == r1) goto L_0x001e
            goto L_0x003f
        L_0x001e:
            java.lang.String r0 = "image/png"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            goto L_0x004c
        L_0x002e:
            java.lang.String r0 = "image/jpg"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003f
            goto L_0x0046
        L_0x0037:
            java.lang.String r0 = "image/jpeg"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0046
        L_0x003f:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
            goto L_0x004c
        L_0x0046:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            byte[] r3 = r2.toByteArray(r3, r4, r5)
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.BitmapUtils.toByteArray(android.graphics.Bitmap, java.lang.String, int):byte[]");
    }
}
