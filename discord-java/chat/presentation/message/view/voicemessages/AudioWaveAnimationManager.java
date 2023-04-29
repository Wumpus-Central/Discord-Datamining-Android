package com.discord.chat.presentation.message.view.voicemessages;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u000fH\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager;", "", "()V", "audioChunkAnimationStarts", "", "", "[Ljava/lang/Long;", "value", "", "data", "getData", "()[B", "setData", "([B)V", "animateAdditionalHeight", "", "progress", "getAnimationValues", "index", "", "percentage", "originalHeight", "getCurrentValue", "reset", "", "resetIndex", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudioWaveAnimationManager {
    public static final Companion Companion = new Companion(null);
    private static final int FIXED_ANIMATED_HEIGHT = 4;
    private Long[] audioChunkAnimationStarts = new Long[0];
    private byte[] data = new byte[0];

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioWaveAnimationManager$Companion;", "", "()V", "FIXED_ANIMATED_HEIGHT", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final float animateAdditionalHeight(float f10) {
        float f11 = 1.0f - f10;
        float f12 = 1.5f * f11 * f11;
        return f10 <= 0.5f ? 4 * f10 * 2.0f * (f12 + 1.0f) : 4 + ((-4) * (f10 - 0.5f) * 2.0f * (f12 + 1.0f));
    }

    private final float getCurrentValue(int i10, float f10) {
        if (i10 >= this.data.length) {
            return 0.0f;
        }
        Long[] lArr = this.audioChunkAnimationStarts;
        if (lArr[i10] == null) {
            lArr[i10] = Long.valueOf(System.currentTimeMillis() - (f10 * 500));
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l10 = this.audioChunkAnimationStarts[i10];
        q.d(l10);
        long longValue = currentTimeMillis - l10.longValue();
        if (longValue > 500) {
            return 1.0f;
        }
        return ((float) longValue) / 500.0f;
    }

    public final float getAnimationValues(int i10, float f10, float f11) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f11 + animateAdditionalHeight(getCurrentValue(i10, f10));
    }

    public final byte[] getData() {
        return this.data;
    }

    public final void reset() {
        this.audioChunkAnimationStarts = new Long[this.data.length];
    }

    public final void resetIndex(int i10) {
        this.audioChunkAnimationStarts[i10] = null;
    }

    public final void setData(byte[] value) {
        q.g(value, "value");
        this.audioChunkAnimationStarts = new Long[value.length];
        this.data = value;
    }
}
