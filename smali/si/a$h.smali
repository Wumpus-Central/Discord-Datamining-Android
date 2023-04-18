.class final Lsi/a$h;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsi/a;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "kotlinx.coroutines.channels.AbstractChannel"
    f = "AbstractChannel.kt"
    l = {
        0x279
    }
    m = "receiveCatching-JP2dKIU"
.end annotation


# instance fields
.field synthetic k:Ljava/lang/Object;

.field final synthetic l:Lsi/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsi/a<",
            "TE;>;"
        }
    .end annotation
.end field

.field m:I


# direct methods
.method constructor <init>(Lsi/a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsi/a<",
            "TE;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lsi/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsi/a$h;->l:Lsi/a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsi/a$h;->k:Ljava/lang/Object;

    iget p1, p0, Lsi/a$h;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsi/a$h;->m:I

    iget-object p1, p0, Lsi/a$h;->l:Lsi/a;

    invoke-virtual {p1, p0}, Lsi/a;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lsi/i;->b(Ljava/lang/Object;)Lsi/i;

    move-result-object p1

    return-object p1
.end method
