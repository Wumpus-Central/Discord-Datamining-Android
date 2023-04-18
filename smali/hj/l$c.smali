.class Lhj/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
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
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lfj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhj/l$c;->k:Lfj/p;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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


# virtual methods
.method a(Lhj/l$c;)Lfj/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/l$c;",
            ")",
            "Lfj/n<",
            "Lfj/o;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhj/l$c$a;

    invoke-direct {v0, p0, p1}, Lhj/l$c$a;-><init>(Lhj/l$c;Lhj/l$c;)V

    return-object v0
.end method

.method public b(Lfj/o;)Z
    .locals 1

    iget-object v0, p0, Lhj/l$c;->k:Lfj/p;

    invoke-interface {p1, v0}, Lfj/o;->m(Lfj/p;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lfj/o;

    invoke-virtual {p0, p1}, Lhj/l$c;->b(Lfj/o;)Z

    move-result p1

    return p1
.end method
