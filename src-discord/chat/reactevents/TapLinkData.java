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
import kg.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006BB\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JP\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\bHÖ\u0001J\f\u0010(\u001a\u00020)*\u00020\fH\u0002R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/reactevents/TapLinkData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "node", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "title", "", TouchesHelper.TARGET_KEY, "content", "context", "Lcom/discord/chat/bridge/contentnode/LinkContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContent", "()Ljava/lang/String;", "getContext", "()Lcom/discord/chat/bridge/contentnode/LinkContext;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "getTarget", "getTitle", "component1", "component1-N_6c4I0", "component2", "component3", "component4", "component5", "copy", "copy-fCSJrew", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContext;)Lcom/discord/chat/reactevents/TapLinkData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "toMap", "Lcom/facebook/react/bridge/WritableNativeMap;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TapLinkData implements ReactEvent {
    private final String content;
    private final LinkContext context;
    private final String messageId;
    private final String target;
    private final String title;

    public /* synthetic */ TapLinkData(String str, LinkContentNode linkContentNode, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkContentNode);
    }

    private TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext) {
        this.messageId = str;
        this.title = str2;
        this.target = str3;
        this.content = str4;
        this.context = linkContext;
    }

    public /* synthetic */ TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, linkContext);
    }

    /* renamed from: copy-fCSJrew$default  reason: not valid java name */
    public static /* synthetic */ TapLinkData m380copyfCSJrew$default(TapLinkData tapLinkData, String str, String str2, String str3, String str4, LinkContext linkContext, int i10, Object obj) {
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
        return tapLinkData.m382copyfCSJrew(str, str2, str3, str4, linkContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
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
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(x.a("id", handleDelete.getMessage().m63getId3Eiw7ao()), x.a("channel_id", ChannelId.m553toStringimpl(handleDelete.getMessage().m62getChannelIdo4g7jtM())), x.a("loggingName", handleDelete.getMessage().getLoggingName()), x.a("author", NativeMapExtensionsKt.nativeMapOf(x.a("username", handleDelete.getMessage().getAuthor().getUsername())))));
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
                                NativeMapExtensionsKt.put(nativeMapOf2, "channel_id", ChannelId.m553toStringimpl(messageReference.m77getChannelIdo4g7jtM()));
                                GuildId guildId = messageReference.m78getGuildIdqOKuAAo();
                                if (guildId != null) {
                                    NativeMapExtensionsKt.put(nativeMapOf2, "guild_id", GuildId.m566toStringimpl(guildId.m568unboximpl()));
                                }
                                Unit unit = Unit.f22063a;
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
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m553toStringimpl(pinsOnClick.m82getMessageChannelIdo4g7jtM()));
                            break;
                        }
                    }
                    break;
                case -932369101:
                    if (str2.equals("usernameOnClick")) {
                        UserNameOnClick usernameOnClick = linkContext.getUsernameOnClick();
                        if (usernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", usernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m617toStringimpl(usernameOnClick.m92getUserIdre6GcUE()));
                            ChannelId channelId = usernameOnClick.m91getMessageChannelIdqMVnFVQ();
                            if (channelId != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m553toStringimpl(channelId.m555unboximpl()));
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
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m617toStringimpl(actorHook.m42getUserIdre6GcUE()));
                            break;
                        }
                    }
                    break;
                case 1318937603:
                    if (str2.equals("otherUsernameOnClick")) {
                        UserNameOnClick otherUsernameOnClick = linkContext.getOtherUsernameOnClick();
                        if (otherUsernameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", otherUsernameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", UserId.m617toStringimpl(otherUsernameOnClick.m92getUserIdre6GcUE()));
                            ChannelId channelId2 = otherUsernameOnClick.m91getMessageChannelIdqMVnFVQ();
                            if (channelId2 != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", ChannelId.m553toStringimpl(channelId2.m555unboximpl()));
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
                            NativeMapExtensionsKt.put(nativeMapOf, "message", NativeMapExtensionsKt.nativeMapOf(x.a("id", handleMessage.getMessage().m70getId3Eiw7ao()), x.a("channel_id", ChannelId.m553toStringimpl(handleMessage.getMessage().m69getChannelIdo4g7jtM())), x.a("loggingName", handleMessage.getMessage().getLoggingName())));
                            break;
                        }
                    }
                    break;
                case 2071245203:
                    if (str2.equals("commandNameOnClick")) {
                        CommandOnClick commandNameOnClick = linkContext.getCommandNameOnClick();
                        if (commandNameOnClick != null) {
                            NativeMapExtensionsKt.put(nativeMapOf, "action", commandNameOnClick.getAction());
                            NativeMapExtensionsKt.put(nativeMapOf, "userId", String.valueOf(commandNameOnClick.m56getUserIdwUX8bhU()));
                            MessageType messageType = commandNameOnClick.getMessageType();
                            if (messageType != null) {
                                NativeMapExtensionsKt.put(nativeMapOf, "messageType", Integer.valueOf(messageType.getSerialNumber()));
                            }
                            String str3 = commandNameOnClick.m55getMessageIdN_6c4I0();
                            if (str3 == null) {
                                str = "null";
                            } else {
                                str = MessageId.m578toStringimpl(str3);
                            }
                            NativeMapExtensionsKt.put(nativeMapOf, "messageId", str);
                            NativeMapExtensionsKt.put(nativeMapOf, "applicationUserId", String.valueOf(commandNameOnClick.m53getApplicationUserIdwUX8bhU()));
                            NativeMapExtensionsKt.put(nativeMapOf, "messageChannelId", String.valueOf(commandNameOnClick.m54getMessageChannelIdqMVnFVQ()));
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

    /* renamed from: component1-N_6c4I0  reason: not valid java name */
    public final String m381component1N_6c4I0() {
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

    /* renamed from: copy-fCSJrew  reason: not valid java name */
    public final TapLinkData m382copyfCSJrew(String str, String str2, String str3, String content, LinkContext linkContext) {
        q.g(content, "content");
        return new TapLinkData(str, str2, str3, content, linkContext, null);
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
            boolean r1 = r5 instanceof com.discord.chat.reactevents.TapLinkData
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.discord.chat.reactevents.TapLinkData r5 = (com.discord.chat.reactevents.TapLinkData) r5
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
            boolean r1 = com.discord.primitives.MessageId.m576equalsimpl0(r1, r3)
        L_0x001e:
            if (r1 != 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = kotlin.jvm.internal.q.b(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            java.lang.String r1 = r4.target
            java.lang.String r3 = r5.target
            boolean r1 = kotlin.jvm.internal.q.b(r1, r3)
            if (r1 != 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.String r1 = r4.content
            java.lang.String r3 = r5.content
            boolean r1 = kotlin.jvm.internal.q.b(r1, r3)
            if (r1 != 0) goto L_0x0042
            return r2
        L_0x0042:
            com.discord.chat.bridge.contentnode.LinkContext r1 = r4.context
            com.discord.chat.bridge.contentnode.LinkContext r5 = r5.context
            boolean r5 = kotlin.jvm.internal.q.b(r1, r5)
            if (r5 != 0) goto L_0x004d
            return r2
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.reactevents.TapLinkData.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.content;
    }

    public final LinkContext getContext() {
        return this.context;
    }

    /* renamed from: getMessageId-N_6c4I0  reason: not valid java name */
    public final String m383getMessageIdN_6c4I0() {
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
        int i11 = (str == null ? 0 : MessageId.m577hashCodeimpl(str)) * 31;
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

    @Override // com.discord.reactevents.ReactEvent
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
                str = MessageId.m578toStringimpl(str2);
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
        String str2 = str == null ? "null" : MessageId.m578toStringimpl(str);
        String str3 = this.title;
        String str4 = this.target;
        String str5 = this.content;
        LinkContext linkContext = this.context;
        return "TapLinkData(messageId=" + str2 + ", title=" + str3 + ", target=" + str4 + ", content=" + str5 + ", context=" + linkContext + ")";
    }

    public /* synthetic */ TapLinkData(String str, String str2, String str3, String str4, LinkContext linkContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? null : linkContext, null);
    }

    private TapLinkData(String str, LinkContentNode linkContentNode) {
        this(str, null, linkContentNode.getTarget(), linkContentNode.getTextContent(), linkContentNode.getContext(), 2, null);
    }
}
