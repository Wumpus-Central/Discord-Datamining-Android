.class public final Lcom/discord/chat/bridge/row/MessageRow;
.super Lcom/discord/chat/bridge/row/Row;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/row/MessageRow$$serializer;,
        Lcom/discord/chat/bridge/row/MessageRow$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008:\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 f2\u00020\u0001:\u0002efB\u00d1\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0008\u0012\u0006\u0010\u0016\u001a\u00020\u0008\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0008\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010!B\u00d7\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\"J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010H\u001a\u00020\u0008H\u00c6\u0003J\t\u0010I\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010<J\u000b\u0010L\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\t\u0010N\u001a\u00020\u0008H\u00c6\u0003J\t\u0010O\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\t\u0010R\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010T\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u0010\u0010U\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010V\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u00e6\u0001\u0010W\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00082\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00082\u0008\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00d6\u0001J\t\u0010]\u001a\u00020\u0010H\u00d6\u0001J!\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u00c7\u0001R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010$R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008,\u0010(R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u001e\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u00081\u0010(R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0011\u0010\u0015\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u00100R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u00084\u0010(R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010=\u001a\u0004\u0008;\u0010<R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0011\u0010\u0016\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u00100R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\u0008A\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010C\u00a8\u0006g"
    }
    d2 = {
        "Lcom/discord/chat/bridge/row/MessageRow;",
        "Lcom/discord/chat/bridge/row/Row;",
        "seen1",
        "",
        "index",
        "changeType",
        "Lcom/discord/chat/bridge/ChangeType;",
        "jumped",
        "",
        "highlightJumpedOnceOnly",
        "message",
        "Lcom/discord/chat/bridge/MessageBase;",
        "scrollTo",
        "animated",
        "canAddNewReactions",
        "addReactionLabel",
        "",
        "addNewReactionAccessibilityLabel",
        "addNewBurstReactionAccessibilityLabel",
        "reactionsTheme",
        "Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "isHighlight",
        "renderContentOnly",
        "messageFrame",
        "Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "reactTag",
        "truncation",
        "Lcom/discord/chat/bridge/truncation/Truncation;",
        "backgroundHighlight",
        "Lcom/discord/chat/bridge/BackgroundHighlight;",
        "enableSwipeToReply",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)V",
        "getAddNewBurstReactionAccessibilityLabel",
        "()Ljava/lang/String;",
        "getAddNewReactionAccessibilityLabel",
        "getAddReactionLabel",
        "getAnimated",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getBackgroundHighlight",
        "()Lcom/discord/chat/bridge/BackgroundHighlight;",
        "getCanAddNewReactions",
        "getChangeType",
        "()Lcom/discord/chat/bridge/ChangeType;",
        "getEnableSwipeToReply",
        "()Z",
        "getHighlightJumpedOnceOnly",
        "getIndex",
        "()I",
        "getJumped",
        "getMessage$annotations",
        "()V",
        "getMessage",
        "()Lcom/discord/chat/bridge/MessageBase;",
        "getMessageFrame",
        "()Lcom/discord/chat/bridge/messageframe/MessageFrame;",
        "getReactTag",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getReactionsTheme",
        "()Lcom/discord/chat/bridge/reaction/ReactionsTheme;",
        "getRenderContentOnly",
        "getScrollTo",
        "getTruncation",
        "()Lcom/discord/chat/bridge/truncation/Truncation;",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)Lcom/discord/chat/bridge/row/MessageRow;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/row/MessageRow$Companion;


# instance fields
.field private final addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

.field private final addNewReactionAccessibilityLabel:Ljava/lang/String;

.field private final addReactionLabel:Ljava/lang/String;

.field private final animated:Ljava/lang/Boolean;

.field private final backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

.field private final canAddNewReactions:Ljava/lang/Boolean;

.field private final changeType:Lcom/discord/chat/bridge/ChangeType;

.field private final enableSwipeToReply:Z

.field private final highlightJumpedOnceOnly:Ljava/lang/Boolean;

.field private final index:I

.field private final isHighlight:Z

.field private final jumped:Ljava/lang/Boolean;

.field private final message:Lcom/discord/chat/bridge/MessageBase;

.field private final messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

.field private final reactTag:Ljava/lang/Integer;

.field private final reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

.field private final renderContentOnly:Z

.field private final scrollTo:Ljava/lang/Boolean;

.field private final truncation:Lcom/discord/chat/bridge/truncation/Truncation;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/row/MessageRow$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/row/MessageRow$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/row/MessageRow;->Companion:Lcom/discord/chat/bridge/row/MessageRow$Companion;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 5
    .param p6    # Lcom/discord/chat/bridge/MessageBase;
        .annotation runtime Lwi/f;
            with = Lcom/discord/chat/bridge/row/MessageSerializer;
        .end annotation
    .end param

    move-object v0, p0

    move v1, p1

    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x13

    if-eq v3, v2, :cond_0

    .line 1
    sget-object v2, Lcom/discord/chat/bridge/row/MessageRow$$serializer;->INSTANCE:Lcom/discord/chat/bridge/row/MessageRow$$serializer;

    invoke-virtual {v2}, Lcom/discord/chat/bridge/row/MessageRow$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v2

    invoke-static {p1, v3, v2}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/discord/chat/bridge/row/Row;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v3, p2

    iput v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->index:I

    move-object v3, p3

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    and-int/lit8 v3, v1, 0x4

    if-nez v3, :cond_1

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    move-object v3, p4

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    :goto_0
    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_2

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    move-object v3, p5

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    :goto_1
    move-object v3, p6

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    and-int/lit8 v3, v1, 0x20

    if-nez v3, :cond_3

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    move-object v3, p7

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    :goto_2
    and-int/lit8 v3, v1, 0x40

    if-nez v3, :cond_4

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    move-object v3, p8

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    :goto_3
    and-int/lit16 v3, v1, 0x80

    if-nez v3, :cond_5

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    goto :goto_4

    :cond_5
    move-object v3, p9

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    :goto_4
    and-int/lit16 v3, v1, 0x100

    if-nez v3, :cond_6

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object v3, p10

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    :goto_5
    and-int/lit16 v3, v1, 0x200

    if-nez v3, :cond_7

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v3, p11

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    :goto_6
    and-int/lit16 v3, v1, 0x400

    if-nez v3, :cond_8

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    :goto_7
    and-int/lit16 v3, v1, 0x800

    if-nez v3, :cond_9

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    goto :goto_8

    :cond_9
    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    :goto_8
    and-int/lit16 v3, v1, 0x1000

    const/4 v4, 0x0

    if-nez v3, :cond_a

    iput-boolean v4, v0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    goto :goto_9

    :cond_a
    move/from16 v3, p14

    iput-boolean v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    :goto_9
    and-int/lit16 v3, v1, 0x2000

    if-nez v3, :cond_b

    iput-boolean v4, v0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    goto :goto_a

    :cond_b
    move/from16 v3, p15

    iput-boolean v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    :goto_a
    and-int/lit16 v3, v1, 0x4000

    if-nez v3, :cond_c

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    goto :goto_b

    :cond_c
    move-object/from16 v3, p16

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    :goto_b
    const v3, 0x8000

    and-int/2addr v3, v1

    if-nez v3, :cond_d

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    goto :goto_c

    :cond_d
    move-object/from16 v3, p17

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    :goto_c
    const/high16 v3, 0x10000

    and-int/2addr v3, v1

    if-nez v3, :cond_e

    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    goto :goto_d

    :cond_e
    move-object/from16 v3, p18

    iput-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    :goto_d
    const/high16 v3, 0x20000

    and-int/2addr v3, v1

    if-nez v3, :cond_f

    goto :goto_e

    :cond_f
    move-object/from16 v2, p19

    :goto_e
    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-nez v1, :cond_10

    iput-boolean v4, v0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    goto :goto_f

    :cond_10
    move/from16 v1, p20

    iput-boolean v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    :goto_f
    return-void
.end method

.method public constructor <init>(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)V
    .locals 4

    move-object v0, p0

    move-object v1, p2

    move-object v2, p5

    const-string v3, "changeType"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "message"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 3
    invoke-direct {p0, v3}, Lcom/discord/chat/bridge/row/Row;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v3, p1

    .line 4
    iput v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->index:I

    .line 5
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    move-object v1, p3

    .line 6
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    move-object v1, p4

    .line 7
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    .line 8
    iput-object v2, v0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    move-object v1, p6

    .line 9
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    move-object v1, p7

    .line 10
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    move-object v1, p8

    .line 11
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    move-object v1, p9

    .line 12
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    move-object v1, p10

    .line 13
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    move-object v1, p11

    .line 14
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    move-object/from16 v1, p12

    .line 15
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    move/from16 v1, p13

    .line 16
    iput-boolean v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    move/from16 v1, p14

    .line 17
    iput-boolean v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    move-object/from16 v1, p15

    .line 18
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    move-object/from16 v1, p16

    .line 19
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    move-object/from16 v1, p17

    .line 20
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    move-object/from16 v1, p18

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    move/from16 v1, p19

    .line 22
    iput-boolean v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    const/4 v3, 0x0

    if-eqz v1, :cond_9

    move/from16 v16, v3

    goto :goto_9

    :cond_9
    move/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    move/from16 v17, v3

    goto :goto_a

    :cond_a
    move/from16 v17, p14

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_b

    move-object/from16 v18, v2

    goto :goto_b

    :cond_b
    move-object/from16 v18, p15

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v19, v2

    goto :goto_c

    :cond_c
    move-object/from16 v19, p16

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v20, v2

    goto :goto_d

    :cond_d
    move-object/from16 v20, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v2

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_f

    move/from16 v22, v3

    goto :goto_f

    :cond_f
    move/from16 v22, p19

    :goto_f
    move-object/from16 v3, p0

    move/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v8, p5

    .line 2
    invoke-direct/range {v3 .. v22}, Lcom/discord/chat/bridge/row/MessageRow;-><init>(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/row/MessageRow;ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;ZILjava/lang/Object;)Lcom/discord/chat/bridge/row/MessageRow;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v2

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v1, v1, v16

    if-eqz v1, :cond_12

    iget-boolean v1, v0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    move/from16 p1, v2

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

    move/from16 p13, v14

    move-object/from16 p18, v15

    move/from16 p19, v1

    invoke-virtual/range {p0 .. p19}, Lcom/discord/chat/bridge/row/MessageRow;->copy(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)Lcom/discord/chat/bridge/row/MessageRow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getMessage$annotations()V
    .locals 0
    .annotation runtime Lwi/f;
        with = Lcom/discord/chat/bridge/row/MessageSerializer;
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/row/MessageRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5

    .line 1
    const-string v0, "self"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "output"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serialDesc"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->w(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lcom/discord/chat/bridge/ChangeType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/ChangeType$Serializer;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-interface {p1, p2, v3, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    :goto_0
    move v2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v2, v1

    .line 49
    :goto_1
    if-eqz v2, :cond_2

    .line 50
    .line 51
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 52
    .line 53
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    const/4 v0, 0x3

    .line 59
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    :goto_2
    move v2, v3

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move v2, v1

    .line 73
    :goto_3
    if-eqz v2, :cond_5

    .line 74
    .line 75
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 76
    .line 77
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    sget-object v0, Lcom/discord/chat/bridge/row/MessageSerializer;->INSTANCE:Lcom/discord/chat/bridge/row/MessageSerializer;

    .line 83
    .line 84
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    .line 85
    .line 86
    const/4 v4, 0x4

    .line 87
    invoke-interface {p1, p2, v4, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->B(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x5

    .line 91
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    :goto_4
    move v2, v3

    .line 98
    goto :goto_5

    .line 99
    :cond_6
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    .line 100
    .line 101
    if-eqz v2, :cond_7

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_7
    move v2, v1

    .line 105
    :goto_5
    if-eqz v2, :cond_8

    .line 106
    .line 107
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 108
    .line 109
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_8
    const/4 v0, 0x6

    .line 115
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    :goto_6
    move v2, v3

    .line 122
    goto :goto_7

    .line 123
    :cond_9
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    .line 124
    .line 125
    if-eqz v2, :cond_a

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    move v2, v1

    .line 129
    :goto_7
    if-eqz v2, :cond_b

    .line 130
    .line 131
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 132
    .line 133
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_b
    const/4 v0, 0x7

    .line 139
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_c

    .line 144
    .line 145
    :goto_8
    move v2, v3

    .line 146
    goto :goto_9

    .line 147
    :cond_c
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    .line 148
    .line 149
    if-eqz v2, :cond_d

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_d
    move v2, v1

    .line 153
    :goto_9
    if-eqz v2, :cond_e

    .line 154
    .line 155
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 156
    .line 157
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_e
    const/16 v0, 0x8

    .line 163
    .line 164
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_f

    .line 169
    .line 170
    :goto_a
    move v2, v3

    .line 171
    goto :goto_b

    .line 172
    :cond_f
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    .line 173
    .line 174
    if-eqz v2, :cond_10

    .line 175
    .line 176
    goto :goto_a

    .line 177
    :cond_10
    move v2, v1

    .line 178
    :goto_b
    if-eqz v2, :cond_11

    .line 179
    .line 180
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 181
    .line 182
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    .line 183
    .line 184
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_11
    const/16 v0, 0x9

    .line 188
    .line 189
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_12

    .line 194
    .line 195
    :goto_c
    move v2, v3

    .line 196
    goto :goto_d

    .line 197
    :cond_12
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v2, :cond_13

    .line 200
    .line 201
    goto :goto_c

    .line 202
    :cond_13
    move v2, v1

    .line 203
    :goto_d
    if-eqz v2, :cond_14

    .line 204
    .line 205
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 206
    .line 207
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    .line 208
    .line 209
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_14
    const/16 v0, 0xa

    .line 213
    .line 214
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-eqz v2, :cond_15

    .line 219
    .line 220
    :goto_e
    move v2, v3

    .line 221
    goto :goto_f

    .line 222
    :cond_15
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    .line 223
    .line 224
    if-eqz v2, :cond_16

    .line 225
    .line 226
    goto :goto_e

    .line 227
    :cond_16
    move v2, v1

    .line 228
    :goto_f
    if-eqz v2, :cond_17

    .line 229
    .line 230
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 231
    .line 232
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    .line 233
    .line 234
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :cond_17
    const/16 v0, 0xb

    .line 238
    .line 239
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_18

    .line 244
    .line 245
    :goto_10
    move v2, v3

    .line 246
    goto :goto_11

    .line 247
    :cond_18
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 248
    .line 249
    if-eqz v2, :cond_19

    .line 250
    .line 251
    goto :goto_10

    .line 252
    :cond_19
    move v2, v1

    .line 253
    :goto_11
    if-eqz v2, :cond_1a

    .line 254
    .line 255
    sget-object v2, Lcom/discord/chat/bridge/reaction/ReactionsTheme$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/ReactionsTheme$$serializer;

    .line 256
    .line 257
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 258
    .line 259
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_1a
    const/16 v0, 0xc

    .line 263
    .line 264
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_1b

    .line 269
    .line 270
    :goto_12
    move v2, v3

    .line 271
    goto :goto_13

    .line 272
    :cond_1b
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    .line 273
    .line 274
    if-eqz v2, :cond_1c

    .line 275
    .line 276
    goto :goto_12

    .line 277
    :cond_1c
    move v2, v1

    .line 278
    :goto_13
    if-eqz v2, :cond_1d

    .line 279
    .line 280
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    .line 281
    .line 282
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 283
    .line 284
    .line 285
    :cond_1d
    const/16 v0, 0xd

    .line 286
    .line 287
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_1e

    .line 292
    .line 293
    :goto_14
    move v2, v3

    .line 294
    goto :goto_15

    .line 295
    :cond_1e
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    .line 296
    .line 297
    if-eqz v2, :cond_1f

    .line 298
    .line 299
    goto :goto_14

    .line 300
    :cond_1f
    move v2, v1

    .line 301
    :goto_15
    if-eqz v2, :cond_20

    .line 302
    .line 303
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    .line 304
    .line 305
    invoke-interface {p1, p2, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 306
    .line 307
    .line 308
    :cond_20
    const/16 v0, 0xe

    .line 309
    .line 310
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-eqz v2, :cond_21

    .line 315
    .line 316
    :goto_16
    move v2, v3

    .line 317
    goto :goto_17

    .line 318
    :cond_21
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 319
    .line 320
    if-eqz v2, :cond_22

    .line 321
    .line 322
    goto :goto_16

    .line 323
    :cond_22
    move v2, v1

    .line 324
    :goto_17
    if-eqz v2, :cond_23

    .line 325
    .line 326
    sget-object v2, Lcom/discord/chat/bridge/messageframe/MessageFrameSerializer;->INSTANCE:Lcom/discord/chat/bridge/messageframe/MessageFrameSerializer;

    .line 327
    .line 328
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 329
    .line 330
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_23
    const/16 v0, 0xf

    .line 334
    .line 335
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    if-eqz v2, :cond_24

    .line 340
    .line 341
    :goto_18
    move v2, v3

    .line 342
    goto :goto_19

    .line 343
    :cond_24
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    .line 344
    .line 345
    if-eqz v2, :cond_25

    .line 346
    .line 347
    goto :goto_18

    .line 348
    :cond_25
    move v2, v1

    .line 349
    :goto_19
    if-eqz v2, :cond_26

    .line 350
    .line 351
    sget-object v2, Lzi/m0;->a:Lzi/m0;

    .line 352
    .line 353
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    .line 354
    .line 355
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_26
    const/16 v0, 0x10

    .line 359
    .line 360
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eqz v2, :cond_27

    .line 365
    .line 366
    :goto_1a
    move v2, v3

    .line 367
    goto :goto_1b

    .line 368
    :cond_27
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    .line 369
    .line 370
    if-eqz v2, :cond_28

    .line 371
    .line 372
    goto :goto_1a

    .line 373
    :cond_28
    move v2, v1

    .line 374
    :goto_1b
    if-eqz v2, :cond_29

    .line 375
    .line 376
    sget-object v2, Lcom/discord/chat/bridge/truncation/Truncation$$serializer;->INSTANCE:Lcom/discord/chat/bridge/truncation/Truncation$$serializer;

    .line 377
    .line 378
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    .line 379
    .line 380
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_29
    const/16 v0, 0x11

    .line 384
    .line 385
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 386
    .line 387
    .line 388
    move-result v2

    .line 389
    if-eqz v2, :cond_2a

    .line 390
    .line 391
    :goto_1c
    move v2, v3

    .line 392
    goto :goto_1d

    .line 393
    :cond_2a
    iget-object v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    .line 394
    .line 395
    if-eqz v2, :cond_2b

    .line 396
    .line 397
    goto :goto_1c

    .line 398
    :cond_2b
    move v2, v1

    .line 399
    :goto_1d
    if-eqz v2, :cond_2c

    .line 400
    .line 401
    sget-object v2, Lcom/discord/chat/bridge/BackgroundHighlight$$serializer;->INSTANCE:Lcom/discord/chat/bridge/BackgroundHighlight$$serializer;

    .line 402
    .line 403
    iget-object v4, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    .line 404
    .line 405
    invoke-interface {p1, p2, v0, v2, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    :cond_2c
    const/16 v0, 0x12

    .line 409
    .line 410
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->z(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_2d

    .line 415
    .line 416
    :goto_1e
    move v1, v3

    .line 417
    goto :goto_1f

    .line 418
    :cond_2d
    iget-boolean v2, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    .line 419
    .line 420
    if-eqz v2, :cond_2e

    .line 421
    .line 422
    goto :goto_1e

    .line 423
    :cond_2e
    :goto_1f
    if-eqz v1, :cond_2f

    .line 424
    .line 425
    iget-boolean p0, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    .line 426
    .line 427
    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    .line 428
    .line 429
    .line 430
    :cond_2f
    return-void
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v0

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    return v0
.end method

.method public final component15()Lcom/discord/chat/bridge/messageframe/MessageFrame;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    return-object v0
.end method

.method public final component16()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component17()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public final component18()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    return v0
.end method

.method public final component2()Lcom/discord/chat/bridge/ChangeType;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Lcom/discord/chat/bridge/MessageBase;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)Lcom/discord/chat/bridge/row/MessageRow;
    .locals 21

    move/from16 v1, p1

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

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move/from16 v19, p19

    const-string v0, "changeType"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v20, Lcom/discord/chat/bridge/row/MessageRow;

    move-object/from16 v0, v20

    move/from16 v1, p1

    invoke-direct/range {v0 .. v19}, Lcom/discord/chat/bridge/row/MessageRow;-><init>(ILcom/discord/chat/bridge/ChangeType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/MessageBase;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/reaction/ReactionsTheme;ZZLcom/discord/chat/bridge/messageframe/MessageFrame;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/chat/bridge/BackgroundHighlight;Z)V

    return-object v20
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/row/MessageRow;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/row/MessageRow;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    iget-object v3, p1, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    iget-boolean p1, p1, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    if-eq v1, p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAddNewBurstReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddNewReactionAccessibilityLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAddReactionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getAnimated()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBackgroundHighlight()Lcom/discord/chat/bridge/BackgroundHighlight;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    return-object v0
.end method

.method public final getCanAddNewReactions()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getChangeType()Lcom/discord/chat/bridge/ChangeType;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->changeType:Lcom/discord/chat/bridge/ChangeType;

    return-object v0
.end method

.method public final getEnableSwipeToReply()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    return v0
.end method

.method public final getHighlightJumpedOnceOnly()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->index:I

    return v0
.end method

.method public final getJumped()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getMessage()Lcom/discord/chat/bridge/MessageBase;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    return-object v0
.end method

.method public final getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    return-object v0
.end method

.method public final getReactTag()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    return-object v0
.end method

.method public final getRenderContentOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    return v0
.end method

.method public final getScrollTo()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTruncation()Lcom/discord/chat/bridge/truncation/Truncation;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/discord/chat/bridge/reaction/ReactionsTheme;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_9

    move v1, v3

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_9

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_a

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_b

    :cond_d
    invoke-virtual {v1}, Lcom/discord/chat/bridge/truncation/Truncation;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    if-nez v1, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v1}, Lcom/discord/chat/bridge/BackgroundHighlight;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    if-eqz v1, :cond_f

    goto :goto_d

    :cond_f
    move v3, v1

    :goto_d
    add-int/2addr v0, v3

    return v0
.end method

.method public final isHighlight()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getIndex()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/row/MessageRow;->getChangeType()Lcom/discord/chat/bridge/ChangeType;

    move-result-object v2

    iget-object v3, v0, Lcom/discord/chat/bridge/row/MessageRow;->jumped:Ljava/lang/Boolean;

    iget-object v4, v0, Lcom/discord/chat/bridge/row/MessageRow;->highlightJumpedOnceOnly:Ljava/lang/Boolean;

    iget-object v5, v0, Lcom/discord/chat/bridge/row/MessageRow;->message:Lcom/discord/chat/bridge/MessageBase;

    iget-object v6, v0, Lcom/discord/chat/bridge/row/MessageRow;->scrollTo:Ljava/lang/Boolean;

    iget-object v7, v0, Lcom/discord/chat/bridge/row/MessageRow;->animated:Ljava/lang/Boolean;

    iget-object v8, v0, Lcom/discord/chat/bridge/row/MessageRow;->canAddNewReactions:Ljava/lang/Boolean;

    iget-object v9, v0, Lcom/discord/chat/bridge/row/MessageRow;->addReactionLabel:Ljava/lang/String;

    iget-object v10, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v11, v0, Lcom/discord/chat/bridge/row/MessageRow;->addNewBurstReactionAccessibilityLabel:Ljava/lang/String;

    iget-object v12, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactionsTheme:Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    iget-boolean v13, v0, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight:Z

    iget-boolean v14, v0, Lcom/discord/chat/bridge/row/MessageRow;->renderContentOnly:Z

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->messageFrame:Lcom/discord/chat/bridge/messageframe/MessageFrame;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->reactTag:Ljava/lang/Integer;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->truncation:Lcom/discord/chat/bridge/truncation/Truncation;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->backgroundHighlight:Lcom/discord/chat/bridge/BackgroundHighlight;

    move-object/from16 v19, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/row/MessageRow;->enableSwipeToReply:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v20, v15

    const-string v15, "MessageRow(index="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", changeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", jumped="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", highlightJumpedOnceOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scrollTo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", animated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canAddNewReactions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", addReactionLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addNewReactionAccessibilityLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", addNewBurstReactionAccessibilityLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reactionsTheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isHighlight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", renderContentOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", messageFrame="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reactTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", truncation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundHighlight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enableSwipeToReply="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
