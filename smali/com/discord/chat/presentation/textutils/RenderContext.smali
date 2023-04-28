.class public final Lcom/discord/chat/presentation/textutils/RenderContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/textutils/RenderContext$Insets;,
        Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008X\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\u0085\u0003\u0012\u0006\u00102\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\u000c\u0012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002\u0012\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u0014\u0012*\u00108\u001a&\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u0016\u0012\u0018\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u0018\u0012\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001d\u0012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002\u0012\u0006\u0010?\u001a\u00020\u0006\u0012\u0006\u0010@\u001a\u00020\u0006\u0012\u0006\u0010A\u001a\u00020\u0006\u0012\u0006\u0010B\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010C\u001a\u00020&\u0012\u0008\u0008\u0002\u0010D\u001a\u00020(\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010(\u0012\u0008\u0008\u0002\u0010F\u001a\u00020\u0003\u0012\u0006\u0010G\u001a\u00020-\u0012\u0008\u0008\u0002\u0010H\u001a\u00020/\u0012\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010(\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u0008\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0002H\u00c6\u0003J%\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u0014H\u00c6\u0003J-\u0010\u0017\u001a&\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u0016H\u00c6\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u0018H\u00c6\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\u000f\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001dH\u00c6\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u0002H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\'\u001a\u00020&H\u00c6\u0003J\t\u0010)\u001a\u00020(H\u00c6\u0003J\u0012\u0010*\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020-H\u00c6\u0003J\t\u00100\u001a\u00020/H\u00c6\u0003J\u0012\u00101\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010+J\u00b0\u0003\u0010J\u001a\u00020\u00002\u0008\u0008\u0002\u00102\u001a\u00020\n2\u0008\u0008\u0002\u00103\u001a\u00020\u000c2\u0014\u0008\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\u0008\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\u0008\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00022$\u0008\u0002\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u00142,\u0008\u0002\u00108\u001a&\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u00162\u001a\u0008\u0002\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u00182\u0014\u0008\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\u0008\u0002\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00022\u000e\u0008\u0002\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001d2\u0014\u0008\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u00022\u0014\u0008\u0002\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00022\u0008\u0008\u0002\u0010?\u001a\u00020\u00062\u0008\u0008\u0002\u0010@\u001a\u00020\u00062\u0008\u0008\u0002\u0010A\u001a\u00020\u00062\u0008\u0008\u0002\u0010B\u001a\u00020\u00062\u0008\u0008\u0002\u0010C\u001a\u00020&2\u0008\u0008\u0002\u0010D\u001a\u00020(2\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010(2\u0008\u0008\u0002\u0010F\u001a\u00020\u00032\u0008\u0008\u0002\u0010G\u001a\u00020-2\u0008\u0008\u0002\u0010H\u001a\u00020/2\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010(H\u00c6\u0001\u00a2\u0006\u0004\u0008J\u0010KJ\t\u0010L\u001a\u00020\u000cH\u00d6\u0001J\t\u0010M\u001a\u00020(H\u00d6\u0001J\u0013\u0010O\u001a\u00020\u00062\u0008\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u00102\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u0010P\u001a\u0004\u0008Q\u0010RR\u0017\u00103\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010S\u001a\u0004\u0008T\u0010UR#\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010V\u001a\u0004\u0008W\u0010XR#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010V\u001a\u0004\u0008Y\u0010XR#\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010V\u001a\u0004\u0008Z\u0010XR3\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u00148\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010[\u001a\u0004\u0008\\\u0010]R;\u00108\u001a&\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000f0\u00168\u0006\u00a2\u0006\u000c\n\u0004\u00088\u0010^\u001a\u0004\u0008_\u0010`R)\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u00188\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010a\u001a\u0004\u0008b\u0010cR#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010V\u001a\u0004\u0008d\u0010XR#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008;\u0010V\u001a\u0004\u0008e\u0010XR\u001d\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010f\u001a\u0004\u0008g\u0010hR#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010V\u001a\u0004\u0008i\u0010XR#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010V\u001a\u0004\u0008j\u0010XR\u0017\u0010?\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010k\u001a\u0004\u0008l\u0010mR\u0017\u0010@\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010k\u001a\u0004\u0008n\u0010mR\u0017\u0010A\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010k\u001a\u0004\u0008o\u0010mR\u0017\u0010B\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008B\u0010k\u001a\u0004\u0008p\u0010mR\u0017\u0010C\u001a\u00020&8\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010q\u001a\u0004\u0008r\u0010sR\u0017\u0010D\u001a\u00020(8\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010t\u001a\u0004\u0008u\u0010vR\u0019\u0010E\u001a\u0004\u0018\u00010(8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010w\u001a\u0004\u0008x\u0010+R\u0017\u0010F\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010y\u001a\u0004\u0008z\u0010{R\u0017\u0010G\u001a\u00020-8\u0006\u00a2\u0006\u000c\n\u0004\u0008G\u0010|\u001a\u0004\u0008}\u0010~R\u0019\u0010H\u001a\u00020/8\u0006\u00a2\u0006\u000e\n\u0004\u0008H\u0010\u007f\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u001a\u0010I\u001a\u0004\u0018\u00010(8\u0006\u00a2\u0006\r\n\u0004\u0008I\u0010w\u001a\u0005\u0008\u0082\u0001\u0010+\u00a8\u0006\u0087\u0001"
    }
    d2 = {
        "Lcom/discord/chat/presentation/textutils/RenderContext;",
        "",
        "Lkotlin/Function1;",
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        "update",
        "updateInsets",
        "",
        "spoilerExists",
        "spoilerIsHidden",
        "spoilerIsRevealed",
        "Landroid/content/Context;",
        "component1",
        "",
        "component2",
        "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
        "",
        "component3",
        "component4",
        "Lcom/discord/chat/presentation/textutils/LinkStyle;",
        "component5",
        "Lkotlin/Function3;",
        "component6",
        "Lkotlin/Function4;",
        "component7",
        "Lkotlin/Function2;",
        "component8",
        "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
        "component9",
        "component10",
        "Lkotlin/Function0;",
        "component11",
        "component12",
        "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;",
        "component18",
        "",
        "component19",
        "component20",
        "()Ljava/lang/Integer;",
        "component21",
        "Lcom/discord/theme/DiscordTheme;",
        "component22",
        "",
        "component23",
        "component24",
        "context",
        "containerId",
        "onTapLink",
        "onLongTapLink",
        "linkStyle",
        "onTapChannel",
        "onLongPressChannel",
        "onTapMention",
        "onTapCommand",
        "onLongPressCommand",
        "onTapSpoiler",
        "onTapTimestamp",
        "onTapEmoji",
        "animateEmoji",
        "shouldShowRoleDot",
        "shouldShowRoleOnName",
        "singleLine",
        "spoilerState",
        "listNestedLevel",
        "listOrderedIndex",
        "insets",
        "theme",
        "baselineHeight",
        "emojiSizeOverride",
        "copy",
        "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)Lcom/discord/chat/presentation/textutils/RenderContext;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "Ljava/lang/String;",
        "getContainerId",
        "()Ljava/lang/String;",
        "Lkotlin/jvm/functions/Function1;",
        "getOnTapLink",
        "()Lkotlin/jvm/functions/Function1;",
        "getOnLongTapLink",
        "getLinkStyle",
        "Lkotlin/jvm/functions/Function3;",
        "getOnTapChannel",
        "()Lkotlin/jvm/functions/Function3;",
        "Lkotlin/jvm/functions/Function4;",
        "getOnLongPressChannel",
        "()Lkotlin/jvm/functions/Function4;",
        "Lkotlin/jvm/functions/Function2;",
        "getOnTapMention",
        "()Lkotlin/jvm/functions/Function2;",
        "getOnTapCommand",
        "getOnLongPressCommand",
        "Lkotlin/jvm/functions/Function0;",
        "getOnTapSpoiler",
        "()Lkotlin/jvm/functions/Function0;",
        "getOnTapTimestamp",
        "getOnTapEmoji",
        "Z",
        "getAnimateEmoji",
        "()Z",
        "getShouldShowRoleDot",
        "getShouldShowRoleOnName",
        "getSingleLine",
        "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;",
        "getSpoilerState",
        "()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;",
        "I",
        "getListNestedLevel",
        "()I",
        "Ljava/lang/Integer;",
        "getListOrderedIndex",
        "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        "getInsets",
        "()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
        "Lcom/discord/theme/DiscordTheme;",
        "getTheme",
        "()Lcom/discord/theme/DiscordTheme;",
        "F",
        "getBaselineHeight",
        "()F",
        "getEmojiSizeOverride",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V",
        "Insets",
        "SpoilerState",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final animateEmoji:Z

.field private final baselineHeight:F

.field private final containerId:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private final emojiSizeOverride:Ljava/lang/Integer;

.field private final insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

.field private final linkStyle:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;"
        }
    .end annotation
.end field

.field private final listNestedLevel:I

.field private final listOrderedIndex:Ljava/lang/Integer;

.field private final onLongPressChannel:Lkotlin/jvm/functions/Function4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onLongPressCommand:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onLongTapLink:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapChannel:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapCommand:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapEmoji:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapLink:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapMention:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapSpoiler:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onTapTimestamp:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldShowRoleDot:Z

.field private final shouldShowRoleOnName:Z

.field private final singleLine:Z

.field private final spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

.field private final theme:Lcom/discord/theme/DiscordTheme;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;ZZZZ",
            "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;",
            "I",
            "Ljava/lang/Integer;",
            "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
            "Lcom/discord/theme/DiscordTheme;",
            "F",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p18

    move-object/from16 v15, p21

    move-object/from16 v0, p22

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapLink"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongTapLink"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyle"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapChannel"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressChannel"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapMention"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapCommand"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressCommand"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapSpoiler"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapTimestamp"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapEmoji"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spoilerState"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    .line 3
    iput-object v2, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    .line 4
    iput-object v3, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object v4, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object v5, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    .line 7
    iput-object v6, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    .line 8
    iput-object v7, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    .line 9
    iput-object v8, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    .line 10
    iput-object v9, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    .line 11
    iput-object v10, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    .line 12
    iput-object v11, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    .line 13
    iput-object v12, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    .line 14
    iput-object v13, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    move/from16 v1, p14

    .line 15
    iput-boolean v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    move/from16 v1, p15

    .line 16
    iput-boolean v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    move/from16 v1, p16

    .line 17
    iput-boolean v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    move/from16 v1, p17

    .line 18
    iput-boolean v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    .line 19
    iput-object v14, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    move/from16 v1, p19

    .line 20
    iput v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    .line 23
    iput-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    move/from16 v1, p23

    .line 24
    iput v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    move-object/from16 v1, p24

    .line 25
    iput-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    const/high16 v0, 0x20000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->None:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    move-object/from16 v19, v0

    goto :goto_0

    :cond_0
    move-object/from16 v19, p18

    :goto_0
    const/high16 v0, 0x40000

    and-int v0, p25, v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move/from16 v20, v0

    goto :goto_1

    :cond_1
    move/from16 v20, p19

    :goto_1
    const/high16 v0, 0x80000

    and-int v0, p25, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object/from16 v21, v1

    goto :goto_2

    :cond_2
    move-object/from16 v21, p20

    :goto_2
    const/high16 v0, 0x100000

    and-int v0, p25, v0

    if-eqz v0, :cond_3

    .line 27
    new-instance v0, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v0

    goto :goto_3

    :cond_3
    move-object/from16 v22, p21

    :goto_3
    const/high16 v0, 0x400000

    and-int v0, p25, v0

    if-eqz v0, :cond_4

    const/high16 v0, -0x40800000    # -1.0f

    move/from16 v24, v0

    goto :goto_4

    :cond_4
    move/from16 v24, p23

    :goto_4
    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_5

    move-object/from16 v25, v1

    goto :goto_5

    :cond_5
    move-object/from16 v25, p24

    :goto_5
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v23, p22

    .line 28
    invoke-direct/range {v1 .. v25}, Lcom/discord/chat/presentation/textutils/RenderContext;-><init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;ILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p15, v15

    if-eqz v16, :cond_f

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p16, v15

    if-eqz v16, :cond_10

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    goto :goto_10

    :cond_10
    move/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    goto :goto_12

    :cond_12
    move/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    goto :goto_16

    :cond_16
    move/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v1, v1, v16

    if-eqz v1, :cond_17

    iget-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p23, v15

    move-object/from16 p24, v1

    invoke-virtual/range {p0 .. p24}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)Lcom/discord/chat/presentation/textutils/RenderContext;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final component10()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component11()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final component12()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component13()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    return v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    return v0
.end method

.method public final component18()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component21()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    return-object v0
.end method

.method public final component22()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public final component23()F
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    return v0
.end method

.method public final component24()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component4()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component5()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component6()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final component7()Lkotlin/jvm/functions/Function4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public final component8()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final component9()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final copy(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)Lcom/discord/chat/presentation/textutils/RenderContext;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;ZZZZ",
            "Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;",
            "I",
            "Ljava/lang/Integer;",
            "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
            "Lcom/discord/theme/DiscordTheme;",
            "F",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/discord/chat/presentation/textutils/RenderContext;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move/from16 v23, p23

    move-object/from16 v24, p24

    const-string v0, "context"

    move-object/from16 v25, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerId"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapLink"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongTapLink"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStyle"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapChannel"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressChannel"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapMention"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapCommand"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPressCommand"

    move-object/from16 v1, p10

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapSpoiler"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapTimestamp"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTapEmoji"

    move-object/from16 v1, p13

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spoilerState"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "insets"

    move-object/from16 v1, p21

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v1, p22

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v26, Lcom/discord/chat/presentation/textutils/RenderContext;

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-direct/range {v0 .. v24}, Lcom/discord/chat/presentation/textutils/RenderContext;-><init>(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;)V

    return-object v26
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/textutils/RenderContext;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/textutils/RenderContext;

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    iget-boolean v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    iget v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    iget-object v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    iget v3, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getAnimateEmoji()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    return v0
.end method

.method public final getBaselineHeight()F
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    return v0
.end method

.method public final getContainerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getEmojiSizeOverride()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getInsets()Lcom/discord/chat/presentation/textutils/RenderContext$Insets;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    return-object v0
.end method

.method public final getLinkStyle()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lcom/discord/chat/presentation/textutils/LinkStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getListNestedLevel()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    return v0
.end method

.method public final getListOrderedIndex()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getOnLongPressChannel()Lkotlin/jvm/functions/Function4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public final getOnLongPressCommand()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnLongTapLink()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnTapChannel()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final getOnTapCommand()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnTapEmoji()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnTapLink()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/discord/chat/bridge/contentnode/LinkContentNode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnTapMention()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getOnTapSpoiler()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getOnTapTimestamp()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getShouldShowRoleDot()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    return v0
.end method

.method public final getShouldShowRoleOnName()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    return v0
.end method

.method public final getSingleLine()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    return v0
.end method

.method public final getSpoilerState()Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    return-object v0
.end method

.method public final getTheme()Lcom/discord/theme/DiscordTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    if-eqz v1, :cond_2

    move v1, v2

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    invoke-virtual {v1}, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final spoilerExists()Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    sget-object v1, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->None:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final spoilerIsHidden()Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    sget-object v1, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->Hidden:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final spoilerIsRevealed()Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    sget-object v1, Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;->Revealed:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->context:Landroid/content/Context;

    iget-object v2, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->containerId:Ljava/lang/String;

    iget-object v3, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapLink:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongTapLink:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->linkStyle:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapChannel:Lkotlin/jvm/functions/Function3;

    iget-object v7, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressChannel:Lkotlin/jvm/functions/Function4;

    iget-object v8, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapMention:Lkotlin/jvm/functions/Function2;

    iget-object v9, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapCommand:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onLongPressCommand:Lkotlin/jvm/functions/Function1;

    iget-object v11, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapSpoiler:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapTimestamp:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->onTapEmoji:Lkotlin/jvm/functions/Function1;

    iget-boolean v14, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->animateEmoji:Z

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleDot:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->shouldShowRoleOnName:Z

    move/from16 v17, v15

    iget-boolean v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->singleLine:Z

    move/from16 v18, v15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->spoilerState:Lcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;

    move-object/from16 v19, v15

    iget v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listNestedLevel:I

    move/from16 v20, v15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->listOrderedIndex:Ljava/lang/Integer;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->theme:Lcom/discord/theme/DiscordTheme;

    move-object/from16 v23, v15

    iget v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->baselineHeight:F

    move/from16 v24, v15

    iget-object v15, v0, Lcom/discord/chat/presentation/textutils/RenderContext;->emojiSizeOverride:Ljava/lang/Integer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v25, v15

    const-string v15, "RenderContext(context="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", containerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onLongTapLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onLongPressChannel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapMention="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapCommand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onLongPressCommand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapSpoiler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTapEmoji="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animateEmoji="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleDot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", shouldShowRoleOnName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", singleLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", spoilerState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listNestedLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", listOrderedIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", insets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", baselineHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", emojiSizeOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final updateInsets(Lkotlin/jvm/functions/Function1;)Lcom/discord/chat/presentation/textutils/RenderContext;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
            "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;",
            ">;)",
            "Lcom/discord/chat/presentation/textutils/RenderContext;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    const-string v2, "update"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x0

    .line 20
    const/4 v12, 0x0

    .line 21
    const/4 v13, 0x0

    .line 22
    const/4 v14, 0x0

    .line 23
    const/4 v15, 0x0

    .line 24
    const/16 v16, 0x0

    .line 25
    .line 26
    const/16 v17, 0x0

    .line 27
    .line 28
    const/16 v18, 0x0

    .line 29
    .line 30
    const/16 v19, 0x0

    .line 31
    .line 32
    const/16 v20, 0x0

    .line 33
    .line 34
    const/16 v21, 0x0

    .line 35
    .line 36
    move-object/from16 v2, p0

    .line 37
    .line 38
    iget-object v3, v2, Lcom/discord/chat/presentation/textutils/RenderContext;->insets:Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    .line 39
    .line 40
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    move-object/from16 v22, v0

    .line 45
    .line 46
    check-cast v22, Lcom/discord/chat/presentation/textutils/RenderContext$Insets;

    .line 47
    .line 48
    const/16 v23, 0x0

    .line 49
    .line 50
    const/16 v24, 0x0

    .line 51
    .line 52
    const/16 v25, 0x0

    .line 53
    .line 54
    const v26, 0xefffff

    .line 55
    .line 56
    .line 57
    const/16 v27, 0x0

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static/range {v1 .. v27}, Lcom/discord/chat/presentation/textutils/RenderContext;->copy$default(Lcom/discord/chat/presentation/textutils/RenderContext;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZZZLcom/discord/chat/presentation/textutils/RenderContext$SpoilerState;ILjava/lang/Integer;Lcom/discord/chat/presentation/textutils/RenderContext$Insets;Lcom/discord/theme/DiscordTheme;FLjava/lang/Integer;ILjava/lang/Object;)Lcom/discord/chat/presentation/textutils/RenderContext;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method
