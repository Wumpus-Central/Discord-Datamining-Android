package com.discord.chat.reactevents;

import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.contentnode.ActorHook;
import com.discord.chat.bridge.contentnode.CommandOnClick;
import com.discord.chat.bridge.contentnode.HandleDelete;
import com.discord.chat.bridge.contentnode.HandleMessage;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContext;
import com.discord.chat.bridge.contentnode.MessageReference;
import com.discord.chat.bridge.contentnode.PinsOnClick;
import com.discord.chat.bridge.contentnode.RoleSubscriptionOnClick;
import com.discord.chat.bridge.contentnode.ThreadOnClick;
import com.discord.chat.bridge.contentnode.UserNameOnClick;
import com.discord.chat.bridge.contentnode.WebhookNameOnClick;
import com.discord.logging.Log;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import pf.x;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006BB\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\bHÖ\u0001J\f\u0010(\u001a\u00020)*\u00020\fH\u0002R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/reactevents/TapLinkData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "title", "", TouchesHelper.TARGET_KEY, "content", "context", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getContext", "()Lcom/discord/chat/bridge/contentnode/LinkContext;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getTarget", "getTitle", "component1", "component1-N_6c4I0", "component2", "component3", "component4", "component5", "copy", "copy-fCSJrew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "toMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapLinkData implements ReactEvent {
    private final String content;
    private final LinkContext context;
    private final String messageId;
    private final String target;
    private final String title;

    public  TapLinkData(String str, LinkContentNode linkContentNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkContentNode);
    }

    private TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext) {
        this.messageId = str;
        this.title = str2;
        this.target = str3;
        this.content = str4;
        this.context = linkContext;
    }

    public  TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, linkContext);
    }

    
    public static  TapLinkData m434copyfCSJrew$default(TapLinkData tapLinkData, String str, String str2, String str3, String str4, LinkContext linkContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapLinkData.messageId;
        }
        if ((i10 & 2) != 0) {
            str2 = tapLinkData.title;
        }
        if ((i10 & 4) != 0) {
            str3 = tapLinkData.target;
        }
        if ((i10 & 8) != 0) {
            str4 = tapLinkData.content;
        }
        if ((i10 & 16) != 0) {
            linkContext = tapLinkData.context;
        }
        return tapLinkData.m436copyfCSJrew(str, str2, str3, str4, linkContext);
    }

    
    private final WritableNativeMap toMap(LinkContext linkContext) {
        String str;
        WritableNativeMap nativeMapOf = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
        String str2 = this.target;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1732468237:
                    if (str2.equals("handleDelete")) {
                        HandleDelete handleDelete = linkContext.getHandleDelete();
                        if (handleDelete != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", handleDelete.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(x.a("id", handleDelete.getMessage().m70getId3Eiw7ao()), x.a("channel_id", ChannelId.m617toStringimpl(handleDelete.getMessage().m69getChannelIdo4g7jtM())), x.a("loggingName", handleDelete.getMessage().getLoggingName()), x.a("author", NativeMapExtensionsKt.nativeMapOf(x.a("username", handleDelete.getMessage().getAuthor().getUsername())))));
                            break;
                        }
                    }
                    break;
                case -1226627713:
                    if (str2.equals("threadOnClick")) {
                        ThreadOnClick threadOnClick = linkContext.getThreadOnClick();
                        if (threadOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", threadOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "threadId", threadOnClick.getThreadId());
                            break;
                        }
                    }
                    break;
                case -1138120985:
                    if (str2.equals("webhookNameOnClick")) {
                        WebhookNameOnClick webhookNameOnClick = linkContext.getWebhookNameOnClick();
                        if (webhookNameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", webhookNameOnClick.getAction());
                            MessageReference messageReference = webhookNameOnClick.getMessageReference();
                            if (messageReference != null) {
                                WritableNativeMap nativeMapOf2 = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
                                NativeMapExtensionsKt.put(nativeMapOf2, "channel_id", ChannelId.m617toStringimpl(messageReference.m84getChannelIdo4g7jtM()));
                                GuildId guildId = messageReference.m85getGuildIdqOKuAAo();
                                if (guildId != null) {
                                    NativeMapExtensionsKt.put(nativeMapOf2, "guild_id", GuildId.m630toStringimpl(guildId.m632unboximpl()));
                                }
                                Unit unit = Unit.f21600a;
                                NativeMapExtensionsKt.put(nativeMapOf, "messageReference", nativeMapOf2);
                                break;
                            }
                        }
                    }
                    break;
                case -933189749:
                    if (str2.equals("pinsOnClick")) {
                        PinsOnClick pinsOnClick = linkContext.getPinsOnClick();
                        if (pinsOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", pinsOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m617toStringimpl(pinsOnClick.m89getMessageChannelIdo4g7jtM()));
                            break;
                        }
                    }
                    break;
                case -932369101:
                    if (str2.equals("usernameOnClick")) {
                        UserNameOnClick usernameOnClick = linkContext.getUsernameOnClick();
                        if (usernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", usernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m681toStringimpl(usernameOnClick.m99getUserIdre6GcUE()));
                            ChannelId channelId = usernameOnClick.m98getMessageChannelIdqMVnFVQ();
                            if (channelId != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m617toStringimpl(channelId.m619unboximpl()));
                                break;
                            }
                        }
                    }
                    break;
                case -86972746:
                    if (str2.equals("roleSubscriptionOnClick")) {
                        RoleSubscriptionOnClick roleSubscriptionOnClick = linkContext.getRoleSubscriptionOnClick();
                        if (roleSubscriptionOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", roleSubscriptionOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "guildId", roleSubscriptionOnClick.getGuildId());
                            NativeMapExtensionsKt.put(nativeMapOf, "channelId", roleSubscriptionOnClick.getChannelId());
                            NativeMapExtensionsKt.put(nativeMapOf, "messageId", roleSubscriptionOnClick.getMessageId());
                            NativeMapExtensionsKt.put(nativeMapOf, "roleSubscriptionListingId", roleSubscriptionOnClick.getRoleSubscriptionListingId());
                            break;
                        }
                    }
                    break;
                case 371724472:
                    if (str2.equals("actorHook")) {
                        ActorHook actorHook = linkContext.getActorHook();
                        if (actorHook != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", actorHook.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m681toStringimpl(actorHook.m49getUserIdre6GcUE()));
                            break;
                        }
                    }
                    break;
                case 1318937603:
                    if (str2.equals("otherUsernameOnClick")) {
                        UserNameOnClick otherUsernameOnClick = linkContext.getOtherUsernameOnClick();
                        if (otherUsernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", otherUsernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m681toStringimpl(otherUsernameOnClick.m99getUserIdre6GcUE()));
                            ChannelId channelId2 = otherUsernameOnClick.m98getMessageChannelIdqMVnFVQ();
                            if (channelId2 != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m617toStringimpl(channelId2.m619unboximpl()));
                                break;
                            }
                        }
                    }
                    break;
                case 1532521663:
                    if (str2.equals("handleMessage")) {
                        HandleMessage handleMessage = linkContext.getHandleMessage();
                        if (handleMessage != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", handleMessage.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(x.a("id", handleMessage.getMessage().m77getId3Eiw7ao()), x.a("channel_id", ChannelId.m617toStringimpl(handleMessage.getMessage().m76getChannelIdo4g7jtM())), x.a("loggingName", handleMessage.getMessage().getLoggingName())));
                            NativeMapExtensionsKt.put(nativeMapOf, "notificationType", handleMessage.getNotificationType());
                            break;
                        }
                    }
                    break;
                case 2071245203:
                    if (str2.equals("commandNameOnClick")) {
                        CommandOnClick commandNameOnClick = linkContext.getCommandNameOnClick();
                        if (commandNameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", commandNameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", String.valueOf(commandNameOnClick.m63getUserIdwUX8bhU()));
                            MessageType messageType = commandNameOnClick.getMessageType();
                            if (messageType != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageType", Integer.valueOf(messageType.getSerialNumber()));
                            }
                            String str3 = commandNameOnClick.m62getMessageIdN_6c4I0();
                            if (str3 == null) {
                                str = "null";
                            } else {
                                str = MessageId.m642toStringimpl(str3);
                            }
                            NativeMapExtensionsKt.put(nativeMapOf, "messageId", str);
                            NativeMapExtensionsKt.put(nativeMapOf, "applicationUserId", String.valueOf(commandNameOnClick.m60getApplicationUserIdwUX8bhU()));
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", String.valueOf(commandNameOnClick.m61getMessageChannelIdqMVnFVQ()));
                            break;
                        }
                    }
                    break;
            }
            return nativeMapOf;
        }
        Log log = Log.INSTANCE;
        String str4 = this.target;
        Log.e$default(log, "TapLink", "Missing target type in context: " + str4, (Throwable) null, 4, (Object) null);
        return nativeMapOf;
    }

    
    public final String m435component1N_6c4I0() {
        return this.messageId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.target;
    }

    public final String component4() {
        return this.content;
    }

    public final LinkContext component5() {
        return this.context;
    }

    
    public final TapLinkData m436copyfCSJrew(String str, String str2, String str3, String content, LinkContext linkContext) {
        q.h(content, "content");
        return new TapLinkData(str, str2, str3, content, linkContext, null);
    }

    
    
    
    public boolean equals(java.lang.Object r5) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.reactevents.TapLinkData.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.content;
    }

    public final LinkContext getContext() {
        return this.context;
    }

    
    public final String m437getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.messageId;
        int i10 = 0;
        int i11 = (str == null ? 0 : MessageId.m641hashCodeimpl(str)) * 31;
        String str2 = this.title;
        int hashCode = (i11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        int hashCode2 = (((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31) + this.content.hashCode()) * 31;
        LinkContext linkContext = this.context;
        if (linkContext != null) {
            i10 = linkContext.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override 
    public WritableMap serialize() {
        WritableNativeMap writableNativeMap;
        String str;
        LinkContext linkContext = this.context;
        if (linkContext == null || (writableNativeMap = toMap(linkContext)) == null) {
            Pair[] pairArr = new Pair[3];
            String str2 = this.messageId;
            if (str2 == null) {
                str = "null";
            } else {
                str = MessageId.m642toStringimpl(str2);
            }
            pairArr[0] = x.a("messageId", str);
            pairArr[1] = x.a("url", this.target);
            pairArr[2] = x.a("node", NativeMapExtensionsKt.nativeMapOf(x.a("title", this.title), x.a(TouchesHelper.TARGET_KEY, this.target), x.a("content", this.content)));
            writableNativeMap = NativeMapExtensionsKt.nativeMapOf(pairArr);
        }
        return NativeMapExtensionsKt.nativeMapOf(x.a("data", writableNativeMap));
    }

    public String toString() {
        String str = this.messageId;
        String str2 = str == null ? "null" : MessageId.m642toStringimpl(str);
        String str3 = this.title;
        String str4 = this.target;
        String str5 = this.content;
        LinkContext linkContext = this.context;
        return "TapLinkData(messageId=" + str2 + ", title=" + str3 + ", target=" + str4 + ", content=" + str5 + ", context=" + linkContext + ")";
    }

    public  TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? null : linkContext, null);
    }

    private TapLinkData(String str, LinkContentNode linkContentNode) {
        this(str, null, linkContentNode.getTarget(), linkContentNode.getTextContent(), linkContentNode.getContext(), 2, null);
    }
}
