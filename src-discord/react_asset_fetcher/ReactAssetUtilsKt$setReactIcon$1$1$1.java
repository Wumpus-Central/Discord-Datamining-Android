package com.discord.react_asset_fetcher;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.util.JSStackTrace;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.google.android.material.button.MaterialButton;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import pf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/drawable/Drawable;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1$1$1", f = "ReactAssetUtils.kt", l = {}, m = "invokeSuspend")

public final class ReactAssetUtilsKt$setReactIcon$1$1$1 extends k implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final  String $assetUrl;
    final  MaterialButton $this_setReactIcon;
    int label;

    
    
    public ReactAssetUtilsKt$setReactIcon$1$1$1(MaterialButton materialButton, String str, Continuation<? super ReactAssetUtilsKt$setReactIcon$1$1$1> continuation) {
        super(2, continuation);
        this.$this_setReactIcon = materialButton;
        this.$assetUrl = str;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1$1$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21025a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        d.d();
        if (this.label == 0) {
            t.b(obj);
            ImageSource imageSource = new ImageSource(this.$this_setReactIcon.getContext(), this.$assetUrl);
            MaterialButton materialButton = this.$this_setReactIcon;
            if (imageSource.isResource()) {
                Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(materialButton.getContext(), imageSource.getSource());
                q.e(resourceDrawable);
                return resourceDrawable;
            } else if (q.c(imageSource.getUri().getScheme(), JSStackTrace.FILE_KEY)) {
                Drawable createFromPath = Drawable.createFromPath(imageSource.getUri().getPath());
                q.e(createFromPath);
                return createFromPath;
            } else {
                URLConnection openConnection = new URL(imageSource.getSource()).openConnection();
                q.f(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.connect();
                return new BitmapDrawable(materialButton.getResources(), BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
