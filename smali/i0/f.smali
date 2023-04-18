.class final Li0/f;
.super Li0/p$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/f$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/io/File;

.field private final b:J


# direct methods
.method private constructor <init>(Ljava/io/File;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Li0/p$b;-><init>()V

    .line 3
    iput-object p1, p0, Li0/f;->a:Ljava/io/File;

    .line 4
    iput-wide p2, p0, Li0/f;->b:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/io/File;JLi0/f$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Li0/f;-><init>(Ljava/io/File;J)V

    return-void
.end method


# virtual methods
.method a()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Li0/f;->a:Ljava/io/File;

    return-object v0
.end method

.method b()J
    .locals 2

    iget-wide v0, p0, Li0/f;->b:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Li0/p$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Li0/p$b;

    .line 11
    .line 12
    iget-object v1, p0, Li0/f;->a:Ljava/io/File;

    .line 13
    .line 14
    invoke-virtual {p1}, Li0/p$b;->a()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1, v3}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-wide v3, p0, Li0/f;->b:J

    .line 25
    .line 26
    invoke-virtual {p1}, Li0/p$b;->b()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    cmp-long p1, v3, v5

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v0, v2

    .line 36
    :goto_0
    return v0

    .line 37
    :cond_2
    return v2
    .line 38
    .line 39
    .line 40
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Li0/f;->a:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const v1, 0xf4243

    .line 8
    .line 9
    .line 10
    xor-int/2addr v0, v1

    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-wide v1, p0, Li0/f;->b:J

    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    ushr-long v3, v1, v3

    .line 17
    .line 18
    xor-long/2addr v1, v3

    .line 19
    long-to-int v1, v1

    .line 20
    xor-int/2addr v0, v1

    .line 21
    return v0
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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FileOutputOptionsInternal{file="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li0/f;->a:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileSizeLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Li0/f;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
