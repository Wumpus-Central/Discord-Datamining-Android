.class public Ld2/a$s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "s0"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Z

.field d:Z

.field e:Z

.field f:Z

.field g:Z

.field h:Z

.field i:Z

.field final synthetic j:Ld2/a;


# direct methods
.method public constructor <init>(Ld2/a;)V
    .locals 0

    iput-object p1, p0, Ld2/a$s0;->j:Ld2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->h:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->h:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->i:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->g:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->a:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->f:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->c:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->d:Z

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->b:Z

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Ld2/a$s0;->e:Z

    return v0
.end method
