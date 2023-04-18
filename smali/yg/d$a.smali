.class final Lyg/d$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg/d;-><init>(Lyg/g;Lch/d;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lch/a;",
        "Lng/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/d;


# direct methods
.method constructor <init>(Lyg/d;)V
    .locals 0

    iput-object p1, p0, Lyg/d$a;->k:Lyg/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lch/a;)Lng/c;
    .locals 3

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwg/c;->a:Lwg/c;

    .line 7
    .line 8
    iget-object v1, p0, Lyg/d$a;->k:Lyg/d;

    .line 9
    .line 10
    invoke-static {v1}, Lyg/d;->f(Lyg/d;)Lyg/g;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lyg/d$a;->k:Lyg/d;

    .line 15
    .line 16
    invoke-static {v2}, Lyg/d;->b(Lyg/d;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0, p1, v1, v2}, Lwg/c;->e(Lch/a;Lyg/g;Z)Lng/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lch/a;

    invoke-virtual {p0, p1}, Lyg/d$a;->a(Lch/a;)Lng/c;

    move-result-object p1

    return-object p1
.end method
