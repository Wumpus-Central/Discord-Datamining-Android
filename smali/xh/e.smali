.class public Lxh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxh/g;
.implements Lxh/i;


# instance fields
.field private final a:Lmg/e;

.field private final b:Lxh/e;

.field private final c:Lmg/e;


# direct methods
.method public constructor <init>(Lmg/e;Lxh/e;)V
    .locals 1

    .line 1
    const-string v0, "classDescriptor"

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
    iput-object p1, p0, Lxh/e;->a:Lmg/e;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    move-object p2, p0

    .line 14
    :cond_0
    iput-object p2, p0, Lxh/e;->b:Lxh/e;

    .line 15
    .line 16
    iput-object p1, p0, Lxh/e;->c:Lmg/e;

    .line 17
    .line 18
    return-void
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
.method public c()Ldi/o0;
    .locals 2

    iget-object v0, p0, Lxh/e;->a:Lmg/e;

    invoke-interface {v0}, Lmg/e;->s()Ldi/o0;

    move-result-object v0

    const-string v1, "classDescriptor.defaultType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lxh/e;->a:Lmg/e;

    instance-of v1, p1, Lxh/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lxh/e;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object v2, p1, Lxh/e;->a:Lmg/e;

    :cond_1
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getType()Ldi/g0;
    .locals 1

    invoke-virtual {p0}, Lxh/e;->c()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lxh/e;->a:Lmg/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final q()Lmg/e;
    .locals 1

    iget-object v0, p0, Lxh/e;->a:Lmg/e;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lxh/e;->c()Ldi/o0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
