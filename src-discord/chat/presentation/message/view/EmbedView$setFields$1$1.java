package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class EmbedView$setFields$1$1 extends s implements Function0<View> {
    final  LinearLayout $this_apply;

    
    
    public EmbedView$setFields$1$1(LinearLayout linearLayout) {
        super(0);
        this.$this_apply = linearLayout;
    }

    
    @Override 
    public final View invoke() {
        Context context = this.$this_apply.getContext();
        q.g(context, "context");
        return new EmbedFieldView(context, null, 0, 6, null);
    }
}
