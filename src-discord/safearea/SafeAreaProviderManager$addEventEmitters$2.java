package com.discord.safearea;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt;
import com.facebook.react.uimanager.ThemedReactContext;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class SafeAreaProviderManager$addEventEmitters$2 extends s implements Function1<WindowInsetsCompat, Unit> {
    final  ThemedReactContext $reactContext;
    final  SafeAreaProvider $view;
    final  SafeAreaProviderManager this$0;

    
    
    public SafeAreaProviderManager$addEventEmitters$2(SafeAreaProviderManager safeAreaProviderManager, ThemedReactContext themedReactContext, SafeAreaProvider safeAreaProvider) {
        super(1);
        this.this$0 = safeAreaProviderManager;
        this.$reactContext = themedReactContext;
        this.$view = safeAreaProvider;
    }

    @Override 
    public   Unit invoke(WindowInsetsCompat windowInsetsCompat) {
        invoke2(windowInsetsCompat);
        return Unit.f21025a;
    }

    
    public final void invoke2(WindowInsetsCompat insets) {
        SafeAreaEdgeInsets safeAreaEdgeInsets;
        Insets insets2;
        q.h(insets, "insets");
        this.this$0.imeInsets = WindowInsetsCompatExtensionsKt.getImeInsets$default(insets, false, 1, null);
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        ThemedReactContext themedReactContext = this.$reactContext;
        safeAreaEdgeInsets = safeAreaProviderManager.safeAreaEdgeInsets;
        insets2 = this.this$0.imeInsets;
        safeAreaProviderManager.handleInsetsChanged(themedReactContext, safeAreaEdgeInsets, insets2, this.$view);
    }
}
