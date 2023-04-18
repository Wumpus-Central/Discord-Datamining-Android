.class public Laj/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u00a2\u0006\u0004\u0008&\u0010\'J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016J\u0008\u0010\u0005\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u000cH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR*\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188\u0006@DX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010!\u001a\u0004\u0008\u001d\u0010\"\"\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "Laj/h;",
        "",
        "",
        "b",
        "p",
        "c",
        "o",
        "",
        "v",
        "e",
        "",
        "j",
        "",
        "g",
        "",
        "f",
        "",
        "d",
        "",
        "k",
        "",
        "h",
        "",
        "i",
        "",
        "l",
        "value",
        "m",
        "Laj/k0;",
        "a",
        "Laj/k0;",
        "writer",
        "<set-?>",
        "Z",
        "()Z",
        "n",
        "(Z)V",
        "writingFirst",
        "<init>",
        "(Laj/k0;)V",
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
.field public final a:Laj/k0;

.field private b:Z


# direct methods
.method public constructor <init>(Laj/k0;)V
    .locals 1

    .line 1
    const-string v0, "writer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Laj/h;->a:Laj/k0;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Laj/h;->b:Z

    .line 13
    .line 14
    return-void
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
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Laj/h;->b:Z

    return v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Laj/h;->b:Z

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Laj/h;->b:Z

    return-void
.end method

.method public d(B)V
    .locals 3

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Laj/k0;->writeLong(J)V

    return-void
.end method

.method public final e(C)V
    .locals 1

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    invoke-interface {v0, p1}, Laj/k0;->a(C)V

    return-void
.end method

.method public f(D)V
    .locals 1

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Laj/k0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public g(F)V
    .locals 1

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Laj/k0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public h(I)V
    .locals 3

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Laj/k0;->writeLong(J)V

    return-void
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    invoke-interface {v0, p1, p2}, Laj/k0;->writeLong(J)V

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laj/h;->a:Laj/k0;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Laj/k0;->c(Ljava/lang/String;)V

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

.method public k(S)V
    .locals 3

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Laj/k0;->writeLong(J)V

    return-void
.end method

.method public l(Z)V
    .locals 1

    iget-object v0, p0, Laj/h;->a:Laj/k0;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Laj/k0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Laj/h;->a:Laj/k0;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Laj/k0;->b(Ljava/lang/String;)V

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

.method protected final n(Z)V
    .locals 0

    iput-boolean p1, p0, Laj/h;->b:Z

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method
