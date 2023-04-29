.class public final Lcom/discord/chat/bridge/attachment/AttachmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "IMAGE_FILE_EXTENSIONS",
        "Ljava/util/regex/Pattern;",
        "kotlin.jvm.PlatformType",
        "VIDEO_FILE_EXTENSIONS",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final IMAGE_FILE_EXTENSIONS:Ljava/util/regex/Pattern;

.field private static final VIDEO_FILE_EXTENSIONS:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\\.(jpeg|jpg|gif|png|bmp|webp)$"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentKt;->IMAGE_FILE_EXTENSIONS:Ljava/util/regex/Pattern;

    .line 9
    .line 10
    const-string v0, "\\.(mov|mp4|webm)$"

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentKt;->VIDEO_FILE_EXTENSIONS:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
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

.method public static final synthetic access$getIMAGE_FILE_EXTENSIONS$p()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentKt;->IMAGE_FILE_EXTENSIONS:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public static final synthetic access$getVIDEO_FILE_EXTENSIONS$p()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentKt;->VIDEO_FILE_EXTENSIONS:Ljava/util/regex/Pattern;

    return-object v0
.end method
