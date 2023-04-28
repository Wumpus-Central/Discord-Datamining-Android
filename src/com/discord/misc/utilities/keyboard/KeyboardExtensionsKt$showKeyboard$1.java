package com.discord.misc.utilities.keyboard;

import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.coroutines.jvm.internal.C9633b;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$showKeyboard$1", m14701f = "KeyboardExtensions.kt", m14700l = {}, m14699m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class KeyboardExtensionsKt$showKeyboard$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $self;
    final /* synthetic */ Window $window;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardExtensionsKt$showKeyboard$1(Window window, View view, Continuation<? super KeyboardExtensionsKt$showKeyboard$1> continuation) {
        super(2, continuation);
        this.$window = window;
        this.$self = view;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardExtensionsKt$showKeyboard$1(this.$window, this.$self, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardExtensionsKt$showKeyboard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        WindowInsetsControllerCompat insetsController;
        EditText editText;
        C12962d.m4646d();
        if (this.label == 0) {
            C10848t.m10930b(obj);
            insetsController = KeyboardExtensionsKt.getInsetsController(this.$window, this.$self);
            insetsController.m37449e(WindowInsetsCompat.C1362m.m37460b());
            View view = this.$self;
            if (view instanceof EditText) {
                editText = (EditText) view;
            } else {
                editText = null;
            }
            if (editText != null) {
                C9633b.m14706a(editText.requestFocus());
            }
            return Unit.f25780a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
