package com.discord.safearea;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.th3rdwave.safeareacontext.DCDSafeAreaUtils;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class SafeAreaProviderManager$addEventEmitters$2 extends AbstractC9679s implements Function1<WindowInsetsCompat, Unit> {
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
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WindowInsetsCompat insets) {
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets;
        C9677q.m14633g(insets, "insets");
        Insets f = insets.m37521f(WindowInsetsCompat.C1362m.m37460b());
        C9677q.m14634f(f, "insets.getInsets(WindowInsetsCompat.Type.ime())");
        this.this$0.imeInsets = f;
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        safeAreaEdgeInsets = safeAreaProviderManager.safeAreaEdgeInsets;
        safeAreaProviderManager.handleInsetsChanged(safeAreaEdgeInsets, f, this.$view);
    }
}
