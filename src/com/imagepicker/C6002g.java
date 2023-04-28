package com.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.imagepicker.g */
/* loaded from: classes6.dex */
public class C6002g extends AbstractC5999d {

    /* renamed from: d */
    private int f12120d;

    /* renamed from: e */
    private int f12121e;

    public C6002g(Uri uri, Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap b = m26506b(uri, context, mediaMetadataRetriever);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata != null) {
            this.f12120d = Math.round(Float.parseFloat(extractMetadata)) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (extractMetadata2 != null) {
            this.f12121e = Integer.parseInt(extractMetadata2);
        }
        if (extractMetadata3 != null) {
            this.f12097a = m26540a(extractMetadata3.substring(0, extractMetadata3.indexOf(".")).replace("T", " "), "yyyyMMdd HHmmss");
        }
        if (b != null) {
            this.f12099c = b.getWidth();
            this.f12098b = b.getHeight();
        }
        mediaMetadataRetriever.release();
    }

    /* renamed from: b */
    private Bitmap m26506b(Uri uri, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.setDataSource(new FileInputStream(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor()).getFD());
            return mediaMetadataRetriever.getFrameAtTime();
        } catch (IOException | RuntimeException e) {
            Log.e("RNIP", "Could not retrieve width and height from video: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public int m26505c() {
        return this.f12121e;
    }

    /* renamed from: d */
    public String m26504d() {
        return this.f12097a;
    }

    /* renamed from: e */
    public int m26503e() {
        return this.f12120d;
    }

    /* renamed from: f */
    public int m26502f() {
        return this.f12098b;
    }

    /* renamed from: g */
    public int m26501g() {
        return this.f12099c;
    }
}
