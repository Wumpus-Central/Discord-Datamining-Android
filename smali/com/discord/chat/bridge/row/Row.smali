.class public abstract Lcom/discord/chat/bridge/row/Row;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/row/Row$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u0082\u0001\u0007\u000c\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/discord/chat/bridge/row/Row;",
        "",
        "()V",
        "changeType",
        "Lcom/discord/chat/bridge/ChangeType;",
        "getChangeType",
        "()Lcom/discord/chat/bridge/ChangeType;",
        "index",
        "",
        "getIndex",
        "()I",
        "Companion",
        "Lcom/discord/chat/bridge/row/BlockedGroupRow;",
        "Lcom/discord/chat/bridge/row/DeleteRow;",
        "Lcom/discord/chat/bridge/row/EmbeddedActivityRow;",
        "Lcom/discord/chat/bridge/row/LoadingRow;",
        "Lcom/discord/chat/bridge/row/MessageRow;",
        "Lcom/discord/chat/bridge/row/SeparatorRow;",
        "Lcom/discord/chat/bridge/row/UploadProgressRow;",
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
    with = Lcom/discord/chat/bridge/row/RowSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/row/Row$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/row/Row$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/row/Row$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/row/Row;->Companion:Lcom/discord/chat/bridge/row/Row$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/chat/bridge/row/Row;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getChangeType()Lcom/discord/chat/bridge/ChangeType;
.end method

.method public abstract getIndex()I
.end method
