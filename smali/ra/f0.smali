.class public abstract Lra/f0;
.super Lra/y;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field private transient l:Lra/b0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lra/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, p0, :cond_3

    .line 3
    .line 4
    if-ne p1, p0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    check-cast p1, Ljava/util/Set;

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-ne v1, v3, :cond_2

    .line 23
    .line 24
    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v0

    .line 32
    :catch_0
    :cond_2
    :goto_0
    move v0, v2

    .line 33
    :cond_3
    :goto_1
    return v0
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public h()Lra/b0;
    .locals 1

    iget-object v0, p0, Lra/f0;->l:Lra/b0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lra/f0;->q()Lra/b0;

    move-result-object v0

    iput-object v0, p0, Lra/f0;->l:Lra/b0;

    :cond_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lra/h;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method

.method q()Lra/b0;
    .locals 1

    invoke-virtual {p0}, Lra/y;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lra/b0;->r([Ljava/lang/Object;)Lra/b0;

    move-result-object v0

    return-object v0
.end method
