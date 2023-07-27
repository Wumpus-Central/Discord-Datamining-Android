package com.discord.misc.utilities.keyboard;

import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ff.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.misc.utilities.keyboard.KeyboardExtensionsKt$hideKeyboard$1", f = "KeyboardExtensions.kt", l = {}, m = "invokeSuspend")

public final class KeyboardExtensionsKt$hideKeyboard$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  View $self;
    final  Window $window;
    int label;

    
    
    public KeyboardExtensionsKt$hideKeyboard$1(Window window, View view, Continuation<? super KeyboardExtensionsKt$hideKeyboard$1> continuation) {
        super(2, continuation);
        this.$window = window;
        this.$self = view;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KeyboardExtensionsKt$hideKeyboard$1(this.$window, this.$self, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardExtensionsKt$hideKeyboard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f20670a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        WindowInsetsControllerCompat insetsController;
        d.d();
        if (this.label == 0) {
            t.b(obj);
            insetsController = KeyboardExtensionsKt.getInsetsController(this.$window, this.$self);
            insetsController.a(WindowInsetsCompat.m.b());
            return Unit.f20670a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
