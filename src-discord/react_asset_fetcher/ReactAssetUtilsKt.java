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
/* loaded from: classes7.dex */
public final class ReactAssetUtilsKt {
    public static final String getReactImageUrl(Context context, String assetUrl) {
        q.g(context, "<this>");
        q.g(assetUrl, "assetUrl");
        String uri = new ImageSource(context, assetUrl).getUri().toString();
        q.f(uri, "ImageSource(this, assetUrl).uri.toString()");
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.q.g(r2, r0)
            r0 = 0
            if (r3 == 0) goto L_0x0011
            boolean r1 = oj.l.w(r3)
            if (r1 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r1 = r0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 == 0) goto L_0x001e
            r3 = 8
            r2.setVisibility(r3)
            r3 = 0
            r2.setImageURI(r3)
            goto L_0x0024
        L_0x001e:
            r2.setVisibility(r0)
            setReactImageUrl(r2, r3)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.react_asset_fetcher.ReactAssetUtilsKt.setOptionalReactImageUrl(com.facebook.drawee.view.SimpleDraweeView, java.lang.String):void");
    }

    public static final void setReactAsset(SimpleDraweeView simpleDraweeView, ReactAsset asset) {
        q.g(simpleDraweeView, "<this>");
        q.g(asset, "asset");
        Context context = simpleDraweeView.getContext();
        q.f(context, "context");
        setReactImageUrl(simpleDraweeView, asset.getUri(context));
    }

    public static final void setReactIcon(MaterialButton materialButton, String assetUrl, int i10) {
        q.g(materialButton, "<this>");
        q.g(assetUrl, "assetUrl");
        materialButton.setIconSize(i10);
        materialButton.setIcon(new PaintDrawable(0));
        j.d(CoroutineViewUtilsKt.getAttachedScope(materialButton), null, null, new ReactAssetUtilsKt$setReactIcon$1(materialButton, assetUrl, null), 3, null);
    }

    public static final void setReactImageUrl(SimpleDraweeView simpleDraweeView, String assetUrl) {
        q.g(simpleDraweeView, "<this>");
        q.g(assetUrl, "assetUrl");
        Context context = simpleDraweeView.getContext();
        q.f(context, "context");
        simpleDraweeView.setImageURI(getReactImageUrl(context, assetUrl));
    }
}
