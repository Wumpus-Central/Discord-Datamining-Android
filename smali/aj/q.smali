.class public final Laj/q;
.super Laj/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0008H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0014"
    }
    d2 = {
        "Laj/q;",
        "Laj/h;",
        "",
        "v",
        "",
        "h",
        "",
        "i",
        "",
        "d",
        "",
        "k",
        "",
        "c",
        "Z",
        "forceQuoting",
        "Laj/k0;",
        "writer",
        "<init>",
        "(Laj/k0;Z)V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final c:Z


# direct methods
.method public constructor <init>(Laj/k0;Z)V
    .locals 1

    .line 1
    const-string v0, "writer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Laj/h;-><init>(Laj/k0;)V

    .line 7
    .line 8
    .line 9
    iput-boolean p2, p0, Laj/q;->c:Z

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
.method public d(B)V
    .locals 1

    iget-boolean v0, p0, Laj/q;->c:Z

    invoke-static {p1}, Llf/z;->b(B)B

    move-result p1

    invoke-static {p1}, Llf/z;->f(B)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Laj/h;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Laj/h;->j(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public h(I)V
    .locals 1

    iget-boolean v0, p0, Laj/q;->c:Z

    invoke-static {p1}, Llf/b0;->b(I)I

    move-result p1

    if-eqz v0, :cond_0

    invoke-static {p1}, Laj/l;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Laj/h;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Laj/m;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Laj/h;->j(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public i(J)V
    .locals 1

    iget-boolean v0, p0, Laj/q;->c:Z

    invoke-static {p1, p2}, Llf/d0;->b(J)J

    move-result-wide p1

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Laj/j;->a(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Laj/h;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Laj/k;->a(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Laj/h;->j(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public k(S)V
    .locals 1

    iget-boolean v0, p0, Laj/q;->c:Z

    invoke-static {p1}, Llf/g0;->b(S)S

    move-result p1

    invoke-static {p1}, Llf/g0;->f(S)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Laj/h;->m(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Laj/h;->j(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
