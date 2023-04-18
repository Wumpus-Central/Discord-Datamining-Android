.class final Lnet/time4j/tz/model/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/time4j/tz/m;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1313f71e899de93dL


# instance fields
.field private final offset:Lnet/time4j/tz/p;


# direct methods
.method constructor <init>(Lnet/time4j/tz/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

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
.method public a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Lnet/time4j/tz/p;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    return-object v0
.end method

.method public c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "Lnet/time4j/base/g;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lnet/time4j/tz/model/e;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lnet/time4j/tz/model/e;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    .line 12
    .line 13
    iget-object p1, p1, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lnet/time4j/tz/p;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    invoke-virtual {v0}, Lnet/time4j/tz/p;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EmptyTransitionModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/time4j/tz/model/e;->offset:Lnet/time4j/tz/p;

    invoke-virtual {v1}, Lnet/time4j/tz/p;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
