.class public final Lbi/h$c$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbi/h$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic k:Lnh/s;

.field final synthetic l:Ljava/io/ByteArrayInputStream;

.field final synthetic m:Lbi/h;


# direct methods
.method public constructor <init>(Lnh/s;Ljava/io/ByteArrayInputStream;Lbi/h;)V
    .locals 0

    iput-object p1, p0, Lbi/h$c$a;->k:Lnh/s;

    iput-object p2, p0, Lbi/h$c$a;->l:Ljava/io/ByteArrayInputStream;

    iput-object p3, p0, Lbi/h$c$a;->m:Lbi/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lnh/q;
    .locals 3

    iget-object v0, p0, Lbi/h$c$a;->k:Lnh/s;

    iget-object v1, p0, Lbi/h$c$a;->l:Ljava/io/ByteArrayInputStream;

    iget-object v2, p0, Lbi/h$c$a;->m:Lbi/h;

    invoke-virtual {v2}, Lbi/h;->p()Lzh/m;

    move-result-object v2

    invoke-virtual {v2}, Lzh/m;->c()Lzh/k;

    move-result-object v2

    invoke-virtual {v2}, Lzh/k;->j()Lnh/g;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lnh/s;->d(Ljava/io/InputStream;Lnh/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnh/q;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/h$c$a;->a()Lnh/q;

    move-result-object v0

    return-object v0
.end method
