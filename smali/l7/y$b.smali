.class public Ll7/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ll7/y$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Ll7/y$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Ll7/y$b;->a:J

    .line 4
    new-instance p1, Ll7/y$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    .line 5
    sget-object p2, Ll7/z;->c:Ll7/z;

    goto :goto_0

    :cond_0
    new-instance p2, Ll7/z;

    invoke-direct {p2, v0, v1, p3, p4}, Ll7/z;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2}, Ll7/y$a;-><init>(Ll7/z;)V

    iput-object p1, p0, Ll7/y$b;->b:Ll7/y$a;

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(J)Ll7/y$a;
    .locals 0

    iget-object p1, p0, Ll7/y$b;->b:Ll7/y$a;

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Ll7/y$b;->a:J

    return-wide v0
.end method
