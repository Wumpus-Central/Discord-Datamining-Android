.class public final Lcom/discord/chat/bridge/attachment/Attachment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/bridge/spoiler/SpoilerableData;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/attachment/Attachment$$serializer;,
        Lcom/discord/chat/bridge/attachment/Attachment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u00086\n\u0002\u0010\u0000\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 j2\u00020\u0001:\u0002ijB\u00f3\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u000c\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0002\u0010 B\u00c9\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000c\u00a2\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u000cH\u00c6\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010%J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J\t\u0010I\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003\u00a2\u0006\u0002\u0010.J\t\u0010O\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00da\u0001\u0010R\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u000c2\u0008\u0010U\u001a\u0004\u0018\u00010VH\u00d6\u0003J\u0017\u0010W\u001a\u0004\u0018\u00010\u00032\u0006\u0010X\u001a\u00020\u0005H\u0002\u00a2\u0006\u0002\u0010YJ\u0008\u0010Z\u001a\u00020\u000cH\u0002J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001J\u0008\u0010\\\u001a\u00020\u000cH\u0002J\u0008\u0010]\u001a\u00020\u000cH\u0002J\u0008\u0010^\u001a\u00020\u000cH\u0002J\t\u0010_\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010`\u001a\u00020aJ!\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00002\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hH\u00c7\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\n\n\u0002\u0010&\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0011\u0010(\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010#R\u0011\u0010\u0018\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010,R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\u0008-\u0010.R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010/R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010#R\u0011\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010,R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010#R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\n\n\u0002\u0010/\u0012\u0004\u00083\u00104R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004\u00a2\u0006\n\n\u0002\u0010/\u0012\u0004\u00085\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010#R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010#R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0011\u0010>\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010*\u00a8\u0006k"
    }
    d2 = {
        "Lcom/discord/chat/bridge/attachment/Attachment;",
        "Lcom/discord/chat/bridge/spoiler/SpoilerableData;",
        "seen1",
        "",
        "url",
        "",
        "videoUrl",
        "filename",
        "size",
        "sourceWidth",
        "sourceHeight",
        "isSpoiler",
        "",
        "spoiler",
        "description",
        "hint",
        "role",
        "showDescription",
        "progress",
        "uploaderId",
        "uploaderItemId",
        "durationSecs",
        "",
        "waveform",
        "isAnimated",
        "waveformByteArray",
        "",
        "spoilerOrNull",
        "proxyWidth",
        "proxyHeight",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getDurationSecs",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getFilename",
        "height",
        "getHeight",
        "()I",
        "getHint",
        "()Z",
        "getProgress",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRole",
        "getShowDescription",
        "getSize",
        "getSourceHeight$annotations",
        "()V",
        "getSourceWidth$annotations",
        "getSpoiler",
        "getSpoilerOrNull",
        "getUploaderId",
        "getUploaderItemId",
        "getUrl",
        "getVideoUrl",
        "getWaveformByteArray",
        "()[B",
        "width",
        "getWidth",
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
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;",
        "equals",
        "other",
        "",
        "getProxyUrlQueryParam",
        "paramName",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "hasDimensions",
        "hashCode",
        "isImage",
        "isVideo",
        "shouldShowImages",
        "toString",
        "type",
        "Lcom/discord/chat/bridge/attachment/AttachmentType;",
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
.field public static final Companion:Lcom/discord/chat/bridge/attachment/Attachment$Companion;


# instance fields
.field private final description:Ljava/lang/String;

.field private final durationSecs:Ljava/lang/Float;

.field private final filename:Ljava/lang/String;

.field private final hint:Ljava/lang/String;

.field private final isAnimated:Z

.field private final isSpoiler:Z

.field private final progress:Ljava/lang/Integer;

.field private final proxyHeight:Ljava/lang/Integer;

.field private final proxyWidth:Ljava/lang/Integer;

.field private final role:Ljava/lang/String;

.field private final showDescription:Z

.field private final size:Ljava/lang/String;

.field private final sourceHeight:Ljava/lang/Integer;

.field private final sourceWidth:Ljava/lang/Integer;

.field private final spoiler:Ljava/lang/String;

.field private final spoilerOrNull:Ljava/lang/String;

.field private final uploaderId:Ljava/lang/String;

.field private final uploaderItemId:Ljava/lang/String;

.field private final url:Ljava/lang/String;

.field private final videoUrl:Ljava/lang/String;

.field private final waveform:Ljava/lang/String;

.field private final waveformByteArray:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/attachment/Attachment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/attachment/Attachment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/attachment/Attachment;->Companion:Lcom/discord/chat/bridge/attachment/Attachment$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 7

    move-object v0, p0

    move v1, p1

    and-int/lit8 v2, v1, 0x4d

    const/16 v3, 0x4d

    if-eq v3, v2, :cond_0

    .line 1
    sget-object v2, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->INSTANCE:Lcom/discord/chat/bridge/attachment/Attachment$$serializer;

    invoke-virtual {v2}, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v2

    invoke-static {p1, v3, v2}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v2, p2

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    and-int/lit8 v2, v1, 0x2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v2, p3

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    :goto_0
    move-object v2, p4

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    move-object v2, p5

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    and-int/lit8 v2, v1, 0x10

    if-nez v2, :cond_2

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    move-object v2, p6

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    :goto_1
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_3

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    move-object v2, p7

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    :goto_2
    move v2, p8

    iput-boolean v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_4

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v2, p9

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    :goto_3
    and-int/lit16 v2, v1, 0x100

    if-nez v2, :cond_5

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v2, p10

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    :goto_4
    and-int/lit16 v2, v1, 0x200

    if-nez v2, :cond_6

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v2, p11

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    :goto_5
    and-int/lit16 v2, v1, 0x400

    if-nez v2, :cond_7

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v2, p12

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    :goto_6
    and-int/lit16 v2, v1, 0x800

    const/4 v4, 0x0

    if-nez v2, :cond_8

    iput-boolean v4, v0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    goto :goto_7

    :cond_8
    move/from16 v2, p13

    iput-boolean v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    :goto_7
    and-int/lit16 v2, v1, 0x1000

    if-nez v2, :cond_9

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    goto :goto_8

    :cond_9
    move-object/from16 v2, p14

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    :goto_8
    and-int/lit16 v2, v1, 0x2000

    if-nez v2, :cond_a

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v2, p15

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    :goto_9
    and-int/lit16 v2, v1, 0x4000

    if-nez v2, :cond_b

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v2, p16

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    :goto_a
    const v2, 0x8000

    and-int/2addr v2, v1

    if-nez v2, :cond_c

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    goto :goto_b

    :cond_c
    move-object/from16 v2, p17

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    :goto_b
    const/high16 v2, 0x10000

    and-int/2addr v2, v1

    if-nez v2, :cond_d

    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 v2, p18

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    :goto_c
    const/high16 v2, 0x20000

    and-int/2addr v2, v1

    const/4 v5, 0x1

    if-nez v2, :cond_e

    iput-boolean v5, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    goto :goto_d

    :cond_e
    move/from16 v2, p19

    iput-boolean v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    :goto_d
    const/high16 v2, 0x40000

    and-int/2addr v2, v1

    if-nez v2, :cond_10

    .line 2
    :try_start_0
    iget-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    if-eqz v2, :cond_f

    invoke-static {v2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_e

    :catch_0
    :cond_f
    move-object v2, v3

    .line 3
    :goto_e
    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    goto :goto_f

    :cond_10
    move-object/from16 v2, p20

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    :goto_f
    const/high16 v2, 0x80000

    and-int/2addr v2, v1

    if-nez v2, :cond_14

    .line 4
    iget-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    if-eqz v2, :cond_11

    invoke-static {v2}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_12

    :cond_11
    move v4, v5

    :cond_12
    xor-int/2addr v4, v5

    if-eqz v4, :cond_13

    move-object v3, v2

    .line 5
    :cond_13
    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoilerOrNull:Ljava/lang/String;

    goto :goto_10

    :cond_14
    move-object/from16 v2, p21

    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoilerOrNull:Ljava/lang/String;

    :goto_10
    const/high16 v2, 0x100000

    and-int/2addr v2, v1

    if-nez v2, :cond_15

    const-string v2, "width"

    .line 6
    invoke-direct {p0, v2}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_11

    :cond_15
    move-object/from16 v2, p22

    .line 7
    :goto_11
    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyWidth:Ljava/lang/Integer;

    const/high16 v2, 0x200000

    and-int/2addr v1, v2

    if-nez v1, :cond_16

    const-string v1, "height"

    .line 8
    invoke-direct {p0, v1}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_12

    :cond_16
    move-object/from16 v1, p23

    .line 9
    :goto_12
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyHeight:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object/from16 v4, p17

    const-string v5, "url"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "filename"

    invoke-static {p3, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "size"

    invoke-static {p4, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    move-object v1, p2

    .line 12
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    .line 13
    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    .line 14
    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    move-object v1, p5

    .line 15
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    move-object v1, p6

    .line 16
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    move v1, p7

    .line 17
    iput-boolean v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    move-object v1, p8

    .line 18
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    move-object v1, p9

    .line 19
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    move-object/from16 v1, p10

    .line 20
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    move-object/from16 v1, p11

    .line 21
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    move/from16 v1, p12

    .line 22
    iput-boolean v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    move-object/from16 v1, p13

    .line 23
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    move-object/from16 v1, p14

    .line 24
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 25
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    move-object/from16 v1, p16

    .line 26
    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    .line 27
    iput-object v4, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    move/from16 v1, p18

    .line 28
    iput-boolean v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v4, :cond_0

    .line 29
    :try_start_0
    invoke-static {v4, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v3, v2

    .line 30
    :goto_0
    iput-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    .line 31
    iget-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    invoke-static {v3}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_1
    move v1, v4

    :cond_2
    xor-int/2addr v1, v4

    if-eqz v1, :cond_3

    move-object v2, v3

    :cond_3
    iput-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoilerOrNull:Ljava/lang/String;

    const-string v1, "width"

    .line 32
    invoke-direct {p0, v1}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyWidth:Ljava/lang/Integer;

    const-string v1, "height"

    .line 33
    invoke-direct {p0, v1}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyHeight:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    move v15, v1

    goto :goto_7

    :cond_7
    move/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    move-object/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    move-object/from16 v18, v2

    goto :goto_a

    :cond_a
    move-object/from16 v18, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v19, v2

    goto :goto_b

    :cond_b
    move-object/from16 v19, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    const/4 v0, 0x1

    move/from16 v21, v0

    goto :goto_d

    :cond_d
    move/from16 v21, p18

    :goto_d
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v10, p7

    .line 34
    invoke-direct/range {v3 .. v21}, Lcom/discord/chat/bridge/attachment/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V

    return-void
.end method

.method private final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    return-object v0
.end method

.method private final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    return-object v0
.end method

.method private final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/attachment/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ZILjava/lang/Object;)Lcom/discord/chat/bridge/attachment/Attachment;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v1, v1, v16

    if-eqz v1, :cond_11

    iget-boolean v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p17, v15

    move/from16 p18, v1

    invoke-virtual/range {p0 .. p18}, Lcom/discord/chat/bridge/attachment/Attachment;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;

    move-result-object v0

    return-object v0
.end method

.method private final getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Llf/s;->l:Llf/s$a;

    .line 3
    .line 4
    new-instance v1, Landroid/net/UrlQuerySanitizer;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Landroid/net/UrlQuerySanitizer;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroid/net/UrlQuerySanitizer;->getValue(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string v1, "getValue(paramName)"

    .line 18
    .line 19
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lpi/l;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v0

    .line 28
    :goto_0
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    sget-object v1, Llf/s;->l:Llf/s$a;

    .line 35
    .line 36
    invoke-static {p1}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    invoke-static {p1}, Llf/s;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    move-object v0, p1

    .line 52
    :goto_2
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    return-object v0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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

.method private static synthetic getSourceHeight$annotations()V
    .locals 0

    return-void
.end method

.method private static synthetic getSourceWidth$annotations()V
    .locals 0

    return-void
.end method

.method private final hasDimensions()Z
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final isImage()Z
    .locals 2

    invoke-static {}, Lcom/discord/chat/bridge/attachment/AttachmentKt;->access$getIMAGE_FILE_EXTENSIONS$p()Ljava/util/regex/Pattern;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    return v0
.end method

.method private final isVideo()Z
    .locals 2

    invoke-static {}, Lcom/discord/chat/bridge/attachment/AttachmentKt;->access$getVIDEO_FILE_EXTENSIONS$p()Ljava/util/regex/Pattern;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    return v0
.end method

.method private final shouldShowImages()Z
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-lez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/attachment/Attachment;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 7

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, Lzi/a2;->a:Lzi/a2;

    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2
    const/4 v2, 0x2

    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v0

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v0

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_8
    const/4 v2, 0x6

    iget-boolean v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v0

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_b
    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v0

    goto :goto_9

    :cond_c
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v1

    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_e
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v0

    goto :goto_b

    :cond_f
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v1

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_11
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v0

    goto :goto_d

    :cond_12
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v1

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_14
    const/16 v2, 0xb

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v3, v0

    goto :goto_f

    :cond_15
    iget-boolean v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    move v3, v1

    :goto_f
    if-eqz v3, :cond_17

    iget-boolean v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_17
    const/16 v2, 0xc

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_18

    :goto_10
    move v3, v0

    goto :goto_11

    :cond_18
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    move v3, v1

    :goto_11
    if-eqz v3, :cond_1a

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1a
    const/16 v2, 0xd

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1b

    :goto_12
    move v3, v0

    goto :goto_13

    :cond_1b
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    if-eqz v3, :cond_1c

    goto :goto_12

    :cond_1c
    move v3, v1

    :goto_13
    if-eqz v3, :cond_1d

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_1d
    const/16 v2, 0xe

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_1e

    :goto_14
    move v3, v0

    goto :goto_15

    :cond_1e
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    if-eqz v3, :cond_1f

    goto :goto_14

    :cond_1f
    move v3, v1

    :goto_15
    if-eqz v3, :cond_20

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_20
    const/16 v2, 0xf

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_21

    :goto_16
    move v3, v0

    goto :goto_17

    :cond_21
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    if-eqz v3, :cond_22

    goto :goto_16

    :cond_22
    move v3, v1

    :goto_17
    if-eqz v3, :cond_23

    sget-object v3, Lzi/e0;->a:Lzi/e0;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_23
    const/16 v2, 0x10

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_24

    :goto_18
    move v3, v0

    goto :goto_19

    :cond_24
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    if-eqz v3, :cond_25

    goto :goto_18

    :cond_25
    move v3, v1

    :goto_19
    if-eqz v3, :cond_26

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_26
    const/16 v2, 0x11

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_27

    :goto_1a
    move v3, v0

    goto :goto_1b

    :cond_27
    iget-boolean v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    if-eq v3, v0, :cond_28

    goto :goto_1a

    :cond_28
    move v3, v1

    :goto_1b
    if-eqz v3, :cond_29

    iget-boolean v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->r(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_29
    const/16 v2, 0x12

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2a

    :goto_1c
    move v3, v0

    goto :goto_1e

    :cond_2a
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    :try_start_0
    iget-object v5, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    if-eqz v5, :cond_2b

    .line 2
    invoke-static {v5, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1d

    :catch_0
    :cond_2b
    move-object v5, v4

    .line 3
    :goto_1d
    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    goto :goto_1c

    :cond_2c
    move v3, v1

    :goto_1e
    if-eqz v3, :cond_2d

    .line 4
    sget-object v3, Lkotlinx/serialization/internal/b;->c:Lkotlinx/serialization/internal/b;

    iget-object v5, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    invoke-interface {p1, p2, v2, v3, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_2d
    const/16 v2, 0x13

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2e

    :goto_1f
    move v3, v0

    goto :goto_22

    :cond_2e
    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getSpoilerOrNull()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    if-eqz v5, :cond_30

    .line 5
    invoke-static {v5}, Lpi/l;->w(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2f

    goto :goto_20

    :cond_2f
    move v6, v1

    goto :goto_21

    :cond_30
    :goto_20
    move v6, v0

    :goto_21
    xor-int/2addr v6, v0

    if-eqz v6, :cond_31

    move-object v4, v5

    :cond_31
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_32

    goto :goto_1f

    :cond_32
    move v3, v1

    :goto_22
    if-eqz v3, :cond_33

    .line 6
    sget-object v3, Lzi/a2;->a:Lzi/a2;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->getSpoilerOrNull()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_33
    const/16 v2, 0x14

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_34

    :goto_23
    move v3, v0

    goto :goto_24

    :cond_34
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyWidth:Ljava/lang/Integer;

    const-string v4, "width"

    .line 7
    invoke-direct {p0, v4}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    goto :goto_23

    :cond_35
    move v3, v1

    :goto_24
    if-eqz v3, :cond_36

    .line 8
    sget-object v3, Lzi/m0;->a:Lzi/m0;

    iget-object v4, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyWidth:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_36
    const/16 v2, 0x15

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_37

    :goto_25
    move v1, v0

    goto :goto_26

    :cond_37
    iget-object v3, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyHeight:Ljava/lang/Integer;

    const-string v4, "height"

    .line 9
    invoke-direct {p0, v4}, Lcom/discord/chat/bridge/attachment/Attachment;->getProxyUrlQueryParam(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_38

    goto :goto_25

    :cond_38
    :goto_26
    if-eqz v1, :cond_39

    .line 10
    sget-object v0, Lzi/m0;->a:Lzi/m0;

    iget-object p0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyHeight:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    :cond_39
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    return v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    return-object v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)Lcom/discord/chat/bridge/attachment/Attachment;
    .locals 21

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move/from16 v18, p18

    const-string v0, "url"

    move-object/from16 v19, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v20, Lcom/discord/chat/bridge/attachment/Attachment;

    move-object/from16 v0, v20

    move-object/from16 v1, v19

    invoke-direct/range {v0 .. v18}, Lcom/discord/chat/bridge/attachment/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Z)V

    return-object v20
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/attachment/Attachment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/attachment/Attachment;

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    iget-boolean v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    iget-object v3, p1, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    iget-boolean p1, p1, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    if-eq v1, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDurationSecs()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    return-object v0
.end method

.method public final getFilename()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyHeight:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final getHint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgress()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getShowDescription()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    return v0
.end method

.method public final getSize()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    return-object v0
.end method

.method public final getSpoiler()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    return-object v0
.end method

.method public getSpoilerOrNull()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoilerOrNull:Ljava/lang/String;

    return-object v0
.end method

.method public final getUploaderId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUploaderItemId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getVideoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getWaveformByteArray()[B
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveformByteArray:[B

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->proxyWidth:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    move v1, v3

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    if-eqz v1, :cond_8

    move v1, v3

    :cond_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_8

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_9

    :cond_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_a

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    if-nez v1, :cond_d

    goto :goto_b

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    if-eqz v1, :cond_e

    goto :goto_c

    :cond_e
    move v3, v1

    :goto_c
    add-int/2addr v0, v3

    return v0
.end method

.method public final isAnimated()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    return v0
.end method

.method public final isSpoiler()Z
    .locals 1

    iget-boolean v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/discord/chat/bridge/attachment/Attachment;->url:Ljava/lang/String;

    iget-object v2, v0, Lcom/discord/chat/bridge/attachment/Attachment;->videoUrl:Ljava/lang/String;

    iget-object v3, v0, Lcom/discord/chat/bridge/attachment/Attachment;->filename:Ljava/lang/String;

    iget-object v4, v0, Lcom/discord/chat/bridge/attachment/Attachment;->size:Ljava/lang/String;

    iget-object v5, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceWidth:Ljava/lang/Integer;

    iget-object v6, v0, Lcom/discord/chat/bridge/attachment/Attachment;->sourceHeight:Ljava/lang/Integer;

    iget-boolean v7, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler:Z

    iget-object v8, v0, Lcom/discord/chat/bridge/attachment/Attachment;->spoiler:Ljava/lang/String;

    iget-object v9, v0, Lcom/discord/chat/bridge/attachment/Attachment;->description:Ljava/lang/String;

    iget-object v10, v0, Lcom/discord/chat/bridge/attachment/Attachment;->hint:Ljava/lang/String;

    iget-object v11, v0, Lcom/discord/chat/bridge/attachment/Attachment;->role:Ljava/lang/String;

    iget-boolean v12, v0, Lcom/discord/chat/bridge/attachment/Attachment;->showDescription:Z

    iget-object v13, v0, Lcom/discord/chat/bridge/attachment/Attachment;->progress:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderId:Ljava/lang/String;

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->uploaderItemId:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-boolean v15, v0, Lcom/discord/chat/bridge/attachment/Attachment;->isAnimated:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v19, v15

    const-string v15, "Attachment(url="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", videoUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", filename="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSpoiler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", spoiler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uploaderId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", uploaderItemId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", durationSecs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", waveform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isAnimated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final type()Lcom/discord/chat/bridge/attachment/AttachmentType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->durationSecs:Ljava/lang/Float;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/Attachment;->waveform:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Audio:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->shouldShowImages()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->File:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-direct {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->isImage()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->hasDimensions()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Image:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-direct {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->isVideo()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/discord/chat/bridge/attachment/Attachment;->hasDimensions()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Video:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->File:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 52
    .line 53
    :goto_0
    return-object v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method
