package com.discord.mobile_voice_overlay.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult;
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding;
import com.discord.primitives.ChannelId;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onChannelSelected", "Lkotlin/Function1;", "Lcom/discord/primitives/ChannelId;", "", "binding", "Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lcom/discord/mobile_voice_overlay/databinding/OverlayVoiceChannelSearchResultBinding;)V", "result", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "getResult", "()Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "setResult", "(Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;)V", "bind", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResultViewHolder extends RecyclerView.ViewHolder {
    private final OverlayVoiceChannelSearchResultBinding binding;
    private final Function1<ChannelId, Unit> onChannelSelected;
    private MobileVoiceOverlaySelectorResult result;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ResultViewHolder(android.view.ViewGroup r1, kotlin.jvm.functions.Function1 r2, com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0016
            android.content.Context r3 = r1.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 0
            com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding r3 = com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding.inflate(r3, r1, r4)
            java.lang.String r4 = "inflate(LayoutInflater.f….context), parent, false)"
            kotlin.jvm.internal.q.f(r3, r4)
        L_0x0016:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.mobile_voice_overlay.views.ResultViewHolder.<init>(android.view.ViewGroup, kotlin.jvm.functions.Function1, com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ResultViewHolder this$0, View view) {
        q.g(this$0, "this$0");
        MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult = this$0.result;
        if (mobileVoiceOverlaySelectorResult != null) {
            this$0.onChannelSelected.invoke(ChannelId.m554boximpl(mobileVoiceOverlaySelectorResult.m473getChannelIdo4g7jtM()));
        }
    }

    public final void bind(MobileVoiceOverlaySelectorResult result) {
        q.g(result, "result");
        this.result = result;
        this.binding.channelName.setText(result.getChannelName());
        this.binding.categoryName.setText(result.getCategoryName());
        this.binding.guildName.setText(result.getGuildName());
    }

    public final MobileVoiceOverlaySelectorResult getResult() {
        return this.result;
    }

    public final void setResult(MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult) {
        this.result = mobileVoiceOverlaySelectorResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResultViewHolder(ViewGroup parent, Function1<? super ChannelId, Unit> onChannelSelected, OverlayVoiceChannelSearchResultBinding binding) {
        super(binding.getRoot());
        q.g(parent, "parent");
        q.g(onChannelSelected, "onChannelSelected");
        q.g(binding, "binding");
        this.onChannelSelected = onChannelSelected;
        this.binding = binding;
        binding.container.setOnClickListener(new View.OnClickListener() { // from class: com.discord.mobile_voice_overlay.views.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultViewHolder._init_$lambda$1(ResultViewHolder.this, view);
            }
        });
        TextView _init_$lambda$2 = binding.channelName;
        q.f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, DiscordFont.PrimarySemibold);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        TextView _init_$lambda$3 = binding.categoryName;
        q.f(_init_$lambda$3, "_init_$lambda$3");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        TextView _init_$lambda$4 = binding.guildName;
        q.f(_init_$lambda$4, "_init_$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont);
        _init_$lambda$4.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
    }
}
