.class public final Lcf/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/u$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf/q;-><init>()V
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
        "cf/q$a",
        "Lcf/u$b;",
        "Lcf/u;",
        "detector",
        "",
        "c",
        "a",
        "",
        "b",
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
.field final synthetic a:Lcf/q;


# direct methods
.method constructor <init>(Lcf/q;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcf/q$a;->a:Lcf/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lcf/d;->y0(Z)Lcf/d;

    .line 8
    .line 9
    .line 10
    return-void
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
.method public a(Lcf/u;)Z
    .locals 1

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcf/q$a;->a:Lcf/q;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcf/u;->d()F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {v0, p1}, Lcf/q;->N0(Lcf/q;F)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1
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

.method public b(Lcf/u;)V
    .locals 1

    const-string v0, "detector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcf/u;)Z
    .locals 7

    .line 1
    const-string v0, "detector"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcf/q$a;->a:Lcf/q;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcf/q;->R0()D

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget-object v2, p0, Lcf/q$a;->a:Lcf/q;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcf/q;->R0()D

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-virtual {p1}, Lcf/u;->g()F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    float-to-double v5, v5

    .line 23
    mul-double/2addr v3, v5

    .line 24
    invoke-static {v2, v3, v4}, Lcf/q;->M0(Lcf/q;D)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcf/u;->h()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide/16 v4, 0x0

    .line 32
    .line 33
    cmp-long v4, v2, v4

    .line 34
    .line 35
    if-lez v4, :cond_0

    .line 36
    .line 37
    iget-object v4, p0, Lcf/q$a;->a:Lcf/q;

    .line 38
    .line 39
    invoke-virtual {v4}, Lcf/q;->R0()D

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    sub-double/2addr v5, v0

    .line 44
    long-to-double v0, v2

    .line 45
    div-double/2addr v5, v0

    .line 46
    invoke-static {v4, v5, v6}, Lcf/q;->O0(Lcf/q;D)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, p0, Lcf/q$a;->a:Lcf/q;

    .line 50
    .line 51
    invoke-static {v0}, Lcf/q;->L0(Lcf/q;)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p1}, Lcf/u;->d()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    sub-float/2addr v0, p1

    .line 60
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget-object v0, p0, Lcf/q$a;->a:Lcf/q;

    .line 65
    .line 66
    invoke-static {v0}, Lcf/q;->K0(Lcf/q;)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    cmpl-float p1, p1, v0

    .line 71
    .line 72
    if-ltz p1, :cond_1

    .line 73
    .line 74
    iget-object p1, p0, Lcf/q$a;->a:Lcf/q;

    .line 75
    .line 76
    invoke-virtual {p1}, Lcf/d;->O()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const/4 v0, 0x2

    .line 81
    if-ne p1, v0, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Lcf/q$a;->a:Lcf/q;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcf/d;->j()V

    .line 86
    .line 87
    .line 88
    :cond_1
    const/4 p1, 0x1

    .line 89
    return p1
    .line 90
.end method
