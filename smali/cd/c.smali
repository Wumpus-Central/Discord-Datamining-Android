.class public final Lcd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcd/b;

.field private b:Lgd/b;


# direct methods
.method public constructor <init>(Lcd/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcd/c;->a:Lcd/b;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "Binarizer must be non-null."

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
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
.method public a()Lgd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcd/c;->b:Lgd/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcd/b;->b()Lgd/b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcd/c;->b:Lgd/b;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcd/c;->b:Lgd/b;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public b(ILgd/a;)Lgd/a;
    .locals 1

    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    invoke-virtual {v0, p1, p2}, Lcd/b;->c(ILgd/a;)Lgd/a;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    invoke-virtual {v0}, Lcd/b;->d()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    invoke-virtual {v0}, Lcd/b;->f()I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    invoke-virtual {v0}, Lcd/b;->e()Lcd/h;

    move-result-object v0

    invoke-virtual {v0}, Lcd/h;->f()Z

    move-result v0

    return v0
.end method

.method public f()Lcd/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lcd/c;->a:Lcd/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcd/b;->e()Lcd/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcd/h;->g()Lcd/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lcd/c;

    .line 12
    .line 13
    iget-object v2, p0, Lcd/c;->a:Lcd/b;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lcd/b;->a(Lcd/h;)Lcd/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v0}, Lcd/c;-><init>(Lcd/b;)V

    .line 20
    .line 21
    .line 22
    return-object v1
    .line 23
    .line 24
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcd/c;->a()Lgd/b;

    move-result-object v0

    invoke-virtual {v0}, Lgd/b;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcd/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method
