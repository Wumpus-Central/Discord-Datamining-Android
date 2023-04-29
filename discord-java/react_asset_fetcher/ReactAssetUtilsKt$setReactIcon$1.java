package com.discord.react_asset_fetcher;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.j;
import kotlinx.coroutines.y0;
import nf.t;
import tf.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1", f = "ReactAssetUtils.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ReactAssetUtilsKt$setReactIcon$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactAssetUtilsKt$setReactIcon$1(this.$this_setReactIcon, this.$assetUrl, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactAssetUtilsKt$setReactIcon$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22034a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        MaterialButton materialButton;
        Drawable drawable;
        MaterialButton materialButton2;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            materialButton = this.$this_setReactIcon;
            String str = this.$assetUrl;
            drawable = null;
            if (str != null) {
                CoroutineDispatcher b10 = y0.b();
                ReactAssetUtilsKt$setReactIcon$1$1$1 reactAssetUtilsKt$setReactIcon$1$1$1 = new ReactAssetUtilsKt$setReactIcon$1$1$1(materialButton, str, null);
                this.L$0 = materialButton;
                this.label = 1;
                Object g10 = j.g(b10, reactAssetUtilsKt$setReactIcon$1$1$1, this);
                if (g10 == d10) {
                    return d10;
                }
                materialButton2 = materialButton;
                obj = g10;
            }
            materialButton.setIcon(drawable);
            return Unit.f22034a;
        } else if (i10 == 1) {
            materialButton2 = (MaterialButton) this.L$0;
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        drawable = (Drawable) obj;
        materialButton = materialButton2;
        materialButton.setIcon(drawable);
        return Unit.f22034a;
    }
}
