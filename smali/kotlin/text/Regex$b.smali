.class final Lkotlin/text/Regex$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/Regex;->d(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/text/MatchResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/text/MatchResult;",
        "a",
        "()Lkotlin/text/MatchResult;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lkotlin/text/Regex;

.field final synthetic l:Ljava/lang/CharSequence;

.field final synthetic m:I


# direct methods
.method constructor <init>(Lkotlin/text/Regex;Ljava/lang/CharSequence;I)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/Regex$b;->k:Lkotlin/text/Regex;

    iput-object p2, p0, Lkotlin/text/Regex$b;->l:Ljava/lang/CharSequence;

    iput p3, p0, Lkotlin/text/Regex$b;->m:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lkotlin/text/MatchResult;
    .locals 3

    iget-object v0, p0, Lkotlin/text/Regex$b;->k:Lkotlin/text/Regex;

    iget-object v1, p0, Lkotlin/text/Regex$b;->l:Ljava/lang/CharSequence;

    iget v2, p0, Lkotlin/text/Regex$b;->m:I

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/text/Regex$b;->a()Lkotlin/text/MatchResult;

    move-result-object v0

    return-object v0
.end method
