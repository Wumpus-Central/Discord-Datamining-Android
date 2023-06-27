package com.discord.safearea;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.safearea.DCDSafeAreaUtils;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeAreaProviderManager$addEventEmitters$2 extends s implements Function1<WindowInsetsCompat, Unit> {
    final /* synthetic */ SafeAreaProvider $view;
    final /* synthetic */ SafeAreaProviderManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaProviderManager$addEventEmitters$2(SafeAreaProviderManager safeAreaProviderManager, SafeAreaProvider safeAreaProvider) {
        super(1);
        this.this$0 = safeAreaProviderManager;
        this.$view = safeAreaProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
        invoke2(windowInsetsCompat);
        return Unit.f20685a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WindowInsetsCompat insets) {
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets;
        q.g(insets, "insets");
        Insets f10 = insets.f(WindowInsetsCompat.m.b());
        q.f(f10, "insets.getInsets(WindowInsetsCompat.Type.ime())");
        this.this$0.imeInsets = f10;
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        safeAreaEdgeInsets = safeAreaProviderManager.safeAreaEdgeInsets;
        safeAreaProviderManager.handleInsetsChanged(safeAreaEdgeInsets, f10, this.$view);
    }
}
