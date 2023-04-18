.class public final Lcf/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/s$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf/t;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "cf/t$b",
        "Lcf/s$a;",
        "Lcf/s;",
        "detector",
        "",
        "b",
        "a",
        "",
        "c",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic a:Lcf/t;


# direct methods
.method constructor <init>(Lcf/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
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
.method public a(Lcf/s;)Z
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public b(Lcf/s;)Z
    .locals 7

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcf/t$b;->a:Lcf/t;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcf/t;->O0()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lcf/t$b;->a:Lcf/t;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcf/t;->O0()D

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-virtual {p1}, Lcf/s;->d()D

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    add-double/2addr v3, v5

    .line 23
    invoke-static {v2, v3, v4}, Lcf/t;->K0(Lcf/t;D)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcf/s;->e()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long p1, v2, v4

    .line 33
    .line 34
    if-lez p1, :cond_0

    .line 35
    .line 36
    iget-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcf/t;->O0()D

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    sub-double/2addr v4, v0

    .line 43
    long-to-double v0, v2

    .line 44
    div-double/2addr v4, v0

    .line 45
    invoke-static {p1, v4, v5}, Lcf/t;->L0(Lcf/t;D)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 49
    .line 50
    invoke-virtual {p1}, Lcf/t;->O0()D

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    const-wide v2, 0x3fb657184ae74487L    # 0.08726646259971647

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    cmpl-double p1, v0, v2

    .line 64
    .line 65
    if-ltz p1, :cond_1

    .line 66
    .line 67
    iget-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v0, 0x2

    .line 74
    if-ne p1, v0, :cond_1

    .line 75
    .line 76
    iget-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcf/d;->j()V

    .line 79
    .line 80
    .line 81
    :cond_1
    const/4 p1, 0x1

    .line 82
    return p1
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public c(Lcf/s;)V
    .locals 1

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcf/t$b;->a:Lcf/t;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcf/d;->A()V

    .line 9
    .line 10
    .line 11
    return-void
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
