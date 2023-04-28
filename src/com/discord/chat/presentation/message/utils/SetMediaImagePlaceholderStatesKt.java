package com.discord.chat.presentation.message.utils;

import android.graphics.drawable.ColorDrawable;
import com.discord.image.fresco.listeners.BackgroundManagingControllerListener;
import com.discord.image.fresco.listeners.CompoundControllerListener;
import com.discord.image.fresco.listeners.ControllerListener;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.DarkTheme;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m15073d2 = {"setMediaImagePlaceholderStates", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "imageView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class SetMediaImagePlaceholderStatesKt {
    public static final PipelineDraweeControllerBuilder setMediaImagePlaceholderStates(PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder, final SimpleDraweeView imageView) {
        C9971q.m14633g(pipelineDraweeControllerBuilder, "<this>");
        C9971q.m14633g(imageView, "imageView");
        PipelineDraweeControllerBuilder C = pipelineDraweeControllerBuilder.m31934C(new CompoundControllerListener(new BackgroundManagingControllerListener(imageView, new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondary()), false, false, false, 28, null), new ControllerListener() { // from class: com.discord.chat.presentation.message.utils.SetMediaImagePlaceholderStatesKt$setMediaImagePlaceholderStates$1
            private final ScalingUtils.ScaleType imageViewInitialScaleType;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.imageViewInitialScaleType = SimpleDraweeView.this.getHierarchy().m31781m();
            }

            @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
            public void onFailure(String str, Throwable th2) {
                ReactAsset reactAsset;
                SimpleDraweeView.this.getHierarchy().m31774t(ScalingUtils.ScaleType.f7707e);
                SimpleDraweeView simpleDraweeView = SimpleDraweeView.this;
                if (ThemeManagerKt.getTheme() instanceof DarkTheme) {
                    reactAsset = ReactAsset.PoopDark;
                } else {
                    reactAsset = ReactAsset.PoopLight;
                }
                ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
            }

            @Override // com.discord.image.fresco.listeners.ControllerListener, com.facebook.drawee.controller.ControllerListener
            public void onSubmit(String str, Object obj) {
                SimpleDraweeView.this.getHierarchy().m31774t(this.imageViewInitialScaleType);
            }
        }));
        C9971q.m14634f(C, "imageView: SimpleDraweeV…      },\n        ),\n    )");
        return C;
    }
}
