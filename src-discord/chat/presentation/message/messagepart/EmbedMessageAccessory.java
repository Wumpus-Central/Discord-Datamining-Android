package com.discord.chat.presentation.message.messagepart;

import android.view.View;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.media.PortalUiModel;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010'\u001a\u00020\u0004HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u0088\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001f\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/chat/presentation/media/PortalUiModel;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "constrainedWidth", "radiusPx", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "shouldAutoPlayGifs", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "onLongClick", "Landroid/view/View$OnLongClickListener;", "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstrainedWidth", "()I", "getEmbed", "()Lcom/discord/chat/bridge/embed/Embed;", "getIndex", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getOnLongClick", "()Landroid/view/View$OnLongClickListener;", "getRadiusPx", "getShouldAnimateEmoji", "()Z", "getShouldAutoPlayGifs", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component1-3Eiw7ao", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-5odn8qk", "(Ljava/lang/String;IIILcom/discord/chat/bridge/embed/Embed;ZZZZLcom/discord/chat/bridge/spoiler/SpoilerAttributes;Landroid/view/View$OnLongClickListener;)Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbedMessageAccessory extends MessageAccessory implements PortalUiModel {
    private final int constrainedWidth;
    private final Embed embed;
    private final int index;
    private final String messageId;
    private final View.OnLongClickListener onLongClick;
    private final int radiusPx;
    private final boolean shouldAnimateEmoji;
    private final boolean shouldAutoPlayGifs;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final SpoilerAttributes spoilerAttributes;

    private EmbedMessageAccessory(String str, int i10, int i11, int i12, Embed embed, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener) {
        super(str, "embed " + i10, null);
        this.messageId = str;
        this.index = i10;
        this.constrainedWidth = i11;
        this.radiusPx = i12;
        this.embed = embed;
        this.shouldAutoPlayGifs = z10;
        this.shouldAnimateEmoji = z11;
        this.shouldShowRoleDot = z12;
        this.shouldShowRoleOnName = z13;
        this.spoilerAttributes = spoilerAttributes;
        this.onLongClick = onLongClickListener;
    }

    public  EmbedMessageAccessory(String str, int i10, int i11, int i12, Embed embed, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, i12, embed, z10, z11, z12, z13, spoilerAttributes, onLongClickListener);
    }

    
    public final String m249component13Eiw7ao() {
        return mo236getMessageId3Eiw7ao();
    }

    public final SpoilerAttributes component10() {
        return this.spoilerAttributes;
    }

    public final View.OnLongClickListener component11() {
        return this.onLongClick;
    }

    public final int component2() {
        return getIndex();
    }

    public final int component3() {
        return this.constrainedWidth;
    }

    public final int component4() {
        return this.radiusPx;
    }

    public final Embed component5() {
        return this.embed;
    }

    public final boolean component6() {
        return this.shouldAutoPlayGifs;
    }

    public final boolean component7() {
        return this.shouldAnimateEmoji;
    }

    public final boolean component8() {
        return this.shouldShowRoleDot;
    }

    public final boolean component9() {
        return this.shouldShowRoleOnName;
    }

    
    public final EmbedMessageAccessory m250copy5odn8qk(String messageId, int i10, int i11, int i12, Embed embed, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerAttributes spoilerAttributes, View.OnLongClickListener onLongClickListener) {
        q.h(messageId, "messageId");
        q.h(embed, "embed");
        return new EmbedMessageAccessory(messageId, i10, i11, i12, embed, z10, z11, z12, z13, spoilerAttributes, onLongClickListener, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedMessageAccessory)) {
            return false;
        }
        EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) obj;
        return MessageId.m635equalsimpl0(mo236getMessageId3Eiw7ao(), embedMessageAccessory.mo236getMessageId3Eiw7ao()) && getIndex() == embedMessageAccessory.getIndex() && this.constrainedWidth == embedMessageAccessory.constrainedWidth && this.radiusPx == embedMessageAccessory.radiusPx && q.c(this.embed, embedMessageAccessory.embed) && this.shouldAutoPlayGifs == embedMessageAccessory.shouldAutoPlayGifs && this.shouldAnimateEmoji == embedMessageAccessory.shouldAnimateEmoji && this.shouldShowRoleDot == embedMessageAccessory.shouldShowRoleDot && this.shouldShowRoleOnName == embedMessageAccessory.shouldShowRoleOnName && q.c(this.spoilerAttributes, embedMessageAccessory.spoilerAttributes) && q.c(this.onLongClick, embedMessageAccessory.onLongClick);
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    public final Embed getEmbed() {
        return this.embed;
    }

    @Override 
    public int getIndex() {
        return this.index;
    }

    @Override 
    
    public String mo236getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final View.OnLongClickListener getOnLongClick() {
        return this.onLongClick;
    }

    @Override 
    public double getPortal() {
        return PortalUiModel.DefaultImpls.getPortal(this);
    }

    public final int getRadiusPx() {
        return this.radiusPx;
    }

    public final boolean getShouldAnimateEmoji() {
        return this.shouldAnimateEmoji;
    }

    public final boolean getShouldAutoPlayGifs() {
        return this.shouldAutoPlayGifs;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public int hashCode() {
        int i10 = ((((((((MessageId.m636hashCodeimpl(mo236getMessageId3Eiw7ao()) * 31) + getIndex()) * 31) + this.constrainedWidth) * 31) + this.radiusPx) * 31) + this.embed.hashCode()) * 31;
        boolean z10 = this.shouldAutoPlayGifs;
        int i11 = 1;
        if (z10) {
            z10 = true;
        }
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        int i15 = (i10 + i12) * 31;
        boolean z11 = this.shouldAnimateEmoji;
        if (z11) {
            z11 = true;
        }
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = z11 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z12 = this.shouldShowRoleDot;
        if (z12) {
            z12 = true;
        }
        int i20 = z12 ? 1 : 0;
        int i21 = z12 ? 1 : 0;
        int i22 = z12 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        boolean z13 = this.shouldShowRoleOnName;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        int i24 = (i23 + i11) * 31;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        int i25 = 0;
        int hashCode = (i24 + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode())) * 31;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        if (onLongClickListener != null) {
            i25 = onLongClickListener.hashCode();
        }
        return hashCode + i25;
    }

    public String toString() {
        String str = MessageId.m637toStringimpl(mo236getMessageId3Eiw7ao());
        int index = getIndex();
        int i10 = this.constrainedWidth;
        int i11 = this.radiusPx;
        Embed embed = this.embed;
        boolean z10 = this.shouldAutoPlayGifs;
        boolean z11 = this.shouldAnimateEmoji;
        boolean z12 = this.shouldShowRoleDot;
        boolean z13 = this.shouldShowRoleOnName;
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        View.OnLongClickListener onLongClickListener = this.onLongClick;
        return "EmbedMessageAccessory(messageId=" + str + ", index=" + index + ", constrainedWidth=" + i10 + ", radiusPx=" + i11 + ", embed=" + embed + ", shouldAutoPlayGifs=" + z10 + ", shouldAnimateEmoji=" + z11 + ", shouldShowRoleDot=" + z12 + ", shouldShowRoleOnName=" + z13 + ", spoilerAttributes=" + spoilerAttributes + ", onLongClick=" + onLongClickListener + ")";
    }
}
