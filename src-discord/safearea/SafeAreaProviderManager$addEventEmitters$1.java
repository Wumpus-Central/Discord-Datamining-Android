package com.discord.safearea;

import androidx.core.graphics.Insets;
import com.facebook.react.uimanager.ThemedReactContext;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.Rect;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "insets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "<anonymous parameter 2>", "Lcom/th3rdwave/safeareacontext/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class SafeAreaProviderManager$addEventEmitters$1 extends s implements Function3<SafeAreaProvider, EdgeInsets, Rect, Unit> {
    final  ThemedReactContext $reactContext;
    final  SafeAreaProvider $view;
    final  SafeAreaProviderManager this$0;

    
    
    public SafeAreaProviderManager$addEventEmitters$1(SafeAreaProviderManager safeAreaProviderManager, ThemedReactContext themedReactContext, SafeAreaProvider safeAreaProvider) {
        super(3);
        this.this$0 = safeAreaProviderManager;
        this.$reactContext = themedReactContext;
        this.$view = safeAreaProvider;
    }

    @Override 
    public   Unit invoke(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
        invoke2(safeAreaProvider, edgeInsets, rect);
        return Unit.f21436a;
    }

    
    public final void invoke2(SafeAreaProvider safeAreaProvider, EdgeInsets insets, Rect rect) {
        Insets insets2;
        q.h(safeAreaProvider, "<anonymous parameter 0>");
        q.h(insets, "insets");
        q.h(rect, "<anonymous parameter 2>");
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        ThemedReactContext themedReactContext = this.$reactContext;
        SafeAreaEdgeInsets safeAreaEdgeInsets = new SafeAreaEdgeInsets(insets);
        insets2 = this.this$0.imeInsets;
        safeAreaProviderManager.handleInsetsChanged(themedReactContext, safeAreaEdgeInsets, insets2, this.$view);
    }
}
