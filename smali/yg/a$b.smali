.class final Lyg/a$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg/a;->h(Lyg/g;Lng/g;)Lyg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lvg/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lyg/g;

.field final synthetic l:Lng/g;


# direct methods
.method constructor <init>(Lyg/g;Lng/g;)V
    .locals 0

    iput-object p1, p0, Lyg/a$b;->k:Lyg/g;

    iput-object p2, p0, Lyg/a$b;->l:Lng/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lvg/y;
    .locals 2

    iget-object v0, p0, Lyg/a$b;->k:Lyg/g;

    iget-object v1, p0, Lyg/a$b;->l:Lng/g;

    invoke-static {v0, v1}, Lyg/a;->g(Lyg/g;Lng/g;)Lvg/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lyg/a$b;->a()Lvg/y;

    move-result-object v0

    return-object v0
.end method
