package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9968n;

@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class MessageAccessoriesView$accessoriesAdapter$1 extends C9968n implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesView$accessoriesAdapter$1(Object obj) {
        super(0, obj, ViewMeasureExtensionsKt.class, "measureAndLayout", "measureAndLayout(Landroid/view/View;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ViewMeasureExtensionsKt.measureAndLayout((View) this.receiver);
    }
}
