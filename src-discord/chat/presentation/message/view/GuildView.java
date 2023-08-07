package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.GuildViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ-\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/GuildViewBinding;", "boundIconUrl", "", "boundShortGuildName", "configure", "", "iconUrl", "shortGuildName", "thumbnailBackgroundColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class GuildView extends FrameLayout {
    private final GuildViewBinding binding;
    private String boundIconUrl;
    private String boundShortGuildName;

    
    public GuildView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public GuildView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  GuildView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static  void configure$default(GuildView guildView, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        guildView.configure(str, str2, num);
    }

    
    
    
    public final void configure(java.lang.String r6, java.lang.String r7, java.lang.Integer r8) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.GuildView.configure(java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    
    public GuildView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        GuildViewBinding inflate = GuildViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        View root = inflate.getRoot();
        q.g(root, "binding.root");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, SizeUtilsKt.getDpToPx(16));
        TextView _init_$lambda$0 = inflate.guildText;
        q.g(_init_$lambda$0, "_init_$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryNormal);
    }
}
