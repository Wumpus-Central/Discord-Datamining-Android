.class public final enum Lcom/discord/chat/bridge/attachment/AttachmentType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/bridge/attachment/AttachmentType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/discord/chat/bridge/attachment/AttachmentType;",
        "",
        "indexLabel",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getIndexLabel",
        "()Ljava/lang/String;",
        "Image",
        "Video",
        "File",
        "Audio",
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


# static fields
.field private static final synthetic $VALUES:[Lcom/discord/chat/bridge/attachment/AttachmentType;

.field public static final enum Audio:Lcom/discord/chat/bridge/attachment/AttachmentType;

.field public static final enum File:Lcom/discord/chat/bridge/attachment/AttachmentType;

.field public static final enum Image:Lcom/discord/chat/bridge/attachment/AttachmentType;

.field public static final enum Video:Lcom/discord/chat/bridge/attachment/AttachmentType;


# instance fields
.field private final indexLabel:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/bridge/attachment/AttachmentType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/discord/chat/bridge/attachment/AttachmentType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/bridge/attachment/AttachmentType;->Image:Lcom/discord/chat/bridge/attachment/AttachmentType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/chat/bridge/attachment/AttachmentType;->Video:Lcom/discord/chat/bridge/attachment/AttachmentType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/chat/bridge/attachment/AttachmentType;->File:Lcom/discord/chat/bridge/attachment/AttachmentType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/chat/bridge/attachment/AttachmentType;->Audio:Lcom/discord/chat/bridge/attachment/AttachmentType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "imageAttachmentIndex"

    .line 5
    .line 6
    const-string v3, "Image"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/chat/bridge/attachment/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Image:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 12
    .line 13
    new-instance v0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "videoAttachmentIndex"

    .line 17
    .line 18
    const-string v3, "Video"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/chat/bridge/attachment/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Video:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 24
    .line 25
    new-instance v0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "fileAttachmentIndex"

    .line 29
    .line 30
    const-string v3, "File"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/chat/bridge/attachment/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->File:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 36
    .line 37
    new-instance v0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "audioAttachmentIndex"

    .line 41
    .line 42
    const-string v3, "Audio"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/discord/chat/bridge/attachment/AttachmentType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->Audio:Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 48
    .line 49
    invoke-static {}, Lcom/discord/chat/bridge/attachment/AttachmentType;->$values()[Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->$VALUES:[Lcom/discord/chat/bridge/attachment/AttachmentType;

    .line 54
    .line 55
    return-void
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

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/discord/chat/bridge/attachment/AttachmentType;->indexLabel:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/bridge/attachment/AttachmentType;
    .locals 1

    const-class v0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/bridge/attachment/AttachmentType;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/bridge/attachment/AttachmentType;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/attachment/AttachmentType;->$VALUES:[Lcom/discord/chat/bridge/attachment/AttachmentType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/bridge/attachment/AttachmentType;

    return-object v0
.end method


# virtual methods
.method public final getIndexLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/bridge/attachment/AttachmentType;->indexLabel:Ljava/lang/String;

    return-object v0
.end method