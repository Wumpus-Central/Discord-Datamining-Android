package com.discord.chat.presentation.textutils;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.theme.DiscordTheme;
import com.facebook.react.uimanager.ViewProps;
import j$.util.Spliterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bX\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\u0085\u0003\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\f\u0012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002\u0012\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0014\u0012*\u00108\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d\u0012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0006\u0010?\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\u0006\u0010B\u001a\u00020\u0006\u0012\b\b\u0002\u0010C\u001a\u00020&\u0012\b\b\u0002\u0010D\u001a\u00020(\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020-\u0012\b\b\u0002\u0010H\u001a\u00020/\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010(¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002HÆ\u0003J%\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0014HÆ\u0003J-\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u0016HÆ\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0018HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001dHÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020&HÆ\u0003J\t\u0010)\u001a\u00020(HÆ\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020-HÆ\u0003J\t\u00100\u001a\u00020/HÆ\u0003J\u0012\u00101\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b1\u0010+J°\u0003\u0010J\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\f2\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00022$\b\u0002\u00107\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00142,\b\u0002\u00108\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00162\u001a\b\u0002\u00109\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00182\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\b\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0002\u0010?\u001a\u00020\u00062\b\b\u0002\u0010@\u001a\u00020\u00062\b\b\u0002\u0010A\u001a\u00020\u00062\b\b\u0002\u0010B\u001a\u00020\u00062\b\b\u0002\u0010C\u001a\u00020&2\b\b\u0002\u0010D\u001a\u00020(2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010F\u001a\u00020\u00032\b\b\u0002\u0010G\u001a\u00020-2\b\b\u0002\u0010H\u001a\u00020/2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\t\u0010L\u001a\u00020\fHÖ\u0001J\t\u0010M\u001a\u00020(HÖ\u0001J\u0013\u0010O\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u00102\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010P\u001a\u0004\bQ\u0010RR\u0017\u00103\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR#\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b4\u0010V\u001a\u0004\bW\u0010XR#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b5\u0010V\u001a\u0004\bY\u0010XR#\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b6\u0010V\u001a\u0004\bZ\u0010XR3\u00107\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b7\u0010[\u001a\u0004\b\\\u0010]R;\u00108\u001a&\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u000f0\u00168\u0006¢\u0006\f\n\u0004\b8\u0010^\u001a\u0004\b_\u0010`R)\u00109\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00188\u0006¢\u0006\f\n\u0004\b9\u0010a\u001a\u0004\bb\u0010cR#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b:\u0010V\u001a\u0004\bd\u0010XR#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b;\u0010V\u001a\u0004\be\u0010XR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0006¢\u0006\f\n\u0004\b<\u0010f\u001a\u0004\bg\u0010hR#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b=\u0010V\u001a\u0004\bi\u0010XR#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00028\u0006¢\u0006\f\n\u0004\b>\u0010V\u001a\u0004\bj\u0010XR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b?\u0010k\u001a\u0004\bl\u0010mR\u0017\u0010@\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b@\u0010k\u001a\u0004\bn\u0010mR\u0017\u0010A\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bA\u0010k\u001a\u0004\bo\u0010mR\u0017\u0010B\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010k\u001a\u0004\bp\u0010mR\u0017\u0010C\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bC\u0010q\u001a\u0004\br\u0010sR\u0017\u0010D\u001a\u00020(8\u0006¢\u0006\f\n\u0004\bD\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010E\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bE\u0010w\u001a\u0004\bx\u0010+R\u0017\u0010F\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bF\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010G\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bG\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010H\u001a\u00020/8\u0006¢\u0006\u000e\n\u0004\bH\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010I\u001a\u0004\u0018\u00010(8\u0006¢\u0006\r\n\u0004\bI\u0010w\u001a\u0005\b\u0082\u0001\u0010+¨\u0006\u0087\u0001"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext;", "", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "update", "updateInsets", "", "spoilerExists", "spoilerIsHidden", "spoilerIsRevealed", "Landroid/content/Context;", "component1", "", "component2", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "component3", "component4", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "component5", "Lkotlin/Function3;", "component6", "Lkotlin/Function4;", "component7", "Lkotlin/Function2;", "component8", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "component9", "component10", "Lkotlin/Function0;", "component11", "component12", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "component13", "component14", "component15", "component16", "component17", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "component18", "", "component19", "component20", "()Ljava/lang/Integer;", "component21", "Lcom/discord/theme/DiscordTheme;", "component22", "", "component23", "component24", "context", "containerId", "onTapLink", "onLongTapLink", "linkStyle", "onTapChannel", "onLongPressChannel", "onTapMention", "onTapCommand", "onLongPressCommand", "onTapSpoiler", "onTapTimestamp", "onTapEmoji", "animateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "singleLine", "spoilerState", "listNestedLevel", "listOrderedIndex", "insets", "theme", "baselineHeight", "emojiSizeOverride", "copy", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)Lcom/discord/chat/presentation/textutils/RenderContext;", "toString", "hashCode", "other", "equals", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getContainerId", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getOnTapLink", "()Lkotlin/jvm/functions/Function1;", "getOnLongTapLink", "getLinkStyle", "Lkotlin/jvm/functions/Function3;", "getOnTapChannel", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function4;", "getOnLongPressChannel", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function2;", "getOnTapMention", "()Lkotlin/jvm/functions/Function2;", "getOnTapCommand", "getOnLongPressCommand", "Lkotlin/jvm/functions/Function0;", "getOnTapSpoiler", "()Lkotlin/jvm/functions/Function0;", "getOnTapTimestamp", "getOnTapEmoji", "Z", "getAnimateEmoji", "()Z", "getShouldShowRoleDot", "getShouldShowRoleOnName", "getSingleLine", "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "getSpoilerState", "()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "I", "getListNestedLevel", "()I", "Ljava/lang/Integer;", "getListOrderedIndex", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "getInsets", "()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "Lcom/discord/theme/DiscordTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "F", "getBaselineHeight", "()F", "getEmojiSizeOverride", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V", "Insets", "SpoilerState", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RenderContext {
    private final boolean animateEmoji;
    private final float baselineHeight;
    private final String containerId;
    private final Context context;
    private final Integer emojiSizeOverride;
    private final Insets insets;
    private final Function1<LinkContentNode, LinkStyle> linkStyle;
    private final int listNestedLevel;
    private final Integer listOrderedIndex;
    private final Function4<String, String, String, String, Unit> onLongPressChannel;
    private final Function1<CommandMentionContentNode, Unit> onLongPressCommand;
    private final Function1<LinkContentNode, Unit> onLongTapLink;
    private final Function3<String, String, String, Unit> onTapChannel;
    private final Function1<CommandMentionContentNode, Unit> onTapCommand;
    private final Function1<EmojiContentNode, Unit> onTapEmoji;
    private final Function1<LinkContentNode, Unit> onTapLink;
    private final Function2<String, String, Unit> onTapMention;
    private final Function0<Unit> onTapSpoiler;
    private final Function1<String, Unit> onTapTimestamp;
    private final boolean shouldShowRoleDot;
    private final boolean shouldShowRoleOnName;
    private final boolean singleLine;
    private final SpoilerState spoilerState;
    private final DiscordTheme theme;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;", "", "(Ljava/lang/String;I)V", "None", "Hidden", "Revealed", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public enum SpoilerState {
        None,
        Hidden,
        Revealed
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RenderContext(Context context, String containerId, Function1<? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerState spoilerState, int i10, Integer num, Insets insets, DiscordTheme theme, float f10, Integer num2) {
        q.g(context, "context");
        q.g(containerId, "containerId");
        q.g(onTapLink, "onTapLink");
        q.g(onLongTapLink, "onLongTapLink");
        q.g(linkStyle, "linkStyle");
        q.g(onTapChannel, "onTapChannel");
        q.g(onLongPressChannel, "onLongPressChannel");
        q.g(onTapMention, "onTapMention");
        q.g(onTapCommand, "onTapCommand");
        q.g(onLongPressCommand, "onLongPressCommand");
        q.g(onTapSpoiler, "onTapSpoiler");
        q.g(onTapTimestamp, "onTapTimestamp");
        q.g(onTapEmoji, "onTapEmoji");
        q.g(spoilerState, "spoilerState");
        q.g(insets, "insets");
        q.g(theme, "theme");
        this.context = context;
        this.containerId = containerId;
        this.onTapLink = onTapLink;
        this.onLongTapLink = onLongTapLink;
        this.linkStyle = linkStyle;
        this.onTapChannel = onTapChannel;
        this.onLongPressChannel = onLongPressChannel;
        this.onTapMention = onTapMention;
        this.onTapCommand = onTapCommand;
        this.onLongPressCommand = onLongPressCommand;
        this.onTapSpoiler = onTapSpoiler;
        this.onTapTimestamp = onTapTimestamp;
        this.onTapEmoji = onTapEmoji;
        this.animateEmoji = z10;
        this.shouldShowRoleDot = z11;
        this.shouldShowRoleOnName = z12;
        this.singleLine = z13;
        this.spoilerState = spoilerState;
        this.listNestedLevel = i10;
        this.listOrderedIndex = num;
        this.insets = insets;
        this.theme = theme;
        this.baselineHeight = f10;
        this.emojiSizeOverride = num2;
    }

    public static /* synthetic */ RenderContext copy$default(RenderContext renderContext, Context context, String str, Function1 function1, Function1 function12, Function1 function13, Function3 function3, Function4 function4, Function2 function2, Function1 function14, Function1 function15, Function0 function0, Function1 function16, Function1 function17, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerState spoilerState, int i10, Integer num, Insets insets, DiscordTheme discordTheme, float f10, Integer num2, int i11, Object obj) {
        return renderContext.copy((i11 & 1) != 0 ? renderContext.context : context, (i11 & 2) != 0 ? renderContext.containerId : str, (i11 & 4) != 0 ? renderContext.onTapLink : function1, (i11 & 8) != 0 ? renderContext.onLongTapLink : function12, (i11 & 16) != 0 ? renderContext.linkStyle : function13, (i11 & 32) != 0 ? renderContext.onTapChannel : function3, (i11 & 64) != 0 ? renderContext.onLongPressChannel : function4, (i11 & 128) != 0 ? renderContext.onTapMention : function2, (i11 & Spliterator.NONNULL) != 0 ? renderContext.onTapCommand : function14, (i11 & 512) != 0 ? renderContext.onLongPressCommand : function15, (i11 & Spliterator.IMMUTABLE) != 0 ? renderContext.onTapSpoiler : function0, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? renderContext.onTapTimestamp : function16, (i11 & 4096) != 0 ? renderContext.onTapEmoji : function17, (i11 & 8192) != 0 ? renderContext.animateEmoji : z10, (i11 & Spliterator.SUBSIZED) != 0 ? renderContext.shouldShowRoleDot : z11, (i11 & 32768) != 0 ? renderContext.shouldShowRoleOnName : z12, (i11 & 65536) != 0 ? renderContext.singleLine : z13, (i11 & 131072) != 0 ? renderContext.spoilerState : spoilerState, (i11 & 262144) != 0 ? renderContext.listNestedLevel : i10, (i11 & 524288) != 0 ? renderContext.listOrderedIndex : num, (i11 & 1048576) != 0 ? renderContext.insets : insets, (i11 & 2097152) != 0 ? renderContext.theme : discordTheme, (i11 & 4194304) != 0 ? renderContext.baselineHeight : f10, (i11 & 8388608) != 0 ? renderContext.emojiSizeOverride : num2);
    }

    public final Context component1() {
        return this.context;
    }

    public final Function1<CommandMentionContentNode, Unit> component10() {
        return this.onLongPressCommand;
    }

    public final Function0<Unit> component11() {
        return this.onTapSpoiler;
    }

    public final Function1<String, Unit> component12() {
        return this.onTapTimestamp;
    }

    public final Function1<EmojiContentNode, Unit> component13() {
        return this.onTapEmoji;
    }

    public final boolean component14() {
        return this.animateEmoji;
    }

    public final boolean component15() {
        return this.shouldShowRoleDot;
    }

    public final boolean component16() {
        return this.shouldShowRoleOnName;
    }

    public final boolean component17() {
        return this.singleLine;
    }

    public final SpoilerState component18() {
        return this.spoilerState;
    }

    public final int component19() {
        return this.listNestedLevel;
    }

    public final String component2() {
        return this.containerId;
    }

    public final Integer component20() {
        return this.listOrderedIndex;
    }

    public final Insets component21() {
        return this.insets;
    }

    public final DiscordTheme component22() {
        return this.theme;
    }

    public final float component23() {
        return this.baselineHeight;
    }

    public final Integer component24() {
        return this.emojiSizeOverride;
    }

    public final Function1<LinkContentNode, Unit> component3() {
        return this.onTapLink;
    }

    public final Function1<LinkContentNode, Unit> component4() {
        return this.onLongTapLink;
    }

    public final Function1<LinkContentNode, LinkStyle> component5() {
        return this.linkStyle;
    }

    public final Function3<String, String, String, Unit> component6() {
        return this.onTapChannel;
    }

    public final Function4<String, String, String, String, Unit> component7() {
        return this.onLongPressChannel;
    }

    public final Function2<String, String, Unit> component8() {
        return this.onTapMention;
    }

    public final Function1<CommandMentionContentNode, Unit> component9() {
        return this.onTapCommand;
    }

    public final RenderContext copy(Context context, String containerId, Function1<? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function1<? super LinkContentNode, LinkStyle> linkStyle, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerState spoilerState, int i10, Integer num, Insets insets, DiscordTheme theme, float f10, Integer num2) {
        q.g(context, "context");
        q.g(containerId, "containerId");
        q.g(onTapLink, "onTapLink");
        q.g(onLongTapLink, "onLongTapLink");
        q.g(linkStyle, "linkStyle");
        q.g(onTapChannel, "onTapChannel");
        q.g(onLongPressChannel, "onLongPressChannel");
        q.g(onTapMention, "onTapMention");
        q.g(onTapCommand, "onTapCommand");
        q.g(onLongPressCommand, "onLongPressCommand");
        q.g(onTapSpoiler, "onTapSpoiler");
        q.g(onTapTimestamp, "onTapTimestamp");
        q.g(onTapEmoji, "onTapEmoji");
        q.g(spoilerState, "spoilerState");
        q.g(insets, "insets");
        q.g(theme, "theme");
        return new RenderContext(context, containerId, onTapLink, onLongTapLink, linkStyle, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, z10, z11, z12, z13, spoilerState, i10, num, insets, theme, f10, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderContext)) {
            return false;
        }
        RenderContext renderContext = (RenderContext) obj;
        return q.b(this.context, renderContext.context) && q.b(this.containerId, renderContext.containerId) && q.b(this.onTapLink, renderContext.onTapLink) && q.b(this.onLongTapLink, renderContext.onLongTapLink) && q.b(this.linkStyle, renderContext.linkStyle) && q.b(this.onTapChannel, renderContext.onTapChannel) && q.b(this.onLongPressChannel, renderContext.onLongPressChannel) && q.b(this.onTapMention, renderContext.onTapMention) && q.b(this.onTapCommand, renderContext.onTapCommand) && q.b(this.onLongPressCommand, renderContext.onLongPressCommand) && q.b(this.onTapSpoiler, renderContext.onTapSpoiler) && q.b(this.onTapTimestamp, renderContext.onTapTimestamp) && q.b(this.onTapEmoji, renderContext.onTapEmoji) && this.animateEmoji == renderContext.animateEmoji && this.shouldShowRoleDot == renderContext.shouldShowRoleDot && this.shouldShowRoleOnName == renderContext.shouldShowRoleOnName && this.singleLine == renderContext.singleLine && this.spoilerState == renderContext.spoilerState && this.listNestedLevel == renderContext.listNestedLevel && q.b(this.listOrderedIndex, renderContext.listOrderedIndex) && q.b(this.insets, renderContext.insets) && q.b(this.theme, renderContext.theme) && Float.compare(this.baselineHeight, renderContext.baselineHeight) == 0 && q.b(this.emojiSizeOverride, renderContext.emojiSizeOverride);
    }

    public final boolean getAnimateEmoji() {
        return this.animateEmoji;
    }

    public final float getBaselineHeight() {
        return this.baselineHeight;
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Integer getEmojiSizeOverride() {
        return this.emojiSizeOverride;
    }

    public final Insets getInsets() {
        return this.insets;
    }

    public final Function1<LinkContentNode, LinkStyle> getLinkStyle() {
        return this.linkStyle;
    }

    public final int getListNestedLevel() {
        return this.listNestedLevel;
    }

    public final Integer getListOrderedIndex() {
        return this.listOrderedIndex;
    }

    public final Function4<String, String, String, String, Unit> getOnLongPressChannel() {
        return this.onLongPressChannel;
    }

    public final Function1<CommandMentionContentNode, Unit> getOnLongPressCommand() {
        return this.onLongPressCommand;
    }

    public final Function1<LinkContentNode, Unit> getOnLongTapLink() {
        return this.onLongTapLink;
    }

    public final Function3<String, String, String, Unit> getOnTapChannel() {
        return this.onTapChannel;
    }

    public final Function1<CommandMentionContentNode, Unit> getOnTapCommand() {
        return this.onTapCommand;
    }

    public final Function1<EmojiContentNode, Unit> getOnTapEmoji() {
        return this.onTapEmoji;
    }

    public final Function1<LinkContentNode, Unit> getOnTapLink() {
        return this.onTapLink;
    }

    public final Function2<String, String, Unit> getOnTapMention() {
        return this.onTapMention;
    }

    public final Function0<Unit> getOnTapSpoiler() {
        return this.onTapSpoiler;
    }

    public final Function1<String, Unit> getOnTapTimestamp() {
        return this.onTapTimestamp;
    }

    public final boolean getShouldShowRoleDot() {
        return this.shouldShowRoleDot;
    }

    public final boolean getShouldShowRoleOnName() {
        return this.shouldShowRoleOnName;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final SpoilerState getSpoilerState() {
        return this.spoilerState;
    }

    public final DiscordTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.context.hashCode() * 31) + this.containerId.hashCode()) * 31) + this.onTapLink.hashCode()) * 31) + this.onLongTapLink.hashCode()) * 31) + this.linkStyle.hashCode()) * 31) + this.onTapChannel.hashCode()) * 31) + this.onLongPressChannel.hashCode()) * 31) + this.onTapMention.hashCode()) * 31) + this.onTapCommand.hashCode()) * 31) + this.onLongPressCommand.hashCode()) * 31) + this.onTapSpoiler.hashCode()) * 31) + this.onTapTimestamp.hashCode()) * 31) + this.onTapEmoji.hashCode()) * 31;
        boolean z10 = this.animateEmoji;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        int i14 = (hashCode + i11) * 31;
        boolean z11 = this.shouldShowRoleDot;
        if (z11) {
            z11 = true;
        }
        int i15 = z11 ? 1 : 0;
        int i16 = z11 ? 1 : 0;
        int i17 = z11 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z12 = this.shouldShowRoleOnName;
        if (z12) {
            z12 = true;
        }
        int i19 = z12 ? 1 : 0;
        int i20 = z12 ? 1 : 0;
        int i21 = z12 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z13 = this.singleLine;
        if (!z13) {
            i10 = z13 ? 1 : 0;
        }
        int hashCode2 = (((((i22 + i10) * 31) + this.spoilerState.hashCode()) * 31) + this.listNestedLevel) * 31;
        Integer num = this.listOrderedIndex;
        int i23 = 0;
        int hashCode3 = (((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.insets.hashCode()) * 31) + this.theme.hashCode()) * 31) + Float.floatToIntBits(this.baselineHeight)) * 31;
        Integer num2 = this.emojiSizeOverride;
        if (num2 != null) {
            i23 = num2.hashCode();
        }
        return hashCode3 + i23;
    }

    public final boolean spoilerExists() {
        return this.spoilerState != SpoilerState.None;
    }

    public final boolean spoilerIsHidden() {
        return this.spoilerState == SpoilerState.Hidden;
    }

    public final boolean spoilerIsRevealed() {
        return this.spoilerState == SpoilerState.Revealed;
    }

    public String toString() {
        Context context = this.context;
        String str = this.containerId;
        Function1<LinkContentNode, Unit> function1 = this.onTapLink;
        Function1<LinkContentNode, Unit> function12 = this.onLongTapLink;
        Function1<LinkContentNode, LinkStyle> function13 = this.linkStyle;
        Function3<String, String, String, Unit> function3 = this.onTapChannel;
        Function4<String, String, String, String, Unit> function4 = this.onLongPressChannel;
        Function2<String, String, Unit> function2 = this.onTapMention;
        Function1<CommandMentionContentNode, Unit> function14 = this.onTapCommand;
        Function1<CommandMentionContentNode, Unit> function15 = this.onLongPressCommand;
        Function0<Unit> function0 = this.onTapSpoiler;
        Function1<String, Unit> function16 = this.onTapTimestamp;
        Function1<EmojiContentNode, Unit> function17 = this.onTapEmoji;
        boolean z10 = this.animateEmoji;
        boolean z11 = this.shouldShowRoleDot;
        boolean z12 = this.shouldShowRoleOnName;
        boolean z13 = this.singleLine;
        SpoilerState spoilerState = this.spoilerState;
        int i10 = this.listNestedLevel;
        Integer num = this.listOrderedIndex;
        Insets insets = this.insets;
        DiscordTheme discordTheme = this.theme;
        float f10 = this.baselineHeight;
        Integer num2 = this.emojiSizeOverride;
        return "RenderContext(context=" + context + ", containerId=" + str + ", onTapLink=" + function1 + ", onLongTapLink=" + function12 + ", linkStyle=" + function13 + ", onTapChannel=" + function3 + ", onLongPressChannel=" + function4 + ", onTapMention=" + function2 + ", onTapCommand=" + function14 + ", onLongPressCommand=" + function15 + ", onTapSpoiler=" + function0 + ", onTapTimestamp=" + function16 + ", onTapEmoji=" + function17 + ", animateEmoji=" + z10 + ", shouldShowRoleDot=" + z11 + ", shouldShowRoleOnName=" + z12 + ", singleLine=" + z13 + ", spoilerState=" + spoilerState + ", listNestedLevel=" + i10 + ", listOrderedIndex=" + num + ", insets=" + insets + ", theme=" + discordTheme + ", baselineHeight=" + f10 + ", emojiSizeOverride=" + num2 + ")";
    }

    public final RenderContext updateInsets(Function1<? super Insets, Insets> update) {
        q.g(update, "update");
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, update.invoke(this.insets), null, 0.0f, null, 15728639, null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "", ViewProps.TOP, "", ViewProps.BOTTOM, ViewProps.START, ViewProps.END, "(IIII)V", "getBottom", "()I", "getEnd", "getStart", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Insets {
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public Insets() {
            this(0, 0, 0, 0, 15, null);
        }

        public Insets(int i10, int i11, int i12, int i13) {
            this.top = i10;
            this.bottom = i11;
            this.start = i12;
            this.end = i13;
        }

        public static /* synthetic */ Insets copy$default(Insets insets, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = insets.top;
            }
            if ((i14 & 2) != 0) {
                i11 = insets.bottom;
            }
            if ((i14 & 4) != 0) {
                i12 = insets.start;
            }
            if ((i14 & 8) != 0) {
                i13 = insets.end;
            }
            return insets.copy(i10, i11, i12, i13);
        }

        public final int component1() {
            return this.top;
        }

        public final int component2() {
            return this.bottom;
        }

        public final int component3() {
            return this.start;
        }

        public final int component4() {
            return this.end;
        }

        public final Insets copy(int i10, int i11, int i12, int i13) {
            return new Insets(i10, i11, i12, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insets)) {
                return false;
            }
            Insets insets = (Insets) obj;
            return this.top == insets.top && this.bottom == insets.bottom && this.start == insets.start && this.end == insets.end;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return (((((this.top * 31) + this.bottom) * 31) + this.start) * 31) + this.end;
        }

        public String toString() {
            int i10 = this.top;
            int i11 = this.bottom;
            int i12 = this.start;
            int i13 = this.end;
            return "Insets(top=" + i10 + ", bottom=" + i11 + ", start=" + i12 + ", end=" + i13 + ")";
        }

        public /* synthetic */ Insets(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        }
    }

    public /* synthetic */ RenderContext(Context context, String str, Function1 function1, Function1 function12, Function1 function13, Function3 function3, Function4 function4, Function2 function2, Function1 function14, Function1 function15, Function0 function0, Function1 function16, Function1 function17, boolean z10, boolean z11, boolean z12, boolean z13, SpoilerState spoilerState, int i10, Integer num, Insets insets, DiscordTheme discordTheme, float f10, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, function1, function12, function13, function3, function4, function2, function14, function15, function0, function16, function17, z10, z11, z12, z13, (i11 & 131072) != 0 ? SpoilerState.None : spoilerState, (i11 & 262144) != 0 ? 0 : i10, (i11 & 524288) != 0 ? null : num, (i11 & 1048576) != 0 ? new Insets(0, 0, 0, 0, 15, null) : insets, discordTheme, (i11 & 4194304) != 0 ? -1.0f : f10, (i11 & 8388608) != 0 ? null : num2);
    }
}
