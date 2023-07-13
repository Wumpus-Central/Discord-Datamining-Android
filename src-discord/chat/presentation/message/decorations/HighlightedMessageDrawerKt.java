package com.discord.chat.presentation.message.decorations;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0006"}, d2 = {"getTranslatedBottom", "", "Landroid/view/View;", "getTranslatedLeft", "getTranslatedRight", "getTranslatedTop", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class HighlightedMessageDrawerKt {
    
    public static final float getTranslatedBottom(View view) {
        return view.getBottom() + view.getTranslationY();
    }

    
    public static final float getTranslatedLeft(View view) {
        return view.getLeft() + view.getTranslationX();
    }

    
    public static final float getTranslatedRight(View view) {
        return view.getRight();
    }

    
    public static final float getTranslatedTop(View view) {
        return view.getTop() + view.getTranslationY();
    }
}
