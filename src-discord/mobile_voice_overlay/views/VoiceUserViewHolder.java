package com.discord.mobile_voice_overlay.views;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/VoiceUserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "overlayVoiceBubble", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "(Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;)V", "getOverlayVoiceBubble", "()Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "bind", "", "user", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class VoiceUserViewHolder extends RecyclerView.ViewHolder {
    private final OverlayVoiceBubble overlayVoiceBubble;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceUserViewHolder(OverlayVoiceBubble overlayVoiceBubble) {
        super(overlayVoiceBubble);
        q.g(overlayVoiceBubble, "overlayVoiceBubble");
        this.overlayVoiceBubble = overlayVoiceBubble;
    }

    public final void bind(MobileVoiceOverlayDataUser user) {
        q.g(user, "user");
        this.overlayVoiceBubble.configureUI(user);
    }

    public final OverlayVoiceBubble getOverlayVoiceBubble() {
        return this.overlayVoiceBubble;
    }
}
