.class public final Lvg/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvg/w$a;
    }
.end annotation


# static fields
.field public static final d:Lvg/w$a;

.field private static final e:Lvg/w;


# instance fields
.field private final a:Lvg/g0;

.field private final b:Llf/k;

.field private final c:Lvg/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lvg/w$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvg/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvg/w;->d:Lvg/w$a;

    .line 8
    .line 9
    new-instance v0, Lvg/w;

    .line 10
    .line 11
    sget-object v3, Lvg/g0;->o:Lvg/g0;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x6

    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v2, v0

    .line 18
    invoke-direct/range {v2 .. v7}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lvg/w;->e:Lvg/w;

    .line 22
    .line 23
    return-void
    .line 24
.end method

.method public constructor <init>(Lvg/g0;Llf/k;Lvg/g0;)V
    .locals 1

    const-string v0, "reportLevelBefore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reportLevelAfter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvg/w;->a:Lvg/g0;

    .line 3
    iput-object p2, p0, Lvg/w;->b:Llf/k;

    .line 4
    iput-object p3, p0, Lvg/w;->c:Lvg/g0;

    return-void
.end method

.method public synthetic constructor <init>(Lvg/g0;Llf/k;Lvg/g0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Llf/k;

    const/4 p5, 0x1

    const/4 v0, 0x0

    invoke-direct {p2, p5, v0}, Llf/k;-><init>(II)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, p1

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lvg/w;-><init>(Lvg/g0;Llf/k;Lvg/g0;)V

    return-void
.end method

.method public static final synthetic a()Lvg/w;
    .locals 1

    sget-object v0, Lvg/w;->e:Lvg/w;

    return-object v0
.end method


# virtual methods
.method public final b()Lvg/g0;
    .locals 1

    iget-object v0, p0, Lvg/w;->c:Lvg/g0;

    return-object v0
.end method

.method public final c()Lvg/g0;
    .locals 1

    iget-object v0, p0, Lvg/w;->a:Lvg/g0;

    return-object v0
.end method

.method public final d()Llf/k;
    .locals 1

    iget-object v0, p0, Lvg/w;->b:Llf/k;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvg/w;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvg/w;

    iget-object v1, p0, Lvg/w;->a:Lvg/g0;

    iget-object v3, p1, Lvg/w;->a:Lvg/g0;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvg/w;->b:Llf/k;

    iget-object v3, p1, Lvg/w;->b:Llf/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvg/w;->c:Lvg/g0;

    iget-object p1, p1, Lvg/w;->c:Lvg/g0;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lvg/w;->a:Lvg/g0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvg/w;->b:Llf/k;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Llf/k;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvg/w;->c:Lvg/g0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JavaNullabilityAnnotationsStatus(reportLevelBefore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvg/w;->a:Lvg/g0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sinceVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvg/w;->b:Llf/k;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", reportLevelAfter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvg/w;->c:Lvg/g0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
