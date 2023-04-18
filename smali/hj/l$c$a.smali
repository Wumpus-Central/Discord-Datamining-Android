.class Lhj/l$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhj/l$c;->a(Lhj/l$c;)Lfj/n;
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
.field final synthetic k:Lhj/l$c;

.field final synthetic l:Lhj/l$c;


# direct methods
.method constructor <init>(Lhj/l$c;Lhj/l$c;)V
    .locals 0

    iput-object p1, p0, Lhj/l$c$a;->l:Lhj/l$c;

    iput-object p2, p0, Lhj/l$c$a;->k:Lhj/l$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lfj/o;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lhj/l$c$a;->l:Lhj/l$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lhj/l$c;->b(Lfj/o;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lhj/l$c$a;->k:Lhj/l$c;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lhj/l$c;->b(Lfj/o;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    :goto_1
    return p1
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

    invoke-virtual {p0, p1}, Lhj/l$c$a;->a(Lfj/o;)Z

    move-result p1

    return p1
.end method
