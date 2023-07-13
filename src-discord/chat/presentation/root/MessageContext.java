package com.discord.chat.presentation.root;

import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.truncation.Truncation;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J{\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017¨\u00062"}, d2 = {"Lcom/discord/chat/presentation/root/MessageContext;", "", "showDivider", "", "canAddNewReactions", "addReactionLabel", "", "addNewReactionAccessibilityLabel", "addNewBurstReactionAccessibilityLabel", "reactionsTheme", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "truncation", "Lcom/discord/chat/bridge/truncation/Truncation;", "useAttachmentGridLayout", "useAttachmentUploadPreview", "enableSwipeToReply", "useAddBurstReaction", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;Lcom/discord/chat/bridge/truncation/Truncation;ZZZZ)V", "getAddNewBurstReactionAccessibilityLabel", "()Ljava/lang/String;", "getAddNewReactionAccessibilityLabel", "getAddReactionLabel", "getCanAddNewReactions", "()Z", "getEnableSwipeToReply", "getReactionsTheme", "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "getShowDivider", "getTruncation", "()Lcom/discord/chat/bridge/truncation/Truncation;", "getUseAddBurstReaction", "getUseAttachmentGridLayout", "getUseAttachmentUploadPreview", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageContext {
    private final String addNewBurstReactionAccessibilityLabel;
    private final String addNewReactionAccessibilityLabel;
    private final String addReactionLabel;
    private final boolean canAddNewReactions;
    private final boolean enableSwipeToReply;
    private final ReactionsTheme reactionsTheme;
    private final boolean showDivider;
    private final Truncation truncation;
    private final boolean useAddBurstReaction;
    private final boolean useAttachmentGridLayout;
    private final boolean useAttachmentUploadPreview;

    public MessageContext() {
        this(false, false, null, null, null, null, null, false, false, false, false, 2047, null);
    }

    public MessageContext(boolean z10, boolean z11, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, Truncation truncation, boolean z12, boolean z13, boolean z14, boolean z15) {
        q.g(addReactionLabel, "addReactionLabel");
        q.g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.g(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        this.showDivider = z10;
        this.canAddNewReactions = z11;
        this.addReactionLabel = addReactionLabel;
        this.addNewReactionAccessibilityLabel = addNewReactionAccessibilityLabel;
        this.addNewBurstReactionAccessibilityLabel = addNewBurstReactionAccessibilityLabel;
        this.reactionsTheme = reactionsTheme;
        this.truncation = truncation;
        this.useAttachmentGridLayout = z12;
        this.useAttachmentUploadPreview = z13;
        this.enableSwipeToReply = z14;
        this.useAddBurstReaction = z15;
    }

    public final boolean component1() {
        return this.showDivider;
    }

    public final boolean component10() {
        return this.enableSwipeToReply;
    }

    public final boolean component11() {
        return this.useAddBurstReaction;
    }

    public final boolean component2() {
        return this.canAddNewReactions;
    }

    public final String component3() {
        return this.addReactionLabel;
    }

    public final String component4() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String component5() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final ReactionsTheme component6() {
        return this.reactionsTheme;
    }

    public final Truncation component7() {
        return this.truncation;
    }

    public final boolean component8() {
        return this.useAttachmentGridLayout;
    }

    public final boolean component9() {
        return this.useAttachmentUploadPreview;
    }

    public final MessageContext copy(boolean z10, boolean z11, String addReactionLabel, String addNewReactionAccessibilityLabel, String addNewBurstReactionAccessibilityLabel, ReactionsTheme reactionsTheme, Truncation truncation, boolean z12, boolean z13, boolean z14, boolean z15) {
        q.g(addReactionLabel, "addReactionLabel");
        q.g(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.g(addNewBurstReactionAccessibilityLabel, "addNewBurstReactionAccessibilityLabel");
        return new MessageContext(z10, z11, addReactionLabel, addNewReactionAccessibilityLabel, addNewBurstReactionAccessibilityLabel, reactionsTheme, truncation, z12, z13, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageContext)) {
            return false;
        }
        MessageContext messageContext = (MessageContext) obj;
        return this.showDivider == messageContext.showDivider && this.canAddNewReactions == messageContext.canAddNewReactions && q.b(this.addReactionLabel, messageContext.addReactionLabel) && q.b(this.addNewReactionAccessibilityLabel, messageContext.addNewReactionAccessibilityLabel) && q.b(this.addNewBurstReactionAccessibilityLabel, messageContext.addNewBurstReactionAccessibilityLabel) && q.b(this.reactionsTheme, messageContext.reactionsTheme) && q.b(this.truncation, messageContext.truncation) && this.useAttachmentGridLayout == messageContext.useAttachmentGridLayout && this.useAttachmentUploadPreview == messageContext.useAttachmentUploadPreview && this.enableSwipeToReply == messageContext.enableSwipeToReply && this.useAddBurstReaction == messageContext.useAddBurstReaction;
    }

    public final String getAddNewBurstReactionAccessibilityLabel() {
        return this.addNewBurstReactionAccessibilityLabel;
    }

    public final String getAddNewReactionAccessibilityLabel() {
        return this.addNewReactionAccessibilityLabel;
    }

    public final String getAddReactionLabel() {
        return this.addReactionLabel;
    }

    public final boolean getCanAddNewReactions() {
        return this.canAddNewReactions;
    }

    public final boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    public final ReactionsTheme getReactionsTheme() {
        return this.reactionsTheme;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final Truncation getTruncation() {
        return this.truncation;
    }

    public final boolean getUseAddBurstReaction() {
        return this.useAddBurstReaction;
    }

    public final boolean getUseAttachmentGridLayout() {
        return this.useAttachmentGridLayout;
    }

    public final boolean getUseAttachmentUploadPreview() {
        return this.useAttachmentUploadPreview;
    }

    public int hashCode() {
        boolean z10 = this.showDivider;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = i11 * 31;
        boolean z11 = this.canAddNewReactions;
        if (z11) {
            z11 = true;
        }
        int i15 = z11 ? 1 : 0;
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int hashCode = (((((((i14 + i15) * 31) + this.addReactionLabel.hashCode()) * 31) + this.addNewReactionAccessibilityLabel.hashCode()) * 31) + this.addNewBurstReactionAccessibilityLabel.hashCode()) * 31;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        int i18 = 0;
        int hashCode2 = (hashCode + (reactionsTheme == null ? 0 : reactionsTheme.hashCode())) * 31;
        Truncation truncation = this.truncation;
        if (truncation != null) {
            i18 = truncation.hashCode();
        }
        int i19 = (hashCode2 + i18) * 31;
        boolean z12 = this.useAttachmentGridLayout;
        if (z12) {
            z12 = true;
        }
        int i20 = z12 ? 1 : 0;
        int i21 = z12 ? 1 : 0;
        int i22 = z12 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z13 = this.useAttachmentUploadPreview;
        if (z13) {
            z13 = true;
        }
        int i24 = z13 ? 1 : 0;
        int i25 = z13 ? 1 : 0;
        int i26 = z13 ? 1 : 0;
        int i27 = (i23 + i24) * 31;
        boolean z14 = this.enableSwipeToReply;
        if (z14) {
            z14 = true;
        }
        int i28 = z14 ? 1 : 0;
        int i29 = z14 ? 1 : 0;
        int i30 = z14 ? 1 : 0;
        int i31 = (i27 + i28) * 31;
        boolean z15 = this.useAddBurstReaction;
        if (!z15) {
            i10 = z15 ? 1 : 0;
        }
        return i31 + i10;
    }

    public String toString() {
        boolean z10 = this.showDivider;
        boolean z11 = this.canAddNewReactions;
        String str = this.addReactionLabel;
        String str2 = this.addNewReactionAccessibilityLabel;
        String str3 = this.addNewBurstReactionAccessibilityLabel;
        ReactionsTheme reactionsTheme = this.reactionsTheme;
        Truncation truncation = this.truncation;
        boolean z12 = this.useAttachmentGridLayout;
        boolean z13 = this.useAttachmentUploadPreview;
        boolean z14 = this.enableSwipeToReply;
        boolean z15 = this.useAddBurstReaction;
        return "MessageContext(showDivider=" + z10 + ", canAddNewReactions=" + z11 + ", addReactionLabel=" + str + ", addNewReactionAccessibilityLabel=" + str2 + ", addNewBurstReactionAccessibilityLabel=" + str3 + ", reactionsTheme=" + reactionsTheme + ", truncation=" + truncation + ", useAttachmentGridLayout=" + z12 + ", useAttachmentUploadPreview=" + z13 + ", enableSwipeToReply=" + z14 + ", useAddBurstReaction=" + z15 + ")";
    }

    
    
    public  MessageContext(boolean r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.discord.chat.bridge.reaction.ReactionsTheme r18, com.discord.chat.bridge.truncation.Truncation r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.root.MessageContext.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.discord.chat.bridge.reaction.ReactionsTheme, com.discord.chat.bridge.truncation.Truncation, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
