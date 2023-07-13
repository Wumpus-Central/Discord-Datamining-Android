package com.discord.icons.media;

import android.os.Build;
import java.util.List;
import ji.u;
import kotlin.Metadata;
import kotlin.collections.j;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"ANIMATED_IMAGE_EXTENSION", "", "STATIC_IMAGE_EXTENSION", "getMediaExtension", "allowAnimation", "", "imageHash", "isImageHashAnimated", "icons_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class MediaExtensionKt {
    private static final String ANIMATED_IMAGE_EXTENSION = "gif";
    private static final String STATIC_IMAGE_EXTENSION;

    static {
        List k10;
        String str;
        k10 = j.k(28, 29);
        if (k10.contains(Integer.valueOf(Build.VERSION.SDK_INT))) {
            str = "png";
        } else {
            str = "webp";
        }
        STATIC_IMAGE_EXTENSION = str;
    }

    public static final String getMediaExtension(boolean z10, String str) {
        if (!z10 || !isImageHashAnimated(str)) {
            return STATIC_IMAGE_EXTENSION;
        }
        return ANIMATED_IMAGE_EXTENSION;
    }

    public static  String getMediaExtension$default(boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return getMediaExtension(z10, str);
    }

    private static final boolean isImageHashAnimated(String str) {
        boolean H;
        if (str == null) {
            return true;
        }
        H = u.H(str, "a_", false, 2, null);
        return H;
    }
}
