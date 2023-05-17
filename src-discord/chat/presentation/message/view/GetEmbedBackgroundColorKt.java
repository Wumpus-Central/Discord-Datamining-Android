package com.discord.chat.presentation.message.view;

import com.discord.chat.R;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"getEmbedBackgroundColor", "", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetEmbedBackgroundColorKt {
    public static final int getEmbedBackgroundColor() {
        return ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630);
    }
}
