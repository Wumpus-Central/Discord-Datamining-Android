.class Lhj/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj/c$d;->Y(Lfj/n;)Lhj/c$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/n<",
        "Lfj/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lfj/n;

.field final synthetic l:Lfj/n;

.field final synthetic m:Lhj/c$d;


# direct methods
.method constructor <init>(Lhj/c$d;Lfj/n;Lfj/n;)V
    .locals 0

    iput-object p1, p0, Lhj/c$d$a;->m:Lhj/c$d;

    iput-object p2, p0, Lhj/c$d$a;->k:Lfj/n;

    iput-object p3, p0, Lhj/c$d$a;->l:Lfj/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfj/o;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhj/c$d$a;->k:Lfj/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfj/n;->test(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lhj/c$d$a;->l:Lfj/n;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lfj/n;->test(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/o;

    invoke-virtual {p0, p1}, Lhj/c$d$a;->a(Lfj/o;)Z

    move-result p1

    return p1
.end method
