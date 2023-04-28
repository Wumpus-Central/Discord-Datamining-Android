package com.discord.react_asset_fetcher;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1", m14701f = "ReactAssetUtils.kt", m14700l = {57}, m14699m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ReactAssetUtilsKt$setReactIcon$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetUrl;
    final /* synthetic */ MaterialButton $this_setReactIcon;
    Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactAssetUtilsKt$setReactIcon$1(MaterialButton materialButton, String str, Continuation<? super ReactAssetUtilsKt$setReactIcon$1> continuation) {
        super(2, continuation);
        this.$this_setReactIcon = materialButton;
        this.$assetUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        MaterialButton materialButton;
        Drawable drawable;
        MaterialButton materialButton2;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            materialButton = this.$this_setReactIcon;
            String str = this.$assetUrl;
            drawable = null;
            if (str != null) {
                CoroutineDispatcher b = C9946y0.m13946b();
                ReactAssetUtilsKt$setReactIcon$1$1$1 reactAssetUtilsKt$setReactIcon$1$1$1 = new ReactAssetUtilsKt$setReactIcon$1$1$1(materialButton, str, null);
                this.L$0 = materialButton;
                this.label = 1;
                Object g = C9840j.m14192g(b, reactAssetUtilsKt$setReactIcon$1$1$1, this);
                if (g == d) {
                    return d;
                }
                materialButton2 = materialButton;
                obj = g;
            }
            materialButton.setIcon(drawable);
            return Unit.f25780a;
        } else if (i == 1) {
            materialButton2 = (MaterialButton) this.L$0;
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        drawable = (Drawable) obj;
        materialButton = materialButton2;
        materialButton.setIcon(drawable);
        return Unit.f25780a;
    }
}
