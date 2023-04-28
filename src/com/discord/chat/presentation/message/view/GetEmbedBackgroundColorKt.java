package com.discord.chat.presentation.message.view;

import com.discord.chat.C3147R;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m15073d2 = {"getEmbedBackgroundColor", "", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class GetEmbedBackgroundColorKt {
    public static final int getEmbedBackgroundColor() {
        return ThemeManagerKt.getTheme().getColorRes(C3147R.color.primary_130, C3147R.color.primary_630);
    }
}
