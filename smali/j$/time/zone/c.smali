.class public final Lj$/time/zone/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final g:[J

.field private static final h:[Lj$/time/zone/b;


# instance fields
.field private final a:[J

.field private final b:[Lj$/time/ZoneOffset;

.field private final c:[J

.field private final d:[Lj$/time/ZoneOffset;

.field private final e:[Lj$/time/zone/b;

.field private final transient f:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [J

    sput-object v1, Lj$/time/zone/c;->g:[J

    new-array v0, v0, [Lj$/time/zone/b;

    sput-object v0, Lj$/time/zone/c;->h:[Lj$/time/zone/b;

    return-void
.end method

.method private constructor <init>(Lj$/time/ZoneOffset;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lj$/time/zone/c;->f:Lj$/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x1

    new-array v0, v0, [Lj$/time/ZoneOffset;

    iput-object v0, p0, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    sget-object p1, Lj$/time/zone/c;->g:[J

    iput-object p1, p0, Lj$/time/zone/c;->a:[J

    iput-object p1, p0, Lj$/time/zone/c;->c:[J

    iput-object v0, p0, Lj$/time/zone/c;->d:[Lj$/time/ZoneOffset;

    sget-object p1, Lj$/time/zone/c;->h:[Lj$/time/zone/b;

    iput-object p1, p0, Lj$/time/zone/c;->e:[Lj$/time/zone/b;

    return-void
.end method

.method public static c(Lj$/time/ZoneOffset;)Lj$/time/zone/c;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lj$/time/zone/c;

    invoke-direct {v0, p0}, Lj$/time/zone/c;-><init>(Lj$/time/ZoneOffset;)V

    return-object v0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "offset"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Lj$/time/Instant;)Lj$/time/ZoneOffset;
    .locals 9

    iget-object v0, p0, Lj$/time/zone/c;->c:[J

    array-length v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object p1, p0, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    aget-object p1, p1, v2

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lj$/time/Instant;->h()J

    move-result-wide v3

    iget-object p1, p0, Lj$/time/zone/c;->e:[Lj$/time/zone/b;

    array-length v1, p1

    iget-object v5, p0, Lj$/time/zone/c;->d:[Lj$/time/ZoneOffset;

    if-lez v1, :cond_6

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget-wide v6, v0, v1

    cmp-long v1, v3, v6

    if-lez v1, :cond_6

    array-length v0, v5

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v5, v0

    .line 0
    invoke-virtual {v0}, Lj$/time/ZoneOffset;->g()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v0, v3

    const-wide/32 v5, 0x15180

    invoke-static {v0, v1, v5, v6}, Lj$/time/a;->d(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Lj$/time/g;->o(J)Lj$/time/g;

    move-result-object v0

    invoke-virtual {v0}, Lj$/time/g;->l()I

    move-result v0

    .line 0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v5, p0, Lj$/time/zone/c;->f:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lj$/time/zone/a;

    const/4 v7, 0x0

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    array-length v6, p1

    new-array v6, v6, [Lj$/time/zone/a;

    array-length v8, p1

    if-gtz v8, :cond_5

    const/16 p1, 0x834

    if-ge v0, p1, :cond_2

    invoke-interface {v5, v1, v6}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 0
    :cond_2
    :goto_0
    array-length p1, v6

    if-ge v2, p1, :cond_4

    aget-object v7, v6, v2

    invoke-virtual {v7}, Lj$/time/zone/a;->c()J

    move-result-wide v0

    cmp-long p1, v3, v0

    if-gez p1, :cond_3

    invoke-virtual {v7}, Lj$/time/zone/a;->b()Lj$/time/ZoneOffset;

    move-result-object p1

    return-object p1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v7}, Lj$/time/zone/a;->a()Lj$/time/ZoneOffset;

    move-result-object p1

    return-object p1

    .line 0
    :cond_5
    aget-object p1, p1, v2

    throw v7

    .line 0
    :cond_6
    invoke-static {v0, v3, v4}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result p1

    if-gez p1, :cond_7

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    :cond_7
    add-int/lit8 p1, p1, 0x1

    aget-object p1, v5, p1

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lj$/time/zone/c;->c:[J

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj$/time/zone/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lj$/time/zone/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lj$/util/n;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/zone/c;->a:[J

    iget-object v3, p1, Lj$/time/zone/c;->a:[J

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    iget-object v3, p1, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/zone/c;->c:[J

    iget-object v3, p1, Lj$/time/zone/c;->c:[J

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/zone/c;->d:[Lj$/time/ZoneOffset;

    iget-object v3, p1, Lj$/time/zone/c;->d:[Lj$/time/ZoneOffset;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj$/time/zone/c;->e:[Lj$/time/zone/b;

    iget-object p1, p1, Lj$/time/zone/c;->e:[Lj$/time/zone/b;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lj$/time/zone/c;->a:[J

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    const/4 v1, 0x0

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/zone/c;->c:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/zone/c;->d:[Lj$/time/ZoneOffset;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lj$/time/zone/c;->e:[Lj$/time/zone/b;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ZoneRules[currentStandardOffset="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lj$/time/zone/c;->b:[Lj$/time/ZoneOffset;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
