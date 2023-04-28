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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9677q;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/drawable/Drawable;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1$1$1", m14701f = "ReactAssetUtils.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ReactAssetUtilsKt$setReactIcon$1$1$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ MaterialButton $this_setReactIcon;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetUtilsKt$setReactIcon$1$1$1(MaterialButton materialButton, String str, Continuation<? super ReactAssetUtilsKt$setReactIcon$1$1$1> continuation) {
        super(2, continuation);
        this.$this_setReactIcon = materialButton;
        this.$assetUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1$1$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            ImageSource imageSource = new ImageSource(this.$this_setReactIcon.getContext(), this.$assetUrl);
            MaterialButton materialButton = this.$this_setReactIcon;
            if (imageSource.isResource()) {
                Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(materialButton.getContext(), imageSource.getSource());
                C9677q.m14636d(resourceDrawable);
                return resourceDrawable;
            } else if (C9677q.m14638b(imageSource.getUri().getScheme(), JSStackTrace.FILE_KEY)) {
                Drawable createFromPath = Drawable.createFromPath(imageSource.getUri().getPath());
                C9677q.m14636d(createFromPath);
                return createFromPath;
            } else {
                URLConnection openConnection = new URL(imageSource.getSource()).openConnection();
                C9677q.m14635e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.connect();
                return new BitmapDrawable(materialButton.getResources(), BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
