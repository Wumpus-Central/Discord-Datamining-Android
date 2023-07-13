package com.discord.chat.presentation.message;

import android.view.View;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

 class MessageAccessoriesView$accessoriesAdapter$1 extends n implements Function0<Unit> {
    
    public MessageAccessoriesView$accessoriesAdapter$1(Object obj) {
        super(0, obj, ViewMeasureExtensionsKt.class, "measureAndLayout", "measureAndLayout(Landroid/view/View;)V", 1);
    }

    @Override 
    
    public final void invoke2() {
        ViewMeasureExtensionsKt.measureAndLayout((View) this.receiver);
    }
}
