.class public Lge/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/media/MediaFormat;

.field private b:Landroid/media/MediaFormat;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lge/a;->e:J

    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lge/a;->e:J

    return-wide v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lge/a;->c:Ljava/lang/String;

    return-void
.end method

.method public c(J)V
    .locals 0

    iput-wide p1, p0, Lge/a;->e:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lge/a;->d:Ljava/lang/String;

    return-void
.end method

.method public e(Landroid/media/MediaFormat;)V
    .locals 0

    iput-object p1, p0, Lge/a;->a:Landroid/media/MediaFormat;

    return-void
.end method

.method public f(Landroid/media/MediaFormat;)V
    .locals 0

    iput-object p1, p0, Lge/a;->b:Landroid/media/MediaFormat;

    return-void
.end method
