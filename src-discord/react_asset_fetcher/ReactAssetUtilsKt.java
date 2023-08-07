package com.discord.react_asset_fetcher;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.views.imagehelper.ImageSource;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.j;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\b\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\t\u001a\u00020\n\u001a\u001c\u0010\u000b\u001a\u00020\u0005*\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0010"}, d2 = {"getReactImageUrl", "", "Landroid/content/Context;", "assetUrl", "setOptionalReactImageUrl", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "url", "setReactAsset", "asset", "Lcom/discord/react_asset_fetcher/ReactAsset;", "setReactIcon", "Lcom/google/android/material/button/MaterialButton;", "iconSize", "", "setReactImageUrl", "react_asset_fetcher_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ReactAssetUtilsKt {
    public static final String getReactImageUrl(Context context, String assetUrl) {
        q.h(context, "<this>");
        q.h(assetUrl, "assetUrl");
        String uri = new ImageSource(context, assetUrl).getUri().toString();
        q.g(uri, "ImageSource(this, assetUrl).uri.toString()");
        return uri;
    }

    
    
    
    public static final void setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView r2, java.lang.String r3) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView, java.lang.String):void");
    }

    public static final void setReactAsset(SimpleDraweeView simpleDraweeView, ReactAsset asset) {
        q.h(simpleDraweeView, "<this>");
        q.h(asset, "asset");
        Context context = simpleDraweeView.getContext();
        q.g(context, "context");
        setReactImageUrl(simpleDraweeView, asset.getUri(context));
    }

    public static final void setReactIcon(MaterialButton materialButton, String assetUrl, int i10) {
        q.h(materialButton, "<this>");
        q.h(assetUrl, "assetUrl");
        materialButton.setIconSize(i10);
        materialButton.setIcon(new PaintDrawable(0));
        j.d(CoroutineViewUtilsKt.getAttachedScope(materialButton), null, null, new ReactAssetUtilsKt$setReactIcon$1(materialButton, assetUrl, null), 3, null);
    }

    public static final void setReactImageUrl(SimpleDraweeView simpleDraweeView, String assetUrl) {
        q.h(simpleDraweeView, "<this>");
        q.h(assetUrl, "assetUrl");
        Context context = simpleDraweeView.getContext();
        q.g(context, "context");
        simpleDraweeView.setImageURI(getReactImageUrl(context, assetUrl));
    }
}
