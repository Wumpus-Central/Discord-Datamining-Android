.class final Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chatreplay/logger/DebugRowLogger;->writeJson()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "line",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $existingLine:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic $writer:Ljava/io/OutputStreamWriter;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/io/OutputStreamWriter;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$existingLine:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$writer:Ljava/io/OutputStreamWriter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    const-string v0, "line"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$existingLine:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$writer:Ljava/io/OutputStreamWriter;

    const-string v1, ",\n"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$writer:Ljava/io/OutputStreamWriter;

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/discord/chatreplay/logger/DebugRowLogger$writeJson$1$1;->$existingLine:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    return-void
.end method
