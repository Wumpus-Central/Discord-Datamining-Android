.class final Lhj/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/d;


# instance fields
.field private final a:Lfj/d;

.field private final b:Lfj/d;


# direct methods
.method constructor <init>(Lfj/d;Lfj/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhj/p;->a:Lfj/d;

    .line 5
    .line 6
    iput-object p2, p0, Lhj/p;->b:Lfj/d;

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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;TA;)TA;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/p;->a:Lfj/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfj/d;->b(Lfj/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Lhj/p;->a:Lfj/d;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lhj/p;->b:Lfj/d;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public b(Lfj/c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/c<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lhj/p;->a:Lfj/d;

    invoke-interface {v0, p1}, Lfj/d;->b(Lfj/c;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lhj/p;->b:Lfj/d;

    invoke-interface {v0, p1}, Lfj/d;->b(Lfj/c;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public c(Lfj/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/c<",
            "TA;>;)TA;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/p;->a:Lfj/d;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lfj/d;->b(Lfj/c;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lhj/p;->a:Lfj/d;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lhj/p;->b:Lfj/d;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
