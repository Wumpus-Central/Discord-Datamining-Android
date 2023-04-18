.class final Lnet/time4j/history/i;
.super Lfj/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/time4j/history/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lfj/e<",
        "Lnet/time4j/history/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x4ac118a85d3f9a2eL


# instance fields
.field private final history:Lnet/time4j/history/d;


# direct methods
.method constructor <init>(Lnet/time4j/history/d;)V
    .locals 1

    .line 1
    const-string v0, "HISTORIC_DATE"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lfj/e;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lnet/time4j/history/i;->history:Lnet/time4j/history/d;

    .line 7
    .line 8
    return-void
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

.method private readResolve()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnet/time4j/history/i;->history:Lnet/time4j/history/d;

    invoke-virtual {v0}, Lnet/time4j/history/d;->f()Lfj/p;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public G()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic S()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/history/i;->y()Lnet/time4j/history/h;

    move-result-object v0

    return-object v0
.end method

.method public T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnet/time4j/history/i;->x()Lnet/time4j/history/h;

    move-result-object v0

    return-object v0
.end method

.method protected g(Lfj/x;)Lfj/z;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Lfj/x<",
            "TT;>;)",
            "Lfj/z<",
            "TT;",
            "Lnet/time4j/history/h;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->y:Lnet/time4j/e;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/x;->x(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lnet/time4j/history/i$a;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/time4j/history/i;->history:Lnet/time4j/history/d;

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lnet/time4j/history/i$a;-><init>(Lnet/time4j/history/d;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
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

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lnet/time4j/history/h;",
            ">;"
        }
    .end annotation

    const-class v0, Lnet/time4j/history/h;

    return-object v0
.end method

.method protected r(Lfj/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/e<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/history/i;->history:Lnet/time4j/history/d;

    check-cast p1, Lnet/time4j/history/i;

    iget-object p1, p1, Lnet/time4j/history/i;->history:Lnet/time4j/history/d;

    invoke-virtual {v0, p1}, Lnet/time4j/history/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public x()Lnet/time4j/history/h;
    .locals 4

    sget-object v0, Lnet/time4j/history/j;->l:Lnet/time4j/history/j;

    const/16 v1, 0xc

    const/16 v2, 0x1f

    const/16 v3, 0x270f

    invoke-static {v0, v3, v1, v2}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    move-result-object v0

    return-object v0
.end method

.method public y()Lnet/time4j/history/h;
    .locals 3

    sget-object v0, Lnet/time4j/history/j;->k:Lnet/time4j/history/j;

    const/16 v1, 0x2d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v2}, Lnet/time4j/history/h;->i(Lnet/time4j/history/j;III)Lnet/time4j/history/h;

    move-result-object v0

    return-object v0
.end method
