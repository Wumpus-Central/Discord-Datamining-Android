.class public final Lcom/discord/chatreplay/logger/ReleaseRowLogger;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chatreplay/logger/RowLogger;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/chatreplay/logger/ReleaseRowLogger;",
        "Lcom/discord/chatreplay/logger/RowLogger;",
        "()V",
        "logRowsClear",
        "",
        "logRowsUpdate",
        "rowsJson",
        "",
        "chat_replay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public logRowsClear()V
    .locals 0

    return-void
.end method

.method public logRowsUpdate(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rowsJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
