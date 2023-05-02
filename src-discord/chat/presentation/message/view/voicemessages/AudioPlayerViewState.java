package com.discord.chat.presentation.message.view.voicemessages;

import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.media_player.MediaPlayer;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B*\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0002\b\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0002\b!J\u000f\u0010\"\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0002\b$J\t\u0010%\u001a\u00020&HÖ\u0001J\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0002\b)J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020+H\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020+H\u0000¢\u0006\u0002\b0J!\u00101\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007H\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020+H\u0000¢\u0006\u0002\b;J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "", "messageId", "Lcom/discord/primitives/MessageId;", "sourceUrl", "", "attached", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAttached", "()Z", "audioSource", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "getAudioSource", "()Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$AudioSource;", "getMessageId-N_6c4I0", "()Ljava/lang/String;", "Ljava/lang/String;", "getSourceUrl", "component1", "component1-N_6c4I0", "component2", "component3", "copy", "copy-P6IPuNM", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerViewState;", "equals", "other", "getCurrentProgress", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager$CurrentProgress;", "getCurrentProgress$chat_release", "getMediaState", "Lcom/discord/media_player/MediaPlayer$Event;", "getMediaState$chat_release", "getPlayer", "Lcom/discord/media_player/MediaPlayer;", "getPlayer$chat_release", "hashCode", "", "isPlaying", "wasPlayingBeforeBeingPaused", "isPlaying$chat_release", "pause", "", "pause$chat_release", "play", "play$chat_release", "releasePlayer", "releasePlayer$chat_release", "setCurrentProgress", "progress", "", "durationMs", "", "setCurrentProgress$chat_release", "(FJ)Lkotlin/Unit;", "shouldEmitDuration", "shouldEmitDuration$chat_release", "storeDuration", "storeDuration$chat_release", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudioPlayerViewState {
    private final boolean attached;
    private final AudioPlayerManager.AudioSource audioSource;
    private final String messageId;
    private final String sourceUrl;

    private AudioPlayerViewState(String str, String str2, boolean z10) {
        this.messageId = str;
        this.sourceUrl = str2;
        this.attached = z10;
        AudioPlayerManager.AudioSource audioSource = null;
        if (!(str == null || str2 == null)) {
            audioSource = new AudioPlayerManager.AudioSource(str, str2, null);
        }
        this.audioSource = audioSource;
    }

    public /* synthetic */ AudioPlayerViewState(String str, String str2, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10);
    }

    /* renamed from: copy-P6IPuNM$default  reason: not valid java name */
    public static /* synthetic */ AudioPlayerViewState m311copyP6IPuNM$default(AudioPlayerViewState audioPlayerViewState, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = audioPlayerViewState.messageId;
        }
        if ((i10 & 2) != 0) {
            str2 = audioPlayerViewState.sourceUrl;
        }
        if ((i10 & 4) != 0) {
            z10 = audioPlayerViewState.attached;
        }
        return audioPlayerViewState.m313copyP6IPuNM(str, str2, z10);
    }

    /* renamed from: component1-N_6c4I0  reason: not valid java name */
    public final String m312component1N_6c4I0() {
        return this.messageId;
    }

    public final String component2() {
        return this.sourceUrl;
    }

    public final boolean component3() {
        return this.attached;
    }

    /* renamed from: copy-P6IPuNM  reason: not valid java name */
    public final AudioPlayerViewState m313copyP6IPuNM(String str, String str2, boolean z10) {
        return new AudioPlayerViewState(str, str2, z10, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState r5 = (com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState) r5
            java.lang.String r1 = r4.messageId
            java.lang.String r3 = r5.messageId
            if (r1 != 0) goto L_0x0016
            if (r3 != 0) goto L_0x0018
            r1 = r0
            goto L_0x001e
        L_0x0016:
            if (r3 != 0) goto L_0x001a
        L_0x0018:
            r1 = r2
            goto L_0x001e
        L_0x001a:
            boolean r1 = com.discord.primitives.MessageId.m562equalsimpl0(r1, r3)
        L_0x001e:
            if (r1 != 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.String r1 = r4.sourceUrl
            java.lang.String r3 = r5.sourceUrl
            boolean r1 = kotlin.jvm.internal.q.b(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r1 = r4.attached
            boolean r5 = r5.attached
            if (r1 == r5) goto L_0x0033
            return r2
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerViewState.equals(java.lang.Object):boolean");
    }

    public final boolean getAttached() {
        return this.attached;
    }

    public final AudioPlayerManager.AudioSource getAudioSource() {
        return this.audioSource;
    }

    public final AudioPlayerManager.CurrentProgress getCurrentProgress$chat_release() {
        return AudioPlayerManager.INSTANCE.getCurrentProgress(this.audioSource);
    }

    public final MediaPlayer.Event getMediaState$chat_release() {
        return AudioPlayerManager.INSTANCE.getState(this.audioSource);
    }

    /* renamed from: getMessageId-N_6c4I0  reason: not valid java name */
    public final String m314getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final MediaPlayer getPlayer$chat_release() {
        return AudioPlayerManager.INSTANCE.getPlayer(this.audioSource);
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public int hashCode() {
        String str = this.messageId;
        int i10 = 0;
        int i11 = (str == null ? 0 : MessageId.m563hashCodeimpl(str)) * 31;
        String str2 = this.sourceUrl;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        int i12 = (i11 + i10) * 31;
        boolean z10 = this.attached;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = z10 ? 1 : 0;
        return i12 + i13;
    }

    public final boolean isPlaying$chat_release(boolean z10) {
        boolean z11;
        MediaPlayer player$chat_release = getPlayer$chat_release();
        if (player$chat_release == null || ((!player$chat_release.shouldPlay() && !player$chat_release.isPlaying()) || player$chat_release.hasError())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || z10) {
            return true;
        }
        return false;
    }

    public final void pause$chat_release() {
        AudioPlayerManager.INSTANCE.pause(this.audioSource);
    }

    public final void play$chat_release() {
        AudioPlayerManager.INSTANCE.play(this.audioSource);
    }

    public final void releasePlayer$chat_release() {
        AudioPlayerManager.INSTANCE.releasePlayer(this.audioSource);
    }

    public final Unit setCurrentProgress$chat_release(float f10, long j10) {
        AudioPlayerManager.AudioSource audioSource = this.audioSource;
        if (audioSource == null) {
            return null;
        }
        AudioPlayerManager.INSTANCE.setCurrentProgress(audioSource, f10, j10);
        return Unit.f22034a;
    }

    public final boolean shouldEmitDuration$chat_release() {
        MediaPlayer player$chat_release = getPlayer$chat_release();
        return player$chat_release != null && player$chat_release.shouldPlay();
    }

    public final void storeDuration$chat_release() {
        AudioPlayerManager.INSTANCE.storeDuration(this.audioSource);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = str == null ? "null" : MessageId.m564toStringimpl(str);
        String str3 = this.sourceUrl;
        boolean z10 = this.attached;
        return "AudioPlayerViewState(messageId=" + str2 + ", sourceUrl=" + str3 + ", attached=" + z10 + ")";
    }

    public /* synthetic */ AudioPlayerViewState(String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, null);
    }
}
