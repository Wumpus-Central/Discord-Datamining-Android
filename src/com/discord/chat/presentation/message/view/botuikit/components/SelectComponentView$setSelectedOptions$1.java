package com.discord.chat.presentation.message.view.botuikit.components;

import android.view.LayoutInflater;
import android.view.View;
import com.discord.chat.databinding.MessageComponentSelectPillViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class SelectComponentView$setSelectedOptions$1 extends AbstractC9679s implements Function0<View> {
    final /* synthetic */ LayoutInflater $inflater;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectComponentView$setSelectedOptions$1(LayoutInflater layoutInflater) {
        super(0);
        this.$inflater = layoutInflater;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        MaterialTextView root = MessageComponentSelectPillViewBinding.inflate(this.$inflater).getRoot();
        C9677q.m14634f(root, "inflate(inflater).root");
        DiscordFontUtilsKt.setDiscordFont(root, DiscordFont.PrimaryMedium);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(root, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        root.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        return root;
    }
}
