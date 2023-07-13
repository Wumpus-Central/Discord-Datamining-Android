package com.discord.reactions;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class ReactionsView$Companion$sharedViewPool$2 extends s implements Function0<RecyclerView.RecycledViewPool> {
    public static final ReactionsView$Companion$sharedViewPool$2 INSTANCE = new ReactionsView$Companion$sharedViewPool$2();

    ReactionsView$Companion$sharedViewPool$2() {
        super(0);
    }

    
    @Override 
    public final RecyclerView.RecycledViewPool invoke() {
        return new RecyclerView.RecycledViewPool();
    }
}
