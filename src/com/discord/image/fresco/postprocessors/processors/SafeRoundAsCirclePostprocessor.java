package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p457z5.C14545a;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/processors/SafeRoundAsCirclePostprocessor;", "Lz5/a;", "Landroid/graphics/Bitmap;", "bitmap", "", "process", "<init>", "()V", "Companion", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SafeRoundAsCirclePostprocessor extends C14545a {
    public static final Companion Companion = new Companion(null);
    private static final int MIN_SIZE = 2;

    @Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m15073d2 = {"Lcom/discord/image/fresco/postprocessors/processors/SafeRoundAsCirclePostprocessor$Companion;", "", "()V", "MIN_SIZE", "", "fresco_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p457z5.C14545a, com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        C9971q.m14633g(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= 2 && height >= 2) {
            super.process(bitmap);
        }
    }
}
