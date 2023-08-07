package com.discord.media.utils;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004J\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media/utils/BitmapUtils;", "", "()V", "DEFAULT_QUALITY", "", "toByteArray", "", "Landroid/graphics/Bitmap;", "format", "Landroid/graphics/Bitmap$CompressFormat;", "quality", "mimeType", "", "media_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BitmapUtils {
    private static final int DEFAULT_QUALITY = 80;
    public static final BitmapUtils INSTANCE = new BitmapUtils();

    private BitmapUtils() {
    }

    public static  byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 80;
        }
        return bitmapUtils.toByteArray(bitmap, compressFormat, i10);
    }

    public final byte[] toByteArray(Bitmap bitmap, Bitmap.CompressFormat format, int i10) {
        q.h(bitmap, "<this>");
        q.h(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        q.g(byteArray, "ByteArrayOutputStream().…)\n        }.toByteArray()");
        return byteArray;
    }

    public static  byte[] toByteArray$default(BitmapUtils bitmapUtils, Bitmap bitmap, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 80;
        }
        return bitmapUtils.toByteArray(bitmap, str, i10);
    }

    
    
    
    
    public final byte[] toByteArray(android.graphics.Bitmap r3, java.lang.String r4, int r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.BitmapUtils.toByteArray(android.graphics.Bitmap, java.lang.String, int):byte[]");
    }
}
