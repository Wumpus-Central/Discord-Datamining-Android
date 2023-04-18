.class public Ld2/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 12

    const-wide/16 v6, -0x1

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide/from16 v4, p4

    .line 9
    invoke-direct/range {v0 .. v11}, Ld2/x0;-><init>(Ljava/lang/String;JJJJLjava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJJJLjava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld2/x0;->a:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Ld2/x0;->b:J

    .line 4
    iput-wide p4, p0, Ld2/x0;->c:J

    .line 5
    iput-wide p6, p0, Ld2/x0;->d:J

    .line 6
    iput-wide p8, p0, Ld2/x0;->e:J

    .line 7
    iput-object p10, p0, Ld2/x0;->f:Ljava/lang/String;

    .line 8
    iput-object p11, p0, Ld2/x0;->g:Ljava/lang/Boolean;

    return-void
.end method
