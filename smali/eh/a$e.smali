.class final Leh/a$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leh/a;-><init>(Lci/n;Leh/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Leh/r;",
        "Leh/a$a<",
        "+TA;+TC;>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Leh/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leh/a<",
            "TA;TC;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Leh/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leh/a<",
            "TA;TC;>;)V"
        }
    .end annotation

    iput-object p1, p0, Leh/a$e;->k:Leh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Leh/r;)Leh/a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leh/r;",
            ")",
            "Leh/a$a<",
            "TA;TC;>;"
        }
    .end annotation

    .line 1
    const-string v0, "kotlinClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Leh/a$e;->k:Leh/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, Leh/a;->A(Leh/a;Leh/r;)Leh/a$a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leh/r;

    invoke-virtual {p0, p1}, Leh/a$e;->a(Leh/r;)Leh/a$a;

    move-result-object p1

    return-object p1
.end method
