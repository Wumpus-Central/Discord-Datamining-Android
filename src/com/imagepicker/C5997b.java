package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.C2892a;

/* renamed from: com.imagepicker.b */
/* loaded from: classes6.dex */
public class C5997b extends AbstractC5999d {
    public C5997b(Uri uri, Context context) {
        try {
            String f = new C2892a(context.getContentResolver().openInputStream(uri)).m36323f("DateTime");
            if (f != null) {
                this.f12097a = m26540a(f, "yyyy:MM:dd HH:mm:ss");
            }
        } catch (Exception e) {
            Log.e("RNIP", "Could not load image metadata: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public String m26541b() {
        return this.f12097a;
    }
}
