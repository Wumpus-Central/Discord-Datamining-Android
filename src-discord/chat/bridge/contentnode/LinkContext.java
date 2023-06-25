package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002FGB}\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B}\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u001aJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0081\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001J!\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006H"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContext;", "", "seen1", "", "usernameOnClick", "Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "otherUsernameOnClick", "commandNameOnClick", "Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "actorHook", "Lcom/discord/chat/bridge/contentnode/ActorHook;", "threadOnClick", "Lcom/discord/chat/bridge/contentnode/ThreadOnClick;", "pinsOnClick", "Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "webhookNameOnClick", "Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;", "handleDelete", "Lcom/discord/chat/bridge/contentnode/HandleDelete;", "roleSubscriptionOnClick", "Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;", "handleMessage", "Lcom/discord/chat/bridge/contentnode/HandleMessage;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/UserNameOnClick;Lcom/discord/chat/bridge/contentnode/CommandOnClick;Lcom/discord/chat/bridge/contentnode/ActorHook;Lcom/discord/chat/bridge/contentnode/ThreadOnClick;Lcom/discord/chat/bridge/contentnode/PinsOnClick;Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;Lcom/discord/chat/bridge/contentnode/HandleDelete;Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;Lcom/discord/chat/bridge/contentnode/HandleMessage;)V", "getActorHook", "()Lcom/discord/chat/bridge/contentnode/ActorHook;", "getCommandNameOnClick", "()Lcom/discord/chat/bridge/contentnode/CommandOnClick;", "getHandleDelete", "()Lcom/discord/chat/bridge/contentnode/HandleDelete;", "getHandleMessage", "()Lcom/discord/chat/bridge/contentnode/HandleMessage;", "getOtherUsernameOnClick", "()Lcom/discord/chat/bridge/contentnode/UserNameOnClick;", "getPinsOnClick", "()Lcom/discord/chat/bridge/contentnode/PinsOnClick;", "getRoleSubscriptionOnClick", "()Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;", "getThreadOnClick", "()Lcom/discord/chat/bridge/contentnode/ThreadOnClick;", "getUsernameOnClick", "getWebhookNameOnClick", "()Lcom/discord/chat/bridge/contentnode/WebhookNameOnClick;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LinkContext {
    public static final Companion Companion = new Companion(null);
    private final ActorHook actorHook;
    private final CommandOnClick commandNameOnClick;
    private final HandleDelete handleDelete;
    private final HandleMessage handleMessage;
    private final UserNameOnClick otherUsernameOnClick;
    private final PinsOnClick pinsOnClick;
    private final RoleSubscriptionOnClick roleSubscriptionOnClick;
    private final ThreadOnClick threadOnClick;
    private final UserNameOnClick usernameOnClick;
    private final WebhookNameOnClick webhookNameOnClick;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/LinkContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkContext> serializer() {
            return LinkContext$$serializer.INSTANCE;
        }
    }

    public LinkContext() {
        this((UserNameOnClick) null, (UserNameOnClick) null, (CommandOnClick) null, (ActorHook) null, (ThreadOnClick) null, (PinsOnClick) null, (WebhookNameOnClick) null, (HandleDelete) null, (RoleSubscriptionOnClick) null, (HandleMessage) null, 1023, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ LinkContext(int i10, UserNameOnClick userNameOnClick, UserNameOnClick userNameOnClick2, CommandOnClick commandOnClick, ActorHook actorHook, ThreadOnClick threadOnClick, PinsOnClick pinsOnClick, WebhookNameOnClick webhookNameOnClick, HandleDelete handleDelete, RoleSubscriptionOnClick roleSubscriptionOnClick, HandleMessage handleMessage, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, LinkContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.usernameOnClick = null;
        } else {
            this.usernameOnClick = userNameOnClick;
        }
        if ((i10 & 2) == 0) {
            this.otherUsernameOnClick = null;
        } else {
            this.otherUsernameOnClick = userNameOnClick2;
        }
        if ((i10 & 4) == 0) {
            this.commandNameOnClick = null;
        } else {
            this.commandNameOnClick = commandOnClick;
        }
        if ((i10 & 8) == 0) {
            this.actorHook = null;
        } else {
            this.actorHook = actorHook;
        }
        if ((i10 & 16) == 0) {
            this.threadOnClick = null;
        } else {
            this.threadOnClick = threadOnClick;
        }
        if ((i10 & 32) == 0) {
            this.pinsOnClick = null;
        } else {
            this.pinsOnClick = pinsOnClick;
        }
        if ((i10 & 64) == 0) {
            this.webhookNameOnClick = null;
        } else {
            this.webhookNameOnClick = webhookNameOnClick;
        }
        if ((i10 & 128) == 0) {
            this.handleDelete = null;
        } else {
            this.handleDelete = handleDelete;
        }
        if ((i10 & 256) == 0) {
            this.roleSubscriptionOnClick = null;
        } else {
            this.roleSubscriptionOnClick = roleSubscriptionOnClick;
        }
        if ((i10 & 512) == 0) {
            this.handleMessage = null;
        } else {
            this.handleMessage = handleMessage;
        }
    }

    public static final void write$Self(LinkContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z19 = false;
        if (!output.w(serialDesc, 0) && self.usernameOnClick == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.e(serialDesc, 0, UserNameOnClick$$serializer.INSTANCE, self.usernameOnClick);
        }
        if (!output.w(serialDesc, 1) && self.otherUsernameOnClick == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.e(serialDesc, 1, UserNameOnClick$$serializer.INSTANCE, self.otherUsernameOnClick);
        }
        if (!output.w(serialDesc, 2) && self.commandNameOnClick == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.e(serialDesc, 2, CommandOnClick$$serializer.INSTANCE, self.commandNameOnClick);
        }
        if (!output.w(serialDesc, 3) && self.actorHook == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.e(serialDesc, 3, ActorHook$$serializer.INSTANCE, self.actorHook);
        }
        if (!output.w(serialDesc, 4) && self.threadOnClick == null) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z14) {
            output.e(serialDesc, 4, ThreadOnClick$$serializer.INSTANCE, self.threadOnClick);
        }
        if (!output.w(serialDesc, 5) && self.pinsOnClick == null) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (z15) {
            output.e(serialDesc, 5, PinsOnClick$$serializer.INSTANCE, self.pinsOnClick);
        }
        if (!output.w(serialDesc, 6) && self.webhookNameOnClick == null) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (z16) {
            output.e(serialDesc, 6, WebhookNameOnClick$$serializer.INSTANCE, self.webhookNameOnClick);
        }
        if (!output.w(serialDesc, 7) && self.handleDelete == null) {
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            output.e(serialDesc, 7, HandleDelete$$serializer.INSTANCE, self.handleDelete);
        }
        if (!output.w(serialDesc, 8) && self.roleSubscriptionOnClick == null) {
            z18 = false;
        } else {
            z18 = true;
        }
        if (z18) {
            output.e(serialDesc, 8, RoleSubscriptionOnClick$$serializer.INSTANCE, self.roleSubscriptionOnClick);
        }
        if (output.w(serialDesc, 9) || self.handleMessage != null) {
            z19 = true;
        }
        if (z19) {
            output.e(serialDesc, 9, HandleMessage$$serializer.INSTANCE, self.handleMessage);
        }
    }

    public final UserNameOnClick component1() {
        return this.usernameOnClick;
    }

    public final HandleMessage component10() {
        return this.handleMessage;
    }

    public final UserNameOnClick component2() {
        return this.otherUsernameOnClick;
    }

    public final CommandOnClick component3() {
        return this.commandNameOnClick;
    }

    public final ActorHook component4() {
        return this.actorHook;
    }

    public final ThreadOnClick component5() {
        return this.threadOnClick;
    }

    public final PinsOnClick component6() {
        return this.pinsOnClick;
    }

    public final WebhookNameOnClick component7() {
        return this.webhookNameOnClick;
    }

    public final HandleDelete component8() {
        return this.handleDelete;
    }

    public final RoleSubscriptionOnClick component9() {
        return this.roleSubscriptionOnClick;
    }

    public final LinkContext copy(UserNameOnClick userNameOnClick, UserNameOnClick userNameOnClick2, CommandOnClick commandOnClick, ActorHook actorHook, ThreadOnClick threadOnClick, PinsOnClick pinsOnClick, WebhookNameOnClick webhookNameOnClick, HandleDelete handleDelete, RoleSubscriptionOnClick roleSubscriptionOnClick, HandleMessage handleMessage) {
        return new LinkContext(userNameOnClick, userNameOnClick2, commandOnClick, actorHook, threadOnClick, pinsOnClick, webhookNameOnClick, handleDelete, roleSubscriptionOnClick, handleMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkContext)) {
            return false;
        }
        LinkContext linkContext = (LinkContext) obj;
        return q.b(this.usernameOnClick, linkContext.usernameOnClick) && q.b(this.otherUsernameOnClick, linkContext.otherUsernameOnClick) && q.b(this.commandNameOnClick, linkContext.commandNameOnClick) && q.b(this.actorHook, linkContext.actorHook) && q.b(this.threadOnClick, linkContext.threadOnClick) && q.b(this.pinsOnClick, linkContext.pinsOnClick) && q.b(this.webhookNameOnClick, linkContext.webhookNameOnClick) && q.b(this.handleDelete, linkContext.handleDelete) && q.b(this.roleSubscriptionOnClick, linkContext.roleSubscriptionOnClick) && q.b(this.handleMessage, linkContext.handleMessage);
    }

    public final ActorHook getActorHook() {
        return this.actorHook;
    }

    public final CommandOnClick getCommandNameOnClick() {
        return this.commandNameOnClick;
    }

    public final HandleDelete getHandleDelete() {
        return this.handleDelete;
    }

    public final HandleMessage getHandleMessage() {
        return this.handleMessage;
    }

    public final UserNameOnClick getOtherUsernameOnClick() {
        return this.otherUsernameOnClick;
    }

    public final PinsOnClick getPinsOnClick() {
        return this.pinsOnClick;
    }

    public final RoleSubscriptionOnClick getRoleSubscriptionOnClick() {
        return this.roleSubscriptionOnClick;
    }

    public final ThreadOnClick getThreadOnClick() {
        return this.threadOnClick;
    }

    public final UserNameOnClick getUsernameOnClick() {
        return this.usernameOnClick;
    }

    public final WebhookNameOnClick getWebhookNameOnClick() {
        return this.webhookNameOnClick;
    }

    public int hashCode() {
        UserNameOnClick userNameOnClick = this.usernameOnClick;
        int i10 = 0;
        int hashCode = (userNameOnClick == null ? 0 : userNameOnClick.hashCode()) * 31;
        UserNameOnClick userNameOnClick2 = this.otherUsernameOnClick;
        int hashCode2 = (hashCode + (userNameOnClick2 == null ? 0 : userNameOnClick2.hashCode())) * 31;
        CommandOnClick commandOnClick = this.commandNameOnClick;
        int hashCode3 = (hashCode2 + (commandOnClick == null ? 0 : commandOnClick.hashCode())) * 31;
        ActorHook actorHook = this.actorHook;
        int hashCode4 = (hashCode3 + (actorHook == null ? 0 : actorHook.hashCode())) * 31;
        ThreadOnClick threadOnClick = this.threadOnClick;
        int hashCode5 = (hashCode4 + (threadOnClick == null ? 0 : threadOnClick.hashCode())) * 31;
        PinsOnClick pinsOnClick = this.pinsOnClick;
        int hashCode6 = (hashCode5 + (pinsOnClick == null ? 0 : pinsOnClick.hashCode())) * 31;
        WebhookNameOnClick webhookNameOnClick = this.webhookNameOnClick;
        int hashCode7 = (hashCode6 + (webhookNameOnClick == null ? 0 : webhookNameOnClick.hashCode())) * 31;
        HandleDelete handleDelete = this.handleDelete;
        int hashCode8 = (hashCode7 + (handleDelete == null ? 0 : handleDelete.hashCode())) * 31;
        RoleSubscriptionOnClick roleSubscriptionOnClick = this.roleSubscriptionOnClick;
        int hashCode9 = (hashCode8 + (roleSubscriptionOnClick == null ? 0 : roleSubscriptionOnClick.hashCode())) * 31;
        HandleMessage handleMessage = this.handleMessage;
        if (handleMessage != null) {
            i10 = handleMessage.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        UserNameOnClick userNameOnClick = this.usernameOnClick;
        UserNameOnClick userNameOnClick2 = this.otherUsernameOnClick;
        CommandOnClick commandOnClick = this.commandNameOnClick;
        ActorHook actorHook = this.actorHook;
        ThreadOnClick threadOnClick = this.threadOnClick;
        PinsOnClick pinsOnClick = this.pinsOnClick;
        WebhookNameOnClick webhookNameOnClick = this.webhookNameOnClick;
        HandleDelete handleDelete = this.handleDelete;
        RoleSubscriptionOnClick roleSubscriptionOnClick = this.roleSubscriptionOnClick;
        HandleMessage handleMessage = this.handleMessage;
        return "LinkContext(usernameOnClick=" + userNameOnClick + ", otherUsernameOnClick=" + userNameOnClick2 + ", commandNameOnClick=" + commandOnClick + ", actorHook=" + actorHook + ", threadOnClick=" + threadOnClick + ", pinsOnClick=" + pinsOnClick + ", webhookNameOnClick=" + webhookNameOnClick + ", handleDelete=" + handleDelete + ", roleSubscriptionOnClick=" + roleSubscriptionOnClick + ", handleMessage=" + handleMessage + ")";
    }

    public LinkContext(UserNameOnClick userNameOnClick, UserNameOnClick userNameOnClick2, CommandOnClick commandOnClick, ActorHook actorHook, ThreadOnClick threadOnClick, PinsOnClick pinsOnClick, WebhookNameOnClick webhookNameOnClick, HandleDelete handleDelete, RoleSubscriptionOnClick roleSubscriptionOnClick, HandleMessage handleMessage) {
        this.usernameOnClick = userNameOnClick;
        this.otherUsernameOnClick = userNameOnClick2;
        this.commandNameOnClick = commandOnClick;
        this.actorHook = actorHook;
        this.threadOnClick = threadOnClick;
        this.pinsOnClick = pinsOnClick;
        this.webhookNameOnClick = webhookNameOnClick;
        this.handleDelete = handleDelete;
        this.roleSubscriptionOnClick = roleSubscriptionOnClick;
        this.handleMessage = handleMessage;
    }

    public /* synthetic */ LinkContext(UserNameOnClick userNameOnClick, UserNameOnClick userNameOnClick2, CommandOnClick commandOnClick, ActorHook actorHook, ThreadOnClick threadOnClick, PinsOnClick pinsOnClick, WebhookNameOnClick webhookNameOnClick, HandleDelete handleDelete, RoleSubscriptionOnClick roleSubscriptionOnClick, HandleMessage handleMessage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : userNameOnClick, (i10 & 2) != 0 ? null : userNameOnClick2, (i10 & 4) != 0 ? null : commandOnClick, (i10 & 8) != 0 ? null : actorHook, (i10 & 16) != 0 ? null : threadOnClick, (i10 & 32) != 0 ? null : pinsOnClick, (i10 & 64) != 0 ? null : webhookNameOnClick, (i10 & 128) != 0 ? null : handleDelete, (i10 & 256) != 0 ? null : roleSubscriptionOnClick, (i10 & 512) == 0 ? handleMessage : null);
    }
}
