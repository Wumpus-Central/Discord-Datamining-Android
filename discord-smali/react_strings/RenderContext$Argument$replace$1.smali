.class final Lcom/discord/react_strings/RenderContext$Argument$replace$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/react_strings/RenderContext$Argument;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function3;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/text/MatchResult;",
        "Ljava/lang/CharSequence;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "match",
        "Lkotlin/text/MatchResult;",
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
.field final synthetic $onMatch:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Boolean;",
            "+",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/react_strings/RenderContext$Argument$replace$1;->$onMatch:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 6

    const-string v0, "match"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/discord/react_strings/RenderContext$Argument;->INSTANCE:Lcom/discord/react_strings/RenderContext$Argument;

    const/4 v1, 0x3

    invoke-static {v0, p1, v1}, Lcom/discord/react_strings/RenderContext$Argument;->access$get(Lcom/discord/react_strings/RenderContext$Argument;Lkotlin/text/MatchResult;I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    invoke-static {v0, p1, v2}, Lcom/discord/react_strings/RenderContext$Argument;->access$contains(Lcom/discord/react_strings/RenderContext$Argument;Lkotlin/text/MatchResult;I)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    invoke-static {v0, p1, v2}, Lcom/discord/react_strings/RenderContext$Argument;->access$contains(Lcom/discord/react_strings/RenderContext$Argument;Lkotlin/text/MatchResult;I)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    .line 4
    :goto_0
    invoke-static {v0, p1, v4}, Lcom/discord/react_strings/RenderContext$Argument;->access$contains(Lcom/discord/react_strings/RenderContext$Argument;Lkotlin/text/MatchResult;I)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x5

    invoke-static {v0, p1, v5}, Lcom/discord/react_strings/RenderContext$Argument;->access$contains(Lcom/discord/react_strings/RenderContext$Argument;Lkotlin/text/MatchResult;I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v3, v4

    :cond_1
    if-eqz v3, :cond_2

    .line 5
    invoke-interface {p1}, Lkotlin/text/MatchResult;->b()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 6
    :goto_1
    iget-object v0, p0, Lcom/discord/react_strings/RenderContext$Argument$replace$1;->$onMatch:Lkotlin/jvm/functions/Function3;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, p1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/text/MatchResult;

    invoke-virtual {p0, p1}, Lcom/discord/react_strings/RenderContext$Argument$replace$1;->invoke(Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
