.class public Lj2/e;
.super Lj2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj2/g<",
        "Ln2/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final i:Ln2/d;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt2/a<",
            "Ln2/d;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lj2/g;-><init>(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lt2/a;

    .line 10
    .line 11
    iget-object p1, p1, Lt2/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ln2/d;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ln2/d;->c()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    new-instance p1, Ln2/d;

    .line 23
    .line 24
    new-array v1, v0, [F

    .line 25
    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    invoke-direct {p1, v1, v0}, Ln2/d;-><init>([F[I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lj2/e;->i:Ln2/d;

    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method


# virtual methods
.method bridge synthetic i(Lt2/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj2/e;->p(Lt2/a;F)Ln2/d;

    move-result-object p1

    return-object p1
.end method

.method p(Lt2/a;F)Ln2/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/a<",
            "Ln2/d;",
            ">;F)",
            "Ln2/d;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lj2/e;->i:Ln2/d;

    .line 2
    .line 3
    iget-object v1, p1, Lt2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ln2/d;

    .line 6
    .line 7
    iget-object p1, p1, Lt2/a;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ln2/d;

    .line 10
    .line 11
    invoke-virtual {v0, v1, p1, p2}, Ln2/d;->d(Ln2/d;Ln2/d;F)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lj2/e;->i:Ln2/d;

    .line 15
    .line 16
    return-object p1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
