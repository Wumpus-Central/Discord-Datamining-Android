package com.linecorp.apng.decoder;

import android.graphics.Bitmap;
import com.linecorp.apng.decoder.Apng;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(m15075bv = {1, 0, 3}, m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J\u0019\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087 J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0087 J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¨\u0006\u0013"}, m15073d2 = {"Lcom/linecorp/apng/decoder/ApngDecoderJni;", "", "()V", "copy", "", "id", "result", "Lcom/linecorp/apng/decoder/Apng$DecodeResult;", "decode", "inputStream", "Ljava/io/InputStream;", "draw", "", "index", "bitmap", "Landroid/graphics/Bitmap;", "isApng", "", "recycle", "apng-drawable_release"}, m15072k = 1, m15071mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ApngDecoderJni {
    public static final ApngDecoderJni INSTANCE = new ApngDecoderJni();

    static {
        System.loadLibrary("apng-drawable");
    }

    private ApngDecoderJni() {
    }

    public static final native int copy(int i, Apng.DecodeResult decodeResult);

    public static final native int decode(InputStream inputStream, Apng.DecodeResult decodeResult);

    public static final native void draw(int i, int i2, Bitmap bitmap);

    public static final native boolean isApng(InputStream inputStream);

    public static final native int recycle(int i);
}
