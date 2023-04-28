package com.discord.react_fork_overrides.forks;

import android.net.Uri;
import androidx.arch.core.util.Function;
import com.discord.react_fork_overrides.forks.ImageSourceOverride;
import com.facebook.react.views.imagehelper.ImageSource;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import p427xf.C14019n;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\b"}, m15073d2 = {"Lcom/discord/react_fork_overrides/forks/ImageSourceOverride;", "", "()V", "override", "", "resolvedOTAAssetOrDefaultToDrawable", "", "mSource", "react_fork_overrides_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class ImageSourceOverride {
    public static final ImageSourceOverride INSTANCE = new ImageSourceOverride();

    private ImageSourceOverride() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String override$lambda$0(String mSource) {
        ImageSourceOverride imageSourceOverride = INSTANCE;
        C9677q.m14634f(mSource, "mSource");
        return imageSourceOverride.resolvedOTAAssetOrDefaultToDrawable(mSource);
    }

    private final String resolvedOTAAssetOrDefaultToDrawable(String str) {
        String k;
        Uri parse = Uri.parse(str);
        if (!parse.getPathSegments().contains("otas")) {
            return str;
        }
        String path = parse.getPath();
        if (path == null) {
            return str;
        }
        File file = new File(path);
        if (file.exists()) {
            return str;
        }
        k = C14019n.m1679k(file);
        return k;
    }

    public final void override() {
        ImageSource.mSourceOverride = new Function() { // from class: l3.b
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                String override$lambda$0;
                override$lambda$0 = ImageSourceOverride.override$lambda$0((String) obj);
                return override$lambda$0;
            }
        };
    }
}
