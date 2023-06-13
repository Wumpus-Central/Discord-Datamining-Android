package com.discord.safearea;

import androidx.core.graphics.Insets;
import com.discord.safearea.DCDSafeAreaUtils;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.Rect;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "insets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "<anonymous parameter 2>", "Lcom/th3rdwave/safeareacontext/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeAreaProviderManager$addEventEmitters$1 extends s implements Function3<SafeAreaProvider, EdgeInsets, Rect, Unit> {
    final /* synthetic */ SafeAreaProvider $view;
    final /* synthetic */ SafeAreaProviderManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaProviderManager$addEventEmitters$1(SafeAreaProviderManager safeAreaProviderManager, SafeAreaProvider safeAreaProvider) {
        super(3);
        this.this$0 = safeAreaProviderManager;
        this.$view = safeAreaProvider;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
        invoke2(safeAreaProvider, edgeInsets, rect);
        return Unit.f22105a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SafeAreaProvider safeAreaProvider, EdgeInsets insets, Rect rect) {
        Insets insets2;
        q.g(safeAreaProvider, "<anonymous parameter 0>");
        q.g(insets, "insets");
        q.g(rect, "<anonymous parameter 2>");
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets = DCDSafeAreaUtils.INSTANCE.toSafeAreaEdgeInsets(insets);
        insets2 = this.this$0.imeInsets;
        safeAreaProviderManager.handleInsetsChanged(safeAreaEdgeInsets, insets2, this.$view);
    }
}
